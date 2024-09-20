/*    */ package com.install4j.runtime.installer.platform.macos;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.runtime.installer.platform.win32.Common;
/*    */ 
/*    */ public class MacNative
/*    */ {
/*    */   public static final int MACOS_MAJOR_VERSION;
/*    */   public static final int MACOS_MINOR_VERSION;
/*    */   public static final boolean MACOS_10_12_PLUS;
/*    */   private static final int LIBRARY_10_12_PLUS = 1;
/*    */   
/*    */   static {
/* 14 */     int majorVersion = 0;
/* 15 */     int minorVersion = 0;
/*    */     
/* 17 */     if (Util.isMacOS()) {
/* 18 */       String osVersion = System.getProperty("os.version", "10.0");
/* 19 */       String[] segments = osVersion.split("\\.");
/* 20 */       if (segments.length >= 2) {
/*    */         try {
/* 22 */           majorVersion = Integer.parseInt(segments[0]);
/* 23 */           minorVersion = Integer.parseInt(segments[1]);
/* 24 */         } catch (NumberFormatException e) {
/* 25 */           e.printStackTrace();
/*    */         } 
/*    */       }
/*    */     } 
/*    */     
/* 30 */     MACOS_MAJOR_VERSION = majorVersion;
/* 31 */     MACOS_MINOR_VERSION = minorVersion;
/* 32 */     MACOS_10_12_PLUS = (majorVersion >= 10 && minorVersion >= 12);
/*    */   }
/*    */   
/*    */   public static void init1012() {
/* 36 */     if (MACOS_10_12_PLUS)
/* 37 */       Common.init(1); 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\MacNative.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */