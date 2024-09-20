/*     */ package com.github.weisj.jsvg.attributes.font;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.parser.SeparatorMode;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ public final class FontParser
/*     */ {
/*     */   @NotNull
/*     */   public static AttributeFontSpec parseFontSpec(@NotNull AttributeNode node) {
/*  37 */     String[] fontFamilies = node.getStringList("font-family", SeparatorMode.COMMA_ONLY);
/*     */ 
/*     */     
/*  40 */     FontWeight weight = parseWeight(node);
/*  41 */     FontSize size = parseFontSize(node);
/*  42 */     Length sizeAdjust = parseSizeAdjust(node);
/*  43 */     FontStyle style = parseFontStyle(node);
/*  44 */     float stretch = parseStretch(node);
/*     */     
/*  46 */     return new AttributeFontSpec(fontFamilies, style, sizeAdjust, stretch, size, weight);
/*     */   }
/*     */   @Nullable
/*     */   public static FontWeight parseWeight(@NotNull AttributeNode node) {
/*  50 */     String fontWeightKey = "font-weight";
/*  51 */     FontWeight weight = (FontWeight)node.getEnum("font-weight", PredefinedFontWeight.Number);
/*  52 */     if (weight == PredefinedFontWeight.Number) {
/*  53 */       if (node.hasAttribute("font-weight")) {
/*     */         
/*  55 */         weight = new NumberFontWeight(Math.max(1.0F, Math.min(1000.0F, node.getFloat("font-weight", 400.0F))));
/*     */       } else {
/*     */         
/*  58 */         weight = null;
/*     */       } 
/*     */     }
/*  61 */     return weight;
/*     */   }
/*     */   
/*     */   public static float parseStretch(@NotNull AttributeNode node) {
/*  65 */     FontStretch stretch = (FontStretch)node.getEnum("font-stretch", FontStretch.Percentage);
/*  66 */     return (stretch == FontStretch.Percentage) ? 
/*  67 */       node.parser().parsePercentage(node.getValue("font-stretch"), Float.NaN, 0.5F, 2.0F) : 
/*     */       
/*  69 */       stretch.percentage();
/*     */   }
/*     */   @Nullable
/*     */   public static FontSize parseFontSize(@NotNull AttributeNode node) {
/*  73 */     FontSize fontSize = (FontSize)node.getEnum("font-size", PredefinedFontSize.Number);
/*  74 */     if (fontSize == PredefinedFontSize.Number) {
/*  75 */       Length size = node.getLength("font-size", Length.UNSPECIFIED);
/*     */ 
/*     */       
/*  78 */       fontSize = size.isSpecified() ? new LengthFontSize(size) : null;
/*     */     } 
/*  80 */     return fontSize;
/*     */   }
/*     */   @Nullable
/*     */   public static Length parseSizeAdjust(@NotNull AttributeNode node) {
/*  84 */     return node.getLength("font-size-adjust");
/*     */   }
/*     */   @Nullable
/*     */   public static FontStyle parseFontStyle(@NotNull AttributeNode node) {
/*  88 */     FontStyle style = null;
/*  89 */     String styleStr = node.getValue("font-style");
/*  90 */     if ("normal".equalsIgnoreCase(styleStr)) {
/*  91 */       style = FontStyle.normal();
/*  92 */     } else if ("italic".equalsIgnoreCase(styleStr)) {
/*  93 */       style = FontStyle.italic();
/*  94 */     } else if (styleStr != null && styleStr.startsWith("oblique")) {
/*  95 */       String[] comps = styleStr.split(" ", 2);
/*  96 */       if (comps.length == 2) {
/*     */         
/*  98 */         style = new FontStyle.Oblique(node.parser().parseAngle(comps[1], FontStyle.Oblique.DEFAULT_ANGLE));
/*     */       } else {
/* 100 */         style = FontStyle.oblique();
/*     */       } 
/*     */     } 
/* 103 */     return style;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\font\FontParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */