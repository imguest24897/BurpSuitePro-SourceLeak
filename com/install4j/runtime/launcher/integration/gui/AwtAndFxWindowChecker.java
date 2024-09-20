/*    */ package com.install4j.runtime.launcher.integration.gui;
/*    */ 
/*    */ import com.install4j.runtime.installer.helper.versionspecific.VersionSpecificHelper;
/*    */ import java.awt.Window;
/*    */ 
/*    */ public class AwtAndFxWindowChecker
/*    */   extends WindowChecker
/*    */ {
/*    */   public AwtAndFxWindowChecker(Runnable runnable, boolean adjustLaf) {
/* 10 */     super(runnable, adjustLaf);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean checkExecute() {
/* 15 */     if (hasVisibleAwtWindows()) {
/* 16 */       setAdjustLaf(false);
/*    */     }
/* 18 */     return hasVisibleWindows();
/*    */   }
/*    */   
/*    */   public static boolean hasVisibleWindows() {
/* 22 */     return (hasVisibleAwtWindows() || VersionSpecificHelper.isJavaFxWindowShown());
/*    */   }
/*    */   
/*    */   public static boolean hasVisibleAwtWindows() {
/* 26 */     return isShowing(Window.getWindows());
/*    */   }
/*    */   
/*    */   private static boolean isShowing(Window[] windows) {
/* 30 */     for (Window window : windows) {
/* 31 */       if (window.isShowing()) {
/* 32 */         return true;
/*    */       }
/* 34 */       if (isShowing(window.getOwnedWindows())) {
/* 35 */         return true;
/*    */       }
/*    */     } 
/*    */     
/* 39 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\integration\gui\AwtAndFxWindowChecker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */