/*     */ package com.install4j.runtime.installer;
/*     */ 
/*     */ import com.install4j.api.context.ControlButtonType;
/*     */ import com.install4j.api.context.WizardIndex;
/*     */ import com.install4j.api.styles.StyleManager;
/*     */ import com.install4j.runtime.beans.styles.StyleManagerImpl;
/*     */ import java.awt.Dimension;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DummyWizardContext
/*     */   implements WizardContextInt
/*     */ {
/*     */   public void setControlButtonEnabled(ControlButtonType controlButtonType, boolean enabled) {}
/*     */   
/*     */   public void setControlButtonVisible(ControlButtonType controlButtonType, boolean visible) {}
/*     */   
/*     */   public void pressControlButton(ControlButtonType controlButtonType) {}
/*     */   
/*     */   public void focusControlButton(ControlButtonType controlButtonType) {}
/*     */   
/*     */   public void setControlButtonText(ControlButtonType controlButtonType, String text) {}
/*     */   
/*     */   @Deprecated
/*     */   public void setNextButtonEnabled(boolean enabled) {}
/*     */   
/*     */   @Deprecated
/*     */   public void setBackButtonEnabled(boolean enabled) {}
/*     */   
/*     */   @Deprecated
/*     */   public void setCancelButtonEnabled(boolean enabled) {}
/*     */   
/*     */   @Deprecated
/*     */   public void setNextButtonVisible(boolean visible) {}
/*     */   
/*     */   @Deprecated
/*     */   public void setBackButtonVisible(boolean visible) {}
/*     */   
/*     */   @Deprecated
/*     */   public void setCancelButtonVisible(boolean visible) {}
/*     */   
/*     */   @Deprecated
/*     */   public void pressNextButton() {}
/*     */   
/*     */   @Deprecated
/*     */   public void pressPreviousButton() {}
/*     */   
/*     */   @Deprecated
/*     */   public void pressCancelButton() {}
/*     */   
/*     */   @Deprecated
/*     */   public void focusNextButton() {}
/*     */   
/*     */   @Deprecated
/*     */   public void setNextButtonText(String text) {}
/*     */   
/*     */   @Deprecated
/*     */   public void setPreviousButtonText(String text) {}
/*     */   
/*     */   @Deprecated
/*     */   public void setCancelButtonText(String text) {}
/*     */   
/*     */   public void setWizardIndex(WizardIndex wizardIndex) {}
/*     */   
/*     */   public void setWizardIndexKey(String key) {}
/*     */   
/*     */   public StyleManager getStyleManager() {
/*  87 */     return (StyleManager)StyleManagerImpl.getInstance();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWindowSize(int width, int height) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWindowTitle(String title) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public Dimension getWindowSize() {
/* 102 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getWindowTitle() {
/* 107 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\DummyWizardContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */