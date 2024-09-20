/*     */ package com.github.weisj.jsvg.util;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.UnitType;
/*     */ import com.github.weisj.jsvg.geometry.util.GeometryUtil;
/*     */ import com.github.weisj.jsvg.nodes.SVGNode;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Instantiator;
/*     */ import com.github.weisj.jsvg.renderer.GraphicsUtil;
/*     */ import com.github.weisj.jsvg.renderer.NodeRenderer;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.NoninvertibleTransformException;
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
/*     */ public final class BlittableImage
/*     */ {
/*     */   @NotNull
/*     */   private final BufferedImage image;
/*     */   @NotNull
/*     */   private final RenderContext context;
/*     */   @NotNull
/*     */   private final Rectangle2D boundsInUserSpace;
/*     */   @NotNull
/*     */   private final UnitType contentUnits;
/*     */   
/*     */   private BlittableImage(@NotNull BufferedImage image, @NotNull RenderContext context, @NotNull Rectangle2D boundsInUserSpace, @NotNull UnitType contentUnits) {
/*  56 */     this.image = image;
/*  57 */     this.context = context;
/*  58 */     this.boundsInUserSpace = boundsInUserSpace;
/*  59 */     this.contentUnits = contentUnits;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static BlittableImage create(@NotNull BufferSurfaceSupplier bufferSurfaceSupplier, @NotNull RenderContext context, @Nullable Rectangle2D clipBounds, @NotNull Rectangle2D bounds, @NotNull Rectangle2D objectBounds, @NotNull UnitType contentUnits) {
/*  66 */     Rectangle2D boundsInUserSpace = GeometryUtil.containingBoundsAfterTransform(context.userSpaceTransform(), bounds);
/*     */     
/*  68 */     Rectangle2D boundsInRootSpace = GeometryUtil.containingBoundsAfterTransform(context.rootTransform(), boundsInUserSpace);
/*     */     
/*  70 */     if (clipBounds != null) {
/*     */       
/*  72 */       Rectangle2D clipBoundsInUserSpace = GeometryUtil.containingBoundsAfterTransform(context.userSpaceTransform(), clipBounds);
/*     */       
/*  74 */       Rectangle2D clipBoundsInRootSpace = GeometryUtil.containingBoundsAfterTransform(context.rootTransform(), clipBoundsInUserSpace);
/*  75 */       Rectangle2D.intersect(clipBoundsInRootSpace, boundsInRootSpace, boundsInRootSpace);
/*     */     } 
/*     */     
/*  78 */     int imgX = (int)Math.floor(boundsInRootSpace.getX());
/*  79 */     int imgY = (int)Math.floor(boundsInRootSpace.getY());
/*  80 */     int imgWidth = (int)Math.ceil(boundsInRootSpace.getX() + boundsInRootSpace.getWidth()) - imgX;
/*  81 */     int imgHeight = (int)Math.ceil(boundsInRootSpace.getY() + boundsInRootSpace.getHeight()) - imgY;
/*     */     
/*  83 */     Rectangle2D adjustedUserSpaceBounds = new Rectangle2D.Double(imgX, imgY, imgWidth, imgHeight);
/*     */     
/*     */     try {
/*  86 */       adjustedUserSpaceBounds = GeometryUtil.containingBoundsAfterTransform(context.rootTransform().createInverse(), adjustedUserSpaceBounds);
/*  87 */     } catch (NoninvertibleTransformException e) {
/*  88 */       throw new RuntimeException(e);
/*     */     } 
/*     */     
/*  91 */     BufferedImage img = bufferSurfaceSupplier.createBufferSurface(null, imgWidth, imgHeight);
/*     */     
/*  93 */     RenderContext imageContext = RenderContext.createInitial(context.targetComponent(), contentUnits
/*  94 */         .deriveMeasure(context.measureContext()));
/*     */     
/*  96 */     AffineTransform rootTransform = new AffineTransform();
/*     */     
/*  98 */     Rectangle2D ub = adjustedUserSpaceBounds;
/*     */     
/* 100 */     rootTransform.translate(boundsInRootSpace.getX() - imgX, boundsInRootSpace.getY() - imgY);
/*     */     
/* 102 */     if (contentUnits == UnitType.ObjectBoundingBox) {
/* 103 */       rootTransform.scale(objectBounds
/* 104 */           .getWidth() * img.getWidth() / ub.getWidth(), objectBounds
/* 105 */           .getWidth() * img.getHeight() / ub.getHeight());
/*     */     } else {
/* 107 */       rootTransform.scale(img
/* 108 */           .getWidth() / ub.getWidth(), img
/* 109 */           .getHeight() / ub.getHeight());
/* 110 */       rootTransform.translate(-ub.getX(), -ub.getY());
/*     */     } 
/*     */     
/* 113 */     imageContext.setRootTransform(rootTransform, context.userSpaceTransform());
/*     */     
/* 115 */     return new BlittableImage(img, imageContext, ub, contentUnits);
/*     */   }
/*     */   @NotNull
/*     */   public Rectangle2D boundsInUserSpace() {
/* 119 */     return this.boundsInUserSpace;
/*     */   }
/*     */   @NotNull
/*     */   public BufferedImage image() {
/* 123 */     return this.image;
/*     */   }
/*     */   @NotNull
/*     */   public Graphics2D createGraphics() {
/* 127 */     Graphics2D g = GraphicsUtil.createGraphics(this.image);
/* 128 */     g.transform(this.context.rootTransform());
/*     */     
/* 130 */     if (this.contentUnits == UnitType.UserSpaceOnUse) {
/* 131 */       g.transform(this.context.userSpaceTransform());
/*     */     } else {
/*     */       
/* 134 */       this.context.setRootTransform(this.context.rootTransform(), new AffineTransform());
/*     */     } 
/*     */     
/* 137 */     return g;
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderNode(@NotNull Graphics2D parentGraphics, @NotNull SVGNode node, @NotNull Instantiator instantiator) {
/* 142 */     Graphics2D imgGraphics = createGraphics();
/* 143 */     imgGraphics.setRenderingHints(parentGraphics.getRenderingHints());
/* 144 */     NodeRenderer.Info info = NodeRenderer.createRenderInfo(node, this.context, imgGraphics, instantiator); 
/* 145 */     try { if (info != null) info.renderable.render(info.context, info.graphics()); 
/* 146 */       if (info != null) info.close();  } catch (Throwable throwable) { if (info != null)
/* 147 */         try { info.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }  imgGraphics.dispose();
/*     */   }
/*     */   
/*     */   public void prepareForBlitting(@NotNull Graphics2D g, @NotNull RenderContext parentContext) {
/* 151 */     g.setTransform(parentContext.rootTransform());
/* 152 */     g.translate(this.boundsInUserSpace.getX(), this.boundsInUserSpace.getY());
/* 153 */     g.scale(this.boundsInUserSpace
/* 154 */         .getWidth() / this.image.getWidth(), this.boundsInUserSpace
/* 155 */         .getHeight() / this.image.getHeight());
/*     */   }
/*     */   
/*     */   public void blitTo(@NotNull Graphics2D g, @NotNull RenderContext parentContext) {
/* 159 */     Graphics2D gg = (Graphics2D)g.create();
/* 160 */     prepareForBlitting(g, parentContext);
/* 161 */     gg.drawImage(this.image, 0, 0, this.image.getWidth(), this.image.getHeight(), null, null);
/* 162 */     gg.dispose();
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface BufferSurfaceSupplier {
/*     */     @NotNull
/*     */     BufferedImage createBufferSurface(@Nullable AffineTransform param1AffineTransform, double param1Double1, double param1Double2);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsv\\util\BlittableImage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */