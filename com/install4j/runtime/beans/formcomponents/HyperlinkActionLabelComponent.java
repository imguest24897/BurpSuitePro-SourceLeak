/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.util.HyperlinkLabel;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import javax.swing.AbstractAction;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class HyperlinkActionLabelComponent extends ActionComponent implements LinkLabelContainer {
/*  17 */   private Color linkLabelColor = null; private String hyperlinkText;
/*  18 */   private Color linkLabelActiveColor = null;
/*  19 */   private Font linkLabelFont = null;
/*  20 */   private FontType linkLabelFontType = FontType.DEFAULT;
/*  21 */   private FontStyle linkLabelFontStyle = FontStyle.UNCHANGED;
/*  22 */   private int linkLabelFontSizePercent = 100;
/*     */   
/*     */   private HyperlinkLabel linkLabel;
/*     */ 
/*     */   
/*     */   public String getHyperlinkText() {
/*  28 */     return replaceVariables(replaceFormVariables(this.hyperlinkText, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setHyperlinkText(String hyperlinkText) {
/*  32 */     this.hyperlinkText = hyperlinkText;
/*     */   }
/*     */ 
/*     */   
/*     */   public Color getLinkLabelColor() {
/*  37 */     return (Color)replaceWithTextOverride("linkLabelColor", this.linkLabelColor, Color.class);
/*     */   }
/*     */   
/*     */   public void setLinkLabelColor(Color linkLabelColor) {
/*  41 */     this.linkLabelColor = linkLabelColor;
/*     */   }
/*     */ 
/*     */   
/*     */   public Color getLinkLabelActiveColor() {
/*  46 */     return (Color)replaceWithTextOverride("linkLabelActiveColor", this.linkLabelActiveColor, Color.class);
/*     */   }
/*     */   
/*     */   public void setLinkLabelActiveColor(Color linkLabelActiveColor) {
/*  50 */     this.linkLabelActiveColor = linkLabelActiveColor;
/*     */   }
/*     */ 
/*     */   
/*     */   public Font getLinkLabelFont() {
/*  55 */     return (Font)replaceWithTextOverride("linkLabelFont", this.linkLabelFont, Font.class);
/*     */   }
/*     */   
/*     */   public void setLinkLabelFont(Font linkLabelFont) {
/*  59 */     this.linkLabelFont = linkLabelFont;
/*     */   }
/*     */ 
/*     */   
/*     */   public FontType getLinkLabelFontType() {
/*  64 */     return (FontType)replaceWithTextOverride("linkLabelFontType", this.linkLabelFontType, FontType.class);
/*     */   }
/*     */   
/*     */   public void setLinkLabelFontType(FontType linkLabelFontType) {
/*  68 */     this.linkLabelFontType = linkLabelFontType;
/*     */   }
/*     */ 
/*     */   
/*     */   public FontStyle getLinkLabelFontStyle() {
/*  73 */     return (FontStyle)replaceWithTextOverride("linkLabelFontStyle", this.linkLabelFontStyle, FontStyle.class);
/*     */   }
/*     */   
/*     */   public void setLinkLabelFontStyle(FontStyle linkLabelFontStyle) {
/*  77 */     this.linkLabelFontStyle = linkLabelFontStyle;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLinkLabelFontSizePercent() {
/*  82 */     return replaceWithTextOverride("linkLabelFontSizePercent", this.linkLabelFontSizePercent);
/*     */   }
/*     */   
/*     */   public void setLinkLabelFontSizePercent(int linkLabelFontSizePercent) {
/*  86 */     this.linkLabelFontSizePercent = linkLabelFontSizePercent;
/*     */   }
/*     */ 
/*     */   
/*     */   public void initialize() {
/*  91 */     super.initialize();
/*  92 */     initializeLinkLabel(this.linkLabel, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/*  97 */     super.setFormEnvironment(formEnvironment);
/*  98 */     if (this.linkLabel != null && formEnvironment != null) {
/*  99 */       this.linkLabel.setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/* 105 */     this.linkLabel = new HyperlinkLabel(new AbstractAction()
/*     */         {
/*     */           public void actionPerformed(ActionEvent actionEvent) {
/* 108 */             HyperlinkActionLabelComponent.this.executeAction();
/*     */           }
/*     */         });
/* 111 */     return (JComponent)this.linkLabel;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 116 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/* 121 */     return this.linkLabel;
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/* 126 */     return JLabel.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 131 */     String labelText = getLabelText();
/* 132 */     if (labelText.length() > 0) {
/* 133 */       console.println(labelText);
/*     */     }
/* 135 */     if (console.askYesNo(replaceFormVariables(getHyperlinkText(), VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE), false)) {
/* 136 */       executeAction();
/*     */     }
/* 138 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\HyperlinkActionLabelComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */