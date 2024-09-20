/*    */ package com.github.weisj.jsvg.geometry.path;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class BuildHistory
/*    */ {
/*    */   @NotNull
/* 38 */   final Point2D.Float startPoint = new Point2D.Float(); @NotNull
/* 39 */   final Point2D.Float lastPoint = new Point2D.Float(); @NotNull
/* 40 */   final Point2D.Float lastKnot = new Point2D.Float();
/*    */   
/*    */   public void setStartPoint(@NotNull Point2D point) {
/* 43 */     this.startPoint.setLocation(point);
/*    */   }
/*    */   
/*    */   public void setLastPoint(@NotNull Point2D point) {
/* 47 */     this.lastPoint.setLocation(point);
/*    */   }
/*    */   
/*    */   public void setLastKnot(float x, float y) {
/* 51 */     this.lastKnot.setLocation(x, y);
/*    */   }
/*    */   
/*    */   public void setLastKnot(@NotNull Point2D point) {
/* 55 */     this.lastKnot.setLocation(point);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\BuildHistory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */