/*    */ package com.github.weisj.jsvg.geometry;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Shape;
/*    */ import java.awt.geom.Rectangle2D;
/*    */ import java.awt.geom.RoundRectangle2D;
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
/*    */ public final class SVGRoundRectangle
/*    */   implements MeasurableShape
/*    */ {
/*    */   @NotNull
/* 36 */   private final RoundRectangle2D.Float rect = new RoundRectangle2D.Float();
/*    */   
/*    */   @NotNull
/*    */   private final Length x;
/*    */   @NotNull
/*    */   private final Length y;
/*    */   @NotNull
/*    */   private final Length w;
/*    */   
/*    */   public SVGRoundRectangle(@NotNull Length x, @NotNull Length y, @NotNull Length w, @NotNull Length h, @NotNull Length rx, @NotNull Length ry) {
/* 46 */     this.x = x;
/* 47 */     this.y = y;
/* 48 */     this.w = w;
/* 49 */     this.h = h;
/* 50 */     this.rx = rx;
/* 51 */     this.ry = ry; } @NotNull
/*    */   private final Length h; @NotNull
/*    */   private final Length rx; @NotNull
/*    */   private final Length ry; private void validateShape(@NotNull MeasureContext measureContext) {
/* 55 */     this.rect.setRoundRect(this.x
/* 56 */         .resolveWidth(measureContext), this.y
/* 57 */         .resolveHeight(measureContext), this.w
/* 58 */         .resolveWidth(measureContext), this.h
/* 59 */         .resolveHeight(measureContext), this.rx
/* 60 */         .resolveWidth(measureContext) * 2.0F, this.ry
/* 61 */         .resolveHeight(measureContext) * 2.0F);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Shape shape(@NotNull RenderContext context, boolean validate) {
/* 66 */     if (validate) validateShape(context.measureContext()); 
/* 67 */     return this.rect;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Rectangle2D bounds(@NotNull RenderContext context, boolean validate) {
/* 72 */     if (validate) validateShape(context.measureContext()); 
/* 73 */     return this.rect.getBounds2D();
/*    */   }
/*    */ 
/*    */   
/*    */   public double pathLength(@NotNull MeasureContext measureContext) {
/* 78 */     float a = this.rx.resolveWidth(measureContext);
/* 79 */     float b = this.ry.resolveHeight(measureContext);
/* 80 */     double l = (2.0F * (this.w.resolveWidth(measureContext) - 2.0F * a + this.h.resolveHeight(measureContext) - 2.0F * b));
/* 81 */     if (a == b)
/*    */     {
/* 83 */       return l + SVGCircle.circumference(a);
/*    */     }
/*    */     
/* 86 */     return l + SVGEllipse.ellipseCircumference(a, b);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\SVGRoundRectangle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */