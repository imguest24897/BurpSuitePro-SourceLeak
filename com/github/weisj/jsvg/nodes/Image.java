/*     */ package com.github.weisj.jsvg.nodes;
/*     */ 
/*     */ import com.github.weisj.jsvg.SVGRenderingHints;
/*     */ import com.github.weisj.jsvg.attributes.Overflow;
/*     */ import com.github.weisj.jsvg.attributes.PreserveAspectRatio;
/*     */ import com.github.weisj.jsvg.attributes.ViewBox;
/*     */ import com.github.weisj.jsvg.geometry.size.FloatSize;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.parser.UIFuture;
/*     */ import com.github.weisj.jsvg.parser.ValueUIFuture;
/*     */ import com.github.weisj.jsvg.renderer.GraphicsUtil;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.Shape;
/*     */ import java.awt.TexturePaint;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import java.net.URI;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
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
/*     */ @ElementCategories({Category.Graphic, Category.GraphicsReferencing})
/*     */ @PermittedContent(categories = {Category.Animation, Category.Descriptive})
/*     */ public final class Image
/*     */   extends RenderableSVGNode
/*     */ {
/*  57 */   private static final Logger LOGGER = Logger.getLogger(Image.class.getName());
/*     */   
/*     */   public static final String TAG = "image";
/*     */   
/*     */   private Length x;
/*     */   
/*     */   private Length y;
/*     */   private Length width;
/*     */   private Length height;
/*     */   private PreserveAspectRatio preserveAspectRatio;
/*     */   private Overflow overflow;
/*     */   private UIFuture<BufferedImage> imgResource;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  72 */     return "image";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isVisible(@NotNull RenderContext context) {
/*  77 */     return (this.imgResource != null && super.isVisible(context));
/*     */   }
/*     */ 
/*     */   
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  82 */     super.build(attributeNode);
/*  83 */     this.x = attributeNode.getLength("x", 0.0F);
/*  84 */     this.y = attributeNode.getLength("y", 0.0F);
/*  85 */     this.width = attributeNode.getLength("width", Length.UNSPECIFIED);
/*  86 */     this.height = attributeNode.getLength("height", Length.UNSPECIFIED);
/*  87 */     this.preserveAspectRatio = PreserveAspectRatio.parse(attributeNode
/*  88 */         .getValue("preserveAspectRatio"), attributeNode.parser());
/*  89 */     this.overflow = (Overflow)attributeNode.getEnum("overflow", (Enum)Overflow.Hidden);
/*     */     
/*  91 */     String url = attributeNode.parser().parseUrl(attributeNode.getHref());
/*  92 */     if (url != null)
/*     */       try {
/*  94 */         this.imgResource = attributeNode.resourceLoader().loadImage(new URI(url));
/*  95 */       } catch (IOException|java.net.URISyntaxException e) {
/*  96 */         LOGGER.log(Level.INFO, e.getMessage(), e);
/*  97 */         this.imgResource = null;
/*     */       }  
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private BufferedImage fetchImage(@NotNull RenderContext context) {
/* 103 */     if (this.imgResource == null) return null; 
/* 104 */     if (this.imgResource instanceof ValueUIFuture) return (BufferedImage)this.imgResource.get(); 
/* 105 */     if (!this.imgResource.checkIfReady(context.targetComponent())) return null; 
/* 106 */     BufferedImage img = (BufferedImage)this.imgResource.get();
/* 107 */     if (img != null) this.imgResource = (UIFuture<BufferedImage>)new ValueUIFuture(img); 
/* 108 */     return img;
/*     */   }
/*     */ 
/*     */   
/*     */   public void render(@NotNull RenderContext context, @NotNull Graphics2D g) {
/* 113 */     BufferedImage img = fetchImage(context);
/* 114 */     if (img == null)
/*     */       return; 
/* 116 */     MeasureContext measure = context.measureContext();
/* 117 */     int imgWidth = img.getWidth(context.targetComponent());
/* 118 */     int imgHeight = img.getHeight(context.targetComponent());
/* 119 */     if (imgWidth == 0 || imgHeight == 0)
/*     */       return; 
/* 121 */     float viewWidth = this.width.orElseIfUnspecified(imgWidth).resolveWidth(measure);
/* 122 */     float viewHeight = this.height.orElseIfUnspecified(imgHeight).resolveHeight(measure);
/* 123 */     ViewBox viewBox = new ViewBox(imgWidth, imgHeight);
/*     */     
/* 125 */     g.translate(this.x.resolveWidth(measure), this.y.resolveHeight(measure));
/*     */     
/* 127 */     if (this.overflow.establishesClip()) g.clip((Shape)new ViewBox(viewWidth, viewHeight));
/*     */ 
/*     */ 
/*     */     
/* 131 */     AffineTransform imgTransform = this.preserveAspectRatio.computeViewPortTransform(new FloatSize(viewWidth, viewHeight), viewBox);
/*     */     
/* 133 */     Object imageAntialiasing = g.getRenderingHint(SVGRenderingHints.KEY_IMAGE_ANTIALIASING);
/* 134 */     if (imageAntialiasing == SVGRenderingHints.VALUE_IMAGE_ANTIALIASING_OFF) {
/* 135 */       g.drawImage(img, imgTransform, context.targetComponent());
/*     */     } else {
/* 137 */       g.transform(imgTransform);
/* 138 */       Rectangle imgRect = new Rectangle(0, 0, imgWidth, imgHeight);
/*     */       
/* 140 */       GraphicsUtil.safelySetPaint(g, new TexturePaint(img, imgRect));
/* 141 */       g.fill(imgRect);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\Image.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */