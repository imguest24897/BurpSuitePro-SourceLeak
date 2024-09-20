/*     */ package com.github.weisj.jsvg.nodes.filter;
/*     */ 
/*     */ import java.awt.Composite;
/*     */ import java.awt.CompositeContext;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.image.ColorModel;
/*     */ import java.awt.image.DirectColorModel;
/*     */ import java.awt.image.Raster;
/*     */ import java.awt.image.RasterFormatException;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractBlendComposite
/*     */   implements Composite
/*     */ {
/*     */   @NotNull
/*     */   protected abstract Blender blender();
/*     */   
/*     */   private static boolean isColorModelInvalid(ColorModel cm) {
/*  84 */     if (cm instanceof DirectColorModel && cm.getTransferType() == 3) {
/*  85 */       DirectColorModel directCM = (DirectColorModel)cm;
/*     */       
/*  87 */       return (directCM.getRedMask() != 16711680 || directCM
/*  88 */         .getGreenMask() != 65280 || directCM
/*  89 */         .getBlueMask() != 255 || (directCM
/*  90 */         .getNumComponents() == 4 && directCM.getAlphaMask() != -16777216));
/*     */     } 
/*  92 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public CompositeContext createContext(ColorModel srcColorModel, ColorModel dstColorModel, RenderingHints hints) {
/*  97 */     if (isColorModelInvalid(srcColorModel) || isColorModelInvalid(dstColorModel)) {
/*  98 */       throw new RasterFormatException("Incompatible color models");
/*     */     }
/* 100 */     return new BlendingContext(blender());
/*     */   }
/*     */   
/*     */   private static final class BlendingContext
/*     */     implements CompositeContext
/*     */   {
/*     */     private BlendingContext(@NotNull AbstractBlendComposite.Blender blender) {
/* 107 */       this.blender = blender;
/*     */     }
/*     */     @NotNull
/*     */     private final AbstractBlendComposite.Blender blender;
/*     */     
/*     */     public void dispose() {}
/*     */     
/*     */     public void compose(@NotNull Raster src, @NotNull Raster dstIn, @NotNull WritableRaster dstOut) {
/* 115 */       int width = Math.min(src.getWidth(), dstIn.getWidth());
/* 116 */       int height = Math.min(src.getHeight(), dstIn.getHeight());
/*     */       
/* 118 */       int[] result = new int[4];
/* 119 */       int[] srcPixel = new int[4];
/* 120 */       int[] dstPixel = new int[4];
/* 121 */       int[] srcPixels = new int[width];
/* 122 */       int[] dstPixels = new int[width];
/*     */       
/* 124 */       for (int y = 0; y < height; y++) {
/* 125 */         src.getDataElements(0, y, width, 1, srcPixels);
/* 126 */         dstIn.getDataElements(0, y, width, 1, dstPixels);
/*     */         
/* 128 */         for (int x = 0; x < width; x++) {
/*     */ 
/*     */           
/* 131 */           int pixel = srcPixels[x];
/* 132 */           srcPixel[0] = pixel >> 16 & 0xFF;
/* 133 */           srcPixel[1] = pixel >> 8 & 0xFF;
/* 134 */           srcPixel[2] = pixel & 0xFF;
/* 135 */           srcPixel[3] = pixel >> 24 & 0xFF;
/*     */           
/* 137 */           pixel = dstPixels[x];
/* 138 */           dstPixel[0] = pixel >> 16 & 0xFF;
/* 139 */           dstPixel[1] = pixel >> 8 & 0xFF;
/* 140 */           dstPixel[2] = pixel & 0xFF;
/* 141 */           dstPixel[3] = pixel >> 24 & 0xFF;
/*     */           
/* 143 */           this.blender.blend(srcPixel, dstPixel, result);
/*     */           
/* 145 */           dstPixels[x] = (result[3] & 0xFF) << 24 | (result[0] & 0xFF) << 16 | (result[1] & 0xFF) << 8 | result[2] & 0xFF;
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 150 */         dstOut.setDataElements(0, y, width, 1, dstPixels);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   static interface Blender {
/*     */     void blend(int[] param1ArrayOfint1, int[] param1ArrayOfint2, int[] param1ArrayOfint3);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\AbstractBlendComposite.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */