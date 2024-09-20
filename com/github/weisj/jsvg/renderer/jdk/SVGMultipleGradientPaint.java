/*     */ package com.github.weisj.jsvg.renderer.jdk;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.MultipleGradientPaint;
/*     */ import java.awt.Paint;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.image.ColorModel;
/*     */ import java.lang.ref.SoftReference;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class SVGMultipleGradientPaint
/*     */   implements Paint
/*     */ {
/*     */   final int transparency;
/*     */   final float[] fractions;
/*     */   @NotNull
/*     */   final Color[] colors;
/*     */   @NotNull
/*     */   final AffineTransform gradientTransform;
/*     */   @NotNull
/*     */   final MultipleGradientPaint.CycleMethod cycleMethod;
/*     */   @NotNull
/*     */   final MultipleGradientPaint.ColorSpaceType colorSpace;
/*     */   ColorModel model;
/*     */   float[] normalizedIntervals;
/*     */   boolean isSimpleLookup;
/*     */   SoftReference<int[][]> gradients;
/*     */   SoftReference<int[]> gradient;
/*     */   int fastGradientArraySize;
/*     */   
/*     */   SVGMultipleGradientPaint(float[] fractions, @NotNull Color[] colors, @NotNull MultipleGradientPaint.CycleMethod cycleMethod, @NotNull MultipleGradientPaint.ColorSpaceType colorSpace, @NotNull AffineTransform gradientTransform) {
/* 123 */     if (fractions.length != colors.length) {
/* 124 */       throw new IllegalArgumentException("Colors and fractions must have equal size");
/*     */     }
/*     */     
/* 127 */     if (colors.length < 2) {
/* 128 */       throw new IllegalArgumentException("User must specify at least 2 colors");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 133 */     float previousFraction = -1.0F;
/* 134 */     for (float currentFraction : fractions) {
/* 135 */       if (currentFraction < 0.0F || currentFraction > 1.0F) {
/* 136 */         throw new IllegalArgumentException("Fraction values must be in the range 0 to 1: " + currentFraction);
/*     */       }
/*     */       
/* 139 */       if (currentFraction <= previousFraction) {
/* 140 */         throw new IllegalArgumentException("Keyframe fractions must be increasing: " + currentFraction);
/*     */       }
/*     */       
/* 143 */       previousFraction = currentFraction;
/*     */     } 
/*     */     
/* 146 */     if (fractions[0] != 0.0F) {
/* 147 */       throw new IllegalStateException("Gradient start point must be equal to zero");
/*     */     }
/*     */     
/* 150 */     if (fractions[fractions.length - 1] != 1.0F) {
/* 151 */       throw new IllegalStateException("Gradient end point must be equal to one");
/*     */     }
/*     */     
/* 154 */     this.fractions = fractions;
/* 155 */     this.colors = colors;
/*     */ 
/*     */     
/* 158 */     this.colorSpace = colorSpace;
/* 159 */     this.cycleMethod = cycleMethod;
/*     */ 
/*     */     
/* 162 */     this.gradientTransform = gradientTransform;
/*     */ 
/*     */     
/* 165 */     boolean opaque = true;
/* 166 */     for (Color color : colors) {
/* 167 */       opaque = (opaque && color.getAlpha() == 255);
/*     */     }
/* 169 */     this.transparency = opaque ? 1 : 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getTransparency() {
/* 174 */     return this.transparency;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\renderer\jdk\SVGMultipleGradientPaint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */