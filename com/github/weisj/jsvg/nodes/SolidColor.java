/*    */ package com.github.weisj.jsvg.nodes;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.paint.SimplePaintSVGPaint;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import com.github.weisj.jsvg.util.ColorUtil;
/*    */ import java.awt.Color;
/*    */ import java.awt.Paint;
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
/*    */ @ElementCategories({Category.Gradient})
/*    */ @PermittedContent(categories = {Category.Animation, Category.Descriptive})
/*    */ public final class SolidColor
/*    */   extends AbstractSVGNode
/*    */   implements SimplePaintSVGPaint
/*    */ {
/*    */   public static final String TAG = "solidcolor";
/*    */   private Color color;
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 43 */     return "solidcolor";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Paint paint() {
/* 48 */     return this.color;
/*    */   }
/*    */ 
/*    */   
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 53 */     super.build(attributeNode);
/* 54 */     Color c = attributeNode.getColor("solid-color");
/* 55 */     float opacity = attributeNode.getPercentage("solid-opacity", c.getAlpha() / 255.0F);
/* 56 */     this.color = ColorUtil.withAlpha(c, opacity);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\SolidColor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */