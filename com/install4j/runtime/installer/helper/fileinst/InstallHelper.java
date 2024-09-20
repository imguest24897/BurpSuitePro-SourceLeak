/*     */ package com.install4j.runtime.installer.helper.fileinst;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.context.FileOptions;
/*     */ import com.install4j.api.context.UninstallMode;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.api.windows.RegistryRoot;
/*     */ import com.install4j.api.windows.WinRegistry;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.platform.macos.MacFileSystem;
/*     */ import com.install4j.runtime.installer.platform.win32.FileVersion;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ class InstallHelper
/*     */ {
/*     */   private static final String KEY_SHARED_DLLS = "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\SharedDLLs";
/*  23 */   private static final boolean DISABLE_WINDOWS_VERSION_COMPARISON = Boolean.getBoolean("install4j.disableWinVersionComparison");
/*     */   
/*     */   private static Object addSharedCount(Object sharedCount, int delta) {
/*  26 */     int value = 1;
/*     */     try {
/*  28 */       if (sharedCount instanceof Integer) {
/*  29 */         value = ((Integer)sharedCount).intValue() + delta;
/*  30 */         sharedCount = Integer.valueOf(value);
/*  31 */       } else if (sharedCount instanceof String) {
/*  32 */         value = Integer.parseInt((String)sharedCount) + delta;
/*  33 */         sharedCount = String.valueOf(value);
/*  34 */       } else if (sharedCount instanceof byte[]) {
/*  35 */         byte[] byteArray = (byte[])sharedCount;
/*  36 */         if (byteArray.length < 1 || byteArray.length > 4) {
/*  37 */           throw new NumberFormatException();
/*     */         }
/*  39 */         int[] intArray = new int[4];
/*  40 */         for (int i = 0; i < byteArray.length; i++) {
/*  41 */           intArray[i] = byteArray[i];
/*     */         }
/*  43 */         value = (intArray[3] << 24) + (intArray[2] << 16) + (intArray[1] << 8) + (intArray[0] << 0);
/*  44 */         value += delta;
/*     */         
/*  46 */         byteArray[0] = (byte)(value >>> 0 & 0xFF);
/*  47 */         byteArray[1] = (byte)(value >>> 8 & 0xFF);
/*  48 */         byteArray[2] = (byte)(value >>> 16 & 0xFF);
/*  49 */         byteArray[3] = (byte)(value >>> 24 & 0xFF);
/*     */       } 
/*  51 */     } catch (NumberFormatException e) {
/*  52 */       sharedCount = Integer.valueOf(value);
/*     */     } 
/*     */     
/*  55 */     if (value <= 0) {
/*  56 */       return null;
/*     */     }
/*  58 */     return sharedCount;
/*     */   }
/*     */ 
/*     */   
/*     */   static void registerShared(File file) {
/*  63 */     if (!InstallerUtil.isWindows()) {
/*     */       return;
/*     */     }
/*     */     
/*  67 */     Object sharedCount = WinRegistry.getValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\SharedDLLs", file.getAbsolutePath());
/*  68 */     if (sharedCount == null) {
/*  69 */       sharedCount = Integer.valueOf(0);
/*     */     }
/*     */     
/*  72 */     sharedCount = addSharedCount(sharedCount, 1);
/*     */     
/*  74 */     WinRegistry.setValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\SharedDLLs", file.getAbsolutePath(), sharedCount);
/*     */   }
/*     */   
/*     */   static boolean unregisterShared(File file) {
/*  78 */     if (!InstallerUtil.isWindows()) {
/*  79 */       return true;
/*     */     }
/*     */     
/*  82 */     Object sharedCount = WinRegistry.getValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\SharedDLLs", file.getAbsolutePath());
/*  83 */     if (sharedCount == null) {
/*  84 */       return true;
/*     */     }
/*     */     
/*  87 */     sharedCount = addSharedCount(sharedCount, -1);
/*  88 */     if (sharedCount == null) {
/*  89 */       WinRegistry.deleteValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\SharedDLLs", file.getAbsolutePath());
/*  90 */       return true;
/*     */     } 
/*  92 */     WinRegistry.setValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\SharedDLLs", file.getAbsolutePath(), sharedCount);
/*  93 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   static UninstallMode getParentUninstallMode(UninstallMode uninstallMode) {
/*  98 */     if (uninstallMode == UninstallMode.ALWAYS)
/*  99 */       return UninstallMode.IF_CREATED; 
/* 100 */     if (uninstallMode == UninstallMode.ALWAYS_BUT_NOT_FOR_UPDATE) {
/* 101 */       return UninstallMode.IF_CREATED_BUT_NOT_FOR_UPDATE;
/*     */     }
/* 103 */     return uninstallMode;
/*     */   }
/*     */ 
/*     */   
/*     */   static void addDirs(File dir, Set<File> parentDirs) {
/* 108 */     if (dir != null) {
/*     */       try {
/* 110 */         dir = dir.getCanonicalFile();
/* 111 */       } catch (IOException e) {
/* 112 */         Logger.getInstance().log(e);
/*     */       } 
/* 114 */       parentDirs.add(dir);
/* 115 */       addDirs(dir.getParentFile(), parentDirs);
/*     */     } 
/*     */   }
/*     */   
/*     */   static boolean isFirstFileNewer(@Nullable File firstFile, long firstTime, File secondFile) {
/* 120 */     if (firstFile != null && InstallerUtil.isWindows() && !DISABLE_WINDOWS_VERSION_COMPARISON) {
/* 121 */       int versionResult = FileVersion.compare(firstFile, secondFile);
/* 122 */       if (versionResult == 1) {
/* 123 */         Logger.getInstance().info(null, "Windows version info marks file as newer.");
/* 124 */         return true;
/* 125 */       }  if (versionResult == 3) {
/* 126 */         Logger.getInstance().info(null, "File times: " + getLastModified(firstFile) + ", " + getLastModified(secondFile));
/* 127 */         return (getLastModified(firstFile) > getLastModified(secondFile));
/*     */       } 
/* 129 */       Logger.getInstance().info(null, "Windows version info marks file as older.");
/* 130 */       return false;
/*     */     } 
/*     */     
/* 133 */     Logger.getInstance().info(null, "File times: " + firstTime + ", " + getLastModified(secondFile));
/* 134 */     if (Files.isSymbolicLink(secondFile.toPath())) {
/* 135 */       return true;
/*     */     }
/* 137 */     return (firstTime > getLastModified(secondFile));
/*     */   }
/*     */ 
/*     */   
/*     */   private static void deleteFile(File destFile) throws IOException {
/* 142 */     for (int i = 0; i < 20 && destFile.exists(); i++) {
/* 143 */       if (!destFile.delete()) {
/*     */         try {
/* 145 */           Thread.sleep(100L);
/* 146 */         } catch (InterruptedException e) {
/* 147 */           e.printStackTrace();
/*     */         } 
/*     */       }
/*     */     } 
/* 151 */     if (destFile.exists() && !destFile.delete()) {
/* 152 */       throw new IOException("could not delete " + destFile);
/*     */     }
/*     */   }
/*     */   
/*     */   static void copyTemp(File tempFile, File destFile, FileOptions options) throws IOException {
/* 157 */     deleteFile(destFile);
/*     */     
/* 159 */     FileUtil.rename(tempFile, destFile);
/*     */     
/* 161 */     destFile.setLastModified(options.getFileTime());
/* 162 */     if (!InstallerUtil.isWindows()) {
/* 163 */       UnixFileSystem.setMode(options.getMode(), destFile);
/*     */     }
/* 165 */     if (InstallerUtil.isMacOS() && options instanceof ExtendedFileOptions) {
/* 166 */       for (Map.Entry<String, String> entry : ((ExtendedFileOptions)options).getExtendedAttributes().entrySet()) {
/* 167 */         MacFileSystem.setExtendedAttribute(destFile, entry.getKey(), entry.getValue(), true);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static long getLastModified(File file) {
/* 173 */     return file.lastModified();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void createSymlink(String target, File destFile, FileOptions options) throws IOException {
/* 184 */     deleteFile(destFile);
/*     */     
/* 186 */     if (UnixFileSystem.createLink(target, destFile)) {
/* 187 */       if (InstallerUtil.isMacOS() && options instanceof ExtendedFileOptions) {
/* 188 */         for (Map.Entry<String, String> entry : ((ExtendedFileOptions)options).getExtendedAttributes().entrySet()) {
/* 189 */           MacFileSystem.setExtendedAttribute(destFile, entry.getKey(), entry.getValue(), true);
/*     */         }
/*     */       }
/*     */     } else {
/* 193 */       throw new IOException("could not create symlink " + destFile);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\fileinst\InstallHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */