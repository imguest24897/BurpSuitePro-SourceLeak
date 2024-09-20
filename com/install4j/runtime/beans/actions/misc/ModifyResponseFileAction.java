/*    */ package com.install4j.runtime.beans.actions.misc;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.runtime.beans.actions.properties.PropertiesFileEncoding;
/*    */ import com.install4j.runtime.beans.actions.properties.PropertiesFileParameters;
/*    */ import com.install4j.runtime.beans.actions.properties.TextProperties;
/*    */ import com.install4j.runtime.installer.InstallerVariables;
/*    */ import java.io.File;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class ModifyResponseFileAction
/*    */   extends AbstractWriteResponseFileAction
/*    */ {
/*    */   private boolean addVariables = false;
/*    */   
/*    */   public boolean isAddVariables() {
/* 18 */     return replaceWithTextOverride("addVariables", this.addVariables);
/*    */   }
/*    */   
/*    */   public void setAddVariables(boolean addVariables) {
/* 22 */     this.addVariables = addVariables;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean fileMustExist() {
/* 27 */     return true;
/*    */   }
/*    */   protected boolean modifyFile(File file, Context context) throws IOException {
/*    */     VariableSelectionMode variableSelectionMode;
/*    */     String[] variables;
/* 32 */     TextProperties properties = new TextProperties();
/* 33 */     properties.read(file, new PropertiesFileParameters(PropertiesFileEncoding.JAVA_PROPERTIES));
/*    */     
/* 35 */     FileOutputStream out = new FileOutputStream(file);
/*    */ 
/*    */     
/* 38 */     if (isAddVariables()) {
/* 39 */       variableSelectionMode = getVariableSelectionMode();
/* 40 */       variables = getVariables();
/*    */     } else {
/* 42 */       variableSelectionMode = VariableSelectionMode.INCLUDE;
/* 43 */       variables = null;
/*    */     } 
/* 45 */     out.write(InstallerVariables.getResponseFileContent(variableSelectionMode, variables, properties));
/* 46 */     out.close();
/* 47 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\ModifyResponseFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */