/*     */ package com.github.weisj.jsvg.renderer;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.FillRule;
/*     */ import com.github.weisj.jsvg.attributes.ViewBox;
/*     */ import com.github.weisj.jsvg.attributes.font.MeasurableFontSpec;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.nodes.ClipPath;
/*     */ import com.github.weisj.jsvg.nodes.Mask;
/*     */ import com.github.weisj.jsvg.nodes.SVGNode;
/*     */ import com.github.weisj.jsvg.nodes.filter.Filter;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasClip;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasFillRule;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasFilter;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasFontContext;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasFontRenderContext;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasPaintContext;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasShape;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Instantiator;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Mutator;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Renderable;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Transformable;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.AffineTransform;
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
/*     */ public final class NodeRenderer
/*     */ {
/*     */   private static final boolean CLIP_DEBUG = false;
/*     */   
/*     */   public static class Info
/*     */     implements AutoCloseable
/*     */   {
/*     */     @NotNull
/*     */     public final Renderable renderable;
/*     */     @NotNull
/*     */     public final RenderContext context;
/*     */     @NotNull
/*     */     public final Graphics2D g;
/*     */     
/*     */     Info(@NotNull Renderable renderable, @NotNull RenderContext context, @NotNull Graphics2D g) {
/*  53 */       this.renderable = renderable;
/*  54 */       this.context = context;
/*  55 */       this.g = g;
/*     */     }
/*     */     @NotNull
/*     */     public Graphics2D graphics() {
/*  59 */       return this.g;
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() {
/*  64 */       this.g.dispose();
/*     */     } }
/*     */   
/*     */   private static final class InfoWithFilter extends Info {
/*     */     @NotNull
/*     */     private final Filter filter;
/*     */     @NotNull
/*     */     private final Filter.FilterInfo filterInfo;
/*     */     
/*     */     InfoWithFilter(@NotNull Renderable renderable, @NotNull RenderContext context, @NotNull Graphics2D g, @NotNull Filter filter, @NotNull Rectangle2D elementBounds) {
/*  74 */       super(renderable, context, g);
/*  75 */       this.filter = filter;
/*  76 */       this.filterInfo = filter.createFilterInfo(g, context, elementBounds);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Graphics2D graphics() {
/*  81 */       return this.filterInfo.graphics();
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() {
/*  86 */       this.filter.applyFilter(this.g, this.context, this.filterInfo);
/*  87 */       this.filterInfo.blitImage(this.g, this.context);
/*  88 */       this.filterInfo.close();
/*  89 */       super.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void renderNode(@NotNull SVGNode node, @NotNull RenderContext context, @NotNull Graphics2D g) {
/*  94 */     Info info = createRenderInfo(node, context, g, null); 
/*  95 */     try { if (info != null) info.renderable.render(info.context, info.graphics()); 
/*  96 */       if (info != null) info.close();  }
/*     */     catch (Throwable throwable) { if (info != null)
/*     */         try { info.close(); }
/*     */         catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*     */           throw throwable; }
/* 101 */      } @NotNull public static RenderContext createChildContext(@NotNull SVGNode node, @NotNull RenderContext context, @Nullable Instantiator instantiator) { return setupRenderContext(instantiator, node, context); }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static Info createRenderInfo(@NotNull SVGNode node, @NotNull RenderContext context, @NotNull Graphics2D g, @Nullable Instantiator instantiator) {
/* 106 */     if (!(node instanceof Renderable)) return null; 
/* 107 */     Renderable renderable = (Renderable)node;
/* 108 */     boolean instantiated = renderable.requiresInstantiation();
/* 109 */     if (instantiated && (instantiator == null || !instantiator.canInstantiate(node))) {
/* 110 */       return null;
/*     */     }
/* 112 */     if (!renderable.isVisible(context)) return null; 
/* 113 */     RenderContext childContext = createChildContext(node, context, instantiator);
/*     */     
/* 115 */     Graphics2D childGraphics = (Graphics2D)g.create();
/*     */     
/* 117 */     if (renderable instanceof Transformable && ((Transformable)renderable).shouldTransform()) {
/* 118 */       ((Transformable)renderable).applyTransform(childGraphics, childContext);
/*     */     }
/*     */     
/* 121 */     Rectangle2D elementBounds = null;
/* 122 */     if (renderable instanceof HasClip) {
/*     */       
/* 124 */       Mask mask = ((HasClip)renderable).mask();
/* 125 */       if (mask != null) {
/*     */         
/* 127 */         elementBounds = elementBounds(renderable, childContext);
/* 128 */         if (!elementBounds.isEmpty()) {
/* 129 */           GraphicsUtil.safelySetPaint(childGraphics, mask.createMaskPaint(g, childContext, elementBounds));
/*     */         }
/*     */       } 
/*     */       
/* 133 */       ClipPath childClip = ((HasClip)renderable).clipPath();
/*     */       
/* 135 */       if (childClip != null) {
/*     */         
/* 137 */         if (!childClip.isValid()) return null; 
/* 138 */         if (elementBounds == null) elementBounds = elementBounds(renderable, childContext);
/*     */         
/* 140 */         Shape childClipShape = childClip.clipShape(childContext, elementBounds);
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
/* 152 */         childGraphics.clip(childClipShape);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 158 */     Filter filter = (renderable instanceof HasFilter) ? ((HasFilter)renderable).filter() : null;
/*     */     
/* 160 */     if (filter != null && filter.hasEffect()) {
/* 161 */       if (elementBounds == null) elementBounds = elementBounds(renderable, childContext); 
/* 162 */       return new InfoWithFilter(renderable, childContext, childGraphics, filter, elementBounds);
/*     */     } 
/* 164 */     return new Info(renderable, childContext, childGraphics);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static Rectangle2D elementBounds(@NotNull Object node, @NotNull RenderContext childContext) {
/*     */     ViewBox viewBox;
/* 170 */     if (node instanceof HasShape) {
/* 171 */       Rectangle2D elementBounds = ((HasShape)node).untransformedElementBounds(childContext);
/*     */     } else {
/* 173 */       MeasureContext measureContext = childContext.measureContext();
/* 174 */       viewBox = new ViewBox(measureContext.viewWidth(), measureContext.viewHeight());
/*     */     } 
/* 176 */     return (Rectangle2D)viewBox;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static RenderContext setupRenderContext(@NotNull Object node, @NotNull RenderContext context) {
/* 181 */     return setupRenderContext(null, node, context);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static RenderContext setupRenderContext(@Nullable Instantiator instantiator, @NotNull Object node, @NotNull RenderContext context) {
/* 186 */     Mutator<PaintContext> paintContext = null;
/* 187 */     Mutator<MeasurableFontSpec> fontSpec = null;
/* 188 */     FontRenderContext fontRenderContext = null;
/* 189 */     FillRule fillRule = null;
/*     */     
/* 191 */     if (node instanceof HasPaintContext) paintContext = ((HasPaintContext)node).paintContext(); 
/* 192 */     if (node instanceof HasFontContext) fontSpec = ((HasFontContext)node).fontSpec(); 
/* 193 */     if (node instanceof HasFontRenderContext) fontRenderContext = ((HasFontRenderContext)node).fontRenderContext(); 
/* 194 */     if (node instanceof HasFillRule) fillRule = ((HasFillRule)node).fillRule();
/*     */     
/* 196 */     ContextElementAttributes contextElementAttributes = null;
/* 197 */     if (instantiator != null) contextElementAttributes = instantiator.createContextAttributes(context);
/*     */     
/* 199 */     return context.derive(paintContext, fontSpec, null, fontRenderContext, fillRule, contextElementAttributes);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static RenderContext setupInnerViewRenderContext(@NotNull ViewBox viewBox, @NotNull RenderContext context, boolean inheritAttributes) {
/* 204 */     if (inheritAttributes) {
/* 205 */       return context.derive(null, null, viewBox, null, null, null);
/*     */     }
/* 207 */     MeasureContext newMeasure = context.measureContext().derive(viewBox, Float.NaN, Float.NaN);
/*     */     
/* 209 */     return new RenderContext(context
/* 210 */         .targetComponent(), new AffineTransform(), new AffineTransform(), 
/*     */ 
/*     */         
/* 213 */         PaintContext.createDefault(), newMeasure, 
/*     */         
/* 215 */         FontRenderContext.createDefault(), 
/* 216 */         MeasurableFontSpec.createDefault(), context
/* 217 */         .fillRule(), context
/* 218 */         .contextElementAttributes());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\renderer\NodeRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */