/*    */ package com.github.weisj.jsvg.util;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.util.GeometryUtil;
/*    */ import com.github.weisj.jsvg.renderer.GraphicsUtil;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Image;
/*    */ import java.awt.geom.AffineTransform;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.awt.image.DataBufferInt;
/*    */ import java.awt.image.ImageObserver;
/*    */ import java.awt.image.ImageProducer;
/*    */ import java.awt.image.Raster;
/*    */ import java.awt.image.SinglePixelPackedSampleModel;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ImageUtil
/*    */ {
/*    */   @NotNull
/*    */   public static BufferedImage createCompatibleTransparentImage(@NotNull Graphics2D g, double width, double height) {
/* 40 */     return createCompatibleTransparentImage(g.getTransform(), width, height);
/*    */   }
/*    */   @NotNull
/*    */   public static BufferedImage createCompatibleTransparentImage(int width, int height) {
/* 44 */     return new BufferedImage(width, height, 3);
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static BufferedImage createCompatibleTransparentImage(@Nullable AffineTransform at, double width, double height) {
/* 50 */     return new BufferedImage(
/* 51 */         (int)Math.ceil(GeometryUtil.scaleXOfTransform(at) * width), 
/* 52 */         (int)Math.ceil(GeometryUtil.scaleYOfTransform(at) * height), 3);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static BufferedImage createLuminosityBuffer(@Nullable AffineTransform at, double width, double height) {
/* 57 */     return new BufferedImage(
/* 58 */         (int)Math.ceil(GeometryUtil.scaleXOfTransform(at) * width), 
/* 59 */         (int)Math.ceil(GeometryUtil.scaleYOfTransform(at) * height), 10);
/*    */   }
/*    */   
/*    */   public static int[] getINT_RGBA_DataBank(@NotNull Raster raster) {
/* 63 */     DataBufferInt dstDB = (DataBufferInt)raster.getDataBuffer();
/* 64 */     return dstDB.getBankData()[0];
/*    */   }
/*    */   
/*    */   public static int getINT_RGBA_DataOffset(@NotNull Raster raster) {
/* 68 */     DataBufferInt dstDB = (DataBufferInt)raster.getDataBuffer();
/* 69 */     SinglePixelPackedSampleModel sppsm = (SinglePixelPackedSampleModel)raster.getSampleModel();
/* 70 */     return dstDB.getOffset() + sppsm.getOffset(raster
/* 71 */         .getMinX() - raster.getSampleModelTranslateX(), raster
/* 72 */         .getMinY() - raster.getSampleModelTranslateY());
/*    */   }
/*    */   
/*    */   public static int getINT_RGBA_DataAdjust(@NotNull Raster raster) {
/* 76 */     return getINT_RGBA_ScanlineStride(raster) - raster.getWidth();
/*    */   }
/*    */   
/*    */   public static int getINT_RGBA_ScanlineStride(@NotNull Raster raster) {
/* 80 */     return ((SinglePixelPackedSampleModel)raster.getSampleModel()).getScanlineStride();
/*    */   }
/*    */   @NotNull
/*    */   public static BufferedImage copy(@NotNull RenderContext context, @NotNull ImageProducer producer) {
/* 84 */     Image img = context.createImage(producer);
/* 85 */     BufferedImage bufferedImage = createCompatibleTransparentImage((AffineTransform)null, img
/* 86 */         .getWidth(null), img.getHeight(null));
/* 87 */     Graphics2D g = GraphicsUtil.createGraphics(bufferedImage);
/* 88 */     g.drawImage(img, (AffineTransform)null, (ImageObserver)null);
/* 89 */     g.dispose();
/* 90 */     return bufferedImage;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsv\\util\ImageUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */