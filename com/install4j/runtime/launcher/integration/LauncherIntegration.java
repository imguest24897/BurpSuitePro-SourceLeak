/*     */ package com.install4j.runtime.launcher.integration;
/*     */ 
/*     */ import com.exe4j.runtime.LauncherEngine;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.launcher.ApplicationLauncher;
/*     */ import com.install4j.api.update.UpdateScheduleRegistry;
/*     */ import com.install4j.runtime.beans.applications.ExecutionMode;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import com.install4j.runtime.launcher.Launcher;
/*     */ import com.install4j.runtime.launcher.integration.gui.WindowChecker;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.concurrent.CountDownLatch;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ 
/*     */ public class LauncherIntegration
/*     */ {
/*  23 */   private static final boolean DEBUG = Boolean.getBoolean("install4j.debugLauncherIntegrations");
/*     */   
/*     */   public static final String PROPNAME_LAUNCHER_ID = "install4j.launcherId";
/*     */   
/*     */   public static final String FILE_NAME = "launchers.xml";
/*     */   
/*     */   public static final String ELEMENT_ROOT = "launcherIntegrations";
/*     */   
/*     */   public static final String ELEMENT_LAUNCHER = "launcher";
/*     */   
/*     */   public static final String ATTRIBUTE_CHECK_UPDATER = "checkUpdater";
/*     */   public static final String ELEMENT_APPLICATION = "application";
/*     */   public static final String ATTRIBUTE_ID = "id";
/*     */   public static final String ATTRIBUTE_LAUNCH_MODE = "launchMode";
/*     */   public static final String ATTRIBUTE_LAUNCH_IN_NEW_PROCESS = "launchInNewProcess";
/*     */   public static final String ATTRIBUTE_LAUNCH_SCHEDULE = "launchSchedule";
/*     */   public static final String ATTRIBUTE_UPDATE_EXECUTION_MODE = "updateExecutionMode";
/*     */   public static final String ATTRIBUTE_UNATTENDED_UPDATE_TITLE = "unattendedUpdateTitle";
/*     */   
/*     */   private static void checkIntegrations(String[] launcherArguments) {
/*  43 */     debug("Checking launcher integrations");
/*  44 */     String launcherId = System.getProperty("install4j.launcherId");
/*  45 */     if (launcherId != null) {
/*  46 */       debug("For launcher ID " + launcherId);
/*  47 */       WindowChecker.initSplashAutoHide();
/*  48 */       File file = InstallerUtil.getInstallerFile("launchers.xml");
/*  49 */       if (file.exists()) {
/*     */         try {
/*  51 */           processLauncherIntegrations(file, launcherId, launcherArguments);
/*  52 */         } catch (Throwable e) {
/*  53 */           e.printStackTrace();
/*     */         } 
/*     */       } else {
/*  56 */         debug(file + " does not exist");
/*     */       } 
/*     */     } else {
/*  59 */       debug("Launcher ID is null");
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void processLauncherIntegrations(File file, String launcherId, String[] launcherArguments) throws IOException {
/*  64 */     debug("Processing " + file);
/*  65 */     Element root = XmlHelper.parseFile(file).getDocumentElement();
/*  66 */     for (Element launcherElement : XmlHelper.childElements(root)) {
/*  67 */       String id = XmlHelper.readAttribute(launcherElement, "id", "");
/*  68 */       if (Objects.equals(id, launcherId)) {
/*  69 */         if (XmlHelper.readAttribute(launcherElement, "checkUpdater", false)) {
/*  70 */           debug("Automatic update checker found");
/*  71 */           ExecutionMode executionMode = (ExecutionMode)XmlHelper.readAttribute(launcherElement, "updateExecutionMode", (Enum)ExecutionMode.UNATTENDED);
/*  72 */           String unattendedUpdateTitle = XmlHelper.readAttribute(launcherElement, "unattendedUpdateTitle", "");
/*  73 */           AutomaticUpdate.checkUpdates(launcherArguments, new UpdateExecutionConfig(executionMode, unattendedUpdateTitle), true, null);
/*     */         } 
/*  75 */         processLauncherIntegrations(launcherElement);
/*     */       } 
/*     */     } 
/*  78 */     debug("Processing completed");
/*     */   }
/*     */   
/*     */   private static void processLauncherIntegrations(Element launcherElement) throws IOException {
/*  82 */     final List<Runnable> nonBlockingRunnables = new ArrayList<>();
/*  83 */     List<Runnable> firstWindowInProcessRunnables = new ArrayList<>();
/*  84 */     List<Runnable> firstWindowNewProcessRunnables = new ArrayList<>();
/*     */     
/*  86 */     for (Element applicationElement : XmlHelper.childElements(launcherElement)) {
/*  87 */       if (Objects.equals(applicationElement.getTagName(), "application")) {
/*  88 */         processLauncherIntegration(applicationElement, nonBlockingRunnables, firstWindowInProcessRunnables, firstWindowNewProcessRunnables);
/*     */       }
/*     */     } 
/*     */     
/*  92 */     boolean hasNonBlockingRunnables = (nonBlockingRunnables.size() > 0);
/*  93 */     final CountDownLatch countDownLatch = new CountDownLatch(hasNonBlockingRunnables ? 1 : 0);
/*  94 */     if (hasNonBlockingRunnables) {
/*  95 */       (new Thread("install4j: non-blocking installer apps")
/*     */         {
/*     */           public void run() {
/*     */             try {
/*  99 */               for (Runnable runnable : nonBlockingRunnables) {
/* 100 */                 runnable.run();
/*     */               }
/*     */             } finally {
/* 103 */               countDownLatch.countDown();
/*     */             } 
/*     */           }
/* 106 */         }).start();
/*     */     }
/* 108 */     boolean hasFirstWindowInProcessRunnables = (firstWindowInProcessRunnables.size() > 0);
/* 109 */     if (hasFirstWindowInProcessRunnables || firstWindowNewProcessRunnables.size() > 0) {
/* 110 */       WindowChecker.onFirstWindowShown(() -> {
/*     */             for (Runnable runnable : firstWindowNewProcessRunnables) {
/*     */               runnable.run();
/*     */             }
/*     */             if (hasFirstWindowInProcessRunnables) {
/*     */               try {
/*     */                 countDownLatch.await();
/* 117 */               } catch (InterruptedException e) {
/*     */                 e.printStackTrace();
/*     */               } 
/*     */               for (Runnable runnable : firstWindowInProcessRunnables) {
/*     */                 runnable.run();
/*     */               }
/*     */             } 
/*     */           }hasFirstWindowInProcessRunnables);
/*     */     }
/*     */   }
/*     */   
/*     */   private static String[] getArguments() {
/* 129 */     if (Launcher.isService())
/* 130 */       return new String[] { "-q" }; 
/* 131 */     if (Boolean.getBoolean("java.awt.headless")) {
/* 132 */       if (System.console() == null) {
/* 133 */         return new String[] { "-q" };
/*     */       }
/* 135 */       return new String[] { "-c" };
/*     */     } 
/*     */     
/* 138 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void processLauncherIntegration(Element applicationElement, List<Runnable> nonBlockingRunnables, List<Runnable> firstWindowInProcessRunnables, List<Runnable> firstWindowNewProcessRunnables) throws IOException {
/* 144 */     String id = XmlHelper.readAttribute(applicationElement, "id", "");
/* 145 */     debug("Installer application " + id);
/* 146 */     LaunchMode launchMode = (LaunchMode)XmlHelper.readAttribute(applicationElement, "launchMode", LaunchMode.STARTUP_ASNYC);
/* 147 */     debug("Launch mode " + launchMode);
/* 148 */     boolean launchInNewProcess = XmlHelper.readAttribute(applicationElement, "launchInNewProcess", false);
/* 149 */     debug("New process " + launchInNewProcess);
/* 150 */     LaunchSchedule launchSchedule = (LaunchSchedule)XmlHelper.readAttribute(applicationElement, "launchSchedule", LaunchSchedule.ALWAYS);
/* 151 */     debug("Launch schedule " + launchSchedule);
/*     */     
/* 153 */     if (!launchInNewProcess && Util.isMacOS()) {
/* 154 */       System.setProperty("javafx.embed.singleThread", "true");
/*     */     }
/*     */     
/* 157 */     if (launchSchedule == LaunchSchedule.FIRST_RUN) {
/* 158 */       if (!FirstRun.isFirstRun(true)) {
/* 159 */         debug("Not first run");
/*     */         return;
/*     */       } 
/* 162 */     } else if (launchSchedule == LaunchSchedule.UPDATE_SCHEDULE && 
/* 163 */       !UpdateScheduleRegistry.checkAndReset()) {
/* 164 */       debug("Not scheduled");
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 169 */     String[] arguments = getArguments();
/*     */     
/* 171 */     if (launchMode == LaunchMode.FIRST_WINDOW) {
/* 172 */       Runnable runnable = () -> {
/*     */           try {
/*     */             debug("Launching installer application " + id + " from first window check");
/*     */             if (launchInNewProcess) {
/*     */               ApplicationLauncher.launchApplication(id, arguments, false, null);
/*     */             } else {
/*     */               ApplicationLauncher.launchApplicationInProcess(id, arguments, null, ApplicationLauncher.WindowMode.FRAME, null);
/*     */             } 
/* 180 */           } catch (IOException e) {
/*     */             e.printStackTrace();
/*     */           } 
/*     */         };
/* 184 */       if (launchInNewProcess) {
/* 185 */         firstWindowNewProcessRunnables.add(runnable);
/*     */       } else {
/* 187 */         firstWindowInProcessRunnables.add(runnable);
/*     */       } 
/*     */     } else {
/* 190 */       boolean blocking = (launchMode == LaunchMode.STARTUP_SYNC);
/* 191 */       debug("Launching installer application " + id + " from startup check");
/* 192 */       if (launchInNewProcess) {
/* 193 */         ApplicationLauncher.launchApplication(id, arguments, blocking, null);
/*     */       } else {
/* 195 */         Runnable runnable = () -> ApplicationLauncher.launchApplicationInProcess(id, arguments, null, ApplicationLauncher.WindowMode.FRAME, null);
/* 196 */         if (blocking) {
/* 197 */           InstallerUtil.setBlockingLauncherIntegration(true);
/* 198 */           runnable.run();
/*     */         } else {
/* 200 */           nonBlockingRunnables.add(runnable);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void init() {
/* 207 */     LauncherEngine.setIntegrationChecker(LauncherIntegration::checkIntegrations);
/*     */   }
/*     */   
/*     */   private static void debug(String message) {
/* 211 */     if (DEBUG)
/* 212 */       System.err.println(message); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\integration\LauncherIntegration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */