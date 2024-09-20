/*     */ package com.install4j.runtime.installer;
/*     */ import com.install4j.api.actions.Action;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.api.beans.LocalizedExternalFile;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.FileSetSetup;
/*     */ import com.install4j.api.context.InstallationComponentSetup;
/*     */ import com.install4j.api.context.LauncherSetup;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.RemoteCallable;
/*     */ import com.install4j.api.context.WizardContext;
/*     */ import com.install4j.api.events.InstallerEventListener;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import java.io.File;
/*     */ import java.io.Serializable;
/*     */ import java.util.Collection;
/*     */ import java.util.MissingResourceException;
/*     */ 
/*     */ public class ContextProxy implements Context, Serializable {
/*     */   public ContextProxy(Context parentContext) {
/*  23 */     this.parentContext = parentContext;
/*     */   }
/*     */   private Context parentContext;
/*     */   public Context getParentContext() {
/*  27 */     return this.parentContext;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getLanguageId() {
/*  32 */     return this.parentContext.getLanguageId();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getMessage(String key) throws MissingResourceException {
/*  37 */     return this.parentContext.getMessage(key);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getMessage(String key, Object... arguments) throws MissingResourceException {
/*  42 */     return this.parentContext.getMessage(key, arguments);
/*     */   }
/*     */ 
/*     */   
/*     */   public File getInstallationDirectory() {
/*  47 */     return this.parentContext.getInstallationDirectory();
/*     */   }
/*     */ 
/*     */   
/*     */   public File getDefaultInstallationDirectory() {
/*  52 */     return this.parentContext.getDefaultInstallationDirectory();
/*     */   }
/*     */ 
/*     */   
/*     */   public File getContentDirectory() {
/*  57 */     return this.parentContext.getContentDirectory();
/*     */   }
/*     */ 
/*     */   
/*     */   public File getResourceDirectory() {
/*  62 */     return this.parentContext.getResourceDirectory();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUnattended() {
/*  67 */     return this.parentContext.isUnattended();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isConsole() {
/*  72 */     return this.parentContext.isConsole();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isGui() {
/*  77 */     return this.parentContext.isGui();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isArchive() {
/*  82 */     return this.parentContext.isArchive();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getApplicationId() {
/*  87 */     return this.parentContext.getApplicationId();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAddOnApplicationId() {
/*  92 */     return this.parentContext.getAddOnApplicationId();
/*     */   }
/*     */ 
/*     */   
/*     */   public void addInstallerEventListener(InstallerEventListener listener) {
/*  97 */     this.parentContext.addInstallerEventListener(listener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeInstallerEventListener(InstallerEventListener listener) {
/* 102 */     this.parentContext.removeInstallerEventListener(listener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void gotoScreen(Screen screen) {
/* 107 */     this.parentContext.gotoScreen(screen);
/*     */   }
/*     */ 
/*     */   
/*     */   public void gotoScreen(Screen screen, boolean checkCondition, boolean executeActions) throws NotSupportedInElevationException {
/* 112 */     this.parentContext.gotoScreen(screen, checkCondition, executeActions);
/*     */   }
/*     */ 
/*     */   
/*     */   public Screen getScreenById(String id) {
/* 117 */     return this.parentContext.getScreenById(id);
/*     */   }
/*     */ 
/*     */   
/*     */   public Screen[] getScreens() {
/* 122 */     return this.parentContext.getScreens();
/*     */   }
/*     */ 
/*     */   
/*     */   public Screen[] getScreens(Class screenClass) {
/* 127 */     return this.parentContext.getScreens(screenClass);
/*     */   }
/*     */ 
/*     */   
/*     */   public Screen getFirstScreen(Class screenClass) {
/* 132 */     return this.parentContext.getFirstScreen(screenClass);
/*     */   }
/*     */ 
/*     */   
/*     */   public Action getActionById(String id) {
/* 137 */     return this.parentContext.getActionById(id);
/*     */   }
/*     */ 
/*     */   
/*     */   public Action[] getActions(Screen screen) {
/* 142 */     return this.parentContext.getActions(screen);
/*     */   }
/*     */ 
/*     */   
/*     */   public Action[] getActions(Class<? extends Action> actionClass, Screen screen) {
/* 147 */     return this.parentContext.getActions(actionClass, screen);
/*     */   }
/*     */ 
/*     */   
/*     */   public Action getFirstAction(Class<? extends Action> actionClass, Screen screen) {
/* 152 */     return this.parentContext.getFirstAction(actionClass, screen);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getId(Action action) {
/* 157 */     return this.parentContext.getId(action);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getId(Screen screen) {
/* 162 */     return this.parentContext.getId(screen);
/*     */   }
/*     */ 
/*     */   
/*     */   public WizardContext getWizardContext() {
/* 167 */     return this.parentContext.getWizardContext();
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<FileSetSetup> getFileSets() {
/* 172 */     return this.parentContext.getFileSets();
/*     */   }
/*     */ 
/*     */   
/*     */   public FileSetSetup getFileSetById(String id) {
/* 177 */     return this.parentContext.getFileSetById(id);
/*     */   }
/*     */ 
/*     */   
/*     */   public FileSetSetup getFileSetByName(String name) {
/* 182 */     return this.parentContext.getFileSetByName(name);
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<InstallationComponentSetup> getInstallationComponents() {
/* 187 */     return this.parentContext.getInstallationComponents();
/*     */   }
/*     */ 
/*     */   
/*     */   public InstallationComponentSetup getInstallationComponentById(String id) {
/* 192 */     return this.parentContext.getInstallationComponentById(id);
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<LauncherSetup> getLaunchers() {
/* 197 */     return this.parentContext.getLaunchers();
/*     */   }
/*     */ 
/*     */   
/*     */   public LauncherSetup getLauncherById(String id) {
/* 202 */     return this.parentContext.getLauncherById(id);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isCancelling() {
/* 207 */     return this.parentContext.isCancelling();
/*     */   }
/*     */ 
/*     */   
/*     */   public void cancel() {
/* 212 */     this.parentContext.cancel();
/*     */   }
/*     */ 
/*     */   
/*     */   public void runWithSuspendedActions(Runnable runnable) {
/* 217 */     this.parentContext.runWithSuspendedActions(runnable);
/*     */   }
/*     */ 
/*     */   
/*     */   public void handleCriticalException(Throwable e) {
/* 222 */     this.parentContext.handleCriticalException(e);
/*     */   }
/*     */ 
/*     */   
/*     */   public File getDestinationFile(File archiveFile) {
/* 227 */     return this.parentContext.getDestinationFile(archiveFile);
/*     */   }
/*     */ 
/*     */   
/*     */   public File getDestinationFile(String archivePath) {
/* 232 */     return this.parentContext.getDestinationFile(archivePath);
/*     */   }
/*     */ 
/*     */   
/*     */   public FileInfo getDestinationFileInfo(String archivePath) {
/* 237 */     return this.parentContext.getDestinationFileInfo(archivePath);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getVariable(String variableName) {
/* 242 */     return this.parentContext.getVariable(variableName);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean getBooleanVariable(String variableName) {
/* 247 */     return this.parentContext.getBooleanVariable(variableName);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVariable(String variableName, Object value) {
/* 252 */     this.parentContext.setVariable(variableName, value);
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<String> getVariableNames() {
/* 257 */     return this.parentContext.getVariableNames();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCompilerVariable(String variableName) {
/* 262 */     return this.parentContext.getCompilerVariable(variableName);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object runScript(ScriptProperty scriptProperty, Bean bean, Object... parameters) throws Exception {
/* 267 */     return ContextImpl.runScript(scriptProperty, bean, parameters, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public ProgressInterface getProgressInterface() {
/* 272 */     return this.parentContext.getProgressInterface();
/*     */   }
/*     */ 
/*     */   
/*     */   public void goForward(int numberOfScreens, boolean checkCondition, boolean executeActions) {
/* 277 */     this.parentContext.goForward(numberOfScreens, checkCondition, executeActions);
/*     */   }
/*     */ 
/*     */   
/*     */   public void goBack(int numberOfScreens) {
/* 282 */     this.parentContext.goBack(numberOfScreens);
/*     */   }
/*     */ 
/*     */   
/*     */   public void goBackInHistory(int numberOfScreens) {
/* 287 */     this.parentContext.goBackInHistory(numberOfScreens);
/*     */   }
/*     */ 
/*     */   
/*     */   public void goBackInHistory(Screen targetScreen) {
/* 292 */     this.parentContext.goBackInHistory(targetScreen);
/*     */   }
/*     */ 
/*     */   
/*     */   public File getExternalFile(ExternalFile externalFile, boolean installedLocation) {
/* 297 */     return this.parentContext.getExternalFile(externalFile, installedLocation);
/*     */   }
/*     */ 
/*     */   
/*     */   public File getExternalFile(LocalizedExternalFile localizedExternalFile, boolean installedLocation) {
/* 302 */     return this.parentContext.getExternalFile(localizedExternalFile, installedLocation);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isErrorOccurred() {
/* 307 */     return this.parentContext.isErrorOccurred();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setErrorOccurred(boolean errorOccurred) {
/* 312 */     this.parentContext.setErrorOccurred(errorOccurred);
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerResponseFileVariable(String variableName) {
/* 317 */     this.parentContext.registerResponseFileVariable(variableName);
/*     */   }
/*     */ 
/*     */   
/*     */   public void unregisterResponseFileVariable(String variableName) {
/* 322 */     this.parentContext.unregisterResponseFileVariable(variableName);
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerResponseFileComment(String variableName, String comment) {
/* 327 */     this.parentContext.registerResponseFileComment(variableName, comment);
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerHiddenVariable(String variableName) {
/* 332 */     this.parentContext.registerHiddenVariable(variableName);
/*     */   }
/*     */ 
/*     */   
/*     */   public void triggerReboot(boolean askUser) {
/* 337 */     this.parentContext.triggerReboot(askUser);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isRebootRequired() {
/* 342 */     return this.parentContext.isRebootRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public void finish(int exitCode) {
/* 347 */     this.parentContext.finish(exitCode);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasBeenElevated() {
/* 352 */     return this.parentContext.hasBeenElevated();
/*     */   }
/*     */ 
/*     */   
/*     */   public Serializable runElevated(RemoteCallable remoteCallable, boolean alwaysExecute) {
/* 357 */     return this.parentContext.runElevated(remoteCallable, alwaysExecute);
/*     */   }
/*     */ 
/*     */   
/*     */   public Serializable runUnelevated(RemoteCallable remoteCallable) {
/* 362 */     return this.parentContext.runUnelevated(remoteCallable);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initializeLazilyCreatedScreens() {
/* 367 */     this.parentContext.initializeLazilyCreatedScreens();
/*     */   }
/*     */ 
/*     */   
/*     */   public void addToClassPath(File file) {
/* 372 */     this.parentContext.addToClassPath(file);
/*     */   }
/*     */ 
/*     */   
/*     */   public String[] getExtraCommandLineArguments() {
/* 377 */     return this.parentContext.getExtraCommandLineArguments();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getMediaFileId() {
/* 382 */     return this.parentContext.getMediaFileId();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getVersion() {
/* 387 */     return this.parentContext.getVersion();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getApplicationName() {
/* 392 */     return this.parentContext.getApplicationName();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\ContextProxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */