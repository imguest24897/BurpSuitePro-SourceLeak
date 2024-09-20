/*     */ package com.github.weisj.jsvg.renderer;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.FillRule;
/*     */ import com.github.weisj.jsvg.attributes.ViewBox;
/*     */ import com.github.weisj.jsvg.attributes.font.FontResolver;
/*     */ import com.github.weisj.jsvg.attributes.font.MeasurableFontSpec;
/*     */ import com.github.weisj.jsvg.attributes.font.SVGFont;
/*     */ import com.github.weisj.jsvg.attributes.paint.SVGPaint;
/*     */ import com.github.weisj.jsvg.attributes.stroke.StrokeResolver;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Mutator;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Image;
/*     */ import java.awt.Stroke;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.Point2D;
/*     */ import java.awt.image.ImageProducer;
/*     */ import javax.swing.JComponent;
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
/*     */ public final class RenderContext
/*     */ {
/*     */   @Nullable
/*     */   private final JComponent targetComponent;
/*     */   @NotNull
/*     */   private final MeasureContext measureContext;
/*     */   @NotNull
/*     */   private final PaintContext paintContext;
/*     */   @NotNull
/*     */   private final FontRenderContext fontRenderContext;
/*     */   @NotNull
/*     */   private final MeasurableFontSpec fontSpec;
/*     */   @NotNull
/*     */   private final FillRule fillRule;
/*     */   @Nullable
/*     */   private final ContextElementAttributes contextElementAttributes;
/*     */   @NotNull
/*     */   private final AffineTransform rootTransform;
/*     */   @NotNull
/*     */   private final AffineTransform userSpaceTransform;
/*     */   
/*     */   @NotNull
/*     */   public static RenderContext createInitial(@Nullable JComponent targetComponent, @NotNull MeasureContext measureContext) {
/*  64 */     return new RenderContext(targetComponent, new AffineTransform(), new AffineTransform(), 
/*     */ 
/*     */         
/*  67 */         PaintContext.createDefault(), measureContext, 
/*     */         
/*  69 */         FontRenderContext.createDefault(), 
/*  70 */         MeasurableFontSpec.createDefault(), FillRule.Nonzero, null);
/*     */   }
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
/*     */   RenderContext(@Nullable JComponent targetComponent, @NotNull AffineTransform rootTransform, @NotNull AffineTransform userSpaceTransform, @NotNull PaintContext paintContext, @NotNull MeasureContext measureContext, @NotNull FontRenderContext fontRenderContext, @NotNull MeasurableFontSpec fontSpec, @NotNull FillRule fillRule, @Nullable ContextElementAttributes contextElementAttributes) {
/*  84 */     this.targetComponent = targetComponent;
/*  85 */     this.rootTransform = rootTransform;
/*  86 */     this.userSpaceTransform = userSpaceTransform;
/*  87 */     this.paintContext = paintContext;
/*  88 */     this.measureContext = measureContext;
/*  89 */     this.fontRenderContext = fontRenderContext;
/*  90 */     this.fontSpec = fontSpec;
/*  91 */     this.fillRule = fillRule;
/*  92 */     this.contextElementAttributes = contextElementAttributes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   RenderContext derive(@Nullable Mutator<PaintContext> context, @Nullable Mutator<MeasurableFontSpec> attributeFontSpec, @Nullable ViewBox viewBox, @Nullable FontRenderContext frc, @Nullable FillRule fillRule, @Nullable ContextElementAttributes contextAttributes) {
/* 100 */     if (context == null && viewBox == null && attributeFontSpec == null && frc == null) return this; 
/* 101 */     PaintContext newPaintContext = this.paintContext;
/* 102 */     MeasurableFontSpec newFontSpec = this.fontSpec;
/* 103 */     FillRule newFillRule = (fillRule != null && fillRule != FillRule.Inherit) ? fillRule : this.fillRule;
/*     */     
/* 105 */     if (context != null) newPaintContext = (PaintContext)context.mutate(this.paintContext); 
/* 106 */     if (attributeFontSpec != null) newFontSpec = (MeasurableFontSpec)attributeFontSpec.mutate(newFontSpec);
/*     */     
/* 108 */     ContextElementAttributes newContextAttributes = this.contextElementAttributes;
/* 109 */     if (contextAttributes != null) newContextAttributes = contextAttributes;
/*     */     
/* 111 */     float em = newFontSpec.effectiveSize(this.measureContext);
/* 112 */     float ex = SVGFont.exFromEm(em);
/* 113 */     MeasureContext newMeasureContext = this.measureContext.derive(viewBox, em, ex);
/*     */     
/* 115 */     FontRenderContext effectiveFrc = this.fontRenderContext.derive(frc);
/*     */     
/* 117 */     return new RenderContext(this.targetComponent, this.rootTransform, new AffineTransform(this.userSpaceTransform), newPaintContext, newMeasureContext, effectiveFrc, newFontSpec, newFillRule, newContextAttributes);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public RenderContext deriveForChildGraphics() {
/* 123 */     return derive(t -> t, null, null, null, null, null);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public StrokeContext strokeContext() {
/* 129 */     assert this.paintContext.strokeContext != null;
/* 130 */     return this.paintContext.strokeContext;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   ContextElementAttributes contextElementAttributes() {
/* 135 */     return this.contextElementAttributes;
/*     */   }
/*     */   @NotNull
/*     */   public AffineTransform rootTransform() {
/* 139 */     return this.rootTransform;
/*     */   }
/*     */   @NotNull
/*     */   public AffineTransform userSpaceTransform() {
/* 143 */     return this.userSpaceTransform;
/*     */   }
/*     */   
/*     */   public void setRootTransform(@NotNull AffineTransform rootTransform) {
/* 147 */     this.rootTransform.setTransform(rootTransform);
/* 148 */     this.userSpaceTransform.setToIdentity();
/*     */   }
/*     */   
/*     */   public void setRootTransform(@NotNull AffineTransform rootTransform, @NotNull AffineTransform userSpaceTransform) {
/* 152 */     this.rootTransform.setTransform(rootTransform);
/* 153 */     this.userSpaceTransform.setTransform(userSpaceTransform);
/*     */   }
/*     */   
/*     */   public void translate(@NotNull Graphics2D g, @NotNull Point2D dp) {
/* 157 */     translate(g, dp.getX(), dp.getY());
/*     */   }
/*     */ 
/*     */   
/*     */   public void translate(@NotNull Graphics2D g, double dx, double dy) {
/* 162 */     g.translate(dx, dy);
/* 163 */     this.userSpaceTransform.translate(dx, dy);
/*     */   }
/*     */   
/*     */   public void scale(@NotNull Graphics2D g, double sx, double sy) {
/* 167 */     g.scale(sx, sy);
/* 168 */     this.userSpaceTransform.scale(sx, sy);
/*     */   }
/*     */   
/*     */   public void rotate(@NotNull Graphics2D g, double angle) {
/* 172 */     g.rotate(angle);
/* 173 */     this.userSpaceTransform.rotate(angle);
/*     */   }
/*     */   
/*     */   public void transform(@NotNull Graphics2D g, @NotNull AffineTransform at) {
/* 177 */     g.transform(at);
/* 178 */     this.userSpaceTransform.concatenate(at);
/*     */   }
/*     */   @Nullable
/*     */   public JComponent targetComponent() {
/* 182 */     return this.targetComponent;
/*     */   }
/*     */   @NotNull
/*     */   public MeasureContext measureContext() {
/* 186 */     return this.measureContext;
/*     */   }
/*     */   @NotNull
/*     */   public FontRenderContext fontRenderContext() {
/* 190 */     return this.fontRenderContext;
/*     */   }
/*     */   @NotNull
/*     */   public FillRule fillRule() {
/* 194 */     return this.fillRule;
/*     */   }
/*     */   @NotNull
/*     */   public SVGPaint strokePaint() {
/* 198 */     return resolvePaint(this.paintContext.strokePaint);
/*     */   }
/*     */   @NotNull
/*     */   public SVGPaint fillPaint() {
/* 202 */     return resolvePaint(this.paintContext.fillPaint);
/*     */   }
/*     */   @NotNull
/*     */   private SVGPaint resolvePaint(@Nullable SVGPaint p) {
/* 206 */     if (p == SVGPaint.DEFAULT_PAINT || p == SVGPaint.CURRENT_COLOR)
/*     */     {
/* 208 */       return coerceNonNull((SVGPaint)this.paintContext.color);
/*     */     }
/* 210 */     if (p == SVGPaint.CONTEXT_STROKE) {
/*     */       
/* 212 */       if (this.contextElementAttributes == null) return SVGPaint.NONE; 
/* 213 */       return this.contextElementAttributes.strokePaint;
/*     */     } 
/* 215 */     if (p == SVGPaint.CONTEXT_FILL) {
/*     */       
/* 217 */       if (this.contextElementAttributes == null) return SVGPaint.NONE; 
/* 218 */       return this.contextElementAttributes.fillPaint;
/*     */     } 
/* 220 */     return coerceNonNull(p);
/*     */   }
/*     */   @NotNull
/*     */   private SVGPaint coerceNonNull(@Nullable SVGPaint p) {
/* 224 */     return (p != null) ? p : (SVGPaint)SVGPaint.DEFAULT_PAINT;
/*     */   }
/*     */   
/*     */   public float rawOpacity() {
/* 228 */     return this.paintContext.opacity;
/*     */   }
/*     */   
/*     */   public float fillOpacity() {
/* 232 */     return this.paintContext.fillOpacity * this.paintContext.opacity;
/*     */   }
/*     */   
/*     */   public float strokeOpacity() {
/* 236 */     return this.paintContext.strokeOpacity * this.paintContext.opacity;
/*     */   }
/*     */   @NotNull
/*     */   public Stroke stroke(float pathLengthFactor) {
/* 240 */     return StrokeResolver.resolve(pathLengthFactor, this.measureContext, strokeContext());
/*     */   }
/*     */   @NotNull
/*     */   public SVGFont font() {
/* 244 */     return FontResolver.resolve(this.fontSpec, this.measureContext);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 249 */     return "RenderContext{\n  measureContext=" + this.measureContext + ",\n paintContext=" + this.paintContext + ",\n fontSpec=" + this.fontSpec + ",\n targetComponent=" + this.targetComponent + ",\n contextElementAttributes=" + this.contextElementAttributes + ",\n fillRule=" + this.fillRule + ",\n baseTransform=" + this.rootTransform + ",\n userSpaceTransform=" + this.userSpaceTransform + "\n}";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Image createImage(@NotNull ImageProducer imageProducer) {
/* 262 */     if (this.targetComponent != null) {
/* 263 */       return this.targetComponent.createImage(imageProducer);
/*     */     }
/* 265 */     return Toolkit.getDefaultToolkit().createImage(imageProducer);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\renderer\RenderContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */