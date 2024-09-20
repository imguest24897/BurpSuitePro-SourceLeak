/*    */ package com.github.weisj.jsvg.geometry;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Shape;
/*    */ import java.awt.geom.Ellipse2D;
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
/*    */ public final class SVGCircle
/*    */   implements MeasurableShape
/*    */ {
/*    */   @NotNull
/* 36 */   private final Ellipse2D.Float circle = new Ellipse2D.Float();
/*    */   
/*    */   @NotNull
/*    */   private final Length cx;
/*    */   
/*    */   public SVGCircle(@NotNull Length cx, @NotNull Length cy, @NotNull Length r) {
/* 42 */     this.cx = cx;
/* 43 */     this.cy = cy;
/* 44 */     this.r = r;
/*    */   } @NotNull
/*    */   private final Length cy; @NotNull
/*    */   private final Length r; private void validateShape(@NotNull MeasureContext measureContext) {
/* 48 */     float x = this.cx.resolveWidth(measureContext);
/* 49 */     float y = this.cy.resolveWidth(measureContext);
/* 50 */     float rr = this.r.resolveLength(measureContext);
/* 51 */     this.circle.setFrame(x - rr, y - rr, 2.0F * rr, 2.0F * rr);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Shape shape(@NotNull RenderContext context, boolean validate) {
/* 56 */     if (validate) validateShape(context.measureContext()); 
/* 57 */     return this.circle;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Rectangle2D bounds(@NotNull RenderContext context, boolean validate) {
/* 62 */     if (validate) validateShape(context.measureContext()); 
/* 63 */     return this.circle.getBounds2D();
/*    */   }
/*    */ 
/*    */   
/*    */   public double pathLength(@NotNull MeasureContext measureContext) {
/* 68 */     return circumference(this.r.resolveLength(measureContext));
/*    */   }
/*    */   
/*    */   static double circumference(double radius) {
/* 72 */     return 6.283185307179586D * radius;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\SVGCircle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */