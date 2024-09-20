/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ 
/*     */ import com.install4j.runtime.launcher.util.LauncherUtil;
/*     */ import com.install4j.runtime.util.LauncherLogger;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ public class Win32Handle
/*     */ {
/*     */   private static final String LIB_MODULES = "lib\\modules";
/*     */   private static final String LANMAN_REDIRECTOR_PREFIX = "\\Device\\LanmanRedirector\\;";
/*     */   private static final String MUP_DEVICE_PATH = "\\Device\\Mup";
/*     */   
/*     */   static {
/*  18 */     Common.init();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean close(FileHandle fileHandle) {
/*  26 */     return close0(fileHandle.handle);
/*     */   }
/*     */   
/*     */   public static List<FileHandle> list() {
/*  30 */     Object[] list = list0();
/*  31 */     if (list == null) {
/*  32 */       return null;
/*     */     }
/*  34 */     int[] handles = (int[])list[0];
/*  35 */     String[] names = (String[])list[1];
/*     */     
/*  37 */     List<FileHandle> ret = new ArrayList<FileHandle>();
/*  38 */     for (int i = 0; i < names.length; i++) {
/*  39 */       ret.add(new FileHandle(handles[i], names[i]));
/*     */     }
/*     */     
/*  42 */     return ret;
/*     */   }
/*     */   
/*     */   public static String getDevicePath(File file) {
/*  46 */     if (file != null) {
/*  47 */       return getDevicePath(file.getAbsolutePath());
/*     */     }
/*  49 */     return null;
/*     */   }
/*     */   
/*     */   public static String getDevicePath(String fileName) {
/*  53 */     if (fileName != null && fileName.length() > 2) {
/*  54 */       if (fileName.charAt(1) == ':') {
/*  55 */         String deviceName = getDeviceName0("\\??\\" + fileName.substring(0, 2));
/*  56 */         if (deviceName != null) {
/*  57 */           if (deviceName.startsWith("\\Device\\LanmanRedirector\\;")) {
/*  58 */             int slashIndex = deviceName.indexOf('\\', "\\Device\\LanmanRedirector\\;".length());
/*  59 */             if (slashIndex != -1) {
/*  60 */               return "\\Device\\Mup" + deviceName.substring(slashIndex) + fileName.substring(2);
/*     */             }
/*     */           } else {
/*  63 */             return deviceName + fileName.substring(2);
/*     */           } 
/*     */         }
/*  66 */       } else if (fileName.startsWith("\\\\")) {
/*  67 */         return "\\Device\\Mup" + fileName.substring(1);
/*     */       } 
/*     */     }
/*  70 */     return null;
/*     */   }
/*     */   
/*     */   public static void closeInheritedModulesHandle(LauncherLogger launcherLogger) {
/*  74 */     if (launcherLogger == null) {
/*  75 */       launcherLogger = LauncherLogger.STDERR_LOGGER;
/*     */     }
/*     */     try {
/*  78 */       List<FileHandle> handles = list();
/*  79 */       if (handles != null) {
/*  80 */         File myModulesFile = LauncherUtil.isJava9Plus() ? (new File(System.getProperty("java.home"), "lib\\modules")).getCanonicalFile() : null;
/*     */         
/*  82 */         String myModulesDeviceName = getDevicePath(myModulesFile);
/*  83 */         if (myModulesFile != null && myModulesDeviceName == null) {
/*  84 */           launcherLogger.error("could not get device name for module file " + myModulesFile);
/*     */           return;
/*     */         } 
/*  87 */         if (myModulesDeviceName != null) {
/*  88 */           boolean myModuleFound = false;
/*  89 */           for (FileHandle handle : handles) {
/*  90 */             myModuleFound = myModulesDeviceName.equals(handle.getDevicePath());
/*  91 */             if (myModuleFound) {
/*     */               break;
/*     */             }
/*     */           } 
/*  95 */           if (!myModuleFound) {
/*  96 */             launcherLogger.info("could not find own module file " + myModulesFile + ", " + myModulesDeviceName);
/*  97 */             for (FileHandle handle : handles) {
/*  98 */               launcherLogger.info(handle.name + ", " + handle.getDevicePath());
/*     */             }
/*     */             
/*     */             return;
/*     */           } 
/*     */         } 
/* 104 */         launcherLogger.info("my modules file " + myModulesFile + ", " + myModulesDeviceName);
/*     */         
/* 106 */         for (FileHandle handle : handles) {
/* 107 */           if (handle.name.endsWith("lib\\modules") && (myModulesDeviceName == null || !myModulesDeviceName.equals(handle.getDevicePath()))) {
/* 108 */             if (!close(handle)) {
/* 109 */               launcherLogger.error("could not close module handle " + handle.name); continue;
/*     */             } 
/* 111 */             launcherLogger.info("closed inherited module handle " + handle.name);
/*     */           }
/*     */         
/*     */         }
/*     */       
/*     */       } 
/* 117 */     } catch (Throwable e) {
/* 118 */       launcherLogger.error(e);
/*     */     } 
/*     */   }
/*     */   private static native Object[] list0();
/*     */   private static native boolean close0(int paramInt);
/*     */   private static native String getDeviceName0(String paramString);
/*     */   public static class FileHandle { public final int handle;
/*     */     
/*     */     private FileHandle(int handle, String name) {
/* 127 */       this.handle = handle;
/* 128 */       this.name = name;
/*     */     }
/*     */     public final String name;
/*     */     public String getDevicePath() {
/* 132 */       if (this.name != null && !this.name.startsWith("\\Device")) {
/* 133 */         String usedName = this.name;
/*     */         try {
/* 135 */           usedName = (new File(this.name)).getCanonicalPath();
/* 136 */         } catch (IOException iOException) {}
/*     */         
/* 138 */         String withDeviceName = Win32Handle.getDevicePath(usedName);
/* 139 */         return (withDeviceName != null) ? withDeviceName : this.name;
/*     */       } 
/* 141 */       return this.name;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 146 */       return "FileHandle{handle=" + 
/* 147 */         Integer.toHexString(this.handle) + ", name='" + this.name + '\'' + '}';
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\Win32Handle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */