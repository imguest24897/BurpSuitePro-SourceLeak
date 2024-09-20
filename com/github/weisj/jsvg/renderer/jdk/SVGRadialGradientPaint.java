/*     */ package com.github.weisj.jsvg.renderer.jdk;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.MultipleGradientPaint;
/*     */ import java.awt.PaintContext;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.Point2D;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.awt.image.ColorModel;
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
/*     */ public final class SVGRadialGradientPaint
/*     */   extends SVGMultipleGradientPaint
/*     */ {
/*     */   @NotNull
/*     */   private final Point2D focus;
/*     */   @NotNull
/*     */   private final Point2D center;
/*     */   private final float radius;
/*     */   private final float focusRadius;
/*     */   
/*     */   public SVGRadialGradientPaint(@NotNull Point2D center, float radius, @NotNull Point2D focus, float focusRadius, float[] fractions, Color[] colors, MultipleGradientPaint.CycleMethod cycleMethod, MultipleGradientPaint.ColorSpaceType colorSpace, @NotNull AffineTransform gradientTransform) {
/* 221 */     super(fractions, colors, cycleMethod, colorSpace, gradientTransform);
/*     */     
/* 223 */     if (radius <= 0.0F) {
/* 224 */       throw new IllegalArgumentException("Radius must be greater than zero");
/*     */     }
/*     */     
/* 227 */     if (focusRadius < 0.0F) {
/* 228 */       throw new IllegalArgumentException("Radius must be greater than zero");
/*     */     }
/*     */ 
/*     */     
/* 232 */     this.center = new Point2D.Double(center.getX(), center.getY());
/* 233 */     this.focus = new Point2D.Double(focus.getX(), focus.getY());
/* 234 */     this.radius = radius;
/* 235 */     this.focusRadius = focusRadius;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds, AffineTransform transform, RenderingHints hints) {
/* 245 */     transform = new AffineTransform(transform);
/*     */     
/* 247 */     transform.concatenate(this.gradientTransform);
/*     */     
/* 249 */     return new SVGRadialGradientPaintContext(this, transform, 
/* 250 */         (float)this.center.getX(), (float)this.center.getY(), this.radius, 
/* 251 */         (float)this.focus.getX(), (float)this.focus.getY(), this.focusRadius, this.fractions, this.colors, this.cycleMethod, this.colorSpace);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\renderer\jdk\SVGRadialGradientPaint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */