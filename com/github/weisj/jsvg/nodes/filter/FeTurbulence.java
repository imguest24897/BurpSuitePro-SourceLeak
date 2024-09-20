/*     */ package com.github.weisj.jsvg.nodes.filter;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
/*     */ import com.github.weisj.jsvg.geometry.noise.PerlinTurbulence;
/*     */ import com.github.weisj.jsvg.geometry.size.FloatInsets;
/*     */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*     */ import com.github.weisj.jsvg.nodes.animation.Set;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import com.github.weisj.jsvg.util.ImageUtil;
/*     */ import java.awt.color.ColorSpace;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.ColorModel;
/*     */ import java.awt.image.DirectColorModel;
/*     */ import java.awt.image.FilteredImageSource;
/*     */ import java.awt.image.ImageFilter;
/*     */ import java.awt.image.ImageProducer;
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
/*     */ @ElementCategories({Category.FilterPrimitive})
/*     */ @PermittedContent(anyOf = {Animate.class, Set.class})
/*     */ public final class FeTurbulence
/*     */   extends AbstractFilterPrimitive
/*     */ {
/*     */   public static final String TAG = "feturbulence";
/*     */   private float seed;
/*     */   private float[] baseFrequency;
/*     */   private int numOctaves;
/*     */   private Type type;
/*     */   
/*     */   public enum Type
/*     */   {
/*  50 */     fractalNoise,
/*  51 */     Turbulence;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  62 */     return "feturbulence";
/*     */   }
/*     */ 
/*     */   
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  67 */     super.build(attributeNode);
/*  68 */     this.seed = attributeNode.getFloat("seed", 0.0F);
/*     */     
/*  70 */     this.baseFrequency = attributeNode.getFloatList("baseFrequency");
/*  71 */     if (this.baseFrequency.length == 0) this.baseFrequency = new float[] { 0.0F };
/*     */     
/*  73 */     this.numOctaves = attributeNode.getInt("numOctaves", 1);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     this.numOctaves = Math.min(this.numOctaves, 8);
/*     */     
/*  80 */     this.type = (Type)attributeNode.getEnum("type", Type.fractalNoise);
/*     */   }
/*     */ 
/*     */   
/*     */   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
/*  85 */     impl().saveLayoutResult(new LayoutBounds(filterLayoutContext
/*     */           
/*  87 */           .filterPrimitiveRegion(context.measureContext(), this), new FloatInsets()), filterLayoutContext);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
/*  94 */     Filter.FilterInfo info = filterContext.info();
/*     */ 
/*     */     
/*  97 */     Channel turbulenceChannel = new TurbulenceChannel(info.imageBounds(), info.imageWidth, info.imageHeight, this.seed, this.numOctaves, this.baseFrequency[0], (this.baseFrequency.length > 1) ? this.baseFrequency[1] : this.baseFrequency[0], this.type);
/*  98 */     impl().saveResult(turbulenceChannel, filterContext);
/*     */   }
/*     */   
/*     */   public static final class TurbulenceChannel
/*     */     implements Channel, PixelProvider {
/*     */     private final PerlinTurbulence perlinTurbulence;
/* 104 */     private final double[] channels = new double[4];
/*     */     
/*     */     private final int imageWidth;
/*     */     private final int imageHeight;
/*     */     private final FeTurbulence.Type type;
/*     */     private final Rectangle2D tileBounds;
/*     */     private BufferedImage bufferedImage;
/*     */     
/*     */     public TurbulenceChannel(@NotNull Rectangle2D tileBounds, int imageWidth, int imageHeight, float seed, int octaves, double xFrequency, double yFrequency, FeTurbulence.Type type) {
/* 113 */       this.tileBounds = tileBounds;
/* 114 */       this.imageWidth = imageWidth;
/* 115 */       this.imageHeight = imageHeight;
/* 116 */       this.type = type;
/* 117 */       this.perlinTurbulence = new PerlinTurbulence((int)seed, octaves, xFrequency, yFrequency);
/*     */     }
/*     */     @NotNull
/*     */     private BufferedImage ensureImageBackingStore() {
/* 121 */       if (this.bufferedImage == null) {
/* 122 */         ColorSpace cs = ColorSpace.getInstance(1004);
/* 123 */         ColorModel cm = new DirectColorModel(cs, 32, 16711680, 65280, 255, -16777216, false, 3);
/*     */         
/* 125 */         WritableRaster dest = cm.createCompatibleWritableRaster(this.imageWidth, this.imageHeight);
/* 126 */         this.bufferedImage = new BufferedImage(cm, dest, false, null);
/*     */         
/* 128 */         int w = dest.getWidth();
/* 129 */         int h = dest.getHeight();
/*     */         
/* 131 */         double scaleX = this.tileBounds.getWidth() / w;
/* 132 */         double scaleY = this.tileBounds.getHeight() / h;
/*     */         
/* 134 */         double startX = this.tileBounds.getX();
/* 135 */         double startY = this.tileBounds.getY();
/*     */         
/* 137 */         boolean fractalNoise = (this.type == FeTurbulence.Type.fractalNoise);
/*     */         
/* 139 */         int[] destPixels = ImageUtil.getINT_RGBA_DataBank(dest);
/* 140 */         int dstAdjust = ImageUtil.getINT_RGBA_DataAdjust(dest);
/* 141 */         int dp = ImageUtil.getINT_RGBA_DataOffset(dest);
/*     */         
/* 143 */         double point_1 = startY;
/* 144 */         for (int i = 0; i < h; i++) {
/* 145 */           double point_0 = startX;
/* 146 */           for (int end = dp + w; dp < end; dp++) {
/* 147 */             this.perlinTurbulence.turbulence(this.channels, point_0, point_1, fractalNoise, null, null);
/* 148 */             destPixels[dp] = cm.getRGB(channelsToRGB(this.channels));
/* 149 */             point_0 += scaleX;
/*     */           } 
/* 151 */           point_1 += scaleY;
/* 152 */           dp += dstAdjust;
/*     */         } 
/*     */       } 
/* 155 */       return this.bufferedImage;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public ImageProducer producer() {
/* 160 */       return ensureImageBackingStore().getSource();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public BufferedImage toBufferedImageNonAliased(@NotNull RenderContext context) {
/* 165 */       BufferedImage img = ensureImageBackingStore();
/* 166 */       ColorModel cm = img.getColorModel();
/* 167 */       WritableRaster raster = img.copyData(null);
/* 168 */       return new BufferedImage(cm, raster, cm.isAlphaPremultiplied(), null);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Channel applyFilter(@NotNull ImageFilter filter) {
/* 173 */       return new ImageProducerChannel(new FilteredImageSource(producer(), filter));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public PixelProvider pixels(@NotNull RenderContext context) {
/* 178 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public int pixelAt(double x, double y) {
/* 183 */       this.perlinTurbulence.turbulence(this.channels, x, y, (this.type == FeTurbulence.Type.fractalNoise), null, null);
/* 184 */       return channelsToRGB(this.channels);
/*     */     }
/*     */ 
/*     */     
/*     */     private static int channelsToRGB(double[] channels) {
/* 189 */       int j, i = (int)channels[0];
/* 190 */       if ((i & 0xFFFFFF00) == 0) {
/* 191 */         j = i << 16;
/*     */       } else {
/* 193 */         j = ((i & Integer.MIN_VALUE) != 0) ? 0 : 16711680;
/*     */       } 
/*     */       
/* 196 */       i = (int)channels[1];
/* 197 */       if ((i & 0xFFFFFF00) == 0) {
/* 198 */         j |= i << 8;
/*     */       } else {
/* 200 */         j |= ((i & Integer.MIN_VALUE) != 0) ? 0 : 65280;
/*     */       } 
/*     */       
/* 203 */       i = (int)channels[2];
/* 204 */       if ((i & 0xFFFFFF00) == 0) {
/* 205 */         j |= i;
/*     */       } else {
/* 207 */         j |= ((i & Integer.MIN_VALUE) != 0) ? 0 : 255;
/*     */       } 
/*     */       
/* 210 */       i = (int)channels[3];
/* 211 */       if ((i & 0xFFFFFF00) == 0) {
/* 212 */         j |= i << 24;
/*     */       } else {
/* 214 */         j |= ((i & Integer.MIN_VALUE) != 0) ? 0 : -16777216;
/*     */       } 
/*     */       
/* 217 */       return j;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\FeTurbulence.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */