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
/*    */ final class QuadraticSmooth
/*    */   extends PathCommand
/*    */ {
/*    */   private final float x;
/*    */   private final float y;
/*    */   
/*    */   public QuadraticSmooth(boolean isRelative, float x, float y) {
/* 35 */     super(isRelative, 4);
/* 36 */     this.x = x;
/* 37 */     this.y = y;
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
/* 42 */     Point2D.Float offset = offset(hist);
/* 43 */     Point2D.Float knot = lastKnotReflection(hist);
/*    */     
/* 45 */     path.quadTo(knot.x, knot.y, (this.x + offset.x), (this.y + offset.y));
/* 46 */     hist.setLastPoint(path.getCurrentPoint());
/* 47 */     hist.setLastKnot(knot);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 52 */     return "T " + this.x + " " + this.y;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\QuadraticSmooth.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */