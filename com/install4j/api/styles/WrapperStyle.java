/*     */ package com.install4j.api.styles;
/*     */ 
/*     */ import com.install4j.api.context.ControlButtonType;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import javax.swing.JComponent;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class WrapperStyle
/*     */   extends AbstractStyle
/*     */   implements NestedStyleContainer
/*     */ {
/*     */   private Style nestedStyle;
/*     */   
/*     */   protected abstract String getNestedStyleId();
/*     */   
/*     */   protected abstract JComponent createComponent(JComponent paramJComponent);
/*     */   
/*     */   public void setStyleContext(StyleContext styleContext) {
/*  45 */     initStyle();
/*  46 */     if (this.nestedStyle != null) {
/*  47 */       this.nestedStyle.setStyleContext(styleContext);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonEnabled(ControlButtonType controlButtonType, boolean enabled) {
/*  53 */     this.nestedStyle.setControlButtonEnabled(controlButtonType, enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonVisible(ControlButtonType controlButtonType, boolean visible) {
/*  58 */     this.nestedStyle.setControlButtonVisible(controlButtonType, visible);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonText(ControlButtonType controlButtonType, String text) {
/*  63 */     this.nestedStyle.setControlButtonText(controlButtonType, text);
/*     */   }
/*     */ 
/*     */   
/*     */   public void focusControlButton(ControlButtonType controlButtonType) {
/*  68 */     this.nestedStyle.focusControlButton(controlButtonType);
/*     */   }
/*     */ 
/*     */   
/*     */   public final JComponent createComponent() {
/*  73 */     initStyle();
/*  74 */     return createComponent(getStyleManager().createStyleComponent(this.nestedStyle));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillHorizontal() {
/*  79 */     if (this.nestedStyle != null) {
/*  80 */       return this.nestedStyle.isFillHorizontal();
/*     */     }
/*  82 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFillVertical() {
/*  88 */     if (this.nestedStyle != null) {
/*  89 */       return this.nestedStyle.isFillVertical();
/*     */     }
/*  91 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Collection<String> getNestedStyleIds() {
/*  97 */     return Collections.singleton(getNestedStyleId());
/*     */   }
/*     */ 
/*     */   
/*     */   public void willActivate() {
/* 102 */     super.willActivate();
/* 103 */     getStyleManager().willActivate(this.nestedStyle);
/*     */   }
/*     */ 
/*     */   
/*     */   public void activated() {
/* 108 */     super.activated();
/* 109 */     getStyleManager().activated(this.nestedStyle);
/*     */   }
/*     */ 
/*     */   
/*     */   public void deactivated() {
/* 114 */     super.deactivated();
/* 115 */     getStyleManager().deactivated(this.nestedStyle);
/*     */   }
/*     */   
/*     */   private void initStyle() {
/* 119 */     if (this.nestedStyle == null)
/* 120 */       this.nestedStyle = getStyleManager().cloneStyleById(getNestedStyleId()); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\styles\WrapperStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */