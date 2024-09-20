/*    */ package com.install4j.runtime.wizard;
/*    */ import com.ejt.internal.gui.LookAndFeelChangeUtil;
/*    */ import com.ejt.internal.gui.ScreenSizeUtil;
/*    */ import com.install4j.api.UiUtil;
/*    */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*    */ import java.awt.Color;
/*    */ import java.awt.GraphicsDevice;
/*    */ import java.awt.Rectangle;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.UIManager;
/*    */ 
/*    */ public abstract class CustomFrame extends JFrame {
/*    */   public CustomFrame() {
/* 14 */     UiUtil.getLookAndFeelEnhancer().prepareWindow(this);
/* 15 */     LookAndFeelChangeUtil.registerWindow(this);
/* 16 */     LookAndFeelChangeUtil.onLookAndFeelChangeAndNow(this, CustomFrame::updateTitleBar);
/*    */   }
/*    */   
/*    */   private void updateTitleBar() {
/* 20 */     getRootPane().putClientProperty("JRootPane.titleBarBackground", getTitlePaneBackgroundColor());
/*    */   }
/*    */   
/*    */   protected Color getTitlePaneBackgroundColor() {
/* 24 */     return UIManager.getColor("Panel.background");
/*    */   }
/*    */   
/*    */   protected abstract int getFrameHeight();
/*    */   
/*    */   protected abstract int getFrameWidth();
/*    */   
/*    */   protected Rectangle getNewFrameBounds() {
/* 32 */     int frameWidth = getFrameWidth();
/* 33 */     int frameHeight = getFrameHeight();
/* 34 */     if (frameWidth == -1) {
/* 35 */       frameWidth = getWidth();
/*    */     }
/* 37 */     if (frameHeight == -1) {
/* 38 */       frameHeight = getHeight();
/*    */     }
/*    */     
/* 41 */     return getNewFrameBounds(frameWidth, frameHeight);
/*    */   }
/*    */   
/*    */   protected Rectangle getNewFrameBounds(int frameWidth, int frameHeight) {
/* 45 */     GraphicsDevice screenDevice = ScreenSizeUtil.getScreenDevice();
/* 46 */     Rectangle screenBounds = screenDevice.getDefaultConfiguration().getBounds();
/*    */     
/* 48 */     int newX = screenBounds.x + (screenBounds.width - frameWidth) / 2;
/* 49 */     int newY = screenBounds.y + (screenBounds.height - frameHeight) / 2;
/*    */     
/* 51 */     return new Rectangle(newX, newY, frameWidth, frameHeight);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setVisible(boolean visible) {
/* 56 */     if (visible) {
/* 57 */       GUIHelper.applyComponentOrientation(this);
/*    */     }
/* 59 */     super.setVisible(visible);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\wizard\CustomFrame.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */