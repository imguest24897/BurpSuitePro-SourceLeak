/*    */ package com.install4j.runtime.launcher;
/*    */ 
/*    */ import com.exe4j.runtime.LauncherEngine;
/*    */ import com.exe4j.runtime.splash.SplashEngine;
/*    */ import com.exe4j.runtime.splash.SplashScreenConfig;
/*    */ import com.install4j.runtime.launcher.util.ErrorHandler;
/*    */ import com.install4j.runtime.launcher.util.LauncherUtil;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.Properties;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MacLauncher
/*    */ {
/*    */   public static final String CONFIG_FILENAME = "Contents/Resources/i4jlauncher.config";
/*    */   private static String exeBaseDir;
/*    */   
/*    */   public static void main(String[] args) {
/* 24 */     LauncherHelper.INSTANCE.initIntegration();
/*    */     
/*    */     try {
/* 27 */       args = LauncherHelper.INSTANCE.initVariables(MacLauncher.class, args);
/* 28 */       String appPackageDir = System.getProperty("exe4j.moduleName");
/* 29 */       LauncherEngine.setProperties(readProperties(appPackageDir + "/" + "Contents/Resources/i4jlauncher.config"));
/* 30 */       ErrorHandler.setIsGuiApplication(!LauncherEngine.getBooleanProperty(10007));
/*    */       
/* 32 */       if (LauncherEngine.getBooleanProperty(10006)) {
/* 33 */         exeBaseDir = appPackageDir + "/Contents/Resources/app/" + LauncherEngine.getProperty(10001);
/*    */       } else {
/* 35 */         exeBaseDir = appPackageDir + "/../";
/*    */       } 
/* 37 */       if (!exeBaseDir.endsWith("/")) {
/* 38 */         exeBaseDir += "/";
/*    */       }
/*    */       
/* 41 */       String className = LauncherEngine.getProperty(122);
/* 42 */       if (LauncherEngine.getBooleanProperty(133)) {
/* 43 */         className = "/" + className;
/*    */       }
/*    */       
/* 46 */       String stdErrFile = UnixLauncher.getRedirectionFileName(new File(exeBaseDir), null, 102, 103);
/* 47 */       String stdOutFile = UnixLauncher.getRedirectionFileName(new File(exeBaseDir), null, 104, 105);
/* 48 */       boolean failOnMainMethodException = LauncherEngine.getBooleanProperty(106);
/*    */       
/* 50 */       SplashEngine.setJavaSplashScreenConfig(LauncherEngine.getBooleanProperty(108), (new SplashScreenConfig()).initFromLauncherEngine());
/*    */       
/* 52 */       LauncherEngine.launch(className, args, stdErrFile, stdOutFile, failOnMainMethodException, true, ClassLoader.getSystemClassLoader());
/* 53 */     } catch (Exception e) {
/* 54 */       StringBuilder builder = (new StringBuilder(e.toString())).append('\n');
/* 55 */       for (StackTraceElement stackTraceElement : e.getStackTrace()) {
/* 56 */         builder.append(stackTraceElement).append('\n');
/*    */       }
/* 58 */       ErrorHandler.reportError("error2: " + builder);
/* 59 */       System.exit(1);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static Properties readProperties(String fileName) throws IOException {
/* 64 */     InputStream is = new FileInputStream(fileName);
/* 65 */     Properties properties = new Properties();
/* 66 */     properties.load(is);
/* 67 */     is.close();
/* 68 */     return LauncherUtil.replaceVariables(properties);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\MacLauncher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */