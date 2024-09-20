/*     */ package com.github.weisj.jsvg.nodes;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.Overflow;
/*     */ import com.github.weisj.jsvg.geometry.size.FloatSize;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.geometry.size.Unit;
/*     */ import com.github.weisj.jsvg.nodes.container.CommonInnerViewContainer;
/*     */ import com.github.weisj.jsvg.nodes.filter.Filter;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.nodes.text.Text;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
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
/*     */ @ElementCategories({Category.Container, Category.Structural})
/*     */ @PermittedContent(categories = {Category.Animation, Category.Descriptive, Category.Shape, Category.Structural, Category.Gradient}, anyOf = {Anchor.class, ClipPath.class, Filter.class, Image.class, Mask.class, Marker.class, Pattern.class, Style.class, Text.class, View.class})
/*     */ public final class SVG
/*     */   extends CommonInnerViewContainer
/*     */ {
/*     */   public static final String TAG = "svg";
/*     */   @NotNull
/*  54 */   private static final Length TOP_LEVEL_TRANSFORM_ORIGIN = Unit.PERCENTAGE.valueOf(50.0F);
/*     */   
/*     */   private static final float FALLBACK_WIDTH = 300.0F;
/*     */   private static final float FALLBACK_HEIGHT = 150.0F;
/*     */   private boolean isTopLevel;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  62 */     return "svg";
/*     */   }
/*     */   
/*     */   public boolean isTopLevel() {
/*  66 */     return this.isTopLevel;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean shouldTransform() {
/*  71 */     return !isTopLevel();
/*     */   }
/*     */ 
/*     */   
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  76 */     this.isTopLevel = (attributeNode.parent() == null);
/*  77 */     super.build(attributeNode);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Point2D transformOrigin(@NotNull MeasureContext context) {
/*  82 */     if (!this.isTopLevel) return super.transformOrigin(context); 
/*  83 */     return new Point2D.Float(TOP_LEVEL_TRANSFORM_ORIGIN
/*  84 */         .resolveWidth(context), TOP_LEVEL_TRANSFORM_ORIGIN
/*  85 */         .resolveHeight(context));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected Overflow defaultOverflow() {
/*  90 */     return this.isTopLevel ? Overflow.Visible : Overflow.Hidden;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public FloatSize sizeForTopLevel(float em, float ex) {
/*  95 */     MeasureContext topLevelContext = MeasureContext.createInitial(new FloatSize(100.0F, 100.0F), em, ex);
/*  96 */     return new FloatSize(this.width
/*  97 */         .orElseIfUnspecified((this.viewBox != null) ? this.viewBox.width : 300.0F)
/*  98 */         .resolveWidth(topLevelContext), this.height
/*  99 */         .orElseIfUnspecified((this.viewBox != null) ? this.viewBox.height : 150.0F)
/* 100 */         .resolveHeight(topLevelContext));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\SVG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */