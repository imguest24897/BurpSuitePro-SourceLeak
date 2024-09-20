/*     */ package com.install4j.runtime.installer;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.windows.RegistryRoot;
/*     */ import com.install4j.api.windows.WinRegistry;
/*     */ import com.install4j.runtime.beans.applications.ExecutionMode;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.controller.Controller;
/*     */ import com.install4j.runtime.installer.controller.ScreenExecutor;
/*     */ import com.install4j.runtime.installer.frontend.InstallerWizardScreenExecutor;
/*     */ import com.install4j.runtime.installer.frontend.headless.InstallerConsoleScreenExecutor;
/*     */ import com.install4j.runtime.installer.frontend.headless.InstallerUnattendedScreenExecutor;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.NativeLogger;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.platform.win32.LauncherState;
/*     */ import java.awt.Window;
/*     */ import javax.swing.SwingUtilities;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Installer
/*     */ {
/*     */   private static String manualTempDir;
/*     */   
/*     */   public static void setManualTempDir(String manualTempDir) {
/*  27 */     if (manualTempDir != null) {
/*  28 */       if (manualTempDir.startsWith("\"") || manualTempDir.startsWith("'")) {
/*  29 */         manualTempDir = manualTempDir.substring(1);
/*     */       }
/*  31 */       if (manualTempDir.endsWith("\"") || manualTempDir.endsWith("'")) {
/*  32 */         manualTempDir = manualTempDir.substring(0, manualTempDir.length() - 1);
/*     */       }
/*     */     } 
/*  35 */     Installer.manualTempDir = manualTempDir;
/*     */   }
/*     */   
/*     */   public static String getManualTempDir() {
/*  39 */     return manualTempDir;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/*  46 */     if (!HelperCommunication.executeAsHelper(args)) {
/*     */       try {
/*  48 */         InstallerUtil.setInProcess(false);
/*  49 */         Runtime.getRuntime().addShutdownHook(new Thread(Installer::handleShutdown, "shutdown_installer"));
/*  50 */         runInProcess(args);
/*  51 */       } catch (Throwable t) {
/*  52 */         InstallerUtil.reportException(t);
/*  53 */         System.exit(1);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static void handleShutdown() {
/*  59 */     String pidValueName = LauncherState.getPidValueName();
/*  60 */     if (pidValueName != null && !pidValueName.isEmpty()) {
/*     */       try {
/*  62 */         WinRegistry.deleteValue(RegistryRoot.HKEY_CURRENT_USER, "SOFTWARE\\ej-technologies\\exe4j\\pids", pidValueName);
/*  63 */       } catch (Throwable throwable) {}
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void runInProcess(String[] args) {
/*  69 */     InstallerConfig.setCurrentApplicationId("installer");
/*  70 */     if (!InstallerUtil.isInProcess()) {
/*  71 */       NativeLogger.registerCleanup();
/*     */     }
/*  73 */     ScreenExecutor screenExecutor = getScreenExecutor(InstallerUtil.parseCommandLine(args), false, null);
/*  74 */     (new Controller(screenExecutor)).start();
/*     */   }
/*     */   static ScreenExecutor getScreenExecutor(InstallerUtil.CommandLineOptions commandLineOptions, boolean dialog, Window parentWindow) {
/*     */     ScreenExecutor screenExecutor;
/*  78 */     setManualTempDir(commandLineOptions.manualTempDir);
/*     */     
/*  80 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/*  81 */     if (commandLineOptions.installDir != null) {
/*  82 */       config.setInstallationDirectory(commandLineOptions.installDir);
/*  83 */       InstallerVariables.setInstallationDirectoryFromCommandLine(true);
/*     */     } 
/*     */     
/*  86 */     ExecutionMode executionMode = InstallerUtil.getExecutionMode(commandLineOptions, false);
/*     */     
/*  88 */     Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.err.println(Util.getAnnotatedStackTrace(e)));
/*     */     
/*  90 */     if (executionMode == ExecutionMode.UNATTENDED || executionMode == ExecutionMode.UNATTENDED_WITH_PROGRESS) {
/*     */       
/*  92 */       InstallerUtil.setUnattended(true);
/*  93 */       InstallerUnattendedScreenExecutor installerUnattendedScreenExecutor = new InstallerUnattendedScreenExecutor(commandLineOptions.quietOverwrite, commandLineOptions.noFileFailures, commandLineOptions.wait, InstallerUtil.getSplash(commandLineOptions, executionMode), InstallerUtil.isUnattendedAlerts(commandLineOptions, executionMode), dialog, parentWindow);
/*  94 */     } else if (executionMode == ExecutionMode.CONSOLE) {
/*     */       
/*  96 */       InstallerUtil.setConsole(true);
/*  97 */       InstallerConsoleScreenExecutor installerConsoleScreenExecutor = new InstallerConsoleScreenExecutor();
/*     */     } else {
/*  99 */       ScreenExecutor[] screenExecutors = new ScreenExecutor[1];
/*     */       try {
/* 101 */         SwingUtilities.invokeAndWait(() -> screenExecutors[0] = (ScreenExecutor)new InstallerWizardScreenExecutor(dialog, parentWindow));
/* 102 */       } catch (InterruptedException|java.lang.reflect.InvocationTargetException e) {
/* 103 */         throw new RuntimeException(e);
/*     */       } 
/* 105 */       screenExecutor = screenExecutors[0];
/*     */     } 
/*     */ 
/*     */     
/* 109 */     InstallerVariables.initCommandLine(commandLineOptions.varFileName, commandLineOptions.commandLineVars);
/* 110 */     return screenExecutor;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\Installer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */