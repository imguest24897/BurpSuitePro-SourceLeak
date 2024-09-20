/*     */ package com.install4j.runtime.beans.actions.misc;
/*     */ 
/*     */ import com.exe4j.runtime.util.ResourceHelper;
/*     */ import com.exe4j.runtime.util.WinDel;
/*     */ import com.install4j.api.UiUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*     */ import com.install4j.runtime.beans.applications.Application;
/*     */ import com.install4j.runtime.beans.applications.ApplicationWithPath;
/*     */ import com.install4j.runtime.beans.applications.CustomApplication;
/*     */ import com.install4j.runtime.beans.applications.InstallerApplication;
/*     */ import com.install4j.runtime.installer.Application;
/*     */ import com.install4j.runtime.installer.Installer;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.config.MsiScope;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.frontend.SplashProgressInterface;
/*     */ import com.install4j.runtime.installer.frontend.WizardScreenExecutor;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.MsiHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.console.ConsoleImpl;
/*     */ import com.install4j.runtime.installer.platform.macos.MacAuthorization;
/*     */ import com.install4j.runtime.installer.platform.win32.MsiCommunication;
/*     */ import com.install4j.runtime.installer.platform.win32.Win32UserInfo;
/*     */ import com.install4j.runtime.launcher.integration.gui.AwtAndFxWindowChecker;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Window;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.swing.SwingUtilities;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractPrivilegesAction
/*     */   extends SystemInstallOrUninstallAction
/*     */ {
/*     */   private static boolean helperStarted = false;
/*     */   
/*     */   protected boolean startOnLinux(Context context) throws UserCanceledException {
/*  56 */     boolean usePkexec = (context.isGui() || InstallerUtil.isUnattendedAlerts() || InstallerUtil.isUnattendedWithProgress());
/*  57 */     if (!usePkexec && context.isUnattended()) {
/*  58 */       return false;
/*     */     }
/*  60 */     if (helperStarted) {
/*  61 */       return true;
/*     */     }
/*     */     
/*  64 */     String moduleName = getModuleName();
/*  65 */     if (moduleName == null) {
/*  66 */       return true;
/*     */     }
/*  68 */     if (!(new File(moduleName)).exists()) {
/*  69 */       Util.showMessage(Messages.format(Messages.getString(".ErrorInternal2"), new Object[] { "Could not start elevated: " + moduleName }), 0);
/*  70 */       return false;
/*     */     } 
/*     */     
/*  73 */     HelperCommunication helperCommunication = HelperCommunication.getInstance();
/*  74 */     String identifier = helperCommunication.createListener();
/*  75 */     if (identifier == null) return false;
/*     */     
/*  77 */     ProcessBuilder.Redirect inputRedirect = ProcessBuilder.Redirect.PIPE;
/*  78 */     List<String> command = new ArrayList<>();
/*  79 */     if (usePkexec) {
/*  80 */       command.add("pkexec");
/*  81 */       command.add("--disable-internal-agent");
/*  82 */       command.addAll(getMainCommand(context, moduleName, helperCommunication, identifier));
/*     */     } else {
/*  84 */       inputRedirect = ProcessBuilder.Redirect.INHERIT;
/*  85 */       boolean useSudo = (ConsoleImpl.getInstance().askOption(Messages.getString(".RootAuthorizationMethod"), new String[] { "sudo", "su" }, null, 0) == 0);
/*  86 */       if (useSudo) {
/*  87 */         command.add("sudo");
/*  88 */         command.addAll(getMainCommand(context, moduleName, helperCommunication, identifier));
/*     */       } else {
/*  90 */         command.add("su");
/*  91 */         command.add("-c");
/*  92 */         command.add(getMainCommand(context, moduleName, helperCommunication, identifier).stream().map(s -> "\"" + s + "\"").collect(Collectors.joining(" ")));
/*     */       } 
/*     */     } 
/*     */     
/*     */     try {
/*  97 */       Process process = (new ProcessBuilder(command)).redirectError(ProcessBuilder.Redirect.INHERIT).redirectOutput(ProcessBuilder.Redirect.INHERIT).redirectInput(inputRedirect).start();
/*  98 */       if (process.waitFor(10L, TimeUnit.MINUTES)) {
/*  99 */         int exitValue = process.exitValue();
/* 100 */         if (exitValue != 0) {
/* 101 */           Logger.getInstance().error(this, "Exit value of helper process is " + exitValue);
/*     */         } else {
/* 103 */           helperStarted = helperCommunication.connect();
/*     */         } 
/*     */       } 
/* 106 */     } catch (IOException|InterruptedException e) {
/* 107 */       Logger.getInstance().log(e);
/* 108 */       return false;
/*     */     } 
/*     */     
/* 111 */     return helperStarted;
/*     */   }
/*     */   
/*     */   private List<String> getMainCommand(Context context, String moduleName, HelperCommunication helperCommunication, String identifier) {
/* 115 */     List<String> command = new ArrayList<>();
/*     */     
/* 117 */     if (InstallerConfig.isInstaller()) {
/* 118 */       command.add("/bin/sh");
/*     */     }
/* 120 */     command.add(moduleName);
/* 121 */     command.add("__i4j_auth_restart");
/* 122 */     command.add((new File(System.getProperty("user.dir"))).getAbsolutePath());
/* 123 */     command.add((new File(System.getProperty("java.home"))).getAbsolutePath());
/* 124 */     if (Installer.getManualTempDir() != null) {
/* 125 */       command.add("-temp");
/* 126 */       command.add(Installer.getManualTempDir());
/*     */     } 
/* 128 */     for (String argument : getCommonArguments(context, identifier, helperCommunication.getHash())) {
/* 129 */       command.add("-J" + argument);
/*     */     }
/* 131 */     return command;
/*     */   }
/*     */   
/*     */   protected boolean startOnMac(Context context) {
/* 135 */     if (!Util.isMacosInstaller()) {
/* 136 */       return false;
/*     */     }
/*     */     
/* 139 */     if (helperStarted) {
/* 140 */       return true;
/*     */     }
/*     */     
/* 143 */     HelperCommunication helperCommunication = HelperCommunication.getInstance();
/* 144 */     String identifier = helperCommunication.createListener();
/* 145 */     if (identifier == null) return false;
/*     */     
/* 147 */     List<String> arguments = getJavaArguments(context, identifier, helperCommunication.getHash(), !InstallerUtil.isInProcess());
/*     */     
/* 149 */     String prompt = MacAuthorization.getDefaultPrompt((InstallerConfig.getCurrentInstance() == null) ? null : InstallerConfig.getCurrentInstance().getApplicationName());
/*     */     try {
/* 151 */       MacAuthorization.execute(prompt, getJavaPath(), arguments);
/* 152 */       helperStarted = helperCommunication.connect();
/* 153 */     } catch (com.install4j.runtime.installer.platform.macos.MacAuthorization.BaseAuthorizationException e) {
/* 154 */       Logger.getInstance().log((Throwable)e);
/*     */     } 
/*     */     
/* 157 */     return helperStarted;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private String getJavaPath() {
/* 162 */     return (new File(System.getProperty("java.home"), "bin/java")).getAbsolutePath();
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private List<String> getJavaArguments(Context context, String identifier, String hash, boolean useCurrentClassPath) {
/*     */     String classPath;
/* 169 */     if (useCurrentClassPath) {
/* 170 */       classPath = System.getProperty("java.class.path");
/*     */     } else {
/* 172 */       classPath = (new File(ResourceHelper.getRuntimeDir(), "i4jruntime.jar")).getAbsolutePath();
/*     */     } 
/*     */     
/* 175 */     List<String> arguments = new ArrayList<>();
/* 176 */     arguments.add("-classpath");
/* 177 */     arguments.add(classPath);
/* 178 */     arguments.addAll(getCommonArguments(context, identifier, hash));
/* 179 */     if (System.getProperty("exe4j.moduleName") != null) {
/* 180 */       arguments.add("-Dexe4j.moduleName=" + System.getProperty("exe4j.moduleName"));
/*     */     }
/* 182 */     if (System.getProperty("i4j.jreBundle") != null) {
/* 183 */       arguments.add("-Di4j.jreBundle=" + System.getProperty("i4j.jreBundle"));
/*     */     }
/* 185 */     if (System.getProperty("i4j.tarFile") != null) {
/* 186 */       arguments.add("-Di4j.tarFile=" + System.getProperty("i4j.tarFile"));
/*     */     }
/* 188 */     if (System.getProperty("install4j.debugLaunch") != null) {
/* 189 */       arguments.add("-Dinstall4j.debugLaunch=" + System.getProperty("install4j.debugLaunch"));
/*     */     }
/* 191 */     if (System.getProperty("install4j.noSuid") != null) {
/* 192 */       arguments.add("-Dinstall4j.noSuid=" + System.getProperty("install4j.noSuid"));
/*     */     }
/* 194 */     arguments.add("-Dapple.awt.UIElement=true");
/* 195 */     arguments.add(HelperCommunication.class.getName());
/*     */     
/* 197 */     Logger.getInstance().info(null, "args: " + arguments);
/* 198 */     return arguments;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isRollbackSupported() {
/* 203 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean startOnWindows(Context context) {
/* 207 */     Window parentWindow = UiUtil.getParentWindow();
/* 208 */     if (parentWindow != null) {
/* 209 */       parentWindow.setCursor(Cursor.getPredefinedCursor(3));
/*     */     }
/*     */     try {
/* 212 */       return startOnWindowsUnguarded(context);
/*     */     } finally {
/* 214 */       if (parentWindow != null) {
/* 215 */         parentWindow.setCursor(Cursor.getPredefinedCursor(0));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean startOnWindowsUnguarded(Context context) {
/* 221 */     if (!Util.isAtLeastWindowsVista()) {
/* 222 */       return false;
/*     */     }
/* 224 */     if (helperStarted) {
/* 225 */       Util.logInfo(this, "Elevated helper process already started");
/* 226 */       return true;
/*     */     } 
/*     */     
/* 229 */     if (MsiHelper.isStartedFromMsi()) {
/* 230 */       if (!MsiHelper.isMsiAllUsers(context) && MsiHelper.getMsiScope() == MsiScope.PER_USER) {
/* 231 */         Util.logInfo(this, "Elevation is not available in a per-user MSI scope");
/* 232 */         return false;
/*     */       } 
/* 234 */       if (context.isUnattended()) {
/* 235 */         Util.logInfo(this, "Elevation is not available for MSI in unattended mode");
/* 236 */         return false;
/*     */       } 
/*     */     } 
/*     */     
/* 240 */     if (Win32UserInfo.isUACDisabled()) {
/* 241 */       return false;
/*     */     }
/*     */     
/* 244 */     String moduleName = getModuleName();
/* 245 */     if (moduleName == null) {
/* 246 */       return true;
/*     */     }
/* 248 */     if (!(new File(moduleName)).exists()) {
/* 249 */       Util.logError(this, "Executable " + moduleName + " not found");
/* 250 */       Util.showMessage(Messages.format(Messages.getString(".ErrorInternal2"), new Object[] { "Could not start elevated: " + moduleName }), 0);
/* 251 */       return false;
/*     */     } 
/*     */     
/* 254 */     HelperCommunication helperCommunication = HelperCommunication.getInstance();
/* 255 */     String identifier = helperCommunication.createListener();
/* 256 */     if (identifier == null) return false; 
/* 257 */     Util.logInfo(this, "Starting elevated helper");
/*     */     
/* 259 */     SplashProgressInterface splashProgressInterface = checkSplashScreen(context);
/*     */     
/* 261 */     InstallerUtil.storeJreInfoForInstaller();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 269 */     String arguments = "__i4j_lang_restart" + ((Installer.getManualTempDir() == null) ? "" : (" -temp \"" + Installer.getManualTempDir() + "\"")) + joinWithPrefix(getCommonArguments(context, identifier, helperCommunication.getHash())) + " -J-D" + "exe4j.unextractedPositionRestart" + "=" + Integer.getInteger("exe4j.unextractedPositionRestart", Integer.getInteger("exe4j.unextractedPosition", 0)) + " -J-D" + "install4j.dontUninstallServices" + "=" + Boolean.getBoolean("install4j.dontUninstallServices") + ((WinDel.SEMAPHORE_NAME == null) ? "" : (" \"-J-Dexe4j.semaphoreName=" + WinDel.SEMAPHORE_NAME + "\"")) + ((System.getProperty("windel.logfile") == null) ? "" : (" \"-J-Dwindel.logfile=" + System.getProperty("windel.logfile") + "\""));
/* 270 */     if (MsiCommunication.isConnected()) {
/* 271 */       if (InstallerConfig.getCurrentInstance().getWindowsSpecificConfig().getMsiScope() == MsiScope.PER_USER) {
/* 272 */         MsiCommunication.sendElevationRequested();
/*     */       } else {
/* 274 */         helperStarted = MsiCommunication.executeElevated(MsiHelper.addMsiArguments(arguments));
/* 275 */         if (helperStarted) {
/* 276 */           MsiHelper.setMsiAllUsers(true);
/*     */         }
/*     */       } 
/*     */     } else {
/* 280 */       helperStarted = Win32UserInfo.executeElevated(moduleName, arguments, System.getProperty("user.dir"));
/*     */     } 
/* 282 */     helperStarted = (helperStarted && helperCommunication.connect());
/*     */     
/* 284 */     if (helperStarted && 
/* 285 */       !checkFullAdminRights()) {
/* 286 */       Logger.getInstance().error(this, "The elevated helper does not have full admin rights");
/* 287 */       helperCommunication.terminate();
/* 288 */       helperStarted = false;
/*     */     } 
/*     */ 
/*     */     
/* 292 */     if (splashProgressInterface != null) {
/* 293 */       splashProgressInterface.setVisible(false);
/*     */     }
/*     */     
/* 296 */     return helperStarted;
/*     */   }
/*     */   
/*     */   private static String joinWithPrefix(List<String> arguments) {
/* 300 */     StringBuilder builder = new StringBuilder();
/* 301 */     for (String argument : arguments) {
/* 302 */       builder.append(" -J");
/* 303 */       builder.append(argument);
/*     */     } 
/* 305 */     return builder.toString();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private List<String> getCommonArguments(Context context, String identifier, String hash) {
/* 310 */     List<String> arguments = new ArrayList<>();
/* 311 */     int debugPort = Integer.getInteger("install4j.helperDebugPort", 0).intValue();
/* 312 */     if (debugPort > 0) {
/* 313 */       arguments.add("-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=" + debugPort);
/*     */     }
/* 315 */     arguments.add(System.getProperty("install4j.helperMaxHeap", "-Xmx128m"));
/*     */     
/* 317 */     arguments.add("-Duser.language=" + context.getLanguageId());
/* 318 */     arguments.add("-Dinstall4j.language=" + context.getLanguageId());
/* 319 */     arguments.add("-Dinstall4j.systemLanguage=" + System.getProperty("install4j.systemLanguage"));
/* 320 */     arguments.add("-Dinstall4j.commIdentifier=" + identifier);
/* 321 */     arguments.add("-Dinstall4j.commHash=" + hash);
/* 322 */     arguments.add("-Dinstall4j.helperAppId=" + InstallerConfig.getCurrentApplicationId());
/* 323 */     arguments.add("-Dinstall4j.helperLog=" + Boolean.getBoolean("install4j.helperLog"));
/* 324 */     arguments.add("-Dinstall4j.dontUninstallServices=" + Boolean.getBoolean("install4j.dontUninstallServices"));
/* 325 */     return arguments;
/*     */   }
/*     */   
/*     */   protected boolean setAdminRightsVariable() {
/* 329 */     boolean adminRights = ((Util.isAdminGroup() && Util.hasFullAdminRights()) || HelperCommunication.getInstance().hasElevatedHelper());
/* 330 */     InstallerVariables.setAdminRightsFromPrivilegesAction(adminRights);
/* 331 */     return adminRights;
/*     */   }
/*     */   
/*     */   private static boolean checkFullAdminRights() {
/* 335 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.MAXIMUM, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws Exception {
/* 338 */             return Util.hasFullAdminRights();
/*     */           }
/*     */         });
/*     */   }
/*     */   @Nullable
/*     */   private String getModuleName() {
/*     */     String moduleName;
/* 345 */     Application application = InstallerConfig.getCurrentApplication();
/* 346 */     if (application instanceof CustomApplication && !((CustomApplication)application).isCreateExecutable()) {
/* 347 */       Util.logError(this, "No elevation can be performed in a custom application without an executable.");
/* 348 */       return null;
/*     */     } 
/*     */     
/* 351 */     if (InstallerUtil.isInProcess()) {
/* 352 */       File exeFile = Application.getExeFile((ApplicationWithPath)application);
/* 353 */       if (exeFile != null) {
/* 354 */         moduleName = exeFile.getAbsolutePath();
/*     */       } else {
/* 356 */         moduleName = null;
/* 357 */         Util.logError(this, "Internal error: The executable of the custom application is null.");
/*     */       } 
/*     */     } else {
/* 360 */       moduleName = System.getProperty("exe4j.moduleName");
/* 361 */       if (moduleName == null)
/*     */       {
/* 363 */         Util.showMessage("No elevation can be performed for debug installers. Continuing without elevation.", 1);
/*     */       }
/*     */     } 
/* 366 */     return moduleName;
/*     */   }
/*     */   
/*     */   private SplashProgressInterface checkSplashScreen(Context context) {
/* 370 */     SplashProgressInterface ret = null;
/*     */     
/* 372 */     if ((!InstallerConfig.isInstaller() || ((InstallerApplication)InstallerConfig.getCurrentApplication()).isSuppressProgressDialog()) && !context.isConsole() && !context.isUnattended() && !AwtAndFxWindowChecker.hasVisibleWindows()) {
/* 373 */       String title = "install4j";
/* 374 */       if (context.getWizardContext() instanceof WizardScreenExecutor) {
/* 375 */         title = ((WizardScreenExecutor)context.getWizardContext()).getWindowTitle();
/*     */       }
/* 377 */       SplashProgressInterface splashProgressInterface = new SplashProgressInterface(title, false, false, false, null, false, null);
/* 378 */       ret = splashProgressInterface;
/* 379 */       splashProgressInterface.setStatusMessage(Messages.getString(".ProcessElevationTitle"));
/*     */       try {
/* 381 */         Runnable runnable = () -> {
/*     */             splashProgressInterface.setIndeterminateProgress(true);
/*     */             splashProgressInterface.setVisible(true);
/*     */           };
/* 385 */         if (EventQueue.isDispatchThread()) {
/* 386 */           runnable.run();
/*     */         } else {
/* 388 */           SwingUtilities.invokeAndWait(runnable);
/*     */         } 
/* 390 */       } catch (InterruptedException|java.lang.reflect.InvocationTargetException e) {
/* 391 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/* 394 */     return ret;
/*     */   }
/*     */   
/*     */   protected void showFailureMessage(Context context) throws UserCanceledException {
/*     */     String message;
/* 399 */     if (context instanceof com.install4j.api.context.InstallerContext) {
/* 400 */       if (InstallerConfig.getCurrentApplication() instanceof InstallerApplication) {
/* 401 */         message = Util.isWindows() ? Messages.getString(".AdminPrivilegesRequired") : Messages.getString(".RootPrivilegesRequired");
/*     */       } else {
/* 403 */         message = Util.isWindows() ? Messages.getString(".AdminPrivilegesRequiredExecute") : Messages.getString(".RootPrivilegesRequiredExecute");
/*     */       } 
/*     */     } else {
/* 406 */       message = Messages.getString(".OnlyAdminCanUninstall");
/*     */     } 
/* 408 */     Util.showMessage(message, 0);
/* 409 */     throw new UserCanceledException("not admin");
/*     */   }
/*     */   
/*     */   private String getHelperDebugArgument(String prefix, boolean withSpace) {
/* 413 */     int debugPort = Integer.getInteger("install4j.helperDebugPort", 0).intValue();
/* 414 */     if (debugPort > 0) {
/* 415 */       return (withSpace ? " " : "") + prefix + "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=" + debugPort;
/*     */     }
/* 417 */     return "";
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\AbstractPrivilegesAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */