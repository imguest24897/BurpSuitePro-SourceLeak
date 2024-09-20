/*     */ package com.github.weisj.jsvg.geometry.util;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.size.FloatInsets;
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.PathIterator;
/*     */ import java.awt.geom.Point2D;
/*     */ import java.awt.geom.Rectangle2D;
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
/*     */ 
/*     */ public final class GeometryUtil
/*     */ {
/*     */   private static final float EPS = 1.0E-4F;
/*     */   
/*     */   public static boolean approximatelyEqual(double a, double b) {
/*  41 */     return (Math.abs(a - b) < 9.999999747378752E-5D);
/*     */   }
/*     */   
/*     */   public static boolean approximatelyZero(double a) {
/*  45 */     return approximatelyEqual(a, 0.0D);
/*     */   }
/*     */   
/*     */   public static boolean notablyGreater(double a, double b) {
/*  49 */     return (a - b > 9.999999747378752E-5D);
/*     */   }
/*     */   
/*     */   public static boolean approximatelyNegative(double a) {
/*  53 */     return (a < 9.999999747378752E-5D);
/*     */   }
/*     */   
/*     */   public static double scaleXOfTransform(@Nullable AffineTransform at) {
/*  57 */     if (at == null) return 1.0D; 
/*  58 */     double sx = at.getScaleX();
/*  59 */     double shy = at.getShearY();
/*  60 */     return Math.sqrt(sx * sx + shy * shy);
/*     */   }
/*     */   
/*     */   public static double scaleYOfTransform(@Nullable AffineTransform at) {
/*  64 */     if (at == null) return 1.0D; 
/*  65 */     double sy = at.getScaleY();
/*  66 */     double shx = at.getShearX();
/*  67 */     return Math.sqrt(sy * sy + shx * shx);
/*     */   }
/*     */   @NotNull
/*     */   public static Point2D.Float midPoint(@NotNull Point2D.Float x, @NotNull Point2D.Float y) {
/*  71 */     return new Point2D.Float((x.x + y.x) / 2.0F, (x.y + y.y) / 2.0F);
/*     */   }
/*     */   @NotNull
/*     */   public static Point2D.Float lerp(float t, @NotNull Point2D.Float a, @NotNull Point2D.Float b) {
/*  75 */     return new Point2D.Float(lerp(t, b.x, a.x), lerp(t, b.y, a.y));
/*     */   }
/*     */   
/*     */   public static float lerp(float t, float a, float b) {
/*  79 */     return (1.0F - t) * a + t * b;
/*     */   }
/*     */ 
/*     */   
/*     */   public static double distanceSquared(@NotNull Point2D.Float p1, @NotNull Point2D.Float p2, float scaleX, float scaleY) {
/*  84 */     return distanceSquared((scaleX * p1.x), (scaleY * p1.y), (scaleX * p2.x), (scaleY * p2.y));
/*     */   }
/*     */   
/*     */   public static double distanceSquared(@NotNull Point2D.Float p1, @NotNull Point2D.Float p2) {
/*  88 */     return distanceSquared(p1.x, p1.y, p2.x, p2.y);
/*     */   }
/*     */   
/*     */   public static double distanceSquared(double x1, double y1, double x2, double y2) {
/*  92 */     double dx = x2 - x1;
/*  93 */     double dy = y2 - y1;
/*  94 */     return dx * dx + dy * dy;
/*     */   }
/*     */   
/*     */   public static double pathLength(@NotNull Shape shape) {
/*  98 */     PathLengthCalculator pathLengthCalculator = new PathLengthCalculator();
/*  99 */     PathIterator pathIterator = shape.getPathIterator(null);
/* 100 */     double length = 0.0D;
/* 101 */     double[] args = new double[6];
/* 102 */     while (!pathIterator.isDone()) {
/* 103 */       length += pathLengthCalculator.segmentLength(pathIterator.currentSegment(args), args);
/* 104 */       pathIterator.next();
/*     */     } 
/* 106 */     return length;
/*     */   }
/*     */   
/*     */   public static double lineLength(double x1, double y1, double x2, double y2) {
/* 110 */     return Math.sqrt(distanceSquared(x1, y1, x2, y2));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static Rectangle2D containingBoundsAfterTransform(@NotNull AffineTransform transform, @NotNull Rectangle2D rect) {
/* 115 */     Point2D.Double p1 = new Point2D.Double(rect.getX(), rect.getY());
/* 116 */     Point2D.Double p2 = new Point2D.Double(rect.getX() + rect.getWidth(), rect.getY());
/* 117 */     Point2D.Double p3 = new Point2D.Double(rect.getX(), rect.getY() + rect.getHeight());
/* 118 */     Point2D.Double p4 = new Point2D.Double(rect.getX() + rect.getWidth(), rect.getY() + rect.getHeight());
/* 119 */     Rectangle2D r1 = rect.getBounds2D();
/* 120 */     r1.setFrameFromDiagonal(transform.transform(p1, p1), transform.transform(p2, p2));
/* 121 */     Rectangle2D r2 = rect.getBounds2D();
/* 122 */     r2.setFrameFromDiagonal(transform.transform(p3, p3), transform.transform(p4, p4));
/* 123 */     Rectangle2D.union(r1, r2, r1);
/* 124 */     return r1;
/*     */   }
/*     */   
/*     */   public static float left(@NotNull Rectangle2D rect) {
/* 128 */     return (float)rect.getX();
/*     */   }
/*     */   
/*     */   public static float top(@NotNull Rectangle2D rect) {
/* 132 */     return (float)rect.getY();
/*     */   }
/*     */   
/*     */   public static float right(@NotNull Rectangle2D rect) {
/* 136 */     return (float)(rect.getX() + rect.getWidth());
/*     */   }
/*     */   
/*     */   public static float bottom(@NotNull Rectangle2D rect) {
/* 140 */     return (float)(rect.getY() + rect.getHeight());
/*     */   }
/*     */   @NotNull
/*     */   public static Rectangle2D grow(@NotNull Rectangle2D bounds, FloatInsets grow) {
/* 144 */     return new Rectangle2D.Double(bounds
/* 145 */         .getX() - grow.left(), bounds
/* 146 */         .getY() - grow.top(), bounds
/* 147 */         .getWidth() + grow.left() + grow.right(), bounds
/* 148 */         .getHeight() + grow.top() + grow.bottom());
/*     */   }
/*     */   @NotNull
/*     */   public static FloatInsets max(@NotNull FloatInsets in1, @NotNull FloatInsets in2) {
/* 152 */     return new FloatInsets(
/* 153 */         Math.max(in1.top(), in2.top()), 
/* 154 */         Math.max(in1.left(), in2.left()), 
/* 155 */         Math.max(in1.bottom(), in2.bottom()), 
/* 156 */         Math.max(in1.right(), in2.right()));
/*     */   }
/*     */   @NotNull
/*     */   public static FloatInsets min(@NotNull FloatInsets in1, @NotNull FloatInsets in2) {
/* 160 */     return new FloatInsets(
/* 161 */         Math.min(in1.top(), in2.top()), 
/* 162 */         Math.min(in1.left(), in2.left()), 
/* 163 */         Math.min(in1.bottom(), in2.bottom()), 
/* 164 */         Math.min(in1.right(), in2.right()));
/*     */   }
/*     */   @NotNull
/*     */   public static FloatInsets overhangInsets(@NotNull Rectangle2D reference, @NotNull Rectangle2D bounds) {
/* 168 */     return new FloatInsets(
/* 169 */         Math.max(0.0F, top(reference) - top(bounds)), 
/* 170 */         Math.max(0.0F, left(reference) - left(bounds)), 
/* 171 */         Math.max(0.0F, bottom(bounds) - bottom(reference)), 
/* 172 */         Math.max(0.0F, right(bounds) - right(reference)));
/*     */   }
/*     */   @NotNull
/*     */   public static String compactRepresentation(@NotNull Rectangle2D rect) {
/* 176 */     return "[" + rect.getX() + ", " + rect.getY() + ", " + rect.getWidth() + "x" + rect.getHeight() + "]";
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometr\\util\GeometryUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */