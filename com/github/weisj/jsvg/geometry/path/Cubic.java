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
/*    */ final class Cubic
/*    */   extends PathCommand
/*    */ {
/*    */   private final float k1x;
/*    */   private final float k1y;
/*    */   private final float k2x;
/*    */   private final float k2y;
/*    */   private final float x;
/*    */   private final float y;
/*    */   
/*    */   public Cubic(boolean isRelative, float k1x, float k1y, float k2x, float k2y, float x, float y) {
/* 43 */     super(isRelative, 6);
/* 44 */     this.k1x = k1x;
/* 45 */     this.k1y = k1y;
/* 46 */     this.k2x = k2x;
/* 47 */     this.k2y = k2y;
/* 48 */     this.x = x;
/* 49 */     this.y = y;
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
/* 54 */     Point2D.Float offset = offset(hist);
/*    */     
/* 56 */     path.curveTo((this.k1x + offset.x), (this.k1y + offset.y), (this.k2x + offset.x), (this.k2y + offset.y), (this.x + offset.x), (this.y + offset.y));
/*    */ 
/*    */     
/* 59 */     hist.setLastPoint(path.getCurrentPoint());
/* 60 */     hist.setLastKnot(this.k2x + offset.x, this.k2y + offset.y);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 65 */     return "C " + this.k1x + " " + this.k1y + " " + this.k2x + " " + this.k2y + " " + this.x + " " + this.y;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\Cubic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */