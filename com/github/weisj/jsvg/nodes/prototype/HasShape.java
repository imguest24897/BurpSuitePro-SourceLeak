/*    */ package com.github.weisj.jsvg.nodes.prototype;
/*    */ 
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
/*    */ 
/*    */ public interface HasShape
/*    */ {
/*    */   @NotNull
/*    */   default Shape elementShape(@NotNull RenderContext context) {
/* 34 */     Shape shape = untransformedElementShape(context);
/* 35 */     if (this instanceof Transformable) {
/* 36 */       return ((Transformable)this).transformShape(shape, context.measureContext());
/*    */     }
/* 38 */     return shape;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   Shape untransformedElementShape(@NotNull RenderContext paramRenderContext);
/*    */   
/*    */   @NotNull
/*    */   default Rectangle2D elementBounds(@NotNull RenderContext context) {
/* 46 */     Rectangle2D shape = untransformedElementBounds(context);
/* 47 */     if (this instanceof Transformable) {
/* 48 */       return ((Transformable)this).transformShape(shape, context.measureContext()).getBounds2D();
/*    */     }
/* 50 */     return shape;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   Rectangle2D untransformedElementBounds(@NotNull RenderContext paramRenderContext);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\HasShape.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */