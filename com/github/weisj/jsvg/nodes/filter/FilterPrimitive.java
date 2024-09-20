/*    */ package com.github.weisj.jsvg.nodes.filter;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
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
/*    */ public interface FilterPrimitive
/*    */ {
/*    */   @NotNull
/*    */   Length y();
/*    */   
/*    */   @NotNull
/*    */   Length x();
/*    */   
/*    */   @NotNull
/*    */   Length width();
/*    */   
/*    */   @NotNull
/*    */   Length height();
/*    */   
/*    */   default boolean isValid() {
/* 45 */     return true;
/*    */   }
/*    */   
/*    */   void layoutFilter(@NotNull RenderContext paramRenderContext, @NotNull FilterLayoutContext paramFilterLayoutContext);
/*    */   
/*    */   void applyFilter(@NotNull RenderContext paramRenderContext, @NotNull FilterContext paramFilterContext);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\FilterPrimitive.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */