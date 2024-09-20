/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import java.io.File;
/*    */ 
/*    */ public abstract class AbstractModifyMultipleFilesAction
/*    */   extends AbstractModifyFileAction
/*    */ {
/*    */   private File[] files;
/*    */   
/*    */   public File[] getFiles() {
/* 13 */     return (File[])replaceWithTextOverride("files", replaceVariables(this.files), File[].class);
/*    */   }
/*    */   
/*    */   public void setFiles(File[] files) {
/* 17 */     this.files = files;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 22 */     return executeForMultipleFiles(context, getFiles());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\AbstractModifyMultipleFilesAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */