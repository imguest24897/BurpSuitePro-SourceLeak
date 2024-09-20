/*    */ package com.install4j.runtime.launcher.integration.gui;
/*    */ 
/*    */ import com.install4j.api.launcher.SplashScreen;
/*    */ import com.install4j.runtime.installer.frontend.LookAndFeelHelper;
/*    */ 
/*    */ public abstract class WindowChecker
/*    */   extends Thread {
/*    */   public static final String PROPNAME_SWT = "install4j.swt";
/*    */   public static final String PROPNAME_SPLASH_AUTO_HIDE = "install4j.splashAutoHide";
/*    */   
/*    */   public static void initSplashAutoHide() {
/* 12 */     if (Boolean.getBoolean("install4j.splashAutoHide"))
/* 13 */       onFirstWindowShown(() -> {
/*    */             try {
/*    */               SplashScreen.hide();
/* 16 */             } catch (com.install4j.api.launcher.SplashScreen.ConnectionException e) {
/*    */               e.printStackTrace();
/*    */             } 
/*    */           }false); 
/*    */   }
/*    */   private Runnable runnable; private boolean adjustLaf;
/*    */   
/*    */   public static void onFirstWindowShown(Runnable runnable, boolean adjustLaf) {
/* 24 */     if (Boolean.getBoolean("install4j.swt") && isSwtPresent()) {
/* 25 */       (new SwtWindowChecker(runnable, adjustLaf)).start();
/*    */     } else {
/* 27 */       (new AwtAndFxWindowChecker(runnable, adjustLaf)).start();
/*    */     } 
/*    */   }
/*    */   
/*    */   private static boolean isSwtPresent() {
/*    */     try {
/* 33 */       Class.forName("org.eclipse.swt.widgets.Display");
/* 34 */       return true;
/* 35 */     } catch (Exception e) {
/* 36 */       return false;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected WindowChecker(Runnable runnable, boolean adjustLaf) {
/* 44 */     super("install4j: window checker");
/* 45 */     this.runnable = runnable;
/* 46 */     this.adjustLaf = adjustLaf;
/* 47 */     setDaemon(true);
/*    */   }
/*    */   
/*    */   protected void setAdjustLaf(boolean adjustLaf) {
/* 51 */     this.adjustLaf = adjustLaf;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/*    */     try {
/* 57 */       sleep(300L);
/* 58 */     } catch (InterruptedException interruptedException) {}
/*    */     
/* 60 */     boolean execute = false;
/* 61 */     while (!execute) {
/*    */       try {
/* 63 */         sleep(200L);
/* 64 */         execute = checkExecute();
/* 65 */       } catch (InterruptedException interruptedException) {}
/*    */     } 
/*    */     
/* 68 */     if (this.adjustLaf) {
/* 69 */       LookAndFeelHelper.setLookAndFeelUnconditional();
/*    */     }
/* 71 */     this.runnable.run();
/*    */   }
/*    */   
/*    */   protected abstract boolean checkExecute();
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\integration\gui\WindowChecker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */