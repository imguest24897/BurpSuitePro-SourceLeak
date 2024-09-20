/*     */ package com.github.weisj.jsvg.renderer;
/*     */ 
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Paint;
/*     */ import java.awt.PaintContext;
/*     */ import java.awt.Point;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.Point2D;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.ColorConvertOp;
/*     */ import java.awt.image.ColorModel;
/*     */ import java.awt.image.ComponentColorModel;
/*     */ import java.awt.image.Raster;
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
/*     */ public final class MaskedPaint
/*     */   implements Paint, GraphicsUtil.WrappingPaint
/*     */ {
/*     */   @NotNull
/*     */   private Paint paint;
/*     */   @NotNull
/*     */   private final Raster maskRaster;
/*     */   @NotNull
/*     */   private final Point maskOffset;
/*     */   
/*     */   public MaskedPaint(@NotNull Paint paint, @NotNull Raster maskRaster, @NotNull Point2D maskOffset) {
/*  39 */     this.paint = paint;
/*  40 */     this.maskRaster = maskRaster;
/*  41 */     this.maskOffset = new Point((int)Math.floor(maskOffset.getX()), (int)Math.floor(maskOffset.getY()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPaint(@NotNull Paint paint) {
/*  46 */     this.paint = GraphicsUtil.setupPaint(this.paint, paint);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds, AffineTransform xform, RenderingHints hints) {
/*  52 */     PaintContext parentContext = this.paint.createContext(null, deviceBounds, userBounds, xform, hints);
/*  53 */     return new MaskPaintContext(parentContext, this.maskRaster, this.maskOffset);
/*     */   }
/*     */ 
/*     */   
/*     */   public int getTransparency() {
/*  58 */     return 3;
/*     */   }
/*     */   
/*     */   private static final class MaskPaintContext
/*     */     implements PaintContext
/*     */   {
/*     */     @NotNull
/*     */     private final PaintContext parentContext;
/*     */     @NotNull
/*     */     private final ColorModel colorModel;
/*     */     private final int numColorComponents;
/*     */     
/*     */     MaskPaintContext(@NotNull PaintContext parentContext, @NotNull Raster maskRaster, @NotNull Point offset) {
/*  71 */       this.parentContext = parentContext;
/*  72 */       this.parentColorModel = parentContext.getColorModel();
/*  73 */       this.maskRaster = maskRaster;
/*  74 */       this.offset = offset;
/*  75 */       if (parentContext.getColorModel().hasAlpha()) {
/*  76 */         this.colorModel = this.parentColorModel;
/*     */       } else {
/*  78 */         this
/*  79 */           .colorModel = new ComponentColorModel(parentContext.getColorModel().getColorSpace(), true, false, 1, 0);
/*     */       } 
/*  81 */       this.numColorComponents = this.colorModel.getNumColorComponents(); } @NotNull
/*     */     private final ColorModel parentColorModel; @NotNull
/*     */     private final Raster maskRaster; @NotNull
/*     */     private final Point offset; @NotNull
/*     */     public ColorModel getColorModel() {
/*  86 */       return this.colorModel;
/*     */     }
/*     */ 
/*     */     
/*     */     public void dispose() {
/*  91 */       this.parentContext.dispose();
/*     */     }
/*     */     
/*     */     public Raster getRaster(int x, int y, int w, int h) {
/*     */       WritableRaster result;
/*  96 */       Raster parentRaster = this.parentContext.getRaster(x, y, w, h);
/*     */       
/*  98 */       int parentMinX = parentRaster.getMinX();
/*  99 */       int parentMinY = parentRaster.getMinY();
/*     */ 
/*     */       
/* 102 */       if (parentRaster instanceof WritableRaster) {
/* 103 */         if (this.parentColorModel.equals(this.colorModel)) {
/* 104 */           result = parentRaster.createCompatibleWritableRaster();
/* 105 */           result.setDataElements(-parentMinX, -parentMinY, parentRaster);
/*     */         }
/*     */         else {
/*     */           
/* 109 */           BufferedImage parentImage = new BufferedImage(this.parentColorModel, (WritableRaster)parentRaster, this.parentColorModel.isAlphaPremultiplied(), null);
/* 110 */           result = Raster.createWritableRaster(this.colorModel
/* 111 */               .createCompatibleSampleModel(w, h), new Point(0, 0));
/* 112 */           BufferedImage resultImage = new BufferedImage(this.colorModel, result, false, null);
/* 113 */           Graphics graphics = resultImage.getGraphics();
/* 114 */           graphics.drawImage(parentImage, 0, 0, null);
/* 115 */           graphics.dispose();
/*     */         } 
/*     */       } else {
/* 118 */         result = Raster.createInterleavedRaster(0, w, h, 
/* 119 */             getColorModel().getNumComponents(), new Point(0, 0));
/*     */         
/* 121 */         ColorConvertOp colorConvertOp = new ColorConvertOp(this.parentColorModel.getColorSpace(), this.colorModel.getColorSpace(), null);
/* 122 */         colorConvertOp.filter(parentRaster, result);
/*     */       } 
/*     */       
/* 125 */       int softMaskMinX = this.maskRaster.getMinX();
/* 126 */       int softMaskMinY = this.maskRaster.getMinY();
/* 127 */       int softMaskMaxX = softMaskMinX + this.maskRaster.getWidth();
/* 128 */       int softMaskMaxY = softMaskMinY + this.maskRaster.getHeight();
/*     */       
/* 130 */       for (int j = 0; j < h; j++) {
/* 131 */         for (int i = 0; i < w; i++) {
/* 132 */           int rx = x + i - this.offset.x;
/* 133 */           int ry = y + j - this.offset.y;
/*     */ 
/*     */           
/* 136 */           if (rx >= softMaskMinX && rx < softMaskMaxX && ry >= softMaskMinY && ry < softMaskMaxY) {
/* 137 */             alpha = this.maskRaster.getSample(rx, ry, 0);
/*     */           } else {
/* 139 */             alpha = 0;
/*     */           } 
/* 141 */           int alpha = alpha * result.getSample(i, j, this.numColorComponents) / 255;
/* 142 */           result.setSample(i, j, this.numColorComponents, alpha);
/*     */         } 
/*     */       } 
/*     */       
/* 146 */       return result;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\renderer\MaskedPaint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */