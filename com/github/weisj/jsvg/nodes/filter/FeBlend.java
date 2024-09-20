/*    */ package com.github.weisj.jsvg.nodes.filter;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.filter.BlendMode;
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
/*    */ public final class FeBlend
/*    */   extends AbstractCompositeFilterPrimitive
/*    */ {
/*    */   public static final String TAG = "feblend";
/*    */   private Composite composite;
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 47 */     return "feblend";
/*    */   }
/*    */ 
/*    */   
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 52 */     super.build(attributeNode);
/* 53 */     BlendMode blendMode = (BlendMode)attributeNode.getEnum("mode", (Enum)BlendMode.Normal);
/* 54 */     this.composite = BlendModeComposite.create(blendMode);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected Composite composite() {
/* 59 */     return this.composite;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\FeBlend.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */