/*     */ package com.github.weisj.jsvg.nodes;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.geometry.size.Unit;
/*     */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*     */ import com.github.weisj.jsvg.nodes.animation.AnimateTransform;
/*     */ import com.github.weisj.jsvg.nodes.animation.Set;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import com.github.weisj.jsvg.renderer.jdk.SVGRadialGradientPaint;
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.MultipleGradientPaint;
/*     */ import java.awt.Paint;
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.Point2D;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.util.Arrays;
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
/*     */ @ElementCategories({Category.Gradient})
/*     */ @PermittedContent(categories = {Category.Descriptive}, anyOf = {Stop.class, Animate.class, AnimateTransform.class, Set.class})
/*     */ public final class RadialGradient
/*     */   extends AbstractGradient<RadialGradient>
/*     */ {
/*     */   public static final String TAG = "radialgradient";
/*     */   private Length cx;
/*     */   private Length cy;
/*     */   private Length r;
/*     */   private Length fr;
/*     */   private Length fx;
/*     */   private Length fy;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  62 */     return "radialgradient";
/*     */   }
/*     */ 
/*     */   
/*     */   protected void buildGradient(@NotNull AttributeNode attributeNode, @Nullable RadialGradient template) {
/*  67 */     this.cx = attributeNode.getLength("cx", (template != null) ? template.cx : Unit.PERCENTAGE.valueOf(50.0F));
/*  68 */     this.cy = attributeNode.getLength("cy", (template != null) ? template.cy : Unit.PERCENTAGE.valueOf(50.0F));
/*  69 */     this.r = attributeNode.getLength("r", (template != null) ? template.r : Unit.PERCENTAGE.valueOf(50.0F));
/*  70 */     this.fr = attributeNode.getLength("fr", (template != null) ? template.fr : Unit.PERCENTAGE.valueOf(0.0F));
/*  71 */     this.fx = attributeNode.getLength("fx", (template != null) ? template.fx : this.cx);
/*  72 */     this.fy = attributeNode.getLength("fy", (template != null) ? template.fy : this.cy);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   protected Paint gradientForBounds(@NotNull MeasureContext measure, @NotNull Rectangle2D bounds, float[] gradOffsets, @NotNull Color[] gradColors) {
/*  78 */     Point2D.Float center = new Point2D.Float(this.cx.resolveWidth(measure), this.cy.resolveHeight(measure));
/*  79 */     Point2D.Float focusCenter = new Point2D.Float(this.fx.resolveWidth(measure), this.fy.resolveHeight(measure));
/*     */     
/*  81 */     float radius = this.r.resolveLength(measure);
/*  82 */     float focusRadius = this.fr.resolveLength(measure);
/*     */     
/*  84 */     return (Paint)new SVGRadialGradientPaint(center, radius, focusCenter, focusRadius, gradOffsets, gradColors, this.spreadMethod
/*  85 */         .cycleMethod(), MultipleGradientPaint.ColorSpaceType.SRGB, 
/*  86 */         computeViewTransform(bounds));
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  91 */     return "RadialGradient{spreadMethod=" + this.spreadMethod + ", gradientTransform=" + this.gradientTransform + ", cx=" + this.cx + ", cy=" + this.cy + ", r=" + this.r + ", fr=" + this.fr + ", fx=" + this.fx + ", fy=" + this.fy + ", colors=" + 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 100 */       Arrays.toString((Object[])colors()) + ", offsets=" + 
/* 101 */       Arrays.toString(offsets()) + '}';
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\RadialGradient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */