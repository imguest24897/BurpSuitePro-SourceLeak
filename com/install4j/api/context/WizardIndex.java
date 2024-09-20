/*     */ package com.install4j.api.context;
/*     */ 
/*     */ import com.install4j.api.beans.Anchor;
/*     */ import java.awt.Color;
/*     */ import java.io.File;
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
/*     */ public class WizardIndex
/*     */ {
/*     */   private String[] stepNames;
/*     */   private String[] keys;
/*     */   private boolean partiallyDefined;
/*  79 */   private int maxWidth = 300;
/*  80 */   private int minWidth = 120;
/*     */   private boolean numbered = true;
/*     */   private Color background;
/*     */   private Color foreground;
/*     */   private File backgroundImage;
/*  85 */   private Anchor backgroundImageAnchor = Anchor.SOUTHWEST;
/*     */ 
/*     */   
/*     */   private String initialKey;
/*     */ 
/*     */ 
/*     */   
/*     */   public WizardIndex(String[] stepNames) {
/*  93 */     this(stepNames, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WizardIndex(String[] stepNames, String[] keys) {
/* 102 */     if (stepNames == null || stepNames.length == 0) {
/* 103 */       throw new IllegalArgumentException("step names must have a length > 0");
/*     */     }
/* 105 */     this.stepNames = stepNames;
/* 106 */     if (keys == null) {
/* 107 */       keys = createKeys(stepNames);
/*     */     }
/* 109 */     if (keys.length != stepNames.length) {
/* 110 */       throw new IllegalArgumentException("step names and keys must have the same lengths");
/*     */     }
/* 112 */     this.keys = keys;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String[] getStepNames() {
/* 120 */     return this.stepNames;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String[] getKeys() {
/* 128 */     return this.keys;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isPartiallyDefined() {
/* 136 */     return this.partiallyDefined;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WizardIndex partiallyDefined(boolean partiallyDefined) {
/* 146 */     this.partiallyDefined = partiallyDefined;
/* 147 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxWidth() {
/* 155 */     return this.maxWidth;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WizardIndex maxWidth(int maxWidth) {
/* 164 */     this.maxWidth = maxWidth;
/* 165 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMinWidth() {
/* 173 */     return this.minWidth;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WizardIndex minWidth(int minWidth) {
/* 182 */     this.minWidth = minWidth;
/* 183 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isNumbered() {
/* 191 */     return this.numbered;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WizardIndex numbered(boolean numbered) {
/* 201 */     this.numbered = numbered;
/* 202 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Color getBackground() {
/* 210 */     return this.background;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WizardIndex background(Color background) {
/* 219 */     this.background = background;
/* 220 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Color getForeground() {
/* 228 */     return this.foreground;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WizardIndex foreground(Color foreground) {
/* 237 */     this.foreground = foreground;
/* 238 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public File getBackgroundImage() {
/* 246 */     return this.backgroundImage;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WizardIndex backgroundImage(File backgroundImage) {
/* 257 */     this.backgroundImage = backgroundImage;
/* 258 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Anchor getBackgroundImageAnchor() {
/* 266 */     return this.backgroundImageAnchor;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WizardIndex backgroundImageAnchor(Anchor anchor) {
/* 275 */     this.backgroundImageAnchor = anchor;
/* 276 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getInitialKey() {
/* 284 */     return (this.initialKey == null) ? this.keys[0] : this.initialKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WizardIndex initialKey(String initialKey) {
/* 293 */     this.initialKey = initialKey;
/* 294 */     return this;
/*     */   }
/*     */   
/*     */   private String[] createKeys(String[] stepNames) {
/* 298 */     String[] keys = new String[stepNames.length];
/* 299 */     for (int i = 0; i < stepNames.length; i++) {
/* 300 */       keys[i] = String.valueOf(i + 1);
/*     */     }
/* 302 */     return keys;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\WizardIndex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */