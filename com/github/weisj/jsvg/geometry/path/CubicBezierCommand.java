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
/*    */ final class CubicBezierCommand
/*    */   implements BezierPathCommand
/*    */ {
/*    */   private final boolean relative;
/*    */   private final float bx;
/*    */   private final float by;
/*    */   private final float cx;
/*    */   private final float cy;
/*    */   private final float dx;
/*    */   private final float dy;
/*    */   
/*    */   public CubicBezierCommand(boolean relative, float bx, float by, float cx, float cy, float dx, float dy) {
/* 41 */     this.relative = relative;
/* 42 */     this.bx = bx;
/* 43 */     this.by = by;
/* 44 */     this.cx = cx;
/* 45 */     this.cy = cy;
/* 46 */     this.dx = dx;
/* 47 */     this.dy = dy;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Bezier createBezier(@NotNull Point2D.Float start) {
/* 52 */     if (this.relative) {
/* 53 */       return new Bezier(start, new Point2D.Float(start.x + this.bx, start.y + this.by), new Point2D.Float(start.x + this.cx, start.y + this.cy), new Point2D.Float(start.x + this.dx, start.y + this.dy));
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 58 */     return new Bezier(start, new Point2D.Float(this.bx, this.by), new Point2D.Float(this.cx, this.cy), new Point2D.Float(this.dx, this.dy));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 67 */     return "CubicBezierCommand{relative=" + this.relative + ", bx=" + this.bx + ", by=" + this.by + ", cx=" + this.cx + ", cy=" + this.cy + ", dx=" + this.dx + ", dy=" + this.dy + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\CubicBezierCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */