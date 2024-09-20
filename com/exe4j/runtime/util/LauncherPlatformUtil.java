/*    */ package com.exe4j.runtime.util;
/*    */ 
/*    */ import java.util.Locale;
/*    */ 
/*    */ public class LauncherPlatformUtil
/*    */ {
/*  7 */   private static final String OS_NAME = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
/*  8 */   private static final boolean LINUX = OS_NAME.startsWith("linux");
/*  9 */   private static final boolean WINDOWS = OS_NAME.startsWith("win");
/* 10 */   private static final boolean MACOS = OS_NAME.startsWith("mac");
/* 11 */   private static final boolean JAVA_9_PLUS = !System.getProperty("java.version").startsWith("1.");
/*    */   
/* 13 */   public static final String OS_ARCH = System.getProperty("os.arch");
/*    */   
/*    */   public static boolean isJava9Plus() {
/* 16 */     return JAVA_9_PLUS;
/*    */   }
/*    */   
/*    */   public static boolean isMacOS() {
/* 20 */     return MACOS;
/*    */   }
/*    */   
/*    */   public static boolean isLinux() {
/* 24 */     return LINUX;
/*    */   }
/*    */   
/*    */   public static boolean isWindows() {
/* 28 */     return WINDOWS;
/*    */   }
/*    */   
/*    */   public static boolean isX86() {
/* 32 */     return (OS_ARCH.contains("86") && !OS_ARCH.contains("64"));
/*    */   }
/*    */   
/*    */   public static boolean isAarch64() {
/* 36 */     return (OS_ARCH.contains("aarch64") || OS_ARCH.contains("arm64"));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtim\\util\LauncherPlatformUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */