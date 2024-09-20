/*     */ package com.github.weisj.jsvg.util;
/*     */ 
/*     */ import java.awt.Color;
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
/*     */ public final class ColorUtil
/*     */ {
/*     */   public static Color withAlpha(@NotNull Color c, float alpha) {
/*  33 */     int a = Math.max(Math.min(255, (int)(alpha * 255.0F)), 0);
/*  34 */     return new Color(c.getRed(), c.getGreen(), c.getBlue(), a);
/*     */   }
/*     */   
/*     */   public static String toString(@Nullable Color c) {
/*  38 */     if (c == null) return "null"; 
/*  39 */     return String.format("Color[%d,%d,%d,%d]", new Object[] { Integer.valueOf(c.getRed()), Integer.valueOf(c.getGreen()), Integer.valueOf(c.getBlue()), Integer.valueOf(c.getAlpha()) });
/*     */   }
/*     */   public static void RGBtoHSL(int r, int g, int b, float[] hsl) {
/*     */     float minComponent, maxComponent, h, s;
/*  43 */     if (r < 0)
/*  44 */     { r = 0; }
/*  45 */     else if (r > 255) { r = 255; }
/*  46 */      if (g < 0)
/*  47 */     { g = 0; }
/*  48 */     else if (g > 255) { g = 255; }
/*  49 */      if (b < 0)
/*  50 */     { b = 0; }
/*  51 */     else if (b > 255) { b = 255; }
/*     */     
/*  53 */     float componentR = r / 255.0F;
/*  54 */     float componentG = g / 255.0F;
/*  55 */     float componentB = b / 255.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  60 */     if (componentR > componentG) {
/*  61 */       minComponent = componentG;
/*  62 */       maxComponent = componentR;
/*     */     } else {
/*  64 */       minComponent = componentR;
/*  65 */       maxComponent = componentG;
/*     */     } 
/*  67 */     if (componentB > maxComponent) {
/*  68 */       maxComponent = componentB;
/*     */     }
/*  70 */     if (componentB < minComponent) {
/*  71 */       minComponent = componentB;
/*     */     }
/*     */     
/*  74 */     float deltaMax = maxComponent - minComponent;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  79 */     float l = (maxComponent + minComponent) / 2.0F;
/*     */     
/*  81 */     if (deltaMax - 0.01F <= 0.0F) {
/*  82 */       h = 0.0F;
/*  83 */       s = 0.0F;
/*     */     } else {
/*  85 */       if (l < 0.5F) {
/*  86 */         assert maxComponent + minComponent != 0.0F;
/*  87 */         s = deltaMax / (maxComponent + minComponent);
/*     */       } else {
/*  89 */         s = deltaMax / (2.0F - maxComponent - minComponent);
/*     */       } 
/*     */       
/*  92 */       assert deltaMax > 0.0F;
/*  93 */       float deltaR = ((maxComponent - componentR) / 6.0F + deltaMax / 2.0F) / deltaMax;
/*  94 */       float deltaG = ((maxComponent - componentG) / 6.0F + deltaMax / 2.0F) / deltaMax;
/*  95 */       float deltaB = ((maxComponent - componentB) / 6.0F + deltaMax / 2.0F) / deltaMax;
/*     */       
/*  97 */       if (componentR == maxComponent) {
/*  98 */         h = deltaB - deltaG;
/*  99 */       } else if (componentG == maxComponent) {
/* 100 */         h = 0.33333334F + deltaR - deltaB;
/*     */       } else {
/* 102 */         h = 0.6666667F + deltaG - deltaR;
/*     */       } 
/* 104 */       if (h < 0.0F) {
/* 105 */         h++;
/*     */       }
/* 107 */       if (h > 1.0F) {
/* 108 */         h--;
/*     */       }
/*     */     } 
/*     */     
/* 112 */     hsl[0] = h;
/* 113 */     hsl[1] = s;
/* 114 */     hsl[2] = l;
/*     */   }
/*     */   public static void HSLtoRGB(float h, float s, float l, int[] rgb) {
/*     */     int r, g, b;
/* 118 */     if (h < 0.0F)
/* 119 */     { h = 0.0F; }
/* 120 */     else if (h > 1.0F) { h = 1.0F; }
/* 121 */      if (s < 0.0F)
/* 122 */     { s = 0.0F; }
/* 123 */     else if (s > 1.0F) { s = 1.0F; }
/* 124 */      if (l < 0.0F)
/* 125 */     { l = 0.0F; }
/* 126 */     else if (l > 1.0F) { l = 1.0F; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 132 */     if (s - 0.01F <= 0.0F) {
/* 133 */       r = (int)(l * 255.0F);
/* 134 */       g = (int)(l * 255.0F);
/* 135 */       b = (int)(l * 255.0F);
/*     */     } else {
/*     */       float y;
/*     */       
/* 139 */       if (l < 0.5F) {
/* 140 */         y = l * (1.0F + s);
/*     */       } else {
/* 142 */         y = l + s - s * l;
/*     */       } 
/* 144 */       float x = 2.0F * l - y;
/*     */       
/* 146 */       r = (int)(255.0F * hue2RGB(x, y, h + 0.33333334F));
/* 147 */       g = (int)(255.0F * hue2RGB(x, y, h));
/* 148 */       b = (int)(255.0F * hue2RGB(x, y, h - 0.33333334F));
/*     */     } 
/*     */     
/* 151 */     rgb[0] = r;
/* 152 */     rgb[1] = g;
/* 153 */     rgb[2] = b;
/*     */   }
/*     */   
/*     */   private static float hue2RGB(float v1, float v2, float vH) {
/* 157 */     if (vH < 0.0F) {
/* 158 */       vH++;
/*     */     }
/* 160 */     if (vH > 1.0F) {
/* 161 */       vH--;
/*     */     }
/* 163 */     if (6.0F * vH < 1.0F) {
/* 164 */       return v1 + (v2 - v1) * 6.0F * vH;
/*     */     }
/* 166 */     if (2.0F * vH < 1.0F) {
/* 167 */       return v2;
/*     */     }
/* 169 */     if (3.0F * vH < 2.0F) {
/* 170 */       return v1 + (v2 - v1) * (0.6666667F - vH) * 6.0F;
/*     */     }
/* 172 */     return v1;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsv\\util\ColorUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */