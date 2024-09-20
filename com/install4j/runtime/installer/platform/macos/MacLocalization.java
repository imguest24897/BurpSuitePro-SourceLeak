/*    */ package com.install4j.runtime.installer.platform.macos;
/*    */ 
/*    */ import com.install4j.runtime.installer.platform.win32.Common;
/*    */ 
/*    */ public class MacLocalization {
/*    */   static {
/*  7 */     Common.init();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static String getLocalizedString(String bundlePath, String keyName, String variable1, String variable2, String variable3) {
/* 13 */     return getLocalizedString0(bundlePath, null, keyName, variable1, variable2, variable3);
/*    */   }
/*    */   
/*    */   public static String getLocalizedString(String bundlePath, String keyName, String variable1, String variable2) {
/* 17 */     return getLocalizedString0(bundlePath, null, keyName, variable1, variable2, null);
/*    */   }
/*    */   
/*    */   public static String getLocalizedString(String bundlePath, String keyName, String variable1) {
/* 21 */     return getLocalizedString0(bundlePath, null, keyName, variable1, null, null);
/*    */   }
/*    */   
/*    */   public static String getLocalizedString(String bundlePath, String keyName) {
/* 25 */     return getLocalizedString0(bundlePath, null, keyName, null, null, null);
/*    */   }
/*    */   
/*    */   private static native String getLocalizedString0(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\MacLocalization.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */