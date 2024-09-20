/*    */ package com.ejt.internal.util;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class JavaVersionUtil
/*    */ {
/*  7 */   public static final boolean JETBRAINS_JRE = System.getProperty("java.vendor").toLowerCase().contains("jetbrains");
/*  8 */   public static final int JAVA_MAJOR_VERSION = getJavaMajorVersion(System.getProperty("java.version"));
/*    */   public static final String LEGACY_PREFIX = "1.";
/* 10 */   public static final boolean IS_32_BIT = "32".equals(System.getProperty("sun.arch.data.model"));
/* 11 */   public static final boolean IS_64_BIT = !IS_32_BIT;
/*    */   
/*    */   public static int getJavaMajorVersion(@NotNull String versionText) {
/* 14 */     if (versionText.startsWith("1.")) {
/* 15 */       versionText = versionText.substring("1.".length());
/*    */     }
/* 17 */     int dotIndex = versionText.indexOf('.');
/* 18 */     if (dotIndex > -1) {
/* 19 */       versionText = versionText.substring(0, dotIndex);
/*    */     }
/* 21 */     for (int i = 0; i < versionText.length(); i++) {
/* 22 */       if (!Character.isDigit(versionText.charAt(i))) {
/* 23 */         versionText = versionText.substring(0, i);
/*    */         break;
/*    */       } 
/*    */     } 
/* 27 */     return Integer.parseInt(versionText);
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean isJava9Plus() {
/* 32 */     return (JAVA_MAJOR_VERSION >= 9);
/*    */   }
/*    */   
/*    */   public static boolean isJava11Plus() {
/* 36 */     return (JAVA_MAJOR_VERSION >= 11);
/*    */   }
/*    */   
/*    */   public static boolean isJava17Plus() {
/* 40 */     return (JAVA_MAJOR_VERSION >= 17);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\interna\\util\JavaVersionUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */