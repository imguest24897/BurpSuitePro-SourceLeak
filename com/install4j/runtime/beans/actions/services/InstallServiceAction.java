/*     */ package com.install4j.runtime.beans.actions.services;
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.beans.PropertyLoggingInterceptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.LauncherSetup;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.RemoteCallable;
/*     */ import com.install4j.api.context.UninstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.api.windows.RegistryRoot;
/*     */ import com.install4j.api.windows.WinRegistry;
/*     */ import com.install4j.api.windows.WinUser;
/*     */ import com.install4j.runtime.installer.AbstractRemoteCallable;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.CompilerVariableHelper;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.MenuHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchDescriptor;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchHelper;
/*     */ import com.install4j.runtime.installer.platform.unix.Execution;
/*     */ import com.install4j.runtime.installer.platform.unix.ServiceFile;
/*     */ import com.install4j.runtime.installer.platform.win32.Win32Services;
/*     */ import com.install4j.runtime.installer.platform.win32.Win32UserInfo;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.Serializable;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Properties;
/*     */ 
/*     */ public class InstallServiceAction extends SystemAutoUninstallInstallAction implements PropertyLoggingInterceptor {
/*     */   public static final String SYSTEMCTL_PATH = "/bin/systemctl";
/*     */   public static final String SYSTEMD_CONFIG_PATH = "/etc/systemd/system";
/*     */   public static final String INITD_PATH = "/etc/init.d";
/*  45 */   private String launcherId = ""; public static final String SYSTEMCTL_NO_ASK_PASSWORD = "--no-ask-password"; private static final String NAME_RESTART_MILLIS = "serviceRestartMillis";
/*     */   private static final String NAME_MAX_RESTARTS = "serviceMaxRestarts";
/*     */   private static final String NAME_RESET_SECONDS = "serviceResetSeconds";
/*     */   private File executable;
/*     */   private String serviceName;
/*     */   private boolean autoStart = true;
/*  51 */   private String description = "";
/*  52 */   private String windowsDependencies = "";
/*  53 */   private String macosIdentifier = "";
/*  54 */   private String windowsArguments = "";
/*  55 */   private String windowsDisplayName = "";
/*     */   private boolean restartOnFailure;
/*  57 */   private int restartMillis = 1000;
/*  58 */   private int maxRestarts = 0;
/*  59 */   private int resetSeconds = 0;
/*     */   private boolean interactive;
/*     */   private boolean delayedAutoStart;
/*  62 */   private WindowsPriority windowsPriority = WindowsPriority.NORMAL_PRIORITY_CLASS;
/*  63 */   private String additionalSystemdEntries = "";
/*     */   
/*  65 */   private ServiceAccount serviceAccount = ServiceAccount.LOCAL_SYSTEM;
/*  66 */   private String accountNameOrSid = "";
/*  67 */   private String password = "";
/*     */   
/*     */   private boolean keepCurrentAccount = false;
/*     */   
/*     */   private static final String PROP_SERVICE_PATH = "servicePath";
/*     */   
/*     */   private static final String PROP_SERVICE_NAME = "serviceName";
/*     */   
/*     */   private static final String PROP_STARTUP_TYPE = "startupType";
/*     */   
/*     */   private static final String PROP_IDENTIFIER = "identifier";
/*     */   private static final String PROP_CONFIG_FILE = "configFile";
/*     */   private static final String PROP_CONFIG_TARGET = "configTarget";
/*     */   private static final String STARTUP_ITEMS_FILE_NAME = "/Library/StartupItems";
/*     */   public static final String LAUNCH_DAEMONS_FILE_NAME = "/Library/LaunchDaemons";
/*     */   private static final String STARTUP_PARAMETERS_PLIST_NAME = "StartupParameters.plist";
/*     */   private static final String REGKEY_PRIORITY = "SOFTWARE\\ej-technologies\\exe4j\\priority";
/*  84 */   private static List<Info> installedServices = new ArrayList<>();
/*     */   
/*     */   public static List<Info> getInstalledServices() {
/*  87 */     return installedServices;
/*     */   }
/*     */ 
/*     */   
/*     */   private String getUsedPassword() {
/*  92 */     if (getServiceAccount() == ServiceAccount.OTHER) {
/*  93 */       return getPassword();
/*     */     }
/*  95 */     return "";
/*     */   }
/*     */ 
/*     */   
/*     */   private String getAccountNameOrSidForPrivileges() {
/* 100 */     if (getServiceAccount() == ServiceAccount.OTHER) {
/* 101 */       return getAccountNameOrSid();
/*     */     }
/* 103 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private String getUsedAccountName() {
/* 108 */     if (getServiceAccount() == ServiceAccount.OTHER) {
/* 109 */       String accountName = WinUser.getAccountName(getAccountNameOrSid());
/* 110 */       if (accountName != null) {
/* 111 */         return accountName;
/*     */       }
/* 113 */       return getAccountNameOrSid();
/*     */     } 
/*     */     
/* 116 */     return getServiceAccount().getAccountName();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getWindowsDisplayName() {
/* 121 */     return replaceVariables(replaceVariables(this.windowsDisplayName));
/*     */   }
/*     */   
/*     */   public void setWindowsDisplayName(String windowsDisplayName) {
/* 125 */     this.windowsDisplayName = windowsDisplayName;
/*     */   }
/*     */   
/*     */   public String getAdditionalSystemdEntries() {
/* 129 */     return replaceVariables(replaceVariables(this.additionalSystemdEntries));
/*     */   }
/*     */   
/*     */   public void setAdditionalSystemdEntries(String additionalSystemdEntries) {
/* 133 */     this.additionalSystemdEntries = additionalSystemdEntries;
/*     */   }
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/*     */     File usedExecutable;
/*     */     String usedName;
/* 139 */     ProgressInterface progressInterface = context.getProgressInterface();
/* 140 */     progressInterface.setDetailMessage("");
/*     */ 
/*     */ 
/*     */     
/* 144 */     String additionalPlistContent = "";
/* 145 */     LauncherSetup launcherSetup = null;
/* 146 */     if (getLauncherId() == null) {
/* 147 */       usedName = getServiceName();
/* 148 */       usedExecutable = context.getDestinationFile(getExecutable());
/*     */     } else {
/* 150 */       launcherSetup = context.getLauncherById(getLauncherId());
/* 151 */       if (launcherSetup == null) {
/* 152 */         Logger.getInstance().log(this, "The launcher with ID " + getLauncherId() + " cannot be found", false);
/* 153 */         return false;
/*     */       } 
/*     */       
/* 156 */       usedExecutable = context.getDestinationFile(launcherSetup.getRelativeFileName());
/* 157 */       usedName = launcherSetup.getName();
/* 158 */       additionalPlistContent = replaceVariables(((ContextImpl.LauncherSetupImpl)launcherSetup).getLauncherConfig().getPlistContent());
/*     */     } 
/*     */     
/* 161 */     if (!usedExecutable.exists()) {
/* 162 */       Logger.getInstance().log(this, "The executable " + usedExecutable + " does not exist", false);
/* 163 */       return false;
/*     */     } 
/*     */     
/* 166 */     String usedIdentifier = null;
/* 167 */     String binaryPath = usedExecutable.getAbsolutePath();
/*     */     
/*     */     try {
/* 170 */       if (InstallerUtil.isWindows()) {
/* 171 */         if (binaryPath.indexOf(' ') > -1) {
/* 172 */           binaryPath = "\"" + binaryPath + "\"";
/*     */         }
/* 174 */         if (getWindowsArguments() != null && getWindowsArguments().trim().length() > 0) {
/* 175 */           binaryPath = binaryPath + " " + getWindowsArguments().trim();
/*     */         }
/* 177 */         String usedDisplayName = usedName;
/* 178 */         if (getWindowsDisplayName() != null && getWindowsDisplayName().trim().length() > 0) {
/* 179 */           usedDisplayName = getWindowsDisplayName().trim();
/*     */         }
/*     */         
/* 182 */         int restartMillis = getRestartMillis((Context)context, usedName);
/* 183 */         int maxRestarts = getMaxRestarts((Context)context, usedName);
/* 184 */         int resetSeconds = getResetSeconds((Context)context, usedName);
/*     */         
/* 186 */         Object ret = context.runElevated((RemoteCallable)new InstallWindowsRemoteCallable(usedName, usedDisplayName, binaryPath, isInteractive(), isDelayedAutoStart(), isAutoStart(), isKeepCurrentAccount(), getWindowsDependencies(), getUsedAccountName(), getUsedPassword(), getAccountNameOrSidForPrivileges(), getDescription(), getWindowsPriority().getValue(), isRestartOnFailure(), restartMillis, maxRestarts, resetSeconds), true);
/* 187 */         if (ret instanceof Win32Services.ServiceException) {
/* 188 */           throw (Win32Services.ServiceException)ret;
/*     */         }
/* 190 */       } else if (InstallerUtil.isMacOS()) {
/* 191 */         usedIdentifier = getMacosIdentifier();
/* 192 */         if (usedIdentifier == null || usedIdentifier.trim().length() == 0) {
/* 193 */           usedIdentifier = "com.install4j." + context.getApplicationId() + "." + usedExecutable.getName();
/* 194 */           Logger.getInstance().info(this, "Using fallback identifier: " + usedIdentifier);
/*     */         } 
/*     */         
/* 197 */         Object ret = context.runElevated((RemoteCallable)new InstallMacosRemoteCallable(usedExecutable, usedName, usedIdentifier, isAutoStart(), additionalPlistContent), false);
/* 198 */         if (ret instanceof IOException) {
/* 199 */           throw (IOException)ret;
/*     */         }
/*     */       }
/* 202 */       else if (!installUnix(context, usedExecutable, usedName, launcherSetup)) {
/* 203 */         return false;
/*     */       }
/*     */     
/* 206 */     } catch (com.install4j.runtime.installer.platform.win32.Win32Services.ServiceException e) {
/* 207 */       if (e.getErrorCode() == 1057) {
/* 208 */         Logger.getInstance().error(this, "Invalid service account.");
/* 209 */       } else if (e.getErrorCode() == 5) {
/* 210 */         Logger.getInstance().error(this, "Access denied. Need to be elevated administrator.");
/* 211 */       } else if (e.getErrorCode() == 1060) {
/* 212 */         Logger.getInstance().error(this, "Service does not exist.");
/* 213 */       } else if (e.getErrorCode() == 1069) {
/* 214 */         Logger.getInstance().error(this, "Logon to service account failed. Password is wrong or user does not have log on as service privilege.");
/*     */       } else {
/* 216 */         Logger.getInstance().log((Throwable)e);
/*     */       } 
/* 218 */       progressInterface.showFailure(
/* 219 */           Messages.format(Messages.getString(".ErrorInstallService"), new Object[] { usedName
/* 220 */             }) + ((e.getMessage() != null) ? ("\n\n" + e.getMessage()) : ""));
/*     */       
/* 222 */       return false;
/* 223 */     } catch (Exception e) {
/* 224 */       progressInterface.showFailure(
/* 225 */           Messages.format(Messages.getString(".ErrorInstallService"), new Object[] { usedName
/* 226 */             }) + ((e.getMessage() != null) ? ("\n\n" + e.getMessage()) : ""));
/*     */       
/* 228 */       Logger.getInstance().log(e);
/* 229 */       return false;
/*     */     } 
/* 231 */     Properties persistentProperties = getPersistentProperties();
/* 232 */     persistentProperties.setProperty("servicePath", binaryPath);
/* 233 */     persistentProperties.setProperty("serviceName", usedName);
/* 234 */     persistentProperties.setProperty("startupType", isAutoStart() ? "auto" : "manual");
/* 235 */     if (usedIdentifier != null) {
/* 236 */       persistentProperties.setProperty("identifier", usedIdentifier);
/*     */     }
/* 238 */     installedServices.add(new Info(usedExecutable.getAbsolutePath(), usedName, usedIdentifier));
/* 239 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollback(InstallerContext context) {
/* 244 */     doUninstallation((Context)context);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean uninstall(UninstallerContext context) {
/* 249 */     if (Boolean.getBoolean("install4j.dontUninstallServices")) {
/* 250 */       Logger.getInstance().info(this, "Keep services");
/* 251 */       throw new AutoUninstallNotPerformedException();
/*     */     } 
/* 253 */     return doUninstallation((Context)context);
/*     */   }
/*     */   
/*     */   private boolean doUninstallation(Context context) {
/* 257 */     Properties persistentProperties = getPersistentProperties();
/* 258 */     String serviceName = persistentProperties.getProperty("serviceName");
/* 259 */     Logger.getInstance().info(this, "service name " + serviceName);
/* 260 */     if (serviceName == null) {
/* 261 */       return true;
/*     */     }
/*     */     try {
/* 264 */       if (InstallerUtil.isWindows()) {
/* 265 */         Object ret = context.runElevated((RemoteCallable)new UninstallWindowsRemoteCallable(serviceName, persistentProperties.getProperty("servicePath")), true);
/* 266 */         if (ret instanceof Win32Services.ServiceException) {
/* 267 */           throw (Win32Services.ServiceException)ret;
/*     */         }
/* 269 */       } else if (InstallerUtil.isMacOS()) {
/* 270 */         String fileName = persistentProperties.getProperty("servicePath");
/* 271 */         if (fileName == null) {
/* 272 */           return true;
/*     */         }
/* 274 */         File serviceExecutable = new File(fileName);
/* 275 */         if (!serviceExecutable.exists()) {
/* 276 */           return true;
/*     */         }
/*     */         
/* 279 */         String startupType = persistentProperties.getProperty("startupType");
/* 280 */         String identifier = persistentProperties.getProperty("identifier");
/*     */         
/* 282 */         context.runElevated((RemoteCallable)new UninstallMacosRemoteCallable(serviceExecutable, serviceName, identifier, startupType), true);
/*     */       } else {
/* 284 */         String fileName = persistentProperties.getProperty("servicePath");
/* 285 */         Logger.getInstance().info(this, "service path " + fileName);
/* 286 */         if (fileName == null) {
/* 287 */           return true;
/*     */         }
/* 289 */         File serviceExecutable = new File(fileName);
/* 290 */         if (!serviceExecutable.exists()) {
/* 291 */           Logger.getInstance().info(this, "service executable does not exist");
/* 292 */           return true;
/*     */         } 
/* 294 */         File initdLink = new File("/etc/init.d", serviceExecutable.getName());
/* 295 */         if (initdLink.exists()) {
/* 296 */           UnixFileSystem.FileInformation fileInformation = UnixFileSystem.getFileInformation(initdLink);
/* 297 */           if (fileInformation != null && fileInformation.isLink() && Objects.equals(fileInformation.getLinkTarget(), serviceExecutable.getAbsolutePath()) && 
/* 298 */             initdLink.delete()) {
/* 299 */             reloadSystemCtl();
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 304 */         String configFilePath = persistentProperties.getProperty("configFile");
/* 305 */         Logger.getInstance().info(this, "config file path " + configFilePath);
/* 306 */         if (configFilePath != null) {
/* 307 */           File configFile = new File(configFilePath);
/* 308 */           File configEtcFile = new File("/etc/systemd/system", configFile.getName());
/*     */           
/* 310 */           if (FileUtil.getCanonicalFile(configFile).equals(FileUtil.getCanonicalFile(configEtcFile))) {
/* 311 */             String configTarget = persistentProperties.getProperty("configTarget");
/* 312 */             String content = null;
/* 313 */             if (configTarget != null) {
/*     */               try {
/* 315 */                 content = FileUtil.readTextFile(configFile, "UTF-8");
/* 316 */               } catch (Exception e) {
/* 317 */                 Logger.getInstance().log(e);
/*     */               } 
/*     */             }
/* 320 */             if (content == null || content.contains(configTarget)) {
/* 321 */               doUninstallSystemd(serviceExecutable, configEtcFile);
/*     */             } else {
/* 323 */               Logger.getInstance().info(this, "config file does not contain target " + configTarget);
/*     */             } 
/*     */           } else {
/* 326 */             UnixFileSystem.FileInformation fileInformation = UnixFileSystem.getFileInformation(configEtcFile);
/* 327 */             if (fileInformation != null && fileInformation.isLink() && Objects.equals(fileInformation.getLinkTarget(), configFile.getAbsolutePath())) {
/* 328 */               doUninstallSystemd(serviceExecutable, configEtcFile);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/* 333 */       return true;
/* 334 */     } catch (Exception e) {
/* 335 */       Logger.getInstance().log(e);
/*     */       
/* 337 */       ProgressInterface progressInterface = context.getProgressInterface();
/* 338 */       progressInterface.showFailure(Messages.format(Messages.getString(".ErrorUninstallService"), new Object[] { serviceName }));
/* 339 */       return true;
/*     */     } 
/*     */   }
/*     */   private void doUninstallSystemd(File serviceExecutable, File configEtcFile) {
/* 343 */     callSystemCtl(serviceExecutable, "stop");
/* 344 */     callSystemCtl(serviceExecutable, "disable");
/* 345 */     if (configEtcFile.delete()) {
/* 346 */       reloadSystemCtl();
/*     */     }
/*     */   }
/*     */   
/*     */   private static boolean useSystemd(InstallerContext context, LauncherSetup launcherSetup) {
/* 351 */     return (CompilerVariableHelper.getCompilerExtensionVariable((Context)context, "useSystemd", true) && (launcherSetup == null || 
/* 352 */       CompilerVariableHelper.getCompilerExtensionVariable((Context)context, "useSystemd." + launcherSetup.getId(), true)));
/*     */   }
/*     */   
/*     */   private boolean installUnix(InstallerContext context, File serviceExecutable, String name, LauncherSetup launcherSetup) throws IOException {
/* 356 */     File initdLinkFile = new File("/etc/init.d", serviceExecutable.getName());
/* 357 */     String target = serviceExecutable.getAbsolutePath();
/* 358 */     if (useSystemd(context, launcherSetup) && (new File("/bin/systemctl")).isFile() && (new File("/etc/systemd/system")).isDirectory()) {
/* 359 */       if (initdLinkFile.isFile()) {
/* 360 */         UnixFileSystem.FileInformation fileInformation = UnixFileSystem.getFileInformation(initdLinkFile);
/* 361 */         if (fileInformation != null && fileInformation.isLink() && FileUtil.getCanonicalFile(new File(fileInformation.getLinkTarget())).equals(FileUtil.getCanonicalFile(serviceExecutable))) {
/* 362 */           initdLinkFile.delete();
/*     */         }
/*     */       } 
/* 365 */       int systemdVersion = ServiceHandler.getSystemdVersion();
/*     */       
/* 367 */       ServiceFile serviceFile = new ServiceFile(target, name, (systemdVersion >= 240));
/* 368 */       serviceFile.addContent(MenuHelper.getAdditionalEntries(launcherSetup));
/* 369 */       serviceFile.addContent(getAdditionalSystemdEntries());
/* 370 */       File configFile = context.getDestinationFile(".install4j/" + serviceExecutable.getName() + ".service");
/* 371 */       PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(configFile), StandardCharsets.UTF_8)); 
/* 372 */       try { serviceFile.print(pw);
/* 373 */         pw.close(); } catch (Throwable throwable) { try { pw.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }
/* 374 */        FileInstaller.getInstance().registerUninstallFile(configFile);
/* 375 */       File configEtcFile = new File("/etc/systemd/system", configFile.getName());
/* 376 */       configEtcFile.delete();
/* 377 */       FileUtil.copyFile(configFile, configEtcFile);
/* 378 */       configFile = configEtcFile;
/* 379 */       getPersistentProperties().setProperty("configFile", configFile.getAbsolutePath());
/* 380 */       getPersistentProperties().setProperty("configTarget", target);
/* 381 */       reloadAndStartUnix(configEtcFile);
/*     */     }
/* 383 */     else if (UnixFileSystem.createLink(target, initdLinkFile)) {
/* 384 */       reloadAndStartUnix(serviceExecutable);
/*     */     } else {
/* 386 */       return false;
/*     */     } 
/*     */     
/* 389 */     return true;
/*     */   }
/*     */   
/*     */   private void reloadAndStartUnix(File serviceFile) {
/* 393 */     if (reloadSystemCtl() && isAutoStart()) {
/* 394 */       callSystemCtl(serviceFile, "enable");
/*     */     }
/*     */   }
/*     */   
/*     */   private void callSystemCtl(File serviceFile, String command) {
/* 399 */     Integer returnValue = LaunchHelper.launchApplication((new LaunchDescriptor(new File("/bin/systemctl"))).arguments(new String[] { "--no-ask-password", command, serviceFile.getName() }).wait(true));
/* 400 */     Logger.getInstance().info(this, "systemctl " + command + " return: " + returnValue);
/*     */   }
/*     */   
/*     */   private boolean reloadSystemCtl() {
/* 404 */     File systemctlFile = new File("/bin/systemctl");
/* 405 */     if (systemctlFile.isFile()) {
/* 406 */       Integer returnValue = LaunchHelper.launchApplication((new LaunchDescriptor(systemctlFile)).arguments(new String[] { "--no-ask-password", "daemon-reload" }).wait(true));
/* 407 */       Logger.getInstance().info(this, "systemctl daemon-reload return: " + returnValue);
/* 408 */       return (returnValue != null && returnValue.intValue() == 0);
/*     */     } 
/* 410 */     return false;
/*     */   }
/*     */   
/*     */   private static class UninstallWindowsRemoteCallable
/*     */     extends AbstractRemoteCallable {
/*     */     String serviceName;
/*     */     private String binaryPath;
/*     */     
/*     */     private UninstallWindowsRemoteCallable(String serviceName, String binaryPath) {
/* 419 */       this.serviceName = serviceName;
/* 420 */       this.binaryPath = binaryPath;
/*     */     }
/*     */ 
/*     */     
/*     */     public Serializable execute() {
/*     */       try {
/* 426 */         String registeredBinary = Win32Services.getServiceBinary(this.serviceName);
/* 427 */         if (this.binaryPath == null || this.binaryPath.equals(registeredBinary)) {
/* 428 */           Win32Services.uninstallService(this.serviceName);
/*     */         }
/* 430 */       } catch (com.install4j.runtime.installer.platform.win32.Win32Services.ServiceException e) {
/* 431 */         if (e.getErrorCode() != 1060) {
/* 432 */           return (Serializable)e;
/*     */         }
/*     */       } 
/* 435 */       return null;
/*     */     }
/*     */   }
/*     */   
/*     */   private static class InstallWindowsRemoteCallable extends AbstractRemoteCallable {
/*     */     String usedName;
/*     */     String displayName;
/*     */     String binaryPath;
/*     */     private boolean interactive;
/*     */     private final boolean delayedAutoStart;
/*     */     private boolean autoStart;
/*     */     private boolean keepCurrentAccount;
/*     */     private String dependencies;
/*     */     private String accountName;
/*     */     private String password;
/*     */     private String accountNameOrSidForPrivileges;
/*     */     private String description;
/*     */     private int priority;
/*     */     private boolean restartOnFailure;
/*     */     private final int restartMillis;
/*     */     private final int maxRestarts;
/*     */     private final int resetSeconds;
/*     */     
/*     */     private InstallWindowsRemoteCallable(String usedName, String displayName, String binaryPath, boolean interactive, boolean delayedAutoStart, boolean autoStart, boolean keepCurrentAccount, String dependencies, String accountName, String password, String accountNameOrSidForPrivileges, String description, int priority, boolean restartOnFailure, int restartMillis, int maxRestarts, int resetSeconds) {
/* 459 */       this.usedName = usedName;
/* 460 */       this.displayName = displayName;
/* 461 */       this.binaryPath = binaryPath;
/* 462 */       this.interactive = interactive;
/* 463 */       this.delayedAutoStart = delayedAutoStart;
/* 464 */       this.autoStart = autoStart;
/* 465 */       this.keepCurrentAccount = keepCurrentAccount;
/* 466 */       this.dependencies = dependencies;
/* 467 */       this.accountName = accountName;
/* 468 */       this.password = password;
/* 469 */       this.accountNameOrSidForPrivileges = accountNameOrSidForPrivileges;
/* 470 */       this.description = description;
/* 471 */       this.priority = priority;
/* 472 */       this.restartOnFailure = restartOnFailure;
/* 473 */       this.restartMillis = restartMillis;
/* 474 */       this.maxRestarts = maxRestarts;
/* 475 */       this.resetSeconds = resetSeconds;
/*     */     }
/*     */ 
/*     */     
/*     */     public Serializable execute() {
/* 480 */       boolean existing = false;
/*     */       try {
/*     */         try {
/* 483 */           Win32Services.installService(this.usedName, this.displayName, this.binaryPath);
/* 484 */         } catch (com.install4j.runtime.installer.platform.win32.Win32Services.ServiceException e) {
/* 485 */           if (e.getErrorCode() == 1073) {
/* 486 */             existing = true;
/*     */           } else {
/* 488 */             throw e;
/*     */           } 
/*     */         } 
/* 491 */         if (this.keepCurrentAccount && existing) {
/* 492 */           this.accountName = null;
/* 493 */           this.password = null;
/* 494 */           this.accountNameOrSidForPrivileges = null;
/*     */         } 
/*     */         
/* 497 */         WinRegistry.createKey(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\ej-technologies\\exe4j\\priority");
/* 498 */         WinRegistry.setValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\ej-technologies\\exe4j\\priority", this.usedName, Integer.valueOf(this.priority));
/* 499 */         Win32Services.changeServiceConfig(this.usedName, this.displayName, this.binaryPath, this.interactive, this.autoStart ? 2 : 3, this.dependencies, this.accountName, this.password, this.description);
/* 500 */         Win32Services.setRestartServiceConfig(this.usedName, this.restartOnFailure, this.restartMillis, this.maxRestarts, this.resetSeconds);
/* 501 */         if (InstallerUtil.isAtLeastWindowsVista()) {
/* 502 */           Win32Services.setDelayedAutoStart(this.usedName, this.delayedAutoStart);
/*     */         }
/* 504 */         if (this.accountNameOrSidForPrivileges != null) {
/* 505 */           Win32UserInfo.setLsaAccountRight(this.accountNameOrSidForPrivileges, "SeServiceLogonRight", true);
/*     */         }
/* 507 */       } catch (com.install4j.runtime.installer.platform.win32.Win32Services.ServiceException e) {
/* 508 */         return (Serializable)e;
/*     */       } 
/* 510 */       return null;
/*     */     }
/*     */   }
/*     */   
/*     */   private static class UninstallMacosRemoteCallable extends AbstractRemoteCallable {
/*     */     private File serviceExecutable;
/*     */     String serviceName;
/*     */     private String identifier;
/*     */     private String startupType;
/*     */     
/*     */     private UninstallMacosRemoteCallable(File serviceExecutable, String serviceName, String identifier, String startupType) {
/* 521 */       this.serviceExecutable = serviceExecutable;
/* 522 */       this.serviceName = serviceName;
/* 523 */       this.identifier = identifier;
/* 524 */       this.startupType = startupType;
/*     */     }
/*     */ 
/*     */     
/*     */     public Serializable execute() {
/* 529 */       if (this.serviceName != null && this.serviceName.trim().length() > 0 && Objects.equals("auto", this.startupType)) {
/* 530 */         File dir = new File("/Library/StartupItems", this.serviceName);
/* 531 */         FileUtil.deleteDirectory(dir);
/*     */       } 
/*     */       
/* 534 */       if (this.identifier != null) {
/* 535 */         File plistFile = new File("/Library/LaunchDaemons", this.identifier + ".plist");
/* 536 */         if (plistFile.exists()) {
/* 537 */           LaunchDescriptor launchDescriptor = (new LaunchDescriptor(new File("/bin/launchctl"))).wait(true).executionContext(ExecutionContext.MAXIMUM).suidRoot(true);
/* 538 */           Integer returnValue = LaunchHelper.launchApplication(launchDescriptor.arguments(new String[] { "unload", plistFile.getAbsolutePath() }));
/* 539 */           Logger.getInstance().info(this, "Unload: " + ((returnValue != null && returnValue.intValue() == 0) ? 1 : 0));
/* 540 */           if (!plistFile.delete()) {
/* 541 */             plistFile.deleteOnExit();
/*     */           }
/* 543 */           return null;
/*     */         } 
/*     */       } 
/*     */       try {
/* 547 */         Execution.executeAndWait(new String[] { "/bin/sh", this.serviceExecutable.getAbsolutePath(), "stop" }, null);
/* 548 */       } catch (IOException e) {
/* 549 */         e.printStackTrace();
/*     */       } 
/*     */       
/* 552 */       return null;
/*     */     }
/*     */   }
/*     */   
/*     */   private static class InstallMacosRemoteCallable extends AbstractRemoteCallable {
/*     */     File execFile;
/*     */     String name;
/*     */     String identifier;
/*     */     private boolean autoStart;
/*     */     private final String additionalPlistContent;
/*     */     
/*     */     private InstallMacosRemoteCallable(File execFile, String name, String identifier, boolean autoStart, String additionalPlistContent) {
/* 564 */       this.execFile = execFile;
/* 565 */       this.name = name;
/* 566 */       this.identifier = identifier;
/* 567 */       this.autoStart = autoStart;
/* 568 */       this.additionalPlistContent = additionalPlistContent;
/*     */     }
/*     */ 
/*     */     
/*     */     public Serializable execute() {
/* 573 */       if (!this.execFile.exists()) {
/* 574 */         return null;
/*     */       }
/*     */       
/*     */       try {
/* 578 */         File startupItemDir = new File("/Library/StartupItems", this.name);
/* 579 */         FileUtil.deleteDirectory(startupItemDir);
/* 580 */         createLaunchDaemon();
/* 581 */       } catch (IOException e) {
/* 582 */         return e;
/*     */       } 
/*     */       
/* 585 */       return null;
/*     */     }
/*     */     
/*     */     private void createLaunchDaemon() throws IOException {
/* 589 */       File plistFile = new File("/Library/LaunchDaemons", this.identifier + ".plist");
/* 590 */       PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(plistFile), StandardCharsets.UTF_8));
/* 591 */       pw.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<!DOCTYPE plist PUBLIC \"-//Apple Computer//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n<plist version=\"1.0\">\n<dict>\n    <key>Label</key>\n    <string>" + this.identifier + "</string>\n    <key>ProgramArguments</key>\n    <array>\n        <string>" + this.execFile
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 599 */           .getCanonicalPath() + "</string>\n        <string>start-launchd</string>\n    </array>\n    <key>KeepAlive</key>\n    <false/>\n    <key>RunAtLoad</key>\n    <" + this.autoStart + "/>\n" + this.additionalPlistContent + "</dict>\n</plist>");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 609 */       pw.close();
/*     */       
/* 611 */       UnixFileSystem.setMode("644", plistFile);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getServiceName() {
/* 617 */     return replaceVariables(replaceVariables(this.serviceName));
/*     */   }
/*     */   
/*     */   public void setServiceName(String serviceName) {
/* 621 */     this.serviceName = serviceName;
/*     */   }
/*     */   
/*     */   public boolean isAutoStart() {
/* 625 */     return replaceWithTextOverride("autoStart", this.autoStart);
/*     */   }
/*     */   
/*     */   public void setAutoStart(boolean autoStart) {
/* 629 */     this.autoStart = autoStart;
/*     */   }
/*     */   
/*     */   public File getExecutable() {
/* 633 */     return (File)replaceWithTextOverride("executable", replaceVariables(this.executable), File.class);
/*     */   }
/*     */   
/*     */   public void setExecutable(File executable) {
/* 637 */     this.executable = executable;
/*     */   }
/*     */   
/*     */   public String getWindowsArguments() {
/* 641 */     return replaceVariables(replaceVariables(this.windowsArguments));
/*     */   }
/*     */   
/*     */   public void setWindowsArguments(String windowsArguments) {
/* 645 */     this.windowsArguments = windowsArguments;
/*     */   }
/*     */   
/*     */   public String getLauncherId() {
/* 649 */     return replaceVariables(this.launcherId);
/*     */   }
/*     */   
/*     */   public void setLauncherId(String launcherId) {
/* 653 */     this.launcherId = launcherId;
/*     */   }
/*     */   
/*     */   public String getDescription() {
/* 657 */     return replaceVariables(replaceVariables(this.description));
/*     */   }
/*     */   
/*     */   public void setDescription(String description) {
/* 661 */     this.description = description;
/*     */   }
/*     */   
/*     */   public String getWindowsDependencies() {
/* 665 */     return replaceVariables(replaceVariables(this.windowsDependencies));
/*     */   }
/*     */   
/*     */   public void setWindowsDependencies(String windowsDependencies) {
/* 669 */     this.windowsDependencies = windowsDependencies;
/*     */   }
/*     */   
/*     */   public String getMacosIdentifier() {
/* 673 */     return replaceVariables(replaceVariables(this.macosIdentifier));
/*     */   }
/*     */   
/*     */   public void setMacosIdentifier(String macosIdentifier) {
/* 677 */     this.macosIdentifier = macosIdentifier;
/*     */   }
/*     */   
/*     */   public boolean isRestartOnFailure() {
/* 681 */     return replaceWithTextOverride("restartOnFailure", this.restartOnFailure);
/*     */   }
/*     */   
/*     */   public void setRestartOnFailure(boolean restartOnFailure) {
/* 685 */     this.restartOnFailure = restartOnFailure;
/*     */   }
/*     */   
/*     */   public int getRestartMillis() {
/* 689 */     return replaceWithTextOverride("restartMillis", this.restartMillis);
/*     */   }
/*     */   
/*     */   public void setRestartMillis(int restartMillis) {
/* 693 */     this.restartMillis = restartMillis;
/*     */   }
/*     */   
/*     */   public int getMaxRestarts() {
/* 697 */     return replaceWithTextOverride("maxRestarts", this.maxRestarts);
/*     */   }
/*     */   
/*     */   public void setMaxRestarts(int maxRestarts) {
/* 701 */     this.maxRestarts = maxRestarts;
/*     */   }
/*     */   
/*     */   public int getResetSeconds() {
/* 705 */     return replaceWithTextOverride("resetSeconds", this.resetSeconds);
/*     */   }
/*     */   
/*     */   public void setResetSeconds(int resetSeconds) {
/* 709 */     this.resetSeconds = resetSeconds;
/*     */   }
/*     */   
/*     */   public boolean isInteractive() {
/* 713 */     return replaceWithTextOverride("interactive", this.interactive);
/*     */   }
/*     */   
/*     */   public void setInteractive(boolean interactive) {
/* 717 */     this.interactive = interactive;
/*     */   }
/*     */   
/*     */   public boolean isDelayedAutoStart() {
/* 721 */     return replaceWithTextOverride("delayedAutoStart", this.delayedAutoStart);
/*     */   }
/*     */   
/*     */   public void setDelayedAutoStart(boolean delayedAutoStart) {
/* 725 */     this.delayedAutoStart = delayedAutoStart;
/*     */   }
/*     */   
/*     */   public String getAccountNameOrSid() {
/* 729 */     return replaceVariables(replaceVariables(this.accountNameOrSid));
/*     */   }
/*     */   
/*     */   public void setAccountNameOrSid(String accountNameOrSid) {
/* 733 */     this.accountNameOrSid = accountNameOrSid;
/*     */   }
/*     */   
/*     */   public String getPassword() {
/* 737 */     return replaceVariables(replaceVariables(this.password));
/*     */   }
/*     */   
/*     */   public void setPassword(String password) {
/* 741 */     this.password = password;
/*     */   }
/*     */   
/*     */   public ServiceAccount getServiceAccount() {
/* 745 */     return (ServiceAccount)replaceWithTextOverride("serviceAccount", this.serviceAccount, ServiceAccount.class);
/*     */   }
/*     */   
/*     */   public void setServiceAccount(ServiceAccount serviceAccount) {
/* 749 */     this.serviceAccount = serviceAccount;
/*     */   }
/*     */   
/*     */   public boolean isKeepCurrentAccount() {
/* 753 */     return replaceWithTextOverride("keepCurrentAccount", this.keepCurrentAccount);
/*     */   }
/*     */   
/*     */   public void setKeepCurrentAccount(boolean keepCurrentAccount) {
/* 757 */     this.keepCurrentAccount = keepCurrentAccount;
/*     */   }
/*     */   
/*     */   public WindowsPriority getWindowsPriority() {
/* 761 */     return (WindowsPriority)replaceWithTextOverride("windowsPriority", this.windowsPriority, WindowsPriority.class);
/*     */   }
/*     */   
/*     */   public void setWindowsPriority(WindowsPriority windowsPriority) {
/* 765 */     this.windowsPriority = windowsPriority;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getLogValueForProperty(String propertyName, Object propertyValue) {
/* 770 */     if (Objects.equals(propertyName, "password") && !Boolean.getBoolean("install4j.logServicePassword")) {
/* 771 */       return "[logging of password is disabled]";
/*     */     }
/* 773 */     return propertyValue;
/*     */   }
/*     */ 
/*     */   
/*     */   private int getRestartMillis(Context context, String serviceName) {
/* 778 */     return CompilerVariableHelper.getCompilerExtensionVariable(context, "serviceRestartMillis." + serviceName, CompilerVariableHelper.getCompilerExtensionVariable(context, "serviceRestartMillis", getRestartMillis()));
/*     */   }
/*     */   
/*     */   private int getMaxRestarts(Context context, String serviceName) {
/* 782 */     return CompilerVariableHelper.getCompilerExtensionVariable(context, "serviceMaxRestarts." + serviceName, CompilerVariableHelper.getCompilerExtensionVariable(context, "serviceMaxRestarts", getMaxRestarts()));
/*     */   }
/*     */   
/*     */   private int getResetSeconds(Context context, String serviceName) {
/* 786 */     return CompilerVariableHelper.getCompilerExtensionVariable(context, "serviceResetSeconds." + serviceName, CompilerVariableHelper.getCompilerExtensionVariable(context, "serviceResetSeconds", getResetSeconds()));
/*     */   }
/*     */   
/*     */   public static class Info {
/*     */     private String executable;
/*     */     private String serviceName;
/*     */     private String macosIdentifier;
/*     */     
/*     */     public Info(String executable, String serviceName, String macosIdentifier) {
/* 795 */       this.executable = executable;
/* 796 */       this.serviceName = serviceName;
/* 797 */       this.macosIdentifier = macosIdentifier;
/*     */     }
/*     */     
/*     */     public String getExecutable() {
/* 801 */       return this.executable;
/*     */     }
/*     */     
/*     */     public void setExecutable(String executable) {
/* 805 */       this.executable = executable;
/*     */     }
/*     */     
/*     */     public String getServiceName() {
/* 809 */       return this.serviceName;
/*     */     }
/*     */     
/*     */     public void setServiceName(String serviceName) {
/* 813 */       this.serviceName = serviceName;
/*     */     }
/*     */     
/*     */     public String getMacosIdentifier() {
/* 817 */       return this.macosIdentifier;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\services\InstallServiceAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */