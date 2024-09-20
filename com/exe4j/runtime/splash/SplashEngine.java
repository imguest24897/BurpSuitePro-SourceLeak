/*    */ package com.exe4j.runtime.splash;
/*    */ 
/*    */ import com.exe4j.runtime.Exe4JController;
/*    */ import com.exe4j.runtime.gui.AwtSplashScreen;
/*    */ 
/*    */ public class SplashEngine
/*    */ {
/*    */   private static SplashScreenConfig splashScreenConfig;
/*  9 */   private static SplashInterface splashInterface = (SplashInterface)new Exe4JController();
/*    */   
/*    */   public static void setJavaSplashScreenConfig(boolean used, SplashScreenConfig splashScreenConfig) {
/* 12 */     SplashEngine.splashScreenConfig = splashScreenConfig;
/* 13 */     if (used) {
/*    */       try {
/* 15 */         splashInterface = AwtSplashScreen.Invoker.create();
/* 16 */       } catch (Throwable t) {
/* 17 */         splashInterface = new NoSplashScreen();
/*    */       } 
/*    */     } else {
/* 20 */       splashInterface = new NoSplashScreen();
/*    */     } 
/*    */   }
/*    */   
/*    */   public static SplashScreenConfig getJavaSplashScreenConfig() {
/* 25 */     return splashScreenConfig;
/*    */   }
/*    */   
/*    */   public static void writeMessage(String message) throws Exception {
/* 29 */     splashInterface.writeMessage(message);
/*    */   }
/*    */   
/*    */   public static void hide() throws Exception {
/* 33 */     splashInterface.hideScreen();
/*    */   }
/*    */   
/*    */   public static interface SplashInterface {
/*    */     void writeMessage(String param1String) throws Exception;
/*    */     
/*    */     void hideScreen() throws Exception;
/*    */   }
/*    */   
/*    */   public static class NoSplashScreen implements SplashInterface {
/*    */     public void writeMessage(String message) throws Exception {}
/*    */     
/*    */     public void hideScreen() {}
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtime\splash\SplashEngine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */