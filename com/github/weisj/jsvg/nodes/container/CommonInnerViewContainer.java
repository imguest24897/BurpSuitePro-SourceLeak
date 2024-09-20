/*    */ package com.github.weisj.jsvg.nodes.container;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.FloatSize;
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*    */ import com.github.weisj.jsvg.nodes.SVGNode;
/*    */ import com.github.weisj.jsvg.nodes.prototype.ShapedContainer;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.geom.Point2D;
/*    */ import org.jetbrains.annotations.MustBeInvokedByOverriders;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ public abstract class CommonInnerViewContainer
/*    */   extends BaseInnerViewContainer
/*    */   implements ShapedContainer<SVGNode>
/*    */ {
/*    */   protected Length x;
/*    */   protected Length y;
/*    */   protected Length width;
/*    */   protected Length height;
/*    */   
/*    */   @NotNull
/*    */   protected Point2D outerLocation(@NotNull MeasureContext context) {
/* 47 */     return new Point2D.Float(this.x.resolveWidth(context), this.y.resolveHeight(context));
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected Point2D anchorLocation(@NotNull MeasureContext context) {
/* 53 */     return null;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public FloatSize size(@NotNull RenderContext context) {
/* 58 */     MeasureContext measure = context.measureContext();
/* 59 */     return new FloatSize(this.width
/* 60 */         .orElseIfUnspecified(measure.viewWidth()).resolveWidth(measure), this.height
/* 61 */         .orElseIfUnspecified(measure.viewHeight()).resolveHeight(measure));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isVisible(@NotNull RenderContext context) {
/* 66 */     return (!this.width.isZero() && !this.height.isZero() && super.isVisible(context));
/*    */   }
/*    */ 
/*    */   
/*    */   @MustBeInvokedByOverriders
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 72 */     super.build(attributeNode);
/* 73 */     this.x = attributeNode.getLength("x", 0.0F);
/* 74 */     this.y = attributeNode.getLength("y", 0.0F);
/* 75 */     this.width = attributeNode.getLength("width", Length.UNSPECIFIED);
/* 76 */     this.height = attributeNode.getLength("height", Length.UNSPECIFIED);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\container\CommonInnerViewContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */