/*     */ package com.github.weisj.jsvg.nodes.filter;
/*     */ 
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.geom.Point2D;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.BufferedImageOp;
/*     */ import java.awt.image.ColorModel;
/*     */ import java.awt.image.ConvolveOp;
/*     */ import java.awt.image.Raster;
/*     */ import java.awt.image.RasterOp;
/*     */ import java.awt.image.WritableRaster;
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
/*     */ final class MultiConvolveOp
/*     */   implements BufferedImageOp, RasterOp
/*     */ {
/*     */   @NotNull
/*     */   private final ConvolveOp[] ops;
/*     */   @NotNull
/*     */   private final ConvolveOp op;
/*     */   
/*     */   public MultiConvolveOp(@NotNull ConvolveOp[] ops) {
/*  37 */     if (ops.length == 0) throw new IllegalStateException("Must supply at least one op"); 
/*  38 */     this.ops = ops;
/*  39 */     this.op = ops[0];
/*     */   }
/*     */ 
/*     */   
/*     */   public BufferedImage filter(BufferedImage src, BufferedImage dest) {
/*  44 */     BufferedImage result1 = this.op.filter(src, dest);
/*  45 */     if (this.ops.length == 1) return result1; 
/*  46 */     BufferedImage result2 = this.ops[1].filter(result1, (BufferedImage)null);
/*  47 */     BufferedImage r = result2;
/*  48 */     for (int i = 2; i < this.ops.length; i++) {
/*  49 */       result1 = this.ops[1].filter(result2, result1);
/*  50 */       r = result1;
/*  51 */       result1 = result2;
/*  52 */       result2 = r;
/*     */     } 
/*  54 */     return r;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public WritableRaster filter(Raster src, WritableRaster dest) {
/*  60 */     WritableRaster result1 = this.op.filter(src, dest);
/*  61 */     if (this.ops.length == 1) return result1; 
/*  62 */     WritableRaster result2 = this.ops[1].filter(result1, (WritableRaster)null);
/*  63 */     WritableRaster r = result2;
/*  64 */     for (int i = 2; i < this.ops.length; i++) {
/*  65 */       result1 = this.ops[1].filter(result2, result1);
/*  66 */       r = result1;
/*  67 */       result1 = result2;
/*  68 */       result2 = r;
/*     */     } 
/*  70 */     return r;
/*     */   }
/*     */ 
/*     */   
/*     */   public BufferedImage createCompatibleDestImage(BufferedImage src, ColorModel destCM) {
/*  75 */     return this.op.createCompatibleDestImage(src, destCM);
/*     */   }
/*     */ 
/*     */   
/*     */   public WritableRaster createCompatibleDestRaster(Raster src) {
/*  80 */     return this.op.createCompatibleDestRaster(src);
/*     */   }
/*     */ 
/*     */   
/*     */   public Rectangle2D getBounds2D(@NotNull BufferedImage src) {
/*  85 */     return this.op.getBounds2D(src);
/*     */   }
/*     */ 
/*     */   
/*     */   public Rectangle2D getBounds2D(@NotNull Raster src) {
/*  90 */     return this.op.getBounds2D(src);
/*     */   }
/*     */ 
/*     */   
/*     */   public Point2D getPoint2D(Point2D srcPt, Point2D dstPt) {
/*  95 */     return this.op.getPoint2D(srcPt, dstPt);
/*     */   }
/*     */ 
/*     */   
/*     */   public RenderingHints getRenderingHints() {
/* 100 */     return this.op.getRenderingHints();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\MultiConvolveOp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */