/*     */ package com.github.weisj.jsvg.nodes;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.PaintOrder;
/*     */ import com.github.weisj.jsvg.attributes.VectorEffect;
/*     */ import com.github.weisj.jsvg.attributes.font.FontParser;
/*     */ import com.github.weisj.jsvg.attributes.font.FontSize;
/*     */ import com.github.weisj.jsvg.attributes.font.MeasurableFontSpec;
/*     */ import com.github.weisj.jsvg.geometry.MeasurableShape;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasFontContext;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasPaintContext;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasShape;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasVectorEffects;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Instantiator;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Mutator;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.PaintContext;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import com.github.weisj.jsvg.renderer.ShapeRenderer;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Shape;
/*     */ import java.awt.Stroke;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.util.Set;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ 
/*     */ public abstract class ShapeNode
/*     */   extends RenderableSVGNode
/*     */   implements HasShape, HasPaintContext, HasFontContext, HasVectorEffects, Instantiator
/*     */ {
/*     */   private PaintOrder paintOrder;
/*     */   private PaintContext paintContext;
/*     */   private FontSize fontSize;
/*     */   private Length fontSizeAdjust;
/*     */   private Length pathLength;
/*     */   private MeasurableShape shape;
/*     */   private Marker markerStart;
/*     */   private Marker markerMid;
/*     */   private Marker markerEnd;
/*     */   private Set<VectorEffect> vectorEffects;
/*     */   
/*     */   @NotNull
/*     */   public PaintContext paintContext() {
/*  65 */     return this.paintContext;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Mutator<MeasurableFontSpec> fontSpec() {
/*  70 */     return s -> s.withFontSize(this.fontSize, this.fontSizeAdjust);
/*     */   }
/*     */   @NotNull
/*     */   public MeasurableShape shape() {
/*  74 */     return this.shape;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Set<VectorEffect> vectorEffects() {
/*  79 */     return this.vectorEffects;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void build(@NotNull AttributeNode attributeNode) {
/*  84 */     super.build(attributeNode);
/*  85 */     this.paintOrder = PaintOrder.parse(attributeNode);
/*  86 */     this.paintContext = PaintContext.parse(attributeNode);
/*     */     
/*  88 */     this.fontSize = FontParser.parseFontSize(attributeNode);
/*  89 */     this.fontSizeAdjust = FontParser.parseSizeAdjust(attributeNode);
/*     */     
/*  91 */     this.shape = buildShape(attributeNode);
/*  92 */     this.pathLength = attributeNode.getLength("pathLength", Length.UNSPECIFIED);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     Marker template = (Marker)attributeNode.getElementByHref(Marker.class, attributeNode.getValue("marker"));
/*  98 */     this.markerStart = (Marker)attributeNode.getElementByHref(Marker.class, attributeNode.getValue("marker-start"));
/*  99 */     if (this.markerStart == null) this.markerStart = template;
/*     */     
/* 101 */     this.markerMid = (Marker)attributeNode.getElementByHref(Marker.class, attributeNode.getValue("marker-mid"));
/* 102 */     if (this.markerMid == null) this.markerMid = template;
/*     */     
/* 104 */     this.markerEnd = (Marker)attributeNode.getElementByHref(Marker.class, attributeNode.getValue("marker-end"));
/* 105 */     if (this.markerEnd == null) this.markerEnd = template;
/*     */     
/* 107 */     this.vectorEffects = VectorEffect.parse(attributeNode);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Shape untransformedElementShape(@NotNull RenderContext context) {
/* 114 */     return this.shape.shape(context);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Rectangle2D untransformedElementBounds(@NotNull RenderContext context) {
/* 119 */     return this.shape.bounds(context, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isVisible(@NotNull RenderContext context) {
/* 124 */     return super.isVisible(context);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canInstantiate(@NotNull SVGNode node) {
/* 129 */     return node instanceof Marker;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void render(@NotNull RenderContext context, @NotNull Graphics2D g) {
/* 134 */     MeasureContext measureContext = context.measureContext();
/* 135 */     Shape paintShape = this.shape.shape(context);
/*     */ 
/*     */     
/* 138 */     Rectangle2D bounds = this.shape.usesOptimizedBoundsCalculation() ? this.shape.bounds(context, false) : null;
/* 139 */     float pathLengthFactor = 1.0F;
/* 140 */     if (this.pathLength.isSpecified()) {
/* 141 */       double effectiveLength = this.pathLength.resolveLength(measureContext);
/* 142 */       double actualLength = this.shape.pathLength(measureContext);
/* 143 */       pathLengthFactor = (float)(actualLength / effectiveLength);
/*     */     } 
/*     */     
/* 146 */     Stroke effectiveStroke = context.stroke(pathLengthFactor);
/* 147 */     ShapeRenderer.renderWithPaintOrder(g, this.shape.canBeFilled(), this.paintOrder, new ShapeRenderer.ShapePaintContext(context, 
/* 148 */           vectorEffects(), effectiveStroke, transform()), new ShapeRenderer.PaintShape(paintShape, bounds), new ShapeRenderer.ShapeMarkerInfo(this, this.markerStart, this.markerMid, this.markerEnd, 
/*     */ 
/*     */           
/* 151 */           shouldPaintStartEndMarkersInMiddle()));
/*     */   }
/*     */   
/*     */   protected boolean shouldPaintStartEndMarkersInMiddle() {
/* 155 */     return true;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected abstract MeasurableShape buildShape(@NotNull AttributeNode paramAttributeNode);
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\ShapeNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */