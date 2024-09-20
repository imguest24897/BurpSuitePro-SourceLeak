/*    */ package com.install4j.runtime.beans.actions.text;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class ReadTextFromFileAction
/*    */   extends SystemInstallOrUninstallAction
/*    */ {
/* 14 */   private File file = null;
/* 15 */   private String variableName = "";
/* 16 */   private String encoding = "";
/*    */   private boolean saveAsArray = false;
/*    */   
/*    */   public File getFile() {
/* 20 */     return (File)replaceWithTextOverride("file", replaceVariables(this.file), File.class);
/*    */   }
/*    */   
/*    */   public void setFile(File file) {
/* 24 */     this.file = file;
/*    */   }
/*    */   
/*    */   public String getEncoding() {
/* 28 */     return replaceVariables(replaceVariables(this.encoding));
/*    */   }
/*    */   
/*    */   public void setEncoding(String encoding) {
/* 32 */     this.encoding = encoding;
/*    */   }
/*    */   
/*    */   public String getVariableName() {
/* 36 */     return replaceVariables(this.variableName);
/*    */   }
/*    */   
/*    */   public void setVariableName(String variableName) {
/* 40 */     this.variableName = variableName;
/*    */   }
/*    */   
/*    */   public boolean isSaveAsArray() {
/* 44 */     return replaceWithTextOverride("saveAsArray", this.saveAsArray);
/*    */   }
/*    */   
/*    */   public void setSaveAsArray(boolean saveAsArray) {
/* 48 */     this.saveAsArray = saveAsArray;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 53 */     String encoding = getEncoding();
/* 54 */     File actualFile = context.getDestinationFile(getFile());
/*    */     try {
/* 56 */       String value = InstallerUtil.readTextFile(actualFile, encoding);
/* 57 */       context.setVariable(getVariableName(), maybeSplit(value));
/* 58 */       return true;
/* 59 */     } catch (IOException e) {
/* 60 */       Logger.getInstance().log(e);
/* 61 */       return false;
/*    */     } 
/*    */   }
/*    */   
/*    */   private Object maybeSplit(String value) {
/* 66 */     if (isSaveAsArray()) {
/* 67 */       return value.split("\\R");
/*    */     }
/* 69 */     return value;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 75 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\text\ReadTextFromFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */