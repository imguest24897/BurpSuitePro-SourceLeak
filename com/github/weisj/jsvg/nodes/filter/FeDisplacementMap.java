/*     */ package com.github.weisj.jsvg.nodes.filter;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.filter.ColorChannel;
/*     */ import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
/*     */ import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
/*     */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*     */ import com.github.weisj.jsvg.nodes.animation.Set;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import com.github.weisj.jsvg.util.ImageUtil;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.color.ColorSpace;
/*     */ import java.awt.geom.Point2D;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.BufferedImageFilter;
/*     */ import java.awt.image.BufferedImageOp;
/*     */ import java.awt.image.ColorModel;
/*     */ import java.awt.image.DirectColorModel;
/*     */ import java.awt.image.ImageFilter;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ElementCategories({Category.FilterPrimitive})
/*     */ @PermittedContent(anyOf = {Animate.class, Set.class})
/*     */ public final class FeDisplacementMap
/*     */   extends AbstractFilterPrimitive
/*     */ {
/*     */   public static final String TAG = "fedisplacementmap";
/*     */   private ColorChannel xChannelSelector;
/*     */   private ColorChannel yChannelSelector;
/*     */   private float scale;
/*     */   private FilterChannelKey inputChannel2;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  60 */     return "fedisplacementmap";
/*     */   }
/*     */ 
/*     */   
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  65 */     super.build(attributeNode);
/*  66 */     this.xChannelSelector = (ColorChannel)attributeNode.getEnum("xChannelSelector", (Enum)ColorChannel.A);
/*  67 */     this.yChannelSelector = (ColorChannel)attributeNode.getEnum("yChannelSelector", (Enum)ColorChannel.A);
/*     */     
/*  69 */     this.scale = attributeNode.getFloat("scale", 0.0F);
/*     */     
/*  71 */     this.inputChannel2 = attributeNode.getFilterChannelKey("in2", DefaultFilterChannel.LastResult);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
/*  77 */     impl().saveLayoutResult(impl().layoutInput(filterLayoutContext), filterLayoutContext);
/*     */   }
/*     */ 
/*     */   
/*     */   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
/*  82 */     if (this.scale == 0.0F) {
/*  83 */       impl().noop(filterContext);
/*     */       return;
/*     */     } 
/*  86 */     Channel input = impl().inputChannel(filterContext);
/*  87 */     Channel displacementInput = filterContext.getChannel(this.inputChannel2);
/*     */ 
/*     */     
/*  90 */     ImageFilter displacementFilter = new BufferedImageFilter(new DisplacementOp(displacementInput.pixels(context), filterContext.info().tile()));
/*  91 */     impl().saveResult(input.applyFilter(displacementFilter), filterContext);
/*     */   }
/*     */   
/*     */   private final class DisplacementOp implements BufferedImageOp {
/*     */     @NotNull
/*     */     private final PixelProvider displacementChannel;
/*     */     private final Rectangle2D sourceBounds;
/*     */     
/*     */     public DisplacementOp(PixelProvider displacementChannel, Rectangle2D sourceBounds) {
/* 100 */       this.displacementChannel = displacementChannel;
/* 101 */       this.sourceBounds = sourceBounds;
/*     */     }
/*     */ 
/*     */     
/*     */     public BufferedImage createCompatibleDestImage(BufferedImage src, ColorModel dstCM) {
/* 106 */       if (dstCM == null) dstCM = src.getColorModel(); 
/* 107 */       return new BufferedImage(dstCM, dstCM.createCompatibleWritableRaster(src.getWidth(), src.getHeight()), dstCM
/* 108 */           .isAlphaPremultiplied(), null);
/*     */     }
/*     */ 
/*     */     
/*     */     public Rectangle2D getBounds2D(BufferedImage src) {
/* 113 */       return new Rectangle(0, 0, src.getWidth(), src.getHeight());
/*     */     }
/*     */ 
/*     */     
/*     */     public Point2D getPoint2D(Point2D srcPt, Point2D dstPt) {
/* 118 */       return (Point2D)srcPt.clone();
/*     */     }
/*     */ 
/*     */     
/*     */     public BufferedImage filter(BufferedImage src, BufferedImage dest) {
/* 123 */       if (src == null) {
/* 124 */         throw new NullPointerException("src image is null");
/*     */       }
/* 126 */       if (src == dest) {
/* 127 */         throw new IllegalArgumentException("src image cannot be the same as the dst image");
/*     */       }
/*     */ 
/*     */       
/* 131 */       BufferedImage result = dest;
/*     */       
/* 133 */       if (result == null) {
/* 134 */         ColorSpace cs = ColorSpace.getInstance(1000);
/* 135 */         ColorModel cm = new DirectColorModel(cs, 32, 16711680, 65280, 255, -16777216, false, 3);
/*     */         
/* 137 */         result = createCompatibleDestImage(src, cm);
/*     */       } 
/*     */       
/* 140 */       WritableRaster raster = result.getRaster();
/*     */       
/* 142 */       int w = raster.getWidth();
/* 143 */       int h = raster.getHeight();
/*     */       
/* 145 */       double scaleX = this.sourceBounds.getWidth() / w;
/* 146 */       double scaleY = this.sourceBounds.getHeight() / h;
/*     */       
/* 148 */       double startX = this.sourceBounds.getX();
/* 149 */       double startY = this.sourceBounds.getY();
/*     */       
/* 151 */       Raster sourceRaster = src.getRaster();
/* 152 */       Rectangle sourceRasterBounds = sourceRaster.getBounds();
/*     */       
/* 154 */       int[] destPixels = ImageUtil.getINT_RGBA_DataBank(raster);
/* 155 */       int dstAdjust = ImageUtil.getINT_RGBA_DataAdjust(raster);
/* 156 */       int dp = ImageUtil.getINT_RGBA_DataOffset(raster);
/*     */       
/* 158 */       double point_1 = startY;
/* 159 */       int y = 0;
/* 160 */       for (int i = 0; i < h; i++) {
/* 161 */         int x = 0;
/* 162 */         double point_0 = startX;
/* 163 */         for (int end = dp + w; dp < end; dp++) {
/* 164 */           int displacementRGB = this.displacementChannel.pixelAt(point_0, point_1);
/* 165 */           double xDisplacement = FeDisplacementMap.this.xChannelSelector.value(displacementRGB) / 255.0D - 0.5D;
/* 166 */           double yDisplacement = FeDisplacementMap.this.yChannelSelector.value(displacementRGB) / 255.0D - 0.5D;
/* 167 */           int xDest = (int)(x + FeDisplacementMap.this.scale * xDisplacement / scaleX);
/* 168 */           int yDest = (int)(y + FeDisplacementMap.this.scale * yDisplacement / scaleY);
/* 169 */           if (sourceRasterBounds.contains(xDest, yDest)) {
/* 170 */             destPixels[dp] = src.getRGB(xDest, yDest);
/*     */           } else {
/* 172 */             destPixels[dp] = 0;
/*     */           } 
/* 174 */           point_0 += scaleX;
/* 175 */           x++;
/*     */         } 
/* 177 */         point_1 += scaleY;
/* 178 */         dp += dstAdjust;
/* 179 */         y++;
/*     */       } 
/*     */       
/* 182 */       return result;
/*     */     }
/*     */ 
/*     */     
/*     */     public RenderingHints getRenderingHints() {
/* 187 */       return null;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\FeDisplacementMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */