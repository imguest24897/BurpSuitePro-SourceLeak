/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import java.io.File;
/*    */ 
/*    */ public abstract class AbstractModifySingleFileAction
/*    */   extends AbstractModifyFileAction
/*    */ {
/*    */   private File file;
/*    */   
/*    */   public File getFile() {
/* 13 */     return (File)replaceWithTextOverride("file", replaceVariables(this.file), File.class);
/*    */   }
/*    */   
/*    */   public void setFile(File file) {
/* 17 */     this.file = file;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 22 */     return executeForSingleFile(context, getFile());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\AbstractModifySingleFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */