/*    */ package com.exe4j.runtime.splash;
/*    */ 
/*    */ import com.exe4j.runtime.LauncherEngine;
/*    */ import com.exe4j.runtime.util.ArgumentStack;
/*    */ 
/*    */ 
/*    */ public class SplashScreenConfig
/*    */ {
/*    */   private TextLineConfig statusLineConfig;
/*    */   private TextLineConfig versionLineConfig;
/*    */   private boolean textOverlay;
/*    */   
/*    */   public SplashScreenConfig init(ArgumentStack argStack) {
/* 14 */     boolean legacySplashScreen = argStack.popBoolean();
/* 15 */     if (legacySplashScreen) {
/* 16 */       argStack.popBoolean();
/* 17 */       argStack.popString();
/* 18 */       argStack.popBoolean();
/* 19 */       argStack.popBoolean();
/* 20 */       argStack.popInt();
/* 21 */       argStack.popInt();
/* 22 */       this.statusLineConfig = new TextLineConfig(argStack);
/* 23 */       this.versionLineConfig = new TextLineConfig(argStack);
/*    */     } 
/* 25 */     return this;
/*    */   }
/*    */   
/*    */   public SplashScreenConfig initFromLauncherEngine() {
/* 29 */     this.statusLineConfig = new TextLineConfig(10109);
/* 30 */     this.versionLineConfig = new TextLineConfig(10116);
/* 31 */     this.textOverlay = LauncherEngine.getBooleanProperty(163);
/* 32 */     return this;
/*    */   }
/*    */   
/*    */   public SplashScreenConfig init(boolean textOverlay, TextLineConfig statusLineConfig, TextLineConfig versionLineConfig) {
/* 36 */     this.textOverlay = textOverlay;
/* 37 */     this.statusLineConfig = statusLineConfig;
/* 38 */     this.versionLineConfig = versionLineConfig;
/* 39 */     return this;
/*    */   }
/*    */   
/*    */   public boolean isTextOverlay() {
/* 43 */     return this.textOverlay;
/*    */   }
/*    */   
/*    */   public TextLineConfig getStatusLineConfig() {
/* 47 */     return this.statusLineConfig;
/*    */   }
/*    */   
/*    */   public TextLineConfig getVersionLineConfig() {
/* 51 */     return this.versionLineConfig;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtime\splash\SplashScreenConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */