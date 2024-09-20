/*    */ package com.install4j.runtime.launcher.util;
/*    */ 
/*    */ import com.exe4j.runtime.gui.MessageBox;
/*    */ import com.install4j.runtime.launcher.LauncherHelper;
/*    */ 
/*    */ public class ErrorHandler {
/*    */   private static boolean isGuiApplication = true;
/*    */   
/*    */   private static void displayGuiErrorMessage(String message) {
/*    */     try {
/* 11 */       MessageBox.Invoker.showError(message);
/* 12 */     } catch (Throwable throwable) {}
/*    */   }
/*    */ 
/*    */   
/*    */   public static void reportError(String message) {
/* 17 */     System.err.println(message);
/* 18 */     if (isGuiApplication) {
/* 19 */       displayGuiErrorMessage(message);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void reportFatalError(String message) {
/* 24 */     reportError(message);
/* 25 */     LauncherHelper.INSTANCE.exit(1);
/*    */   }
/*    */   
/*    */   public static void setIsGuiApplication(boolean v) {
/* 29 */     isGuiApplication = v;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launche\\util\ErrorHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */