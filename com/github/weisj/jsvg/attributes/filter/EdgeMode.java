/*     */ package com.github.weisj.jsvg.attributes.filter;
/*     */ 
/*     */ import com.github.weisj.jsvg.nodes.filter.FilterContext;
/*     */ import com.github.weisj.jsvg.renderer.GraphicsUtil;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import com.github.weisj.jsvg.util.ImageUtil;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Image;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.CropImageFilter;
/*     */ import java.awt.image.FilteredImageSource;
/*     */ import java.awt.image.ImageObserver;
/*     */ import java.awt.image.ImageProducer;
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
/*     */ public enum EdgeMode
/*     */ {
/*  35 */   Duplicate
/*     */   {
/*     */     public ImageProducer convolve(@NotNull RenderContext context, @NotNull FilterContext filterContext, @NotNull ImageProducer producer, @NotNull ConvolveOperation convolveOperation)
/*     */     {
/*  39 */       return convolveDuplicate(context, filterContext, producer, convolveOperation);
/*     */     }
/*     */   },
/*  42 */   Wrap
/*     */   {
/*     */     public ImageProducer convolve(@NotNull RenderContext context, @NotNull FilterContext filterContext, @NotNull ImageProducer producer, @NotNull ConvolveOperation convolveOperation)
/*     */     {
/*  46 */       return convolveWrap(context, filterContext, producer, convolveOperation);
/*     */     }
/*     */   },
/*  49 */   None
/*     */   {
/*     */     public ImageProducer convolve(@NotNull RenderContext context, @NotNull FilterContext filterContext, @NotNull ImageProducer producer, @NotNull ConvolveOperation convolveOperation)
/*     */     {
/*  53 */       return applyConvolutions(filterContext.renderingHints(), ImageUtil.copy(context, producer), convolveOperation, 0);
/*     */     }
/*     */   };
/*     */ 
/*     */ 
/*     */   
/*     */   private static final class EdgeModeImage
/*     */   {
/*     */     @NotNull
/*     */     private final BufferedImage img;
/*     */ 
/*     */     
/*     */     private final int xOff;
/*     */ 
/*     */     
/*     */     private final int yOff;
/*     */ 
/*     */     
/*     */     private final int width;
/*     */ 
/*     */     
/*     */     private final int height;
/*     */ 
/*     */     
/*     */     private EdgeModeImage(@NotNull BufferedImage img, int xOff, int yOff, int width, int height) {
/*  78 */       this.img = img;
/*  79 */       this.xOff = xOff;
/*  80 */       this.yOff = yOff;
/*  81 */       this.width = width;
/*  82 */       this.height = height;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static EdgeModeImage prepareEdgeModeImage(@NotNull RenderContext context, @NotNull ImageProducer producer, @NotNull ConvolveOperation convolveOperation) {
/*  88 */     Image img = context.createImage(producer);
/*  89 */     int width = img.getWidth(null);
/*  90 */     int height = img.getHeight(null);
/*     */     
/*  92 */     Dimension kernelSize = convolveOperation.maximumKernelSize();
/*  93 */     int xSize = kernelSize.width;
/*  94 */     int ySize = kernelSize.height;
/*     */     
/*  96 */     BufferedImage bufferedImage = ImageUtil.createCompatibleTransparentImage(width + xSize, height + ySize);
/*  97 */     Graphics2D g = GraphicsUtil.createGraphics(bufferedImage);
/*     */     
/*  99 */     int xOff = xSize / 2;
/* 100 */     int yOff = ySize / 2;
/*     */     
/* 102 */     g.translate(xOff, yOff);
/* 103 */     g.drawImage(img, (AffineTransform)null, (ImageObserver)null);
/* 104 */     g.dispose();
/*     */     
/* 106 */     return new EdgeModeImage(bufferedImage, xOff, yOff, width, height);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static ImageProducer convolveDuplicate(@NotNull RenderContext context, @NotNull FilterContext filterContext, @NotNull ImageProducer producer, @NotNull ConvolveOperation convolveOperation) {
/* 112 */     EdgeModeImage edgeModeImage = prepareEdgeModeImage(context, producer, convolveOperation);
/* 113 */     int xOff = edgeModeImage.xOff;
/* 114 */     int yOff = edgeModeImage.yOff;
/* 115 */     int width = edgeModeImage.width;
/* 116 */     int height = edgeModeImage.height;
/*     */     
/* 118 */     Graphics2D g = GraphicsUtil.createGraphics(edgeModeImage.img);
/*     */     
/* 120 */     BufferedImage top = edgeModeImage.img.getSubimage(xOff, yOff, width, 1);
/* 121 */     BufferedImage left = edgeModeImage.img.getSubimage(xOff, yOff, 1, height);
/* 122 */     BufferedImage right = edgeModeImage.img.getSubimage(xOff + width - 1, yOff, 1, height);
/* 123 */     BufferedImage bottom = edgeModeImage.img.getSubimage(xOff, yOff + height - 1, width, 1);
/*     */     
/* 125 */     g.drawImage(top, xOff, 0, width, yOff, null);
/* 126 */     g.drawImage(bottom, xOff, yOff + height, width, yOff, null);
/* 127 */     g.drawImage(left, 0, yOff, xOff, height, null);
/* 128 */     g.drawImage(right, xOff + height, yOff, xOff, height, null);
/*     */     
/* 130 */     Color topLeft = new Color(top.getRGB(0, 0), true);
/* 131 */     Color topRight = new Color(top.getRGB(top.getWidth() - 1, 0), true);
/* 132 */     Color bottomLeft = new Color(bottom.getRGB(0, 0), true);
/* 133 */     Color bottomRight = new Color(bottom.getRGB(bottom.getWidth() - 1, 0), true);
/*     */     
/* 135 */     g.setColor(topLeft);
/* 136 */     g.fillRect(0, 0, xOff, yOff);
/*     */     
/* 138 */     g.setColor(topRight);
/* 139 */     g.fillRect(xOff + width, 0, xOff, yOff);
/*     */     
/* 141 */     g.setColor(bottomLeft);
/* 142 */     g.fillRect(0, yOff + height, xOff, yOff);
/*     */     
/* 144 */     g.setColor(bottomRight);
/* 145 */     g.fillRect(xOff + width, yOff + height, xOff, yOff);
/*     */     
/* 147 */     g.dispose();
/*     */ 
/*     */     
/* 150 */     ImageProducer output = applyConvolutions(filterContext.renderingHints(), edgeModeImage.img, convolveOperation, 1);
/*     */     
/* 152 */     CropImageFilter cropImageFilter = new CropImageFilter(xOff, yOff, width, height);
/* 153 */     return new FilteredImageSource(output, cropImageFilter);
/*     */   }
/*     */ 
/*     */   
/*     */   private static ImageProducer convolveWrap(@NotNull RenderContext context, @NotNull FilterContext filterContext, @NotNull ImageProducer producer, @NotNull ConvolveOperation convolveOperation) {
/* 158 */     EdgeModeImage edgeModeImage = prepareEdgeModeImage(context, producer, convolveOperation);
/* 159 */     int xOff = edgeModeImage.xOff;
/* 160 */     int yOff = edgeModeImage.yOff;
/* 161 */     int width = edgeModeImage.width;
/* 162 */     int height = edgeModeImage.height;
/*     */     
/* 164 */     Graphics2D g = GraphicsUtil.createGraphics(edgeModeImage.img);
/*     */     
/* 166 */     BufferedImage top = edgeModeImage.img.getSubimage(xOff, yOff, width, yOff);
/* 167 */     BufferedImage left = edgeModeImage.img.getSubimage(xOff, yOff, xOff, height);
/* 168 */     BufferedImage right = edgeModeImage.img.getSubimage(width - 1, yOff, xOff, height);
/* 169 */     BufferedImage bottom = edgeModeImage.img.getSubimage(xOff, height - 1, width, yOff);
/*     */     
/* 171 */     BufferedImage topLeft = edgeModeImage.img.getSubimage(xOff, yOff, xOff, yOff);
/* 172 */     BufferedImage topRight = edgeModeImage.img.getSubimage(width - 1, yOff, xOff, yOff);
/* 173 */     BufferedImage bottomLeft = edgeModeImage.img.getSubimage(xOff, height - 1, width, yOff);
/* 174 */     BufferedImage bottomRight = edgeModeImage.img.getSubimage(width - 1, height - 1, xOff, yOff);
/*     */     
/* 176 */     g.drawImage(bottom, xOff, 0, (ImageObserver)null);
/* 177 */     g.drawImage(top, xOff, yOff + height, (ImageObserver)null);
/* 178 */     g.drawImage(right, 0, yOff, (ImageObserver)null);
/* 179 */     g.drawImage(left, xOff + width, yOff, (ImageObserver)null);
/*     */     
/* 181 */     g.drawImage(bottomRight, 0, 0, (ImageObserver)null);
/* 182 */     g.drawImage(bottomLeft, xOff + width, 0, (ImageObserver)null);
/* 183 */     g.drawImage(topRight, 0, yOff + height, (ImageObserver)null);
/* 184 */     g.drawImage(topLeft, xOff + width, yOff + height, (ImageObserver)null);
/*     */ 
/*     */     
/* 187 */     ImageProducer output = applyConvolutions(filterContext.renderingHints(), edgeModeImage.img, convolveOperation, 1);
/*     */     
/* 189 */     CropImageFilter cropImageFilter = new CropImageFilter(xOff, yOff, width, height);
/* 190 */     return new FilteredImageSource(output, cropImageFilter);
/*     */   }
/*     */ 
/*     */   
/*     */   private static ImageProducer applyConvolutions(@NotNull RenderingHints hints, @NotNull BufferedImage image, @NotNull ConvolveOperation convolveOperation, int awtEdgeMode) {
/* 195 */     return convolveOperation.convolve(image, hints, awtEdgeMode);
/*     */   }
/*     */   
/*     */   public abstract ImageProducer convolve(@NotNull RenderContext paramRenderContext, @NotNull FilterContext paramFilterContext, @NotNull ImageProducer paramImageProducer, @NotNull ConvolveOperation paramConvolveOperation);
/*     */   
/*     */   public static interface ConvolveOperation {
/*     */     @NotNull
/*     */     Dimension maximumKernelSize();
/*     */     
/*     */     @NotNull
/*     */     ImageProducer convolve(@NotNull BufferedImage param1BufferedImage, @NotNull RenderingHints param1RenderingHints, int param1Int);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\filter\EdgeMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */