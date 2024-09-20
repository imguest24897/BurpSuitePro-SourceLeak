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
/*    */ 
/*    */ final class Quadratic
/*    */   extends PathCommand
/*    */ {
/*    */   private final float kx;
/*    */   private final float ky;
/*    */   private final float x;
/*    */   private final float y;
/*    */   
/*    */   public String toString() {
/* 42 */     return "Q " + this.kx + " " + this.ky + " " + this.x + " " + this.y;
/*    */   }
/*    */ 
/*    */   
/*    */   public Quadratic(boolean isRelative, float kx, float ky, float x, float y) {
/* 47 */     super(isRelative, 4);
/* 48 */     this.kx = kx;
/* 49 */     this.ky = ky;
/* 50 */     this.x = x;
/* 51 */     this.y = y;
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
/* 56 */     Point2D.Float offset = offset(hist);
/*    */     
/* 58 */     path.quadTo((this.kx + offset.x), (this.ky + offset.y), (this.x + offset.x), (this.y + offset.y));
/* 59 */     hist.setLastPoint(path.getCurrentPoint());
/* 60 */     hist.setLastKnot(this.kx + offset.x, this.ky + offset.y);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\Quadratic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */