/*     */ package com.install4j.runtime.installer.helper.versionspecific;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.launcher.StartupNotification;
/*     */ import com.install4j.runtime.installer.helper.content.JavaHttpConnection;
/*     */ import com.install4j.runtime.installer.helper.content.UrlConnectionWrapper;
/*     */ import com.install4j.runtime.launcher.util.LauncherUtil;
/*     */ import java.io.IOException;
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Method;
/*     */ import java.net.Proxy;
/*     */ import java.net.URL;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import javafx.collections.ObservableList;
/*     */ import javafx.stage.Stage;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class NoHelper
/*     */   implements VersionSpecificHelperInterface
/*     */ {
/*     */   public boolean isJavaFxWindowShown() {
/*     */     try {
/*  25 */       Class<?> stageHelperClass = Class.forName("com.sun.javafx.stage.StageHelper");
/*     */       try {
/*  27 */         Field field = stageHelperClass.getDeclaredField("stageAccessor");
/*  28 */         field.setAccessible(true);
/*  29 */         if (field.get(null) == null) {
/*  30 */           return false;
/*     */         }
/*  32 */       } catch (NoSuchFieldException|IllegalAccessException e) {
/*  33 */         e.printStackTrace();
/*     */       } 
/*     */       
/*  36 */       Method getStagesMethod = stageHelperClass.getDeclaredMethod("getStages", new Class[0]);
/*  37 */       getStagesMethod.setAccessible(true);
/*  38 */       ObservableList<Stage> stages = (ObservableList<Stage>)getStagesMethod.invoke(null, new Object[0]);
/*  39 */       for (Stage stage : stages) {
/*  40 */         if (stage.isShowing()) {
/*  41 */           return true;
/*     */         }
/*     */       } 
/*  44 */     } catch (Throwable throwable) {}
/*     */     
/*  46 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void requestForeground() {
/*  51 */     if (Util.isMacOS()) {
/*  52 */       MacApiHelper.requestForeground();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMacStartupListener(StartupNotification.Listener startupListener) {
/*  58 */     if (Util.isMacOS()) {
/*  59 */       MacApiHelper.setMacStartupListener(startupListener);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMacHandleQuit(boolean handleQuit) {
/*  65 */     if (Util.isMacOS()) {
/*  66 */       MacApiHelper.setMacHandleQuit(handleQuit);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMacQuitHandler(Runnable runnable) {
/*  72 */     if (Util.isMacOS()) {
/*  73 */       MacApiHelper.setMacQuitHandler(runnable);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMacAboutHandler(Runnable runnable) {
/*  79 */     if (Util.isMacOS()) {
/*  80 */       MacApiHelper.setMacAboutHandler(runnable);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMacPreferencesHandler(Runnable runnable) {
/*  86 */     if (Util.isMacOS()) {
/*  87 */       MacApiHelper.setMacPreferencesHandler(runnable);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void addReads(String moduleName) {}
/*     */ 
/*     */   
/*     */   public long getPid() {
/*  97 */     return LauncherUtil.getPidFromMBean();
/*     */   }
/*     */ 
/*     */   
/*     */   public int waitFor(Process process, int timeoutSeconds, boolean terminate) throws InterruptedException {
/* 102 */     if (timeoutSeconds > 0) {
/* 103 */       if (process.waitFor(timeoutSeconds, TimeUnit.SECONDS)) {
/* 104 */         return process.exitValue();
/*     */       }
/* 106 */       if (terminate) {
/* 107 */         process.destroyForcibly();
/*     */       }
/* 109 */       return -10000;
/*     */     } 
/*     */     
/* 112 */     return process.waitFor();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaHttpConnection createHttpConnection(URL url, Proxy proxy, boolean acceptAllCertificates) throws IOException {
/* 118 */     return (JavaHttpConnection)new UrlConnectionWrapper(url, proxy, acceptAllCertificates);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSecurityManager(SecurityManager securityManager) {
/* 123 */     System.setSecurityManager(securityManager);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAccessibilityProviderName() {
/* 128 */     return EmptyAccessibility.class.getName();
/*     */   }
/*     */   
/*     */   public static class EmptyAccessibility {}
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\versionspecific\NoHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */