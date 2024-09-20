/*     */ package com.install4j.runtime.launcher.integration;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchDescriptor;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchHelper;
/*     */ import com.install4j.runtime.installer.platform.macos.MacFileSystem;
/*     */ import com.install4j.runtime.installer.platform.macos.MacLog;
/*     */ import com.install4j.runtime.installer.platform.win32.Common;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.AtomicMoveNotSupportedException;
/*     */ import java.nio.file.CopyOption;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.StandardCopyOption;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ 
/*     */ public class SingleBundleUpdater
/*     */ {
/*     */   private static final String LOG_PREFIX = "install4j bundle updater: ";
/*     */   
/*     */   public static void main(String[] args) {
/*  23 */     UpdateLog.setApplicationName("Single Bundle Updater");
/*  24 */     log("starting");
/*  25 */     Common.init();
/*  26 */     File sourceBundle = new File(args[0]);
/*  27 */     File destinationBundle = new File(new File(args[1]), sourceBundle.getName());
/*  28 */     File currentSingleBundle = new File(args[2]);
/*  29 */     File backupDir = "null".equals(args[3]) ? null : new File(args[3]);
/*  30 */     boolean phase1 = Boolean.parseBoolean(args[4]);
/*  31 */     boolean restartLauncher = Boolean.parseBoolean(args[5]);
/*  32 */     List<String> launcherArguments = Arrays.<String>asList(args).subList(6, args.length);
/*     */     try {
/*  34 */       if (phase1) {
/*  35 */         phase1(sourceBundle, destinationBundle, backupDir, currentSingleBundle, restartLauncher, launcherArguments);
/*     */       } else {
/*  37 */         phase2(destinationBundle, backupDir, currentSingleBundle, restartLauncher, launcherArguments);
/*     */       } 
/*  39 */     } catch (Throwable t) {
/*  40 */       log(t);
/*  41 */       System.out.println(System.getProperty("java.home"));
/*  42 */       System.exit(1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void phase1(File sourceBundle, File destinationBundle, File backupDir, File currentSingleBundle, boolean restartLauncher, List<String> launcherArguments) {
/*  47 */     log("phase 1");
/*  48 */     if (!sourceBundle.getPath().endsWith(".app") || !destinationBundle.getPath().endsWith(".app")) {
/*  49 */       log("wrong parameters " + sourceBundle.getPath() + ", " + destinationBundle.getPath());
/*  50 */       System.exit(1);
/*     */     } 
/*     */     
/*  53 */     LockFile.waitForShutdownLockFile();
/*     */     try {
/*  55 */       Thread.sleep(200L);
/*  56 */     } catch (InterruptedException e) {
/*  57 */       log(e);
/*     */     } 
/*     */     
/*  60 */     boolean success = false;
/*     */     try {
/*  62 */       moveBundle(sourceBundle, destinationBundle, backupDir);
/*  63 */       success = true;
/*  64 */       MacFileSystem.notifyBundleChange(destinationBundle);
/*  65 */     } catch (Throwable e) {
/*  66 */       log(e);
/*     */     } 
/*     */     
/*  69 */     log("result phase 1: " + success + ", " + backupDir);
/*  70 */     if (success) {
/*  71 */       System.exit(0);
/*     */     } else {
/*  73 */       AutomaticUpdate.checkRegularExit(false, false);
/*  74 */       if (restartLauncher) {
/*  75 */         restartLauncher(currentSingleBundle, launcherArguments);
/*     */       }
/*  77 */       log("exiting");
/*  78 */       System.exit(1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void phase2(File destinationBundle, File backupDir, File currentSingleBundle, boolean restartLauncher, List<String> launcherArguments) {
/*  83 */     log("phase 2");
/*     */     
/*  85 */     LockFile.deleteShutdownLockFile();
/*  86 */     log("restart: " + restartLauncher);
/*     */     
/*     */     try {
/*  89 */       AutomaticUpdate.checkRegularExit(true, false);
/*     */       
/*  91 */       if (restartLauncher) {
/*  92 */         restartLauncher(destinationBundle, launcherArguments);
/*     */       }
/*     */     } finally {
/*     */       try {
/*  96 */         if (destinationBundle.getAbsolutePath().startsWith("/Applications/")) {
/*  97 */           log("changing group of " + destinationBundle.getAbsolutePath() + " to admin");
/*  98 */           LaunchHelper.launchApplication((new LaunchDescriptor(new File("/usr/sbin/chown"))).arguments(new String[] { "-R", ":admin", destinationBundle.getAbsolutePath() }).wait(false));
/*     */         } 
/* 100 */       } catch (Throwable t) {
/* 101 */         log(t);
/*     */       } 
/* 103 */       boolean newBundleLocation = false;
/*     */       try {
/* 105 */         newBundleLocation = (currentSingleBundle != null && !destinationBundle.getCanonicalFile().equals(currentSingleBundle.getCanonicalFile()));
/* 106 */         if (newBundleLocation) {
/* 107 */           log("removing previous bundle at " + currentSingleBundle);
/* 108 */           deleteRecursive(currentSingleBundle);
/*     */         } 
/* 110 */       } catch (IOException e) {
/* 111 */         log(e);
/*     */       } 
/* 113 */       if (backupDir != null) {
/* 114 */         if (newBundleLocation) {
/* 115 */           log("keeping backup at " + backupDir + " because a different app was replaced");
/*     */         } else {
/* 117 */           log("removing backup at " + backupDir);
/* 118 */           deleteRecursive(backupDir);
/* 119 */           if (backupDir.exists()) {
/* 120 */             log("could not fully remove backup at " + backupDir);
/*     */           }
/*     */         } 
/*     */       }
/* 124 */       log("exiting");
/* 125 */       System.exit(0);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void restartLauncher(File launchBundle, List<String> launcherArguments) {
/* 130 */     log("launch bundle " + launchBundle);
/* 131 */     if (launchBundle != null) {
/* 132 */       List<String> command = new ArrayList<>();
/* 133 */       command.add("/usr/bin/open");
/* 134 */       command.add(launchBundle.getAbsolutePath());
/* 135 */       if (!launcherArguments.isEmpty()) {
/* 136 */         command.add("--args");
/* 137 */         command.addAll(launcherArguments);
/*     */       } 
/*     */       try {
/* 140 */         (new ProcessBuilder(command)).start();
/* 141 */       } catch (IOException e) {
/* 142 */         log(e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void moveBundle(File sourceBundle, File destinationBundle, File backupDir) throws IOException, InterruptedException {
/* 148 */     doBackup(destinationBundle, backupDir);
/* 149 */     log("moving bundle from " + sourceBundle + " to " + destinationBundle);
/*     */     try {
/*     */       try {
/* 152 */         executeMove(false, sourceBundle, destinationBundle, new StandardCopyOption[] { StandardCopyOption.ATOMIC_MOVE });
/* 153 */       } catch (AtomicMoveNotSupportedException e) {
/* 154 */         executeMove(true, sourceBundle, destinationBundle, new StandardCopyOption[0]);
/*     */       } 
/* 156 */     } catch (Throwable t) {
/* 157 */       restoreBackup(backupDir, destinationBundle);
/* 158 */       throw t;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void restoreBackup(File backupDir, File destinationBundle) {
/* 163 */     if (backupDir != null) {
/* 164 */       log("restoring backup from " + backupDir + " to " + destinationBundle);
/* 165 */       deleteRecursive(destinationBundle);
/*     */       try {
/*     */         try {
/* 168 */           executeMove(false, backupDir, destinationBundle, new StandardCopyOption[] { StandardCopyOption.ATOMIC_MOVE });
/* 169 */         } catch (AtomicMoveNotSupportedException e) {
/* 170 */           executeMove(false, backupDir, destinationBundle, new StandardCopyOption[0]);
/*     */         } 
/* 172 */       } catch (Throwable t2) {
/* 173 */         log(t2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void executeMove(boolean fallbackToCopy, File sourceBundle, File destinationBundle, StandardCopyOption... copyOptions) throws IOException {
/*     */     try {
/* 180 */       Files.move(sourceBundle.toPath(), destinationBundle.toPath(), (CopyOption[])copyOptions);
/* 181 */     } catch (IOException e) {
/* 182 */       if (fallbackToCopy) {
/* 183 */         log("fallback to copy for move from " + sourceBundle + " to " + destinationBundle);
/* 184 */         destinationBundle.mkdirs();
/* 185 */         copyDirectory(sourceBundle, destinationBundle);
/*     */       } else {
/* 187 */         throw e;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void copyDirectory(File sourceDir, File targetDir) throws IOException {
/* 193 */     File[] files = sourceDir.listFiles();
/* 194 */     if (files == null) {
/*     */       return;
/*     */     }
/*     */     
/* 198 */     for (File file : files) {
/* 199 */       File sourceFile = (new File(sourceDir, file.getName())).getCanonicalFile();
/*     */       
/* 201 */       File targetFile = new File(targetDir, sourceFile.getName());
/* 202 */       if (sourceFile.isDirectory()) {
/* 203 */         if (!targetFile.exists() && !targetFile.mkdirs()) {
/* 204 */           throw new IOException("Cannot create " + targetDir.getPath());
/*     */         }
/* 206 */         copyDirectory(sourceFile, targetFile);
/*     */       } else {
/* 208 */         Files.copy(sourceFile.toPath(), targetFile.toPath(), new CopyOption[0]);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static void doBackup(File destinationBundle, File backupDir) throws IOException {
/* 215 */     if (backupDir != null && destinationBundle.exists()) {
/* 216 */       log("backing up " + destinationBundle + " to " + backupDir);
/*     */       try {
/* 218 */         executeMove(false, destinationBundle, backupDir, new StandardCopyOption[] { StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING });
/* 219 */       } catch (AtomicMoveNotSupportedException e) {
/* 220 */         executeMove(false, destinationBundle, backupDir, new StandardCopyOption[] { StandardCopyOption.REPLACE_EXISTING });
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void deleteRecursive(File file) {
/* 226 */     if (!file.getPath().endsWith(".app")) {
/* 227 */       log("did not execute delete for " + file.getPath());
/*     */     } else {
/* 229 */       deleteRecursiveInt(file);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void deleteRecursiveInt(File file) {
/* 234 */     if (file.isDirectory()) {
/* 235 */       File[] children = file.listFiles();
/* 236 */       if (children != null) {
/* 237 */         for (File child : children) {
/* 238 */           deleteRecursiveInt(child);
/*     */         }
/*     */       }
/*     */     } 
/* 242 */     file.delete();
/*     */   }
/*     */   
/*     */   private static void log(String message) {
/* 246 */     UpdateLog.log(5, message);
/* 247 */     MacLog.log("install4j bundle updater: " + message);
/*     */   }
/*     */   
/*     */   private static void log(Throwable e) {
/* 251 */     UpdateLog.log(e);
/* 252 */     MacLog.log("install4j bundle updater: ", e);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\integration\SingleBundleUpdater.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */