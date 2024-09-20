/*    */ package com.github.weisj.jsvg.geometry.path;
/*    */ 
/*    */ import java.awt.geom.Path2D;
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
/*    */ final class Horizontal
/*    */   extends PathCommand
/*    */ {
/*    */   private final float x;
/*    */   
/*    */   public Horizontal(boolean isRelative, float x) {
/* 37 */     super(isRelative, 2);
/* 38 */     this.x = x;
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
/* 43 */     float xOff = isRelative() ? hist.lastPoint.x : 0.0F;
/* 44 */     float yOff = hist.lastPoint.y;
/*    */     
/* 46 */     path.lineTo((this.x + xOff), yOff);
/* 47 */     hist.setLastPoint(path.getCurrentPoint());
/* 48 */     hist.setLastKnot(path.getCurrentPoint());
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 53 */     return "H " + this.x;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\Horizontal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */