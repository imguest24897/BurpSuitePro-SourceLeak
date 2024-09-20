/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.actions.AbstractInstallAction;
/*    */ import com.install4j.api.actions.InstallAction;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.unix.UnixFileSystem;
/*    */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class SetModeAction
/*    */   extends AbstractRecursiveFileAction {
/*    */   private String mode;
/*    */   private boolean recursive;
/* 20 */   private FileTarget fileTarget = FileTarget.EVERYTHING;
/*    */   
/*    */   public String getMode() {
/* 23 */     return replaceVariables(replaceVariables(this.mode));
/*    */   }
/*    */   
/*    */   public void setMode(String mode) {
/* 27 */     this.mode = mode;
/*    */   }
/*    */   
/*    */   public FileTarget getFileTarget() {
/* 31 */     return (FileTarget)replaceWithTextOverride("fileTarget", this.fileTarget, FileTarget.class);
/*    */   }
/*    */   
/*    */   public void setFileTarget(FileTarget fileTarget) {
/* 35 */     this.fileTarget = fileTarget;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRecursive() {
/* 40 */     return replaceWithTextOverride("recursive", this.recursive);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setRecursive(boolean recursive) {
/* 45 */     this.recursive = recursive;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 50 */     if (InstallerUtil.isWindows()) {
/* 51 */       return true;
/*    */     }
/* 53 */     String newMode = getMode();
/*    */     
/* 55 */     if (newMode == null || newMode.trim().length() == 0) {
/* 56 */       Logger.getInstance().log(this, "Mode is not set", false);
/* 57 */       return false;
/*    */     } 
/* 59 */     return super.execute(context);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean executeForSingleRecursiveFile(Context context, File file, File relativeSourceFile, ProgressAdapter progressAdapter) throws UserCanceledException, IOException {
/* 64 */     if (getFileTarget() == null || getFileTarget().isIncluded(file)) {
/* 65 */       UnixFileSystem.FileInformation fileInformation = UnixFileSystem.getFileInformation(file);
/*    */       
/* 67 */       if (fileInformation != null && fileInformation.getMode() > -1) {
/* 68 */         addRollbackAction((InstallAction)new PerformedAction(fileInformation.getMode(), file));
/*    */       }
/*    */       
/* 71 */       Util.logInfo(this, "Setting mode for " + file.getAbsolutePath());
/* 72 */       return UnixFileSystem.setMode(getMode(), file);
/*    */     } 
/* 74 */     return true;
/*    */   }
/*    */   
/*    */   private static class PerformedAction
/*    */     extends AbstractInstallAction {
/*    */     private int oldMode;
/*    */     private File file;
/*    */     
/*    */     public PerformedAction(int oldMode, File file) {
/* 83 */       this.oldMode = oldMode;
/* 84 */       this.file = file;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean install(InstallerContext context) throws UserCanceledException {
/* 89 */       throw new UnsupportedOperationException();
/*    */     }
/*    */ 
/*    */     
/*    */     public void rollback(InstallerContext context) {
/* 94 */       UnixFileSystem.setMode(this.oldMode, this.file);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\SetModeAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */