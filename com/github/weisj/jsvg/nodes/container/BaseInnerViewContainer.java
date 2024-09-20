/*     */ package com.github.weisj.jsvg.nodes.container;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.Overflow;
/*     */ import com.github.weisj.jsvg.attributes.PreserveAspectRatio;
/*     */ import com.github.weisj.jsvg.attributes.ViewBox;
/*     */ import com.github.weisj.jsvg.geometry.size.FloatSize;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.nodes.SVG;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.NodeRenderer;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.Point2D;
/*     */ import org.jetbrains.annotations.MustBeInvokedByOverriders;
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
/*     */ public abstract class BaseInnerViewContainer
/*     */   extends CommonRenderableContainerNode
/*     */ {
/*     */   protected ViewBox viewBox;
/*     */   protected PreserveAspectRatio preserveAspectRatio;
/*     */   private Overflow overflow;
/*     */   
/*     */   @NotNull
/*     */   protected abstract Point2D outerLocation(@NotNull MeasureContext paramMeasureContext);
/*     */   
/*     */   @Nullable
/*     */   protected abstract Point2D anchorLocation(@NotNull MeasureContext paramMeasureContext);
/*     */   
/*     */   @NotNull
/*     */   public abstract FloatSize size(@NotNull RenderContext paramRenderContext);
/*     */   
/*     */   @NotNull
/*     */   protected abstract Overflow defaultOverflow();
/*     */   
/*     */   @Nullable
/*     */   public ViewBox viewBox(@NotNull RenderContext context) {
/*  58 */     return (this.viewBox != null) ? this.viewBox : new ViewBox(size(context));
/*     */   }
/*     */ 
/*     */   
/*     */   @MustBeInvokedByOverriders
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  64 */     super.build(attributeNode);
/*  65 */     this.viewBox = attributeNode.getViewBox();
/*  66 */     this.preserveAspectRatio = PreserveAspectRatio.parse(attributeNode
/*  67 */         .getValue("preserveAspectRatio"), attributeNode.parser());
/*  68 */     this.overflow = (Overflow)attributeNode.getEnum("overflow", (Enum)defaultOverflow());
/*     */   }
/*     */ 
/*     */   
/*     */   public final void render(@NotNull RenderContext context, @NotNull Graphics2D g) {
/*  73 */     renderWithSize(size(context), viewBox(context), null, context, g);
/*     */   }
/*     */   @NotNull
/*     */   protected RenderContext createInnerContext(@NotNull RenderContext context, @NotNull ViewBox viewBox) {
/*  77 */     return NodeRenderer.setupInnerViewRenderContext(viewBox, context, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void renderWithSize(@NotNull FloatSize useSiteSize, @Nullable ViewBox view, @NotNull RenderContext context, @NotNull Graphics2D g) {
/*  82 */     renderWithSize(useSiteSize, view, null, context, g);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void renderWithSize(@NotNull FloatSize useSiteSize, @Nullable ViewBox view, @Nullable PreserveAspectRatio preserveAspectRatio, @NotNull RenderContext context, @NotNull Graphics2D g) {
/*  88 */     MeasureContext measureContext = context.measureContext();
/*     */     
/*  90 */     Point2D outerPos = outerLocation(measureContext);
/*     */     
/*  92 */     if (Length.isUnspecified(useSiteSize.width) || Length.isUnspecified(useSiteSize.height)) {
/*  93 */       FloatSize size = size(context);
/*  94 */       if (Length.isUnspecified(useSiteSize.width)) useSiteSize.width = size.width; 
/*  95 */       if (Length.isUnspecified(useSiteSize.height)) useSiteSize.height = size.height; 
/*     */     } 
/*  97 */     if (preserveAspectRatio == null) preserveAspectRatio = this.preserveAspectRatio;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     AffineTransform viewTransform = (view != null) ? preserveAspectRatio.computeViewPortTransform(useSiteSize, view) : null;
/*     */ 
/*     */     
/* 105 */     FloatSize viewSize = (view != null) ? view.size() : useSiteSize;
/*     */     
/* 107 */     RenderContext innerContext = createInnerContext(context, new ViewBox(viewSize));
/* 108 */     MeasureContext innerMeasure = innerContext.measureContext();
/*     */     
/* 110 */     innerContext.translate(g, outerPos);
/*     */     
/* 112 */     Point2D anchorPos = anchorLocation(innerMeasure);
/* 113 */     if (anchorPos != null) {
/* 114 */       if (viewTransform != null)
/*     */       {
/* 116 */         anchorPos.setLocation(anchorPos
/* 117 */             .getX() * viewTransform.getScaleX() - viewTransform.getTranslateX(), anchorPos
/* 118 */             .getY() * viewTransform.getScaleY() - viewTransform.getTranslateY());
/*     */       }
/* 120 */       innerContext.translate(g, anchorPos);
/*     */     } 
/*     */     
/* 123 */     boolean shouldClip = this.overflow.establishesClip();
/*     */ 
/*     */     
/* 126 */     if (shouldClip) g.clip((Shape)new ViewBox(useSiteSize));
/*     */     
/* 128 */     if (viewTransform != null) {
/* 129 */       innerContext.transform(g, viewTransform);
/*     */ 
/*     */       
/* 132 */       if (shouldClip) g.clip((Shape)view);
/*     */     
/*     */     } 
/* 135 */     if (this instanceof SVG && ((SVG)this).isTopLevel()) {
/*     */       
/* 137 */       context.setRootTransform(g.getTransform());
/* 138 */       innerContext.setRootTransform(g.getTransform());
/*     */     } 
/*     */     
/* 141 */     super.render(innerContext, g);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\container\BaseInnerViewContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */