/*    */ package com.github.weisj.jsvg.nodes.filter;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*    */ import com.github.weisj.jsvg.nodes.animation.Set;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Composite;
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
/*    */ @ElementCategories({Category.FilterPrimitive})
/*    */ @PermittedContent(anyOf = {Animate.class, Set.class})
/*    */ public final class FeComposite
/*    */   extends AbstractCompositeFilterPrimitive
/*    */ {
/*    */   public static final String TAG = "fecomposite";
/*    */   private CompositeModeComposite composite;
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 46 */     return "fecomposite";
/*    */   }
/*    */ 
/*    */   
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 51 */     super.build(attributeNode);
/* 52 */     this.composite = new CompositeModeComposite(attributeNode);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected Composite composite() {
/* 57 */     return this.composite.composite();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\FeComposite.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */