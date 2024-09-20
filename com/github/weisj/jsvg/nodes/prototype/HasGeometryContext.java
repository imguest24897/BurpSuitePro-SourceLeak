/*    */ package com.github.weisj.jsvg.nodes.prototype;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*    */ import com.github.weisj.jsvg.nodes.ClipPath;
/*    */ import com.github.weisj.jsvg.nodes.Mask;
/*    */ import com.github.weisj.jsvg.nodes.filter.Filter;
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
/*    */ public interface HasGeometryContext
/*    */   extends Transformable, HasClip, HasFilter
/*    */ {
/*    */   public static interface ByDelegate
/*    */     extends HasGeometryContext
/*    */   {
/*    */     @NotNull
/*    */     HasGeometryContext geometryContextDelegate();
/*    */     
/*    */     @Nullable
/*    */     default ClipPath clipPath() {
/* 44 */       return geometryContextDelegate().clipPath();
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     default Mask mask() {
/* 49 */       return geometryContextDelegate().mask();
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     default Filter filter() {
/* 54 */       return geometryContextDelegate().filter();
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     default AffineTransform transform() {
/* 59 */       return geometryContextDelegate().transform();
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     default Point2D transformOrigin(@NotNull MeasureContext context) {
/* 64 */       return geometryContextDelegate().transformOrigin(context);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\HasGeometryContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */