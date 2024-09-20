/*    */ package com.github.weisj.jsvg.nodes.prototype;
/*    */ 
/*    */ import com.github.weisj.jsvg.renderer.NodeRenderer;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Shape;
/*    */ import java.awt.geom.Path2D;
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
/*    */ public interface ShapedContainer<E>
/*    */   extends Container<E>, HasShape
/*    */ {
/*    */   @NotNull
/*    */   default Shape untransformedElementShape(@NotNull RenderContext context) {
/* 37 */     Path2D shape = new Path2D.Float();
/* 38 */     for (E child : children()) {
/* 39 */       if (!(child instanceof HasShape))
/* 40 */         continue;  RenderContext childContext = NodeRenderer.setupRenderContext(child, context);
/* 41 */       Shape childShape = ((HasShape)child).elementShape(childContext);
/* 42 */       shape.append(childShape, false);
/*    */     } 
/* 44 */     return shape;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   default Rectangle2D untransformedElementBounds(@NotNull RenderContext context) {
/* 49 */     Rectangle2D bounds = null;
/* 50 */     for (E child : children()) {
/* 51 */       if (!(child instanceof HasShape))
/* 52 */         continue;  RenderContext childContext = NodeRenderer.setupRenderContext(child, context);
/* 53 */       Rectangle2D childBounds = ((HasShape)child).elementBounds(childContext);
/* 54 */       if (childBounds.isEmpty())
/* 55 */         continue;  if (bounds == null) {
/* 56 */         bounds = childBounds; continue;
/*    */       } 
/* 58 */       Rectangle2D.union(bounds, childBounds, bounds);
/*    */     } 
/*    */     
/* 61 */     if (bounds == null) return new Rectangle2D.Float(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, 0.0F, 0.0F); 
/* 62 */     return bounds;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\ShapedContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */