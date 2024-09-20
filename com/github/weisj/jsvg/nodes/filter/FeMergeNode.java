/*    */ package com.github.weisj.jsvg.nodes.filter;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
/*    */ import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
/*    */ import com.github.weisj.jsvg.nodes.AbstractSVGNode;
/*    */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*    */ import com.github.weisj.jsvg.nodes.animation.Set;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
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
/*    */ @ElementCategories({Category.None})
/*    */ @PermittedContent(anyOf = {Animate.class, Set.class})
/*    */ public final class FeMergeNode
/*    */   extends AbstractSVGNode
/*    */ {
/*    */   public static final String TAG = "feMergeNode";
/*    */   private FilterChannelKey inputChannel;
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 47 */     return "feMergeNode";
/*    */   }
/*    */   @NotNull
/*    */   public FilterChannelKey inputChannel() {
/* 51 */     return this.inputChannel;
/*    */   }
/*    */ 
/*    */   
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 56 */     super.build(attributeNode);
/* 57 */     this.inputChannel = attributeNode.getFilterChannelKey("in", DefaultFilterChannel.LastResult);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\FeMergeNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */