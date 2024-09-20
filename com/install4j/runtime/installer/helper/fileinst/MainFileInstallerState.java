/*     */ package com.install4j.runtime.installer.helper.fileinst;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import com.install4j.runtime.installer.helper.content.ContentInstaller;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ class MainFileInstallerState
/*     */   extends FileInstallerState {
/*     */   private transient File logDir;
/*  20 */   private transient FileLogger newFileLogger = new FileLogger();
/*  21 */   private transient FileLogger oldFileLogger = new FileLogger();
/*  22 */   private transient FileLogger rollbackFileLogger = new FileLogger();
/*     */   
/*  24 */   private transient List<File> cleanupFiles = new ArrayList<>();
/*     */   
/*     */   private transient boolean hasUnrollbackedFiles = false;
/*     */   
/*     */   private transient boolean currentRebootRequired = false;
/*     */   private transient boolean fileRollbackPerformed = false;
/*     */   
/*     */   public void addCreatedDir(InstallFile installFile) {
/*  32 */     this.newFileLogger.addCreatedDir(installFile, this.currentId);
/*  33 */     this.rollbackFileLogger.addCreatedDir(installFile, this.currentId);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addReplacedFile(BackupPair backupPair) {
/*  38 */     this.newFileLogger.addReplacedFile(backupPair, this.currentId);
/*  39 */     this.rollbackFileLogger.addReplacedFile(backupPair, this.currentId);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRollbackBarrier() {
/*  44 */     if (!this.hasUnrollbackedFiles) {
/*  45 */       this.hasUnrollbackedFiles = this.rollbackFileLogger.hasFiles();
/*     */     }
/*  47 */     this.rollbackFileLogger = new FileLogger();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setLogDir(File logDir) {
/*  52 */     if (this.logDir == null) {
/*  53 */       this.logDir = logDir;
/*     */       try {
/*  55 */         this.oldFileLogger.read(new File(logDir, "files.log"));
/*  56 */       } catch (Exception exception) {}
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void writeLog() throws IOException, UserCanceledException {
/*  62 */     if (this.newFileLogger.hasFiles()) {
/*  63 */       final File logFile = new File(this.logDir, "files.log");
/*  64 */       final File tempFile = File.createTempFile("i4jf", ".log");
/*     */       
/*  66 */       this.newFileLogger.write(tempFile, this.oldFileLogger);
/*     */       
/*  68 */       final String accessMode = System.getProperty("install4j.runtimeAccessMode");
/*  69 */       HelperCommunication.getInstance().executeActionChecked(ContentInstaller.getExecutionContext(), (CommunicationAction)new RunAction()
/*     */           {
/*     */             protected void run(Context context) throws IOException {
/*     */               try {
/*  73 */                 FileUtil.copyFile(tempFile, logFile);
/*  74 */                 if (accessMode != null && !Util.isWindows()) {
/*  75 */                   UnixFileSystem.setMode(accessMode, logFile);
/*     */                 }
/*  77 */               } catch (IOException iOException) {}
/*     */               
/*  79 */               if (!tempFile.delete()) {
/*  80 */                 tempFile.deleteOnExit();
/*     */               }
/*     */             }
/*     */           });
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean wasPreviouslyCreated(File destFile) {
/*  89 */     return this.oldFileLogger.containsCreatedFile(destFile);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasRollbackFiles() {
/*  94 */     return this.rollbackFileLogger.hasFiles();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasUnrollbackedFiles() {
/*  99 */     return this.hasUnrollbackedFiles;
/*     */   }
/*     */ 
/*     */   
/*     */   public void addCreatedFile(InstallFile destFile, boolean registerRollback) {
/* 104 */     this.newFileLogger.addCreatedFile(destFile, this.currentId, false);
/* 105 */     if (registerRollback) {
/* 106 */       this.rollbackFileLogger.addCreatedFile(destFile, this.currentId, false);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public FileLogger getRollbackFileLogger() {
/* 112 */     return this.rollbackFileLogger;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<BackupPair> getReplacedFiles() {
/* 117 */     return this.newFileLogger.getReplacedFiles(-1);
/*     */   }
/*     */ 
/*     */   
/*     */   public List<File> getCleanupFiles() {
/* 122 */     return this.cleanupFiles;
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerCleanupFile(File file) {
/* 127 */     this.cleanupFiles.add(file);
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerPreUninstallCommand(File file, boolean adminRights, String executable, String[] arguments) {
/* 132 */     file = file.getAbsoluteFile();
/* 133 */     InstallFile.Command command = new InstallFile.Command(adminRights, executable, arguments);
/* 134 */     this.newFileLogger.registerPreUninstallCommand(file, command);
/* 135 */     this.rollbackFileLogger.registerPreUninstallCommand(file, command);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isCurrentRebootRequired() {
/* 140 */     return this.currentRebootRequired;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCurrentRebootRequired(boolean val) {
/* 145 */     if (Util.isWindows()) {
/* 146 */       this.currentRebootRequired = val;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFileRollbackPerformed(boolean fileRollbackPerformed) {
/* 152 */     this.fileRollbackPerformed = fileRollbackPerformed;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFileRollbackPerformed() {
/* 157 */     return this.fileRollbackPerformed;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\fileinst\MainFileInstallerState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */