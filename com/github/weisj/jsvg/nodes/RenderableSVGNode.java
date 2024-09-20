/*    */ package com.github.weisj.jsvg.nodes;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.prototype.HasGeometryContext;
/*    */ import com.github.weisj.jsvg.nodes.prototype.Renderable;
/*    */ import com.github.weisj.jsvg.nodes.prototype.impl.HasGeometryContextImpl;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import org.jetbrains.annotations.MustBeInvokedByOverriders;
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
/*    */ public abstract class RenderableSVGNode
/*    */   extends AbstractSVGNode
/*    */   implements Renderable, HasGeometryContext.ByDelegate
/*    */ {
/*    */   private boolean isVisible;
/*    */   private HasGeometryContext geometryContext;
/*    */   
/*    */   public boolean isVisible(@NotNull RenderContext context) {
/* 41 */     return (this.isVisible && context.rawOpacity() > 0.0F);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public HasGeometryContext geometryContextDelegate() {
/* 46 */     return this.geometryContext;
/*    */   }
/*    */ 
/*    */   
/*    */   @MustBeInvokedByOverriders
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 52 */     super.build(attributeNode);
/* 53 */     this.isVisible = parseIsVisible(attributeNode);
/* 54 */     this.geometryContext = HasGeometryContextImpl.parse(attributeNode);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\RenderableSVGNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */