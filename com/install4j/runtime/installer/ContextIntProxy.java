/*     */ package com.install4j.runtime.installer;
/*     */ 
/*     */ import com.install4j.api.beans.ActionList;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.FileInfo;
/*     */ import com.install4j.api.context.RemoteCallable;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.events.InstallerEvent;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.runtime.installer.config.AbstractBeanConfig;
/*     */ import com.install4j.runtime.installer.helper.InstallationProperties;
/*     */ import java.io.File;
/*     */ import java.util.List;
/*     */ 
/*     */ public class ContextIntProxy
/*     */   extends ContextProxy
/*     */   implements ContextInt {
/*     */   private final ContextInt contextInt;
/*     */   
/*     */   public ContextIntProxy(ContextInt parentContext) {
/*  22 */     super(parentContext);
/*  23 */     this.contextInt = parentContext;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean runBooleanActivityWithFallback(RemoteCallable remoteCallable) {
/*  28 */     return this.contextInt.runBooleanActivityWithFallback(remoteCallable);
/*     */   }
/*     */ 
/*     */   
/*     */   public <T extends com.install4j.api.actions.Action> List<T> getExecutableActionsStartingFrom(Class<T> actionClass, Screen screen) {
/*  33 */     return this.contextInt.getExecutableActionsStartingFrom(actionClass, screen);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getEventSource() {
/*  38 */     return this.contextInt.getEventSource();
/*     */   }
/*     */ 
/*     */   
/*     */   public void fireInstallerEvent(InstallerEvent event) {
/*  43 */     this.contextInt.fireInstallerEvent(event);
/*     */   }
/*     */ 
/*     */   
/*     */   public Context getIdWrapperContext(AbstractBeanConfig beanConfig) {
/*  48 */     return this.contextInt.getIdWrapperContext(beanConfig);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean runBooleanScript(String className, Bean bean, Object... parameters) {
/*  53 */     return this.contextInt.runBooleanScript(className, bean, parameters);
/*     */   }
/*     */ 
/*     */   
/*     */   public File getRuntimeDirectory() {
/*  58 */     return this.contextInt.getRuntimeDirectory();
/*     */   }
/*     */ 
/*     */   
/*     */   public InstallationProperties getInstallationProperties() {
/*  63 */     return this.contextInt.getInstallationProperties();
/*     */   }
/*     */ 
/*     */   
/*     */   public File getAdditionalUserJarsDir() {
/*  68 */     return this.contextInt.getAdditionalUserJarsDir();
/*     */   }
/*     */ 
/*     */   
/*     */   public FileInfo getDestinationFileInfo(String archivePath, boolean resolveInSingleBundle) {
/*  73 */     return this.contextInt.getDestinationFileInfo(archivePath, resolveInSingleBundle);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean executeActionListSync(ActionList actionList, Object... extraScriptParameters) throws UserCanceledException {
/*  78 */     return this.contextInt.executeActionListSync(actionList, extraScriptParameters);
/*     */   }
/*     */ 
/*     */   
/*     */   public void executeActionListAsync(ActionList actionList, Object... extraScriptParameters) {
/*  83 */     this.contextInt.executeActionListAsync(actionList, extraScriptParameters);
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollbackActionList(ActionList actionList) {
/*  88 */     this.contextInt.rollbackActionList(actionList);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object[] getExtraScriptParameters() {
/*  93 */     return this.contextInt.getExtraScriptParameters();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setExtraScriptParameters(Object... extraScriptParameters) {
/*  98 */     this.contextInt.setExtraScriptParameters(extraScriptParameters);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCurrentActionId(String id) {
/* 103 */     this.contextInt.setCurrentActionId(id);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCurrentActionId() {
/* 108 */     return this.contextInt.getCurrentActionId();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\ContextIntProxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */