/*     */ package com.github.weisj.jsvg.nodes;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.SpreadMethod;
/*     */ import com.github.weisj.jsvg.attributes.UnitType;
/*     */ import com.github.weisj.jsvg.attributes.paint.PaintParser;
/*     */ import com.github.weisj.jsvg.attributes.paint.SVGPaint;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.nodes.container.ContainerNode;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.GraphicsUtil;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Paint;
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.util.List;
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
/*     */ abstract class AbstractGradient<Self extends AbstractGradient<Self>>
/*     */   extends ContainerNode
/*     */   implements SVGPaint
/*     */ {
/*     */   protected AffineTransform gradientTransform;
/*     */   protected UnitType gradientUnits;
/*     */   protected SpreadMethod spreadMethod;
/*     */   @NotNull
/*     */   private Color[] colors;
/*     */   private float[] offsets;
/*     */   
/*     */   public final float[] offsets() {
/*  53 */     return this.offsets;
/*     */   }
/*     */   @NotNull
/*     */   public final Color[] colors() {
/*  57 */     return this.colors;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void build(@NotNull AttributeNode attributeNode) {
/*  62 */     super.build(attributeNode);
/*     */     
/*  64 */     AbstractGradient<?> template = parseTemplate(attributeNode);
/*     */     
/*  66 */     this.gradientUnits = (UnitType)attributeNode.getEnum("gradientUnits", 
/*  67 */         (template != null) ? (Enum)template.gradientUnits : (Enum)UnitType.ObjectBoundingBox);
/*  68 */     this.spreadMethod = (SpreadMethod)attributeNode.getEnum("spreadMethod", 
/*  69 */         (template != null) ? (Enum)template.spreadMethod : (Enum)SpreadMethod.Pad);
/*     */     
/*  71 */     this.gradientTransform = attributeNode.parseTransform("gradientTransform");
/*  72 */     if (this.gradientTransform == null && template != null) {
/*  73 */       this.gradientTransform = template.gradientTransform;
/*     */     }
/*     */     
/*  76 */     List<Stop> stops = childrenOfType(Stop.class);
/*  77 */     if (stops.isEmpty() && template != null) {
/*  78 */       this.colors = template.colors();
/*  79 */       this.offsets = template.offsets();
/*     */     } else {
/*  81 */       parseStops(stops);
/*     */     } 
/*     */ 
/*     */     
/*  85 */     AbstractGradient<?> abstractGradient1 = getClass().isInstance(template) ? template : null;
/*  86 */     buildGradient(attributeNode, (Self)abstractGradient1);
/*  87 */     children().clear();
/*     */   }
/*     */   
/*     */   private void parseStops(@NotNull List<Stop> stops) {
/*  91 */     stops.sort((s1, s2) -> Float.compare(s1.offset(), s2.offset()));
/*  92 */     this.colors = new Color[stops.size()];
/*  93 */     this.offsets = new float[stops.size()];
/*     */     
/*  95 */     boolean realGradient = false;
/*  96 */     for (int i = 0; i < this.offsets.length; i++) {
/*  97 */       Stop stop = stops.get(i);
/*     */       
/*  99 */       float stopOffset = Math.max(0.0F, Math.min(1.0F, stop.offset()));
/* 100 */       Color stopColor = stop.color();
/*     */       
/* 102 */       if (i > 0) {
/*     */ 
/*     */ 
/*     */         
/* 106 */         realGradient = (realGradient || stopOffset > ((Stop)stops.get(i - 1)).offset() || !stopColor.equals(this.colors[i - 1]));
/*     */         
/* 108 */         if (stopOffset <= this.offsets[i - 1])
/*     */         {
/*     */ 
/*     */           
/* 112 */           stopOffset = Math.nextAfter(this.offsets[i - 1], Double.MAX_VALUE);
/*     */         }
/*     */       } 
/*     */       
/* 116 */       this.offsets[i] = stopOffset;
/* 117 */       this.colors[i] = stopColor;
/*     */     } 
/*     */ 
/*     */     
/* 121 */     if (this.offsets[this.offsets.length - 1] > 1.0F) {
/* 122 */       float diff = this.offsets[this.offsets.length - 1] - 1.0F;
/* 123 */       this.offsets[this.offsets.length - 1] = 1.0F;
/* 124 */       int j = this.offsets.length - 2;
/* 125 */       while (j >= 0 && this.offsets[j] >= this.offsets[j + 1]) {
/* 126 */         this.offsets[j] = this.offsets[j] - diff;
/*     */       }
/*     */     } 
/*     */     
/* 130 */     if (!realGradient && this.colors.length > 0) {
/*     */ 
/*     */       
/* 133 */       this.colors = new Color[] { this.colors[0] };
/* 134 */       this.offsets = new float[] { 0.0F };
/*     */     }
/*     */     else {
/*     */       
/* 138 */       int offsetLength = this.offsets.length;
/* 139 */       int off = 0;
/*     */       
/* 141 */       boolean fixFirst = false;
/* 142 */       boolean fixLast = false;
/*     */       
/* 144 */       if (this.offsets[0] != 0.0F) {
/*     */         
/* 146 */         fixFirst = true;
/* 147 */         offsetLength++;
/* 148 */         off++;
/*     */       } 
/* 150 */       if (this.offsets[this.offsets.length - 1] != 1.0F) {
/*     */         
/* 152 */         fixLast = true;
/* 153 */         offsetLength++;
/*     */       } 
/*     */       
/* 156 */       float[] oldOffsets = this.offsets;
/* 157 */       Color[] oldColors = this.colors;
/*     */       
/* 159 */       this.offsets = new float[offsetLength];
/* 160 */       this.colors = new Color[offsetLength];
/*     */       
/* 162 */       System.arraycopy(oldOffsets, 0, this.offsets, off, oldOffsets.length);
/* 163 */       System.arraycopy(oldColors, 0, this.colors, off, oldColors.length);
/*     */       
/* 165 */       if (fixFirst) {
/* 166 */         this.offsets[0] = 0.0F;
/* 167 */         this.colors[0] = oldColors[0];
/*     */       } 
/* 169 */       if (fixLast) {
/* 170 */         this.offsets[offsetLength - 1] = 1.0F;
/* 171 */         this.colors[offsetLength - 1] = oldColors[oldColors.length - 1];
/*     */       } 
/*     */     } 
/*     */   }
/*     */   @Nullable
/*     */   private AbstractGradient<?> parseTemplate(@NotNull AttributeNode attributeNode) {
/* 177 */     AbstractGradient<?> template = (AbstractGradient)attributeNode.getElementByHref(AbstractGradient.class, attributeNode.getHref());
/* 178 */     return (template != this) ? template : null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void fillShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
/* 186 */     Rectangle2D b = (bounds != null) ? bounds : shape.getBounds2D();
/* 187 */     GraphicsUtil.safelySetPaint(g, paintForBounds(context.measureContext(), b));
/* 188 */     g.fill(shape);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
/* 194 */     Rectangle2D b = (bounds != null) ? bounds : shape.getBounds2D();
/* 195 */     GraphicsUtil.safelySetPaint(g, paintForBounds(context.measureContext(), b));
/* 196 */     g.draw(shape);
/*     */   }
/*     */   @NotNull
/*     */   private Paint paintForBounds(@NotNull MeasureContext context, @NotNull Rectangle2D bounds) {
/* 200 */     Color[] gradColors = colors();
/* 201 */     if (gradColors.length == 0) return PaintParser.DEFAULT_COLOR; 
/* 202 */     if (gradColors.length == 1) return gradColors[0]; 
/* 203 */     return gradientForBounds(this.gradientUnits.deriveMeasure(context), bounds, offsets(), gradColors);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   protected final AffineTransform computeViewTransform(@NotNull Rectangle2D bounds) {
/* 210 */     AffineTransform viewTransform = this.gradientUnits.viewTransform(bounds);
/* 211 */     if (this.gradientTransform != null) viewTransform.concatenate(this.gradientTransform); 
/* 212 */     return viewTransform;
/*     */   }
/*     */   
/*     */   protected abstract void buildGradient(@NotNull AttributeNode paramAttributeNode, @Nullable Self paramSelf);
/*     */   
/*     */   @NotNull
/*     */   protected abstract Paint gradientForBounds(@NotNull MeasureContext paramMeasureContext, @NotNull Rectangle2D paramRectangle2D, float[] paramArrayOffloat, @NotNull Color[] paramArrayOfColor);
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\AbstractGradient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */