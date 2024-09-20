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
/*    */ final class LineTo
/*    */   extends PathCommand
/*    */ {
/*    */   private final float x;
/*    */   private final float y;
/*    */   
/*    */   public LineTo(boolean isRelative, float x, float y) {
/* 39 */     super(isRelative, 2);
/* 40 */     this.x = x;
/* 41 */     this.y = y;
/*    */   }
/*    */   
/*    */   public float x() {
/* 45 */     return this.x;
/*    */   }
/*    */   
/*    */   public float y() {
/* 49 */     return this.y;
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
/* 54 */     Point2D.Float offset = offset(hist);
/*    */     
/* 56 */     path.lineTo((this.x + offset.x), (this.y + offset.y));
/* 57 */     hist.setLastPoint(path.getCurrentPoint());
/* 58 */     hist.setLastKnot(path.getCurrentPoint());
/*    */   }
/*    */ 
/*    */   
/*    */   public int nodeCount() {
/* 63 */     return 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 68 */     return "L " + this.x + " " + this.y;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\LineTo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */