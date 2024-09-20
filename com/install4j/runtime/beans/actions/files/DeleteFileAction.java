/*     */ package com.install4j.runtime.beans.actions.files;
/*     */ 
/*     */ import com.install4j.api.actions.InstallAction;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ public class DeleteFileAction
/*     */   extends AbstractRecursiveFileAction
/*     */ {
/*     */   private boolean backupForRollback = true;
/*  20 */   private List<BackupFileForRollbackAction> dirRollbackActions = new ArrayList<>();
/*     */   
/*     */   public boolean isBackupForRollback() {
/*  23 */     return replaceWithTextOverride("backupForRollback", this.backupForRollback);
/*     */   }
/*     */   
/*     */   public void setBackupForRollback(boolean backupForRollback) {
/*  27 */     this.backupForRollback = backupForRollback;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean executeForSingleRecursiveFile(Context context, File file, File relativeSourceFile, ProgressAdapter progressAdapter) throws UserCanceledException, IOException {
/*  32 */     if (!file.isDirectory()) {
/*  33 */       deleteWithRetry(file, context);
/*  34 */       boolean success = !file.exists();
/*  35 */       if (!success) {
/*  36 */         Logger.getInstance().log(this, "The file " + file.getPath() + " cannot be deleted", false);
/*     */       }
/*  38 */       return success;
/*     */     } 
/*  40 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean postProcessDirectory(Context context, File file) throws UserCanceledException {
/*  46 */     deleteDir(context, file);
/*  47 */     boolean success = (!isRecursive() || !file.exists() || getFileFilter() != null || getDirectoryFilter() != null);
/*  48 */     if (!success) {
/*  49 */       Logger.getInstance().log(this, "Could not delete directory " + file, false);
/*     */     }
/*  51 */     return success;
/*     */   }
/*     */   
/*     */   private void deleteDir(Context context, File usedFile) throws UserCanceledException {
/*  55 */     BackupFileForRollbackAction rollbackAction = deleteFile(usedFile, context);
/*  56 */     if (rollbackAction != null) {
/*  57 */       this.dirRollbackActions.add(rollbackAction);
/*     */     }
/*     */   }
/*     */   
/*     */   private void deleteWithRetry(File usedFile, Context context) throws UserCanceledException {
/*  62 */     for (int i = 0; i < 3; i++) {
/*  63 */       if (i > 0) {
/*     */         try {
/*  65 */           Thread.sleep(350L);
/*  66 */         } catch (InterruptedException e) {
/*  67 */           e.printStackTrace();
/*     */         } 
/*     */       }
/*  70 */       BackupFileForRollbackAction rollbackAction = deleteFile(usedFile, context);
/*  71 */       if (!usedFile.exists()) {
/*  72 */         if (rollbackAction != null) {
/*  73 */           addRollbackAction((InstallAction)rollbackAction);
/*     */         }
/*     */         return;
/*     */       } 
/*  77 */       if (rollbackAction != null && rollbackAction.getBackupFile() != null) {
/*  78 */         rollbackAction.getBackupFile().delete();
/*     */       }
/*  80 */       if (!isPossiblyWritable(usedFile)) {
/*     */         return;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean isPossiblyWritable(File file) {
/*     */     try {
/*  89 */       return Files.isWritable(file.toPath());
/*  90 */     } catch (Throwable t) {
/*  91 */       return true;
/*     */     } 
/*     */   }
/*     */   
/*     */   private BackupFileForRollbackAction deleteFile(File usedFile, Context context) throws UserCanceledException {
/*  96 */     if (context instanceof InstallerContext && shouldRollback()) {
/*  97 */       BackupFileForRollbackAction backupFileForRollbackAction = new BackupFileForRollbackAction(usedFile, true, false, false);
/*     */       
/*  99 */       backupFileForRollbackAction.install((InstallerContext)context);
/* 100 */       return backupFileForRollbackAction;
/*     */     } 
/* 102 */     usedFile.delete();
/* 103 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean shouldRollback() {
/* 108 */     return (isBackupForRollback() && !isSuppressRollback());
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollback(InstallerContext context) {
/* 113 */     for (int i = this.dirRollbackActions.size() - 1; i >= 0; i--) {
/* 114 */       InstallAction action = (InstallAction)this.dirRollbackActions.get(i);
/* 115 */       action.rollback(context);
/*     */     } 
/* 117 */     super.rollback(context);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isRollbackSupported() {
/* 122 */     return isBackupForRollback();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean isErrorIfFileMissing() {
/* 127 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\DeleteFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */