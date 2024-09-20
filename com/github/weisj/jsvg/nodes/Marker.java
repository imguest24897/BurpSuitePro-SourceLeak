/*     */ package com.github.weisj.jsvg.nodes;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.MarkerOrientation;
/*     */ import com.github.weisj.jsvg.attributes.MarkerUnitType;
/*     */ import com.github.weisj.jsvg.attributes.Overflow;
/*     */ import com.github.weisj.jsvg.attributes.ViewBox;
/*     */ import com.github.weisj.jsvg.geometry.size.FloatSize;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.nodes.container.BaseInnerViewContainer;
/*     */ import com.github.weisj.jsvg.nodes.filter.Filter;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.nodes.text.Text;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.NodeRenderer;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.geom.Point2D;
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
/*     */ @ElementCategories({Category.Container})
/*     */ @PermittedContent(categories = {Category.Animation, Category.Descriptive, Category.Shape, Category.Structural, Category.Gradient}, anyOf = {Anchor.class, ClipPath.class, Filter.class, Image.class, Mask.class, Marker.class, Pattern.class, Style.class, Text.class, View.class})
/*     */ public final class Marker
/*     */   extends BaseInnerViewContainer
/*     */ {
/*     */   public static final String TAG = "marker";
/*     */   private Length refX;
/*     */   private Length refY;
/*     */   private MarkerOrientation orientation;
/*     */   private MarkerUnitType markerUnits;
/*     */   private Length markerHeight;
/*     */   private Length markerWidth;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  69 */     return "marker";
/*     */   }
/*     */   @NotNull
/*     */   public MarkerOrientation orientation() {
/*  73 */     return this.orientation;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected Point2D outerLocation(@NotNull MeasureContext context) {
/*  78 */     return new Point2D.Float(0.0F, 0.0F);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected Point2D anchorLocation(@NotNull MeasureContext context) {
/*  83 */     return new Point2D.Float(-this.refX.resolveWidth(context), -this.refY.resolveHeight(context));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected Overflow defaultOverflow() {
/*  88 */     return Overflow.Hidden;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public FloatSize size(@NotNull RenderContext context) {
/*  93 */     MeasureContext measure = context.measureContext();
/*  94 */     if (this.markerUnits == MarkerUnitType.StrokeWidth) {
/*  95 */       Length strokeWidthLength = (context.strokeContext()).strokeWidth;
/*  96 */       assert strokeWidthLength != null;
/*  97 */       float strokeWidth = strokeWidthLength.resolveLength(measure);
/*  98 */       return new FloatSize(this.markerWidth.raw() * strokeWidth, this.markerHeight.raw() * strokeWidth);
/*     */     } 
/* 100 */     return new FloatSize(this.markerWidth.resolveWidth(measure), this.markerHeight.resolveHeight(measure));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/* 106 */     super.build(attributeNode);
/* 107 */     this.refX = attributeNode.getHorizontalReferenceLength("refX");
/* 108 */     this.refY = attributeNode.getHorizontalReferenceLength("refY");
/*     */     
/* 110 */     this.orientation = MarkerOrientation.parse(attributeNode.getValue("orient"), attributeNode.parser());
/*     */     
/* 112 */     this.markerUnits = (MarkerUnitType)attributeNode.getEnum("markerUnits", (Enum)MarkerUnitType.StrokeWidth);
/* 113 */     this.markerWidth = attributeNode.getLength("markerWidth", 3.0F);
/* 114 */     this.markerHeight = attributeNode.getLength("markerHeight", 3.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean requiresInstantiation() {
/* 119 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   protected RenderContext createInnerContext(@NotNull RenderContext context, @NotNull ViewBox viewBox) {
/* 125 */     return NodeRenderer.setupInnerViewRenderContext(viewBox, context, false);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\Marker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */