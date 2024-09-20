/*     */ package com.install4j.runtime.installer;
/*     */ 
/*     */ import com.install4j.api.context.ControlButtonType;
/*     */ import com.install4j.api.context.WizardContext;
/*     */ import com.install4j.api.context.WizardIndex;
/*     */ import com.install4j.api.styles.StyleManager;
/*     */ 
/*     */ public class WizardContextProxy
/*     */   implements WizardContext {
/*     */   private WizardContext parentContext;
/*     */   
/*     */   protected WizardContextProxy(WizardContext parentContext) {
/*  13 */     this.parentContext = parentContext;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonEnabled(ControlButtonType controlButtonType, boolean enabled) {
/*  18 */     this.parentContext.setControlButtonEnabled(controlButtonType, enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonVisible(ControlButtonType controlButtonType, boolean visible) {
/*  23 */     this.parentContext.setControlButtonVisible(controlButtonType, visible);
/*     */   }
/*     */ 
/*     */   
/*     */   public void pressControlButton(ControlButtonType controlButtonType) {
/*  28 */     this.parentContext.pressControlButton(controlButtonType);
/*     */   }
/*     */ 
/*     */   
/*     */   public void focusControlButton(ControlButtonType controlButtonType) {
/*  33 */     this.parentContext.focusControlButton(controlButtonType);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonText(ControlButtonType controlButtonType, String text) {
/*  38 */     this.parentContext.setControlButtonText(controlButtonType, text);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setNextButtonEnabled(boolean enabled) {
/*  44 */     this.parentContext.setNextButtonEnabled(enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setBackButtonEnabled(boolean enabled) {
/*  50 */     this.parentContext.setBackButtonEnabled(enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setCancelButtonEnabled(boolean enabled) {
/*  56 */     this.parentContext.setCancelButtonEnabled(enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setNextButtonVisible(boolean visible) {
/*  62 */     this.parentContext.setNextButtonVisible(visible);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setBackButtonVisible(boolean visible) {
/*  68 */     this.parentContext.setBackButtonVisible(visible);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setCancelButtonVisible(boolean visible) {
/*  74 */     this.parentContext.setCancelButtonVisible(visible);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void pressNextButton() {
/*  80 */     this.parentContext.pressNextButton();
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void pressPreviousButton() {
/*  86 */     this.parentContext.pressPreviousButton();
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void pressCancelButton() {
/*  92 */     this.parentContext.pressCancelButton();
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void focusNextButton() {
/*  98 */     this.parentContext.focusNextButton();
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setNextButtonText(String text) {
/* 104 */     this.parentContext.setNextButtonText(text);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setPreviousButtonText(String text) {
/* 110 */     this.parentContext.setPreviousButtonText(text);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setCancelButtonText(String text) {
/* 116 */     this.parentContext.setCancelButtonText(text);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setWizardIndex(WizardIndex wizardIndex) {
/* 121 */     this.parentContext.setWizardIndex(wizardIndex);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setWizardIndexKey(String key) {
/* 126 */     this.parentContext.setWizardIndexKey(key);
/*     */   }
/*     */ 
/*     */   
/*     */   public StyleManager getStyleManager() {
/* 131 */     return this.parentContext.getStyleManager();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setWindowSize(int width, int height) {
/* 136 */     this.parentContext.setWindowSize(width, height);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setWindowTitle(String title) {
/* 141 */     this.parentContext.setWindowTitle(title);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\WizardContextProxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */