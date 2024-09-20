/*    */ package com.github.weisj.jsvg.nodes;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.Overflow;
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*    */ import com.github.weisj.jsvg.nodes.container.CommonInnerViewContainer;
/*    */ import com.github.weisj.jsvg.nodes.filter.Filter;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*    */ import com.github.weisj.jsvg.nodes.text.Text;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import java.awt.geom.Point2D;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @ElementCategories({Category.Container, Category.Structural})
/*    */ @PermittedContent(categories = {Category.Animation, Category.Descriptive, Category.Shape, Category.Structural, Category.Gradient}, anyOf = {Anchor.class, ClipPath.class, Filter.class, Image.class, Mask.class, Marker.class, Pattern.class, Style.class, Text.class, View.class})
/*    */ public final class Symbol
/*    */   extends CommonInnerViewContainer
/*    */ {
/*    */   public static final String TAG = "symbol";
/*    */   private Length refX;
/*    */   private Length refY;
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 57 */     return "symbol";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected Point2D anchorLocation(@NotNull MeasureContext context) {
/* 62 */     return new Point2D.Float(-this.refX.resolveWidth(context), -this.refY.resolveHeight(context));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected Overflow defaultOverflow() {
/* 67 */     return Overflow.Hidden;
/*    */   }
/*    */ 
/*    */   
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 72 */     super.build(attributeNode);
/* 73 */     this.refX = attributeNode.getHorizontalReferenceLength("refX");
/* 74 */     this.refY = attributeNode.getVerticalReferenceLength("refY");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean requiresInstantiation() {
/* 79 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\Symbol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */