/*     */ package com.install4j.runtime.installer.helper.fileinst;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class HelperFileInstallerState extends FileInstallerState {
/*     */   public void setRollbackBarrier() {
/*  18 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/*  21 */             FileInstallerState.getInstance().setRollbackBarrier();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void setLogDir(final File logDir) {
/*  28 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/*  31 */             FileInstallerState.getInstance().setLogDir(logDir);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void writeLog() throws IOException, UserCanceledException {
/*  38 */     HelperCommunication.getInstance().executeActionChecked(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) throws UserCanceledException {
/*     */             try {
/*  42 */               FileInstallerState.getInstance().writeLog();
/*  43 */             } catch (IOException e) {
/*  44 */               throw new RuntimeException(e);
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean wasPreviouslyCreated(final File destFile) {
/*  52 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws UserCanceledException {
/*  55 */             return FileInstallerState.getInstance().wasPreviouslyCreated(destFile);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasRollbackFiles() {
/*  62 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws UserCanceledException {
/*  65 */             return FileInstallerState.getInstance().hasRollbackFiles();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasUnrollbackedFiles() {
/*  72 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws UserCanceledException {
/*  75 */             return FileInstallerState.getInstance().hasUnrollbackedFiles();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void addReplacedFile(final BackupPair backupPair) {
/*  82 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/*  85 */             FileInstallerState.getInstance().addReplacedFile(backupPair);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void addCreatedDir(final InstallFile installFile) {
/*  92 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/*  95 */             FileInstallerState.getInstance().addCreatedDir(installFile);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerCleanupFile(final File file) {
/* 102 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 105 */             FileInstallerState.getInstance().registerCleanupFile(file);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerPreUninstallCommand(final File file, final boolean adminRights, final String command, final String[] arguments) {
/* 112 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 115 */             FileInstallerState.getInstance().registerPreUninstallCommand(file, adminRights, command, arguments);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void addCreatedFile(final InstallFile destFile, final boolean registerRollback) {
/* 122 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 125 */             FileInstallerState.getInstance().addCreatedFile(destFile, registerRollback);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public FileLogger getRollbackFileLogger() {
/* 132 */     return (FileLogger)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<FileLogger>()
/*     */         {
/*     */           protected FileLogger fetchValue(Context context) throws UserCanceledException {
/* 135 */             return FileInstallerState.getInstance().getRollbackFileLogger();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public List<BackupPair> getReplacedFiles() {
/* 142 */     return (List<BackupPair>)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<List<BackupPair>>()
/*     */         {
/*     */           protected List<BackupPair> fetchValue(Context context) throws UserCanceledException {
/* 145 */             return FileInstallerState.getInstance().getReplacedFiles();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public List<File> getCleanupFiles() {
/* 152 */     return (List<File>)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<List<File>>()
/*     */         {
/*     */           protected List<File> fetchValue(Context context) throws UserCanceledException {
/* 155 */             return FileInstallerState.getInstance().getCleanupFiles();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isCurrentRebootRequired() {
/* 162 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws UserCanceledException {
/* 165 */             return FileInstallerState.getInstance().isCurrentRebootRequired();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCurrentRebootRequired(final boolean val) {
/* 172 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 175 */             FileInstallerState.getInstance().setCurrentRebootRequired(val);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFileRollbackPerformed(final boolean fileRollbackPerformed) {
/* 182 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 185 */             FileInstallerState.getInstance().setFileRollbackPerformed(fileRollbackPerformed);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFileRollbackPerformed() {
/* 193 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws UserCanceledException {
/* 196 */             return FileInstallerState.getInstance().isFileRollbackPerformed();
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\fileinst\HelperFileInstallerState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */