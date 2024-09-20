/*     */ package com.install4j.runtime.installer.helper.comm.impl;
/*     */ import com.install4j.api.actions.Action;
/*     */ import com.install4j.api.beans.ActionList;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.FileInfo;
/*     */ import com.install4j.api.context.FileSetSetup;
/*     */ import com.install4j.api.context.InstallationComponentSetup;
/*     */ import com.install4j.api.context.LauncherSetup;
/*     */ import com.install4j.api.context.RemoteCallable;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.events.InstallerEvent;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.helper.InstallationProperties;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchStringAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import java.io.File;
/*     */ import java.util.Collection;
/*     */ 
/*     */ public abstract class HelperContextImpl implements ContextInt, Serializable {
/*  29 */   private transient HelperProgressInterface progressInterface = new HelperProgressInterface();
/*  30 */   protected transient HelperCommunication helperCommunication = HelperCommunication.getInstance();
/*     */ 
/*     */   
/*     */   public String getLanguageId() {
/*  34 */     return this.helperCommunication.fetchString(ExecutionContext.UNELEVATED, new FetchStringAction()
/*     */         {
/*     */           protected String fetchValue(Context context) {
/*  37 */             return context.getLanguageId();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public String getMessage(final String key) throws MissingResourceException {
/*  44 */     return this.helperCommunication.fetchString(ExecutionContext.UNELEVATED, new FetchStringAction()
/*     */         {
/*     */           protected String fetchValue(Context context) {
/*  47 */             return context.getMessage(key);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public String getMessage(final String key, Object... arguments) throws MissingResourceException {
/*  54 */     return this.helperCommunication.fetchString(ExecutionContext.UNELEVATED, new FetchStringAction()
/*     */         {
/*     */           protected String fetchValue(Context context) {
/*  57 */             return context.getMessage(key, arguments);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public File getInstallationDirectory() {
/*  64 */     return (File)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<File>()
/*     */         {
/*     */           protected File fetchValue(Context context) {
/*  67 */             return context.getInstallationDirectory();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public File getDefaultInstallationDirectory() {
/*  74 */     return (File)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<File>()
/*     */         {
/*     */           protected File fetchValue(Context context) {
/*  77 */             return context.getDefaultInstallationDirectory();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public File getContentDirectory() {
/*  84 */     return (File)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<File>()
/*     */         {
/*     */           protected File fetchValue(Context context) {
/*  87 */             return context.getContentDirectory();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isArchive() {
/*  94 */     return this.helperCommunication.fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) {
/*  97 */             return context.isArchive();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public File getResourceDirectory() {
/* 104 */     return (File)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<File>()
/*     */         {
/*     */           protected File fetchValue(Context context) {
/* 107 */             return context.getResourceDirectory();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUnattended() {
/* 114 */     return InstallerUtil.isUnattended();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isConsole() {
/* 119 */     return InstallerUtil.isConsole();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isGui() {
/* 124 */     return (!InstallerUtil.isConsole() && !InstallerUtil.isUnattended());
/*     */   }
/*     */ 
/*     */   
/*     */   public String getApplicationId() {
/* 129 */     return this.helperCommunication.fetchString(ExecutionContext.UNELEVATED, new FetchStringAction()
/*     */         {
/*     */           protected String fetchValue(Context context) {
/* 132 */             return context.getApplicationId();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAddOnApplicationId() {
/* 139 */     return this.helperCommunication.fetchString(ExecutionContext.UNELEVATED, new FetchStringAction()
/*     */         {
/*     */           protected String fetchValue(Context context) {
/* 142 */             return context.getAddOnApplicationId();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void addInstallerEventListener(InstallerEventListener listener) {
/* 149 */     HelperCommunication.helperUnsupported();
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeInstallerEventListener(InstallerEventListener listener) {
/* 154 */     HelperCommunication.helperUnsupported();
/*     */   }
/*     */ 
/*     */   
/*     */   public void gotoScreen(Screen screen) {
/* 159 */     HelperCommunication.helperUnsupported();
/*     */   }
/*     */ 
/*     */   
/*     */   public void gotoScreen(Screen screen, boolean checkCondition, boolean executeActions) throws NotSupportedInElevationException {
/* 164 */     HelperCommunication.helperUnsupported();
/*     */   }
/*     */ 
/*     */   
/*     */   public Screen getScreenById(String id) {
/* 169 */     HelperCommunication.helperUnsupported();
/* 170 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Screen[] getScreens() {
/* 175 */     HelperCommunication.helperUnsupported();
/* 176 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Screen[] getScreens(Class screenClass) {
/* 181 */     HelperCommunication.helperUnsupported();
/* 182 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Screen getFirstScreen(Class screenClass) {
/* 187 */     HelperCommunication.helperUnsupported();
/* 188 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Action getActionById(String id) {
/* 193 */     HelperCommunication.helperUnsupported();
/* 194 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Action[] getActions(Screen screen) {
/* 199 */     HelperCommunication.helperUnsupported();
/* 200 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Action[] getActions(Class actionClass, Screen screen) {
/* 205 */     HelperCommunication.helperUnsupported();
/* 206 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Action getFirstAction(Class<? extends Action> actionClass, Screen screen) {
/* 211 */     HelperCommunication.helperUnsupported();
/* 212 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getId(Action action) {
/* 217 */     HelperCommunication.helperUnsupported();
/* 218 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getId(Screen screen) {
/* 223 */     HelperCommunication.helperUnsupported();
/* 224 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public WizardContext getWizardContext() {
/* 229 */     HelperCommunication.helperUnsupported();
/* 230 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<FileSetSetup> getFileSets() {
/* 235 */     return (Collection<FileSetSetup>)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<Collection<FileSetSetup>>()
/*     */         {
/*     */           protected Collection<FileSetSetup> fetchValue(Context context) {
/* 238 */             return context.getFileSets();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public FileSetSetup getFileSetById(final String id) {
/* 245 */     return (FileSetSetup)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<FileSetSetup>()
/*     */         {
/*     */           protected FileSetSetup fetchValue(Context context) {
/* 248 */             return context.getFileSetById(id);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public FileSetSetup getFileSetByName(final String name) {
/* 255 */     return (FileSetSetup)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<FileSetSetup>()
/*     */         {
/*     */           protected FileSetSetup fetchValue(Context context) {
/* 258 */             return context.getFileSetByName(name);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<InstallationComponentSetup> getInstallationComponents() {
/* 265 */     Collection<InstallationComponentSetup> remoteComponents = (Collection<InstallationComponentSetup>)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<Collection<InstallationComponentSetup>>()
/*     */         {
/*     */           protected Collection<InstallationComponentSetup> fetchValue(Context context) {
/* 268 */             return context.getInstallationComponents();
/*     */           }
/*     */         });
/* 271 */     Collection<InstallationComponentSetup> ret = new ArrayList<>(remoteComponents.size());
/* 272 */     for (InstallationComponentSetup componentCopy : remoteComponents) {
/* 273 */       ret.add(new HelperInstallationComponentSetup(componentCopy));
/*     */     }
/*     */     
/* 276 */     return ret;
/*     */   }
/*     */ 
/*     */   
/*     */   public InstallationComponentSetup getInstallationComponentById(final String id) {
/* 281 */     InstallationComponentSetup componentCopy = (InstallationComponentSetup)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<InstallationComponentSetup>()
/*     */         {
/*     */           protected InstallationComponentSetup fetchValue(Context context) {
/* 284 */             return context.getInstallationComponentById(id);
/*     */           }
/*     */         });
/* 287 */     if (componentCopy == null) {
/* 288 */       return null;
/*     */     }
/* 290 */     return new HelperInstallationComponentSetup(componentCopy);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Collection<LauncherSetup> getLaunchers() {
/* 296 */     return (Collection<LauncherSetup>)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<Collection<LauncherSetup>>()
/*     */         {
/*     */           protected Collection<LauncherSetup> fetchValue(Context context) {
/* 299 */             return context.getLaunchers();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public LauncherSetup getLauncherById(final String id) {
/* 306 */     return (LauncherSetup)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<LauncherSetup>()
/*     */         {
/*     */           protected LauncherSetup fetchValue(Context context) {
/* 309 */             return context.getLauncherById(id);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isCancelling() {
/* 316 */     return ContextImpl.isCancellingInt();
/*     */   }
/*     */ 
/*     */   
/*     */   public void cancel() {
/* 321 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 324 */             context.cancel();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void runWithSuspendedActions(Runnable runnable) {
/* 331 */     ContextImpl.runWithSuspendedActionsInt(runnable);
/*     */   }
/*     */ 
/*     */   
/*     */   public void handleCriticalException(final Throwable e) {
/* 336 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 339 */             context.handleCriticalException(e);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public File getDestinationFile(final File archiveFile) {
/* 346 */     return (File)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<File>()
/*     */         {
/*     */           protected File fetchValue(Context context) {
/* 349 */             return context.getDestinationFile(archiveFile);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public File getDestinationFile(final String archivePath) {
/* 356 */     return (File)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<File>()
/*     */         {
/*     */           protected File fetchValue(Context context) {
/* 359 */             return context.getDestinationFile(archivePath);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public FileInfo getDestinationFileInfo(final String archivePath, final boolean resolveInSingleBundle) {
/* 366 */     return (FileInfo)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<FileInfo>()
/*     */         {
/*     */           protected FileInfo fetchValue(Context context) {
/* 369 */             return ContextImpl.getContextInt(context).getDestinationFileInfo(archivePath, resolveInSingleBundle);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public FileInfo getDestinationFileInfo(final String archivePath) {
/* 376 */     return (FileInfo)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<FileInfo>()
/*     */         {
/*     */           protected FileInfo fetchValue(Context context) {
/* 379 */             return context.getDestinationFileInfo(archivePath);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getVariable(String variableName) {
/* 386 */     return InstallerVariables.getVariable(variableName);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean getBooleanVariable(String variableName) {
/* 391 */     return Objects.equals(Boolean.TRUE, getVariable(variableName));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVariable(String variableName, Object value) {
/* 396 */     InstallerVariables.setVariable(variableName, value);
/* 397 */     variableChanged(variableName);
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<String> getVariableNames() {
/* 402 */     return InstallerVariables.getVariableNames();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCompilerVariable(final String variableName) {
/* 407 */     return this.helperCommunication.fetchString(ExecutionContext.UNELEVATED, new FetchStringAction()
/*     */         {
/*     */           protected String fetchValue(Context context) {
/* 410 */             return context.getCompilerVariable(variableName);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   protected void variableChanged(String variableName) {
/* 416 */     fireInstallerEvent((InstallerEvent)new InstallerVariableEvent(this, (Context)this, variableName));
/*     */   }
/*     */ 
/*     */   
/*     */   public Object runScript(ScriptProperty scriptProperty, Bean bean, Object... parameters) throws Exception {
/* 421 */     return ContextImpl.runScript(scriptProperty, bean, parameters, (Context)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public ProgressInterface getProgressInterface() {
/* 426 */     return this.progressInterface;
/*     */   }
/*     */ 
/*     */   
/*     */   public void goForward(int numberOfScreens, boolean checkCondition, boolean executeActions) {
/* 431 */     HelperCommunication.helperUnsupported();
/*     */   }
/*     */ 
/*     */   
/*     */   public void goBack(int numberOfScreens) {
/* 436 */     HelperCommunication.helperUnsupported();
/*     */   }
/*     */ 
/*     */   
/*     */   public void goBackInHistory(int numberOfScreens) {
/* 441 */     HelperCommunication.helperUnsupported();
/*     */   }
/*     */ 
/*     */   
/*     */   public void goBackInHistory(Screen targetScreen) {
/* 446 */     HelperCommunication.helperUnsupported();
/*     */   }
/*     */ 
/*     */   
/*     */   public File getExternalFile(final ExternalFile externalFile, final boolean installedLocation) {
/* 451 */     return (File)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<File>()
/*     */         {
/*     */           protected File fetchValue(Context context) {
/* 454 */             return context.getExternalFile(externalFile, installedLocation);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public File getExternalFile(final LocalizedExternalFile localizedExternalFile, final boolean installedLocation) {
/* 461 */     return (File)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<File>()
/*     */         {
/*     */           protected File fetchValue(Context context) {
/* 464 */             return context.getExternalFile(localizedExternalFile, installedLocation);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isErrorOccurred() {
/* 471 */     return this.helperCommunication.fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws UserCanceledException {
/* 474 */             return context.isErrorOccurred();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void setErrorOccurred(final boolean errorOccurred) {
/* 481 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 484 */             context.setErrorOccurred(errorOccurred);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerResponseFileVariable(final String variableName) {
/* 491 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 494 */             context.registerResponseFileVariable(variableName);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void unregisterResponseFileVariable(final String variableName) {
/* 501 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 504 */             context.unregisterResponseFileVariable(variableName);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerResponseFileComment(final String variableName, final String comment) {
/* 511 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 514 */             context.registerResponseFileComment(variableName, comment);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerHiddenVariable(final String variableName) {
/* 521 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 524 */             context.registerHiddenVariable(variableName);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void triggerReboot(final boolean askUser) {
/* 531 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 534 */             context.triggerReboot(askUser);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isRebootRequired() {
/* 541 */     return this.helperCommunication.fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws UserCanceledException {
/* 544 */             return context.isRebootRequired();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void finish(int exitCode) {
/* 551 */     throw new FinishError(exitCode);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasBeenElevated() {
/* 556 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Serializable runElevated(RemoteCallable remoteCallable, boolean alwaysExecute) {
/* 561 */     return remoteCallable.execute();
/*     */   }
/*     */ 
/*     */   
/*     */   public Serializable runUnelevated(RemoteCallable remoteCallable) {
/* 566 */     return ContextImpl.runUnelevatedInt(remoteCallable, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initializeLazilyCreatedScreens() {
/* 571 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 574 */             context.initializeLazilyCreatedScreens();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void addToClassPath(File file) {
/* 581 */     Install4jClassLoader.addClassPath(file);
/*     */   }
/*     */ 
/*     */   
/*     */   public String[] getExtraCommandLineArguments() {
/* 586 */     return (String[])this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<String[]>()
/*     */         {
/*     */           protected String[] fetchValue(Context context) throws UserCanceledException {
/* 589 */             return context.getExtraCommandLineArguments();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public String getMediaFileId() {
/* 596 */     return this.helperCommunication.fetchString(ExecutionContext.UNELEVATED, new FetchStringAction()
/*     */         {
/*     */           protected String fetchValue(Context context) throws UserCanceledException {
/* 599 */             return context.getMediaFileId();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public String getVersion() {
/* 606 */     return this.helperCommunication.fetchString(ExecutionContext.UNELEVATED, new FetchStringAction()
/*     */         {
/*     */           protected String fetchValue(Context context) throws UserCanceledException {
/* 609 */             return context.getVersion();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean runBooleanActivityWithFallback(RemoteCallable remoteCallable) {
/* 616 */     return ((Boolean)remoteCallable.execute()).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public <T extends Action> List<T> getExecutableActionsStartingFrom(Class<T> actionClass, Screen screen) {
/* 621 */     HelperCommunication.helperUnsupported();
/* 622 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getEventSource() {
/* 627 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public void fireInstallerEvent(final InstallerEvent event) {
/* 632 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 635 */             if (event.getContext() == null) {
/* 636 */               event.setContext(context);
/*     */             }
/* 638 */             ContextImpl.getContextInt(context).fireInstallerEvent(event);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public Context getIdWrapperContext(AbstractBeanConfig beanConfig) {
/* 645 */     HelperCommunication.helperUnsupported();
/* 646 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean runBooleanScript(String className, Bean bean, Object... parameters) {
/* 651 */     return ContextImpl.runBooleanScript((Context)this, new ScriptProperty(className), bean, parameters);
/*     */   }
/*     */ 
/*     */   
/*     */   public File getRuntimeDirectory() {
/* 656 */     return (File)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<File>()
/*     */         {
/*     */           protected File fetchValue(Context context) throws UserCanceledException {
/* 659 */             return ContextImpl.getContextInt(context).getRuntimeDirectory();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public InstallationProperties getInstallationProperties() {
/* 666 */     return (InstallationProperties)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<InstallationProperties>()
/*     */         {
/*     */           protected InstallationProperties fetchValue(Context context) throws UserCanceledException {
/* 669 */             return ContextImpl.getContextInt(context).getInstallationProperties();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean executeActionListSync(final ActionList actionList, Object... extraScriptParameters) throws UserCanceledException {
/*     */     try {
/* 677 */       return this.helperCommunication.fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */           {
/*     */             protected boolean fetchValue(Context context) throws Exception {
/* 680 */               return ContextImpl.getContextInt(context).executeActionListSync(actionList, extraScriptParameters);
/*     */             }
/*     */           });
/* 683 */     } catch (RuntimeException e) {
/* 684 */       if (e.getCause() instanceof UserCanceledException) {
/* 685 */         throw (UserCanceledException)e.getCause();
/*     */       }
/* 687 */       throw e;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void executeActionListAsync(final ActionList actionList, Object... extraScriptParameters) {
/* 694 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) throws Exception {
/* 697 */             ContextImpl.getContextInt(context).executeActionListAsync(actionList, extraScriptParameters);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollbackActionList(final ActionList actionList) {
/* 704 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) throws Exception {
/* 707 */             ContextImpl.getContextInt(context).executeActionListSync(actionList, new Object[0]);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public Object[] getExtraScriptParameters() {
/* 714 */     return (Object[])this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<Object[]>()
/*     */         {
/*     */           protected Object[] fetchValue(Context context) throws Exception {
/* 717 */             return ContextImpl.getContextInt(context).getExtraScriptParameters();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtraScriptParameters(Object... extraScriptParameters) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCurrentActionId(final String id) {
/* 729 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) throws Exception {
/* 732 */             ContextImpl.getContextInt(context).setCurrentActionId(id);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCurrentActionId() {
/* 739 */     return (String)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<String>()
/*     */         {
/*     */           protected String fetchValue(Context context) throws Exception {
/* 742 */             return ContextImpl.getContextInt(context).getCurrentActionId();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public String getApplicationName() {
/* 749 */     return this.helperCommunication.fetchString(ExecutionContext.UNELEVATED, new FetchStringAction()
/*     */         {
/*     */           protected String fetchValue(Context context) throws UserCanceledException {
/* 752 */             return context.getApplicationName();
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\impl\HelperContextImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */