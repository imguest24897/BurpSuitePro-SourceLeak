/*    */ package com.github.weisj.jsvg.nodes.filter;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*    */ import com.github.weisj.jsvg.nodes.animation.Set;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
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
/*    */ @ElementCategories({Category.FilterPrimitive})
/*    */ @PermittedContent(anyOf = {Animate.class, Set.class})
/*    */ public final class DummyFilterPrimitive
/*    */   extends AbstractFilterPrimitive
/*    */ {
/*    */   @NotNull
/*    */   private final String tag;
/*    */   
/*    */   public DummyFilterPrimitive(@NotNull String tag) {
/* 42 */     this.tag = tag;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 47 */     return this.tag;
/*    */   }
/*    */ 
/*    */   
/*    */   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
/* 52 */     impl().saveLayoutResult(impl().layoutInput(filterLayoutContext), filterLayoutContext);
/*    */   }
/*    */ 
/*    */   
/*    */   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
/* 57 */     impl().noop(filterContext);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\DummyFilterPrimitive.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */