/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.util.HyperlinkLabel;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.util.Objects;
/*     */ import javax.swing.AbstractAction;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class HyperlinkLabelComponent extends LeadingLabelComponent implements LinkLabelContainer {
/*     */   private String hyperlinkText;
/*  22 */   private Color linkLabelColor = null; private String url;
/*  23 */   private Color linkLabelActiveColor = null;
/*  24 */   private Font linkLabelFont = null;
/*  25 */   private FontType linkLabelFontType = FontType.DEFAULT;
/*  26 */   private FontStyle linkLabelFontStyle = FontStyle.UNCHANGED;
/*  27 */   private int linkLabelFontSizePercent = 100;
/*     */   
/*     */   private HyperlinkLabel linkLabel;
/*     */ 
/*     */   
/*     */   public String getHyperlinkText() {
/*  33 */     return replaceVariables(replaceFormVariables(this.hyperlinkText, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setHyperlinkText(String hyperlinkText) {
/*  37 */     this.hyperlinkText = hyperlinkText;
/*     */   }
/*     */   
/*     */   public String getUrl() {
/*  41 */     return replaceVariables(replaceFormVariables(this.url));
/*     */   }
/*     */   
/*     */   public void setUrl(String url) {
/*  45 */     this.url = url;
/*     */   }
/*     */ 
/*     */   
/*     */   public Color getLinkLabelColor() {
/*  50 */     return (Color)replaceWithTextOverride("linkLabelColor", this.linkLabelColor, Color.class);
/*     */   }
/*     */   
/*     */   public void setLinkLabelColor(Color linkLabelColor) {
/*  54 */     this.linkLabelColor = linkLabelColor;
/*     */   }
/*     */ 
/*     */   
/*     */   public Color getLinkLabelActiveColor() {
/*  59 */     return (Color)replaceWithTextOverride("linkLabelActiveColor", this.linkLabelActiveColor, Color.class);
/*     */   }
/*     */   
/*     */   public void setLinkLabelActiveColor(Color linkLabelActiveColor) {
/*  63 */     this.linkLabelActiveColor = linkLabelActiveColor;
/*     */   }
/*     */ 
/*     */   
/*     */   public Font getLinkLabelFont() {
/*  68 */     return (Font)replaceWithTextOverride("linkLabelFont", this.linkLabelFont, Font.class);
/*     */   }
/*     */   
/*     */   public void setLinkLabelFont(Font linkLabelFont) {
/*  72 */     this.linkLabelFont = linkLabelFont;
/*     */   }
/*     */ 
/*     */   
/*     */   public FontType getLinkLabelFontType() {
/*  77 */     return (FontType)replaceWithTextOverride("linkLabelFontType", this.linkLabelFontType, FontType.class);
/*     */   }
/*     */   
/*     */   public void setLinkLabelFontType(FontType linkLabelFontType) {
/*  81 */     this.linkLabelFontType = linkLabelFontType;
/*     */   }
/*     */ 
/*     */   
/*     */   public FontStyle getLinkLabelFontStyle() {
/*  86 */     return (FontStyle)replaceWithTextOverride("linkLabelFontStyle", this.linkLabelFontStyle, FontStyle.class);
/*     */   }
/*     */   
/*     */   public void setLinkLabelFontStyle(FontStyle linkLabelFontStyle) {
/*  90 */     this.linkLabelFontStyle = linkLabelFontStyle;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLinkLabelFontSizePercent() {
/*  95 */     return replaceWithTextOverride("linkLabelFontSizePercent", this.linkLabelFontSizePercent);
/*     */   }
/*     */   
/*     */   public void setLinkLabelFontSizePercent(int linkLabelFontSizePercent) {
/*  99 */     this.linkLabelFontSizePercent = linkLabelFontSizePercent;
/*     */   }
/*     */ 
/*     */   
/*     */   public void initialize() {
/* 104 */     super.initialize();
/* 105 */     initializeLinkLabel(this.linkLabel, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 110 */     super.setFormEnvironment(formEnvironment);
/* 111 */     if (this.linkLabel != null && formEnvironment != null) {
/* 112 */       this.linkLabel.setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/* 118 */     this.linkLabel = new HyperlinkLabel(new AbstractAction()
/*     */         {
/*     */           public void actionPerformed(ActionEvent actionEvent) {
/* 121 */             HyperlinkLabelComponent.this.doHyperlink();
/*     */           }
/*     */         });
/* 124 */     return (JComponent)this.linkLabel;
/*     */   }
/*     */   
/*     */   private void doHyperlink() {
/* 128 */     if (getFormEnvironment().isDesignTime()) {
/*     */       return;
/*     */     }
/* 131 */     String url = getUrl();
/* 132 */     if (url.length() == 0) {
/*     */       return;
/*     */     }
/*     */     try {
/* 136 */       URL realUrl = new URL(url);
/* 137 */       Util.showUrl(realUrl);
/* 138 */     } catch (MalformedURLException e) {
/* 139 */       Util.showErrorMessage(Messages.formatString(".InvalidUrl", new Object[] { url }));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 145 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/* 150 */     return this.linkLabel;
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/* 155 */     return JLabel.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) {
/* 160 */     String url = getUrl();
/* 161 */     String hyperlinkText = getHyperlinkText();
/* 162 */     if (hyperlinkText != null && !Objects.equals(hyperlinkText, url)) {
/* 163 */       console.println(hyperlinkText + " " + url);
/*     */     } else {
/* 165 */       console.println(url);
/*     */     } 
/* 167 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\HyperlinkLabelComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */