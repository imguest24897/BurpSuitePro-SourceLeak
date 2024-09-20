/*    */ package com.github.weisj.jsvg.nodes.filter;
/*    */ 
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Image;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.awt.image.FilteredImageSource;
/*    */ import java.awt.image.ImageFilter;
/*    */ import java.awt.image.ImageProducer;
/*    */ import java.awt.image.WritableRaster;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ public final class ImageProducerChannel
/*    */   implements Channel, PixelProvider
/*    */ {
/*    */   @NotNull
/*    */   private final ImageProducer producer;
/*    */   private BufferedImage rasterBuffer;
/*    */   private WritableRaster raster;
/*    */   
/*    */   public ImageProducerChannel(@NotNull ImageProducer producer) {
/* 39 */     this.producer = producer;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public ImageProducer producer() {
/* 44 */     return this.producer;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Channel applyFilter(@NotNull ImageFilter filter) {
/* 49 */     return new ImageProducerChannel(new FilteredImageSource(this.producer, filter));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Image toImage(@NotNull RenderContext context) {
/* 54 */     return rasterBuffer(context);
/*    */   }
/*    */   @NotNull
/*    */   private BufferedImage rasterBuffer(@NotNull RenderContext context) {
/* 58 */     if (this.rasterBuffer == null) {
/* 59 */       this.rasterBuffer = Channel.makeNonAliased(context.createImage(producer()));
/*    */     }
/* 61 */     return this.rasterBuffer;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public PixelProvider pixels(@NotNull RenderContext context) {
/* 66 */     if (this.raster == null) {
/* 67 */       this.raster = rasterBuffer(context).getRaster();
/*    */     }
/* 69 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public int pixelAt(double x, double y) {
/* 74 */     int[] rgb = this.raster.getPixel((int)x, (int)y, (int[])null);
/* 75 */     return rgb[3] << 24 | rgb[0] << 16 | rgb[1] << 8 | rgb[2];
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\ImageProducerChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */