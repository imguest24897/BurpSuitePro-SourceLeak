/*     */ package com.install4j.runtime.launcher;
/*     */ 
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.runtime.installer.helper.FileAttributesHelper;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.versionspecific.VersionSpecificHelper;
/*     */ import com.install4j.runtime.launcher.integration.LauncherIntegration;
/*     */ import com.install4j.runtime.launcher.util.LauncherUtil;
/*     */ import com.install4j.runtime.util.StringUtil;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.FileSystems;
/*     */ import java.nio.file.StandardWatchEventKinds;
/*     */ import java.nio.file.WatchEvent;
/*     */ import java.nio.file.WatchKey;
/*     */ import java.nio.file.WatchService;
/*     */ import java.nio.file.attribute.PosixFileAttributes;
/*     */ 
/*     */ 
/*     */ public class FullLauncherHelper
/*     */   implements LauncherHelper
/*     */ {
/*     */   public void initIntegration() {
/*  24 */     LauncherIntegration.init();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUnattended(boolean value) {
/*  29 */     InstallerUtil.setUnattended(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public String[] initVariables(Class<?> mainClass, String[] args) {
/*  34 */     return LauncherVariables.init(mainClass, args);
/*     */   }
/*     */ 
/*     */   
/*     */   public String replaceVariables(String value) {
/*  39 */     return LauncherVariables.replaceVariables(value);
/*     */   }
/*     */ 
/*     */   
/*     */   public String replaceVariables(String value, StringUtil.ReplacementCallback replacementCallback) {
/*  44 */     return LauncherVariables.replaceVariables(value, replacementCallback);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPosixFilePermissions(File file, String permissions) {
/*  49 */     if (!LauncherUtil.isWindows()) {
/*  50 */       UnixFileSystem.setMode(permissions, file);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUnixOwner(File file) {
/*  56 */     if (!LauncherUtil.isWindows()) {
/*     */       try {
/*  58 */         PosixFileAttributes attributes = FileAttributesHelper.getFileAttributes(file);
/*  59 */         return attributes.owner().getName();
/*  60 */       } catch (Exception exception) {}
/*     */     }
/*     */     
/*  63 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void watchDirectory(File directory, String dirMode, String threadName, final Runnable runnable) {
/*     */     try {
/*  69 */       final WatchService watcher = FileSystems.getDefault().newWatchService();
/*  70 */       directory.mkdirs();
/*  71 */       UnixFileSystem.setMode(dirMode, directory);
/*  72 */       directory.toPath().register(watcher, (WatchEvent.Kind<?>[])new WatchEvent.Kind[] { StandardWatchEventKinds.ENTRY_CREATE });
/*     */       
/*  74 */       (new Thread(threadName)
/*     */         {
/*     */ 
/*     */ 
/*     */           
/*     */           public void run()
/*     */           {
/*     */             while (true) {
/*     */               try {
/*  83 */                 WatchKey watchKey = watcher.take();
/*  84 */                 runnable.run();
/*  85 */                 watchKey.pollEvents();
/*  86 */                 boolean valid = watchKey.reset();
/*  87 */                 if (!valid) {
/*     */                   break;
/*     */                 }
/*  90 */               } catch (InterruptedException e) {
/*  91 */                 e.printStackTrace();
/*     */               } 
/*     */             } 
/*     */           }
/*  95 */         }).start();
/*  96 */     } catch (IOException e) {
/*  97 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public File getInstallerFile(String fileName) {
/* 103 */     return InstallerUtil.getInstallerFile(fileName);
/*     */   }
/*     */ 
/*     */   
/*     */   public void exit(int exitCode) {
/* 108 */     InstallerUtil.exit(exitCode);
/*     */   }
/*     */ 
/*     */   
/*     */   public long getPid() {
/* 113 */     return VersionSpecificHelper.getPid();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\FullLauncherHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */