/*    */ package com.exe4j.runtime;
/*    */ 
/*    */ import com.exe4j.runtime.gui.AwtSplashScreen;
/*    */ import com.exe4j.runtime.splash.SplashEngine;
/*    */ 
/*    */ public class Exe4JController
/*    */   implements SplashEngine.SplashInterface
/*    */ {
/*    */   private static final int ACTION_NONE = 0;
/*    */   private static final int ACTION_HIDE = 1;
/*    */   private static final int ACTION_WRITE_MESSAGE = 2;
/* 12 */   private static int currentAction = 0;
/* 13 */   private static String currentMessage = "";
/*    */ 
/*    */   
/*    */   public void writeMessage(String message) {
/* 17 */     if (currentAction != 1) {
/* 18 */       currentMessage = message;
/* 19 */       currentAction = 2;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void hideScreen() {
/* 25 */     currentAction = 1;
/*    */     try {
/* 27 */       AwtSplashScreen.Invoker.hideExternal();
/* 28 */     } catch (Throwable throwable) {}
/*    */   }
/*    */ 
/*    */   
/*    */   public static int getAction() {
/* 33 */     int action = currentAction;
/* 34 */     currentAction = 0;
/* 35 */     return action;
/*    */   }
/*    */   
/*    */   public static String getText() {
/* 39 */     return currentMessage;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtime\Exe4JController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */