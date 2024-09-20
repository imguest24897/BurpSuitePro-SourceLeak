/*     */ package com.github.weisj.jsvg.nodes;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.Overflow;
/*     */ import com.github.weisj.jsvg.attributes.PreserveAspectRatio;
/*     */ import com.github.weisj.jsvg.attributes.UnitType;
/*     */ import com.github.weisj.jsvg.attributes.ViewBox;
/*     */ import com.github.weisj.jsvg.attributes.paint.SVGPaint;
/*     */ import com.github.weisj.jsvg.geometry.size.FloatSize;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.nodes.container.BaseInnerViewContainer;
/*     */ import com.github.weisj.jsvg.nodes.filter.Filter;
/*     */ import com.github.weisj.jsvg.nodes.prototype.ShapedContainer;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.nodes.text.Text;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.GraphicsUtil;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import com.github.weisj.jsvg.renderer.TransformedPaint;
/*     */ import com.github.weisj.jsvg.util.ImageUtil;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Paint;
/*     */ import java.awt.Shape;
/*     */ import java.awt.TexturePaint;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.Point2D;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.awt.image.BufferedImage;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @ElementCategories({Category.Container})
/*     */ @PermittedContent(categories = {Category.Animation, Category.Descriptive, Category.Shape, Category.Structural, Category.Gradient}, anyOf = {Anchor.class, ClipPath.class, Filter.class, Image.class, Mask.class, Marker.class, Pattern.class, Style.class, Text.class, View.class})
/*     */ public final class Pattern
/*     */   extends BaseInnerViewContainer
/*     */   implements SVGPaint, ShapedContainer<SVGNode>
/*     */ {
/*     */   public static final String TAG = "pattern";
/*     */   private Length x;
/*     */   private Length y;
/*     */   private Length width;
/*     */   private Length height;
/*     */   private UnitType patternUnits;
/*     */   private UnitType patternContentUnits;
/*     */   private AffineTransform patternTransform;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  78 */     return "pattern";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected Point2D outerLocation(@NotNull MeasureContext context) {
/*  83 */     return new Point2D.Float(0.0F, 0.0F);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected Point2D anchorLocation(@NotNull MeasureContext context) {
/*  88 */     return null;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected Overflow defaultOverflow() {
/*  93 */     return Overflow.Hidden;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public FloatSize size(@NotNull RenderContext context) {
/*  98 */     return new FloatSize(this.width
/*  99 */         .resolveWidth(context.measureContext()), this.height
/* 100 */         .resolveHeight(context.measureContext()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/* 105 */     super.build(attributeNode);
/* 106 */     Pattern template = parseTemplate(attributeNode);
/*     */     
/* 108 */     if (this.viewBox == null && template != null) this.viewBox = template.viewBox; 
/* 109 */     this.preserveAspectRatio = (template != null) ? template.preserveAspectRatio : this.preserveAspectRatio;
/*     */     
/* 111 */     this.x = attributeNode.getLength("x", (template != null) ? template.x : Length.ZERO);
/* 112 */     this.y = attributeNode.getLength("y", (template != null) ? template.y : Length.ZERO);
/*     */     
/* 114 */     this
/* 115 */       .width = attributeNode.getLength("width", (template != null) ? template.width : Length.ZERO).coerceNonNegative();
/* 116 */     this
/* 117 */       .height = attributeNode.getLength("height", (template != null) ? template.height : Length.ZERO).coerceNonNegative();
/*     */     
/* 119 */     this.patternTransform = attributeNode.parseTransform("patternTransform");
/* 120 */     if (this.patternTransform == null && template != null) this.patternTransform = template.patternTransform;
/*     */     
/* 122 */     this.patternUnits = (UnitType)attributeNode.getEnum("patternUnits", 
/* 123 */         (template != null) ? (Enum)template.patternUnits : (Enum)UnitType.ObjectBoundingBox);
/* 124 */     this.patternContentUnits = (UnitType)attributeNode.getEnum("patternContentUnits", 
/* 125 */         (template != null) ? (Enum)template.patternContentUnits : (Enum)UnitType.UserSpaceOnUse);
/*     */   }
/*     */   @Nullable
/*     */   private Pattern parseTemplate(@NotNull AttributeNode attributeNode) {
/* 129 */     Pattern template = (Pattern)attributeNode.getElementByHref(Pattern.class, attributeNode.getHref());
/* 130 */     return (template != this) ? template : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isVisible() {
/* 135 */     return (!this.width.isZero() && !this.height.isZero() && super.isVisible());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean requiresInstantiation() {
/* 140 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void fillShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
/* 146 */     Rectangle2D b = (bounds != null) ? bounds : shape.getBounds2D();
/* 147 */     GraphicsUtil.safelySetPaint(g, paintForBounds(g, context, b));
/* 148 */     g.fill(shape);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
/* 154 */     Rectangle2D b = (bounds != null) ? bounds : shape.getBounds2D();
/* 155 */     GraphicsUtil.safelySetPaint(g, paintForBounds(g, context, b));
/* 156 */     g.setPaint(paintForBounds(g, context, b));
/* 157 */     g.draw(shape);
/*     */   }
/*     */   @NotNull
/*     */   private Paint paintForBounds(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Rectangle2D bounds) {
/*     */     FloatSize size;
/* 162 */     MeasureContext measure = context.measureContext();
/* 163 */     Rectangle2D.Double patternBounds = this.patternUnits.computeViewBounds(measure, bounds, this.x, this.y, this.width, this.height);
/*     */ 
/*     */     
/* 166 */     BufferedImage img = ImageUtil.createCompatibleTransparentImage(g, patternBounds.width, patternBounds.height);
/* 167 */     Graphics2D imgGraphics = GraphicsUtil.createGraphics(img);
/* 168 */     imgGraphics.setRenderingHints(g.getRenderingHints());
/* 169 */     imgGraphics.scale(img.getWidth() / patternBounds.width, img.getHeight() / patternBounds.height);
/*     */     
/* 171 */     RenderContext patternContext = RenderContext.createInitial(null, this.patternContentUnits.deriveMeasure(measure));
/*     */     
/* 173 */     patternContext.setRootTransform(imgGraphics.getTransform());
/*     */ 
/*     */     
/* 176 */     ViewBox view = this.viewBox;
/* 177 */     PreserveAspectRatio aspectRation = this.preserveAspectRatio;
/* 178 */     if (view == null && this.patternContentUnits == UnitType.ObjectBoundingBox) {
/* 179 */       size = new FloatSize(img.getWidth(), img.getHeight());
/* 180 */       view = new ViewBox(0.0F, 0.0F, 1.0F, 1.0F);
/* 181 */       aspectRation = PreserveAspectRatio.none();
/*     */     } else {
/* 183 */       size = new FloatSize((float)patternBounds.getWidth(), (float)patternBounds.getHeight());
/*     */     } 
/*     */     
/* 186 */     renderWithSize(size, view, aspectRation, patternContext, imgGraphics);
/* 187 */     imgGraphics.dispose();
/*     */ 
/*     */     
/* 190 */     return (this.patternTransform != null) ? 
/* 191 */       (Paint)new TransformedPaint(new TexturePaint(img, patternBounds), this.patternTransform) : 
/* 192 */       new TexturePaint(img, patternBounds);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\Pattern.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */