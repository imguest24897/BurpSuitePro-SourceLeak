/*     */ package com.github.weisj.jsvg.geometry.util;
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
/*     */ public final class PathLengthCalculator
/*     */ {
/*  30 */   private double x = 0.0D;
/*  31 */   private double y = 0.0D;
/*  32 */   private double xStart = this.x;
/*  33 */   private double yStart = this.y;
/*     */   
/*     */   public double segmentLength(int segmentType, double[] coords) {
/*  36 */     double segmentLength = 0.0D;
/*  37 */     switch (segmentType) {
/*     */       case 0:
/*  39 */         this.x = coords[0];
/*  40 */         this.y = coords[1];
/*  41 */         this.xStart = this.x;
/*  42 */         this.yStart = this.y;
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
/*  68 */         return segmentLength;case 1: segmentLength = lineLength(this.x, this.y, coords[0], coords[1]); this.x = coords[0]; this.y = coords[1]; return segmentLength;case 2: segmentLength = quadraticParametricLength(this.x, this.y, coords[0], coords[1], coords[2], coords[3]); this.x = coords[2]; this.y = coords[3]; return segmentLength;case 3: segmentLength = cubicParametricLength(this.x, this.y, coords[0], coords[1], coords[2], coords[3], coords[4], coords[5]); this.x = coords[4]; this.y = coords[5]; return segmentLength;case 4: segmentLength = lineLength(this.x, this.y, coords[0], coords[1]); this.x = this.xStart; this.y = this.yStart; return segmentLength;
/*     */     } 
/*     */     throw new IllegalStateException();
/*     */   }
/*     */   private double lineLength(double x1, double y1, double x2, double y2) {
/*  73 */     return GeometryUtil.lineLength(x1, y1, x2, y2);
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
/*     */   private double quadraticParametricLength(double ax, double ay, double bx, double by, double cx, double cy) {
/*  86 */     if (ax == cx && ay == cy) {
/*     */       
/*  88 */       if (ax == bx && ay == by) return 0.0D; 
/*  89 */       return lineLength(ax, ay, bx, by);
/*     */     } 
/*     */     
/*  92 */     if ((ax == bx && ay == by) || (cx == bx && cy == by))
/*     */     {
/*  94 */       return lineLength(ax, ay, cx, cy);
/*     */     }
/*  96 */     double ax0 = bx - ax;
/*  97 */     double ay0 = by - ay;
/*     */     
/*  99 */     double ax1 = ax - 2.0D * bx + cx;
/* 100 */     double ay1 = ay - 2.0D * by + cy;
/*     */     
/* 102 */     if (ax1 != 0.0D || ay1 != 0.0D) {
/* 103 */       double c = 4.0D * dot2D(ax1, ay1, ax1, ay1);
/* 104 */       double b = 8.0D * dot2D(ax0, ay0, ax1, ay1);
/* 105 */       double a = 8.0D * dot2D(ax0, ay0, ax0, ay0);
/* 106 */       double q = 4.0D * a * c - b * b;
/* 107 */       double twoCpB = 2.0D * c + b;
/* 108 */       double sumCBA = c + b + a;
/* 109 */       double l0 = 0.25D / c * (twoCpB * Math.sqrt(sumCBA) - b * Math.sqrt(a));
/* 110 */       if (q == 0.0D) return l0;
/*     */       
/* 112 */       double l1 = q / 8.0D * Math.pow(c, 1.5D) * (Math.log(2.0D * Math.sqrt(c * sumCBA) + twoCpB) - Math.log(2.0D * Math.sqrt(c * a) + b));
/* 113 */       return l0 + l1;
/*     */     } 
/* 115 */     return 2.0D * lineLength(0.0D, 0.0D, ax0, ay0);
/*     */   }
/*     */ 
/*     */   
/*     */   private double dot2D(double x1, double y1, double x2, double y2) {
/* 120 */     return x1 * x2 * y1 * y2;
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
/*     */   private double cubicParametricLength(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
/* 136 */     double qx = (3.0D * cx - dx + 3.0D * bx - ax) / 4.0D;
/* 137 */     double qy = (3.0D * cy - dy + 3.0D * by - ay) / 4.0D;
/* 138 */     return quadraticParametricLength(ax, ay, qx, qy, dx, dy);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometr\\util\PathLengthCalculator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */