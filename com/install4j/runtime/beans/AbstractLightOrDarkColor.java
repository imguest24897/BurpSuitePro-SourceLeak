/*     */ package com.install4j.runtime.beans;
/*     */ import com.install4j.api.UiUtil;
/*     */ import java.awt.Color;
/*     */ import java.awt.PaintContext;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.color.ColorSpace;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.awt.image.ColorModel;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public abstract class AbstractLightOrDarkColor extends Color {
/*  14 */   public static final Color TRANSPARENT = new Color(0, 0, 0, 0);
/*     */   
/*     */   @NotNull
/*     */   protected static Color nullToTransparent(Color color) {
/*  18 */     if (color != null) {
/*  19 */       return color;
/*     */     }
/*  21 */     return TRANSPARENT;
/*     */   }
/*     */ 
/*     */   
/*     */   public AbstractLightOrDarkColor() {
/*  26 */     super(0);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public abstract Color getLightColor();
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public abstract Color getDarkColor();
/*     */ 
/*     */   
/*     */   public int getRed() {
/*  39 */     return isDark() ? getDarkColor().getRed() : getLightColor().getRed();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getGreen() {
/*  44 */     return isDark() ? getDarkColor().getGreen() : getLightColor().getGreen();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getBlue() {
/*  49 */     return isDark() ? getDarkColor().getBlue() : getLightColor().getBlue();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getAlpha() {
/*  54 */     return isDark() ? getDarkColor().getAlpha() : getLightColor().getAlpha();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getRGB() {
/*  59 */     return isDark() ? getDarkColor().getRGB() : getLightColor().getRGB();
/*     */   }
/*     */ 
/*     */   
/*     */   public float[] getRGBComponents(float[] compArray) {
/*  64 */     return isDark() ? getDarkColor().getRGBComponents(compArray) : getLightColor().getRGBComponents(compArray);
/*     */   }
/*     */ 
/*     */   
/*     */   public float[] getRGBColorComponents(float[] compArray) {
/*  69 */     return isDark() ? getDarkColor().getRGBColorComponents(compArray) : getLightColor().getRGBColorComponents(compArray);
/*     */   }
/*     */ 
/*     */   
/*     */   public float[] getComponents(float[] compArray) {
/*  74 */     return isDark() ? getDarkColor().getComponents(compArray) : getLightColor().getComponents(compArray);
/*     */   }
/*     */ 
/*     */   
/*     */   public float[] getColorComponents(float[] compArray) {
/*  79 */     return isDark() ? getDarkColor().getColorComponents(compArray) : getLightColor().getColorComponents(compArray);
/*     */   }
/*     */ 
/*     */   
/*     */   public float[] getComponents(ColorSpace cspace, float[] compArray) {
/*  84 */     return isDark() ? getDarkColor().getComponents(cspace, compArray) : getLightColor().getComponents(cspace, compArray);
/*     */   }
/*     */ 
/*     */   
/*     */   public float[] getColorComponents(ColorSpace cspace, float[] compArray) {
/*  89 */     return isDark() ? getDarkColor().getColorComponents(cspace, compArray) : getLightColor().getColorComponents(cspace, compArray);
/*     */   }
/*     */ 
/*     */   
/*     */   public ColorSpace getColorSpace() {
/*  94 */     return isDark() ? getDarkColor().getColorSpace() : getLightColor().getColorSpace();
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized PaintContext createContext(ColorModel cm, Rectangle r, Rectangle2D r2d, AffineTransform xform, RenderingHints hints) {
/*  99 */     return isDark() ? getDarkColor().createContext(cm, r, r2d, xform, hints) : getLightColor().createContext(cm, r, r2d, xform, hints);
/*     */   }
/*     */ 
/*     */   
/*     */   public int getTransparency() {
/* 104 */     return isDark() ? getDarkColor().getTransparency() : getLightColor().getTransparency();
/*     */   }
/*     */   
/*     */   private boolean isDark() {
/* 108 */     return UiUtil.isDarkUi();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\AbstractLightOrDarkColor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */