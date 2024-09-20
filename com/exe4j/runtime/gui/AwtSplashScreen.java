/*    */ package com.exe4j.runtime.gui;
/*    */ import com.exe4j.runtime.splash.SplashEngine;
/*    */ import com.exe4j.runtime.splash.SplashScreenConfig;
/*    */ import com.exe4j.runtime.splash.TextLineConfig;
/*    */ import java.awt.Color;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Font;
/*    */ import java.awt.FontMetrics;
/*    */ import java.awt.RenderingHints;
/*    */ import java.awt.SplashScreen;
/*    */ import javax.swing.JLabel;
/*    */ 
/*    */ public class AwtSplashScreen implements SplashEngine.SplashInterface {
/*    */   private SplashScreen splashScreen;
/*    */   private Font statusFont;
/*    */   
/*    */   private AwtSplashScreen() {
/* 18 */     SplashScreenConfig config = SplashEngine.getJavaSplashScreenConfig();
/*    */     try {
/* 20 */       if (config.isTextOverlay() && config.getStatusLineConfig() != null && config.getVersionLineConfig() != null) {
/* 21 */         this.splashScreen = SplashScreen.getSplashScreen();
/* 22 */         if (this.splashScreen != null) {
/* 23 */           Font font; FontMetrics fm; this.statusText = config.getStatusLineConfig().getText();
/* 24 */           this.graphics2D = this.splashScreen.createGraphics();
/* 25 */           boolean useDefaultFont = Boolean.getBoolean("install4j.splashScreenDefaultFont");
/* 26 */           JLabel label = new JLabel();
/*    */ 
/*    */           
/* 29 */           if (useDefaultFont) {
/* 30 */             font = this.graphics2D.getFont();
/* 31 */             fm = this.graphics2D.getFontMetrics();
/*    */           } else {
/* 33 */             font = label.getFont();
/* 34 */             fm = label.getFontMetrics(font);
/*    */           } 
/* 36 */           this.graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, (fm.getFontRenderContext().getAntiAliasingHint() != RenderingHints.VALUE_TEXT_ANTIALIAS_OFF) ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
/* 37 */           this.graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, fm.getFontRenderContext().getAntiAliasingHint());
/* 38 */           this.graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, fm.getFontRenderContext().getFractionalMetricsHint());
/* 39 */           this.statusFont = createFont(font, config.getStatusLineConfig());
/* 40 */           this.versionFont = createFont(font, config.getVersionLineConfig());
/* 41 */           update();
/*    */         } 
/*    */       } 
/* 44 */     } catch (Throwable e) {
/* 45 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */   private Font versionFont; private String statusText; private Graphics2D graphics2D;
/*    */   private void update() {
/* 50 */     if (this.splashScreen != null && this.splashScreen.isVisible()) {
/* 51 */       Dimension size = this.splashScreen.getSize();
/* 52 */       this.graphics2D.setComposite(AlphaComposite.Clear);
/* 53 */       this.graphics2D.fillRect(0, 0, size.width, size.height);
/* 54 */       this.graphics2D.setPaintMode();
/* 55 */       SplashScreenConfig config = SplashEngine.getJavaSplashScreenConfig();
/* 56 */       drawText(this.statusText, this.statusFont, config.getStatusLineConfig());
/* 57 */       drawText(config.getVersionLineConfig().getText(), this.versionFont, config.getVersionLineConfig());
/* 58 */       this.splashScreen.update();
/*    */     } 
/*    */   }
/*    */   
/*    */   private void drawText(String text, Font font, TextLineConfig textLineConfig) {
/* 63 */     this.graphics2D.setFont(font);
/* 64 */     this.graphics2D.setColor(new Color(textLineConfig.getFontColorR(), textLineConfig.getFontColorG(), textLineConfig.getFontColorB()));
/* 65 */     this.graphics2D.drawString(text, textLineConfig.getPositionX(), textLineConfig.getPositionY() + this.graphics2D.getFontMetrics().getAscent());
/*    */   }
/*    */   
/*    */   private Font createFont(Font font, TextLineConfig config) {
/* 69 */     int fontStyle = (config.getFontWeight() > 500) ? 1 : 0;
/* 70 */     return font.deriveFont(fontStyle, (int)(config.getFontSize() * 1.3D));
/*    */   }
/*    */ 
/*    */   
/*    */   public synchronized void writeMessage(String message) throws Exception {
/* 75 */     this.statusText = message;
/* 76 */     update();
/*    */   }
/*    */ 
/*    */   
/*    */   public synchronized void hideScreen() {
/* 81 */     if (this.splashScreen == null) {
/* 82 */       this.splashScreen = SplashScreen.getSplashScreen();
/*    */     }
/* 84 */     if (this.splashScreen != null) {
/* 85 */       this.splashScreen.close();
/*    */     }
/*    */   }
/*    */   
/*    */   public static class Invoker
/*    */   {
/*    */     public static SplashEngine.SplashInterface create() {
/* 92 */       return new AwtSplashScreen();
/*    */     }
/*    */     
/*    */     public static void hideExternal() {
/* 96 */       SplashScreen splashScreen = SplashScreen.getSplashScreen();
/* 97 */       if (splashScreen != null)
/* 98 */         splashScreen.close(); 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtime\gui\AwtSplashScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */