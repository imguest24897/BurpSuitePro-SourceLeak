/*     */ package com.github.weisj.jsvg.nodes.filter;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.filter.EdgeMode;
/*     */ import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
/*     */ import com.github.weisj.jsvg.geometry.util.GeometryUtil;
/*     */ import com.github.weisj.jsvg.nodes.InplaceBoxBlurFilter;
/*     */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*     */ import com.github.weisj.jsvg.nodes.animation.Set;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.BufferedImageFilter;
/*     */ import java.awt.image.BufferedImageOp;
/*     */ import java.awt.image.ConvolveOp;
/*     */ import java.awt.image.FilteredImageSource;
/*     */ import java.awt.image.ImageProducer;
/*     */ import java.awt.image.Kernel;
/*     */ import java.awt.image.WritableRaster;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ public final class FeGaussianBlur
/*     */   extends AbstractFilterPrimitive
/*     */ {
/*     */   public static final String TAG = "fegaussianblur";
/*  50 */   private static final double SQRT_2_PI = Math.sqrt(6.283185307179586D);
/*  51 */   private static final double THREE_QUARTER_SQRT_2_PI = SQRT_2_PI * 3.0D / 4.0D;
/*     */   
/*     */   private static final float KERNEL_PRECISION = 0.001F;
/*     */   
/*     */   private static final double BOX_BLUR_APPROXIMATION_THRESHOLD = 2.0D;
/*     */   
/*     */   private float[] stdDeviation;
/*     */   private EdgeMode edgeMode;
/*     */   private double xCurrent;
/*     */   private double yCurrent;
/*     */   private Kernel xBlur;
/*     */   private Kernel yBlur;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  66 */     return "fegaussianblur";
/*     */   }
/*     */ 
/*     */   
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  71 */     super.build(attributeNode);
/*  72 */     this.stdDeviation = attributeNode.getFloatList("stdDeviation");
/*  73 */     this.edgeMode = (EdgeMode)attributeNode.getEnum("edgeMode", (Enum)EdgeMode.Duplicate);
/*     */   }
/*     */   
/*     */   private double[] computeAbsoluteStdDeviation(@Nullable AffineTransform at) {
/*  77 */     if (this.stdDeviation.length == 0) return new double[] { 0.0D, 0.0D }; 
/*  78 */     double xSigma = this.stdDeviation[0];
/*  79 */     double ySigma = this.stdDeviation[Math.min(this.stdDeviation.length - 1, 1)];
/*  80 */     if (at != null) {
/*  81 */       xSigma *= GeometryUtil.scaleXOfTransform(at);
/*  82 */       ySigma *= GeometryUtil.scaleYOfTransform(at);
/*     */     } 
/*  84 */     return new double[] { xSigma, ySigma };
/*     */   }
/*     */ 
/*     */   
/*     */   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
/*  89 */     LayoutBounds input = impl().layoutInput(filterLayoutContext);
/*  90 */     double[] sigma = computeAbsoluteStdDeviation(null);
/*  91 */     int hExtend = kernelDiameterForStandardDeviation(sigma[0]);
/*  92 */     int vExtend = kernelDiameterForStandardDeviation(sigma[1]);
/*  93 */     impl().saveLayoutResult(input.grow(hExtend, vExtend, filterLayoutContext), filterLayoutContext);
/*     */   }
/*     */ 
/*     */   
/*     */   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
/*  98 */     if (this.stdDeviation.length == 0) {
/*  99 */       impl().noop(filterContext);
/*     */       
/*     */       return;
/*     */     } 
/* 103 */     double[] sigma = computeAbsoluteStdDeviation(filterContext.info().graphics().getTransform());
/* 104 */     double xSigma = sigma[0];
/* 105 */     double ySigma = sigma[1];
/*     */     
/* 107 */     if (xSigma <= 0.0D && ySigma <= 0.0D) {
/* 108 */       impl().noop(filterContext);
/*     */       
/*     */       return;
/*     */     } 
/* 112 */     ImageProducer input = impl().inputChannel(filterContext).producer();
/*     */     
/* 114 */     Kernel xBlurKernel = null;
/* 115 */     Kernel yBlurKernel = null;
/* 116 */     int dX = kernelDiameterForStandardDeviation(xSigma);
/* 117 */     int dY = kernelDiameterForStandardDeviation(ySigma);
/*     */     
/* 119 */     if (xSigma > 0.0D && xSigma < 2.0D) {
/* 120 */       xBlurKernel = createConvolveKernel(dX, xSigma, true);
/*     */     }
/* 122 */     if (ySigma > 0.0D && ySigma < 2.0D) {
/* 123 */       yBlurKernel = createConvolveKernel(dX, ySigma, false);
/*     */     }
/*     */     
/* 126 */     ImageProducer output = this.edgeMode.convolve(context, filterContext, input, new MixedQualityConvolveOperation(xBlurKernel, yBlurKernel, dX, dY));
/*     */     
/* 128 */     impl().saveResult(new ImageProducerChannel(output), filterContext);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private Kernel createConvolveKernel(int diameter, double sigma, boolean horizontal) {
/* 133 */     if (horizontal && this.xBlur != null && this.xCurrent == sigma) return this.xBlur; 
/* 134 */     if (!horizontal && this.yBlur != null && this.yCurrent == sigma) return this.yBlur;
/*     */     
/* 136 */     if (horizontal) {
/* 137 */       this.xCurrent = sigma;
/*     */     } else {
/* 139 */       this.yCurrent = sigma;
/*     */     } 
/*     */     
/* 142 */     float[] data = computeGaussianKernelData(diameter, sigma);
/*     */     
/* 144 */     if (horizontal) {
/* 145 */       this.xBlur = new Kernel(diameter, 1, data);
/*     */     } else {
/* 147 */       this.yBlur = new Kernel(1, diameter, data);
/*     */     } 
/*     */     
/* 150 */     return horizontal ? this.xBlur : this.yBlur;
/*     */   }
/*     */   
/*     */   private static float normalConvolve(float x, double standardDeviation) {
/* 154 */     return (float)(Math.pow(Math.E, (-x * x) / 2.0D * standardDeviation * standardDeviation) / standardDeviation * SQRT_2_PI);
/*     */   }
/*     */ 
/*     */   
/*     */   private static float[] computeGaussianKernelData(int diameter, double standardDeviation) {
/* 159 */     float[] data = new float[diameter];
/*     */     
/* 161 */     int mid = diameter / 2;
/* 162 */     float total = 0.0F; int i;
/* 163 */     for (i = 0; i < diameter; i++) {
/* 164 */       data[i] = normalConvolve(i - mid, standardDeviation);
/* 165 */       total += data[i];
/*     */     } 
/*     */ 
/*     */     
/* 169 */     if (total > 0.0F) {
/* 170 */       for (i = 0; i < diameter; i++) {
/* 171 */         data[i] = data[i] / total;
/*     */       }
/*     */     }
/*     */     
/* 175 */     return data;
/*     */   }
/*     */   
/*     */   public static int kernelDiameterForStandardDeviation(double standardDeviation) {
/* 179 */     if (standardDeviation < 2.0D) {
/* 180 */       float areaSum = (float)(0.5D / standardDeviation * SQRT_2_PI);
/* 181 */       int i = 0;
/* 182 */       while (areaSum < 0.49899999995250255D) {
/* 183 */         areaSum += normalConvolve(i, standardDeviation);
/* 184 */         i++;
/*     */       } 
/* 186 */       return i * 2 + 1;
/*     */     } 
/* 188 */     return (int)Math.floor(THREE_QUARTER_SQRT_2_PI * standardDeviation + 0.5D);
/*     */   }
/*     */   
/*     */   private static final class MixedQualityConvolveOperation
/*     */     implements EdgeMode.ConvolveOperation
/*     */   {
/*     */     @Nullable
/*     */     private final Kernel xKernel;
/*     */     @Nullable
/*     */     private final Kernel yKernel;
/*     */     private final int dX;
/*     */     private final int dY;
/*     */     
/*     */     private MixedQualityConvolveOperation(@Nullable Kernel xKernel, @Nullable Kernel yKernel, int dX, int dY) {
/* 202 */       this.xKernel = xKernel;
/* 203 */       this.yKernel = yKernel;
/* 204 */       this.dX = dX;
/* 205 */       this.dY = dY;
/*     */     }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public Dimension maximumKernelSize() {
/* 211 */       return new Dimension(
/* 212 */           (this.xKernel != null) ? this.xKernel.getXOrigin() : this.dX, 
/* 213 */           (this.yKernel != null) ? this.yKernel.getXOrigin() : this.dY);
/*     */     }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public ImageProducer convolve(@NotNull BufferedImage image, @NotNull RenderingHints hints, int awtEdgeMode) {
/* 219 */       WritableRaster raster = image.getRaster();
/* 220 */       if (this.xKernel != null && this.yKernel != null) {
/* 221 */         BufferedImageOp op = new MultiConvolveOp(new ConvolveOp[] { new ConvolveOp(this.xKernel, awtEdgeMode, hints), new ConvolveOp(this.yKernel, awtEdgeMode, hints) });
/*     */ 
/*     */ 
/*     */         
/* 225 */         return new FilteredImageSource(image.getSource(), new BufferedImageFilter(op));
/* 226 */       }  if (this.xKernel != null) {
/* 227 */         verticalBoxBlur(raster);
/* 228 */         return new FilteredImageSource(image.getSource(), new BufferedImageFilter(new ConvolveOp(this.xKernel, awtEdgeMode, hints)));
/*     */       } 
/* 230 */       if (this.yKernel != null) {
/* 231 */         horizontalBoxBlur(raster);
/* 232 */         return new FilteredImageSource(image.getSource(), new BufferedImageFilter(new ConvolveOp(this.yKernel, awtEdgeMode, hints)));
/*     */       } 
/*     */       
/* 235 */       horizontalBoxBlur(raster);
/* 236 */       verticalBoxBlur(raster);
/* 237 */       return image.getSource();
/*     */     }
/*     */ 
/*     */     
/*     */     private void horizontalBoxBlur(@NotNull WritableRaster raster) {
/* 242 */       if ((this.dX & 0x1) == 0) {
/* 243 */         InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, this.dX / 2);
/* 244 */         InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, this.dX / 2 - 1);
/* 245 */         InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX + 1, this.dX / 2);
/*     */       } else {
/* 247 */         InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, this.dX / 2);
/* 248 */         InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, this.dX / 2);
/* 249 */         InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, this.dX / 2);
/*     */       } 
/*     */     }
/*     */     
/*     */     private void verticalBoxBlur(@NotNull WritableRaster raster) {
/* 254 */       if ((this.dY & 0x1) == 0) {
/* 255 */         InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, this.dY / 2);
/* 256 */         InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, this.dY / 2 - 1);
/* 257 */         InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY + 1, this.dY / 2);
/*     */       } else {
/* 259 */         InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, this.dY / 2);
/* 260 */         InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, this.dY / 2);
/* 261 */         InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, this.dY / 2);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\FeGaussianBlur.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */