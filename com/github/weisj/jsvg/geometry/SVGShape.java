/*    */ package com.github.weisj.jsvg.geometry;
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
/*    */ 
/*    */ public interface SVGShape
/*    */ {
/*    */   default boolean canBeFilled() {
/* 34 */     return true;
/*    */   }
/*    */   @NotNull
/*    */   default Shape shape(@NotNull RenderContext context) {
/* 38 */     return shape(context, true);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   Shape shape(@NotNull RenderContext paramRenderContext, boolean paramBoolean);
/*    */   
/*    */   @NotNull
/*    */   Rectangle2D bounds(@NotNull RenderContext paramRenderContext, boolean paramBoolean);
/*    */   
/*    */   default boolean usesOptimizedBoundsCalculation() {
/* 48 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\SVGShape.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */