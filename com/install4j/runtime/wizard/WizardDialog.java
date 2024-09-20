/*    */ package com.install4j.runtime.wizard;
/*    */ 
/*    */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*    */ import com.install4j.runtime.util.CustomDialog;
/*    */ import java.awt.Color;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Window;
/*    */ 
/*    */ public class WizardDialog extends CustomDialog {
/*    */   private WizardBase wizardBase;
/*    */   
/*    */   public WizardDialog(WizardBase wizardBase, Window parentWindow) {
/* 13 */     super(parentWindow);
/* 14 */     this.wizardBase = wizardBase;
/*    */     
/* 16 */     setContentPane(wizardBase);
/* 17 */     setDefaultCloseOperation(0);
/* 18 */     wizardBase.prepareWindow((Window)this);
/*    */     
/* 20 */     if (wizardBase.isSizeClientArea()) {
/* 21 */       wizardBase.setPreferredSize(new Dimension(getFrameWidth(), getFrameHeight()));
/* 22 */       pack();
/* 23 */       setBounds(getFrameBounds(getWidth(), getHeight()));
/*    */     } else {
/* 25 */       setBounds(getFrameBounds());
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected Color getTitlePaneBackgroundColor() {
/* 31 */     return GUIHelper.CONTENT_BACKGROUND_COLOR;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int getFrameHeight() {
/* 36 */     return this.wizardBase.getFrameHeight();
/*    */   }
/*    */ 
/*    */   
/*    */   protected int getFrameWidth() {
/* 41 */     return this.wizardBase.getFrameWidth();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\wizard\WizardDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */