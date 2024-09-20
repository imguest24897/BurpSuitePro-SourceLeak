/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.RemoteCallable;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.ContextImpl;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import java.io.File;
/*    */ 
/*    */ public class AddWindowsFileRightsAction
/*    */   extends AbstractChangeWindowsRightsAction {
/*    */   private File[] files;
/*    */   
/*    */   public File[] getFiles() {
/* 15 */     return (File[])replaceWithTextOverride("files", replaceVariables(this.files), File[].class);
/*    */   }
/*    */   
/*    */   public void setFiles(File[] files) {
/* 19 */     this.files = files;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 24 */     if (!InstallerUtil.isWindows()) {
/* 25 */       return true;
/*    */     }
/*    */     
/* 28 */     File[] files = getFiles();
/* 29 */     if (files == null) {
/* 30 */       return true;
/*    */     }
/* 32 */     boolean success = true;
/* 33 */     for (File file : files) {
/* 34 */       success &= executeForSingleFile(context, file);
/*    */     }
/* 36 */     return success;
/*    */   }
/*    */   
/*    */   protected boolean executeForSingleFile(Context context, File file) throws UserCanceledException {
/* 40 */     File usedFile = context.getDestinationFile(file);
/* 41 */     if (usedFile == null || !usedFile.exists()) {
/* 42 */       return false;
/*    */     }
/*    */     
/* 45 */     return ContextImpl.getContextInt(context).runBooleanActivityWithFallback((RemoteCallable)new AbstractChangeWindowsRightsAction.ACERemoteCallable(usedFile.getAbsolutePath(), false, 
/* 46 */           isRead(), isWrite(), isExecute(), isAll(), getGroup().getIntValue(), getUsedSidOrAccountName(), getAccessMode()));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 51 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\AddWindowsFileRightsAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */