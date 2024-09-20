/*    */ package com.install4j.runtime.beans.actions.misc;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.runtime.installer.InstallerVariables;
/*    */ import java.io.File;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ public class CreateResponseFileAction
/*    */   extends AbstractWriteResponseFileAction
/*    */ {
/*    */   protected boolean modifyFile(File file, Context context) throws IOException {
/* 14 */     FileOutputStream out = new FileOutputStream(file);
/* 15 */     out.write(InstallerVariables.getResponseFileContent(getVariableSelectionMode(), getVariables()));
/* 16 */     out.close();
/* 17 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\CreateResponseFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */