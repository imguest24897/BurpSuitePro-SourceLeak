/*    */ package com.ejt.internal.util;
/*    */ 
/*    */ public class CommonPlatformUtil {
/*  4 */   private static final String OS_NAME = System.getProperty("os.name");
/*    */   
/*    */   public static boolean isMacOS() {
/*  7 */     return OS_NAME.toLowerCase().startsWith("mac");
/*    */   }
/*    */   
/*    */   public static boolean isWindows() {
/* 11 */     return OS_NAME.toLowerCase().startsWith("win");
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\interna\\util\CommonPlatformUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */