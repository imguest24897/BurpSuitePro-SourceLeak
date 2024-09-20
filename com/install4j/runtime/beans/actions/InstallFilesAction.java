/*     */ package com.install4j.runtime.beans.actions;
/*     */ 
/*     */ import com.exe4j.runtime.util.ReadIOException;
/*     */ import com.install4j.api.actions.InstallAction;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.files.BackupFileForRollbackAction;
/*     */ import com.install4j.runtime.beans.actions.misc.VariableSelectionMode;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.config.ComponentConfig;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.RunningProcessChecker;
/*     */ import com.install4j.runtime.installer.helper.ServiceHandler;
/*     */ import com.install4j.runtime.installer.helper.content.ContentInstaller;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ 
/*     */ public class InstallFilesAction
/*     */   extends AbstractInstallFilesAction
/*     */ {
/*  29 */   private static InstallFilesAction firstExecutedAction = null;
/*     */   
/*     */   private boolean installRuntime = true;
/*     */   private boolean validateApplicationId = false;
/*     */   private boolean checkFreeSpace = true;
/*     */   private ScriptProperty sizeCalculatorScript;
/*     */   private boolean saveDownloadedFiles = false;
/*     */   
/*     */   public ScriptProperty getSizeCalculatorScript() {
/*  38 */     return (ScriptProperty)replaceWithTextOverride("sizeCalculatorScript", this.sizeCalculatorScript, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setSizeCalculatorScript(ScriptProperty sizeCalculatorScript) {
/*  42 */     this.sizeCalculatorScript = sizeCalculatorScript;
/*     */   }
/*     */   
/*     */   public boolean isSaveDownloadedFiles() {
/*  46 */     return replaceWithTextOverride("saveDownloadedFiles", this.saveDownloadedFiles);
/*     */   }
/*     */   
/*     */   public void setSaveDownloadedFiles(boolean saveDownloadedFiles) {
/*  50 */     this.saveDownloadedFiles = saveDownloadedFiles;
/*     */   }
/*     */   
/*     */   public boolean isInstallRuntime() {
/*  54 */     return replaceWithTextOverride("installRuntime", this.installRuntime);
/*     */   }
/*     */   
/*     */   public void setInstallRuntime(boolean installRuntime) {
/*  58 */     this.installRuntime = installRuntime;
/*     */   }
/*     */   
/*     */   public boolean isValidateApplicationId() {
/*  62 */     return replaceWithTextOverride("validateApplicationId", this.validateApplicationId);
/*     */   }
/*     */   
/*     */   public void setValidateApplicationId(boolean validateApplicationId) {
/*  66 */     this.validateApplicationId = validateApplicationId;
/*     */   }
/*     */   
/*     */   public boolean isCheckFreeSpace() {
/*  70 */     return replaceWithTextOverride("checkFreeSpace", this.checkFreeSpace);
/*     */   }
/*     */   
/*     */   public void setCheckFreeSpace(boolean checkFreeSpace) {
/*  74 */     this.checkFreeSpace = checkFreeSpace;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/*  79 */     if (firstExecutedAction != this && firstExecutedAction != null) {
/*  80 */       Logger.getInstance().info(this, "Another install files action has already run.");
/*  81 */       return true;
/*     */     } 
/*  83 */     firstExecutedAction = this;
/*     */     
/*  85 */     log();
/*     */     
/*  87 */     ProgressInterface progressInterface = getProgressInterface(context);
/*     */     
/*  89 */     File validationDir = ContentInstaller.validateInstallationDir(context.getInstallationDirectory(), 
/*  90 */         isValidateApplicationId(), isCheckFreeSpace(), false, context.isUnattended(), true);
/*  91 */     if (validationDir == null) {
/*  92 */       throw new UserCanceledException();
/*     */     }
/*  94 */     context.setInstallationDirectory(validationDir);
/*     */ 
/*     */ 
/*     */     
/*  98 */     if (!Boolean.getBoolean("install4j.keepServicesRunning")) {
/*  99 */       ServiceHandler.stopServices((Context)context, false);
/*     */     }
/*     */     
/* 102 */     if (isInstallRuntime() && !RunningProcessChecker.checkDefaultRunningLauncher()) {
/* 103 */       throw new UserCanceledException();
/*     */     }
/*     */ 
/*     */     
/*     */     try {
/* 108 */       FileInstaller.getInstance().setLogDir(context.getDestinationFile(".install4j"));
/* 109 */       FileInstaller.getInstance().resetCurrentRebootRequired();
/*     */       
/*     */       try {
/* 112 */         ContentInstaller.getInstance().doStandardInstallation(context, progressInterface, this);
/* 113 */       } catch (ReadIOException e) {
/* 114 */         Logger.getInstance().error(this, "content corrupted.");
/* 115 */         Logger.getInstance().log(e.getCause());
/* 116 */         return false;
/*     */       } finally {
/* 118 */         if (isTriggerReboot() && isDelay() && FileInstaller.getInstance().isCurrentRebootRequired()) {
/* 119 */           context.triggerReboot(true);
/*     */         }
/*     */       } 
/*     */       
/* 123 */       writeResponseFile(context);
/*     */       
/* 125 */       if (context.isCancelling()) {
/* 126 */         throw new UserCanceledException();
/*     */       }
/*     */     }
/* 129 */     catch (IOException e) {
/* 130 */       context.handleCriticalException(e);
/* 131 */       return false;
/*     */     } 
/* 133 */     progressInterface.setDetailMessage("");
/* 134 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollback(InstallerContext context) {
/* 139 */     super.rollback(context);
/* 140 */     ContentInstaller.getInstance().rollback();
/*     */   }
/*     */   
/*     */   public void writeResponseFile(InstallerContext context) throws IOException, UserCanceledException {
/* 144 */     File runtimeDirectory = ContextImpl.getContextInt((Context)context).getRuntimeDirectory();
/* 145 */     if (runtimeDirectory.exists() && 
/* 146 */       InstallerConfig.isInstaller() && !Boolean.getBoolean("install4j.dontStoreInstallationLog")) {
/* 147 */       String suffix = "";
/* 148 */       if (InstallerConfig.getCurrentInstance().isAddOnInstaller()) {
/* 149 */         suffix = "." + InstallerConfig.getCurrentInstance().getProjectCrc();
/*     */       }
/* 151 */       File responseFile = new File(runtimeDirectory, "response.varfile" + suffix);
/* 152 */       BackupFileForRollbackAction backupAction = new BackupFileForRollbackAction(responseFile, false);
/* 153 */       backupAction.install(context);
/* 154 */       addRollbackAction((InstallAction)backupAction);
/* 155 */       FileOutputStream out = new FileOutputStream(responseFile);
/* 156 */       out.write(InstallerVariables.getResponseFileContent(VariableSelectionMode.EXCLUDE, null));
/* 157 */       out.close();
/* 158 */       FileInstaller.getInstance().registerUninstallFile(responseFile);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void log() {
/* 165 */     List<ComponentConfig> components = InstallerConfig.getCurrentInstance().getComponents();
/* 166 */     for (ComponentConfig componentConfig : components) {
/* 167 */       Logger.getInstance().info(this, "Component " + componentConfig);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean hasRun() {
/* 173 */     return (firstExecutedAction != null);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\InstallFilesAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */