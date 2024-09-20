/*     */ package com.exe4j.runtime;
/*     */ import com.exe4j.Controller;
/*     */ import com.exe4j.runtime.splash.SplashEngine;
/*     */ import com.exe4j.runtime.splash.SplashScreenConfig;
/*     */ import com.exe4j.runtime.splash.TextLineConfig;
/*     */ import com.exe4j.runtime.util.ArgumentStack;
/*     */ import com.exe4j.runtime.util.EmptyInputStream;
/*     */ import com.exe4j.runtime.util.WinDel;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class WinLauncher {
/*  18 */   public static final String LEGACY_PROCESS_COMM_FILE_NAME = System.getProperty("exe4j.processCommFile");
/*  19 */   static final boolean APP_MODE_INSTALL4J = Boolean.getBoolean("exe4j.isInstall4j");
/*  20 */   private static final boolean IS_SERVICE = Boolean.getBoolean("exe4j.isService");
/*     */   
/*     */   private static final String PROPNAME_LAUNCH_NAME = "exe4j.launchName";
/*     */   
/*     */   private static final String PROPNAME_TEMP_DIR = "exe4j.tempDir";
/*     */   
/*     */   public static final String PROPNAME_UNEXTRACTED_POSITION = "exe4j.unextractedPosition";
/*     */   
/*     */   private static String[] originalArgs;
/*     */   private static boolean used = false;
/*     */   
/*     */   public static boolean isService() {
/*  32 */     return IS_SERVICE;
/*     */   }
/*     */   
/*     */   public static void main(String[] args) {
/*  36 */     used = true;
/*  37 */     if (LEGACY_PROCESS_COMM_FILE_NAME != null) {
/*  38 */       (new File(LEGACY_PROCESS_COMM_FILE_NAME)).deleteOnExit();
/*  39 */       Controller.registerStartupListener(null);
/*     */     } 
/*     */     
/*  42 */     registerCleanup();
/*     */     
/*  44 */     ArgumentStack argStack = new ArgumentStack(args);
/*  45 */     final boolean guiApplication = argStack.popBoolean();
/*  46 */     final String className = argStack.popString();
/*     */     
/*  48 */     final String stdErrFile = argStack.popString();
/*  49 */     final String stdOutFile = argStack.popString();
/*  50 */     final boolean failOnMainMethodException = argStack.popBoolean();
/*     */     
/*     */     try {
/*  53 */       String launchName = argStack.popString();
/*  54 */       System.setProperty("exe4j.launchName", launchName);
/*  55 */     } catch (NoSuchElementException noSuchElementException) {}
/*     */ 
/*     */ 
/*     */     
/*  59 */     originalArgs = argStack.getStringArray();
/*  60 */     if (IS_SERVICE) {
/*  61 */       Thread thread = new Thread("_shutdown_waiter")
/*     */         {
/*     */           public void run() {
/*     */             try {
/*  65 */               InputStream systemIn = System.in;
/*  66 */               if (!Boolean.getBoolean("install4j.dontReplaceIn")) {
/*  67 */                 System.setIn((InputStream)new EmptyInputStream());
/*     */               }
/*  69 */               BufferedReader reader = new BufferedReader(new InputStreamReader(systemIn, "UTF-8"));
/*  70 */               while (systemIn.available() < 1) {
/*  71 */                 Thread.sleep(200L);
/*     */               }
/*  73 */               String str = reader.readLine();
/*  74 */               if (Integer.parseInt(str) == 1) {
/*  75 */                 WinLauncher.exitMessage();
/*     */               }
/*  77 */               System.exit(0);
/*  78 */             } catch (Exception e) {
/*  79 */               e.printStackTrace();
/*  80 */               System.exit(1);
/*     */             } 
/*     */           }
/*     */         };
/*  84 */       thread.setDaemon(true);
/*  85 */       thread.start();
/*     */       
/*  87 */       (new Thread("main")
/*     */         {
/*     */           public void run() {
/*  90 */             LauncherEngine.launch(className, WinLauncher.originalArgs, stdErrFile, stdOutFile, failOnMainMethodException, guiApplication, ClassLoader.getSystemClassLoader());
/*     */           }
/*  92 */         }).start();
/*     */     } else {
/*  94 */       LauncherEngine.launch(className, originalArgs, stdErrFile, stdOutFile, failOnMainMethodException, guiApplication, ClassLoader.getSystemClassLoader());
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void registerCleanup() {
/*  99 */     final String tempDir = System.getProperty("exe4j.tempDir");
/* 100 */     Integer unextractedPos = Integer.getInteger("exe4j.unextractedPosition");
/* 101 */     if (tempDir != null && tempDir.trim().length() > 0 && (unextractedPos == null || unextractedPos.intValue() != -1)) {
/* 102 */       WinDel.setUsed(true);
/* 103 */       Runtime.getRuntime().addShutdownHook(new Thread("temp_deletion_starter")
/*     */           {
/*     */             public void run() {
/*     */               try {
/* 107 */                 List<File> dirs = new ArrayList<File>();
/* 108 */                 List<File> files = new ArrayList<File>();
/* 109 */                 File tempDirFile = new File(tempDir);
/* 110 */                 WinLauncher.fill(dirs, files, tempDirFile);
/* 111 */                 WinDel.prepareDeletion(new File(tempDir, "i4jdel.exe"));
/* 112 */                 String tempFileName = tempDirFile.getName();
/* 113 */                 int dirMarkerPos = tempFileName.lastIndexOf("_dir");
/* 114 */                 if (dirMarkerPos > 0) {
/* 115 */                   tempFileName = tempFileName.substring(0, dirMarkerPos);
/*     */                 }
/* 117 */                 files.add(new File(tempDirFile.getParent(), tempFileName));
/* 118 */                 WinDel.scheduleDeletion(files, dirs, false);
/* 119 */               } catch (IOException iOException) {}
/*     */             }
/*     */           });
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String[] appendOriginalArgs(String[] params) {
/* 128 */     String[] ret = new String[params.length + originalArgs.length];
/* 129 */     System.arraycopy(params, 0, ret, 0, params.length);
/* 130 */     System.arraycopy(originalArgs, 0, ret, params.length, originalArgs.length);
/* 131 */     return ret;
/*     */   }
/*     */   
/*     */   static boolean isUsed() {
/* 135 */     return used;
/*     */   }
/*     */   
/*     */   private static void fill(List<File> dirs, List<File> files, File dir) {
/* 139 */     File[] newFiles = dir.listFiles();
/* 140 */     if (newFiles != null) {
/* 141 */       for (File newFile : newFiles) {
/* 142 */         if (newFile.isDirectory()) {
/* 143 */           fill(dirs, files, newFile);
/*     */         } else {
/* 145 */           files.add(newFile);
/*     */         } 
/*     */       } 
/*     */       
/* 149 */       dirs.add(dir);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void exitMessage() {
/* 154 */     System.err.println("*******************************************************************");
/* 155 */     System.err.println("This is an evaluation version of exe4j. The service is terminated");
/* 156 */     System.err.println("after 120 minutes. A licensed version of exe4j will create services");
/* 157 */     System.err.println("without this restriction.");
/* 158 */     System.err.println("*******************************************************************");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static void initAwtSplashConfig(boolean eval, boolean textOverlay, String status, int statusX, int statusY, String statusColor, int statusSize, int statusWeight, String version, int versionX, int versionY, String versionColor, int versionSize, int versionWeight) {
/*     */     try {
/* 165 */       SplashScreenConfig splashScreenConfig = new SplashScreenConfig();
/* 166 */       splashScreenConfig.init(textOverlay, new TextLineConfig(status, statusX, statusY, statusColor, statusSize, statusWeight), new TextLineConfig(version, versionX, versionY, versionColor, versionSize, versionWeight));
/* 167 */       SplashEngine.setJavaSplashScreenConfig(true, splashScreenConfig);
/* 168 */     } catch (Throwable throwable) {}
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtime\WinLauncher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */