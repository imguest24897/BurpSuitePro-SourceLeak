/*    */ package com.install4j.runtime.installer.platform.macos;
/*    */ 
/*    */ import com.install4j.runtime.installer.platform.win32.Common;
/*    */ import com.install4j.runtime.launcher.util.LauncherUtil;
/*    */ 
/*    */ public class MacosEnvHelper
/*    */ {
/*    */   static {
/*  9 */     Common.init();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean setEnv(String name, String value) {
/* 15 */     if (LauncherUtil.isMacOS()) {
/* 16 */       if (name == null || name.length() == 0) {
/* 17 */         throw new IllegalArgumentException("must supply a var name");
/*    */       }
/* 19 */       return setEnv0(name, value);
/*    */     } 
/* 21 */     return false;
/*    */   }
/*    */   
/*    */   private static native boolean setEnv0(String paramString1, String paramString2);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\MacosEnvHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */