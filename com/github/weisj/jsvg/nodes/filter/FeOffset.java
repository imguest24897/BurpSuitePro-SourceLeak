/*     */ package com.github.weisj.jsvg.nodes.filter;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.UnitType;
/*     */ import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
/*     */ import com.github.weisj.jsvg.geometry.util.GeometryUtil;
/*     */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*     */ import com.github.weisj.jsvg.nodes.animation.Set;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.Point2D;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.awt.image.AffineTransformOp;
/*     */ import java.awt.image.BufferedImageFilter;
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
/*     */ @ElementCategories({Category.FilterPrimitive})
/*     */ @PermittedContent(anyOf = {Animate.class, Set.class})
/*     */ public final class FeOffset
/*     */   extends AbstractFilterPrimitive
/*     */ {
/*     */   public static final String TAG = "feOffset";
/*     */   private float dx;
/*     */   private float dy;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  56 */     return "feOffset";
/*     */   }
/*     */ 
/*     */   
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  61 */     super.build(attributeNode);
/*  62 */     this.dx = attributeNode.getFloat("dx", 0.0F);
/*  63 */     this.dy = attributeNode.getFloat("dy", 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   private Point2D.Double offset(@Nullable AffineTransform at, @NotNull UnitType filterPrimitiveUnits, @NotNull Rectangle2D elementBounds) {
/*  68 */     Point2D.Double off = new Point2D.Double(this.dx, this.dy);
/*  69 */     if (at != null) {
/*  70 */       off.x *= GeometryUtil.scaleXOfTransform(at);
/*  71 */       off.y *= GeometryUtil.scaleYOfTransform(at);
/*     */     } 
/*     */     
/*  74 */     if (filterPrimitiveUnits == UnitType.ObjectBoundingBox) {
/*  75 */       off.x *= elementBounds.getWidth();
/*  76 */       off.y *= elementBounds.getHeight();
/*     */     } 
/*     */     
/*  79 */     return off;
/*     */   }
/*     */ 
/*     */   
/*     */   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
/*  84 */     LayoutBounds input = impl().layoutInput(filterLayoutContext);
/*  85 */     Point2D.Double off = offset(null, filterLayoutContext.primitiveUnits(), filterLayoutContext.elementBounds());
/*  86 */     LayoutBounds result = input.translate((float)off.x, (float)off.y, filterLayoutContext);
/*  87 */     impl().saveLayoutResult(result, filterLayoutContext);
/*     */   }
/*     */ 
/*     */   
/*     */   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
/*  92 */     Channel in = impl().inputChannel(filterContext);
/*  93 */     Channel result = in;
/*  94 */     if (this.dx != 0.0F || this.dy != 0.0F) {
/*  95 */       AffineTransform at = filterContext.info().graphics().getTransform();
/*  96 */       Point2D.Double off = offset(at, filterContext.primitiveUnits(), filterContext.info().elementBounds());
/*  97 */       AffineTransform transform = AffineTransform.getTranslateInstance(off.x, off.y);
/*     */       
/*  99 */       AffineTransformOp op = new AffineTransformOp(transform, filterContext.renderingHints());
/* 100 */       result = in.applyFilter(new BufferedImageFilter(op));
/*     */     } 
/*     */     
/* 103 */     impl().saveResult(result, filterContext);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\FeOffset.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */