/*    */ package com.install4j.runtime.installer.helper.versionspecific;
/*    */ 
/*    */ import com.install4j.api.launcher.StartupNotification;
/*    */ import com.install4j.runtime.installer.helper.content.JavaHttpConnection;
/*    */ import com.install4j.runtime.util.VersionCheck;
/*    */ import java.io.IOException;
/*    */ import java.net.Proxy;
/*    */ import java.net.URL;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class VersionSpecificHelper
/*    */ {
/*    */   private static VersionSpecificHelperInterface helper;
/*    */   public static final String JAVA9_CLASS_NAME = "com.install4j.runtime.installer.helper.versionspecific.Java9Helper";
/*    */   public static final String JAVA11_CLASS_NAME = "com.install4j.runtime.installer.helper.versionspecific.Java11Helper";
/*    */   
/*    */   static {
/* 21 */     String className = null;
/* 22 */     String javaVersion = System.getProperty("java.version");
/* 23 */     if (VersionCheck.checkJavaVersionCompatible("11", javaVersion)) {
/* 24 */       className = "com.install4j.runtime.installer.helper.versionspecific.Java11Helper";
/* 25 */     } else if (VersionCheck.checkJavaVersionCompatible("9", javaVersion)) {
/* 26 */       className = "com.install4j.runtime.installer.helper.versionspecific.Java9Helper";
/*    */     } 
/*    */     
/* 29 */     if (className == null) {
/* 30 */       helper = new NoHelper();
/*    */     } else {
/*    */       try {
/* 33 */         helper = (VersionSpecificHelperInterface)Class.forName(className).newInstance();
/* 34 */       } catch (Throwable e) {
/* 35 */         helper = new NoHelper();
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public static boolean isJavaFxWindowShown() {
/* 41 */     return helper.isJavaFxWindowShown();
/*    */   }
/*    */   
/*    */   public static void requestForeground() {
/* 45 */     helper.requestForeground();
/*    */   }
/*    */   
/*    */   public static void setMacHandleQuit(boolean handleQuit) {
/* 49 */     helper.setMacHandleQuit(handleQuit);
/*    */   }
/*    */   
/*    */   public static void setMacStartupListener(StartupNotification.Listener listener) {
/* 53 */     helper.setMacStartupListener(listener);
/*    */   }
/*    */   
/*    */   public static void setMacQuitHandler(Runnable runnable) {
/* 57 */     helper.setMacQuitHandler(runnable);
/*    */   }
/*    */   
/*    */   public static void setMacAboutHandler(Runnable runnable) {
/* 61 */     helper.setMacAboutHandler(runnable);
/*    */   }
/*    */   
/*    */   public static void setMacPreferencesHandler(Runnable runnable) {
/* 65 */     helper.setMacPreferencesHandler(runnable);
/*    */   }
/*    */   
/*    */   public static void addReads(String moduleName) {
/* 69 */     helper.addReads(moduleName);
/*    */   }
/*    */   
/*    */   public static long getPid() {
/* 73 */     return helper.getPid();
/*    */   }
/*    */   
/*    */   public static int waitForOrTerminate(Process process, int timeoutSeconds, boolean terminate) throws InterruptedException {
/* 77 */     if (timeoutSeconds < 0) {
/* 78 */       timeoutSeconds = 0;
/*    */     }
/* 80 */     return helper.waitFor(process, timeoutSeconds, terminate);
/*    */   }
/*    */   
/*    */   public static JavaHttpConnection createHttpConnection(URL url, Proxy proxy, boolean acceptAllCertificates) throws IOException {
/* 84 */     return helper.createHttpConnection(url, proxy, acceptAllCertificates);
/*    */   }
/*    */   
/*    */   public static void setSecurityManager(SecurityManager securityManager) {
/* 88 */     helper.setSecurityManager(securityManager);
/*    */   }
/*    */   
/*    */   public static String getAccessibilityProviderName() {
/* 92 */     return helper.getAccessibilityProviderName();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\versionspecific\VersionSpecificHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */