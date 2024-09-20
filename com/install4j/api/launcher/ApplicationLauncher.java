/*     */ package com.install4j.api.launcher;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.applaunch.ApplicationLauncherImpl;
/*     */ import com.install4j.runtime.launcher.integration.FirstRun;
/*     */ import java.awt.Window;
/*     */ import java.io.IOException;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ApplicationLauncher
/*     */ {
/*     */   public static void launchApplication(String applicationId, String[] arguments, boolean blocking, Callback callback) throws IOException {
/*  38 */     ApplicationLauncherImpl.launchApplication(applicationId, arguments, blocking, callback);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void launchApplicationInProcess(String applicationId, String[] arguments, Callback callback, WindowMode windowMode, Window parentWindow) {
/*  68 */     ApplicationLauncherImpl.launchApplicationInProcess(applicationId, arguments, callback, windowMode, parentWindow);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean waitForInProcessApplication(long timeout, TimeUnit unit) throws InterruptedException {
/*  84 */     return ApplicationLauncherImpl.waitForInProcessApplication(timeout, unit);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isNewArchiveInstallation() {
/* 100 */     return FirstRun.isFirstRun(false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface Callback
/*     */   {
/*     */     void exited(int param1Int);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     void prepareShutdown();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     default ApplicationLauncher.ProgressListener createProgressListener() {
/* 129 */       return null;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface ProgressListener
/*     */   {
/*     */     void screenActivated(String param1String);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     void actionStarted(String param1String);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     void statusMessage(String param1String);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     void detailMessage(String param1String);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     void percentCompleted(int param1Int);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     void secondaryPercentCompleted(int param1Int);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     void indeterminateProgress(boolean param1Boolean);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class ProgressListenerAdapter
/*     */     implements ProgressListener
/*     */   {
/*     */     public void screenActivated(String id) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void actionStarted(String id) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void statusMessage(String message) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void detailMessage(String message) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void percentCompleted(int value) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void secondaryPercentCompleted(int value) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void indeterminateProgress(boolean indeterminateProgress) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum WindowMode
/*     */   {
/* 231 */     DIALOG,
/*     */ 
/*     */ 
/*     */     
/* 235 */     FRAME;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\launcher\ApplicationLauncher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */