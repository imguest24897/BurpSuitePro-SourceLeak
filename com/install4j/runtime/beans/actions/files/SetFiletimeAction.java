/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ import com.install4j.api.actions.AbstractInstallAction;
/*    */ import com.install4j.api.actions.InstallAction;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.Date;
/*    */ 
/*    */ public class SetFiletimeAction
/*    */   extends AbstractRecursiveFileAction {
/* 15 */   private Date time = new Date();
/*    */   private boolean recursive;
/*    */   
/*    */   public Date getTime() {
/* 19 */     return (Date)replaceWithTextOverride("time", this.time, Date.class);
/*    */   }
/*    */   
/*    */   public void setTime(Date time) {
/* 23 */     this.time = time;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRecursive() {
/* 28 */     return replaceWithTextOverride("recursive", this.recursive);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setRecursive(boolean recursive) {
/* 33 */     this.recursive = recursive;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean executeForSingleRecursiveFile(Context context, File file, File relativeSourceFile, ProgressAdapter progressAdapter) throws UserCanceledException, IOException {
/* 38 */     if (!isSuppressRollback()) {
/* 39 */       addRollbackAction((InstallAction)new PerformedAction(file, file.lastModified()));
/*    */     }
/* 41 */     return file.setLastModified(getTime().getTime());
/*    */   }
/*    */   
/*    */   private static class PerformedAction
/*    */     extends AbstractInstallAction {
/*    */     private File file;
/*    */     private long previousTime;
/*    */     
/*    */     public PerformedAction(File file, long previousTime) {
/* 50 */       this.file = file;
/* 51 */       this.previousTime = previousTime;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean install(InstallerContext context) throws UserCanceledException {
/* 56 */       return false;
/*    */     }
/*    */ 
/*    */     
/*    */     public void rollback(InstallerContext context) {
/* 61 */       if (this.file.exists())
/* 62 */         this.file.setLastModified(this.previousTime); 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\SetFiletimeAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */