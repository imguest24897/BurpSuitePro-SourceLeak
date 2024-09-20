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
/*    */ final class Vertical
/*    */   extends PathCommand
/*    */ {
/*    */   private final float y;
/*    */   
/*    */   public Vertical(boolean isRelative, float y) {
/* 37 */     super(isRelative, 2);
/* 38 */     this.y = y;
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
/* 43 */     float xOff = hist.lastPoint.x;
/* 44 */     float yOff = isRelative() ? hist.lastPoint.y : 0.0F;
/*    */     
/* 46 */     path.lineTo(xOff, (this.y + yOff));
/* 47 */     hist.setLastPoint(path.getCurrentPoint());
/* 48 */     hist.setLastKnot(path.getCurrentPoint());
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 53 */     return "V " + this.y;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\Vertical.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */