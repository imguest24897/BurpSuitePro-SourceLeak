/*    */ package com.install4j.runtime.wizard;
/*    */ 
/*    */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*    */ import java.awt.Color;
/*    */ import java.awt.Dimension;
/*    */ 
/*    */ public class WizardFrame
/*    */   extends CustomFrame {
/*    */   private WizardBase wizardBase;
/*    */   
/*    */   public WizardFrame(WizardBase wizardBase) {
/* 12 */     this.wizardBase = wizardBase;
/* 13 */     setContentPane(wizardBase);
/* 14 */     setDefaultCloseOperation(0);
/* 15 */     wizardBase.prepareWindow(this);
/*    */     
/* 17 */     if (wizardBase.isSizeClientArea()) {
/* 18 */       wizardBase.setPreferredSize(new Dimension(getFrameWidth(), getFrameHeight()));
/* 19 */       pack();
/* 20 */       setBounds(getNewFrameBounds(getWidth(), getHeight()));
/*    */     } else {
/* 22 */       setBounds(getNewFrameBounds());
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected Color getTitlePaneBackgroundColor() {
/* 28 */     return GUIHelper.CONTENT_BACKGROUND_COLOR;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int getFrameHeight() {
/* 33 */     return this.wizardBase.getFrameHeight();
/*    */   }
/*    */ 
/*    */   
/*    */   protected int getFrameWidth() {
/* 38 */     return this.wizardBase.getFrameWidth();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\wizard\WizardFrame.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */