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
/*    */ 
/*    */ 
/*    */ 
/*    */ final class LineBezier
/*    */   extends Bezier
/*    */ {
/*    */   LineBezier(@NotNull Point2D.Float a, @NotNull Point2D.Float b) {
/* 36 */     super(a, GeometryUtil.lerp(0.33333334F, b, a), GeometryUtil.lerp(0.6666667F, b, a), b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendTo(@NotNull Path2D p) {
/* 41 */     p.lineTo(this.d.x, this.d.y);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Split<Bezier> split() {
/* 46 */     Point2D.Float mid = GeometryUtil.midPoint(this.a, this.d);
/* 47 */     return new Split<>(new LineBezier(this.a, mid), new LineBezier(mid, this.d));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\mesh\LineBezier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */