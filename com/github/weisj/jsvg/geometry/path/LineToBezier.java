/*    */ package com.github.weisj.jsvg.geometry.path;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.mesh.Bezier;
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
/*    */ final class LineToBezier
/*    */   implements BezierPathCommand
/*    */ {
/*    */   private final boolean relative;
/*    */   private final float x;
/*    */   private final float y;
/*    */   
/*    */   public LineToBezier(boolean relative, float x, float y) {
/* 37 */     this.relative = relative;
/* 38 */     this.x = x;
/* 39 */     this.y = y;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Bezier createBezier(@NotNull Point2D.Float start) {
/* 44 */     if (this.relative) {
/* 45 */       return Bezier.straightLine(start, new Point2D.Float(start.x + this.x, start.y + this.y));
/*    */     }
/* 47 */     return Bezier.straightLine(start, new Point2D.Float(this.x, this.y));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\LineToBezier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */