/*    */ package com.github.weisj.jsvg.nodes;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.container.CommonRenderableContainerNode;
/*    */ import com.github.weisj.jsvg.nodes.filter.Filter;
/*    */ import com.github.weisj.jsvg.nodes.prototype.ShapedContainer;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*    */ import com.github.weisj.jsvg.nodes.text.Text;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ElementCategories({Category.Container, Category.Structural})
/*    */ @PermittedContent(categories = {Category.Animation, Category.Descriptive, Category.Shape, Category.Structural, Category.Gradient}, anyOf = {Anchor.class, ClipPath.class, Filter.class, Image.class, Mask.class, Marker.class, Pattern.class, Style.class, Text.class, View.class})
/*    */ public final class Group
/*    */   extends CommonRenderableContainerNode
/*    */   implements ShapedContainer<SVGNode>
/*    */ {
/*    */   public static final String TAG = "g";
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 49 */     return "g";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\Group.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */