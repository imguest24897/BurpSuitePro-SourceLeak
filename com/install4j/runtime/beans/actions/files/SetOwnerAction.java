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
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class SetOwnerAction
/*    */   extends AbstractRecursiveFileAction {
/*    */   private String owner;
/*    */   private boolean recursive;
/*    */   
/*    */   public String getOwner() {
/* 21 */     return replaceVariables(replaceVariables(this.owner));
/*    */   }
/*    */   
/*    */   public void setOwner(String owner) {
/* 25 */     this.owner = owner;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRecursive() {
/* 30 */     return replaceWithTextOverride("recursive", this.recursive);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setRecursive(boolean recursive) {
/* 35 */     this.recursive = recursive;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 40 */     if (InstallerUtil.isWindows()) {
/* 41 */       return true;
/*    */     }
/*    */     
/* 44 */     String newOwner = getOwner();
/* 45 */     if (newOwner == null || newOwner.trim().length() == 0) {
/* 46 */       return false;
/*    */     }
/*    */     
/* 49 */     return super.execute(context);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean executeForSingleRecursiveFile(Context context, File file, File relativeSourceFile, ProgressAdapter progressAdapter) throws UserCanceledException, IOException {
/* 54 */     UnixFileSystem.FileInformation fileInformation = UnixFileSystem.getFileInformation(file);
/*    */     
/* 56 */     if (fileInformation != null && fileInformation.getMode() > -1) {
/* 57 */       addRollbackAction((InstallAction)new PerformedAction(fileInformation.getOwnerInfo(), file));
/*    */     }
/*    */     
/* 60 */     Util.logInfo(this, "Setting owner for " + file.getAbsolutePath());
/* 61 */     return UnixFileSystem.setOwner(getOwner().trim(), file);
/*    */   }
/*    */   
/*    */   private static class PerformedAction extends AbstractInstallAction {
/*    */     private String oldOwner;
/*    */     private File file;
/*    */     
/*    */     public PerformedAction(String oldOwner, File file) {
/* 69 */       this.oldOwner = oldOwner;
/* 70 */       this.file = file;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean install(InstallerContext context) throws UserCanceledException {
/* 75 */       throw new UnsupportedOperationException();
/*    */     }
/*    */ 
/*    */     
/*    */     public void rollback(InstallerContext context) {
/* 80 */       UnixFileSystem.setOwner(this.oldOwner, this.file);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\SetOwnerAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */