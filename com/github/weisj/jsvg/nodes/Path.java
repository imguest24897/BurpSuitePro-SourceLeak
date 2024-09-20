/*    */ package com.github.weisj.jsvg.nodes;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.FillRule;
/*    */ import com.github.weisj.jsvg.geometry.AWTSVGShape;
/*    */ import com.github.weisj.jsvg.geometry.MeasurableShape;
/*    */ import com.github.weisj.jsvg.nodes.prototype.HasFillRule;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import com.github.weisj.jsvg.util.PathUtil;
/*    */ import java.awt.Rectangle;
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
/*    */ @ElementCategories({Category.Graphic, Category.Shape})
/*    */ @PermittedContent(categories = {Category.Animation, Category.Descriptive})
/*    */ public final class Path
/*    */   extends ShapeNode
/*    */   implements HasFillRule
/*    */ {
/*    */   public static final String TAG = "path";
/*    */   private FillRule fillRule;
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 47 */     return "path";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public FillRule fillRule() {
/* 52 */     return this.fillRule;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected MeasurableShape buildShape(@NotNull AttributeNode attributeNode) {
/* 57 */     this.fillRule = FillRule.parse(attributeNode);
/* 58 */     String pathValue = attributeNode.getValue("d");
/* 59 */     if (pathValue == null) return (MeasurableShape)new AWTSVGShape(new Rectangle()); 
/* 60 */     return PathUtil.parseFromPathData(pathValue, this.fillRule);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean shouldPaintStartEndMarkersInMiddle() {
/* 65 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\Path.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */