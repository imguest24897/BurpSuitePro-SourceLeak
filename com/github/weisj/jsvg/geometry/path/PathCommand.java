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
/*    */ public abstract class PathCommand
/*    */ {
/*    */   private final boolean isRelative;
/*    */   private final int nodeCount;
/*    */   
/*    */   protected PathCommand(int nodeCount) {
/* 35 */     this(false, nodeCount);
/*    */   }
/*    */   
/*    */   protected PathCommand(boolean isRelative, int nodeCount) {
/* 39 */     this.isRelative = isRelative;
/* 40 */     this.nodeCount = nodeCount;
/*    */   }
/*    */   
/*    */   protected Point2D.Float offset(@NotNull BuildHistory hist) {
/* 44 */     if (isRelative()) {
/* 45 */       return new Point2D.Float(hist.lastPoint.x, hist.lastPoint.y);
/*    */     }
/* 47 */     return new Point2D.Float(0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Point2D.Float lastKnotReflection(@NotNull BuildHistory hist) {
/* 52 */     float oldKx = hist.lastKnot.x;
/* 53 */     float oldKy = hist.lastKnot.y;
/* 54 */     float oldX = hist.lastPoint.x;
/* 55 */     float oldY = hist.lastPoint.y;
/*    */ 
/*    */     
/* 58 */     float kx = oldX * 2.0F - oldKx;
/* 59 */     float ky = oldY * 2.0F - oldKy;
/* 60 */     return new Point2D.Float(kx, ky);
/*    */   }
/*    */   
/*    */   public boolean isRelative() {
/* 64 */     return this.isRelative;
/*    */   }
/*    */   
/*    */   public abstract void appendPath(@NotNull Path2D paramPath2D, @NotNull BuildHistory paramBuildHistory);
/*    */   
/*    */   public int nodeCount() {
/* 70 */     return this.nodeCount;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\PathCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */