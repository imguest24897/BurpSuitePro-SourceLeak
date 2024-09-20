/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ import com.install4j.api.actions.InstallAction;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import java.io.File;
/*    */ 
/*    */ public class MoveFileAction
/*    */   extends CopyFileAction
/*    */ {
/*    */   protected boolean postProcessTopLevelFile(Context context, File file) throws UserCanceledException {
/* 12 */     DeleteFileAction deleteFileAction = new DeleteFileAction();
/* 13 */     deleteFileAction.setFiles(new File[] { file });
/* 14 */     deleteFileAction.setFilesRoot(getFilesRoot());
/* 15 */     deleteFileAction.setFileFilter(getFileFilter());
/* 16 */     deleteFileAction.setRecursive(true);
/* 17 */     addRollbackAction((InstallAction)deleteFileAction);
/* 18 */     return (deleteFileAction.execute(context) && super.postProcessTopLevelFile(context, file));
/*    */   }
/*    */ 
/*    */   
/*    */   protected String getActionName() {
/* 23 */     return "Move";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\MoveFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */