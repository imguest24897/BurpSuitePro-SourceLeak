/*    */ package com.github.weisj.jsvg.nodes;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.MeasurableShape;
/*    */ import com.github.weisj.jsvg.geometry.SVGCircle;
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
/*    */ @ElementCategories({Category.BasicShape, Category.Graphic, Category.Shape})
/*    */ @PermittedContent(categories = {Category.Animation, Category.Descriptive})
/*    */ public final class Circle
/*    */   extends ShapeNode
/*    */ {
/*    */   public static final String TAG = "circle";
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 40 */     return "circle";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected MeasurableShape buildShape(@NotNull AttributeNode attributeNode) {
/* 45 */     return (MeasurableShape)new SVGCircle(attributeNode
/* 46 */         .getLength("cx", 0.0F), attributeNode
/* 47 */         .getLength("cy", 0.0F), attributeNode
/* 48 */         .getLength("r", 0.0F));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\Circle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */