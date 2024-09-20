/*     */ package com.github.weisj.jsvg.nodes.filter;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
/*     */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*     */ import com.github.weisj.jsvg.nodes.animation.Set;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.image.RGBImageFilter;
/*     */ import java.util.Arrays;
/*     */ import java.util.Locale;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ElementCategories({Category.FilterPrimitive})
/*     */ @PermittedContent(anyOf = {Animate.class, Set.class})
/*     */ public final class FeColorMatrix
/*     */   extends AbstractFilterPrimitive
/*     */ {
/*     */   public static final String TAG = "fecolormatrix";
/*     */   private static final String KEY_VALUES = "values";
/*     */   @Nullable
/*     */   private AffineRGBImageFilter filter;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  52 */     return "fecolormatrix";
/*     */   }
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*     */     double[] colorTransform;
/*     */     float s, hueRotate;
/*  57 */     super.build(attributeNode);
/*  58 */     String type = attributeNode.getValue("type");
/*  59 */     if (type == null) type = "matrix"; 
/*  60 */     this.filter = null;
/*  61 */     switch (type.toLowerCase(Locale.ENGLISH)) {
/*     */       case "matrix":
/*  63 */         colorTransform = attributeNode.getDoubleList("values");
/*  64 */         if (colorTransform.length == 20) {
/*  65 */           boolean isIdentity = Arrays.equals(colorTransform, new double[] { 1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  71 */           if (!isIdentity) this.filter = new MatrixRGBFilter(colorTransform); 
/*     */         } 
/*     */         break;
/*     */       case "saturate":
/*  75 */         s = attributeNode.getFloat("values", 1.0F);
/*  76 */         if (s != 1.0F) {
/*  77 */           this.filter = new LinearRGBFilter(0.213D + 0.787D * s, 0.715D * (1.0F - s), 0.072D * (1.0F - s), 0.213D * (1.0F - s), 0.715D + 0.285D * s, 0.072D * (1.0F - s), 0.213D * (1.0F - s), 0.715D * (1.0F - s), 0.072D + 0.928D * s);
/*     */         }
/*     */         break;
/*     */ 
/*     */ 
/*     */       
/*     */       case "huerotate":
/*  84 */         hueRotate = attributeNode.getFloat("values", 0.0F);
/*  85 */         if (hueRotate != 1.0F) {
/*  86 */           double radians = Math.toRadians(hueRotate);
/*  87 */           double sin = Math.sin(radians);
/*  88 */           double cos = Math.cos(radians);
/*     */           
/*  90 */           this.filter = new LinearRGBFilter(0.213D + cos * 0.787D - sin * 0.2127D, 0.715D - 0.715D * cos - 0.715D * sin, 0.072D - 0.072D * cos + 0.982D * sin, 0.213D - cos * 0.213D + sin * 0.143D, 0.715D + 0.285D * cos + 0.14D * sin, 0.072D - 0.072D * cos - 0.283D * sin, 0.213D - cos * 0.213D - sin * 0.787D, 0.715D - 0.715D * cos + 0.715D * sin, 0.072D + 0.982D * cos + 0.072D * sin);
/*     */         } 
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case "luminancetoalpha":
/*  98 */         this.filter = new LuminanceToAlphaFilter();
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
/* 112 */     LayoutBounds bounds = impl().layoutInput(filterLayoutContext).withFlags(new LayoutBounds.ComputeFlags((this.filter != null && !this.filter.isLinear())));
/* 113 */     impl().saveLayoutResult(bounds, filterLayoutContext);
/*     */   }
/*     */ 
/*     */   
/*     */   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
/* 118 */     RGBImageFilter f = this.filter;
/* 119 */     if (f == null) {
/* 120 */       impl().noop(filterContext);
/*     */       return;
/*     */     } 
/* 123 */     impl().saveResult(impl().inputChannel(filterContext).applyFilter(f), filterContext);
/*     */   }
/*     */   
/*     */   private static int toRgbRange(double value) {
/* 127 */     return (int)Math.max(Math.min(Math.round(value), 255L), 0L);
/*     */   }
/*     */   private static abstract class AffineRGBImageFilter extends RGBImageFilter {
/*     */     private AffineRGBImageFilter() {}
/*     */     abstract boolean isLinear(); }
/*     */   private static final class MatrixRGBFilter extends AffineRGBImageFilter { private final double r1; private final double r2; private final double r3;
/*     */     private final double r4;
/*     */     private final double r5;
/*     */     private final double g1;
/*     */     private final double g2;
/*     */     private final double g3;
/*     */     private final double g4;
/*     */     private final double g5;
/*     */     
/*     */     private MatrixRGBFilter(double[] values) {
/* 142 */       this.r1 = values[0];
/* 143 */       this.r2 = values[1];
/* 144 */       this.r3 = values[2];
/* 145 */       this.r4 = values[3];
/* 146 */       this.r5 = values[4];
/*     */       
/* 148 */       this.g1 = values[5];
/* 149 */       this.g2 = values[6];
/* 150 */       this.g3 = values[7];
/* 151 */       this.g4 = values[8];
/* 152 */       this.g5 = values[9];
/*     */       
/* 154 */       this.b1 = values[10];
/* 155 */       this.b2 = values[11];
/* 156 */       this.b3 = values[12];
/* 157 */       this.b4 = values[13];
/* 158 */       this.b5 = values[14];
/*     */       
/* 160 */       this.a1 = values[15];
/* 161 */       this.a2 = values[16];
/* 162 */       this.a3 = values[17];
/* 163 */       this.a4 = values[18];
/* 164 */       this.a5 = values[19];
/*     */     }
/*     */     private final double b1; private final double b2; private final double b3; private final double b4; private final double b5; private final double a1; private final double a2; private final double a3; private final double a4; private final double a5;
/*     */     
/*     */     boolean isLinear() {
/* 169 */       return (this.r5 == 0.0D && this.g5 == 0.0D && this.b5 == 0.0D && this.a5 == 0.0D);
/*     */     }
/*     */ 
/*     */     
/*     */     public int filterRGB(int x, int y, int rgb) {
/* 174 */       int a = rgb >> 24 & 0xFF;
/* 175 */       int r = rgb >> 16 & 0xFF;
/* 176 */       int g = rgb >> 8 & 0xFF;
/* 177 */       int b = rgb & 0xFF;
/*     */       
/* 179 */       int nr = FeColorMatrix.toRgbRange(this.r1 * r + this.r2 * g + this.r3 * b + this.r4 * a + this.r5 * 255.0D);
/* 180 */       int ng = FeColorMatrix.toRgbRange(this.g1 * r + this.g2 * g + this.g3 * b + this.g4 * a + this.g5 * 255.0D);
/* 181 */       int nb = FeColorMatrix.toRgbRange(this.b1 * r + this.b2 * g + this.b3 * b + this.b4 * a + this.b5 * 255.0D);
/* 182 */       int na = FeColorMatrix.toRgbRange(this.a1 * r + this.a2 * g + this.a3 * b + this.a4 * a + this.a5 * 255.0D);
/*     */       
/* 184 */       return (na & 0xFF) << 24 | (nr & 0xFF) << 16 | (ng & 0xFF) << 8 | nb & 0xFF;
/*     */     } }
/*     */ 
/*     */   
/*     */   private static final class LinearRGBFilter extends AffineRGBImageFilter {
/*     */     private final double r1;
/*     */     private final double r2;
/*     */     private final double r3;
/*     */     private final double g1;
/*     */     private final double g2;
/*     */     private final double g3;
/*     */     private final double b1;
/*     */     private final double b2;
/*     */     private final double b3;
/*     */     
/*     */     private LinearRGBFilter(double r1, double r2, double r3, double g1, double g2, double g3, double b1, double b2, double b3) {
/* 200 */       this.r1 = r1;
/* 201 */       this.r2 = r2;
/* 202 */       this.r3 = r3;
/* 203 */       this.g1 = g1;
/* 204 */       this.g2 = g2;
/* 205 */       this.g3 = g3;
/* 206 */       this.b1 = b1;
/* 207 */       this.b2 = b2;
/* 208 */       this.b3 = b3;
/*     */     }
/*     */ 
/*     */     
/*     */     boolean isLinear() {
/* 213 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public int filterRGB(int x, int y, int rgb) {
/* 218 */       int a = rgb >> 24 & 0xFF;
/* 219 */       int r = rgb >> 16 & 0xFF;
/* 220 */       int g = rgb >> 8 & 0xFF;
/* 221 */       int b = rgb & 0xFF;
/*     */       
/* 223 */       int nr = FeColorMatrix.toRgbRange(this.r1 * r + this.r2 * g + this.r3 * b);
/* 224 */       int ng = FeColorMatrix.toRgbRange(this.g1 * r + this.g2 * g + this.g3 * b);
/* 225 */       int nb = FeColorMatrix.toRgbRange(this.b1 * r + this.b2 * g + this.b3 * b);
/*     */       
/* 227 */       return a << 24 | (nr & 0xFF) << 16 | (ng & 0xFF) << 8 | nb & 0xFF;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static final class LuminanceToAlphaFilter
/*     */     extends AffineRGBImageFilter
/*     */   {
/*     */     private LuminanceToAlphaFilter() {}
/*     */     
/*     */     boolean isLinear() {
/* 238 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public int filterRGB(int x, int y, int rgb) {
/* 243 */       int r = rgb >> 16 & 0xFF;
/* 244 */       int g = rgb >> 8 & 0xFF;
/* 245 */       int b = rgb & 0xFF;
/*     */       
/* 247 */       int na = FeColorMatrix.toRgbRange(0.2125D * r + 0.7164D * g + 0.0712D * b);
/* 248 */       return (na & 0xFF) << 24;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\FeColorMatrix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */