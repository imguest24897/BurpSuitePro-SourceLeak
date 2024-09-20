/*      */ package com.install4j.runtime.installer;
/*      */ import com.exe4j.runtime.util.WinDel;
/*      */ import com.install4j.api.Util;
/*      */ import com.install4j.api.actions.Action;
/*      */ import com.install4j.api.beans.ActionList;
/*      */ import com.install4j.api.beans.Bean;
/*      */ import com.install4j.api.beans.ExternalFile;
/*      */ import com.install4j.api.beans.ScriptProperty;
/*      */ import com.install4j.api.context.Context;
/*      */ import com.install4j.api.context.FileSetSetup;
/*      */ import com.install4j.api.context.ProgressInterface;
/*      */ import com.install4j.api.context.RemoteCallable;
/*      */ import com.install4j.api.context.UserCanceledException;
/*      */ import com.install4j.api.events.EventType;
/*      */ import com.install4j.api.events.InstallerEvent;
/*      */ import com.install4j.api.events.InstallerEventListener;
/*      */ import com.install4j.api.screens.Screen;
/*      */ import com.install4j.runtime.beans.groups.ControlFlowGroup;
/*      */ import com.install4j.runtime.beans.groups.Group;
/*      */ import com.install4j.runtime.installer.config.AbstractBeanConfig;
/*      */ import com.install4j.runtime.installer.config.ActionBeanConfig;
/*      */ import com.install4j.runtime.installer.config.ComponentConfig;
/*      */ import com.install4j.runtime.installer.config.FilesetConfig;
/*      */ import com.install4j.runtime.installer.config.GroupBeanConfig;
/*      */ import com.install4j.runtime.installer.config.InstallerConfig;
/*      */ import com.install4j.runtime.installer.config.LauncherConfig;
/*      */ import com.install4j.runtime.installer.config.ScreenBeanConfig;
/*      */ import com.install4j.runtime.installer.controller.ControllerCommand;
/*      */ import com.install4j.runtime.installer.frontend.Messages;
/*      */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*      */ import com.install4j.runtime.installer.helper.Logger;
/*      */ import com.install4j.runtime.installer.helper.applaunch.ProgressCommunication;
/*      */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*      */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*      */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*      */ import java.io.File;
/*      */ import java.io.Serializable;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collection;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Objects;
/*      */ 
/*      */ public abstract class ContextImpl implements ContextInt {
/*      */   protected ScreenExecutor screenExecutor;
/*      */   
/*      */   public static ContextInt getContextInt(Context context) {
/*   48 */     if (context instanceof ContextInt)
/*   49 */       return (ContextInt)context; 
/*   50 */     if (context instanceof IdWrapperContext) {
/*   51 */       return ((IdWrapperContext)context).getParentContext();
/*      */     }
/*   53 */     return null;
/*      */   }
/*      */   private InstallerConfig config;
/*      */   
/*      */   public static boolean runBooleanScript(Context context, ScriptProperty scriptProperty, Bean bean, Object... parameters) {
/*      */     try {
/*   59 */       Boolean aBoolean = (Boolean)context.runScript(scriptProperty, bean, parameters);
/*   60 */       if (aBoolean == null) {
/*   61 */         return true;
/*      */       }
/*   63 */       return aBoolean.booleanValue();
/*      */     }
/*   65 */     catch (Exception e) {
/*   66 */       Util.printAnnotatedStackTrace(e);
/*   67 */       Logger.getInstance().log(e);
/*   68 */       return false;
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void runWithSuspendedActionsInt(Runnable runnable) {
/*   73 */     setAskingForCancel(true);
/*      */     try {
/*   75 */       runnable.run();
/*      */     } finally {
/*   77 */       setAskingForCancel(false);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   85 */   private List<FileSetSetupImpl> fileSetSetups = new ArrayList<>();
/*   86 */   private List<InstallationComponentSetupImpl> installationComponentSetups = new ArrayList<>();
/*   87 */   private List<LauncherSetupImpl> launcherSetups = new ArrayList<>();
/*      */   
/*      */   private String languageId;
/*      */   
/*      */   private boolean languageInitialized = false;
/*      */   
/*      */   private InstallationProperties installationProperties;
/*      */   
/*      */   protected static boolean cancelling = false;
/*      */   
/*      */   private static boolean askingForCancel = false;
/*      */   private static ContextInt singleContextInt;
/*      */   private static Context currentContext;
/*  100 */   protected final Set<InstallerEventListener> listeners = new HashSet<>();
/*      */   
/*      */   private Action currentAction;
/*      */   
/*      */   private boolean errorOccurred = false;
/*      */   
/*      */   private boolean shouldReboot = false;
/*      */   
/*      */   private boolean askUserForReboot = true;
/*      */   
/*      */   private List<ScreenBeanConfig> screenConfigsFlat;
/*      */   private Object[] extraScriptParameters;
/*  112 */   private String currentActionId = "";
/*      */ 
/*      */ 
/*      */   
/*      */   public static ContextInt getSingleContextInt() {
/*  117 */     return singleContextInt;
/*      */   }
/*      */   
/*      */   public static void clearContext() {
/*  121 */     singleContextInt = null;
/*  122 */     cancelling = false;
/*  123 */     askingForCancel = false;
/*      */   }
/*      */   
/*      */   public static Context getCurrentContext() {
/*  127 */     return (currentContext == null) ? singleContextInt : currentContext;
/*      */   }
/*      */   
/*      */   public static void setCurrentContext(Context currentContext) {
/*  131 */     ContextImpl.currentContext = currentContext;
/*      */   }
/*      */   
/*      */   public static void setSingleContextInt(ContextInt contextInt) {
/*  135 */     if (singleContextInt != null) {
/*  136 */       throw new UnsupportedOperationException("only one ContextInt can exist");
/*      */     }
/*  138 */     singleContextInt = contextInt;
/*      */   }
/*      */   
/*      */   public ContextImpl(ScreenExecutor screenExecutor) {
/*  142 */     this.screenExecutor = screenExecutor;
/*      */     
/*  144 */     this.config = InstallerConfig.getCurrentInstance();
/*      */     
/*  146 */     List<FilesetConfig> fileSets = this.config.getFilesets();
/*  147 */     for (FilesetConfig filesetConfig : fileSets) {
/*  148 */       FileSetSetupImpl fileSetSetup = new FileSetSetupImpl(filesetConfig);
/*  149 */       this.fileSetSetups.add(fileSetSetup);
/*      */     } 
/*      */     
/*  152 */     List<ComponentConfig> installationComponents = this.config.getComponents();
/*  153 */     for (ComponentConfig componentConfig : installationComponents) {
/*  154 */       InstallationComponentSetupImpl installationComponentSetup = new InstallationComponentSetupImpl(componentConfig);
/*  155 */       this.installationComponentSetups.add(installationComponentSetup);
/*      */     } 
/*      */     
/*  158 */     List<LauncherConfig> launchers = this.config.getLaunchers();
/*  159 */     for (LauncherConfig launcherConfig : launchers) {
/*  160 */       LauncherSetupImpl launcherSetup = new LauncherSetupImpl(launcherConfig);
/*  161 */       this.launcherSetups.add(launcherSetup);
/*      */     } 
/*      */     
/*  164 */     setSingleContextInt(this);
/*  165 */     addInstallerEventListener((InstallerEventListener)Logger.getImpl());
/*      */     
/*  167 */     InstallerVariables.registerVariableProvider("sys.contentDir", new InstallerVariables.ReadOnlyVariableProvider()
/*      */         {
/*      */           public Object getVariable() {
/*  170 */             return ContextImpl.this.getContentDirectory().getPath();
/*      */           }
/*      */         });
/*      */     
/*  174 */     MsiHelper.addMsiVariables(this);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public List<AbstractBeanConfig> getScreenConfigs() {
/*  185 */     return this.config.getApplicationScreens();
/*      */   }
/*      */   
/*      */   public Map<String, AbstractBeanConfig> getId2BeanConfig() {
/*  189 */     return this.config.getCurrentApplicationConfig().getId2BeanConfig();
/*      */   }
/*      */ 
/*      */   
/*      */   public Object[] getExtraScriptParameters() {
/*  194 */     return this.extraScriptParameters;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setExtraScriptParameters(Object... extraScriptParameters) {
/*  199 */     this.extraScriptParameters = extraScriptParameters;
/*      */   }
/*      */ 
/*      */   
/*      */   public Object runScript(ScriptProperty scriptProperty, Bean bean, Object... parameters) throws Exception {
/*  204 */     return runScript(scriptProperty, bean, parameters, this);
/*      */   }
/*      */   
/*      */   public static Object runScript(ScriptProperty scriptProperty, Bean bean, Object[] parameters, Context context) throws Exception {
/*  208 */     if (scriptProperty != null && !Objects.equals(scriptProperty.getValue(), "")) {
/*  209 */       Class<?> scriptClass = Class.forName(scriptProperty.getValue(), true, (ClassLoader)Install4jClassLoader.getInstance());
/*  210 */       return ((Script)scriptClass.newInstance()).evaluate(context, bean, ObjectUtil.concat(singleContextInt.getExtraScriptParameters(), parameters));
/*      */     } 
/*  212 */     return null;
/*      */   }
/*      */   
/*      */   public boolean checkGroupCondition(GroupBeanConfig groupBeanConfig) {
/*  216 */     Group group = groupBeanConfig.getOrInstantiateGroup(false);
/*  217 */     if (group instanceof ControlFlowGroup) {
/*      */       try {
/*  219 */         Object scriptReturn = runScript(((ControlFlowGroup)group).getConditionExpression(), (Bean)group, new Object[0]);
/*  220 */         if (scriptReturn instanceof Boolean) {
/*  221 */           return ((Boolean)scriptReturn).booleanValue();
/*      */         }
/*  223 */         return true;
/*      */       }
/*  225 */       catch (Exception e) {
/*  226 */         InstallerUtil.reportException(e);
/*  227 */         return false;
/*      */       } 
/*      */     }
/*  230 */     return true;
/*      */   }
/*      */   
/*      */   public boolean runBooleanScript(ScriptProperty scriptProperty, Bean bean) {
/*  234 */     if (scriptProperty == null) {
/*  235 */       return false;
/*      */     }
/*  237 */     return runBooleanScript(scriptProperty.getValue(), bean, new Object[0]);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean runBooleanScript(String className, Bean bean, Object... parameters) {
/*  243 */     return runBooleanScript(this, new ScriptProperty(className), bean, parameters);
/*      */   }
/*      */ 
/*      */   
/*      */   public File getDestinationFile(File archiveFile) {
/*  248 */     if (archiveFile == null) {
/*  249 */       return null;
/*      */     }
/*  251 */     return getDestinationFile(archiveFile.getPath());
/*      */   }
/*      */ 
/*      */   
/*      */   public File getDestinationFile(String archivePath) {
/*  256 */     if (archivePath == null) {
/*  257 */       return null;
/*      */     }
/*  259 */     return getDestinationFileInfo(archivePath).getDestinationFile();
/*      */   }
/*      */ 
/*      */   
/*      */   public FileInfo getDestinationFileInfo(String archivePath) {
/*  264 */     return getDestinationFileInfo(archivePath, true);
/*      */   }
/*      */ 
/*      */   
/*      */   public FileInfo getDestinationFileInfo(String archivePath, boolean resolveInSingleBundle) {
/*  269 */     FileInfoImpl fileInfo = new FileInfoImpl();
/*      */     
/*  271 */     fileInfo.relativeFilePath = archivePath;
/*      */     
/*  273 */     if ((new File(archivePath)).isAbsolute()) {
/*  274 */       fileInfo.rootUnresolved = "";
/*  275 */       return fileInfo;
/*  276 */     }  if (Util.isMacosInstaller() && archivePath.startsWith(".install4j")) {
/*  277 */       fileInfo.relativeFilePath = this.config.getMacSpecificConfig().getRuntimeDirParent() + archivePath;
/*  278 */       return fileInfo;
/*      */     } 
/*      */     
/*  281 */     String externalTestName = archivePath;
/*      */     
/*  283 */     if (Objects.equals(this.config.getType(), "macos") && this.config
/*  284 */       .getMacSpecificConfig().isSingleBundle()) {
/*  285 */       String appPrefix = this.config.getMacSpecificConfig().getRuntimeDirParent();
/*  286 */       if (archivePath.startsWith(appPrefix)) {
/*  287 */         externalTestName = archivePath.substring(appPrefix.length());
/*  288 */         if (!resolveInSingleBundle) {
/*  289 */           fileInfo.relativeFilePath = externalTestName;
/*      */         }
/*  291 */       } else if (resolveInSingleBundle && !archivePath.startsWith(this.config.getMacSpecificConfig().getSingleBundleName())) {
/*  292 */         fileInfo.relativeFilePath = (new File(appPrefix, archivePath)).getPath();
/*      */       } 
/*      */     } 
/*      */     
/*  296 */     if (externalTestName.startsWith(".i4j_external_")) {
/*  297 */       int separator = externalTestName.indexOf('/');
/*  298 */       if (separator == -1) {
/*  299 */         separator = externalTestName.indexOf('\\');
/*      */       }
/*  301 */       if (separator != -1) {
/*  302 */         String rootId = externalTestName.substring(".i4j_external_".length(), separator);
/*      */ 
/*      */         
/*  305 */         fileInfo.relativeFilePath = externalTestName.substring(separator + 1);
/*  306 */         RootConfig rootConfig = this.config.getRootById(rootId);
/*  307 */         fileInfo.rootUnresolved = rootConfig.getLocation();
/*      */         
/*  309 */         if (fileInfo.rootUnresolved != null && fileInfo.rootUnresolved.trim().length() == 0 && 
/*  310 */           Objects.equals(this.config.getType(), "macos") && this.config.getMacSpecificConfig().isSingleBundle() && resolveInSingleBundle) {
/*      */           
/*  312 */           String appPrefix = this.config.getMacSpecificConfig().getRuntimeDirParent();
/*  313 */           fileInfo.relativeFilePath = (new File(appPrefix, fileInfo.relativeFilePath)).getPath();
/*      */         } 
/*      */ 
/*      */         
/*  317 */         fileInfo.filesetId = rootConfig.getFileset();
/*  318 */         return fileInfo;
/*      */       } 
/*      */     } 
/*      */     
/*  322 */     return fileInfo;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getLanguageId() {
/*  327 */     if (!this.languageInitialized) {
/*  328 */       this.languageInitialized = true;
/*      */       
/*  330 */       String externalLanguageId = System.getProperty("install4j.language");
/*  331 */       if (externalLanguageId != null)
/*      */       {
/*  333 */         setLanguageId(externalLanguageId);
/*      */       }
/*  335 */       Object var = getVariable("sys.languageId");
/*  336 */       if (var instanceof String) {
/*  337 */         setLanguageId((String)var);
/*      */       }
/*      */       
/*  340 */       InstallerVariables.registerVariableProvider("sys.languageId", new InstallerVariables.VariableProvider()
/*      */           {
/*      */             
/*      */             public Object getVariable()
/*      */             {
/*  345 */               return ContextImpl.this.getLanguageId();
/*      */             }
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*      */             public void setVariable(Object value) {}
/*      */           });
/*  353 */       registerResponseFileVariable("sys.languageId");
/*      */       
/*  355 */       if (this.languageId == null && !InstallerConfig.isInstaller()) {
/*  356 */         String installerLanguage = getInstallerLanguageId();
/*  357 */         if (installerLanguage != null) {
/*  358 */           setLanguageId(installerLanguage);
/*      */         }
/*      */       } 
/*      */     } 
/*  362 */     return this.languageId;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getMessage(String key) throws MissingResourceException {
/*  367 */     return Messages.getString(key);
/*      */   }
/*      */ 
/*      */   
/*      */   public String getMessage(String key, Object... arguments) throws MissingResourceException {
/*  372 */     return Messages.format(Messages.getString(key), arguments);
/*      */   }
/*      */   
/*      */   public void setLanguageId(String languageId) {
/*  376 */     if (this.config.getLanguageById(languageId) == null) {
/*  377 */       throw new RuntimeException("The language \"" + languageId + "\" is not available.");
/*      */     }
/*  379 */     this.languageId = languageId;
/*      */   }
/*      */ 
/*      */   
/*      */   public File getInstallationDirectory() {
/*  384 */     return this.config.getInstallationDirectory(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public File getDefaultInstallationDirectory() {
/*  389 */     return this.config.getDefaultResolvedInstallationDirectory();
/*      */   }
/*      */ 
/*      */   
/*      */   public File getContentDirectory() {
/*  394 */     InstallerConfig config = this.config;
/*  395 */     if (Objects.equals(config.getType(), "macos") && config.getMacSpecificConfig().isSingleBundle()) {
/*  396 */       return new File(getInstallationDirectory(), config.getMacSpecificConfig().getRuntimeDirParent());
/*      */     }
/*  398 */     return getInstallationDirectory();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isArchive() {
/*  404 */     return this.config.isArchive();
/*      */   }
/*      */ 
/*      */   
/*      */   public File getResourceDirectory() {
/*  409 */     return InstallerUtil.getInstallerFile("user");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Collection<LauncherSetup> getLaunchers() {
/*  415 */     return Collections.unmodifiableCollection((Collection)this.launcherSetups);
/*      */   }
/*      */ 
/*      */   
/*      */   public LauncherSetup getLauncherById(String id) {
/*  420 */     for (LauncherSetupImpl launcherSetup : this.launcherSetups) {
/*  421 */       if (launcherSetup.getId().equals(id) || launcherSetup.getInternalId().equals(id)) {
/*  422 */         return launcherSetup;
/*      */       }
/*      */     } 
/*  425 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Collection<FileSetSetup> getFileSets() {
/*  431 */     return Collections.unmodifiableCollection((Collection)this.fileSetSetups);
/*      */   }
/*      */ 
/*      */   
/*      */   public FileSetSetup getFileSetById(String id) {
/*  436 */     for (FileSetSetupImpl fileSetSetup : this.fileSetSetups) {
/*  437 */       if (fileSetSetup.getId().equals(id) || fileSetSetup.getInternalId().equals(id)) {
/*  438 */         return fileSetSetup;
/*      */       }
/*      */     } 
/*  441 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public FileSetSetup getFileSetByName(String name) {
/*  446 */     for (FileSetSetupImpl fileSetSetup : this.fileSetSetups) {
/*  447 */       if (Objects.equals(fileSetSetup.getName(), name)) {
/*  448 */         return fileSetSetup;
/*      */       }
/*      */     } 
/*  451 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Collection<InstallationComponentSetup> getInstallationComponents() {
/*  457 */     return Collections.unmodifiableCollection((Collection)this.installationComponentSetups);
/*      */   }
/*      */ 
/*      */   
/*      */   public InstallationComponentSetup getInstallationComponentById(String id) {
/*  462 */     for (InstallationComponentSetupImpl installationComponentSetup : this.installationComponentSetups) {
/*  463 */       if (installationComponentSetup.getId().equals(id) || installationComponentSetup.getInternalId().equals(id)) {
/*  464 */         return installationComponentSetup;
/*      */       }
/*      */     } 
/*  467 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCompilerVariable(String variableName) {
/*  472 */     return (String)this.config.getCompilerVariables().get(variableName);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isUnattended() {
/*  477 */     return this.screenExecutor.isUnattended();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isConsole() {
/*  482 */     return this.screenExecutor.isConsole();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isGui() {
/*  487 */     return (!this.screenExecutor.isConsole() && !this.screenExecutor.isUnattended());
/*      */   }
/*      */ 
/*      */   
/*      */   public String getApplicationId() {
/*  492 */     return this.config.getApplicationId();
/*      */   }
/*      */ 
/*      */   
/*      */   public String getAddOnApplicationId() {
/*  497 */     return this.config.getAddonAppId();
/*      */   }
/*      */ 
/*      */   
/*      */   public void goForward(int numberOfScreens, boolean checkCondition, boolean executeActions) {
/*  502 */     this.screenExecutor.getCommandSink().returnToController((ControllerCommand)new GoForwardCommand(numberOfScreens, checkCondition, executeActions, this.screenExecutor.getActionCallback()));
/*      */   }
/*      */ 
/*      */   
/*      */   public void goBackInHistory(int numberOfScreens) {
/*  507 */     this.screenExecutor.getCommandSink().returnToController((ControllerCommand)new GoBackCommand(numberOfScreens, true));
/*      */   }
/*      */ 
/*      */   
/*      */   public void goBack(int numberOfScreens) {
/*  512 */     this.screenExecutor.getCommandSink().returnToController((ControllerCommand)new GoBackCommand(numberOfScreens, false));
/*      */   }
/*      */ 
/*      */   
/*      */   public void goBackInHistory(Screen targetScreen) {
/*  517 */     if (targetScreen == null) {
/*  518 */       throw new IllegalArgumentException("parameter targetScreen must not be null");
/*      */     }
/*  520 */     this.screenExecutor.getCommandSink().returnToController((ControllerCommand)new GoBackInHistoryToScreenCommand(targetScreen));
/*      */   }
/*      */ 
/*      */   
/*      */   public void gotoScreen(Screen screen) {
/*  525 */     gotoScreen(screen, false, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public void gotoScreen(Screen screen, boolean checkCondition, boolean executeActions) throws NotSupportedInElevationException {
/*  530 */     if (screen == null) {
/*  531 */       throw new IllegalArgumentException("parameter screen must not be null");
/*      */     }
/*  533 */     this.screenExecutor.getCommandSink().returnToController((ControllerCommand)new GotoScreenCommand(screen, checkCondition, executeActions, this.screenExecutor.getActionCallback()));
/*      */   }
/*      */ 
/*      */   
/*      */   public WizardContextInt getWizardContext() {
/*  538 */     return this.screenExecutor.getWizardContext();
/*      */   }
/*      */ 
/*      */   
/*      */   public Screen getScreenById(String id) {
/*  543 */     AbstractBeanConfig beanConfig = getId2BeanConfig().get(id);
/*  544 */     if (beanConfig instanceof ScreenBeanConfig && beanConfig.isInstantiated()) {
/*  545 */       return ((ScreenBeanConfig)beanConfig).getOrInstantiateScreen(false);
/*      */     }
/*  547 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public Screen[] getScreens() {
/*  552 */     return getScreens(null);
/*      */   }
/*      */ 
/*      */   
/*      */   public Screen getFirstScreen(Class screenClass) {
/*  557 */     Screen[] screens = getScreens(screenClass);
/*  558 */     if (screens.length > 0) {
/*  559 */       return screens[0];
/*      */     }
/*  561 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Screen[] getScreens(Class screenClass) {
/*  567 */     ArrayList<Screen> screens = new ArrayList<>();
/*  568 */     addScreens(screenClass, screens, getScreenConfigs());
/*  569 */     return screens.<Screen>toArray(new Screen[0]);
/*      */   }
/*      */   
/*      */   public List<ScreenBeanConfig> getScreenConfigsFlat() {
/*  573 */     if (this.screenConfigsFlat == null) {
/*  574 */       this.screenConfigsFlat = new ArrayList<>();
/*  575 */       addScreenConfigs(null, this.screenConfigsFlat, getScreenConfigs());
/*      */     } 
/*  577 */     return this.screenConfigsFlat;
/*      */   }
/*      */   
/*      */   private void addScreenConfigs(Class<?> screenClass, List<ScreenBeanConfig> flatScreenConfigs, List<AbstractBeanConfig> screenConfigs) {
/*  581 */     for (AbstractBeanConfig beanConfig : screenConfigs) {
/*  582 */       if (beanConfig instanceof ScreenBeanConfig) {
/*  583 */         ScreenBeanConfig screenConfig = (ScreenBeanConfig)beanConfig;
/*  584 */         if (screenClass == null || (screenConfig.isInstantiated() && screenConfig.getOrInstantiateScreen(false).getClass() == screenClass))
/*  585 */           flatScreenConfigs.add(screenConfig); 
/*      */         continue;
/*      */       } 
/*  588 */       GroupBeanConfig groupConfig = (GroupBeanConfig)beanConfig;
/*  589 */       addScreenConfigs(screenClass, flatScreenConfigs, groupConfig.getBeanConfigs());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void addScreens(Class<?> screenClass, List<Screen> screens, List<AbstractBeanConfig> screenConfigs) {
/*  595 */     for (AbstractBeanConfig beanConfig : screenConfigs) {
/*  596 */       if (beanConfig instanceof ScreenBeanConfig) {
/*  597 */         ScreenBeanConfig screenConfig = (ScreenBeanConfig)beanConfig;
/*  598 */         if (screenConfig.isInstantiated() && (screenClass == null || screenConfig.getOrInstantiateScreen(false).getClass() == screenClass))
/*  599 */           screens.add(screenConfig.getOrInstantiateScreen(false)); 
/*      */         continue;
/*      */       } 
/*  602 */       GroupBeanConfig groupConfig = (GroupBeanConfig)beanConfig;
/*  603 */       addScreens(screenClass, screens, groupConfig.getBeanConfigs());
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Action getActionById(String id) {
/*  610 */     AbstractBeanConfig beanConfig = getId2BeanConfig().get(id);
/*  611 */     if (beanConfig instanceof ActionBeanConfig && beanConfig.isInstantiated()) {
/*  612 */       return ((ActionBeanConfig)beanConfig).getOrInstantiateAction(false);
/*      */     }
/*  614 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public Action[] getActions(Screen screen) {
/*  619 */     return getActions(null, screen);
/*      */   }
/*      */ 
/*      */   
/*      */   public Action getFirstAction(Class<? extends Action> actionClass, Screen screen) {
/*  624 */     Action[] actions = getActions(actionClass, screen);
/*  625 */     if (actions.length > 0) {
/*  626 */       return actions[0];
/*      */     }
/*  628 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Action[] getActions(Class<? extends Action> actionClass, Screen screen) {
/*  635 */     List<Action> actions = new ArrayList<>();
/*  636 */     addActionsFromScreenConfigs(actionClass, screen, actions, getScreenConfigs());
/*  637 */     return actions.<Action>toArray(new Action[0]);
/*      */   }
/*      */   
/*      */   private <T extends Action> void addActionsFromScreenConfigs(Class<T> actionClass, Screen screen, List<T> actions, List<AbstractBeanConfig> screenConfigs) {
/*  641 */     for (AbstractBeanConfig beanConfig : screenConfigs) {
/*  642 */       if (beanConfig instanceof ScreenBeanConfig) {
/*  643 */         ScreenBeanConfig screenConfig = (ScreenBeanConfig)beanConfig;
/*      */         
/*  645 */         if (screen == null || (screenConfig.isInstantiated() && screenConfig.getOrInstantiateScreen(false) == screen))
/*  646 */           addActions(actions, screenConfig.getActionConfigs(), actionClass, false); 
/*      */         continue;
/*      */       } 
/*  649 */       GroupBeanConfig groupConfig = (GroupBeanConfig)beanConfig;
/*  650 */       addActionsFromScreenConfigs(actionClass, screen, actions, groupConfig.getBeanConfigs());
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public <T extends Action> List<T> getExecutableActionsStartingFrom(Class<T> actionClass, Screen screen) {
/*  657 */     boolean barrierReached = (screen == null);
/*      */     
/*  659 */     ArrayList<T> actions = new ArrayList<>();
/*  660 */     addExecutableActionsFrom(actionClass, screen, barrierReached, actions, getScreenConfigs());
/*      */     
/*  662 */     return actions;
/*      */   }
/*      */   
/*      */   private <T extends Action> boolean addExecutableActionsFrom(Class<T> actionClass, Screen screen, boolean barrierReached, List<T> actions, List<AbstractBeanConfig> screenConfigs) {
/*  666 */     for (AbstractBeanConfig beanConfig : screenConfigs) {
/*  667 */       if (beanConfig instanceof ScreenBeanConfig) {
/*  668 */         ScreenBeanConfig screenConfig = (ScreenBeanConfig)beanConfig;
/*      */         
/*  670 */         if (!barrierReached && 
/*  671 */           screenConfig.isInstantiated() && screenConfig.getOrInstantiateScreen(false) == screen) {
/*  672 */           barrierReached = true;
/*      */         }
/*      */ 
/*      */         
/*  676 */         if (barrierReached && (!screenConfig.isInstantiated() || 
/*  677 */           runBooleanScript(screenConfig.getConditionClassName(), (Bean)screenConfig.getOrInstantiateScreen(false), new Object[0])))
/*  678 */           addActions(actions, screenConfig.getActionConfigs(), actionClass, true); 
/*      */         continue;
/*      */       } 
/*  681 */       GroupBeanConfig groupConfig = (GroupBeanConfig)beanConfig;
/*  682 */       if (runBooleanScript(groupConfig.getConditionClassName(), (Bean)groupConfig.getOrInstantiateGroup(false), new Object[0])) {
/*  683 */         barrierReached = addExecutableActionsFrom(actionClass, screen, barrierReached, actions, groupConfig.getBeanConfigs());
/*      */       }
/*      */     } 
/*      */     
/*  687 */     return barrierReached;
/*      */   }
/*      */ 
/*      */   
/*      */   private <T extends Action> void addActions(List<T> actions, List<AbstractBeanConfig> actionsConfigs, Class<T> actionClass, boolean checkShouldRun) {
/*  692 */     for (AbstractBeanConfig beanConfig : actionsConfigs) {
/*  693 */       if (beanConfig instanceof ActionBeanConfig) {
/*  694 */         ActionBeanConfig actionConfig = (ActionBeanConfig)beanConfig;
/*  695 */         if (actionConfig.isInstantiated() && (actionClass == null || actionConfig.getOrInstantiateAction(false).getClass() == actionClass)) {
/*  696 */           Action action = actionConfig.getOrInstantiateAction(false);
/*  697 */           if (!checkShouldRun || runBooleanScript(actionConfig.getConditionClassName(), (Bean)action, new Object[0]))
/*  698 */             actions.add((T)action); 
/*      */         } 
/*      */         continue;
/*      */       } 
/*  702 */       GroupBeanConfig groupConfig = (GroupBeanConfig)beanConfig;
/*  703 */       if (!checkShouldRun || runBooleanScript(groupConfig.getConditionClassName(), (Bean)groupConfig.getOrInstantiateGroup(false), new Object[0])) {
/*  704 */         addActions(actions, groupConfig.getBeanConfigs(), actionClass, checkShouldRun);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getId(Action action) {
/*  712 */     for (Map.Entry<String, AbstractBeanConfig> entry : getId2BeanConfig().entrySet()) {
/*  713 */       AbstractBeanConfig beanConfig = entry.getValue();
/*  714 */       if (beanConfig instanceof ActionBeanConfig && beanConfig.isInstantiated() && ((ActionBeanConfig)beanConfig).getOrInstantiateAction(true) == action) {
/*  715 */         return beanConfig.getDisplayedId();
/*      */       }
/*      */     } 
/*  718 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getId(Screen screen) {
/*  723 */     for (Map.Entry<String, AbstractBeanConfig> entry : getId2BeanConfig().entrySet()) {
/*  724 */       AbstractBeanConfig beanConfig = entry.getValue();
/*  725 */       if (beanConfig instanceof ScreenBeanConfig && beanConfig.isInstantiated() && ((ScreenBeanConfig)beanConfig).getOrInstantiateScreen(true) == screen) {
/*  726 */         return beanConfig.getDisplayedId();
/*      */       }
/*      */     } 
/*  729 */     return null;
/*      */   }
/*      */   
/*      */   public void registerScreens() {
/*  733 */     List<AbstractBeanConfig> screenConfigs = getScreenConfigs();
/*  734 */     registerScreens(screenConfigs);
/*  735 */     AbstractBeanConfig.finishBatch();
/*      */ 
/*      */     
/*  738 */     initAllActions(screenConfigs);
/*      */     
/*  740 */     registerScreenConfigs(screenConfigs);
/*      */   }
/*      */   
/*      */   private void registerScreenConfigs(List<AbstractBeanConfig> screenConfigs) {
/*  744 */     for (AbstractBeanConfig beanConfig : screenConfigs) {
/*  745 */       if (!(beanConfig instanceof com.install4j.runtime.installer.config.LinkBeanConfig)) {
/*  746 */         if (beanConfig instanceof ScreenBeanConfig) {
/*  747 */           ScreenBeanConfig screenConfig = (ScreenBeanConfig)beanConfig;
/*      */           
/*  749 */           if (screenConfig.isInstantiated()) {
/*  750 */             Screen screen = screenConfig.getOrInstantiateScreen(false);
/*  751 */             if (screen != null)
/*  752 */               this.screenExecutor.register(screen, screenConfig); 
/*      */           } 
/*      */           continue;
/*      */         } 
/*  756 */         GroupBeanConfig groupConfig = (GroupBeanConfig)beanConfig;
/*  757 */         registerScreenConfigs(groupConfig.getBeanConfigs());
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void initAllActions(List<AbstractBeanConfig> screenConfigs) {
/*  764 */     for (AbstractBeanConfig beanConfig : screenConfigs) {
/*  765 */       if (beanConfig instanceof ScreenBeanConfig) {
/*  766 */         ScreenBeanConfig screenConfig = (ScreenBeanConfig)beanConfig;
/*  767 */         initActionsForSingleScreen(screenConfig.getActionConfigs()); continue;
/*      */       } 
/*  769 */       GroupBeanConfig groupConfig = (GroupBeanConfig)beanConfig;
/*  770 */       initAllActions(groupConfig.getBeanConfigs());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void registerScreens(List<AbstractBeanConfig> screenConfigs) {
/*  776 */     for (AbstractBeanConfig beanConfig : screenConfigs) {
/*  777 */       if (beanConfig instanceof ScreenBeanConfig) {
/*  778 */         ScreenBeanConfig screenConfig = (ScreenBeanConfig)beanConfig;
/*  779 */         screenConfig.batchInstantiate();
/*  780 */         registerActions(screenConfig.getActionConfigs());
/*  781 */         registerFormComponents(screenConfig.getFormComponentConfigs()); continue;
/*      */       } 
/*  783 */       GroupBeanConfig groupConfig = (GroupBeanConfig)beanConfig;
/*  784 */       groupConfig.batchInstantiate();
/*  785 */       registerScreens(groupConfig.getBeanConfigs());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void registerFormComponents(List<AbstractBeanConfig> formComponentConfigs) {
/*  791 */     for (AbstractBeanConfig beanConfig : formComponentConfigs) {
/*  792 */       if (beanConfig instanceof FormComponentBeanConfig) {
/*  793 */         FormComponentBeanConfig formComponentBeanConfig = (FormComponentBeanConfig)beanConfig;
/*  794 */         formComponentBeanConfig.batchInstantiate(); continue;
/*      */       } 
/*  796 */       GroupBeanConfig groupBeanConfig = (GroupBeanConfig)beanConfig;
/*  797 */       groupBeanConfig.batchInstantiate();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void initActionsForSingleScreen(List<AbstractBeanConfig> actionConfigs) {
/*  804 */     for (AbstractBeanConfig beanConfig : actionConfigs) {
/*  805 */       if (beanConfig instanceof ActionBeanConfig) {
/*  806 */         ActionBeanConfig actionBeanConfig = (ActionBeanConfig)beanConfig;
/*  807 */         if (!actionBeanConfig.isInitialized()) {
/*  808 */           Action action = actionBeanConfig.getOrInstantiateAction(true);
/*  809 */           if (action != null) {
/*  810 */             action.init(getIdWrapperContext((AbstractBeanConfig)actionBeanConfig));
/*  811 */             actionBeanConfig.setInitialized(true);
/*  812 */             if (actionBeanConfig.isElevate() && action instanceof com.install4j.runtime.beans.actions.InstallFilesAction)
/*  813 */               ContentInstaller.setExecutionContext(ExecutionContext.MAXIMUM); 
/*      */           } 
/*      */         } 
/*      */         continue;
/*      */       } 
/*  818 */       GroupBeanConfig groupBeanConfig = (GroupBeanConfig)beanConfig;
/*  819 */       initActionsForSingleScreen(groupBeanConfig.getBeanConfigs());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void registerActions(List<AbstractBeanConfig> actionConfigs) {
/*  825 */     for (AbstractBeanConfig beanConfig : actionConfigs) {
/*  826 */       if (beanConfig instanceof ActionBeanConfig) {
/*  827 */         ActionBeanConfig actionBeanConfig = (ActionBeanConfig)beanConfig;
/*  828 */         actionBeanConfig.batchInstantiate(); continue;
/*      */       } 
/*  830 */       GroupBeanConfig groupBeanConfig = (GroupBeanConfig)beanConfig;
/*  831 */       registerActions(groupBeanConfig.getBeanConfigs());
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public ProgressInterface getProgressInterface() {
/*  838 */     return this.screenExecutor.getProgressInterface();
/*      */   }
/*      */   
/*      */   public ProgressInterface getDefaultProgressInterface() {
/*  842 */     return this.screenExecutor.getDefaultProgressInterface();
/*      */   }
/*      */   
/*      */   private static void setAskingForCancel(final boolean askingForCancel) {
/*  846 */     HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new HelperCommunication.DirectRunAction()
/*      */         {
/*      */           protected void run(Context context) {
/*  849 */             ContextImpl.askingForCancel = askingForCancel;
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   public static void setCancelling() {
/*  855 */     HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new HelperCommunication.DirectRunAction()
/*      */         {
/*      */           protected void run(Context context) {
/*  858 */             ContextImpl.cancelling = true;
/*  859 */             ContextImpl.askingForCancel = false;
/*      */           }
/*      */         });
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isCancelling() {
/*  866 */     return isCancellingInt();
/*      */   }
/*      */ 
/*      */   
/*      */   public void cancel() {
/*  871 */     this.screenExecutor.cancelImmediately();
/*      */   }
/*      */ 
/*      */   
/*      */   public void runWithSuspendedActions(Runnable runnable) {
/*  876 */     runWithSuspendedActionsInt(runnable);
/*      */   }
/*      */   
/*      */   public static boolean isCancellingInt() {
/*  880 */     if (HelperCommunication.getInstance().isElevatedHelper() || !SwingUtilities.isEventDispatchThread()) {
/*  881 */       while (askingForCancel) {
/*      */         
/*      */         try {
/*  884 */           Thread.sleep(100L);
/*  885 */         } catch (InterruptedException e) {
/*  886 */           e.printStackTrace();
/*      */         } 
/*  888 */         if (HelperCommunication.getInstance().isElevatedHelper()) {
/*  889 */           HelperCommunication.getInstance().checkWork();
/*      */         }
/*      */       } 
/*      */     }
/*  893 */     return cancelling;
/*      */   }
/*      */   protected void cleanup() {
/*      */     String message;
/*  897 */     Logger.getInstance().info(null, "cleaning up");
/*  898 */     ProgressInterface progressInterface = getProgressInterface();
/*      */ 
/*      */     
/*  901 */     if (this instanceof UninstallerContext) {
/*  902 */       message = Messages.getString(".UninstallerFinish");
/*  903 */     } else if (InstallerConfig.getCurrentApplication() instanceof com.install4j.runtime.beans.applications.InstallerApplication) {
/*  904 */       message = Messages.getString(".StatusRunProgram");
/*      */     } else {
/*  906 */       message = Messages.getString(".StatusRunProgramExecute");
/*      */     } 
/*  908 */     progressInterface.setStatusMessage(message);
/*  909 */     progressInterface.setPercentCompleted(0);
/*  910 */     progressInterface.setDetailMessage(" ");
/*      */     
/*  912 */     FileInstaller.getInstance().cleanup();
/*  913 */     ContentInstaller.getInstance().cleanup();
/*      */     
/*  915 */     if (InstallerUtil.isWindows()) {
/*  916 */       ShellLink.uninitialize();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void handleCriticalException(Throwable e) {
/*  922 */     InstallerUtil.reportException(e);
/*  923 */     cleanup();
/*  924 */     immediateExit(1);
/*      */   }
/*      */   
/*      */   protected final String getInstallerLanguageId() {
/*  928 */     return getInstallationProperties().getLanguageId();
/*      */   }
/*      */ 
/*      */   
/*      */   public InstallationProperties getInstallationProperties() {
/*  933 */     if (this.installationProperties == null) {
/*  934 */       this.installationProperties = new InstallationProperties(getRuntimeDirectory());
/*      */     }
/*  936 */     return this.installationProperties;
/*      */   }
/*      */   
/*      */   public void setRollback() {
/*  940 */     this.screenExecutor.setRollback();
/*  941 */     this.shouldReboot = false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void finish(int exitCode) {
/*  946 */     cleanup();
/*      */     
/*  948 */     fireInstallerEvent(new InstallerEvent(this, this, EventType.FINISHED));
/*  949 */     exit(exitCode);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean hasBeenElevated() {
/*  954 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean runBooleanActivityWithFallback(RemoteCallable remoteCallable) {
/*      */     boolean success;
/*      */     try {
/*  961 */       success = ((Boolean)remoteCallable.execute()).booleanValue();
/*  962 */     } catch (Exception e) {
/*  963 */       success = false;
/*      */     } 
/*      */     
/*  966 */     if (success)
/*  967 */       return true; 
/*  968 */     if (Util.hasFullAdminRights()) {
/*  969 */       return false;
/*      */     }
/*      */     try {
/*  972 */       Serializable ret = runElevated(remoteCallable, false);
/*  973 */       return (ret instanceof Boolean && ((Boolean)ret).booleanValue());
/*  974 */     } catch (Exception e) {
/*  975 */       return false;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Serializable runElevated(RemoteCallable remoteCallable, boolean alwaysExecute) {
/*  983 */     return runElevatedInt(remoteCallable, alwaysExecute);
/*      */   }
/*      */   
/*      */   public static Serializable runElevatedInt(RemoteCallable remoteCallable, boolean alwaysExecute) {
/*  987 */     HelperCommunication helperCommunication = HelperCommunication.getInstance();
/*  988 */     if (helperCommunication.hasElevatedHelper()) {
/*  989 */       RemoteResponse remoteResponse = (RemoteResponse)helperCommunication.executeAction(ExecutionContext.MAXIMUM, new RemoteAction(remoteCallable));
/*  990 */       if (remoteResponse != null) {
/*  991 */         return remoteResponse.getReturnedObject();
/*      */       }
/*  993 */     } else if (alwaysExecute || Util.hasFullAdminRights()) {
/*  994 */       return remoteCallable.execute();
/*      */     } 
/*  996 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public Serializable runUnelevated(RemoteCallable remoteCallable) {
/* 1001 */     return runUnelevatedInt(remoteCallable, true);
/*      */   }
/*      */ 
/*      */   
/*      */   public void initializeLazilyCreatedScreens() {
/* 1006 */     this.screenExecutor.initializeLazilyLoadedScreens();
/*      */   }
/*      */ 
/*      */   
/*      */   public void addToClassPath(File file) {
/* 1011 */     Install4jClassLoader.addClassPath(file);
/*      */   }
/*      */ 
/*      */   
/*      */   public String[] getExtraCommandLineArguments() {
/* 1016 */     return InstallerUtil.getExtraCommandLineParameters();
/*      */   }
/*      */ 
/*      */   
/*      */   public String getMediaFileId() {
/* 1021 */     return this.config.getMediaSetId();
/*      */   }
/*      */ 
/*      */   
/*      */   public String getVersion() {
/* 1026 */     return this.config.getApplicationVersion();
/*      */   }
/*      */ 
/*      */   
/*      */   public String getApplicationName() {
/* 1031 */     return this.config.getApplicationName();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean executeActionListSync(ActionList actionList, Object... extraScriptParameters) throws UserCanceledException {
/* 1036 */     return this.screenExecutor.getCommandSink().executeActionList(actionList, extraScriptParameters);
/*      */   }
/*      */ 
/*      */   
/*      */   public void executeActionListAsync(ActionList actionList, Object... extraScriptParameters) {
/* 1041 */     if (this.screenExecutor.getCommandSink().isExecutingActions()) {
/* 1042 */       throw new IllegalStateException("Actions are currently executing, use executeActionListSync instead");
/*      */     }
/* 1044 */     this.screenExecutor.getCommandSink().returnToController((ControllerCommand)new ExecuteActionListCommand(this.screenExecutor.getActionCallback(), actionList, extraScriptParameters));
/*      */   }
/*      */ 
/*      */   
/*      */   public void rollbackActionList(ActionList actionList) {
/* 1049 */     this.screenExecutor.getCommandSink().rollbackActionList(actionList);
/*      */   }
/*      */   
/*      */   public static Serializable runUnelevatedInt(RemoteCallable remoteCallable, boolean alwaysRun) {
/* 1053 */     HelperCommunication helperCommunication = HelperCommunication.getInstance();
/* 1054 */     if (helperCommunication.isElevatedHelper()) {
/* 1055 */       RemoteResponse remoteResponse = (RemoteResponse)helperCommunication.executeAction(ExecutionContext.UNELEVATED, new RemoteAction(remoteCallable));
/* 1056 */       if (remoteResponse != null) {
/* 1057 */         return remoteResponse.getReturnedObject();
/*      */       }
/* 1059 */     } else if (alwaysRun) {
/* 1060 */       return remoteCallable.execute();
/*      */     } 
/* 1062 */     return null;
/*      */   }
/*      */   
/*      */   public void initWithVariables() {}
/*      */   
/*      */   private static class RemoteAction
/*      */     extends CommunicationAction {
/*      */     private RemoteCallable remoteCallable;
/*      */     
/*      */     private RemoteAction(RemoteCallable remoteCallable) {
/* 1072 */       this.remoteCallable = remoteCallable;
/*      */     }
/*      */     
/*      */     public Response execute(Context context) {
/*      */       Serializable returnedObject;
/* 1077 */       Logger.getInstance().info(null, "executing " + this.remoteCallable);
/*      */       
/*      */       try {
/* 1080 */         returnedObject = this.remoteCallable.execute();
/* 1081 */       } catch (Throwable t) {
/* 1082 */         Logger.getInstance().log(t);
/* 1083 */         return new ContextImpl.RemoteResponse(false, null);
/*      */       } 
/* 1085 */       return new ContextImpl.RemoteResponse(true, returnedObject);
/*      */     }
/*      */   }
/*      */   
/*      */   public static class RemoteResponse extends Response {
/*      */     private Serializable returnedObject;
/*      */     
/*      */     public RemoteResponse(boolean success, Serializable returnedObject) {
/* 1093 */       super(success);
/* 1094 */       this.returnedObject = returnedObject;
/*      */     }
/*      */     
/*      */     public Serializable getReturnedObject() {
/* 1098 */       return this.returnedObject;
/*      */     }
/*      */   }
/*      */   
/*      */   public void setupClasspath() {
/* 1103 */     for (InstallationComponentSetupImpl installationComponentSetup : this.installationComponentSetups) {
/* 1104 */       installationComponentSetup.initVariable();
/*      */     }
/* 1106 */     Install4jClassLoader.addCustomJarsToClasspath(this);
/*      */   }
/*      */   
/*      */   public boolean checkStart() {
/* 1110 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public Object getVariable(String variableName) {
/* 1115 */     return InstallerVariables.getVariable(variableName);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean getBooleanVariable(String variableName) {
/* 1120 */     Object value = getVariable(variableName);
/* 1121 */     return (Boolean.TRUE.equals(value) || "true".equals(value));
/*      */   }
/*      */ 
/*      */   
/*      */   public void setVariable(String variableName, Object value) {
/* 1126 */     InstallerVariables.setVariable(variableName, value);
/* 1127 */     variableChanged(variableName);
/*      */   }
/*      */   
/*      */   protected void variableChanged(String variableName) {
/* 1131 */     fireInstallerEvent((InstallerEvent)new InstallerVariableEvent(this, this, variableName));
/*      */   }
/*      */ 
/*      */   
/*      */   public Set<String> getVariableNames() {
/* 1136 */     return InstallerVariables.getVariableNames();
/*      */   }
/*      */ 
/*      */   
/*      */   public void registerResponseFileVariable(String variableName) {
/* 1141 */     InstallerVariables.registerResponseFileVariable(variableName);
/*      */   }
/*      */ 
/*      */   
/*      */   public void unregisterResponseFileVariable(String variableName) {
/* 1146 */     InstallerVariables.unregisterResponseFileVariable(variableName);
/*      */   }
/*      */ 
/*      */   
/*      */   public void registerResponseFileComment(String variableName, String comment) {
/* 1151 */     InstallerVariables.registerResponseFileComment(variableName, comment);
/*      */   }
/*      */ 
/*      */   
/*      */   public void registerHiddenVariable(String variableName) {
/* 1156 */     InstallerVariables.registerHiddenVariable(variableName);
/*      */   }
/*      */   
/*      */   public boolean performAction(ActionBeanConfig actionBeanConfig) throws UserCanceledException {
/* 1160 */     Action action = actionBeanConfig.getOrInstantiateAction(false);
/* 1161 */     if (action == null) {
/* 1162 */       Logger.getInstance().error(null, "Could not instantiate action " + actionBeanConfig.getDisplayedId());
/* 1163 */       return false;
/*      */     } 
/* 1165 */     long start = System.currentTimeMillis();
/* 1166 */     boolean success = false;
/* 1167 */     Exception exception = null;
/*      */     try {
/* 1169 */       this.currentAction = action;
/* 1170 */       FileInstaller.getInstance().setCurrentAction(actionBeanConfig);
/* 1171 */       ProgressCommunication.getCurrent().actionStarted(actionBeanConfig.getQualifiedDisplayedId());
/* 1172 */       fireInstallerEvent(new InstallerEvent(action, this, EventType.BEFORE_EXECUTE_ACTION));
/* 1173 */       success = performActionInt(actionBeanConfig);
/* 1174 */       return success;
/* 1175 */     } catch (FinishError e) {
/* 1176 */       finish(e.getExitCode());
/* 1177 */       return true;
/* 1178 */     } catch (UserCanceledException e) {
/* 1179 */       throw e;
/* 1180 */     } catch (Exception e) {
/* 1181 */       exception = e;
/* 1182 */       InstallerUtil.reportException(e);
/* 1183 */       return false;
/*      */     } finally {
/* 1185 */       fireInstallerEvent((InstallerEvent)new InstallerActionEvent(action, this, EventType.AFTER_EXECUTE_ACTION, success, actionBeanConfig.getDisplayedId(), System.currentTimeMillis() - start, exception, Logger.getImpl().getActionLogBuffer()));
/* 1186 */       this.currentAction = null;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void rollbackAction(ActionBeanConfig actionBeanConfig) {
/* 1192 */     Action eventSource = null;
/*      */     try {
/* 1194 */       eventSource = this.currentAction = actionBeanConfig.getOrInstantiateAction(false);
/* 1195 */       fireInstallerEvent(new InstallerEvent(eventSource, this, EventType.BEFORE_ROLLBACK_ACTION));
/* 1196 */       rollbackActionInt(actionBeanConfig);
/*      */     } finally {
/* 1198 */       if (eventSource != null) {
/* 1199 */         fireInstallerEvent(new InstallerEvent(eventSource, this, EventType.AFTER_ROLLBACK_ACTION));
/*      */       }
/* 1201 */       this.currentAction = null;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void fireInstallerEvent(InstallerEvent event) {
/*      */     ArrayList<InstallerEventListener> listenersCopy;
/* 1208 */     synchronized (this.listeners) {
/* 1209 */       listenersCopy = new ArrayList<>(this.listeners);
/*      */     } 
/* 1211 */     for (InstallerEventListener installerEventListener : listenersCopy) {
/* 1212 */       installerEventListener.installerEvent(event);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void addInstallerEventListener(InstallerEventListener event) {
/* 1218 */     synchronized (this.listeners) {
/* 1219 */       this.listeners.add(event);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void removeInstallerEventListener(InstallerEventListener event) {
/* 1225 */     synchronized (this.listeners) {
/* 1226 */       this.listeners.remove(event);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public Object getEventSource() {
/* 1232 */     if (this.currentAction != null) {
/* 1233 */       return this.currentAction;
/*      */     }
/* 1235 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public File getExternalFile(ExternalFile externalFile, boolean installedLocation) {
/* 1241 */     if (externalFile == null || externalFile.getPath().trim().length() == 0)
/* 1242 */       return null; 
/* 1243 */     if (externalFile.getPath().startsWith("icon:"))
/* 1244 */       return (File)new ExternalFile(InstallerVariables.replaceVariables(externalFile.getPath())); 
/* 1245 */     if (isDistributionExternal(externalFile)) {
/* 1246 */       return InstallerVariables.replaceVariables((File)externalFile);
/*      */     }
/* 1248 */     return new File(getRuntimeDirectory(), externalFile.getPath());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public File getExternalFile(LocalizedExternalFile localizedExternalFile, boolean installedLocation) {
/* 1254 */     if (localizedExternalFile == null) {
/* 1255 */       return null;
/*      */     }
/* 1257 */     Map<String, ExternalFile> languageIdToExternalFile = localizedExternalFile.getLanguageIdToExternalFile();
/* 1258 */     ExternalFile externalFile = languageIdToExternalFile.get(this.languageId);
/* 1259 */     if (externalFile == null) {
/* 1260 */       String principalLanguageId = ((LanguageConfig)this.config.getLanguages().get(0)).getId();
/* 1261 */       externalFile = languageIdToExternalFile.get(principalLanguageId);
/*      */     } 
/* 1263 */     return getExternalFile(externalFile, installedLocation);
/*      */   }
/*      */   
/*      */   protected static boolean isDistributionExternal(ExternalFile externalFile) {
/* 1267 */     if (externalFile == null) {
/* 1268 */       return false;
/*      */     }
/* 1270 */     String path = externalFile.getPath().trim();
/* 1271 */     return (path.contains("${") || path.startsWith("icon:"));
/*      */   }
/*      */ 
/*      */   
/*      */   public final File getRuntimeDirectory() {
/* 1276 */     return getDestinationFile(".install4j");
/*      */   }
/*      */ 
/*      */   
/*      */   public void setErrorOccurred(boolean errorOccurred) {
/* 1281 */     this.errorOccurred = errorOccurred;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isErrorOccurred() {
/* 1286 */     return this.errorOccurred;
/*      */   }
/*      */   
/*      */   public void immediateExit(int value) {
/* 1290 */     Runnable runnable = () -> {
/*      */         System.out.flush();
/*      */         System.err.flush();
/*      */         HelperCommunication.getInstance().terminate();
/*      */         ProgressCommunication.getCurrent().exiting();
/*      */         if (InstallerUtil.isInProcess()) {
/*      */           this.screenExecutor.closeWindows();
/*      */         }
/*      */         InstallerUtil.exit(value);
/*      */       };
/* 1300 */     if (EventQueue.isDispatchThread()) {
/* 1301 */       runnable.run();
/*      */     } else {
/*      */       try {
/* 1304 */         EventQueue.invokeAndWait(runnable);
/* 1305 */       } catch (Exception e) {
/* 1306 */         e.printStackTrace();
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public void exit(int exitCode) {
/* 1312 */     Runnable runnable = () -> {
/*      */         this.screenExecutor.closeWindows();
/*      */         if (!checkReboot()) {
/*      */           waitForFinishExecutable();
/*      */         }
/*      */         LoggerImpl.getImpl().moveLogFileToFinalDestination();
/*      */         HelperCommunication.getInstance().terminate();
/*      */         ProgressCommunication.getCurrent().exiting();
/*      */         InstallerUtil.exit(exitCode);
/*      */       };
/* 1322 */     GUIHelper.invokeOnEDT(runnable);
/*      */   }
/*      */   
/*      */   private void waitForFinishExecutable() {
/* 1326 */     if (Util.isWindows() || Util.isMacOS()) {
/*      */       return;
/*      */     }
/* 1329 */     long lastLaunchTime = LaunchHelper.getLastLaunchTime();
/* 1330 */     if (lastLaunchTime != 0L) {
/* 1331 */       long delta = System.currentTimeMillis() - lastLaunchTime;
/* 1332 */       if (delta < 10000L) {
/*      */         try {
/* 1334 */           Thread.sleep(10000L - delta);
/* 1335 */         } catch (InterruptedException e) {
/* 1336 */           e.printStackTrace();
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void triggerReboot(boolean askUser) {
/* 1344 */     if (!Boolean.getBoolean("install4j.preventReboot")) {
/* 1345 */       this.shouldReboot = true;
/* 1346 */       if (!askUser) {
/* 1347 */         this.askUserForReboot = false;
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isRebootRequired() {
/* 1354 */     return this.shouldReboot;
/*      */   }
/*      */   
/*      */   protected ExecutionContext getWinDelExecutionContext() {
/* 1358 */     return ExecutionContext.UNELEVATED;
/*      */   }
/*      */   
/*      */   private void doReboot() {
/* 1362 */     if (Util.isWindows()) {
/* 1363 */       rebootWindows(getWinDelExecutionContext());
/* 1364 */     } else if (Util.isMacOS()) {
/* 1365 */       MacProcessHelper.reboot();
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void rebootWindows(ExecutionContext executionContext) {
/* 1370 */     HelperCommunication.getInstance().executeAction(executionContext, (CommunicationAction)new RunAction()
/*      */         {
/*      */           protected void run(Context context) throws Exception {
/* 1373 */             if (WinDel.isUsed()) {
/* 1374 */               WinDel.setReboot(true);
/*      */             } else {
/* 1376 */               Misc.reboot();
/*      */             } 
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   private static void setWinDelRebootMessage(final String rebootMessage, final String rebootErrorMessage) {
/* 1383 */     HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new RunAction()
/*      */         {
/*      */           protected void run(Context context) throws Exception {
/* 1386 */             WinDel.setRebootMessage(rebootMessage, rebootErrorMessage);
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   private boolean checkReboot() {
/* 1392 */     String rebootMessage = Messages.format(getRebootMessage(), new Object[] { this.config.getApplicationName() });
/* 1393 */     if (Util.isWindows() && !isUnattended() && !isConsole()) {
/* 1394 */       setWinDelRebootMessage(rebootMessage, Messages.getString(".ErrorRestartingComputer"));
/*      */     }
/*      */     
/* 1397 */     if (isRebootSupported() && this.shouldReboot) {
/* 1398 */       if (Boolean.getBoolean("install4j.suppressReboot")) {
/* 1399 */         return false;
/*      */       }
/*      */       
/* 1402 */       if (isUnattended() || !this.askUserForReboot) {
/* 1403 */         if (isUnattended() && Boolean.getBoolean("install4j.suppressUnattendedReboot")) {
/* 1404 */           return false;
/*      */         }
/* 1406 */         doReboot();
/* 1407 */         return true;
/*      */       } 
/*      */       try {
/* 1410 */         int result = Util.showOptionDialog(rebootMessage, new String[] {
/* 1411 */               Messages.getString(".ButtonYes"), Messages.getString(".ButtonNo") }, 3);
/*      */ 
/*      */         
/* 1414 */         if (result == 0) {
/* 1415 */           doReboot();
/* 1416 */           return true;
/*      */         } 
/* 1418 */         if (Util.isWindows()) {
/* 1419 */           setWinDelRebootMessage("", "");
/*      */         }
/*      */       }
/* 1422 */       catch (UserCanceledException userCanceledException) {}
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1427 */     return false;
/*      */   }
/*      */   
/*      */   private boolean isRebootSupported() {
/* 1431 */     return (Util.isWindows() || Util.isMacOS());
/*      */   }
/*      */   
/*      */   public void initLoopIndex(GroupBeanConfig groupConfig, GroupState groupState) {
/* 1435 */     Group group = (Group)groupConfig.getOrInstantiateBean();
/* 1436 */     if (group instanceof ControlFlowGroup) {
/* 1437 */       ControlFlowGroup controlFlowGroup = (ControlFlowGroup)group;
/* 1438 */       groupState.loopIndex = controlFlowGroup.getLoopIndexStart();
/* 1439 */       setLoopIndexInstallerVariable(controlFlowGroup, groupState);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void setLoopIndexInstallerVariable(ControlFlowGroup controlFlowGroup, GroupState groupState) {
/* 1444 */     String loopIndexVariableName = controlFlowGroup.getLoopIndexVariableName();
/* 1445 */     if (loopIndexVariableName.trim().length() > 0) {
/* 1446 */       Integer index = Integer.valueOf(groupState.loopIndex);
/* 1447 */       setVariable(loopIndexVariableName, index);
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean isGroupLoop(GroupBeanConfig groupConfig, GroupState groupState) {
/* 1452 */     Group group = groupConfig.getOrInstantiateGroup(false);
/* 1453 */     if (group instanceof ControlFlowGroup && groupState != null) {
/* 1454 */       ControlFlowGroup controlFlowGroup = (ControlFlowGroup)group;
/* 1455 */       groupState.loopIndex += controlFlowGroup.getLoopIndexStep();
/* 1456 */       setLoopIndexInstallerVariable(controlFlowGroup, groupState);
/* 1457 */       return isGroupLoop(controlFlowGroup, groupState);
/*      */     } 
/* 1459 */     return false;
/*      */   }
/*      */   
/*      */   private boolean isGroupLoop(ControlFlowGroup controlFlowGroup, GroupState groupState) {
/* 1463 */     if (!controlFlowGroup.isLoop()) {
/* 1464 */       return false;
/*      */     }
/*      */     try {
/* 1467 */       Object scriptReturn = runScript(controlFlowGroup.getLoopExpression(), (Bean)controlFlowGroup, new Object[] { Integer.valueOf(groupState.loopIndex) });
/* 1468 */       if (scriptReturn instanceof Boolean) {
/* 1469 */         return ((Boolean)scriptReturn).booleanValue();
/*      */       }
/* 1471 */       return false;
/*      */     }
/* 1473 */     catch (Exception e) {
/* 1474 */       InstallerUtil.reportException(e);
/* 1475 */       return false;
/*      */     } 
/*      */   }
/*      */   
/*      */   public static class LauncherSetupImpl
/*      */     implements LauncherSetup, Serializable {
/*      */     private LauncherConfig launcherConfig;
/*      */     
/*      */     public LauncherSetupImpl(LauncherConfig launcherConfig) {
/* 1484 */       this.launcherConfig = launcherConfig;
/*      */     }
/*      */ 
/*      */     
/*      */     public String getRelativeFileName() {
/* 1489 */       if (InstallerUtil.isWindows()) {
/* 1490 */         return this.launcherConfig.getFile().replace('/', '\\');
/*      */       }
/* 1492 */       return this.launcherConfig.getFile().replace('\\', '/');
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public String getId() {
/* 1498 */       return this.launcherConfig.getDisplayedId();
/*      */     }
/*      */     
/*      */     public String getInternalId() {
/* 1502 */       return this.launcherConfig.getId();
/*      */     }
/*      */ 
/*      */     
/*      */     public LauncherType getType() {
/* 1507 */       return this.launcherConfig.getType();
/*      */     }
/*      */ 
/*      */     
/*      */     public String getName() {
/* 1512 */       return this.launcherConfig.getName();
/*      */     }
/*      */     
/*      */     public String getMenuName() {
/* 1516 */       return this.launcherConfig.getMenuName();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isExcludeFromMenu() {
/* 1521 */       return this.launcherConfig.isExcludeFromMenu();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isUninstaller() {
/* 1526 */       return this.launcherConfig.isUninstaller();
/*      */     }
/*      */     
/*      */     public LauncherConfig getLauncherConfig() {
/* 1530 */       return this.launcherConfig;
/*      */     }
/*      */   }
/*      */   
/*      */   private static class FileSetSetupImpl
/*      */     implements FileSetSetup, Serializable {
/*      */     private FilesetConfig filesetConfig;
/*      */     
/*      */     public FileSetSetupImpl(FilesetConfig filesetConfig) {
/* 1539 */       this.filesetConfig = filesetConfig;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isSelected() {
/* 1544 */       return this.filesetConfig.isSelected();
/*      */     }
/*      */ 
/*      */     
/*      */     public void setSelected(boolean selected) {
/* 1549 */       HelperCommunication.helperUnsupported();
/* 1550 */       this.filesetConfig.setSelected(selected);
/*      */     }
/*      */ 
/*      */     
/*      */     public String getName() {
/* 1555 */       return this.filesetConfig.getName();
/*      */     }
/*      */ 
/*      */     
/*      */     public String getId() {
/* 1560 */       return this.filesetConfig.getDisplayedId();
/*      */     }
/*      */     
/*      */     public String getInternalId() {
/* 1564 */       return this.filesetConfig.getId();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class InstallationComponentSetupImpl
/*      */     implements InstallationComponentSetup, Serializable
/*      */   {
/*      */     public static final String VARIABLE_PREFIX = "sys.component.";
/*      */     private ComponentConfig componentConfig;
/*      */     
/*      */     public InstallationComponentSetupImpl(ComponentConfig componentConfig) {
/* 1576 */       this.componentConfig = componentConfig;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isSelected() {
/* 1581 */       return this.componentConfig.isSelected();
/*      */     }
/*      */ 
/*      */     
/*      */     public void setSelected(boolean selected) {
/* 1586 */       HelperCommunication.helperUnsupported();
/* 1587 */       this.componentConfig.setSelected(selected);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isChangeable() {
/* 1592 */       return this.componentConfig.isChangeable();
/*      */     }
/*      */ 
/*      */     
/*      */     public void setChangeable(boolean changeable) {
/* 1597 */       HelperCommunication.helperUnsupported();
/* 1598 */       this.componentConfig.setChangeable(changeable);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isHidden() {
/* 1603 */       return this.componentConfig.isHidden();
/*      */     }
/*      */ 
/*      */     
/*      */     public void setHidden(boolean hidden) {
/* 1608 */       HelperCommunication.helperUnsupported();
/* 1609 */       this.componentConfig.setHidden(hidden);
/*      */     }
/*      */ 
/*      */     
/*      */     public String getName() {
/* 1614 */       return this.componentConfig.getName();
/*      */     }
/*      */ 
/*      */     
/*      */     public String getId() {
/* 1619 */       return this.componentConfig.getDisplayedId();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isDownloaded() {
/* 1624 */       return this.componentConfig.isDownloaded();
/*      */     }
/*      */     
/*      */     public String getInternalId() {
/* 1628 */       return this.componentConfig.getId();
/*      */     }
/*      */     
/*      */     public void initVariable() {
/* 1632 */       HelperCommunication.helperUnsupported();
/* 1633 */       String variableName = "sys.component." + getId();
/*      */       
/* 1635 */       Object varValue = InstallerVariables.getVariable(variableName);
/* 1636 */       if (varValue instanceof Boolean) {
/* 1637 */         setSelected(((Boolean)varValue).booleanValue());
/*      */       }
/*      */       
/* 1640 */       InstallerVariables.registerVariableProvider(variableName, new InstallerVariables.VariableProvider()
/*      */           {
/*      */             public Object getVariable()
/*      */             {
/* 1644 */               return Boolean.valueOf(ContextImpl.InstallationComponentSetupImpl.this.isSelected());
/*      */             }
/*      */ 
/*      */             
/*      */             public void setVariable(Object value) {
/* 1649 */               if (value instanceof Boolean) {
/* 1650 */                 ContextImpl.InstallationComponentSetupImpl.this.setSelected(((Boolean)value).booleanValue());
/*      */               }
/*      */             }
/*      */           });
/*      */       
/* 1655 */       InstallerVariables.registerResponseFileVariable(variableName);
/*      */     }
/*      */   }
/*      */   
/*      */   public static class FileInfoImpl implements FileInfo, Serializable {
/*      */     private String rootUnresolved;
/*      */     private String relativeFilePath;
/* 1662 */     private String filesetId = "";
/*      */ 
/*      */     
/*      */     public File getDestinationFile() {
/* 1666 */       String rootResolved = getRootResolvedString();
/* 1667 */       if (rootResolved == null)
/* 1668 */         return null; 
/* 1669 */       if (Objects.equals(rootResolved, "")) {
/* 1670 */         File relativeFile = new File(this.relativeFilePath);
/* 1671 */         if (relativeFile.isAbsolute()) {
/* 1672 */           return relativeFile;
/*      */         }
/* 1674 */         return new File(ContextImpl.getCurrentContext().getInstallationDirectory().getAbsoluteFile(), this.relativeFilePath);
/*      */       } 
/*      */       
/* 1677 */       return new File(rootResolved, this.relativeFilePath);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public String getRootUnresolved() {
/* 1683 */       return this.rootUnresolved;
/*      */     }
/*      */ 
/*      */     
/*      */     public File getRootResolved() {
/* 1688 */       String rootResolvedString = getRootResolvedString();
/* 1689 */       if (rootResolvedString == null)
/* 1690 */         return null; 
/* 1691 */       if (Objects.equals(rootResolvedString, "") && !(new File(this.relativeFilePath)).isAbsolute()) {
/* 1692 */         return ContextImpl.getCurrentContext().getInstallationDirectory().getAbsoluteFile();
/*      */       }
/* 1694 */       return new File(rootResolvedString);
/*      */     }
/*      */ 
/*      */     
/*      */     private String getRootResolvedString() {
/* 1699 */       if (this.rootUnresolved == null) {
/* 1700 */         return ContextImpl.getCurrentContext().getInstallationDirectory().getAbsolutePath();
/*      */       }
/*      */       try {
/* 1703 */         return InstallerVariables.replaceVariables(this.rootUnresolved).replace('/', File.separatorChar).replace('\\', File.separatorChar);
/* 1704 */       } catch (UndefinedVariableException e) {
/* 1705 */         return null;
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public String getRelativeFilePath() {
/* 1712 */       return this.relativeFilePath;
/*      */     }
/*      */ 
/*      */     
/*      */     public String getFilesetId() {
/* 1717 */       return this.filesetId;
/*      */     }
/*      */ 
/*      */     
/*      */     public String getFilesetName() {
/* 1722 */       if (this.filesetId == null || this.filesetId.length() == 0) {
/* 1723 */         return "";
/*      */       }
/* 1725 */       FileSetSetup fileSetSetup = ContextImpl.getCurrentContext().getFileSetById(this.filesetId);
/* 1726 */       if (fileSetSetup == null) {
/* 1727 */         return null;
/*      */       }
/* 1729 */       return fileSetSetup.getName();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String toString() {
/* 1736 */       return "FileInfoImpl{rootUnresolved='" + this.rootUnresolved + '\'' + ", relativeFilePath='" + this.relativeFilePath + '\'' + ", filesetId='" + this.filesetId + '\'' + '}';
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCurrentActionId(String id) {
/* 1747 */     this.currentActionId = id;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCurrentActionId() {
/* 1752 */     return this.currentActionId;
/*      */   }
/*      */   
/*      */   protected static boolean performActionIntStatic(ActionBeanConfig config, Context currentContext) throws UserCanceledException {
/* 1756 */     setCurrentContext(currentContext);
/* 1757 */     final Action action = config.getOrInstantiateAction(false);
/* 1758 */     final Map<String, String> textOverrides = config.getTextOverrides();
/* 1759 */     final String displayedId = config.getDisplayedId();
/*      */     try {
/* 1761 */       getContextInt(currentContext).setCurrentActionId(config.getId());
/* 1762 */       PostActionExecutionState postActionExecutionState = (PostActionExecutionState)HelperCommunication.getInstance().fetchObjectChecked(config.getExecutionContext(), new FetchObjectAction<PostActionExecutionState>()
/*      */           {
/*      */             protected ContextImpl.PostActionExecutionState fetchValue(Context context) throws UserCanceledException {
/* 1765 */               return new ContextImpl.PostActionExecutionState(action, executeAction(context));
/*      */             }
/*      */             
/*      */             private boolean executeAction(Context context) throws UserCanceledException {
/* 1769 */               AbstractBeanConfig.registerBeanSafeForElevatedHelper((Bean)action, displayedId, textOverrides);
/* 1770 */               ClassLoader oldContextClassLoader = Thread.currentThread().getContextClassLoader();
/*      */               
/*      */               try {
/* 1773 */                 Thread.currentThread().setContextClassLoader(action.getClass().getClassLoader());
/* 1774 */                 if (action instanceof InstallAction && context instanceof InstallerContext)
/* 1775 */                   return ((InstallAction)action).install((InstallerContext)context); 
/* 1776 */                 if (action instanceof UninstallAction && context instanceof UninstallerContext) {
/* 1777 */                   return ((UninstallAction)action).uninstall((UninstallerContext)context);
/*      */                 }
/* 1779 */                 throw new IllegalArgumentException(action.getClass().getName() + "/ " + context.getClass().getName());
/*      */               } finally {
/*      */                 
/* 1782 */                 Thread.currentThread().setContextClassLoader(oldContextClassLoader);
/*      */               } 
/*      */             }
/*      */           });
/* 1786 */       config.setInstance(postActionExecutionState.getAction());
/* 1787 */       return postActionExecutionState.isSuccess();
/* 1788 */     } catch (IOException e) {
/* 1789 */       throw new RuntimeException(e);
/*      */     } finally {
/* 1791 */       getContextInt(currentContext).setCurrentActionId("");
/* 1792 */       setCurrentContext(null);
/*      */     } 
/*      */   }
/*      */   protected abstract String getRebootMessage();
/*      */   public abstract void applyToScreen(Screen paramScreen, ScreenBeanConfig paramScreenBeanConfig);
/*      */   public abstract Context getIdWrapperContext(AbstractBeanConfig paramAbstractBeanConfig);
/*      */   protected abstract boolean performActionInt(ActionBeanConfig paramActionBeanConfig) throws UserCanceledException;
/*      */   protected abstract void rollbackActionInt(ActionBeanConfig paramActionBeanConfig);
/*      */   protected static class PostActionExecutionState implements Serializable { private boolean success; private Action action;
/*      */     public PostActionExecutionState(Action action, boolean success) {
/* 1802 */       this.success = success;
/* 1803 */       this.action = action;
/*      */     }
/*      */     
/*      */     public boolean isSuccess() {
/* 1807 */       return this.success;
/*      */     }
/*      */     
/*      */     public Action getAction() {
/* 1811 */       return this.action;
/*      */     } }
/*      */ 
/*      */   
/*      */   public static class GroupState
/*      */     implements Cloneable {
/*      */     int loopIndex;
/*      */     
/*      */     public String toString() {
/* 1820 */       return "Group state " + this.loopIndex;
/*      */     }
/*      */     
/*      */     public GroupState copy() {
/*      */       try {
/* 1825 */         return (GroupState)clone();
/* 1826 */       } catch (CloneNotSupportedException e) {
/* 1827 */         return null;
/*      */       } 
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\ContextImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */