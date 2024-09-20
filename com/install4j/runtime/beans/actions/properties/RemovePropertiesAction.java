/*    */ package com.install4j.runtime.beans.actions.properties;
/*    */ 
/*    */ import com.install4j.api.actions.InstallAction;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.actions.files.BackupFileForRollbackAction;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class RemovePropertiesAction
/*    */   extends AbstractPropertiesFileAction {
/*    */   private String[] keyNames;
/*    */   
/*    */   public String[] getKeyNames() {
/* 17 */     return (String[])replaceWithTextOverride("keyNames", replaceVariables(this.keyNames), String[].class);
/*    */   }
/*    */   
/*    */   public void setKeyNames(String[] keyNames) {
/* 21 */     this.keyNames = keyNames;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 27 */     File usedFile = resolveRelativeFile(getFile(), context);
/* 28 */     TextProperties properties = new TextProperties();
/* 29 */     if (!usedFile.exists()) {
/* 30 */       Logger.getInstance().error(this, "The properties file " + usedFile + " does not exist.");
/* 31 */       return false;
/*    */     } 
/*    */     
/* 34 */     PropertiesFileParameters parameters = new PropertiesFileParameters(getEncoding(), getCharsetName());
/*    */     try {
/* 36 */       properties.read(usedFile, parameters);
/* 37 */     } catch (IOException e) {
/* 38 */       Logger.getInstance().error(this, "Could not read properties file");
/* 39 */       Logger.getInstance().log(e);
/* 40 */       return false;
/*    */     } 
/* 42 */     if (context instanceof InstallerContext && !isSuppressRollback()) {
/* 43 */       BackupFileForRollbackAction backupAction = new BackupFileForRollbackAction(usedFile, true);
/* 44 */       backupAction.install((InstallerContext)context);
/* 45 */       addRollbackAction((InstallAction)backupAction);
/*    */     } 
/*    */     
/* 48 */     removeProperties(properties);
/*    */     
/* 50 */     LineSeparator lineSeparator = parameters.getDetectedLineSeparator();
/* 51 */     if (lineSeparator == null) {
/* 52 */       lineSeparator = LineSeparator.SYSTEM;
/*    */     }
/* 54 */     PropertiesWriteParameters writeParameters = new PropertiesWriteParameters(getEncoding(), getCharsetName(), lineSeparator);
/*    */     
/*    */     try {
/* 57 */       properties.write(usedFile, writeParameters);
/* 58 */     } catch (IOException e) {
/* 59 */       Logger.getInstance().error(this, "Could not write properties file");
/* 60 */       Logger.getInstance().log(e);
/* 61 */       return false;
/*    */     } 
/*    */     
/* 64 */     return true;
/*    */   }
/*    */   
/*    */   private void removeProperties(TextProperties properties) {
/* 68 */     String[] keyNames = getKeyNames();
/* 69 */     if (keyNames != null)
/* 70 */       for (String keyName : keyNames)
/* 71 */         properties.remove(keyName);  
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\properties\RemovePropertiesAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */