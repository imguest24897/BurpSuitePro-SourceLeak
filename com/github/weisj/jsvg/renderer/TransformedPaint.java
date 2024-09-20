/*    */ package com.github.weisj.jsvg.renderer;
/*    */ 
/*    */ import java.awt.Paint;
/*    */ import java.awt.PaintContext;
/*    */ import java.awt.Rectangle;
/*    */ import java.awt.RenderingHints;
/*    */ import java.awt.geom.AffineTransform;
/*    */ import java.awt.geom.Rectangle2D;
/*    */ import java.awt.image.ColorModel;
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
/*    */ public final class TransformedPaint
/*    */   implements Paint
/*    */ {
/*    */   @NotNull
/*    */   private final Paint paint;
/*    */   @NotNull
/*    */   private final AffineTransform transform;
/*    */   
/*    */   public TransformedPaint(@NotNull Paint paint, @NotNull AffineTransform transform) {
/* 37 */     this.paint = paint;
/* 38 */     this.transform = transform;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds, AffineTransform xform, RenderingHints hints) {
/* 44 */     xform.concatenate(this.transform);
/* 45 */     return this.paint.createContext(cm, deviceBounds, userBounds, xform, hints);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getTransparency() {
/* 50 */     return this.paint.getTransparency();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\renderer\TransformedPaint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */