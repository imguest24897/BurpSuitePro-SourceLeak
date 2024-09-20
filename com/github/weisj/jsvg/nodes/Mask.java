/*     */ package com.github.weisj.jsvg.nodes;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.UnitType;
/*     */ import com.github.weisj.jsvg.attributes.paint.PaintParser;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.Unit;
/*     */ import com.github.weisj.jsvg.nodes.container.CommonRenderableContainerNode;
/*     */ import com.github.weisj.jsvg.nodes.filter.Filter;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Instantiator;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.nodes.text.Text;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.MaskedPaint;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import com.github.weisj.jsvg.util.BlittableImage;
/*     */ import com.github.weisj.jsvg.util.ImageUtil;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Paint;
/*     */ import java.awt.geom.Point2D;
/*     */ import java.awt.geom.Rectangle2D;
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
/*     */ @ElementCategories({Category.Container})
/*     */ @PermittedContent(categories = {Category.Animation, Category.Descriptive, Category.Shape, Category.Structural, Category.Gradient}, anyOf = {Anchor.class, ClipPath.class, Filter.class, Image.class, Marker.class, Mask.class, Pattern.class, Style.class, Text.class, View.class})
/*     */ public final class Mask
/*     */   extends CommonRenderableContainerNode
/*     */   implements Instantiator
/*     */ {
/*     */   private static final boolean DEBUG = false;
/*     */   public static final String TAG = "mask";
/*     */   private Length x;
/*     */   private Length y;
/*     */   private Length width;
/*     */   private Length height;
/*     */   private UnitType maskContentUnits;
/*     */   private UnitType maskUnits;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  71 */     return "mask";
/*     */   }
/*     */ 
/*     */   
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  76 */     super.build(attributeNode);
/*  77 */     this.x = attributeNode.getLength("x", Unit.PERCENTAGE.valueOf(-10.0F));
/*  78 */     this.y = attributeNode.getLength("y", Unit.PERCENTAGE.valueOf(-10.0F));
/*  79 */     this.width = attributeNode.getLength("width", Unit.PERCENTAGE.valueOf(120.0F));
/*  80 */     this.height = attributeNode.getLength("height", Unit.PERCENTAGE.valueOf(120.0F));
/*     */     
/*  82 */     this.maskContentUnits = (UnitType)attributeNode.getEnum("maskContentUnits", (Enum)UnitType.UserSpaceOnUse);
/*  83 */     this.maskUnits = (UnitType)attributeNode.getEnum("maskUnits", (Enum)UnitType.ObjectBoundingBox);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Paint createMaskPaint(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Rectangle2D objectBounds) {
/*  88 */     Rectangle2D.Double maskBounds = this.maskUnits.computeViewBounds(context
/*  89 */         .measureContext(), objectBounds, this.x, this.y, this.width, this.height);
/*     */     
/*  91 */     BlittableImage blitImage = BlittableImage.create(ImageUtil::createLuminosityBuffer, context, g
/*  92 */         .getClipBounds(), maskBounds
/*  93 */         .createIntersection(objectBounds), objectBounds, this.maskContentUnits);
/*  94 */     Rectangle2D maskBoundsInUserSpace = blitImage.boundsInUserSpace();
/*     */     
/*  96 */     if (isInvalidMaskingArea(maskBoundsInUserSpace)) return PaintParser.DEFAULT_COLOR;
/*     */     
/*  98 */     blitImage.renderNode(g, (SVGNode)this, this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 108 */     Point2D offset = new Point2D.Double(maskBoundsInUserSpace.getX(), maskBoundsInUserSpace.getY());
/* 109 */     context.rootTransform().transform(offset, offset);
/* 110 */     return (Paint)new MaskedPaint(PaintParser.DEFAULT_COLOR, blitImage.image().getRaster(), offset);
/*     */   }
/*     */   
/*     */   private boolean isInvalidMaskingArea(@NotNull Rectangle2D area) {
/* 114 */     return (area.isEmpty() || Double.isNaN(area.getWidth()) || Double.isNaN(area.getHeight()));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean requiresInstantiation() {
/* 119 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canInstantiate(@NotNull SVGNode node) {
/* 124 */     return (node == this);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\Mask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */