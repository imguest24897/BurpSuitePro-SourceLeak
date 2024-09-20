/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ 
/*     */ import com.exe4j.runtime.util.ResourceHelper;
/*     */ import com.install4j.runtime.launcher.LauncherHelper;
/*     */ import com.install4j.runtime.launcher.util.LauncherUtil;
/*     */ import java.io.File;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Common
/*     */ {
/*     */   public static final String LIBRARY_NAME = "i4jinst";
/*     */   public static final String EXT_32_BIT = ".32";
/*     */   public static final String EXT_64_BIT = ".64";
/*     */   public static final String EXT_ARM64_BIT = ".arm64";
/*     */   public static final int WIN_LIBRARY_COUNT = 1;
/*     */   public static final int MAC_LIBRARY_COUNT = 2;
/*     */   public static final int BASE = 0;
/*  22 */   private static boolean[] initialized = new boolean[Math.max(1, 2) + 1];
/*     */ 
/*     */   
/*     */   public static void initFromLauncher(boolean value) {
/*  26 */     initialized[0] = value;
/*     */   }
/*     */   
/*     */   public static synchronized void init() {
/*  30 */     init(0);
/*     */   }
/*     */   
/*     */   public static synchronized void init(int libraryNumber) {
/*  34 */     if (Boolean.getBoolean("install4j.installerIntegrationTest")) {
/*     */       return;
/*     */     }
/*  37 */     if (!initialized[libraryNumber]) {
/*  38 */       initialized[libraryNumber] = true;
/*  39 */       if (LauncherUtil.isWindows()) {
/*  40 */         String osArch = System.getProperty("os.arch");
/*  41 */         if (osArch.contains("aarch") || osArch.contains("arm")) {
/*  42 */           File debugArmLibrary = LauncherHelper.INSTANCE.getInstallerFile(getWinLibraryFilename(libraryNumber) + ".arm64");
/*  43 */           if (debugArmLibrary.exists()) {
/*  44 */             System.load(debugArmLibrary.getAbsolutePath());
/*     */           } else {
/*  46 */             loadNonDebug(getWinLibraryFilename(libraryNumber));
/*     */           } 
/*     */         } else {
/*  49 */           boolean is64Bit = osArch.contains("64");
/*  50 */           File debug64BitLibrary = LauncherHelper.INSTANCE.getInstallerFile(getWinLibraryFilename(libraryNumber) + ".64");
/*  51 */           File debug32BitLibrary = LauncherHelper.INSTANCE.getInstallerFile(getWinLibraryFilename(libraryNumber) + ".32");
/*  52 */           if (is64Bit && debug64BitLibrary.exists()) {
/*  53 */             System.load(debug64BitLibrary.getAbsolutePath());
/*  54 */           } else if (!is64Bit && debug32BitLibrary.exists()) {
/*  55 */             System.load(debug32BitLibrary.getAbsolutePath());
/*     */           } else {
/*  57 */             loadNonDebug(getWinLibraryFilename(libraryNumber));
/*     */           } 
/*     */         } 
/*  60 */       } else if (LauncherUtil.isMacOS()) {
/*  61 */         File runtimeDir = ResourceHelper.getRuntimeDir();
/*  62 */         if (ResourceHelper.isFromFile() && runtimeDir != null && runtimeDir.getPath().endsWith("../dist/install4j/resource")) {
/*  63 */           System.load((new File(ResourceHelper.getRuntimeDir(), "macos/" + getMacLibraryFilename(libraryNumber))).getAbsolutePath());
/*     */         } else {
/*  65 */           loadNonDebug(getMacLibraryFilename(libraryNumber));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void loadNonDebug(String fileName) {
/*  72 */     File defaultFile = new File(ResourceHelper.getRuntimeDir(), fileName);
/*     */     try {
/*  74 */       System.load(defaultFile.getAbsolutePath());
/*  75 */     } catch (UnsatisfiedLinkError e) {
/*  76 */       String currentDir = (new File(System.getProperty("user.dir"), fileName)).getAbsolutePath();
/*     */       try {
/*  78 */         System.load(currentDir);
/*  79 */       } catch (UnsatisfiedLinkError e1) {
/*     */         try {
/*  81 */           System.loadLibrary("i4jinst");
/*  82 */         } catch (UnsatisfiedLinkError e2) {
/*  83 */           throw new UnsatisfiedLinkError("could not load i4jinst from " + defaultFile.isFile() + ", " + currentDir + ", " + defaultFile.getAbsolutePath());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   static byte[] getAnsiCString(String str) {
/*  90 */     byte[] bytes = str.getBytes();
/*  91 */     byte[] terminatedBytes = new byte[bytes.length + 1];
/*  92 */     System.arraycopy(bytes, 0, terminatedBytes, 0, bytes.length);
/*  93 */     return terminatedBytes;
/*     */   }
/*     */   
/*     */   static byte[] getAnsiCString(File file) {
/*  97 */     return getAnsiCString(file.getAbsolutePath());
/*     */   }
/*     */   
/*     */   public static String getWinLibraryFilename(int libraryNumber) {
/* 101 */     return "i4jinst" + getLibrarySuffix(libraryNumber) + ".dll";
/*     */   }
/*     */   
/*     */   public static String getMacLibraryFilename(int libraryNumber) {
/* 105 */     return "libi4jinst" + getLibrarySuffix(libraryNumber) + ".dylib";
/*     */   }
/*     */   
/*     */   private static String getLibrarySuffix(int libraryNumber) {
/* 109 */     return (libraryNumber == 0) ? "" : String.valueOf(libraryNumber + 1);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\Common.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */