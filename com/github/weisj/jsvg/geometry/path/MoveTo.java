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
/*    */ final class MoveTo
/*    */   extends PathCommand
/*    */ {
/*    */   private final float x;
/*    */   private final float y;
/*    */   
/*    */   public MoveTo(boolean isRelative, float x, float y) {
/* 39 */     super(isRelative, 2);
/* 40 */     this.x = x;
/* 41 */     this.y = y;
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
/* 46 */     Point2D.Float offset = offset(hist);
/*    */     
/* 48 */     path.moveTo((this.x + offset.x), (this.y + offset.y));
/* 49 */     hist.setStartPoint(path.getCurrentPoint());
/* 50 */     hist.setLastPoint(path.getCurrentPoint());
/* 51 */     hist.setLastKnot(path.getCurrentPoint());
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 56 */     return "M " + this.x + " " + this.y;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\MoveTo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */