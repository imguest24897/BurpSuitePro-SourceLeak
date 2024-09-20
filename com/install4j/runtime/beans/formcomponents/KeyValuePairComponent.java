/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.beans.AllowDirectFieldAccess;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class KeyValuePairComponent extends LeadingLabelComponent {
/*  13 */   private String valueLabelText = "";
/*  14 */   private ExternalFile valueLabelIconFile = null;
/*  15 */   private int valueIconTextGap = 4;
/*  16 */   private Color valueLabelColor = null;
/*  17 */   private Font valueLabelFont = null;
/*  18 */   private FontType valueLabelFontType = FontType.DEFAULT;
/*  19 */   private FontStyle valueLabelFontStyle = FontStyle.UNCHANGED;
/*  20 */   private int valueLabelFontSizePercent = 100;
/*     */   
/*     */   private JLabel valueLabel;
/*     */   
/*     */   public String getValueLabelText() {
/*  25 */     return replaceVariables(this.valueLabelText);
/*     */   }
/*     */   
/*     */   public void setValueLabelText(String valueLabelText) {
/*  29 */     this.valueLabelText = valueLabelText;
/*     */   }
/*     */   
/*     */   public ExternalFile getValueLabelIconFile() {
/*  33 */     return (ExternalFile)replaceWithTextOverride("valueLabelIconFile", this.valueLabelIconFile, ExternalFile.class);
/*     */   }
/*     */   
/*     */   public void setValueLabelIconFile(ExternalFile valueLabelIconFile) {
/*  37 */     this.valueLabelIconFile = valueLabelIconFile;
/*     */   }
/*     */   
/*     */   public int getValueIconTextGap() {
/*  41 */     return replaceWithTextOverride("valueIconTextGap", this.valueIconTextGap);
/*     */   }
/*     */   
/*     */   public void setValueIconTextGap(int valueIconTextGap) {
/*  45 */     this.valueIconTextGap = valueIconTextGap;
/*     */   }
/*     */   
/*     */   public Color getValueLabelColor() {
/*  49 */     return (Color)replaceWithTextOverride("valueLabelColor", this.valueLabelColor, Color.class);
/*     */   }
/*     */   
/*     */   public void setValueLabelColor(Color valueLabelColor) {
/*  53 */     this.valueLabelColor = valueLabelColor;
/*     */   }
/*     */   
/*     */   public Font getValueLabelFont() {
/*  57 */     return (Font)replaceWithTextOverride("valueLabelFont", this.valueLabelFont, Font.class);
/*     */   }
/*     */   
/*     */   public void setValueLabelFont(Font valueLabelFont) {
/*  61 */     this.valueLabelFont = valueLabelFont;
/*     */   }
/*     */   
/*     */   public FontType getValueLabelFontType() {
/*  65 */     return (FontType)replaceWithTextOverride("valueLabelFontType", this.valueLabelFontType, FontType.class);
/*     */   }
/*     */   
/*     */   public void setValueLabelFontType(FontType valueLabelFontType) {
/*  69 */     this.valueLabelFontType = valueLabelFontType;
/*     */   }
/*     */   
/*     */   public FontStyle getValueLabelFontStyle() {
/*  73 */     return (FontStyle)replaceWithTextOverride("valueLabelFontStyle", this.valueLabelFontStyle, FontStyle.class);
/*     */   }
/*     */   
/*     */   public void setValueLabelFontStyle(FontStyle valueLabelFontStyle) {
/*  77 */     this.valueLabelFontStyle = valueLabelFontStyle;
/*     */   }
/*     */   
/*     */   public int getValueLabelFontSizePercent() {
/*  81 */     return replaceWithTextOverride("valueLabelFontSizePercent", this.valueLabelFontSizePercent);
/*     */   }
/*     */   
/*     */   public void setValueLabelFontSizePercent(int valueLabelFontSizePercent) {
/*  85 */     this.valueLabelFontSizePercent = valueLabelFontSizePercent;
/*     */   }
/*     */ 
/*     */   
/*     */   public void initialize() {
/*  90 */     super.initialize();
/*  91 */     initializeLabel(this.valueLabel, getRawValueLabelText());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/*  96 */     super.setFormEnvironment(formEnvironment);
/*  97 */     if (this.valueLabel != null && formEnvironment != null) {
/*  98 */       this.valueLabel.setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/* 104 */     this.valueLabel = createLabel(getRawValueLabelText(), getValueLabelIconFile(), getValueIconTextGap(), getValueLabelColor(), getValueLabelFont(), getValueLabelFontType(), getValueLabelFontStyle(), getValueLabelFontSizePercent());
/* 105 */     return this.valueLabel;
/*     */   }
/*     */   
/*     */   @AllowDirectFieldAccess
/*     */   private String getRawValueLabelText() {
/* 110 */     return this.valueLabelText;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 115 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/* 120 */     return this.valueLabel;
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/* 125 */     return JLabel.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) {
/* 130 */     console.print(getLabel().getText() + " ");
/* 131 */     console.println(this.valueLabel.getText() + " ");
/* 132 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasUserInput() {
/* 137 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\KeyValuePairComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */