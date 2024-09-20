/*     */ package com.install4j.runtime.installer.config;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.ReplacementMode;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.FileOptions;
/*     */ import com.install4j.runtime.beans.applications.Application;
/*     */ import com.install4j.runtime.beans.applications.InstallerApplication;
/*     */ import com.install4j.runtime.beans.applications.UninstallerApplication;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.helper.CompilerVariableHelper;
/*     */ import com.install4j.runtime.installer.helper.EnvironmentUtil;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import com.install4j.runtime.installer.helper.apiimpl.ApplicationRegistryImpl;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.registry.InstallRegistry;
/*     */ import com.install4j.runtime.installer.platform.win32.FolderInfo;
/*     */ import com.install4j.runtime.installer.platform.win32.Misc;
/*     */ import com.install4j.runtime.installer.platform.win32.PE32Handler;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.nio.file.Files;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.zip.CRC32;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ public class InstallerConfig
/*     */   extends AbstractConfig {
/*     */   public static final String VARIABLE_PLATFORM = "sys.platform";
/*     */   public static final String PLATFORM_NAME_WIN_32 = "windows-x32";
/*     */   public static final String PLATFORM_NAME_WIN_64 = "windows-x64";
/*     */   public static final String PLATFORM_NAME_WIN_ARM64 = "windows-arm64";
/*  48 */   private static volatile String currentApplicationId = null;
/*  49 */   private static volatile Application currentApplication = null;
/*  50 */   private static volatile InstallerConfig currentConfig = null;
/*     */   
/*     */   public static void setCurrentApplicationId(String currentApplicationId) {
/*  53 */     if (InstallerConfig.currentApplicationId != null) {
/*  54 */       throw new IllegalStateException();
/*     */     }
/*  56 */     InstallerConfig.currentApplicationId = currentApplicationId;
/*  57 */     if (currentConfig == null) {
/*     */       try {
/*  59 */         currentConfig = new InstallerConfig(InstallerUtil.getInstallerFile("i4jparams.conf"), false);
/*  60 */       } catch (IOException e) {
/*     */         
/*  62 */         Util.showMessage("Internal error: Could not open config file.", 0);
/*  63 */         InstallerUtil.exit(1);
/*     */       } 
/*     */     }
/*     */     try {
/*  67 */       currentApplication = currentConfig.getApplicationById(currentApplicationId);
/*  68 */     } catch (Exception e) {
/*     */       
/*  70 */       Util.showMessage("Internal error: The selected application could not be instantiated.", 0);
/*  71 */       InstallerUtil.exit(1);
/*     */     } 
/*  73 */     if (currentApplication == null) {
/*     */       
/*  75 */       Util.showMessage("Internal error: The selected application " + currentApplicationId + " could not be instantiated.", 0);
/*  76 */       InstallerUtil.exit(1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void clearCurrentApplication() {
/*  81 */     currentApplicationId = null;
/*  82 */     currentApplication = null;
/*  83 */     currentConfig = null;
/*     */   }
/*     */   
/*     */   public static Map<String, String> readVariables(Element element) {
/*  87 */     return readVariables(element, (XmlHelper.XmlElementVisitor)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public static Map<String, String> readVariables(Element element, XmlHelper.XmlElementVisitor visitor) {
/*  92 */     Map<String, String> variables = new HashMap<>();
/*     */     
/*  94 */     for (Element variableElement : childElements(element)) {
/*  95 */       String name = readAttribute(variableElement, "name", (String)null);
/*  96 */       String value = readAttribute(variableElement, "value", (String)null);
/*  97 */       if (name != null) {
/*  98 */         if (visitor != null) {
/*  99 */           visitor.visit(variableElement);
/*     */         }
/* 101 */         if (value != null) {
/* 102 */           variables.put(name, value);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 107 */     return Collections.unmodifiableMap(variables);
/*     */   }
/*     */   
/*     */   public static InstallerConfig getCurrentInstance() {
/* 111 */     return currentConfig;
/*     */   }
/*     */   
/*     */   public static Application getCurrentApplication() {
/* 115 */     return currentApplication;
/*     */   }
/*     */   
/*     */   public static String getCurrentApplicationId() {
/* 119 */     return currentApplicationId;
/*     */   }
/*     */   
/*     */   public static boolean isInstaller() {
/* 123 */     return Objects.equals("installer", currentApplicationId);
/*     */   }
/*     */   
/*     */   public static boolean isUninstaller() {
/* 127 */     return Objects.equals("uninstaller", currentApplicationId);
/*     */   }
/*     */   
/*     */   public static InstallerConfig getGeneralConfigFromFile(File configFile) throws IOException {
/* 131 */     return new InstallerConfig(configFile, true);
/*     */   }
/*     */   
/*     */   public static InstallerConfig getConfigFromFile(File configFile) throws IOException {
/* 135 */     return new InstallerConfig(configFile, false);
/*     */   }
/*     */   
/* 138 */   private String install4jVersion = "";
/* 139 */   private String install4jBuild = "";
/*     */   
/*     */   private String type;
/*     */   
/*     */   private boolean archive;
/* 144 */   private String applicationName = "";
/* 145 */   private String applicationVersion = "";
/* 146 */   private String defaultInstallationDirectory = "";
/* 147 */   private String jreSharingKey = "";
/* 148 */   private String jreVersion = "";
/* 149 */   private Map<String, StyleBeanConfig> styleIdToConfig = new HashMap<>();
/* 150 */   private Map<String, ApplicationBeanConfig> applicationIdToConfig = new HashMap<>();
/* 151 */   private Map<String, ScriptClassOrigin> classNameToScriptClassOrigin = new HashMap<>();
/* 152 */   private List<FilesetConfig> filesets = Collections.emptyList();
/* 153 */   private List<ComponentConfig> components = Collections.emptyList();
/* 154 */   private ComponentFolderConfig componentRoot = new ComponentFolderConfig(null);
/* 155 */   private List<LauncherConfig> launchers = Collections.emptyList();
/*     */   private List<String> uninstallDeleteEntries;
/* 157 */   private String minJavaVersion = "";
/* 158 */   private String publisherName = "";
/* 159 */   private String publisherURL = "";
/* 160 */   private String mediaName = "";
/* 161 */   private String mediaSetId = "";
/* 162 */   private String uninstallerPath = "uninstall";
/* 163 */   private String uninstallerDirectory = ".";
/*     */   
/*     */   private boolean privilegedInstallerRequest;
/*     */   
/*     */   private String projectCrc;
/*     */   
/*     */   private File installationDirectory;
/* 170 */   private String downloadURL = "";
/*     */   
/* 172 */   private List<String> customJars = Collections.emptyList();
/*     */   
/* 174 */   private String status = "";
/*     */   
/* 176 */   private List<LanguageConfig> languages = Collections.emptyList();
/*     */   private boolean skipLanguageSelection = false;
/*     */   private boolean languageSelectionInPrincipalLanguage = false;
/* 179 */   private Map<String, String> compilerVariables = Collections.emptyMap();
/*     */   
/* 181 */   private Map<String, RootConfig> externalRoots = Collections.emptyMap();
/*     */   
/* 183 */   private String applicationId = "";
/*     */   private int installerType;
/* 185 */   private String addonAppId = "";
/*     */   private boolean suggestPreviousLocations = true;
/*     */   private boolean lzmaCompression = false;
/*     */   private boolean pack200Compression = false;
/* 189 */   private Bitness bitness = Bitness.UNDEFINED;
/*     */   
/* 191 */   private InstallerLookAndFeelConfig lookAndFeelConfig = new InstallerLookAndFeelConfig();
/* 192 */   private FileOptionsConfig fileOptionsConfig = new FileOptionsConfig();
/* 193 */   private WindowsSpecificConfig windowsSpecificConfig = new WindowsSpecificConfig();
/* 194 */   private MacSpecificConfig macSpecificConfig = new MacSpecificConfig();
/* 195 */   private UnixSpecificConfig unixSpecificConfig = new UnixSpecificConfig();
/*     */   
/* 197 */   private transient Map<File, File> mappedToUncDirectories = new HashMap<>();
/*     */   
/*     */   private boolean readGeneralOnly;
/*     */   
/*     */   private final File configFile;
/*     */   
/*     */   private InstallerConfig(File configFile, boolean readGeneralOnly) throws IOException {
/* 204 */     this.readGeneralOnly = readGeneralOnly;
/*     */     
/* 206 */     Document document = XmlHelper.parseFile(configFile);
/* 207 */     read(document.getDocumentElement());
/* 208 */     this.configFile = configFile;
/*     */   }
/*     */   
/*     */   public File getConfigFile() {
/* 212 */     return this.configFile;
/*     */   }
/*     */   
/*     */   public String getInstall4jVersion() {
/* 216 */     return this.install4jVersion;
/*     */   }
/*     */   
/*     */   public String getInstall4jBuild() {
/* 220 */     return this.install4jBuild;
/*     */   }
/*     */   
/*     */   public String getProjectCrc() {
/* 224 */     return this.projectCrc;
/*     */   }
/*     */   
/*     */   public String getMediaSetId() {
/* 228 */     return this.mediaSetId;
/*     */   }
/*     */   
/*     */   public String getApplicationVersion() {
/* 232 */     return this.applicationVersion;
/*     */   }
/*     */   
/*     */   public void setApplicationVersion(String applicationVersion) {
/* 236 */     this.applicationVersion = applicationVersion;
/*     */   }
/*     */   
/*     */   public String getMinJavaVersion() {
/* 240 */     return this.minJavaVersion;
/*     */   }
/*     */   
/*     */   public String getMediaName() {
/* 244 */     return this.mediaName;
/*     */   }
/*     */   
/*     */   public boolean isLzmaCompression() {
/* 248 */     return this.lzmaCompression;
/*     */   }
/*     */   
/*     */   public String getType() {
/* 252 */     return this.type;
/*     */   }
/*     */   
/*     */   public boolean isArchive() {
/* 256 */     return this.archive;
/*     */   }
/*     */   
/*     */   public String getJreSharingKey() {
/* 260 */     return this.jreSharingKey;
/*     */   }
/*     */   
/*     */   public String getJreVersion() {
/* 264 */     return this.jreVersion;
/*     */   }
/*     */   
/*     */   public String getApplicationName() {
/* 268 */     return InstallerVariables.replaceVariables(this.applicationName);
/*     */   }
/*     */   
/*     */   public String getApplicationNameWithVersion() {
/* 272 */     String ret = getApplicationName();
/* 273 */     if (getApplicationVersion().trim().length() > 0 && !getApplicationName().contains(getApplicationVersion())) {
/* 274 */       ret = ret + " " + getApplicationVersion();
/*     */     }
/* 276 */     return ret;
/*     */   }
/*     */   
/*     */   public File getInstallationDirectory(ContextImpl context) {
/* 280 */     HelperCommunication.helperUnsupported();
/*     */     
/* 282 */     if (this.installationDirectory == null) {
/* 283 */       this.installationDirectory = getInitialInstallationDirectory(context);
/*     */     }
/* 285 */     return this.installationDirectory;
/*     */   }
/*     */   
/*     */   public void addUncMapping(File mappedDir, File uncDir) {
/* 289 */     HelperCommunication.helperUnsupported();
/* 290 */     this.mappedToUncDirectories.put(mappedDir, uncDir);
/*     */   }
/*     */   
/*     */   public void setInstallationDirectory(File installationDirectory) {
/* 294 */     if (!installationDirectory.isAbsolute()) {
/*     */       try {
/* 296 */         installationDirectory = (new File(InstallerVariables.getMediaDir(), installationDirectory.getPath())).getCanonicalFile();
/* 297 */       } catch (IOException e) {
/* 298 */         e.printStackTrace();
/*     */         return;
/*     */       } 
/*     */     } else {
/* 302 */       File uncDir = this.mappedToUncDirectories.get(installationDirectory);
/* 303 */       if (uncDir != null) {
/* 304 */         installationDirectory = uncDir;
/* 305 */       } else if (!Objects.equals(System.getProperty("install4j.uncConversion"), "false") && !InstallerUtil.isOnNonExistingDrive(installationDirectory)) {
/* 306 */         String universalPathName = FolderInfo.getUniversalPathName(installationDirectory.getAbsolutePath());
/* 307 */         if (!Objects.equals(universalPathName, installationDirectory.getAbsolutePath())) {
/* 308 */           File uncFile = new File(universalPathName);
/* 309 */           Logger.getInstance().log(null, "using unc path " + universalPathName, true);
/* 310 */           installationDirectory = uncFile;
/*     */         } 
/*     */       } 
/*     */     } 
/* 314 */     this.installationDirectory = installationDirectory;
/*     */   }
/*     */   
/*     */   public static boolean canInstallTo(final File targetDir) {
/* 318 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.MAXIMUM, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws Exception {
/* 321 */             File file = targetDir;
/* 322 */             while (file != null && !file.exists()) {
/* 323 */               file = file.getParentFile();
/*     */             }
/* 325 */             if (file == null) {
/* 326 */               return false;
/*     */             }
/*     */             try {
/* 329 */               return Files.isWritable(file.toPath());
/* 330 */             } catch (Throwable t) {
/* 331 */               return false;
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public static File getInstallationDirWithSingleBundle(File installationDirectory) {
/* 339 */     if (installationDirectory != null && Util.isMacosInstaller() && getCurrentInstance().getMacSpecificConfig().isSingleBundle()) {
/* 340 */       return new File(installationDirectory, getCurrentInstance().getMacSpecificConfig().getSingleBundleName());
/*     */     }
/* 342 */     return installationDirectory;
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean hasAllUserInstallationRights(boolean root) {
/*     */     // Byte code:
/*     */     //   0: invokestatic isMacOS : ()Z
/*     */     //   3: ifeq -> 19
/*     */     //   6: iload_0
/*     */     //   7: ifne -> 19
/*     */     //   10: invokestatic isAdminGroup : ()Z
/*     */     //   13: ifeq -> 25
/*     */     //   16: goto -> 43
/*     */     //   19: invokestatic hasFullAdminRights : ()Z
/*     */     //   22: ifne -> 43
/*     */     //   25: invokestatic getInstance : ()Lcom/install4j/runtime/installer/helper/comm/HelperCommunication;
/*     */     //   28: invokevirtual hasElevatedHelper : ()Z
/*     */     //   31: ifne -> 43
/*     */     //   34: invokestatic getInstance : ()Lcom/install4j/runtime/installer/helper/comm/HelperCommunication;
/*     */     //   37: invokevirtual isElevatedHelper : ()Z
/*     */     //   40: ifeq -> 47
/*     */     //   43: iconst_1
/*     */     //   44: goto -> 48
/*     */     //   47: iconst_0
/*     */     //   48: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #347	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	49	0	root	Z
/*     */   }
/*     */   
/*     */   private File getInitialInstallationDirectory(ContextImpl context) {
/* 351 */     boolean checkedAllUserRights = false;
/* 352 */     if (context.getVariable("sys.resolveUserSpecificInstallationDir") == null) {
/* 353 */       String compilerValue = context.getCompilerVariable("sys.resolveUserSpecificInstallationDir");
/* 354 */       if (compilerValue != null) {
/* 355 */         context.setVariable("sys.resolveUserSpecificInstallationDir", compilerValue);
/*     */       } else {
/* 357 */         checkedAllUserRights = true;
/* 358 */         context.setVariable("sys.resolveUserSpecificInstallationDir", String.valueOf((!hasAllUserInstallationRights(false) && !getCurrentInstance().isPrivilegedInstallerRequest())));
/*     */       } 
/*     */     } 
/* 361 */     boolean macAdminGroupOnly = (Util.isMacOS() && checkedAllUserRights && !getCurrentInstance().isPrivilegedInstallerRequest() && !context.getBooleanVariable("sys.resolveUserSpecificInstallationDir") && !hasAllUserInstallationRights(true));
/*     */     
/* 363 */     if (isSuggestPreviousLocations()) {
/* 364 */       File possibleTargetDir = findPreviousInstallationDirectory(context);
/* 365 */       if (possibleTargetDir != null && ((
/* 366 */         !context.getBooleanVariable("sys.resolveUserSpecificInstallationDir") && !macAdminGroupOnly) || canInstallTo(getInstallationDirWithSingleBundle(possibleTargetDir)))) {
/* 367 */         return possibleTargetDir;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 372 */     File dir = getDefaultResolvedInstallationDirectory();
/* 373 */     if (macAdminGroupOnly && !canInstallTo(getInstallationDirWithSingleBundle(dir))) {
/* 374 */       context.setVariable("sys.resolveUserSpecificInstallationDir", Boolean.valueOf(true));
/* 375 */       dir = getDefaultResolvedInstallationDirectory();
/*     */     } 
/* 377 */     return dir;
/*     */   }
/*     */   
/*     */   private File findPreviousInstallationDirectory(ContextImpl context) {
/*     */     try {
/* 382 */       String targetApplicationId = getTargetApplicationId();
/*     */       
/* 384 */       String previousLocation = InstallRegistry.getInstallationDir(targetApplicationId);
/* 385 */       if (previousLocation != null && previousLocation.trim().length() > 0) {
/* 386 */         String singleBundleName = InstallRegistry.getSingleBundleName(targetApplicationId, previousLocation);
/*     */         
/* 388 */         File possibleTargetDir = new File(previousLocation);
/* 389 */         if (Util.isMacosInstaller() && isAddOnInstaller() && singleBundleName != null) {
/* 390 */           possibleTargetDir = new File(possibleTargetDir, singleBundleName + "/" + "Contents/Resources/app");
/*     */         }
/*     */         
/* 393 */         if (Util.isMacosInstaller() && ((!getMacSpecificConfig().isSingleBundle() && singleBundleName != null) || (getMacSpecificConfig().isSingleBundle() && singleBundleName == null)))
/* 394 */           return null; 
/* 395 */         if ((new File(previousLocation)).getParentFile() == null)
/* 396 */           return null; 
/* 397 */         if (Boolean.getBoolean("install4j.noPreviousExistenceCheck") || CompilerVariableHelper.getCompilerExtensionVariable((Context)context, "noPreviousExistenceCheck", false)) {
/* 398 */           return possibleTargetDir;
/*     */         }
/* 400 */         ApplicationRegistryImpl.ApplicationInfoImpl applicationInfo = ApplicationRegistryImpl.getApplicationInfoByDir(new File(previousLocation + ((singleBundleName != null) ? ("/" + singleBundleName) : "")));
/* 401 */         if (applicationInfo != null && Objects.equals(targetApplicationId, applicationInfo.getId())) {
/* 402 */           if (Boolean.getBoolean("install4j.noPreviousBitnessCheck") || CompilerVariableHelper.getCompilerExtensionVariable((Context)context, "noPreviousBitnessCheck", false))
/* 403 */             return possibleTargetDir; 
/* 404 */           if (applicationInfo.getBitness().isCompatible()) {
/* 405 */             if (!Util.isWindowsInstaller() || !CompilerVariableHelper.getCompilerExtensionVariable((Context)context, "previousArchitectureCheck", false))
/* 406 */               return possibleTargetDir; 
/* 407 */             if (Misc.getMachine() != PE32Handler.Machine.ARM64 || InstallerUtil.isAaarch64() == "windows-arm64".equals(applicationInfo.getCompilerVariable("sys.platform"))) {
/* 408 */               return possibleTargetDir;
/*     */             }
/* 410 */             Logger.getInstance().info(null, "platform " + applicationInfo.getCompilerVariable("sys.platform") + " from " + previousLocation + " is not compatible");
/* 411 */             return null;
/*     */           } 
/*     */           
/* 414 */           Logger.getInstance().info(null, "bitness " + applicationInfo.getBitness() + " from " + previousLocation + " is not compatible");
/* 415 */           return null;
/*     */         }
/*     */       
/*     */       }
/*     */     
/* 420 */     } catch (Throwable t) {
/* 421 */       Logger.getInstance().log(t);
/*     */     } 
/* 423 */     return null;
/*     */   }
/*     */   
/*     */   public File getDefaultResolvedInstallationDirectory() {
/* 427 */     String initialInstallationDir = EnvironmentUtil.replaceEnvironmentVariables(InstallerVariables.replaceVariables(InstallerUtil.replaceHomeDir(this.defaultInstallationDirectory), ReplacementMode.PLAIN, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */     int varStartPos;
/* 429 */     while ((varStartPos = initialInstallationDir.indexOf('{')) > -1) {
/* 430 */       int varEndPos = initialInstallationDir.indexOf('}', varStartPos);
/* 431 */       if (varEndPos < 0) {
/*     */         break;
/*     */       }
/* 434 */       String variable = initialInstallationDir.substring(varStartPos, varEndPos + 1);
/*     */ 
/*     */ 
/*     */       
/* 438 */       initialInstallationDir = initialInstallationDir.substring(0, varStartPos) + getVariableValue(variable) + initialInstallationDir.substring(varEndPos + 1);
/*     */     } 
/*     */     
/* 441 */     return new File(initialInstallationDir);
/*     */   }
/*     */   
/*     */   private static String getVariableValue(String variableName) {
/* 445 */     if (Objects.equals(variableName, "{/}"))
/* 446 */       return File.separator; 
/* 447 */     if (Objects.equals(variableName, "{appdir}")) {
/* 448 */       return InstallerUtil.getStandardApplicationsDirectory(InstallerVariables.getBooleanVariable("sys.resolveUserSpecificInstallationDir"));
/*     */     }
/* 450 */     return "";
/*     */   }
/*     */ 
/*     */   
/*     */   public List<AbstractBeanConfig> getApplicationScreens() {
/* 455 */     ApplicationBeanConfig applicationConfig = getApplicationConfigById(currentApplicationId);
/* 456 */     if (applicationConfig == null) {
/* 457 */       return Collections.emptyList();
/*     */     }
/* 459 */     return applicationConfig.getScreenConfigs();
/*     */   }
/*     */ 
/*     */   
/*     */   public InstallerApplication getInstallerApplication() {
/* 464 */     return (InstallerApplication)getApplicationById("installer");
/*     */   }
/*     */   
/*     */   public UninstallerApplication getUninstallerApplication() {
/* 468 */     return (UninstallerApplication)getApplicationById("uninstaller");
/*     */   }
/*     */   
/*     */   public Application getApplicationById(String id) {
/* 472 */     ApplicationBeanConfig applicationConfig = getApplicationConfigById(id);
/* 473 */     if (applicationConfig != null) {
/* 474 */       return applicationConfig.getOrInstantiateApplication(false);
/*     */     }
/* 476 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public StyleBeanConfig getStyleConfigById(@NotNull String id) {
/* 481 */     return this.styleIdToConfig.get(id);
/*     */   }
/*     */   
/*     */   public ApplicationBeanConfig getApplicationConfigById(String id) {
/* 485 */     return this.applicationIdToConfig.get(id);
/*     */   }
/*     */   
/*     */   public ApplicationBeanConfig getCurrentApplicationConfig() {
/* 489 */     return this.applicationIdToConfig.get(currentApplicationId);
/*     */   }
/*     */   
/*     */   public Map<String, ScriptClassOrigin> getClassNameToScriptClassOrigin() {
/* 493 */     return this.classNameToScriptClassOrigin;
/*     */   }
/*     */   
/*     */   public String getPublisherName() {
/* 497 */     return InstallerVariables.replaceVariables(this.publisherName);
/*     */   }
/*     */   
/*     */   public String getPublisherURL() {
/* 501 */     return InstallerVariables.replaceVariables(this.publisherURL);
/*     */   }
/*     */   
/*     */   public String getDownloadURL() {
/* 505 */     return InstallerVariables.replaceVariables(this.downloadURL);
/*     */   }
/*     */   
/*     */   public String getStatus() {
/* 509 */     return this.status;
/*     */   }
/*     */   
/*     */   public List<FilesetConfig> getFilesets() {
/* 513 */     return this.filesets;
/*     */   }
/*     */   
/*     */   public List<ComponentConfig> getComponents() {
/* 517 */     return this.components;
/*     */   }
/*     */   
/*     */   public ComponentConfig getComponentById(String id) {
/* 521 */     for (ComponentConfig componentConfig : this.components) {
/* 522 */       if (Objects.equals(componentConfig.getId(), id)) {
/* 523 */         return componentConfig;
/*     */       }
/*     */     } 
/* 526 */     return null;
/*     */   }
/*     */   
/*     */   public ComponentNodeConfig getComponentNodeById(String id) {
/* 530 */     return getComponentNodeById(id, this.componentRoot);
/*     */   }
/*     */   
/*     */   private ComponentNodeConfig getComponentNodeById(String id, ComponentFolderConfig componentFolderConfig) {
/* 534 */     for (ComponentNodeConfig componentNodeConfig : componentFolderConfig.getComponents()) {
/* 535 */       if (Objects.equals(componentNodeConfig.getId(), id))
/* 536 */         return componentNodeConfig; 
/* 537 */       if (componentNodeConfig instanceof ComponentFolderConfig) {
/* 538 */         ComponentNodeConfig result = getComponentNodeById(id, (ComponentFolderConfig)componentNodeConfig);
/* 539 */         if (result != null) {
/* 540 */           return result;
/*     */         }
/*     */       } 
/*     */     } 
/* 544 */     return null;
/*     */   }
/*     */   
/*     */   public ComponentFolderConfig getComponentRoot() {
/* 548 */     return this.componentRoot;
/*     */   }
/*     */   
/*     */   public List<LauncherConfig> getLaunchers() {
/* 552 */     return this.launchers;
/*     */   }
/*     */   
/*     */   public LauncherConfig getLauncherConfigById(String id) {
/* 556 */     for (LauncherConfig launcherConfig : this.launchers) {
/* 557 */       if (launcherConfig.getId().equals(id) || launcherConfig.getDisplayedId().equals(id)) {
/* 558 */         return launcherConfig;
/*     */       }
/*     */     } 
/* 561 */     return null;
/*     */   }
/*     */   
/*     */   public Bitness getBitness() {
/* 565 */     return this.bitness;
/*     */   }
/*     */   
/*     */   public List<String> getUninstallDeleteEntries() {
/* 569 */     List<String> uninstallDeleteEntries = this.uninstallDeleteEntries;
/* 570 */     return (uninstallDeleteEntries == null) ? Collections.<String>emptyList() : uninstallDeleteEntries;
/*     */   }
/*     */   
/*     */   public FileOptions getOptions(String fileName) {
/* 574 */     return this.fileOptionsConfig.getOptions(fileName);
/*     */   }
/*     */   
/*     */   public FileOptionsConfig getFileOptionsConfig() {
/* 578 */     return this.fileOptionsConfig;
/*     */   }
/*     */   
/*     */   public InstallerLookAndFeelConfig getLookAndFeelConfig() {
/* 582 */     return this.lookAndFeelConfig;
/*     */   }
/*     */   
/*     */   public WindowsSpecificConfig getWindowsSpecificConfig() {
/* 586 */     return this.windowsSpecificConfig;
/*     */   }
/*     */   
/*     */   public MacSpecificConfig getMacSpecificConfig() {
/* 590 */     return this.macSpecificConfig;
/*     */   }
/*     */   
/*     */   public UnixSpecificConfig getUnixSpecificConfig() {
/* 594 */     return this.unixSpecificConfig;
/*     */   }
/*     */   
/*     */   public List<LanguageConfig> getLanguages() {
/* 598 */     return this.languages;
/*     */   }
/*     */   
/*     */   public boolean isSkipLanguageSelection() {
/* 602 */     return this.skipLanguageSelection;
/*     */   }
/*     */   
/*     */   public boolean isLanguageSelectionInPrincipalLanguage() {
/* 606 */     return this.languageSelectionInPrincipalLanguage;
/*     */   }
/*     */   
/*     */   public LanguageConfig getLanguageById(String languageId) {
/* 610 */     for (LanguageConfig languageConfig : this.languages) {
/* 611 */       if (Objects.equals(languageConfig.getId(), languageId)) {
/* 612 */         return languageConfig;
/*     */       }
/*     */     } 
/* 615 */     int underscoreIndex = languageId.indexOf('_');
/* 616 */     if (underscoreIndex > -1) {
/* 617 */       return getLanguageById(languageId.substring(0, underscoreIndex));
/*     */     }
/* 619 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, String> getCompilerVariables() {
/* 624 */     return this.compilerVariables;
/*     */   }
/*     */   
/*     */   public String getApplicationId() {
/* 628 */     return this.applicationId;
/*     */   }
/*     */   
/*     */   public void setApplicationId(String applicationId) {
/* 632 */     this.applicationId = applicationId;
/* 633 */     CRC32 crc = new CRC32();
/* 634 */     crc.update(applicationId.getBytes(StandardCharsets.UTF_8));
/* 635 */     this.projectCrc = Long.toString(crc.getValue(), 36);
/*     */   }
/*     */   
/*     */   public int getInstallerType() {
/* 639 */     return this.installerType;
/*     */   }
/*     */   
/*     */   public String getAddonAppId() {
/* 643 */     return this.addonAppId;
/*     */   }
/*     */   
/*     */   public void setAddonAppId(String addonAppId) {
/* 647 */     this.addonAppId = addonAppId;
/*     */   }
/*     */   
/*     */   public boolean isSuggestPreviousLocations() {
/* 651 */     return this.suggestPreviousLocations;
/*     */   }
/*     */   
/*     */   public boolean isPack200Compression() {
/* 655 */     return this.pack200Compression;
/*     */   }
/*     */   
/*     */   public List<String> getCustomJars() {
/* 659 */     return this.customJars;
/*     */   }
/*     */   
/*     */   public String getUninstallerPath() {
/* 663 */     return this.uninstallerPath;
/*     */   }
/*     */   
/*     */   public String getUninstallerDirectory() {
/* 667 */     return this.uninstallerDirectory;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void read(Element rootElement) {
/* 672 */     this.install4jVersion = readAttribute(rootElement, "install4jVersion", this.install4jVersion);
/* 673 */     this.install4jBuild = readAttribute(rootElement, "install4jBuild", this.install4jBuild);
/* 674 */     this.type = readAttribute(rootElement, "type", this.type);
/* 675 */     this.archive = readAttribute(rootElement, "archive", this.archive);
/* 676 */     this.bitness = readAttribute(rootElement, "bitness", this.bitness);
/*     */     
/* 678 */     Element generalElement = null;
/*     */     
/* 680 */     for (Element element : childElements(rootElement)) {
/* 681 */       String elementName = element.getTagName();
/* 682 */       if (Objects.equals(elementName, "general")) {
/* 683 */         generalElement = element;
/* 684 */         readGeneral(element);
/* 685 */       } else if (Objects.equals(elementName, "compilerVariables")) {
/* 686 */         this.compilerVariables = readVariables(element);
/*     */       } 
/* 688 */       if (!this.readGeneralOnly) {
/* 689 */         if (Objects.equals(elementName, "languages")) {
/* 690 */           readLanguages(element); continue;
/* 691 */         }  if (Objects.equals(elementName, "externalRoots")) {
/* 692 */           readRoots(element); continue;
/* 693 */         }  if (Objects.equals(elementName, "customCode")) {
/* 694 */           readCustomCode(element); continue;
/* 695 */         }  if (Objects.equals(elementName, "styles")) {
/* 696 */           readStyles(element); continue;
/* 697 */         }  if (Objects.equals(elementName, "lookAndFeel")) {
/* 698 */           this.lookAndFeelConfig.read(element); continue;
/* 699 */         }  if (Objects.equals(elementName, "applications")) {
/* 700 */           readScreens(element); continue;
/* 701 */         }  if (Objects.equals(elementName, "scriptClassOrigins")) {
/* 702 */           readScriptClassOrigins(element); continue;
/* 703 */         }  if (Objects.equals(elementName, "fileOptions")) {
/* 704 */           this.fileOptionsConfig.read(element); continue;
/* 705 */         }  if (Objects.equals(elementName, "filesets")) {
/* 706 */           readFilesets(element); continue;
/* 707 */         }  if (Objects.equals(elementName, "components")) {
/* 708 */           readComponents(element); continue;
/* 709 */         }  if (Objects.equals(elementName, "launchers")) {
/* 710 */           readLaunchers(element); continue;
/* 711 */         }  if (Objects.equals(elementName, "uninstallDelete")) {
/* 712 */           readUninstallDelete(element); continue;
/* 713 */         }  if (Objects.equals(elementName, "windowsSpecific")) {
/* 714 */           this.windowsSpecificConfig.read(element); continue;
/* 715 */         }  if (Objects.equals(elementName, "macSpecific")) {
/* 716 */           this.macSpecificConfig.read(element); continue;
/* 717 */         }  if (Objects.equals(elementName, "unixSpecific")) {
/* 718 */           this.unixSpecificConfig.read(element); continue;
/* 719 */         }  if (Objects.equals(elementName, "uninstallerScreens")) {
/* 720 */           readLegacyUninstallerScreens(element, generalElement);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void readLegacyUninstallerScreens(Element element, Element generalElement) {
/* 727 */     ApplicationBeanConfig applicationConfig = new LegacyUninstallerBeanConfig(generalElement);
/* 728 */     applicationConfig.read(element);
/* 729 */     this.applicationIdToConfig.put(applicationConfig.getId(), applicationConfig);
/*     */   }
/*     */ 
/*     */   
/*     */   private void readCustomCode(Element element) {
/* 734 */     List<String> customJars = new LinkedList<>();
/*     */     
/* 736 */     for (Element variableElement : childElements(element)) {
/* 737 */       String name = readAttribute(variableElement, "name", (String)null);
/* 738 */       if (name != null) {
/* 739 */         customJars.add(name);
/*     */       }
/*     */     } 
/*     */     
/* 743 */     this.customJars = Collections.unmodifiableList(customJars);
/*     */   }
/*     */ 
/*     */   
/*     */   private void readGeneral(Element element) {
/* 748 */     this.applicationName = readAttribute(element, "applicationName", this.applicationName);
/* 749 */     this.defaultInstallationDirectory = readAttribute(element, "defaultInstallationDirectory", this.defaultInstallationDirectory);
/* 750 */     this.status = readAttribute(element, "status", this.status);
/* 751 */     this.jreSharingKey = readAttribute(element, "jreSharingKey", this.jreSharingKey);
/* 752 */     this.jreVersion = readAttribute(element, "jreVersion", this.jreVersion);
/* 753 */     this.minJavaVersion = readAttribute(element, "minJavaVersion", this.minJavaVersion);
/* 754 */     this.publisherName = readAttribute(element, "publisherName", this.publisherName);
/* 755 */     this.publisherURL = readAttribute(element, "publisherURL", this.publisherURL);
/* 756 */     this.mediaName = readAttribute(element, "mediaName", this.mediaName);
/* 757 */     this.applicationVersion = readAttribute(element, "applicationVersion", this.applicationVersion);
/* 758 */     this.lzmaCompression = readAttribute(element, "lzmaCompression", this.lzmaCompression);
/* 759 */     this.pack200Compression = readAttribute(element, "pack200Compression", this.pack200Compression);
/* 760 */     this.downloadURL = readAttribute(element, "downloadURL", this.downloadURL);
/* 761 */     this.mediaSetId = readAttribute(element, "mediaSetId", this.mediaSetId);
/*     */     
/* 763 */     setApplicationId(readAttribute(element, "applicationId", this.applicationId));
/* 764 */     this.installerType = readAttribute(element, "installerType", this.installerType);
/* 765 */     this.addonAppId = readAttribute(element, "addOnAppId", this.addonAppId);
/* 766 */     this.suggestPreviousLocations = readAttribute(element, "suggestPreviousLocations", this.suggestPreviousLocations);
/* 767 */     this.uninstallerPath = readFileAttribute(element, "uninstallerFilename", this.uninstallerPath);
/* 768 */     this.uninstallerDirectory = readFileAttribute(element, "uninstallerDirectory", this.uninstallerPath);
/* 769 */     this.privilegedInstallerRequest = readAttribute(element, "privilegedInstallerRequest", this.privilegedInstallerRequest);
/*     */   }
/*     */ 
/*     */   
/*     */   private void readLanguages(Element element) {
/* 774 */     this.skipLanguageSelection = readAttribute(element, "skipLanguageSelection", this.skipLanguageSelection);
/* 775 */     this.languageSelectionInPrincipalLanguage = readAttribute(element, "languageSelectionInPrincipalLanguage", this.languageSelectionInPrincipalLanguage);
/*     */     
/* 777 */     List<LanguageConfig> languages = new LinkedList<>();
/*     */     
/* 779 */     for (Element languageElement : childElements(element)) {
/* 780 */       LanguageConfig languageConfig = new LanguageConfig();
/* 781 */       languageConfig.read(languageElement);
/* 782 */       languages.add(languageConfig);
/*     */     } 
/*     */ 
/*     */     
/* 786 */     this.languages = Collections.unmodifiableList(languages);
/*     */   }
/*     */ 
/*     */   
/*     */   private void readRoots(Element element) {
/* 791 */     this.externalRoots = new HashMap<>();
/*     */     
/* 793 */     for (Element rootElement : childElements(element)) {
/* 794 */       RootConfig rootConfig = new RootConfig();
/* 795 */       rootConfig.read(rootElement);
/* 796 */       this.externalRoots.put(rootConfig.getId(), rootConfig);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void readStyles(Element element) {
/* 801 */     for (Element styleElement : childElements(element)) {
/* 802 */       StyleBeanConfig styleConfig; String tagName = styleElement.getTagName();
/*     */       
/* 804 */       if (tagName.equals("overriddenStyle")) {
/* 805 */         styleConfig = new OverriddenStyleBeanConfig();
/*     */       } else {
/* 807 */         styleConfig = new StyleBeanConfig();
/*     */       } 
/* 809 */       styleConfig.read(styleElement);
/* 810 */       this.styleIdToConfig.put(styleConfig.getIdInNamespace(styleConfig.getId()), styleConfig);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void readScreens(Element element) {
/* 815 */     for (Element applicationElement : childElements(element)) {
/* 816 */       ApplicationBeanConfig applicationConfig = new ApplicationBeanConfig();
/* 817 */       applicationConfig.read(applicationElement);
/* 818 */       String prefix = "";
/* 819 */       if (applicationConfig.getIdNamespace().length() > 0) {
/* 820 */         prefix = applicationConfig.getIdNamespace() + ":";
/*     */       }
/* 822 */       String id = applicationConfig.getId();
/* 823 */       String displayedId = applicationConfig.getDisplayedId();
/* 824 */       this.applicationIdToConfig.put(prefix + id, applicationConfig);
/* 825 */       if (!Objects.equals(id, displayedId)) {
/* 826 */         this.applicationIdToConfig.put(prefix + displayedId, applicationConfig);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void readScriptClassOrigins(Element element) {
/* 833 */     this.classNameToScriptClassOrigin.clear();
/*     */     
/* 835 */     for (Element scriptClassOriginElement : childElements(element)) {
/* 836 */       ScriptClassOrigin scriptClassOrigin = new ScriptClassOrigin();
/* 837 */       scriptClassOrigin.read(scriptClassOriginElement);
/*     */       
/* 839 */       this.classNameToScriptClassOrigin.put(scriptClassOrigin.getClassName(), scriptClassOrigin);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void readUninstallDelete(Element element) {
/* 844 */     List<String> uninstallDeleteEntries = new ArrayList<>();
/*     */     
/* 846 */     for (Element entryElement : childElements(element)) {
/* 847 */       String fileName = readAttribute(entryElement, "name", "");
/* 848 */       if (!Objects.equals(fileName, "")) {
/* 849 */         uninstallDeleteEntries.add(fileName);
/*     */       }
/*     */     } 
/*     */     
/* 853 */     this.uninstallDeleteEntries = Collections.unmodifiableList(uninstallDeleteEntries);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void readFilesets(Element element) {
/* 859 */     this.filesets = new LinkedList<>();
/* 860 */     for (Element filesetElement : childElements(element)) {
/* 861 */       FilesetConfig filesetConfig = new FilesetConfig();
/* 862 */       filesetConfig.read(filesetElement);
/* 863 */       this.filesets.add(filesetConfig);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void readComponents(Element element) {
/* 869 */     List<ComponentConfig> components = new LinkedList<>();
/* 870 */     this.componentRoot.read(element);
/* 871 */     collectComponents(this.componentRoot.getComponents(), components);
/*     */     
/* 873 */     this.components = Collections.unmodifiableList(components);
/*     */     
/* 875 */     for (ComponentConfig componentConfig : components) {
/* 876 */       componentConfig.notifyDependentComponents(this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void collectComponents(List<ComponentNodeConfig> componentNodes, List<ComponentConfig> components) {
/* 882 */     for (ComponentNodeConfig componentNodeConfig : componentNodes) {
/* 883 */       if (componentNodeConfig instanceof ComponentConfig) {
/* 884 */         components.add((ComponentConfig)componentNodeConfig); continue;
/* 885 */       }  if (componentNodeConfig instanceof ComponentFolderConfig) {
/* 886 */         collectComponents(((ComponentFolderConfig)componentNodeConfig).getComponents(), components);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void readLaunchers(Element element) {
/* 893 */     List<LauncherConfig> launchers = new LinkedList<>();
/*     */     
/* 895 */     for (Element entryElement : childElements(element)) {
/* 896 */       LauncherConfig launcherConfig; String elementName = entryElement.getTagName();
/*     */       
/* 898 */       if (Objects.equals(elementName, "launcher")) {
/* 899 */         launcherConfig = new LauncherConfig();
/*     */       } else {
/*     */         return;
/*     */       } 
/* 903 */       launcherConfig.read(entryElement);
/* 904 */       launchers.add(launcherConfig);
/*     */     } 
/*     */     
/* 907 */     this.launchers = Collections.unmodifiableList(launchers);
/*     */   }
/*     */   
/*     */   public String getTargetApplicationId() {
/* 911 */     if (isAddOnInstaller()) {
/* 912 */       return getAddonAppId();
/*     */     }
/* 914 */     return getApplicationId();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFilesetForRootId(String rootId) {
/* 919 */     if (rootId.length() == 0) {
/* 920 */       return "";
/*     */     }
/* 922 */     RootConfig rootConfig = getRootById(rootId);
/* 923 */     return rootConfig.getFileset();
/*     */   }
/*     */ 
/*     */   
/*     */   public RootConfig getRootById(String rootId) {
/* 928 */     return this.externalRoots.get(rootId);
/*     */   }
/*     */   
/*     */   public boolean isAddOnInstaller() {
/* 932 */     return (this.installerType == 2);
/*     */   }
/*     */   
/*     */   public boolean isPrivilegedInstallerRequest() {
/* 936 */     return this.privilegedInstallerRequest;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\InstallerConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */