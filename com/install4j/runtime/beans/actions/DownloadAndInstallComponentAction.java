/*     */ package com.install4j.runtime.beans.actions;
/*     */ 
/*     */ import com.exe4j.runtime.util.ReadIOException;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.config.ComponentConfig;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.frontend.NoPercentageProgressDelegate;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.content.ContentInstaller;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import java.io.IOException;
/*     */ import java.util.Objects;
/*     */ 
/*     */ 
/*     */ public class DownloadAndInstallComponentAction
/*     */   extends AbstractInstallFilesAction
/*     */ {
/*  20 */   private String componentId = "";
/*     */   private boolean showProgress = true;
/*     */   private boolean installInSingleBundle = true;
/*     */   
/*     */   public String getComponentId() {
/*  25 */     return replaceVariables(replaceVariables(this.componentId));
/*     */   }
/*     */   
/*     */   public void setComponentId(String componentId) {
/*  29 */     this.componentId = componentId;
/*     */   }
/*     */   
/*     */   public boolean isShowProgress() {
/*  33 */     return replaceWithTextOverride("showProgress", this.showProgress);
/*     */   }
/*     */   
/*     */   public void setShowProgress(boolean showProgress) {
/*  37 */     this.showProgress = showProgress;
/*     */   }
/*     */   
/*     */   public boolean isInstallInSingleBundle() {
/*  41 */     return replaceWithTextOverride("installInSingleBundle", this.installInSingleBundle);
/*     */   }
/*     */   
/*     */   public void setInstallInSingleBundle(boolean installInSingleBundle) {
/*  45 */     this.installInSingleBundle = installInSingleBundle;
/*     */   }
/*     */   
/*     */   protected ProgressInterface getProgressInterface(InstallerContext context) {
/*     */     NoPercentageProgressDelegate noPercentageProgressDelegate;
/*  50 */     ProgressInterface progressInterface = super.getProgressInterface(context);
/*  51 */     if (!isShowProgress()) {
/*  52 */       noPercentageProgressDelegate = new NoPercentageProgressDelegate(progressInterface);
/*     */     }
/*  54 */     return (ProgressInterface)noPercentageProgressDelegate;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/*  59 */     ProgressInterface progressInterface = getProgressInterface(context);
/*     */     
/*     */     try {
/*  62 */       FileInstaller.getInstance().setLogDir(context.getDestinationFile(".install4j"));
/*  63 */       FileInstaller.getInstance().resetCurrentRebootRequired();
/*     */       
/*  65 */       String componentId = getInternalComponentId();
/*     */       try {
/*  67 */         ContentInstaller.getInstance().doComponentInstallation(context, progressInterface, componentId, isInstallInSingleBundle(), this);
/*  68 */       } catch (ReadIOException e) {
/*  69 */         Logger.getInstance().error(this, "content corrupted.");
/*  70 */         Logger.getInstance().log(e.getCause());
/*  71 */         return false;
/*  72 */       } catch (UserCanceledException e) {
/*  73 */         if (context.isCancelling()) {
/*  74 */           throw e;
/*     */         }
/*  76 */         return false;
/*     */       } finally {
/*  78 */         if (isTriggerReboot() && isDelay() && FileInstaller.getInstance().isCurrentRebootRequired()) {
/*  79 */           context.triggerReboot(true);
/*     */         }
/*     */       } 
/*     */       
/*  83 */       if (context.isCancelling()) {
/*  84 */         throw new UserCanceledException();
/*     */       }
/*     */     }
/*  87 */     catch (IOException e) {
/*  88 */       context.handleCriticalException(e);
/*  89 */       return false;
/*     */     } 
/*  91 */     progressInterface.setDetailMessage("");
/*  92 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private String getInternalComponentId() {
/*  97 */     String componentId = getComponentId();
/*  98 */     for (ComponentConfig componentConfig : InstallerConfig.getCurrentInstance().getComponents()) {
/*  99 */       if (Objects.equals(componentConfig.getCustomizedId(), componentId)) {
/* 100 */         return componentConfig.getId();
/*     */       }
/*     */     } 
/* 103 */     return componentId;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\DownloadAndInstallComponentAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */