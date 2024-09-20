/*    */ package com.github.weisj.jsvg.nodes.container;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.SVGNode;
/*    */ import com.github.weisj.jsvg.nodes.prototype.HasContext;
/*    */ import com.github.weisj.jsvg.nodes.prototype.HasGeometryContext;
/*    */ import com.github.weisj.jsvg.nodes.prototype.Renderable;
/*    */ import com.github.weisj.jsvg.nodes.prototype.impl.HasContextImpl;
/*    */ import com.github.weisj.jsvg.nodes.prototype.impl.HasGeometryContextImpl;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import com.github.weisj.jsvg.renderer.NodeRenderer;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Graphics2D;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
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
/*    */ public abstract class CommonRenderableContainerNode
/*    */   extends BaseContainerNode<SVGNode>
/*    */   implements Renderable, HasGeometryContext.ByDelegate, HasContext.ByDelegate
/*    */ {
/* 43 */   private final List<SVGNode> children = new ArrayList<>();
/*    */   
/*    */   private boolean isVisible;
/*    */   
/*    */   private HasGeometryContext geometryContext;
/*    */   private HasContext context;
/*    */   
/*    */   @MustBeInvokedByOverriders
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 52 */     super.build(attributeNode);
/* 53 */     this.isVisible = parseIsVisible(attributeNode);
/* 54 */     this.geometryContext = HasGeometryContextImpl.parse(attributeNode);
/* 55 */     this.context = HasContextImpl.parse(attributeNode);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public HasGeometryContext geometryContextDelegate() {
/* 60 */     return this.geometryContext;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public HasContext contextDelegate() {
/* 65 */     return this.context;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void doAdd(@NotNull SVGNode node) {
/* 70 */     this.children.add(node);
/*    */   }
/*    */ 
/*    */   
/*    */   public List<? extends SVGNode> children() {
/* 75 */     return this.children;
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(@NotNull RenderContext context, @NotNull Graphics2D g) {
/* 80 */     for (SVGNode child : children()) {
/* 81 */       NodeRenderer.renderNode(child, context, g);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isVisible(@NotNull RenderContext context) {
/* 87 */     return this.isVisible;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\container\CommonRenderableContainerNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */