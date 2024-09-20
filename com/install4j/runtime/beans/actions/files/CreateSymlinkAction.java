/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ import com.install4j.api.actions.InstallAction;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.unix.UnixFileSystem;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*    */ import java.io.File;
/*    */ 
/*    */ public class CreateSymlinkAction
/*    */   extends SystemInstallOrUninstallAction {
/*    */   private File file;
/*    */   private File linkFile;
/*    */   private boolean removeOnUninstall = true;
/*    */   
/*    */   public File getFile() {
/* 20 */     return (File)replaceWithTextOverride("file", replaceVariables(this.file), File.class);
/*    */   }
/*    */   
/*    */   public void setFile(File file) {
/* 24 */     this.file = file;
/*    */   }
/*    */   
/*    */   public File getLinkFile() {
/* 28 */     return (File)replaceWithTextOverride("linkFile", replaceVariables(this.linkFile), File.class);
/*    */   }
/*    */   
/*    */   public void setLinkFile(File linkFile) {
/* 32 */     this.linkFile = linkFile;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRemoveOnUninstall() {
/* 37 */     return replaceWithTextOverride("removeOnUninstall", this.removeOnUninstall);
/*    */   }
/*    */   
/*    */   public void setRemoveOnUninstall(boolean removeOnUninstall) {
/* 41 */     this.removeOnUninstall = removeOnUninstall;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 46 */     if (InstallerUtil.isWindows()) {
/* 47 */       return true;
/*    */     }
/*    */     
/* 50 */     File usedFile = context.getDestinationFile(getFile());
/* 51 */     if (usedFile == null || !usedFile.exists()) {
/* 52 */       return false;
/*    */     }
/*    */     
/* 55 */     File usedLinkFile = context.getDestinationFile(getLinkFile());
/* 56 */     if (usedLinkFile == null) {
/* 57 */       return false;
/*    */     }
/*    */     
/* 60 */     if (context instanceof InstallerContext) {
/* 61 */       BackupFileForRollbackAction backupAction = new BackupFileForRollbackAction(usedLinkFile, true, true);
/* 62 */       backupAction.install((InstallerContext)context);
/* 63 */       addRollbackAction((InstallAction)backupAction);
/*    */     } 
/*    */     
/* 66 */     if (isRemoveOnUninstall()) {
/* 67 */       FileInstaller.getInstance().registerUninstallFile(usedLinkFile);
/*    */     }
/* 69 */     return UnixFileSystem.createLink(usedFile.getAbsolutePath(), usedLinkFile);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\CreateSymlinkAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */