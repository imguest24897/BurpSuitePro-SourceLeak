/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.runtime.beans.AllowDirectFieldAccess;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import javax.swing.JComponent;
/*     */ 
/*     */ public abstract class AbstractLabelComponent
/*     */   extends SystemFormComponent {
/*     */   public static Font translateFont(Font font, JComponent component) {
/*  12 */     if (font.getSize() == 0) {
/*  13 */       return font.deriveFont(component.getFont().getSize());
/*     */     }
/*  15 */     return font;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  20 */   private String labelText = "";
/*  21 */   private Color labelColor = null;
/*  22 */   private Font labelFont = null;
/*  23 */   private FontType labelFontType = FontType.DEFAULT;
/*  24 */   private FontStyle labelFontStyle = FontStyle.UNCHANGED;
/*  25 */   private int labelFontSizePercent = 100;
/*     */   
/*     */   public String getLabelText() {
/*  28 */     return replaceVariables(replaceFormVariables(this.labelText, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   @AllowDirectFieldAccess
/*     */   protected String getRawLabelText() {
/*  33 */     return this.labelText;
/*     */   }
/*     */   
/*     */   public void setLabelText(String labelText) {
/*  37 */     this.labelText = labelText;
/*     */   }
/*     */   
/*     */   public Color getLabelColor() {
/*  41 */     return (Color)replaceWithTextOverride("labelColor", this.labelColor, Color.class);
/*     */   }
/*     */   
/*     */   public void setLabelColor(Color labelColor) {
/*  45 */     this.labelColor = labelColor;
/*     */   }
/*     */   
/*     */   public Font getLabelFont() {
/*  49 */     return (Font)replaceWithTextOverride("labelFont", this.labelFont, Font.class);
/*     */   }
/*     */   
/*     */   public void setLabelFont(Font labelFont) {
/*  53 */     this.labelFont = labelFont;
/*     */   }
/*     */   
/*     */   public FontType getLabelFontType() {
/*  57 */     return (FontType)replaceWithTextOverride("labelFontType", this.labelFontType, FontType.class);
/*     */   }
/*     */   
/*     */   public void setLabelFontType(FontType labelFontType) {
/*  61 */     this.labelFontType = labelFontType;
/*     */   }
/*     */   
/*     */   public FontStyle getLabelFontStyle() {
/*  65 */     return (FontStyle)replaceWithTextOverride("labelFontStyle", this.labelFontStyle, FontStyle.class);
/*     */   }
/*     */   
/*     */   public void setLabelFontStyle(FontStyle labelFontStyle) {
/*  69 */     this.labelFontStyle = labelFontStyle;
/*     */   }
/*     */   
/*     */   public int getLabelFontSizePercent() {
/*  73 */     return replaceWithTextOverride("labelFontSizePercent", this.labelFontSizePercent);
/*     */   }
/*     */   
/*     */   public void setLabelFontSizePercent(int labelFontSizePercent) {
/*  77 */     this.labelFontSizePercent = labelFontSizePercent;
/*     */   }
/*     */   
/*     */   protected void applyLabelColorAndFont(Color labelColor, Font labelFont, FontType fontType, FontStyle fontStyle, int fontSizePercent, JComponent label) {
/*  81 */     if (labelColor != null) {
/*  82 */       label.setForeground(labelColor);
/*     */     }
/*  84 */     applyFont(labelFont, fontType, fontStyle, fontSizePercent, label);
/*     */   }
/*     */   
/*     */   protected void applyFont(Font font, FontType fontType, FontStyle fontStyle, int fontSizePercent, JComponent component) {
/*  88 */     switch (fontType) {
/*     */       case DERIVED:
/*  90 */         component.setFont(deriveFont(component.getFont(), fontStyle, fontSizePercent));
/*     */         break;
/*     */       case CUSTOM:
/*  93 */         if (font != null) {
/*  94 */           component.setFont(translateFont(font, component));
/*     */         }
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private Font deriveFont(Font font, FontStyle fontStyle, int fontSizePercent) {
/* 101 */     if (fontStyle != FontStyle.UNCHANGED) {
/* 102 */       font = font.deriveFont(fontStyle.getStyle());
/*     */     }
/* 104 */     if (fontSizePercent != 100) {
/* 105 */       font = font.deriveFont(1.0F * Math.round(font.getSize2D() * fontSizePercent / 100.0F));
/*     */     }
/* 107 */     return font;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\AbstractLabelComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */