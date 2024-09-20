/*    */ package com.github.weisj.jsvg.geometry.path;
/*    */ 
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
/*    */ 
/*    */ final class CubicSmooth
/*    */   extends PathCommand
/*    */ {
/*    */   private final float x;
/*    */   private final float y;
/*    */   private final float k2x;
/*    */   private final float k2y;
/*    */   
/*    */   public CubicSmooth(boolean isRelative, float k2x, float k2y, float x, float y) {
/* 41 */     super(isRelative, 6);
/* 42 */     this.k2x = k2x;
/* 43 */     this.k2y = k2y;
/* 44 */     this.x = x;
/* 45 */     this.y = y;
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
/* 50 */     Point2D.Float offset = offset(hist);
/* 51 */     Point2D.Float knot = lastKnotReflection(hist);
/*    */     
/* 53 */     path.curveTo(knot.x, knot.y, (this.k2x + offset.x), (this.k2y + offset.y), (this.x + offset.x), (this.y + offset.y));
/* 54 */     hist.setLastPoint(path.getCurrentPoint());
/* 55 */     hist.setLastKnot(this.k2x + offset.x, this.k2y + offset.y);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 60 */     return "S " + this.k2x + " " + this.k2y + " " + this.x + " " + this.y;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\CubicSmooth.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */