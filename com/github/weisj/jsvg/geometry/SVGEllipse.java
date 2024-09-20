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
/*    */ public final class SVGEllipse
/*    */   implements MeasurableShape
/*    */ {
/*    */   @NotNull
/* 36 */   private final Ellipse2D.Float ellipse = new Ellipse2D.Float();
/*    */   @NotNull
/*    */   private final Length cx;
/*    */   @NotNull
/*    */   private final Length cy;
/*    */   
/*    */   public SVGEllipse(@NotNull Length cx, @NotNull Length cy, @NotNull Length rx, @NotNull Length ry) {
/* 43 */     this.cx = cx;
/* 44 */     this.cy = cy;
/* 45 */     this.rx = rx;
/* 46 */     this.ry = ry;
/*    */   } @NotNull
/*    */   private final Length rx; @NotNull
/*    */   private final Length ry; private void validateShape(@NotNull MeasureContext measureContext) {
/* 50 */     float x = this.cx.resolveWidth(measureContext);
/* 51 */     float y = this.cy.resolveWidth(measureContext);
/* 52 */     float rrx = this.rx.resolveWidth(measureContext);
/* 53 */     float rry = this.ry.resolveHeight(measureContext);
/* 54 */     this.ellipse.setFrame(x - rrx, y - rry, 2.0F * rrx, 2.0F * rry);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Shape shape(@NotNull RenderContext context, boolean validate) {
/* 59 */     if (validate) validateShape(context.measureContext()); 
/* 60 */     return this.ellipse;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Rectangle2D bounds(@NotNull RenderContext context, boolean validate) {
/* 65 */     if (validate) validateShape(context.measureContext()); 
/* 66 */     return this.ellipse.getBounds2D();
/*    */   }
/*    */ 
/*    */   
/*    */   public double pathLength(@NotNull MeasureContext measureContext) {
/* 71 */     float a = this.rx.resolveWidth(measureContext);
/* 72 */     float b = this.ry.resolveHeight(measureContext);
/* 73 */     if (a == b) return SVGCircle.circumference(a); 
/* 74 */     return ellipseCircumference(a, b);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   static double ellipseCircumference(double a, double b) {
/* 81 */     double h = (a - b) * (a - b) / (a + b) * (a + b);
/* 82 */     double h4 = h / 4.0D;
/* 83 */     return 0.7853981633974483D * (a + b) * (3.0D * (1.0D + h4) + 1.0D / (1.0D - h4));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\SVGEllipse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */