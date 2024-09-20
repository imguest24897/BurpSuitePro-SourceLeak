/*    */ package com.github.weisj.jsvg.attributes.paint;
/*    */ 
/*    */ import com.github.weisj.jsvg.renderer.GraphicsUtil;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Paint;
/*    */ import java.awt.Shape;
/*    */ import java.awt.geom.Rectangle2D;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ public interface SimplePaintSVGPaint
/*    */   extends SVGPaint
/*    */ {
/*    */   @NotNull
/*    */   Paint paint();
/*    */   
/*    */   default void fillShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
/* 41 */     GraphicsUtil.safelySetPaint(g, paint());
/* 42 */     g.fill(shape);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   default void drawShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
/* 48 */     GraphicsUtil.safelySetPaint(g, paint());
/* 49 */     g.draw(shape);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\paint\SimplePaintSVGPaint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */