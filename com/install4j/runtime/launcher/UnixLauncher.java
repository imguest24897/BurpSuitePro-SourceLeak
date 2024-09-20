/*     */ package com.install4j.runtime.launcher;
/*     */ 
/*     */ import com.exe4j.runtime.LauncherEngine;
/*     */ import com.exe4j.runtime.splash.SplashEngine;
/*     */ import com.exe4j.runtime.splash.SplashScreenConfig;
/*     */ import com.exe4j.runtime.util.ArgumentStack;
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.exe4j.runtime.util.ResourceHelper;
/*     */ import com.install4j.runtime.installer.platform.win32.Common;
/*     */ import com.install4j.runtime.launcher.service.UnixServiceHandler;
/*     */ import com.install4j.runtime.launcher.util.ErrorHandler;
/*     */ import com.install4j.runtime.launcher.util.LauncherUtil;
/*     */ import com.install4j.runtime.launcher.util.SingleInstance;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.InputStream;
/*     */ import java.util.Properties;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UnixLauncher
/*     */ {
/*     */   public static final String PROPNAME_EXECUTABLE_PATH = "executablePath";
/*     */   private static boolean isGuiApplication;
/*     */   private static boolean failOnMainMethodException;
/*     */   private static String[] originalArgs;
/*     */   private static String stdErrFile;
/*     */   private static String stdOutFile;
/*     */   private static String className;
/*     */   
/*     */   public static void start(String className, String method, String configId, Properties properties, String[] args) {
/*  35 */     if (System.getProperty("java.net.useSystemProxies") == null) {
/*  36 */       System.setProperty("java.net.useSystemProxies", "true");
/*     */     }
/*  38 */     LauncherHelper.INSTANCE.initIntegration();
/*  39 */     args = LauncherHelper.INSTANCE.initVariables(UnixLauncher.class, args);
/*     */     
/*  41 */     ArgumentStack argStack = new ArgumentStack(args);
/*  42 */     if (method == null) {
/*  43 */       method = argStack.popString();
/*     */     }
/*     */     try {
/*  46 */       System.setProperty("install4j.jvmDir", System.getProperty("java.home"));
/*     */       
/*  48 */       File runtimeDir = ResourceHelper.getRuntimeDir();
/*  49 */       String moduleName = System.getProperty("exe4j.moduleName");
/*  50 */       if (moduleName == null) {
/*  51 */         String relativePath = properties.getProperty("executablePath", "unknown");
/*  52 */         moduleName = FileUtil.getCanonicalPath(new File(new File(runtimeDir, ".."), relativePath));
/*  53 */         System.setProperty("exe4j.moduleName", moduleName);
/*     */       } 
/*  55 */       LauncherEngine.setProperties(properties);
/*     */       
/*  57 */       if (method.equals("stop")) {
/*  58 */         UnixServiceHandler.INSTANCE.setStop();
/*  59 */       } else if (method.equals("status")) {
/*  60 */         UnixServiceHandler.INSTANCE.reportStatus();
/*     */       } else {
/*  62 */         File exeBaseDir = (new File(moduleName)).getParentFile();
/*  63 */         File installerTempDir = isInstaller(configId) ? runtimeDir : null;
/*     */         
/*  65 */         stdErrFile = getRedirectionFileName(exeBaseDir, installerTempDir, 102, 103);
/*  66 */         stdOutFile = getRedirectionFileName(exeBaseDir, installerTempDir, 104, 105);
/*     */         
/*  68 */         prepareLaunch(argStack, method, configId, LauncherEngine.getBooleanProperty(125));
/*  69 */         LauncherEngine.launch(className, originalArgs, stdErrFile, stdOutFile, failOnMainMethodException, isGuiApplication, ClassLoader.getSystemClassLoader());
/*     */       } 
/*  71 */     } catch (Exception e) {
/*  72 */       e.printStackTrace();
/*  73 */       ErrorHandler.reportError(e.toString());
/*  74 */       System.exit(1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/*  80 */     LauncherHelper.INSTANCE.initIntegration();
/*  81 */     args = LauncherHelper.INSTANCE.initVariables(UnixLauncher.class, args);
/*     */     
/*     */     try {
/*  84 */       ArgumentStack argStack = new ArgumentStack(args);
/*     */       
/*  86 */       String method = argStack.popString();
/*     */       
/*  88 */       if (method.equals("stop")) {
/*  89 */         UnixServiceHandler.INSTANCE.setStop();
/*  90 */       } else if (method.equals("status")) {
/*  91 */         UnixServiceHandler.INSTANCE.reportStatus();
/*     */       } else {
/*  93 */         String configId = argStack.popString();
/*  94 */         LauncherEngine.setProperties(readProperties(configId));
/*  95 */         stdErrFile = argStack.popString();
/*  96 */         stdOutFile = argStack.popString();
/*  97 */         className = argStack.popString();
/*     */         
/*  99 */         prepareLaunch(argStack, method, configId, Boolean.getBoolean("i4j.vpt"));
/* 100 */         LauncherEngine.launch(className, originalArgs, stdErrFile, stdOutFile, failOnMainMethodException, isGuiApplication, ClassLoader.getSystemClassLoader());
/*     */       } 
/* 102 */     } catch (Exception e) {
/* 103 */       e.printStackTrace();
/* 104 */       ErrorHandler.reportError(e.toString());
/* 105 */       System.exit(1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void prepareLaunch(ArgumentStack argStack, String method, String configId, boolean removeVmPassThrough) {
/* 110 */     if (LauncherUtil.isMacOS() && !LauncherHelper.INSTANCE.getInstallerFile(Common.getMacLibraryFilename(0)).isFile()) {
/* 111 */       System.setProperty("install4j.noNativeDialogs", "true");
/*     */     }
/*     */     
/* 114 */     isGuiApplication = LauncherEngine.getBooleanProperty(162);
/* 115 */     ErrorHandler.setIsGuiApplication(isGuiApplication);
/*     */     
/* 117 */     failOnMainMethodException = LauncherEngine.getBooleanProperty(106);
/*     */     
/* 119 */     originalArgs = Launcher.getArgumentArray(argStack, argStack.size(), removeVmPassThrough);
/* 120 */     Launcher.setOriginalArgs(originalArgs);
/*     */     
/* 122 */     SplashEngine.setJavaSplashScreenConfig(LauncherEngine.getBooleanProperty(108), (new SplashScreenConfig()).initFromLauncherEngine());
/*     */     
/* 124 */     if (method.equals("launch")) {
/* 125 */       checkSingleInstance(configId, originalArgs);
/* 126 */       checkWarning();
/* 127 */     } else if (method.equals("start")) {
/* 128 */       UnixServiceHandler.INSTANCE.setStart();
/* 129 */       if (LauncherEngine.getBooleanProperty(10011)) {
/* 130 */         checkSingleInstance(configId, originalArgs);
/*     */       }
/* 132 */     } else if (method.equals("run")) {
/* 133 */       checkSingleInstance(configId, originalArgs);
/* 134 */       checkWarning();
/* 135 */       stdErrFile = "";
/* 136 */       stdOutFile = "";
/* 137 */     } else if (method.equals("run-redirect")) {
/* 138 */       checkSingleInstance(configId, originalArgs);
/* 139 */       checkWarning();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void checkSingleInstance(String configId, String[] originalArgs) {
/* 144 */     boolean restart = (originalArgs.length >= 1 && ("__i4j_lang_restart".equals(originalArgs[0]) || "__i4j_auth_restart".equals(originalArgs[0])));
/* 145 */     if (!restart && LauncherEngine.getBooleanProperty(10005)) {
/* 146 */       String moduleName = System.getProperty("exe4j.moduleName");
/* 147 */       if (moduleName != null) {
/* 148 */         SingleInstance.checkForCurrentLauncher(new File(moduleName), LauncherEngine.getBooleanProperty(158), 
/* 149 */             isInstaller(configId) ? null : originalArgs);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void checkWarning() {
/* 155 */     if (LauncherEngine.getBooleanProperty(148)) {
/* 156 */       System.out.println("This launcher was created with an evaluation version of install4j.");
/*     */     }
/*     */   }
/*     */   
/*     */   private static Properties readProperties(String configId) {
/* 161 */     if (isInstaller(configId)) {
/* 162 */       Properties properties = new Properties();
/* 163 */       properties.setProperty(String.valueOf(162), String.valueOf(1));
/* 164 */       properties.setProperty(String.valueOf(10005), String.valueOf(1));
/* 165 */       return properties;
/*     */     } 
/*     */     try {
/* 168 */       InputStream in = new BufferedInputStream(new FileInputStream(LauncherHelper.INSTANCE.getInstallerFile(configId + ".lprop")));
/* 169 */       Properties properties = new Properties();
/* 170 */       properties.load(in);
/* 171 */       return LauncherUtil.replaceVariables(properties);
/* 172 */     } catch (Throwable e) {
/* 173 */       e.printStackTrace();
/* 174 */       return new Properties();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean isInstaller(String configId) {
/* 180 */     return configId.equals("0");
/*     */   }
/*     */   
/*     */   static String getRedirectionFileName(File exeBaseDir, File installerTempDir, int propertyRedirect, int propertyFile) {
/* 184 */     String redirectionFile = "";
/* 185 */     if (LauncherEngine.getBooleanProperty(propertyRedirect)) {
/* 186 */       String file = LauncherHelper.INSTANCE.replaceVariables(LauncherEngine.getProperty(propertyFile), new LauncherReplacementCallback(exeBaseDir, installerTempDir));
/* 187 */       file = file.replace("//", "/");
/* 188 */       if (!file.startsWith(File.separator)) {
/* 189 */         redirectionFile = exeBaseDir.getAbsolutePath() + File.separator;
/*     */       }
/* 191 */       redirectionFile = redirectionFile + file;
/*     */     } 
/* 193 */     return redirectionFile;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\UnixLauncher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */