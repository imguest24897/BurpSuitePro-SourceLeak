/*     */ package com.install4j.runtime.beans.actions.update;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.exe4j.runtime.util.ResourceHelper;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallAction;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.launcher.integration.AutomaticUpdate;
/*     */ import com.install4j.runtime.launcher.integration.UpdateConfig;
/*     */ import com.install4j.runtime.launcher.integration.UpdateLog;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Arrays;
/*     */ 
/*     */ public class ScheduleUpdateAction
/*     */   extends SystemInstallAction {
/*     */   private File installerFile;
/*  21 */   private String version = "";
/*  22 */   private int maxTries = 3;
/*  23 */   private int maxCancelCount = 10;
/*     */   private boolean checkNewerVersion = false;
/*     */   private String[] arguments;
/*  26 */   private int retryInhibitionMinutes = 1440;
/*     */ 
/*     */   
/*     */   public void init(Context context) {
/*  30 */     super.init(context);
/*  31 */     if (UpdateLog.setUpdaterApplication(true)) {
/*  32 */       UpdateLog.log(5, "starting installer application with 'Schedule update installation' action.");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/*  38 */     File installerFile = getInstallerFile();
/*  39 */     String installerPath = installerFile.getAbsolutePath();
/*     */     try {
/*  41 */       AutomaticUpdate.cleanupAllSuccessfulInstallations(installerPath);
/*  42 */     } catch (Exception e) {
/*  43 */       Logger.getInstance().log(e);
/*     */     } 
/*  45 */     UpdateLog.log(1, "scheduling " + installerPath);
/*  46 */     UpdateConfig.withConfig(true, updateConfig -> {
/*     */           updateConfig.clear();
/*     */           updateConfig.setFile(installerPath);
/*     */           updateConfig.setRetryInhibitionMinutes(getRetryInhibitionMinutes());
/*     */           updateConfig.setVersion(getVersion());
/*     */           updateConfig.setMaxTries(getMaxTries());
/*     */           updateConfig.setMaxCancelCount(getMaxCancelCount());
/*     */           updateConfig.setCheckNewerVersion(isCheckNewerVersion());
/*     */           if (InstallerConfig.isInstaller()) {
/*     */             updateConfig.setInstallationDirectory(FileUtil.getCanonicalPath(context.getInstallationDirectory()));
/*     */           } else {
/*     */             File installationDir = null;
/*     */             File singleBundle = AutomaticUpdate.getCurrentSingleBundle();
/*     */             if (singleBundle != null) {
/*     */               installationDir = singleBundle.getParentFile();
/*     */             } else {
/*     */               File runtimeDir = ResourceHelper.getRuntimeDir();
/*     */               if (runtimeDir != null) {
/*     */                 installationDir = runtimeDir.getParentFile();
/*     */               }
/*     */             } 
/*     */             if (installationDir != null) {
/*     */               updateConfig.setInstallationDirectory(FileUtil.getCanonicalPath(installationDir));
/*     */             }
/*     */           } 
/*     */           updateConfig.setLanguageId(context.getLanguageId());
/*     */           String[] arguments = getArguments();
/*     */           if (arguments != null) {
/*     */             updateConfig.setArguments(Arrays.asList(arguments));
/*     */           }
/*     */           return true;
/*     */         });
/*  78 */     return true;
/*     */   }
/*     */   
/*     */   public boolean isCheckNewerVersion() {
/*  82 */     return replaceWithTextOverride("checkNewerVersion", this.checkNewerVersion);
/*     */   }
/*     */   
/*     */   public void setCheckNewerVersion(boolean checkNewerVersion) {
/*  86 */     this.checkNewerVersion = checkNewerVersion;
/*     */   }
/*     */   
/*     */   public int getRetryInhibitionMinutes() {
/*  90 */     return replaceWithTextOverride("retryInhibitionMinutes", this.retryInhibitionMinutes);
/*     */   }
/*     */   
/*     */   public void setRetryInhibitionMinutes(int retryInhibitionMinutes) {
/*  94 */     this.retryInhibitionMinutes = retryInhibitionMinutes;
/*     */   }
/*     */   
/*     */   public int getMaxTries() {
/*  98 */     return replaceWithTextOverride("maxTries", this.maxTries);
/*     */   }
/*     */   
/*     */   public void setMaxTries(int maxTries) {
/* 102 */     this.maxTries = maxTries;
/*     */   }
/*     */   
/*     */   public int getMaxCancelCount() {
/* 106 */     return replaceWithTextOverride("maxCancelCount", this.maxCancelCount);
/*     */   }
/*     */   
/*     */   public void setMaxCancelCount(int maxCancelCount) {
/* 110 */     this.maxCancelCount = maxCancelCount;
/*     */   }
/*     */   
/*     */   public String[] getArguments() {
/* 114 */     return (String[])replaceWithTextOverride("arguments", replaceVariables(this.arguments), String[].class);
/*     */   }
/*     */   
/*     */   public void setArguments(String[] arguments) {
/* 118 */     this.arguments = arguments;
/*     */   }
/*     */   
/*     */   public File getInstallerFile() {
/* 122 */     return (File)replaceWithTextOverride("installerFile", replaceVariables(this.installerFile), File.class);
/*     */   }
/*     */   
/*     */   public void setInstallerFile(File installerFile) {
/* 126 */     this.installerFile = installerFile;
/*     */   }
/*     */   
/*     */   public String getVersion() {
/* 130 */     return replaceVariables(replaceVariables(this.version));
/*     */   }
/*     */   
/*     */   public void setVersion(String version) {
/* 134 */     this.version = version;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isRollbackSupported() {
/* 139 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\action\\update\ScheduleUpdateAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */