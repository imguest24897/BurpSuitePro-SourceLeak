/*     */ package com.formdev.flatlaf.extras;
/*     */ 
/*     */ import com.formdev.flatlaf.util.MultiResolutionImageSupport;
/*     */ import com.formdev.flatlaf.util.SystemInfo;
/*     */ import com.github.weisj.jsvg.SVGDocument;
/*     */ import com.github.weisj.jsvg.geometry.size.FloatSize;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Image;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.net.URL;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
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
/*     */ public class FlatSVGUtils
/*     */ {
/*     */   public static List<Image> createWindowIconImages(String svgName) {
/*  60 */     return createWindowIconImages(getResource(svgName));
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
/*     */   public static List<Image> createWindowIconImages(URL svgUrl) {
/*  85 */     SVGDocument document = FlatSVGIcon.loadSVG(svgUrl);
/*     */     
/*  87 */     if (SystemInfo.isWindows && MultiResolutionImageSupport.isAvailable())
/*     */     {
/*  89 */       return Collections.singletonList(MultiResolutionImageSupport.create(0, new Dimension[] { new Dimension(16, 16), new Dimension(20, 20), new Dimension(24, 24), new Dimension(28, 28), new Dimension(32, 32), new Dimension(48, 48), new Dimension(64, 64) }dim -> svg2image(document, dim.width, dim.height)));
/*     */     }
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
/* 107 */     return Arrays.asList(new Image[] {
/* 108 */           svg2image(document, 16, 16), 
/* 109 */           svg2image(document, 20, 20), 
/* 110 */           svg2image(document, 24, 24), 
/* 111 */           svg2image(document, 28, 28), 
/* 112 */           svg2image(document, 32, 32), 
/* 113 */           svg2image(document, 48, 48), 
/* 114 */           svg2image(document, 64, 64)
/*     */         });
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static BufferedImage svg2image(String svgName, int width, int height) {
/* 132 */     return svg2image(getResource(svgName), width, height);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static BufferedImage svg2image(URL svgUrl, int width, int height) {
/* 150 */     return svg2image(FlatSVGIcon.loadSVG(svgUrl), width, height);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static BufferedImage svg2image(String svgName, float scaleFactor) {
/* 165 */     return svg2image(getResource(svgName), scaleFactor);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static BufferedImage svg2image(URL svgUrl, float scaleFactor) {
/* 182 */     SVGDocument document = FlatSVGIcon.loadSVG(svgUrl);
/* 183 */     FloatSize size = document.size();
/* 184 */     int width = (int)(size.width * scaleFactor);
/* 185 */     int height = (int)(size.height * scaleFactor);
/* 186 */     return svg2image(document, width, height);
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
/*     */   
/*     */   private static BufferedImage svg2image(SVGDocument document, int width, int height) {
/* 199 */     BufferedImage image = new BufferedImage(width, height, 2);
/*     */     
/* 201 */     Graphics2D g = image.createGraphics();
/*     */     try {
/* 203 */       FlatSVGIcon.setRenderingHints(g);
/*     */       
/* 205 */       FloatSize size = document.size();
/* 206 */       double sx = (width / size.width);
/* 207 */       double sy = (height / size.height);
/* 208 */       if (sx != 1.0D || sy != 1.0D) {
/* 209 */         g.scale(sx, sy);
/*     */       }
/* 211 */       document.render(null, g);
/*     */     } finally {
/* 213 */       g.dispose();
/*     */     } 
/* 215 */     return image;
/*     */   }
/*     */   
/*     */   private static URL getResource(String svgName) {
/* 219 */     return FlatSVGUtils.class.getResource(svgName);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\extras\FlatSVGUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */