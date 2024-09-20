/*     */ package com.github.weisj.jsvg.nodes.filter;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.filter.BlendMode;
/*     */ import com.github.weisj.jsvg.util.ColorUtil;
/*     */ import java.awt.AlphaComposite;
/*     */ import java.awt.Composite;
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
/*     */ public final class BlendModeComposite
/*     */   extends AbstractBlendComposite
/*     */ {
/*     */   @NotNull
/*     */   private final AbstractBlendComposite.Blender blender;
/*     */   
/*     */   private BlendModeComposite(BlendMode blendMode) {
/*  36 */     this.blender = createBlender(blendMode);
/*     */   }
/*     */   @NotNull
/*     */   public static Composite create(BlendMode mode) {
/*  40 */     if (mode == BlendMode.Normal) return AlphaComposite.SrcOver; 
/*  41 */     return new BlendModeComposite(mode);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected AbstractBlendComposite.Blender blender() {
/*  46 */     return this.blender;
/*     */   }
/*     */   
/*     */   private static AbstractBlendComposite.Blender createBlender(BlendMode blendMode) {
/*  50 */     switch (blendMode) {
/*     */       case Normal:
/*  52 */         throw new IllegalStateException("Use AlphaComposite.SrcOver instead");
/*     */       case Multiply:
/*  54 */         return (src, dst, result) -> {
/*     */             result[0] = src[0] * dst[0] >> 8;
/*     */             result[1] = src[1] * dst[1] >> 8;
/*     */             result[2] = src[2] * dst[2] >> 8;
/*     */             result[3] = src[3] * dst[3] >> 8;
/*     */           };
/*     */       case Screen:
/*  61 */         return (src, dst, result) -> {
/*     */             result[0] = 255 - ((255 - src[0]) * (255 - dst[0]) >> 8);
/*     */             result[1] = 255 - ((255 - src[1]) * (255 - dst[1]) >> 8);
/*     */             result[2] = 255 - ((255 - src[2]) * (255 - dst[2]) >> 8);
/*     */             result[3] = 255 - ((255 - src[3]) * (255 - dst[3]) >> 8);
/*     */           };
/*     */       case Overlay:
/*  68 */         return (src, dst, result) -> {
/*     */             result[0] = (dst[0] < 128) ? (dst[0] * src[0] >> 7) : (255 - ((255 - dst[0]) * (255 - src[0]) >> 7));
/*     */             result[1] = (dst[1] < 128) ? (dst[1] * src[1] >> 7) : (255 - ((255 - dst[1]) * (255 - src[1]) >> 7));
/*     */             result[2] = (dst[2] < 128) ? (dst[2] * src[2] >> 7) : (255 - ((255 - dst[2]) * (255 - src[2]) >> 7));
/*     */             result[3] = (dst[3] < 128) ? (dst[3] * src[3] >> 7) : (255 - ((255 - dst[3]) * (255 - src[3]) >> 7));
/*     */           };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case Darken:
/*  83 */         return (src, dst, result) -> {
/*     */             result[0] = Math.min(src[0], dst[0]);
/*     */             result[1] = Math.min(src[1], dst[1]);
/*     */             result[2] = Math.min(src[2], dst[2]);
/*     */             result[3] = Math.min(255, src[3] + dst[3] - src[3] * dst[3] / 255);
/*     */           };
/*     */       case Lighten:
/*  90 */         return (src, dst, result) -> {
/*     */             result[0] = Math.max(src[0], dst[0]);
/*     */             result[1] = Math.max(src[1], dst[1]);
/*     */             result[2] = Math.max(src[2], dst[2]);
/*     */             result[3] = Math.min(255, src[3] + dst[3] - src[3] * dst[3] / 255);
/*     */           };
/*     */       case ColorDodge:
/*  97 */         return (src, dst, result) -> {
/*     */             result[0] = (src[0] == 255) ? 255 : Math.min((dst[0] << 8) / (255 - src[0]), 255);
/*     */             result[1] = (src[1] == 255) ? 255 : Math.min((dst[1] << 8) / (255 - src[1]), 255);
/*     */             result[2] = (src[2] == 255) ? 255 : Math.min((dst[2] << 8) / (255 - src[2]), 255);
/*     */             result[3] = Math.min(255, src[3] + dst[3] - src[3] * dst[3] / 255);
/*     */           };
/*     */       case ColorBurn:
/* 104 */         return (src, dst, result) -> {
/*     */             result[0] = (src[0] == 0) ? 0 : Math.max(0, 255 - (255 - dst[0] << 8) / src[0]);
/*     */             result[1] = (src[1] == 0) ? 0 : Math.max(0, 255 - (255 - dst[1] << 8) / src[1]);
/*     */             result[2] = (src[2] == 0) ? 0 : Math.max(0, 255 - (255 - dst[2] << 8) / src[2]);
/*     */             result[3] = Math.min(255, src[3] + dst[3] - src[3] * dst[3] / 255);
/*     */           };
/*     */       case HardLight:
/* 111 */         return (src, dst, result) -> {
/*     */             result[0] = (src[0] < 128) ? (dst[0] * src[0] >> 7) : (255 - ((255 - src[0]) * (255 - dst[0]) >> 7));
/*     */             result[1] = (src[1] < 128) ? (dst[1] * src[1] >> 7) : (255 - ((255 - src[1]) * (255 - dst[1]) >> 7));
/*     */             result[2] = (src[2] < 128) ? (dst[2] * src[2] >> 7) : (255 - ((255 - src[2]) * (255 - dst[2]) >> 7));
/*     */             result[3] = (src[3] < 128) ? (dst[3] * src[3] >> 7) : (255 - ((255 - src[3]) * (255 - dst[3]) >> 7));
/*     */           };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case SoftLight:
/* 126 */         return (src, dst, result) -> {
/*     */             int mRed = src[0] * dst[0] / 255;
/*     */             int mGreen = src[1] * dst[1] / 255;
/*     */             int mBlue = src[2] * dst[2] / 255;
/*     */             result[0] = mRed + src[0] * (255 - (255 - src[0]) * (255 - dst[0]) / 255 - mRed) / 255;
/*     */             result[1] = mGreen + src[1] * (255 - (255 - src[1]) * (255 - dst[1]) / 255 - mGreen) / 255;
/*     */             result[2] = mBlue + src[2] * (255 - (255 - src[2]) * (255 - dst[2]) / 255 - mBlue) / 255;
/*     */             result[3] = Math.min(255, src[3] + dst[3] - src[3] * dst[3] / 255);
/*     */           };
/*     */ 
/*     */ 
/*     */       
/*     */       case Difference:
/* 139 */         return (src, dst, result) -> {
/*     */             result[0] = Math.abs(dst[0] - src[0]);
/*     */             result[1] = Math.abs(dst[1] - src[1]);
/*     */             result[2] = Math.abs(dst[2] - src[2]);
/*     */             result[3] = Math.min(255, src[3] + dst[3] - src[3] * dst[3] / 255);
/*     */           };
/*     */       case Exclusion:
/* 146 */         return (src, dst, result) -> {
/*     */             result[0] = dst[0] + src[0] - (dst[0] * src[0] >> 7);
/*     */             result[1] = dst[1] + src[1] - (dst[1] * src[1] >> 7);
/*     */             result[2] = dst[2] + src[2] - (dst[2] * src[2] >> 7);
/*     */             result[3] = Math.min(255, src[3] + dst[3] - src[3] * dst[3] / 255);
/*     */           };
/*     */       case Hue:
/* 153 */         return (src, dst, result) -> {
/*     */             float[] srcHSL = new float[3];
/*     */             ColorUtil.RGBtoHSL(src[0], src[1], src[2], srcHSL);
/*     */             float[] dstHSL = new float[3];
/*     */             ColorUtil.RGBtoHSL(dst[0], dst[1], dst[2], dstHSL);
/*     */             ColorUtil.HSLtoRGB(srcHSL[0], dstHSL[1], dstHSL[2], result);
/*     */             result[3] = Math.min(255, src[3] + dst[3] - src[3] * dst[3] / 255);
/*     */           };
/*     */       
/*     */       case Saturation:
/* 163 */         return (src, dst, result) -> {
/*     */             float[] srcHSL = new float[3];
/*     */             ColorUtil.RGBtoHSL(src[0], src[1], src[2], srcHSL);
/*     */             float[] dstHSL = new float[3];
/*     */             ColorUtil.RGBtoHSL(dst[0], dst[1], dst[2], dstHSL);
/*     */             ColorUtil.HSLtoRGB(dstHSL[0], srcHSL[1], dstHSL[2], result);
/*     */             result[3] = Math.min(255, src[3] + dst[3] - src[3] * dst[3] / 255);
/*     */           };
/*     */       
/*     */       case Color:
/* 173 */         return (src, dst, result) -> {
/*     */             float[] srcHSL = new float[3];
/*     */             ColorUtil.RGBtoHSL(src[0], src[1], src[2], srcHSL);
/*     */             float[] dstHSL = new float[3];
/*     */             ColorUtil.RGBtoHSL(dst[0], dst[1], dst[2], dstHSL);
/*     */             ColorUtil.HSLtoRGB(srcHSL[0], srcHSL[1], dstHSL[2], result);
/*     */             result[3] = Math.min(255, src[3] + dst[3] - src[3] * dst[3] / 255);
/*     */           };
/*     */       
/*     */       case Luminosity:
/* 183 */         return (src, dst, result) -> {
/*     */             float[] srcHSL = new float[3];
/*     */             ColorUtil.RGBtoHSL(src[0], src[1], src[2], srcHSL);
/*     */             float[] dstHSL = new float[3];
/*     */             ColorUtil.RGBtoHSL(dst[0], dst[1], dst[2], dstHSL);
/*     */             ColorUtil.HSLtoRGB(dstHSL[0], dstHSL[1], srcHSL[2], result);
/*     */             result[3] = Math.min(255, src[3] + dst[3] - src[3] * dst[3] / 255);
/*     */           };
/*     */     } 
/*     */     
/* 193 */     throw new IllegalStateException("Mode not recognized " + blendMode);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\BlendModeComposite.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */