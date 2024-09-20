/*    */ package com.github.weisj.jsvg.geometry.mesh;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.util.GeometryUtil;
/*    */ import java.awt.geom.Path2D;
/*    */ import java.awt.geom.Point2D;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Bezier
/*    */ {
/*    */   @NotNull
/*    */   public final Point2D.Float a;
/*    */   @NotNull
/*    */   public final Point2D.Float b;
/*    */   @NotNull
/*    */   public final Point2D.Float c;
/*    */   @NotNull
/*    */   public final Point2D.Float d;
/*    */   
/*    */   public Bezier(@NotNull Point2D.Float a, @NotNull Point2D.Float b, @NotNull Point2D.Float c, @NotNull Point2D.Float d) {
/* 41 */     this.a = a;
/* 42 */     this.b = b;
/* 43 */     this.c = c;
/* 44 */     this.d = d;
/*    */   }
/*    */   
/*    */   public void appendTo(@NotNull Path2D p) {
/* 48 */     p.curveTo(this.b.x, this.b.y, this.c.x, this.c.y, this.d.x, this.d.y);
/*    */   }
/*    */   @NotNull
/*    */   public Bezier inverse() {
/* 52 */     return new Bezier(this.d, this.c, this.b, this.a);
/*    */   }
/*    */   @NotNull
/*    */   public Split<Bezier> split() {
/* 56 */     Point2D.Float ab = GeometryUtil.midPoint(this.a, this.b);
/* 57 */     Point2D.Float bc = GeometryUtil.midPoint(this.b, this.c);
/* 58 */     Point2D.Float cd = GeometryUtil.midPoint(this.c, this.d);
/* 59 */     Point2D.Float abbc = GeometryUtil.midPoint(ab, bc);
/* 60 */     Point2D.Float bccd = GeometryUtil.midPoint(bc, cd);
/* 61 */     Point2D.Float abbcbccd = GeometryUtil.midPoint(abbc, bccd);
/* 62 */     return new Split<>(new Bezier(this.a, ab, abbc, abbcbccd), new Bezier(abbcbccd, bccd, cd, this.d));
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static Bezier straightLine(Point2D.Float a, Point2D.Float b) {
/* 68 */     return new LineBezier(a, b);
/*    */   }
/*    */   @NotNull
/*    */   public static Bezier combine(@NotNull Bezier b1, @NotNull Bezier b2, @NotNull Bezier b3) {
/* 72 */     return new Bezier(
/* 73 */         MeshUtil.p(b1.a.x + b2.a.x - b3.a.x, b1.a.y + b2.a.y - b3.a.y), 
/* 74 */         MeshUtil.p(b1.b.x + b2.b.x - b3.b.x, b1.b.y + b2.b.y - b3.b.y), 
/* 75 */         MeshUtil.p(b1.c.x + b2.c.x - b3.c.x, b1.c.y + b2.c.y - b3.c.y), 
/* 76 */         MeshUtil.p(b1.d.x + b2.d.x - b3.d.x, b1.d.y + b2.d.y - b3.d.y));
/*    */   }
/*    */   
/*    */   public int estimateStepCount(float scaleX, float scaleY) {
/* 80 */     double steps = Math.max(
/* 81 */         Math.max(GeometryUtil.distanceSquared(this.a, this.b, scaleX, scaleY), GeometryUtil.distanceSquared(this.c, this.d, scaleX, scaleY)), 
/* 82 */         Math.max(GeometryUtil.distanceSquared(this.a, this.c, scaleX, scaleY) / 4.0D, GeometryUtil.distanceSquared(this.b, this.d, scaleX, scaleY) / 4.0D));
/* 83 */     steps *= 18.0D;
/* 84 */     steps = Math.max(1.0D, steps);
/* 85 */     return (Math.getExponent(steps) + 1) / 2;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 91 */     return "Bezier{a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\mesh\Bezier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */