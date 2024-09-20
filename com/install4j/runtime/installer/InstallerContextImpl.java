/*     */ package com.install4j.runtime.installer;
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.actions.Action;
/*     */ import com.install4j.api.actions.AutoUninstallAction;
/*     */ import com.install4j.api.actions.InstallAction;
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.FileOptions;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.LauncherSetup;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UninstallMode;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.api.windows.RegistryRoot;
/*     */ import com.install4j.runtime.beans.AutoUninstallHandler;
/*     */ import com.install4j.runtime.beans.actions.services.InstallServiceAction;
/*     */ import com.install4j.runtime.installer.config.AbstractBeanConfig;
/*     */ import com.install4j.runtime.installer.config.ActionBeanConfig;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.config.LanguageConfig;
/*     */ import com.install4j.runtime.installer.config.ScreenBeanConfig;
/*     */ import com.install4j.runtime.installer.controller.ScreenExecutor;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*     */ import com.install4j.runtime.installer.helper.Install4jClassLoader;
/*     */ import com.install4j.runtime.installer.helper.InstallationProperties;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.MsiHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import com.install4j.runtime.installer.platform.macos.MacFileSystem;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectStreamException;
/*     */ import java.io.Serializable;
/*     */ import java.nio.file.FileVisitResult;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.SimpleFileVisitor;
/*     */ import java.nio.file.attribute.BasicFileAttributes;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class InstallerContextImpl extends ContextImpl implements InstallerContext, Serializable {
/*  50 */   private List<AutoUninstallAction> autoUninstallActions = new ArrayList<>(); private static final String REGVAL_REBOOT_CHECK_FILE = "RebootCheckFile";
/*     */   private static final String LOG_FILE_NAME = "installation.log";
/*     */   public static final String RESPONSE_FILE_NAME = "response.varfile";
/*  53 */   private Map<String, InstallerContext> idNamespaceToContext = new HashMap<>();
/*     */   
/*     */   private boolean updateInstallation;
/*     */   
/*     */   private File additionalUserJarsDir;
/*     */   private boolean keepAdditionalUserJars;
/*  59 */   private static List<Runnable> afterFinishActions = new ArrayList<>();
/*     */   
/*     */   public InstallerContextImpl(ScreenExecutor screenExecutor) {
/*  62 */     super(screenExecutor);
/*     */     
/*  64 */     InstallerVariables.registerVariableProvider("sys.installationDir", new InstallerVariables.VariableProvider()
/*     */         {
/*     */           public Object getVariable()
/*     */           {
/*  68 */             return InstallerContextImpl.this.getInstallationDirectory().getPath();
/*     */           }
/*     */ 
/*     */           
/*     */           public void setVariable(Object value) {
/*  73 */             if (value instanceof String) {
/*  74 */               InstallerContextImpl.this.setInstallationDirectory(new File((String)value), false);
/*     */             }
/*     */           }
/*     */         });
/*  78 */     InstallerVariables.registerResponseFileVariable("sys.installationDir");
/*     */   }
/*     */   
/*     */   public static void registerAfterFinishAction(Runnable runnable) {
/*  82 */     afterFinishActions.add(runnable);
/*     */   }
/*     */   
/*     */   public File getAdditionalUserJarsDir() {
/*  86 */     return this.additionalUserJarsDir;
/*     */   }
/*     */ 
/*     */   
/*     */   public File getInstallerFile() {
/*  91 */     String fileName = System.getProperty("exe4j.moduleName");
/*  92 */     if (fileName == null) {
/*  93 */       return null;
/*     */     }
/*  95 */     return new File(fileName);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMediaName() {
/* 101 */     return InstallerConfig.getCurrentInstance().getMediaName();
/*     */   }
/*     */ 
/*     */   
/*     */   public void applyToScreen(Screen screen, ScreenBeanConfig config) {
/* 106 */     if (screen instanceof InstallerScreen) {
/* 107 */       ((InstallerScreen)screen).setInstallerContext(getIdWrapperInstallerContext((AbstractBeanConfig)config));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public Context getIdWrapperContext(AbstractBeanConfig config) {
/* 113 */     return (Context)getIdWrapperInstallerContext(config);
/*     */   }
/*     */   
/*     */   private InstallerContext getIdWrapperInstallerContext(AbstractBeanConfig config) {
/* 117 */     String idNamespace = config.getIdNamespace();
/* 118 */     if (idNamespace.length() == 0) {
/* 119 */       return this;
/*     */     }
/* 121 */     InstallerContext wrapperContext = this.idNamespaceToContext.get(idNamespace);
/* 122 */     if (wrapperContext == null) {
/* 123 */       wrapperContext = new IdWrapperInstallerContext(this, idNamespace);
/* 124 */       this.idNamespaceToContext.put(idNamespace, wrapperContext);
/*     */     } 
/* 126 */     return wrapperContext;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean installFile(File sourceFile, File destFile) throws UserCanceledException {
/* 132 */     return FileInstaller.getInstance().install(sourceFile, destFile);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean installFile(File sourceFile, File destFile, FileOptions options) throws UserCanceledException {
/* 137 */     return FileInstaller.getInstance().install(sourceFile, destFile, options);
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerUninstallFile(File file) {
/* 142 */     FileInstaller.getInstance().registerUninstallFile(file);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean installFile(File sourceFile, File destFile, FileOptions options, ProgressInterface progressInterface, int fromPercent, int toPercent) throws UserCanceledException {
/*     */     ProgressAdapter progressAdapter;
/* 148 */     if (progressInterface != null) {
/* 149 */       progressAdapter = new ProgressAdapter(progressInterface, fromPercent, toPercent);
/*     */     }
/*     */     
/* 152 */     return FileInstaller.getInstance().install(sourceFile, destFile, options, (ProgressInterface)progressAdapter);
/*     */   }
/*     */ 
/*     */   
/*     */   public void installDirectory(File directory, UninstallMode uninstallMode) {
/* 157 */     FileInstaller.getInstance().createDirectory(directory, uninstallMode);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean performActionInt(ActionBeanConfig config) throws UserCanceledException {
/* 162 */     InstallerContext currentContext = getIdWrapperInstallerContext((AbstractBeanConfig)config);
/* 163 */     boolean ok = performActionIntStatic(config, (Context)currentContext);
/* 164 */     Action action = config.getOrInstantiateAction(false);
/* 165 */     if (ok && action instanceof AutoUninstallAction) {
/* 166 */       this.autoUninstallActions.add((AutoUninstallAction)action);
/*     */     }
/* 168 */     return ok;
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollbackActionInt(ActionBeanConfig config) {
/* 173 */     Action action = config.getOrInstantiateAction(false);
/* 174 */     InstallerContext currentContext = getIdWrapperInstallerContext((AbstractBeanConfig)config);
/* 175 */     rollbackActionIntStatic(config, (InstallAction)action, currentContext);
/*     */   }
/*     */   
/*     */   private static void rollbackActionIntStatic(ActionBeanConfig config, final InstallAction action, InstallerContext currentContext) {
/* 179 */     ContextImpl.setCurrentContext((Context)currentContext);
/*     */     try {
/* 181 */       HelperCommunication.getInstance().executeAction(config.getExecutionContext(), (CommunicationAction)new RunAction()
/*     */           {
/*     */             protected void run(Context context) {
/* 184 */               action.rollback((InstallerContext)context);
/*     */             }
/*     */           });
/*     */     } finally {
/* 188 */       ContextImpl.setCurrentContext(null);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String getLanguageId() {
/* 194 */     if (super.getLanguageId() == null) {
/*     */       
/* 196 */       InstallerConfig config = InstallerConfig.getCurrentInstance();
/* 197 */       List<LanguageConfig> languages = config.getLanguages();
/* 198 */       if (languages.size() == 1) {
/* 199 */         setLanguageId(((LanguageConfig)languages.get(0)).getId());
/* 200 */       } else if (config.isSkipLanguageSelection() || isUnattended() || config.isArchive()) {
/* 201 */         String systemLanguageId = InstallerUtil.getSupportedSystemLanguageId();
/* 202 */         if (systemLanguageId != null) {
/* 203 */           setLanguageId(systemLanguageId);
/* 204 */         } else if (isUnattended() || config.isArchive()) {
/* 205 */           setLanguageId(((LanguageConfig)InstallerConfig.getCurrentInstance().getLanguages().get(0)).getId());
/*     */         } 
/*     */       } 
/*     */     } 
/* 209 */     return super.getLanguageId();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkStart() {
/* 214 */     if (Util.isWindows() && InstallerConfig.isInstaller()) {
/* 215 */       if (checkReboot(RegistryRoot.HKEY_CURRENT_USER)) return false; 
/* 216 */       if (checkReboot(RegistryRoot.HKEY_LOCAL_MACHINE)) return false; 
/*     */     } 
/* 218 */     boolean start = super.checkStart();
/* 219 */     if (start && (Util.isMacosInstaller() || Util.isUnixInstaller())) {
/* 220 */       unpackAdditionalUserFiles();
/*     */     }
/* 222 */     return start;
/*     */   }
/*     */   
/*     */   private void unpackAdditionalUserFiles() {
/* 226 */     String userJarDirName = System.getProperty("install4j.addUserDir");
/* 227 */     if (userJarDirName != null) {
/* 228 */       this.additionalUserJarsDir = new File(userJarDirName);
/*     */     } else {
/* 230 */       File[] files = InstallerUtil.getInstallerFile("user").listFiles();
/* 231 */       if (files != null) {
/* 232 */         boolean hasPackedFile = false;
/* 233 */         for (File file : files) {
/* 234 */           if (file.getName().endsWith(".pack")) {
/* 235 */             hasPackedFile = true;
/*     */             break;
/*     */           } 
/*     */         } 
/* 239 */         if (hasPackedFile) {
/*     */           try {
/* 241 */             File tempFile = File.createTempFile("i4jau", "");
/* 242 */             this.additionalUserJarsDir = new File(tempFile.getAbsolutePath() + ".dir");
/* 243 */             while (!this.additionalUserJarsDir.mkdir()) {
/* 244 */               tempFile.deleteOnExit();
/* 245 */               tempFile = File.createTempFile("i4jau", "");
/* 246 */               this.additionalUserJarsDir = new File(tempFile.getAbsolutePath() + ".dir");
/*     */             } 
/* 248 */             tempFile.delete();
/*     */             
/* 250 */             for (File file : files) {
/*     */               File destFile;
/* 252 */               String fileName = file.getName();
/* 253 */               if (fileName.endsWith(".pack")) {
/* 254 */                 destFile = new File(this.additionalUserJarsDir, fileName.substring(0, fileName.length() - ".pack".length()));
/*     */                 try {
/* 256 */                   if (!Unpacker.unpack(file, destFile, null)) {
/* 257 */                     FileUtil.copyFile(file, destFile);
/*     */                   }
/* 259 */                 } catch (IOException e) {
/* 260 */                   System.err.println("While unpacking " + fileName);
/* 261 */                   throw e;
/*     */                 } 
/*     */               } else {
/* 264 */                 destFile = new File(this.additionalUserJarsDir, fileName);
/* 265 */                 FileUtil.copyFile(file, destFile);
/*     */               } 
/* 267 */               if (destFile.getName().endsWith(".jar") || destFile.getName().endsWith(".zip")) {
/* 268 */                 Install4jClassLoader.addClassPath(destFile);
/*     */               }
/*     */             } 
/* 271 */           } catch (IOException e) {
/* 272 */             e.printStackTrace();
/*     */           } 
/*     */         } else {
/* 275 */           for (File file : files) {
/* 276 */             if (file.getName().endsWith(".jar") || file.getName().endsWith(".zip")) {
/* 277 */               Install4jClassLoader.addClassPath(file);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean checkReboot(RegistryRoot root) {
/* 286 */     String checkFile = (String)WinRegistry.getValue(root, "SOFTWARE\\ej-technologies\\install4j\\", "RebootCheckFile");
/* 287 */     if (checkFile != null) {
/* 288 */       if ((new File(checkFile)).exists()) {
/* 289 */         String message = Messages.format(Messages.getString(".PreviousInstallNotCompleted"), new Object[] { InstallerConfig.getCurrentInstance().getApplicationNameWithVersion() });
/* 290 */         Util.showMessage(message, 2);
/* 291 */         return true;
/*     */       } 
/* 293 */       WinRegistry.deleteValue(root, "SOFTWARE\\ej-technologies\\install4j\\", "RebootCheckFile");
/*     */     } 
/*     */     
/* 296 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void exit(int exitCode) {
/* 301 */     if (this.additionalUserJarsDir != null && !this.keepAdditionalUserJars) {
/* 302 */       FileUtil.deleteDirectory(this.additionalUserJarsDir);
/*     */     }
/* 304 */     if (InstallerVariables.getBooleanVariable("sys.automaticUpdate")) {
/* 305 */       AutomaticUpdate.checkRegularExit((exitCode == 0), cancelling);
/*     */     }
/* 307 */     super.exit(exitCode);
/*     */   }
/*     */ 
/*     */   
/*     */   public void finish(int exitCode) {
/*     */     try {
/* 313 */       InstallerConfig config = InstallerConfig.getCurrentInstance();
/*     */       
/* 315 */       if (!Util.isWindows() && !Util.isMacOS()) {
/*     */         try {
/* 317 */           AbstractAssociationAction.logUnhandledUnixAssociations();
/* 318 */         } catch (Throwable t) {
/* 319 */           Logger.getInstance().log(t);
/*     */         } 
/*     */       }
/*     */       
/* 323 */       if (InstallerConfig.isInstaller()) {
/* 324 */         String singleBundleName = null;
/* 325 */         if (Util.isMacosInstaller() && config.getMacSpecificConfig().isSingleBundle()) {
/* 326 */           singleBundleName = config.getMacSpecificConfig().getSingleBundleName();
/*     */         }
/*     */         
/* 329 */         InstallRegistry.registerApplication(config.getApplicationId(), 
/* 330 */             getInstallationDirectory(), singleBundleName);
/*     */         
/* 332 */         MsiHelper.writeMsiUninstaller(this);
/*     */       } 
/*     */       
/* 335 */       boolean singleBundleArchive = (Util.isMacosInstaller() && config.getMacSpecificConfig().isSingleBundle() && config.isArchive());
/* 336 */       if (!singleBundleArchive) {
/* 337 */         File runtimeDirectory = getRuntimeDirectory();
/*     */         
/* 339 */         String suffix = "";
/* 340 */         if (InstallerConfig.getCurrentInstance().isAddOnInstaller()) {
/* 341 */           suffix = "." + InstallerConfig.getCurrentInstance().getProjectCrc();
/*     */         }
/* 343 */         String logFileDestination = System.getProperty("install4j.logFileDestination");
/* 344 */         File logFile = (logFileDestination != null) ? new File(logFileDestination) : new File(runtimeDirectory, "installation.log" + suffix);
/*     */         
/* 346 */         File responseFile = new File(runtimeDirectory, "response.varfile" + suffix);
/* 347 */         byte[] responseFileContent = null;
/*     */ 
/*     */         
/* 350 */         if (runtimeDirectory.exists() && !Boolean.getBoolean("install4j.dontStoreInstallationInfo")) {
/* 351 */           InstallationProperties installationProperties = null;
/* 352 */           if (InstallerConfig.isInstaller() && !Boolean.getBoolean("install4j.dontStoreInstallationLog")) {
/* 353 */             installationProperties = finishInstallationProperties();
/*     */             
/* 355 */             FileInstaller.getInstance().registerUninstallFile(logFile);
/* 356 */             Logger.getImpl().setFinalLogFile(logFile);
/*     */             
/* 358 */             responseFileContent = InstallerVariables.getResponseFileContent(VariableSelectionMode.EXCLUDE, null);
/* 359 */             FileInstaller.getInstance().registerUninstallFile(responseFile);
/*     */           } 
/*     */           
/* 362 */           Collections.reverse(this.autoUninstallActions);
/* 363 */           byte[] autoUninstallBytes = AutoUninstallHandler.getPropertyFileBytes(this.autoUninstallActions);
/* 364 */           writeFinalRuntimeContent(autoUninstallBytes, runtimeDirectory, responseFile, responseFileContent, installationProperties);
/* 365 */           FileInstaller.getInstance().setLogDir(getDestinationFile(".install4j"));
/* 366 */           FileInstaller.getInstance().writeLog();
/*     */         }
/*     */       
/*     */       } 
/* 370 */     } catch (UserCanceledException userCanceledException) {
/*     */     
/* 372 */     } catch (IOException e) {
/* 373 */       if (InstallerConfig.isInstaller() && InstallFilesAction.hasRun()) {
/* 374 */         handleCriticalException(e);
/*     */       }
/*     */     } 
/* 377 */     super.finish(exitCode);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initWithVariables() {
/* 382 */     super.initWithVariables();
/* 383 */     initUpdateInstallation();
/*     */   }
/*     */   
/*     */   private static void writeFinalRuntimeContent(final byte[] autoUninstallBytes, final File runtimeDirectory, final File responseFile, final byte[] responseFileContent, final InstallationProperties installationProperties) throws IOException, UserCanceledException {
/* 387 */     final String accessMode = System.getProperty("install4j.runtimeAccessMode");
/* 388 */     HelperCommunication.getInstance().executeActionChecked(ContentInstaller.getExecutionContext(), (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) throws IOException {
/* 391 */             if (installationProperties != null) installationProperties.store(runtimeDirectory); 
/* 392 */             AutoUninstallHandler.writeFile(autoUninstallBytes, runtimeDirectory);
/* 393 */             if (responseFileContent != null && responseFile != null) {
/* 394 */               FileOutputStream out = new FileOutputStream(responseFile);
/* 395 */               out.write(responseFileContent);
/* 396 */               out.close();
/*     */             } 
/*     */             
/* 399 */             if (accessMode != null && !Util.isWindows()) {
/*     */               try {
/* 401 */                 InstallerContextImpl.setPosixFilePermissionsRecursive(runtimeDirectory, accessMode);
/* 402 */               } catch (Exception e) {
/* 403 */                 Logger.getInstance().log(null, "set permissions: " + e, false);
/*     */               } 
/*     */             }
/* 406 */             if (Util.isMacosInstaller() && InstallerConfig.getCurrentInstance().getMacSpecificConfig().isSingleBundle()) {
/* 407 */               InstallerConfig config = InstallerConfig.getCurrentInstance();
/* 408 */               File bundleDir = new File(context.getInstallationDirectory(), config.getMacSpecificConfig().getSingleBundleName());
/* 409 */               File infoPlistTempFile = new File(bundleDir, "Contents/info_plist_temp");
/* 410 */               if (infoPlistTempFile.exists()) {
/* 411 */                 infoPlistTempFile.renameTo(new File(infoPlistTempFile.getParentFile(), "Info.plist"));
/* 412 */                 MacFileSystem.notifyBundleChange(bundleDir);
/*     */               } 
/*     */             } 
/* 415 */             for (Runnable runnable : InstallerContextImpl.afterFinishActions) {
/* 416 */               runnable.run();
/*     */             }
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private static void setPosixFilePermissionsRecursive(File dir, String mode) throws IOException {
/* 423 */     if (mode != null && mode.length() > 0) {
/* 424 */       if (Character.isDigit(mode.charAt(0))) {
/* 425 */         mode = LegacyUnixFileSystem.toJavaTypeMode(mode);
/*     */       }
/* 427 */       final Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString(mode);
/*     */       
/* 429 */       Files.walkFileTree(dir.toPath(), new SimpleFileVisitor<Path>()
/*     */           {
/*     */             public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
/* 432 */               Files.setPosixFilePermissions(file, posixFilePermissions);
/* 433 */               return FileVisitResult.CONTINUE;
/*     */             }
/*     */ 
/*     */             
/*     */             public FileVisitResult postVisitDirectory(Path dir, IOException e) throws IOException {
/* 438 */               Files.setPosixFilePermissions(dir, posixFilePermissions);
/* 439 */               return FileVisitResult.CONTINUE;
/*     */             }
/*     */           });
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private InstallationProperties finishInstallationProperties() throws IOException {
/* 447 */     InstallationProperties installationProperties = getInstallationProperties();
/*     */     
/* 449 */     installationProperties.setLanguageId(getLanguageId());
/* 450 */     if (MsiHelper.isStartedFromMsi()) {
/* 451 */       installationProperties.setMsiAllUsers(MsiHelper.isMsiAllUsers(this));
/*     */     }
/*     */     
/* 454 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/* 455 */     List<String> launchers = new ArrayList<>(config.getFileOptionsConfig().getLaunchers());
/*     */     
/* 457 */     List<File> serviceFiles = new ArrayList<>();
/* 458 */     for (LauncherSetup launcherSetup : getLaunchers()) {
/* 459 */       if (launcherSetup.getType() == LauncherType.SERVICE) {
/* 460 */         serviceFiles.add(getDestinationFile(launcherSetup.getRelativeFileName()));
/*     */       }
/*     */     } 
/*     */     
/* 464 */     for (InstallServiceAction.Info info : InstallServiceAction.getInstalledServices()) {
/* 465 */       installationProperties.addStringToSet("serviceName", info.getServiceName());
/*     */     }
/*     */     
/* 468 */     for (String fileName : launchers) {
/* 469 */       File destinationFile = getDestinationFile(fileName);
/* 470 */       if (!serviceFiles.contains(destinationFile)) {
/* 471 */         installationProperties.addFileToSet("launcher", destinationFile);
/*     */       }
/*     */     } 
/* 474 */     return installationProperties;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setInstallationDirectory(File installationDirectory) {
/* 479 */     setInstallationDirectory(installationDirectory, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUpdateInstallation() {
/* 484 */     return this.updateInstallation;
/*     */   }
/*     */   
/*     */   private void initUpdateInstallation() {
/* 488 */     this.updateInstallation = ApplicationRegistry.isUpdateDirectory(getInstallationDirectory());
/*     */   }
/*     */   
/*     */   public void setInstallationDirectory(File installationDirectory, boolean fireChangeEvent) {
/* 492 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/* 493 */     File oldInstallationDirectory = getInstallationDirectory();
/* 494 */     config.setInstallationDirectory(installationDirectory);
/* 495 */     if (!Objects.equals(oldInstallationDirectory, getInstallationDirectory())) {
/* 496 */       initUpdateInstallation();
/* 497 */       if (fireChangeEvent) {
/* 498 */         variableChanged("sys.installationDir");
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public File getExternalFile(ExternalFile externalFile, boolean installedLocation) {
/* 505 */     if (installedLocation || isDistributionExternal(externalFile) || !InstallerConfig.isInstaller()) {
/* 506 */       return super.getExternalFile(externalFile, installedLocation);
/*     */     }
/* 508 */     if (externalFile == null || externalFile.getPath().trim().length() == 0) {
/* 509 */       return null;
/*     */     }
/* 511 */     return InstallerUtil.getAbsoluteFile((File)externalFile);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String getRebootMessage() {
/* 518 */     return Messages.getString(".FinishedRestartMessage");
/*     */   }
/*     */   
/*     */   public void setKeepAdditionalUserJars(boolean keepAdditionalUserJars) {
/* 522 */     this.keepAdditionalUserJars = keepAdditionalUserJars;
/*     */   }
/*     */   
/*     */   private Object writeReplace() throws ObjectStreamException {
/* 526 */     return new ContextStandin();
/*     */   }
/*     */   private static class ContextStandin implements Serializable { private ContextStandin() {}
/*     */     
/*     */     private Object readResolve() throws ObjectStreamException {
/* 531 */       return ContextImpl.getCurrentContext();
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\InstallerContextImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */