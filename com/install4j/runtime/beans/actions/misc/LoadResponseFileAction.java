/*    */ package com.install4j.runtime.beans.actions.misc;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import com.install4j.runtime.installer.ContextImpl;
/*    */ import com.install4j.runtime.installer.InstallerVariables;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collections;
/*    */ 
/*    */ 
/*    */ public class LoadResponseFileAction
/*    */   extends SystemInstallOrUninstallAction
/*    */ {
/* 18 */   private File file = null;
/*    */   private String[] excludedVariables;
/* 20 */   private OverwriteStrategy overwriteStrategy = OverwriteStrategy.NOT_COMMAND_LINE;
/*    */   private boolean registerForResponseFile = true;
/*    */   
/*    */   public File getFile() {
/* 24 */     return (File)replaceWithTextOverride("file", replaceVariables(this.file), File.class);
/*    */   }
/*    */   
/*    */   public void setFile(File file) {
/* 28 */     this.file = file;
/*    */   }
/*    */   
/*    */   public String[] getExcludedVariables() {
/* 32 */     return (String[])replaceWithTextOverride("excludedVariables", this.excludedVariables, String[].class);
/*    */   }
/*    */   
/*    */   public void setExcludedVariables(String[] excludedVariables) {
/* 36 */     this.excludedVariables = excludedVariables;
/*    */   }
/*    */   
/*    */   public OverwriteStrategy getOverwriteStrategy() {
/* 40 */     return (OverwriteStrategy)replaceWithTextOverride("overwriteStrategy", this.overwriteStrategy, OverwriteStrategy.class);
/*    */   }
/*    */   
/*    */   public void setOverwriteStrategy(OverwriteStrategy overwriteStrategy) {
/* 44 */     this.overwriteStrategy = overwriteStrategy;
/*    */   }
/*    */   
/*    */   public boolean isRegisterForResponseFile() {
/* 48 */     return replaceWithTextOverride("registerForResponseFile", this.registerForResponseFile);
/*    */   }
/*    */   
/*    */   public void setRegisterForResponseFile(boolean registerForResponseFile) {
/* 52 */     this.registerForResponseFile = registerForResponseFile;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 57 */     File responseFile = context.getDestinationFile(getFile());
/* 58 */     boolean autoResponseFile = false;
/* 59 */     if (responseFile == null) {
/* 60 */       responseFile = new File(ContextImpl.getContextInt(context).getRuntimeDirectory(), "response.varfile");
/* 61 */       autoResponseFile = true;
/*    */     } 
/* 63 */     if (!responseFile.exists()) {
/* 64 */       Logger.getInstance().log(this, "Response file " + responseFile.getPath() + " does not exist", autoResponseFile);
/* 65 */       return autoResponseFile;
/*    */     } 
/*    */     try {
/* 68 */       InstallerVariables.loadResponseFile(responseFile, true, (getExcludedVariables() == null) ? Collections.emptyList() : Arrays.<String>asList(getExcludedVariables()), getOverwriteStrategy(), isRegisterForResponseFile());
/* 69 */     } catch (IOException e) {
/* 70 */       Logger.getInstance().log(e);
/* 71 */       return false;
/*    */     } 
/* 73 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 78 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\LoadResponseFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */