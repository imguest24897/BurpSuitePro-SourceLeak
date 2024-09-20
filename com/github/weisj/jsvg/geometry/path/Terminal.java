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
/*    */ 
/*    */ 
/*    */ public final class Terminal
/*    */   extends PathCommand
/*    */ {
/*    */   Terminal() {
/* 37 */     super(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
/* 42 */     path.closePath();
/* 43 */     hist.setLastPoint(hist.startPoint);
/* 44 */     hist.setLastKnot(hist.startPoint);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     return "Z";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\Terminal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */