/*     */ package com.install4j.runtime.beans.actions.files;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallAction;
/*     */ import com.install4j.runtime.installer.helper.FileAttributesHelper;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BackupFileForRollbackAction
/*     */   extends SystemInstallAction
/*     */ {
/*     */   private File file;
/*     */   private boolean delete;
/*     */   private boolean failIfRenameDoesntWork = false;
/*     */   private boolean fallBackToParentDir = true;
/*     */   private File backupFile;
/*     */   private long modTime;
/*     */   private String posixPermissions;
/*     */   private boolean directory = false;
/*     */   private boolean fileDidNotExist = false;
/*     */   private File linkTarget;
/*     */   
/*     */   public BackupFileForRollbackAction() {}
/*     */   
/*     */   public BackupFileForRollbackAction(File file, boolean delete) {
/*  38 */     setFile(file);
/*  39 */     setDelete(delete);
/*     */   }
/*     */   
/*     */   public BackupFileForRollbackAction(File file, boolean delete, boolean failIfRenameDoesntWork) {
/*  43 */     setFile(file);
/*  44 */     setDelete(delete);
/*  45 */     setFailIfRenameDoesntWork(failIfRenameDoesntWork);
/*     */   }
/*     */   
/*     */   public BackupFileForRollbackAction(File file, boolean delete, boolean failIfRenameDoesntWork, boolean fallBackToParentDir) {
/*  49 */     setFile(file);
/*  50 */     setDelete(delete);
/*  51 */     setFailIfRenameDoesntWork(failIfRenameDoesntWork);
/*  52 */     this.fallBackToParentDir = fallBackToParentDir;
/*     */   }
/*     */   
/*     */   public File getFile() {
/*  56 */     return (File)replaceWithTextOverride("file", replaceVariables(this.file), File.class);
/*     */   }
/*     */   
/*     */   public void setFile(File file) {
/*  60 */     this.file = file;
/*     */   }
/*     */   
/*     */   public boolean isDelete() {
/*  64 */     return replaceWithTextOverride("delete", this.delete);
/*     */   }
/*     */   
/*     */   public void setDelete(boolean delete) {
/*  68 */     this.delete = delete;
/*     */   }
/*     */   
/*     */   public boolean isFailIfRenameDoesntWork() {
/*  72 */     return replaceWithTextOverride("failIfRenameDoesntWork", this.failIfRenameDoesntWork);
/*     */   }
/*     */   
/*     */   public void setFailIfRenameDoesntWork(boolean failIfRenameDoesntWork) {
/*  76 */     this.failIfRenameDoesntWork = failIfRenameDoesntWork;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/*  81 */     if (getFile() == null || getFile().getPath().trim().length() == 0) {
/*  82 */       return false;
/*     */     }
/*     */     
/*  85 */     File usedFile = context.getDestinationFile(getFile());
/*  86 */     Path path = usedFile.toPath();
/*  87 */     boolean symbolicLink = Files.isSymbolicLink(path);
/*  88 */     if (!symbolicLink && !usedFile.exists()) {
/*  89 */       this.fileDidNotExist = true;
/*  90 */       return true;
/*     */     } 
/*     */     
/*  93 */     Util.logInfo(null, "Backing up " + usedFile.getAbsolutePath());
/*     */     
/*     */     try {
/*  96 */       this.modTime = usedFile.lastModified();
/*  97 */       if (symbolicLink) {
/*  98 */         this.linkTarget = Files.readSymbolicLink(path).toFile();
/*     */       }
/* 100 */       if (!Util.isWindows()) {
/*     */         try {
/* 102 */           this.posixPermissions = FileAttributesHelper.getPosixFilePermissions(usedFile);
/* 103 */         } catch (Throwable throwable) {}
/*     */       }
/*     */       
/* 106 */       this.directory = usedFile.isDirectory();
/*     */       
/* 108 */       if (this.linkTarget != null) {
/* 109 */         usedFile.delete();
/* 110 */       } else if (this.directory) {
/* 111 */         if (isDelete()) {
/* 112 */           usedFile.delete();
/*     */         }
/*     */       } else {
/* 115 */         this.backupFile = File.createTempFile("i4b", null);
/* 116 */         if (isDelete()) {
/* 117 */           this.backupFile.delete();
/* 118 */           if (!usedFile.renameTo(this.backupFile)) {
/*     */             File newBackupFile;
/* 120 */             if (this.fallBackToParentDir) {
/*     */               try {
/* 122 */                 newBackupFile = File.createTempFile("i4b", null, usedFile.getParentFile());
/* 123 */                 newBackupFile.delete();
/* 124 */               } catch (IOException e) {
/*     */                 
/* 126 */                 newBackupFile = this.backupFile;
/*     */               } 
/*     */             } else {
/* 129 */               newBackupFile = this.backupFile;
/*     */             } 
/* 131 */             if (usedFile.renameTo(newBackupFile)) {
/* 132 */               this.backupFile = newBackupFile;
/*     */             } else {
/* 134 */               if (isFailIfRenameDoesntWork()) {
/* 135 */                 this.backupFile = null;
/* 136 */                 return false;
/*     */               } 
/* 138 */               FileUtil.copyFile(usedFile, this.backupFile);
/* 139 */               usedFile.delete();
/*     */             } 
/*     */           } 
/*     */         } else {
/*     */           
/* 144 */           FileUtil.copyFile(usedFile, this.backupFile);
/*     */         } 
/* 146 */         FileInstaller.getInstance().registerCleanupFile(this.backupFile);
/*     */       }
/*     */     
/* 149 */     } catch (IOException e) {
/* 150 */       Logger.getInstance().log(e);
/* 151 */       this.backupFile.delete();
/* 152 */       this.backupFile = null;
/* 153 */       return false;
/*     */     } 
/* 155 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollback(InstallerContext context) {
/* 160 */     if (this.fileDidNotExist) {
/* 161 */       context.getDestinationFile(getFile()).delete();
/* 162 */     } else if (this.linkTarget != null || this.directory || (this.backupFile != null && this.backupFile.exists())) {
/* 163 */       File usedFile = context.getDestinationFile(getFile());
/*     */       try {
/* 165 */         usedFile.delete();
/* 166 */         if (this.linkTarget != null) {
/* 167 */           Files.createSymbolicLink(usedFile.toPath(), this.linkTarget.toPath(), (FileAttribute<?>[])new FileAttribute[0]);
/* 168 */         } else if (this.directory) {
/* 169 */           usedFile.mkdirs();
/*     */         }
/* 171 */         else if (!this.backupFile.renameTo(usedFile) && !isFailIfRenameDoesntWork()) {
/* 172 */           FileUtil.copyFile(this.backupFile, usedFile);
/*     */         } 
/*     */         
/* 175 */         usedFile.setLastModified(this.modTime);
/* 176 */         if (this.posixPermissions != null) {
/*     */           try {
/* 178 */             UnixFileSystem.setMode(this.posixPermissions, usedFile);
/* 179 */           } catch (Throwable throwable) {}
/*     */         }
/*     */         
/* 182 */         if (this.backupFile != null) {
/* 183 */           this.backupFile.delete();
/*     */         }
/* 185 */       } catch (IOException e) {
/* 186 */         Logger.getInstance().log(e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public File getBackupFile() {
/* 192 */     return this.backupFile;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\BackupFileForRollbackAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */