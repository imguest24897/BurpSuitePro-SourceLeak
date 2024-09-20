/*     */ package com.github.weisj.jsvg.nodes.filter;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.UnitType;
/*     */ import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
/*     */ import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
/*     */ import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
/*     */ import com.github.weisj.jsvg.geometry.size.FloatInsets;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.Unit;
/*     */ import com.github.weisj.jsvg.geometry.util.GeometryUtil;
/*     */ import com.github.weisj.jsvg.nodes.SVGNode;
/*     */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*     */ import com.github.weisj.jsvg.nodes.animation.Set;
/*     */ import com.github.weisj.jsvg.nodes.container.ContainerNode;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import com.github.weisj.jsvg.util.BlittableImage;
/*     */ import com.github.weisj.jsvg.util.ImageUtil;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.ColorModel;
/*     */ import java.awt.image.ImageProducer;
/*     */ import java.awt.image.RGBImageFilter;
/*     */ import java.util.Objects;
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
/*     */ @ElementCategories({})
/*     */ @PermittedContent(categories = {Category.Descriptive, Category.FilterPrimitive}, anyOf = {Animate.class, Set.class})
/*     */ public final class Filter
/*     */   extends ContainerNode
/*     */ {
/*     */   private static final boolean DEBUG = false;
/*     */   public static final String TAG = "filter";
/*  61 */   private static final Length DEFAULT_FILTER_COORDINATE = Unit.PERCENTAGE.valueOf(-10.0F);
/*  62 */   private static final Length DEFAULT_FILTER_SIZE = Unit.PERCENTAGE.valueOf(120.0F);
/*     */   
/*     */   private Length x;
/*     */   
/*     */   private Length y;
/*     */   
/*     */   private Length width;
/*     */   private Length height;
/*     */   private UnitType filterUnits;
/*     */   private UnitType filterPrimitiveUnits;
/*     */   private boolean isValid;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  76 */     return "filter";
/*     */   }
/*     */   
/*     */   public boolean hasEffect() {
/*  80 */     return (this.isValid && !children().isEmpty());
/*     */   }
/*     */ 
/*     */   
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  85 */     super.build(attributeNode);
/*     */     
/*  87 */     this.isValid = true;
/*  88 */     for (SVGNode child : children()) {
/*  89 */       FilterPrimitive filterPrimitive = (FilterPrimitive)child;
/*  90 */       if (!filterPrimitive.isValid()) {
/*  91 */         this.isValid = false;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*  96 */     this.filterUnits = (UnitType)attributeNode.getEnum("filterUnits", (Enum)UnitType.ObjectBoundingBox);
/*  97 */     this.filterPrimitiveUnits = (UnitType)attributeNode.getEnum("primitiveUnits", (Enum)UnitType.UserSpaceOnUse);
/*     */     
/*  99 */     this.x = attributeNode.getLength("x", DEFAULT_FILTER_COORDINATE);
/* 100 */     this.y = attributeNode.getLength("y", DEFAULT_FILTER_COORDINATE);
/* 101 */     this.width = attributeNode.getLength("width", DEFAULT_FILTER_SIZE);
/* 102 */     this.height = attributeNode.getLength("height", DEFAULT_FILTER_SIZE);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 107 */     if (this.filterUnits == UnitType.ObjectBoundingBox) {
/* 108 */       this.x = coerceToPercentage(this.x);
/* 109 */       this.y = coerceToPercentage(this.y);
/* 110 */       this.width = coerceToPercentage(this.width);
/* 111 */       this.height = coerceToPercentage(this.height);
/*     */     } 
/*     */   }
/*     */   @NotNull
/*     */   private Length coerceToPercentage(@NotNull Length length) {
/* 116 */     if (length.unit() == Unit.PERCENTAGE) return length; 
/* 117 */     return new Length(Unit.PERCENTAGE, length.raw() * 100.0F);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public FilterInfo createFilterInfo(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Rectangle2D elementBounds) {
/* 122 */     Rectangle2D.Double filterRegion = this.filterUnits.computeViewBounds(context
/* 123 */         .measureContext(), elementBounds, this.x, this.y, this.width, this.height);
/* 124 */     Rectangle2D graphicsClipBounds = g.getClipBounds();
/*     */     
/* 126 */     FilterLayoutContext filterLayoutContext = new FilterLayoutContext(this.filterPrimitiveUnits, elementBounds, graphicsClipBounds);
/*     */ 
/*     */     
/* 129 */     Rectangle2D clippedElementBounds = elementBounds.createIntersection(graphicsClipBounds);
/*     */     
/* 131 */     Rectangle2D effectiveFilterRegion = filterRegion.createIntersection(graphicsClipBounds);
/* 132 */     LayoutBounds elementLayoutBounds = new LayoutBounds(effectiveFilterRegion, new FloatInsets());
/* 133 */     LayoutBounds clippedElementLayoutBounds = new LayoutBounds(clippedElementBounds, new FloatInsets());
/* 134 */     LayoutBounds sourceDependentBounds = elementLayoutBounds.transform((data, flags) -> flags.operatesOnWholeFilterRegion ? data : clippedElementLayoutBounds.resolve(flags));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 139 */     filterLayoutContext.resultChannels().addResult((FilterChannelKey)DefaultFilterChannel.LastResult, elementLayoutBounds);
/* 140 */     filterLayoutContext.resultChannels().addResult((FilterChannelKey)DefaultFilterChannel.SourceGraphic, sourceDependentBounds);
/* 141 */     filterLayoutContext.resultChannels().addResult((FilterChannelKey)DefaultFilterChannel.SourceAlpha, sourceDependentBounds);
/*     */     
/* 143 */     for (SVGNode child : children()) {
/*     */       try {
/* 145 */         FilterPrimitive filterPrimitive = (FilterPrimitive)child;
/* 146 */         filterPrimitive.layoutFilter(context, filterLayoutContext);
/* 147 */       } catch (IllegalFilterStateException illegalFilterStateException) {}
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 154 */     LayoutBounds.Data clipHeuristic = ((LayoutBounds)filterLayoutContext.resultChannels().get((FilterChannelKey)DefaultFilterChannel.LastResult)).resolve(LayoutBounds.ComputeFlags.INITIAL);
/*     */     
/* 156 */     FloatInsets insets = clipHeuristic.clipBoundsEscapeInsets();
/* 157 */     Rectangle2D clipHeuristicBounds = clipHeuristic.bounds().createIntersection(
/* 158 */         GeometryUtil.grow(graphicsClipBounds, insets));
/*     */     
/* 160 */     BlittableImage blitImage = BlittableImage.create(ImageUtil::createCompatibleTransparentImage, context, clipHeuristicBounds, filterRegion, elementBounds, UnitType.UserSpaceOnUse);
/*     */ 
/*     */ 
/*     */     
/* 164 */     return new FilterInfo(g, blitImage, elementBounds);
/*     */   }
/*     */   
/*     */   public void applyFilter(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull FilterInfo filterInfo) {
/* 168 */     ImageProducer producer = filterInfo.blittableImage.image().getSource();
/*     */     
/* 170 */     FilterContext filterContext = new FilterContext(filterInfo, this.filterPrimitiveUnits, g.getRenderingHints());
/*     */     
/* 172 */     Channel sourceChannel = new ImageProducerChannel(producer);
/* 173 */     filterContext.resultChannels().addResult((FilterChannelKey)DefaultFilterChannel.SourceGraphic, sourceChannel);
/* 174 */     filterContext.resultChannels().addResult((FilterChannelKey)DefaultFilterChannel.LastResult, sourceChannel);
/* 175 */     filterContext.resultChannels().addResult((FilterChannelKey)DefaultFilterChannel.SourceAlpha, () -> sourceChannel.applyFilter(new AlphaImageFilter()));
/*     */ 
/*     */     
/* 178 */     for (SVGNode child : children()) {
/*     */       try {
/* 180 */         FilterPrimitive filterPrimitive = (FilterPrimitive)child;
/* 181 */         filterPrimitive.applyFilter(context, filterContext);
/* 182 */       } catch (IllegalFilterStateException illegalFilterStateException) {}
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 188 */     filterInfo.producer = ((Channel)Objects.<Channel>requireNonNull(filterContext
/* 189 */         .getChannel((FilterChannelKey)DefaultFilterChannel.LastResult))).producer();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean acceptChild(@Nullable String id, @NotNull SVGNode node) {
/* 194 */     return (node instanceof FilterPrimitive && super.acceptChild(id, node));
/*     */   }
/*     */   
/*     */   public static final class FilterInfo {
/*     */     public final int imageWidth;
/*     */     public final int imageHeight;
/*     */     @NotNull
/*     */     private final Rectangle2D elementBounds;
/*     */     @NotNull
/*     */     private final Graphics2D imageGraphics;
/*     */     @NotNull
/*     */     private final BlittableImage blittableImage;
/*     */     private ImageProducer producer;
/*     */     
/*     */     private FilterInfo(@NotNull Graphics2D g, @NotNull BlittableImage blittableImage, @NotNull Rectangle2D elementBounds) {
/* 209 */       this.blittableImage = blittableImage;
/* 210 */       this.elementBounds = elementBounds;
/*     */       
/* 212 */       BufferedImage image = blittableImage.image();
/*     */       
/* 214 */       this.imageWidth = image.getWidth();
/* 215 */       this.imageHeight = image.getHeight();
/*     */       
/* 217 */       this.imageGraphics = blittableImage.createGraphics();
/* 218 */       this.imageGraphics.setRenderingHints(g.getRenderingHints());
/*     */     }
/*     */     @NotNull
/*     */     public Rectangle2D imageBounds() {
/* 222 */       return this.blittableImage.boundsInUserSpace();
/*     */     }
/*     */     @NotNull
/*     */     public Rectangle2D elementBounds() {
/* 226 */       return this.elementBounds;
/*     */     }
/*     */     @NotNull
/*     */     public Graphics2D graphics() {
/* 230 */       return this.imageGraphics;
/*     */     }
/*     */     @NotNull
/*     */     public Rectangle2D tile() {
/* 234 */       Rectangle2D imageBounds = imageBounds();
/* 235 */       return new Rectangle2D.Double(imageBounds
/* 236 */           .getX() - this.elementBounds.getX(), imageBounds
/* 237 */           .getY() - this.elementBounds.getY(), imageBounds
/* 238 */           .getWidth(), imageBounds
/* 239 */           .getHeight());
/*     */     }
/*     */     
/*     */     public void blitImage(@NotNull Graphics2D g, @NotNull RenderContext context) {
/* 243 */       Rectangle2D imageBounds = imageBounds();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 250 */       this.blittableImage.prepareForBlitting(g, context);
/* 251 */       g.drawImage(context.createImage(this.producer), 0, 0, context.targetComponent());
/*     */     }
/*     */     
/*     */     public void close() {
/* 255 */       this.imageGraphics.dispose();
/*     */     } }
/*     */   
/*     */   private static final class AlphaImageFilter extends RGBImageFilter {
/*     */     private AlphaImageFilter() {
/* 260 */       this.model = ColorModel.getRGBdefault();
/*     */     }
/*     */     private final ColorModel model;
/*     */     public int filterRGB(int x, int y, int rgb) {
/* 264 */       return this.model.getAlpha(rgb) << 24;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\Filter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */