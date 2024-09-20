/*     */ package com.install4j.runtime.beans.styles;
/*     */ import com.install4j.api.context.ControlButtonType;
/*     */ import com.install4j.api.styles.NestedStyleContainer;
/*     */ import com.install4j.api.styles.Style;
/*     */ import com.install4j.api.styles.StyleContext;
/*     */ import com.install4j.api.styles.StyleContextReceiver;
/*     */ import com.install4j.api.styles.StyleManager;
/*     */ import com.install4j.runtime.beans.formcomponents.SystemFormComponent;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import javax.swing.JComponent;
/*     */ 
/*     */ public class NestedStyleComponent extends SystemFormComponent implements StyleContextReceiver, ControlButtonContainer, NestedStyleContainer {
/*  14 */   private String styleId = "";
/*     */   private Style style;
/*     */   
/*     */   public String getStyleId() {
/*  18 */     return replaceVariables(this.styleId);
/*     */   }
/*     */   
/*     */   public void setStyleId(String styleId) {
/*  22 */     this.styleId = styleId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStyleContext(StyleContext styleContext) {
/*  27 */     if (styleContext != null) {
/*  28 */       initStyle();
/*  29 */       if (this.style != null) {
/*  30 */         this.style.setStyleContext(styleContext);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  37 */     initStyle();
/*  38 */     if (this.style != null) {
/*  39 */       return getStyleManager().createStyleComponent(this.style);
/*     */     }
/*     */     
/*  42 */     return new JLabel("Error, style with ID " + getStyleId() + " does not exist");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Collection<String> getNestedStyleIds() {
/*  48 */     return Collections.singleton(getStyleId());
/*     */   }
/*     */   
/*     */   private void initStyle() {
/*  52 */     if (this.style == null) {
/*  53 */       this.style = getStyleManager().cloneStyleById(getStyleId());
/*     */     }
/*     */   }
/*     */   
/*     */   private StyleManager getStyleManager() {
/*  58 */     return getContext().getWizardContext().getStyleManager();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/*  63 */     initStyle();
/*  64 */     if (this.style != null) {
/*  65 */       return this.style.isFillHorizontal();
/*     */     }
/*  67 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFillCenterVertical() {
/*  73 */     initStyle();
/*  74 */     if (this.style != null) {
/*  75 */       return this.style.isFillVertical();
/*     */     }
/*  77 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void formWillActivate() {
/*  83 */     super.formWillActivate();
/*  84 */     getStyleManager().willActivate(this.style);
/*     */   }
/*     */ 
/*     */   
/*     */   public void formActivated() {
/*  89 */     super.formActivated();
/*  90 */     getStyleManager().activated(this.style);
/*     */   }
/*     */ 
/*     */   
/*     */   public void formDeactivated() {
/*  95 */     super.formDeactivated();
/*  96 */     getStyleManager().deactivated(this.style);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonEnabled(ControlButtonType controlButtonType, boolean enabled) {
/* 101 */     this.style.setControlButtonEnabled(controlButtonType, enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonVisible(ControlButtonType controlButtonType, boolean visible) {
/* 106 */     this.style.setControlButtonVisible(controlButtonType, visible);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonText(ControlButtonType controlButtonType, String text) {
/* 111 */     this.style.setControlButtonText(controlButtonType, text);
/*     */   }
/*     */ 
/*     */   
/*     */   public void focusControlButton(ControlButtonType controlButtonType) {
/* 116 */     this.style.focusControlButton(controlButtonType);
/*     */   }
/*     */ 
/*     */   
/*     */   public void migrateIds(Map<String, String> oldIdToNewId) {
/* 121 */     super.migrateIds(oldIdToNewId);
/*     */     
/* 123 */     String newId = oldIdToNewId.get(getStyleId());
/* 124 */     if (newId != null) {
/* 125 */       setStyleId(newId);
/* 126 */       this.style = null;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\styles\NestedStyleComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */