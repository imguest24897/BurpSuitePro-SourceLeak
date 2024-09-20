/*     */ package com.github.weisj.jsvg.renderer;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.paint.AwtSVGPaint;
/*     */ import com.github.weisj.jsvg.attributes.paint.SVGPaint;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Mutator;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import java.awt.Color;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class PaintContext
/*     */   implements Mutator<PaintContext>
/*     */ {
/*     */   @Nullable
/*     */   public final AwtSVGPaint color;
/*     */   @Nullable
/*     */   public final SVGPaint fillPaint;
/*     */   @Nullable
/*     */   public final SVGPaint strokePaint;
/*     */   public final float opacity;
/*     */   public final float fillOpacity;
/*     */   public final float strokeOpacity;
/*     */   @Nullable
/*     */   public final StrokeContext strokeContext;
/*     */   
/*     */   public PaintContext(@Nullable AwtSVGPaint color, @Nullable SVGPaint fillPaint, float fillOpacity, @Nullable SVGPaint strokePaint, float strokeOpacity, float opacity, @Nullable StrokeContext strokeContext) {
/*  51 */     this.color = color;
/*  52 */     this.fillPaint = fillPaint;
/*  53 */     this.strokePaint = strokePaint;
/*  54 */     this.fillOpacity = fillOpacity;
/*  55 */     this.strokeOpacity = strokeOpacity;
/*  56 */     this.opacity = opacity;
/*     */     
/*  58 */     this.strokeContext = (strokeContext == null || strokeContext.isTrivial()) ? null : strokeContext;
/*     */   }
/*     */   @NotNull
/*     */   public static PaintContext createDefault() {
/*  62 */     return new PaintContext(SVGPaint.DEFAULT_PAINT, (SVGPaint)SVGPaint.DEFAULT_PAINT, 1.0F, SVGPaint.NONE, 1.0F, 1.0F, 
/*     */ 
/*     */ 
/*     */         
/*  66 */         StrokeContext.createDefault());
/*     */   }
/*     */   @NotNull
/*     */   public static PaintContext parse(@NotNull AttributeNode attributeNode) {
/*  70 */     return new PaintContext(
/*  71 */         parseColorAttribute(attributeNode), attributeNode
/*  72 */         .getPaint("fill"), attributeNode
/*  73 */         .getPercentage("fill-opacity", 1.0F), attributeNode
/*  74 */         .getPaint("stroke"), attributeNode
/*  75 */         .getPercentage("stroke-opacity", 1.0F), attributeNode
/*  76 */         .getPercentage("opacity", 1.0F), 
/*  77 */         StrokeContext.parse(attributeNode));
/*     */   }
/*     */   @Nullable
/*     */   private static AwtSVGPaint parseColorAttribute(@NotNull AttributeNode attributeNode) {
/*  81 */     Color c = attributeNode.getColor("color", null);
/*  82 */     if (c == null) return null; 
/*  83 */     return new AwtSVGPaint(c);
/*     */   }
/*     */   @NotNull
/*     */   public PaintContext derive(@NotNull PaintContext context) {
/*  87 */     return new PaintContext(
/*  88 */         (context.color != null) ? context.color : this.color, 
/*  89 */         (context.fillPaint != null) ? context.fillPaint : this.fillPaint, this.fillOpacity * context.fillOpacity, 
/*     */         
/*  91 */         (context.strokePaint != null) ? context.strokePaint : this.strokePaint, this.strokeOpacity * context.strokeOpacity, this.opacity * context.opacity, 
/*     */ 
/*     */         
/*  94 */         (this.strokeContext != null) ? 
/*  95 */         this.strokeContext.derive(context.strokeContext) : 
/*  96 */         context.strokeContext);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public PaintContext mutate(@NotNull PaintContext element) {
/* 101 */     return element.derive(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 106 */     return "PaintContext{color=" + this.color + ", fillPaint=" + this.fillPaint + ", strokePaint=" + this.strokePaint + ", opacity=" + this.opacity + ", fillOpacity=" + this.fillOpacity + ", strokeOpacity=" + this.strokeOpacity + ", strokeContext=" + this.strokeContext + '}';
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\renderer\PaintContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */