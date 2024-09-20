/*    */ package com.github.weisj.jsvg.nodes;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.MeasurableShape;
/*    */ import com.github.weisj.jsvg.geometry.SVGRectangle;
/*    */ import com.github.weisj.jsvg.geometry.SVGRoundRectangle;
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
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
/*    */ @ElementCategories({Category.BasicShape, Category.Graphic, Category.Shape})
/*    */ @PermittedContent(categories = {Category.Animation, Category.Descriptive})
/*    */ public final class Rect
/*    */   extends ShapeNode
/*    */ {
/*    */   public static final String TAG = "rect";
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 43 */     return "rect";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected MeasurableShape buildShape(@NotNull AttributeNode node) {
/* 48 */     Length x = node.getLength("x", 0.0F);
/* 49 */     Length y = node.getLength("y", 0.0F);
/* 50 */     Length width = node.getLength("width", 0.0F);
/* 51 */     Length height = node.getLength("height", 0.0F);
/*    */     
/* 53 */     Length rx = node.getLength("rx", Length.UNSPECIFIED);
/* 54 */     Length ry = node.getLength("ry", rx);
/* 55 */     if (rx.isUnspecified()) {
/* 56 */       rx = ry;
/*    */     }
/*    */     
/* 59 */     rx = rx.coerceNonNegative().orElseIfUnspecified(0.0F);
/* 60 */     ry = ry.coerceNonNegative().orElseIfUnspecified(0.0F);
/*    */     
/* 62 */     if (rx.isZero() && ry.isZero()) {
/* 63 */       return (MeasurableShape)new SVGRectangle(x, y, width, height);
/*    */     }
/* 65 */     return (MeasurableShape)new SVGRoundRectangle(x, y, width, height, rx, ry);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\Rect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */