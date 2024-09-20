/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ import com.install4j.api.actions.InstallAction;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public abstract class AbstractModifyFileAction
/*    */   extends SystemInstallOrUninstallAction {
/*    */   protected abstract boolean modifyFile(File paramFile, Context paramContext) throws IOException, UserCanceledException;
/*    */   
/*    */   protected boolean executeForSingleFile(Context context, File file) throws UserCanceledException {
/* 18 */     File usedFile = resolveRelativeFile(file, context);
/*    */     try {
/* 20 */       if (fileMustExist() && !usedFile.exists()) {
/* 21 */         Logger.getInstance().error(this, "The file " + usedFile.getAbsolutePath() + " does not exist.");
/* 22 */         return false;
/*    */       } 
/* 24 */       if (context instanceof InstallerContext && !isSuppressRollback()) {
/* 25 */         if (fileWillBeCreated() && !usedFile.exists()) {
/* 26 */           BackupFileForRollbackAction backupAction = new BackupFileForRollbackAction(usedFile, true);
/* 27 */           backupAction.install((InstallerContext)context);
/* 28 */           addRollbackAction((InstallAction)backupAction);
/* 29 */         } else if (usedFile.isFile()) {
/* 30 */           BackupFileForRollbackAction backupAction = new BackupFileForRollbackAction(usedFile, false);
/* 31 */           backupAction.install((InstallerContext)context);
/* 32 */           addRollbackAction((InstallAction)backupAction);
/*    */         } 
/*    */       }
/* 35 */       return modifyFile(usedFile, context);
/* 36 */     } catch (IOException e) {
/* 37 */       Logger.getInstance().log(e);
/* 38 */       return false;
/*    */     } 
/*    */   }
/*    */   
/*    */   protected boolean executeForMultipleFiles(Context context, File[] files) throws UserCanceledException {
/* 43 */     if (files == null) {
/* 44 */       return true;
/*    */     }
/* 46 */     boolean success = true;
/* 47 */     for (File file : files) {
/* 48 */       success &= executeForSingleFile(context, file);
/*    */     }
/* 50 */     return success;
/*    */   }
/*    */   
/*    */   protected boolean fileMustExist() {
/* 54 */     return false;
/*    */   }
/*    */   
/*    */   protected boolean fileWillBeCreated() {
/* 58 */     return false;
/*    */   }
/*    */   
/*    */   protected Object maybeFilterLogReplacement(String propertyName, String replacementPropertyName, Object propertyValue, boolean logReplacement) {
/* 62 */     if (Objects.equals(propertyName, replacementPropertyName) && !logReplacement) {
/* 63 */       return "[logging of replacement text is disabled]";
/*    */     }
/* 65 */     return propertyValue;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\AbstractModifyFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */