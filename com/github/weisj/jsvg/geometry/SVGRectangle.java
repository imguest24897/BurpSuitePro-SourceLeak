/*    */ package com.github.weisj.jsvg.geometry;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Shape;
/*    */ import java.awt.geom.Rectangle2D;
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
/*    */ public final class SVGRectangle
/*    */   implements MeasurableShape
/*    */ {
/*    */   @NotNull
/* 35 */   private final Rectangle2D.Float rect = new Rectangle2D.Float();
/*    */   @NotNull
/*    */   private final Length x;
/*    */   @NotNull
/*    */   private final Length y;
/*    */   
/*    */   public SVGRectangle(@NotNull Length x, @NotNull Length y, @NotNull Length w, @NotNull Length h) {
/* 42 */     this.x = x;
/* 43 */     this.y = y;
/* 44 */     this.w = w;
/* 45 */     this.h = h;
/*    */   } @NotNull
/*    */   private final Length w; @NotNull
/*    */   private final Length h; private void validateShape(@NotNull MeasureContext measureContext) {
/* 49 */     this.rect.setRect(this.x
/* 50 */         .resolveWidth(measureContext), this.y
/* 51 */         .resolveHeight(measureContext), this.w
/* 52 */         .resolveWidth(measureContext), this.h
/* 53 */         .resolveHeight(measureContext));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Shape shape(@NotNull RenderContext context, boolean validate) {
/* 58 */     if (validate) validateShape(context.measureContext()); 
/* 59 */     return this.rect;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Rectangle2D bounds(@NotNull RenderContext context, boolean validate) {
/* 64 */     if (validate) validateShape(context.measureContext()); 
/* 65 */     return this.rect;
/*    */   }
/*    */ 
/*    */   
/*    */   public double pathLength(@NotNull MeasureContext measureContext) {
/* 70 */     return (2.0F * (this.w.resolveWidth(measureContext) + this.h.resolveHeight(measureContext)));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\SVGRectangle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */