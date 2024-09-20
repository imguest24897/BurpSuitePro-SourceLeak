/*    */ package com.github.weisj.jsvg.nodes.prototype;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Shape;
/*    */ import java.awt.geom.AffineTransform;
/*    */ import java.awt.geom.Point2D;
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
/*    */ public interface Transformable
/*    */ {
/*    */   default boolean shouldTransform() {
/* 37 */     return true;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   AffineTransform transform();
/*    */   
/*    */   @NotNull
/*    */   Point2D transformOrigin(@NotNull MeasureContext paramMeasureContext);
/*    */   
/*    */   default void applyTransform(@NotNull Graphics2D g, @NotNull RenderContext context) {
/* 47 */     AffineTransform transform = transform();
/* 48 */     if (transform != null) {
/* 49 */       Point2D transformOrigin = transformOrigin(context.measureContext());
/*    */ 
/*    */       
/* 52 */       AffineTransform conjugate = AffineTransform.getTranslateInstance(transformOrigin.getX(), transformOrigin.getY());
/* 53 */       conjugate.concatenate(transform);
/* 54 */       conjugate.translate(-transformOrigin.getX(), -transformOrigin.getY());
/*    */       
/* 56 */       g.transform(conjugate);
/* 57 */       context.userSpaceTransform().concatenate(conjugate);
/*    */     } 
/*    */   }
/*    */   
/*    */   default Shape transformShape(@NotNull Shape shape, @NotNull MeasureContext measureContext) {
/* 62 */     AffineTransform transform = transform();
/* 63 */     if (transform != null) {
/* 64 */       Point2D transformOrigin = transformOrigin(measureContext);
/* 65 */       AffineTransform at = new AffineTransform();
/* 66 */       at.translate(transformOrigin.getX(), transformOrigin.getY());
/* 67 */       at.concatenate(transform);
/* 68 */       at.translate(-transformOrigin.getX(), -transformOrigin.getY());
/* 69 */       return at.createTransformedShape(shape);
/*    */     } 
/* 71 */     return shape;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\Transformable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */