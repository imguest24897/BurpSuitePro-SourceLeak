/*    */ package com.github.weisj.jsvg.geometry;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*    */ import com.github.weisj.jsvg.geometry.util.GeometryUtil;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Rectangle;
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
/*    */ public class AWTSVGShape<T extends Shape>
/*    */   implements MeasurableShape
/*    */ {
/* 35 */   public static final Rectangle2D EMPTY_SHAPE = new Rectangle();
/*    */   @NotNull
/*    */   protected final T shape;
/*    */   private Rectangle2D bounds;
/*    */   private double pathLength;
/*    */   
/*    */   public AWTSVGShape(@NotNull T shape) {
/* 42 */     this(shape, Double.NaN);
/*    */   }
/*    */   
/*    */   private AWTSVGShape(@NotNull T shape, double pathLength) {
/* 46 */     this.shape = shape;
/* 47 */     this.pathLength = pathLength;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Shape shape(@NotNull RenderContext context, boolean validate) {
/* 52 */     return (Shape)this.shape;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Rectangle2D bounds(@NotNull RenderContext context, boolean validate) {
/* 57 */     if (this.bounds == null) this.bounds = this.shape.getBounds2D(); 
/* 58 */     return this.bounds;
/*    */   }
/*    */ 
/*    */   
/*    */   public double pathLength(@NotNull MeasureContext measureContext) {
/* 63 */     if (Double.isNaN(this.pathLength)) {
/* 64 */       this.pathLength = computePathLength();
/*    */     }
/* 66 */     return this.pathLength;
/*    */   }
/*    */ 
/*    */   
/*    */   private double computePathLength() {
/* 71 */     if (this.shape instanceof Rectangle2D) {
/* 72 */       Rectangle2D r = (Rectangle2D)this.shape;
/* 73 */       return 2.0D * (r.getWidth() + r.getHeight());
/* 74 */     }  if (this.shape instanceof Ellipse2D) {
/* 75 */       Ellipse2D e = (Ellipse2D)this.shape;
/* 76 */       double w = e.getWidth();
/* 77 */       double h = e.getHeight();
/* 78 */       if (w == h) return Math.PI * w;
/*    */       
/* 80 */       return SVGEllipse.ellipseCircumference(w / 2.0D, h / 2.0D);
/*    */     } 
/* 82 */     return computeGenericPathLength();
/*    */   }
/*    */ 
/*    */   
/*    */   private double computeGenericPathLength() {
/* 87 */     return GeometryUtil.pathLength((Shape)this.shape);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\AWTSVGShape.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */