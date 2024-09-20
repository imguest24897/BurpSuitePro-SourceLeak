/*     */ package com.install4j.runtime.installer;
/*     */ 
/*     */ import com.exe4j.runtime.util.ResourceHelper;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.beans.applications.ApplicationWithPath;
/*     */ import com.install4j.runtime.beans.applications.CustomApplication;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.controller.Controller;
/*     */ import com.install4j.runtime.installer.controller.ScreenExecutor;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.applaunch.ProgressCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import com.install4j.runtime.launcher.integration.UpdateLog;
/*     */ import com.install4j.runtime.launcher.util.SingleInstance;
/*     */ import com.install4j.runtime.util.StringUtil;
/*     */ import java.awt.Window;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Application
/*     */ {
/*     */   public static void main(String[] args) {
/*  32 */     if (!HelperCommunication.executeAsHelper(args)) {
/*  33 */       InstallerUtil.setInProcess(false);
/*  34 */       if (args.length == 0) {
/*  35 */         System.err.println("Please provide the application id as first argument");
/*  36 */         System.exit(1);
/*     */       } 
/*  38 */       String applicationId = args[0];
/*  39 */       String[] rest = new String[args.length - 1];
/*  40 */       System.arraycopy(args, 1, rest, 0, args.length - 1);
/*     */       
/*  42 */       InstallerConfig.setCurrentApplicationId(applicationId);
/*     */       
/*  44 */       CustomApplication customApplication = getCustomApplication();
/*  45 */       if (customApplication != null && customApplication.isSingleInstance() && customApplication.isCreateExecutable()) {
/*     */         File exeFileName;
/*  47 */         if (System.getProperty("exe4j.moduleName") != null) {
/*  48 */           exeFileName = new File(System.getProperty("exe4j.moduleName"));
/*     */         } else {
/*  50 */           exeFileName = getExeFile((ApplicationWithPath)customApplication);
/*     */         } 
/*  52 */         SingleInstance.checkForCurrentLauncher(exeFileName, false, null);
/*     */       } 
/*  54 */       InstallerUtil.CommandLineOptions commandLineOptions = InstallerUtil.parseCommandLine(rest);
/*  55 */       ProgressCommunication.init();
/*  56 */       runApplication(commandLineOptions, false, null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static synchronized void runApplicationInProcess(String applicationId, String[] arguments, boolean dialog, Window parentWindow) {
/*  61 */     FileInstaller.clearFileInstaller();
/*  62 */     InstallerConfig.clearCurrentApplication();
/*  63 */     InstallerConfig.setCurrentApplicationId(applicationId);
/*     */     
/*  65 */     if (arguments == null) {
/*  66 */       arguments = new String[0];
/*     */     }
/*  68 */     List<String> allArguments = new ArrayList<>();
/*  69 */     StringUtil.splitupCommandLine(allArguments, InstallerConfig.getCurrentApplication().getArguments());
/*  70 */     allArguments.addAll(Arrays.asList(arguments));
/*  71 */     InstallerUtil.CommandLineOptions commandLineOptions = InstallerUtil.parseCommandLine(allArguments.<String>toArray(new String[0]));
/*     */     
/*  73 */     Runnable runnable = () -> {
/*     */         try {
/*     */           runApplication(commandLineOptions, dialog, parentWindow);
/*     */         } finally {
/*     */           UpdateLog.setUpdaterApplication(false);
/*     */         } 
/*     */       };
/*     */     
/*  81 */     CustomApplication customApplication = getCustomApplication();
/*  82 */     if (customApplication != null && customApplication.isSingleInstance() && customApplication.isCreateExecutable()) {
/*  83 */       if (!SingleInstance.checkInProcessAndRun(getExeFile((ApplicationWithPath)customApplication), runnable)) {
/*  84 */         InstallerUtil.exit(0);
/*     */       }
/*     */     } else {
/*  87 */       runnable.run();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void runApplication(InstallerUtil.CommandLineOptions commandLineOptions, boolean dialog, Window parentWindow) {
/*     */     try {
/*  93 */       ScreenExecutor screenExecutor = Installer.getScreenExecutor(commandLineOptions, dialog, parentWindow);
/*     */       
/*  95 */       initInstallationDirectory();
/*     */       
/*  97 */       (new Controller(screenExecutor)).start();
/*  98 */     } catch (Throwable t) {
/*  99 */       InstallerUtil.reportException(t);
/* 100 */       InstallerUtil.exit(1);
/*     */     } 
/*     */   }
/*     */   static void initInstallationDirectory() {
/*     */     File installationDirectory;
/* 105 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/* 106 */     File runtimeDir = ResourceHelper.getRuntimeDir();
/*     */     
/* 108 */     if (Util.isMacOS() && config.getMacSpecificConfig().isSingleBundle()) {
/* 109 */       File bundleDirectory = makeCanonical(new File(runtimeDir, "../../../.."));
/* 110 */       config.getMacSpecificConfig().setSingleBundleName(bundleDirectory.getName());
/* 111 */       installationDirectory = bundleDirectory.getParentFile();
/*     */     } else {
/* 113 */       installationDirectory = new File(runtimeDir, "..");
/*     */     } 
/* 115 */     config.setInstallationDirectory(makeCanonical(installationDirectory));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static File makeCanonical(File file) {
/*     */     try {
/* 121 */       return file.getCanonicalFile();
/* 122 */     } catch (IOException e) {
/* 123 */       return file.getAbsoluteFile();
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static File getExeFile(ApplicationWithPath application) {
/* 129 */     if (application instanceof CustomApplication && !((CustomApplication)application).isCreateExecutable()) {
/* 130 */       return null;
/*     */     }
/* 132 */     File execDir = getExecutableDir(application);
/* 133 */     File execFile = new File(execDir, application.getExecutableName() + (Util.isWindows() ? ".exe" : ""));
/*     */     try {
/* 135 */       return execFile.getCanonicalFile();
/* 136 */     } catch (IOException e) {
/* 137 */       e.printStackTrace();
/* 138 */       return execFile;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static File getExecutableDir(ApplicationWithPath application) {
/* 144 */     File execDir = application.getExecutableDirectory();
/* 145 */     if (execDir == null || execDir.getPath().trim().equals("")) {
/* 146 */       return ResourceHelper.getRuntimeDir();
/*     */     }
/* 148 */     return new File(ResourceHelper.getRuntimeDir(), "../" + execDir.getPath());
/*     */   }
/*     */ 
/*     */   
/*     */   private static CustomApplication getCustomApplication() {
/* 153 */     com.install4j.runtime.beans.applications.Application application = InstallerConfig.getCurrentApplication();
/* 154 */     if (application instanceof CustomApplication) {
/* 155 */       return (CustomApplication)application;
/*     */     }
/* 157 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\Application.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */