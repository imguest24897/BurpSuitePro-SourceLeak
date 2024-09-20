/*    */ package com.github.weisj.jsvg.geometry;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*    */ import com.github.weisj.jsvg.geometry.util.GeometryUtil;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Shape;
/*    */ import java.awt.geom.Line2D;
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
/*    */ public final class SVGLine
/*    */   implements MeasurableShape
/*    */ {
/*    */   @NotNull
/* 37 */   private final Line2D.Float line = new Line2D.Float();
/*    */   private final Length x1;
/*    */   private final Length y1;
/*    */   private final Length x2;
/*    */   private final Length y2;
/*    */   
/*    */   public SVGLine(@NotNull Length x1, @NotNull Length y1, @NotNull Length x2, @NotNull Length y2) {
/* 44 */     this.x1 = x1;
/* 45 */     this.y1 = y1;
/* 46 */     this.x2 = x2;
/* 47 */     this.y2 = y2;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canBeFilled() {
/* 52 */     return false;
/*    */   }
/*    */   
/*    */   private void validateShape(@NotNull MeasureContext measureContext) {
/* 56 */     this.line.setLine(this.x1
/* 57 */         .resolveWidth(measureContext), this.y1.resolveHeight(measureContext), this.x2
/* 58 */         .resolveWidth(measureContext), this.y2.resolveHeight(measureContext));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Shape shape(@NotNull RenderContext context, boolean validate) {
/* 63 */     if (validate) validateShape(context.measureContext()); 
/* 64 */     return this.line;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Rectangle2D bounds(@NotNull RenderContext context, boolean validate) {
/* 69 */     if (validate) validateShape(context.measureContext()); 
/* 70 */     return this.line.getBounds2D();
/*    */   }
/*    */ 
/*    */   
/*    */   public double pathLength(@NotNull MeasureContext measureContext) {
/* 75 */     return GeometryUtil.lineLength(this.x1
/* 76 */         .resolveWidth(measureContext), this.y1.resolveHeight(measureContext), this.x2
/* 77 */         .resolveWidth(measureContext), this.y2.resolveHeight(measureContext));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\SVGLine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */