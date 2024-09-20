/*     */ package com.github.weisj.jsvg.nodes;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.FillRule;
/*     */ import com.github.weisj.jsvg.attributes.font.AttributeFontSpec;
/*     */ import com.github.weisj.jsvg.attributes.font.FontParser;
/*     */ import com.github.weisj.jsvg.geometry.AWTSVGShape;
/*     */ import com.github.weisj.jsvg.geometry.size.FloatSize;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.nodes.container.CommonInnerViewContainer;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasContext;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasShape;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Instantiator;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Mutator;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.FontRenderContext;
/*     */ import com.github.weisj.jsvg.renderer.NodeRenderer;
/*     */ import com.github.weisj.jsvg.renderer.PaintContext;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ElementCategories({Category.Graphic, Category.GraphicsReferencing, Category.Structural})
/*     */ @PermittedContent(categories = {Category.Animation, Category.Descriptive})
/*     */ public final class Use
/*     */   extends RenderableSVGNode
/*     */   implements HasContext, HasShape, Instantiator
/*     */ {
/*     */   public static final String TAG = "use";
/*     */   private Length x;
/*     */   private Length y;
/*     */   private Length width;
/*     */   private Length height;
/*     */   @Nullable
/*     */   private SVGNode referencedNode;
/*     */   private PaintContext paintContext;
/*     */   private FontRenderContext fontRenderContext;
/*     */   private AttributeFontSpec fontSpec;
/*     */   private FillRule fillRule;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  68 */     return "use";
/*     */   }
/*     */   @Nullable
/*     */   public SVGNode referencedNode() {
/*  72 */     return this.referencedNode;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isVisible(@NotNull RenderContext context) {
/*  77 */     return (super.isVisible(context) && this.referencedNode instanceof com.github.weisj.jsvg.nodes.prototype.Renderable);
/*     */   }
/*     */ 
/*     */   
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  82 */     super.build(attributeNode);
/*  83 */     this.x = attributeNode.getLength("x", 0.0F);
/*  84 */     this.y = attributeNode.getLength("y", 0.0F);
/*  85 */     this.width = attributeNode.getLength("width", Length.UNSPECIFIED);
/*  86 */     this.height = attributeNode.getLength("height", Length.UNSPECIFIED);
/*     */     
/*  88 */     String href = attributeNode.getValue("href");
/*  89 */     if (href == null) href = attributeNode.getValue("xlink:href"); 
/*  90 */     this.referencedNode = (SVGNode)attributeNode.getElementByHref(SVGNode.class, href);
/*     */     
/*  92 */     this.paintContext = PaintContext.parse(attributeNode);
/*  93 */     this.fontRenderContext = FontRenderContext.parse(attributeNode);
/*  94 */     this.fontSpec = FontParser.parseFontSpec(attributeNode);
/*  95 */     this.fillRule = FillRule.parse(attributeNode);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Shape untransformedElementShape(@NotNull RenderContext context) {
/* 101 */     return (this.referencedNode instanceof HasShape) ? (
/*     */       
/* 103 */       (HasShape)this.referencedNode).elementShape(NodeRenderer.createChildContext(this.referencedNode, context, this)) : 
/* 104 */       AWTSVGShape.EMPTY_SHAPE;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Rectangle2D untransformedElementBounds(@NotNull RenderContext context) {
/* 110 */     return (this.referencedNode instanceof HasShape) ? (
/*     */       
/* 112 */       (HasShape)this.referencedNode).elementBounds(NodeRenderer.createChildContext(this.referencedNode, context, this)) : 
/* 113 */       AWTSVGShape.EMPTY_SHAPE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public PaintContext paintContext() {
/* 118 */     return this.paintContext;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public FontRenderContext fontRenderContext() {
/* 123 */     return this.fontRenderContext;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public AttributeFontSpec fontSpec() {
/* 128 */     return this.fontSpec;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public FillRule fillRule() {
/* 133 */     return this.fillRule;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canInstantiate(@NotNull SVGNode node) {
/* 138 */     return node instanceof CommonInnerViewContainer;
/*     */   }
/*     */ 
/*     */   
/*     */   public void render(@NotNull RenderContext context, @NotNull Graphics2D g) {
/* 143 */     if (this.referencedNode != null) {
/* 144 */       MeasureContext measureContext = context.measureContext();
/* 145 */       context.translate(g, this.x.resolveWidth(measureContext), this.y.resolveHeight(measureContext));
/*     */ 
/*     */ 
/*     */       
/* 149 */       NodeRenderer.Info info = NodeRenderer.createRenderInfo(this.referencedNode, context, g, this); 
/* 150 */       try { if (info == null)
/*     */         
/*     */         { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 160 */           if (info != null) info.close();  return; }  if (this.referencedNode instanceof CommonInnerViewContainer) { FloatSize targetViewBox = new FloatSize(Float.NaN, Float.NaN); if (this.width.isSpecified()) targetViewBox.width = this.width.resolveWidth(measureContext);  if (this.height.isSpecified()) targetViewBox.height = this.height.resolveHeight(measureContext);  CommonInnerViewContainer view = (CommonInnerViewContainer)this.referencedNode; view.renderWithSize(targetViewBox, view.viewBox(info.context), info.context, info.graphics()); } else { info.renderable.render(info.context, info.graphics()); }  if (info != null) info.close();  }
/*     */       catch (Throwable throwable) { if (info != null)
/*     */           try { info.close(); }
/*     */           catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*     */             throw throwable; }
/*     */     
/* 166 */     }  } public String toString() { return "Use{x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ", referencedNode=" + (
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 171 */       (this.referencedNode != null) ? this.referencedNode.id() : null) + ", styleContext=" + this.paintContext + ", fillRule=" + this.fillRule + '}'; }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\Use.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */