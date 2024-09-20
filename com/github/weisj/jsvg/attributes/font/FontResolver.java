/*     */ package com.github.weisj.jsvg.attributes.font;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.google.errorprone.annotations.Immutable;
/*     */ import java.awt.Font;
/*     */ import java.awt.GraphicsEnvironment;
/*     */ import java.awt.font.TextAttribute;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.text.AttributedCharacterIterator;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ public final class FontResolver
/*     */ {
/*     */   public static void clearFontCache() {
/*  40 */     FontCache.INSTANCE.cache.clear();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static SVGFont resolve(@NotNull MeasurableFontSpec fontSpec, @NotNull MeasureContext measureContext) {
/*  45 */     FontCache.CacheKey key = new FontCache.CacheKey(fontSpec, measureContext);
/*  46 */     SVGFont cachedFont = (SVGFont)FontCache.INSTANCE.cache.get(key);
/*  47 */     if (cachedFont != null) return cachedFont; 
/*  48 */     SVGFont resolvedFont = resolveWithoutCache(fontSpec, measureContext);
/*  49 */     FontCache.INSTANCE.cache.put(key, resolvedFont);
/*  50 */     return resolvedFont;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static SVGFont resolveWithoutCache(@NotNull MeasurableFontSpec fontSpec, @NotNull MeasureContext measureContext) {
/*  55 */     String family = findSupportedFontFamily(fontSpec);
/*     */     
/*  57 */     FontStyle style = fontSpec.style();
/*     */     
/*  59 */     float weight = cssWeightToAwtWeight(fontSpec.currentWeight());
/*  60 */     float size = fontSpec.effectiveSize(measureContext);
/*  61 */     float stretch = fontSpec.stretch();
/*     */     
/*  63 */     Map<AttributedCharacterIterator.Attribute, Object> attributes = new HashMap<>(5, 1.0F);
/*  64 */     attributes.put(TextAttribute.FAMILY, family);
/*  65 */     attributes.put(TextAttribute.SIZE, Float.valueOf(size));
/*  66 */     attributes.put(TextAttribute.WEIGHT, Float.valueOf(weight));
/*  67 */     attributes.put(TextAttribute.WIDTH, Float.valueOf(stretch));
/*     */ 
/*     */     
/*  70 */     if (style instanceof FontStyle.Normal) {
/*  71 */       attributes.put(TextAttribute.POSTURE, TextAttribute.POSTURE_REGULAR);
/*  72 */     } else if (style instanceof FontStyle.Italic) {
/*  73 */       attributes.put(TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE);
/*     */     } else {
/*  75 */       AffineTransform transform = style.transform();
/*  76 */       if (transform != null) attributes.put(TextAttribute.TRANSFORM, transform);
/*     */     
/*     */     } 
/*  79 */     Font font = new Font(attributes);
/*  80 */     return new AWTSVGFont(font);
/*     */   }
/*     */   
/*     */   private static float cssWeightToAwtWeight(float weight) {
/*  84 */     int normalWeight = 400;
/*  85 */     float currentWeight = weight;
/*  86 */     if (currentWeight > normalWeight) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  91 */       float awtWeightCompensationFactor = TextAttribute.WEIGHT_BOLD.floatValue() * normalWeight / 700.0F;
/*  92 */       currentWeight *= awtWeightCompensationFactor;
/*     */     } 
/*  94 */     return currentWeight / normalWeight;
/*     */   }
/*     */   @NotNull
/*     */   private static String findSupportedFontFamily(@NotNull MeasurableFontSpec fontSpec) {
/*  98 */     String[] families = fontSpec.families();
/*  99 */     for (String family : families) {
/* 100 */       if (FontFamiliesCache.INSTANCE.isSupportedFontFamily(family)) return family; 
/*     */     } 
/* 102 */     return "Default";
/*     */   }
/*     */   @NotNull
/*     */   public static List<String> supportedFonts() {
/* 106 */     return Collections.unmodifiableList(Arrays.asList(FontFamiliesCache.INSTANCE.supportedFonts));
/*     */   }
/*     */   
/*     */   private enum FontFamiliesCache
/*     */   {
/* 111 */     INSTANCE;
/*     */     @NotNull
/*     */     private final String[] supportedFonts;
/*     */     
/*     */     FontFamiliesCache() {
/* 116 */       this.supportedFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
/*     */     }
/*     */     
/*     */     boolean isSupportedFontFamily(@NotNull String fontName) {
/* 120 */       for (String supportedFont : this.supportedFonts) {
/* 121 */         if (supportedFont.equalsIgnoreCase(fontName)) return true; 
/*     */       } 
/* 123 */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   private enum FontCache
/*     */   {
/* 129 */     INSTANCE; private final HashMap<CacheKey, SVGFont> cache;
/*     */     FontCache() {
/* 131 */       this.cache = new HashMap<>();
/*     */     }
/*     */     @Immutable
/*     */     private static final class CacheKey { @NotNull
/*     */       private final MeasurableFontSpec spec; @NotNull
/*     */       private final MeasureContext context;
/*     */       
/*     */       private CacheKey(@NotNull MeasurableFontSpec spec, @NotNull MeasureContext context) {
/* 139 */         this.spec = spec;
/* 140 */         this.context = context;
/*     */       }
/*     */ 
/*     */       
/*     */       public String toString() {
/* 145 */         return "CacheKey{spec=" + this.spec + ", context=" + this.context + '}';
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public boolean equals(Object o) {
/* 153 */         if (this == o) return true; 
/* 154 */         if (!(o instanceof CacheKey)) return false; 
/* 155 */         CacheKey cacheKey = (CacheKey)o;
/* 156 */         return (this.spec.equals(cacheKey.spec) && this.context.equals(cacheKey.context));
/*     */       }
/*     */       
/*     */       public int hashCode()
/*     */       {
/* 161 */         return Objects.hash(new Object[] { this.spec, this.context }); } } } @Immutable private static final class CacheKey { public int hashCode() { return Objects.hash(new Object[] { this.spec, this.context }); }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     private final MeasurableFontSpec spec;
/*     */     @NotNull
/*     */     private final MeasureContext context;
/*     */     
/*     */     private CacheKey(@NotNull MeasurableFontSpec spec, @NotNull MeasureContext context) {
/*     */       this.spec = spec;
/*     */       this.context = context;
/*     */     }
/*     */     
/*     */     public String toString() {
/*     */       return "CacheKey{spec=" + this.spec + ", context=" + this.context + '}';
/*     */     }
/*     */     
/*     */     public boolean equals(Object o) {
/*     */       if (this == o)
/*     */         return true; 
/*     */       if (!(o instanceof CacheKey))
/*     */         return false; 
/*     */       CacheKey cacheKey = (CacheKey)o;
/*     */       return (this.spec.equals(cacheKey.spec) && this.context.equals(cacheKey.context));
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\font\FontResolver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */