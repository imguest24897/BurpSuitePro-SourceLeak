/*    */ package com.github.weisj.jsvg.nodes;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.FillRule;
/*    */ import com.github.weisj.jsvg.geometry.AWTSVGShape;
/*    */ import com.github.weisj.jsvg.geometry.FillRuleAwareAWTSVGShape;
/*    */ import com.github.weisj.jsvg.geometry.MeasurableShape;
/*    */ import com.github.weisj.jsvg.nodes.prototype.HasFillRule;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import java.awt.Rectangle;
/*    */ import java.awt.geom.Path2D;
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
/*    */ public abstract class AbstractPolyShape
/*    */   extends ShapeNode
/*    */   implements HasFillRule
/*    */ {
/*    */   private FillRule fillRule;
/*    */   
/*    */   @NotNull
/*    */   public FillRule fillRule() {
/* 42 */     return this.fillRule;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected final MeasurableShape buildShape(@NotNull AttributeNode attributeNode) {
/* 47 */     this.fillRule = FillRule.parse(attributeNode);
/* 48 */     float[] points = attributeNode.getFloatList("points");
/* 49 */     if (points.length > 0) {
/* 50 */       Path2D path = new Path2D.Float(0, points.length / 2);
/* 51 */       path.moveTo(points[0], points[1]);
/* 52 */       for (int i = 2; i < points.length; i += 2) {
/* 53 */         path.lineTo(points[i], points[i + 1]);
/*    */       }
/* 55 */       if (doClose()) path.closePath(); 
/* 56 */       return (MeasurableShape)new FillRuleAwareAWTSVGShape(path);
/*    */     } 
/* 58 */     return (MeasurableShape)new AWTSVGShape(new Rectangle());
/*    */   }
/*    */   
/*    */   protected abstract boolean doClose();
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\AbstractPolyShape.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */