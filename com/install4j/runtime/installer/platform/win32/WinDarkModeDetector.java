/*    */ package com.install4j.runtime.installer.platform.win32;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.windows.RegistryRoot;
/*    */ import com.install4j.api.windows.WinRegistry;
/*    */ 
/*    */ public class WinDarkModeDetector
/*    */ {
/*    */   public static boolean isDarkMode() {
/* 10 */     if (!Util.isWindows()) {
/* 11 */       return false;
/*    */     }
/* 13 */     Object currentMajorVersion = WinRegistry.getValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion", "CurrentMajorVersionNumber");
/* 14 */     if (!(currentMajorVersion instanceof Number) || ((Number)currentMajorVersion).intValue() < 10) {
/* 15 */       return false;
/*    */     }
/*    */     
/* 18 */     Object releaseId = WinRegistry.getValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion", "ReleaseId");
/* 19 */     if (releaseId != null) {
/*    */       try {
/* 21 */         int intVal = Integer.parseInt(releaseId.toString());
/* 22 */         if (intVal > 0 && intVal < 1809) {
/* 23 */           return false;
/*    */         }
/* 25 */       } catch (Throwable throwable) {}
/*    */     }
/*    */ 
/*    */     
/* 29 */     Object useLightTheme = WinRegistry.getValue(RegistryRoot.HKEY_CURRENT_USER, "Software\\Microsoft\\Windows\\CurrentVersion\\Themes\\Personalize", "AppsUseLightTheme");
/* 30 */     if (useLightTheme instanceof Number) {
/* 31 */       return (((Number)useLightTheme).intValue() == 0);
/*    */     }
/* 33 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\WinDarkModeDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */