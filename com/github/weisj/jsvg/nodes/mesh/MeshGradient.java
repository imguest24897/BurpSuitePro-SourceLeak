/*     */ package com.github.weisj.jsvg.nodes.mesh;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.UnitType;
/*     */ import com.github.weisj.jsvg.attributes.paint.SVGPaint;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.nodes.SVGNode;
/*     */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*     */ import com.github.weisj.jsvg.nodes.animation.AnimateTransform;
/*     */ import com.github.weisj.jsvg.nodes.animation.Set;
/*     */ import com.github.weisj.jsvg.nodes.container.ContainerNode;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.Point2D;
/*     */ import java.awt.geom.Rectangle2D;
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
/*     */ @ElementCategories({Category.Gradient})
/*     */ @PermittedContent(categories = {Category.Descriptive}, anyOf = {MeshRow.class, Animate.class, AnimateTransform.class, Set.class})
/*     */ public final class MeshGradient
/*     */   extends ContainerNode
/*     */   implements SVGPaint
/*     */ {
/*     */   public static final String TAG = "meshgradient";
/*     */   private Length x;
/*     */   private Length y;
/*     */   private UnitType gradientUnits;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  63 */     return "meshgradient";
/*     */   }
/*     */ 
/*     */   
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  68 */     super.build(attributeNode);
/*  69 */     this.x = attributeNode.getLength("x", 0.0F);
/*  70 */     this.y = attributeNode.getLength("y", 0.0F);
/*  71 */     this.gradientUnits = (UnitType)attributeNode.getEnum("gradientUnits", (Enum)UnitType.ObjectBoundingBox);
/*  72 */     MeshBuilder.buildMesh(this, new Point2D.Float(this.x.raw(), this.y.raw()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderMesh(@NotNull MeasureContext measure, @NotNull Graphics2D g) {
/*  79 */     Graphics2D meshGraphics = (Graphics2D)g.create();
/*     */ 
/*     */     
/*  82 */     meshGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
/*  83 */     for (SVGNode child : children()) {
/*  84 */       MeshRow row = (MeshRow)child;
/*  85 */       for (SVGNode node : row.children()) {
/*  86 */         MeshPatch patch = (MeshPatch)node;
/*  87 */         patch.renderPath(meshGraphics);
/*     */       } 
/*     */     } 
/*  90 */     meshGraphics.dispose();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void fillShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
/*  96 */     Shape clip = g.getClip();
/*  97 */     Rectangle2D b = (bounds != null) ? bounds : shape.getBounds2D();
/*  98 */     g.setClip(shape);
/*  99 */     g.translate(b.getX(), b.getY());
/* 100 */     renderMesh(context.measureContext(), g);
/* 101 */     g.setClip(clip);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
/* 107 */     Shape clip = g.getClip();
/* 108 */     Rectangle2D b = (bounds != null) ? bounds : shape.getBounds2D();
/* 109 */     g.setClip(g.getStroke().createStrokedShape(shape));
/* 110 */     g.translate(b.getX(), b.getY());
/* 111 */     renderMesh(context.measureContext(), g);
/* 112 */     g.setClip(clip);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\mesh\MeshGradient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */