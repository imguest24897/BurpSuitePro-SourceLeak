/*     */ package com.github.weisj.jsvg.nodes.mesh;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.mesh.CoonPatch;
/*     */ import com.github.weisj.jsvg.geometry.mesh.CoonValues;
/*     */ import com.github.weisj.jsvg.geometry.mesh.Subdivided;
/*     */ import com.github.weisj.jsvg.geometry.util.GeometryUtil;
/*     */ import com.github.weisj.jsvg.nodes.Stop;
/*     */ import com.github.weisj.jsvg.nodes.container.ContainerNode;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.renderer.GraphicsUtil;
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.AffineTransform;
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
/*     */ @ElementCategories({})
/*     */ @PermittedContent(categories = {Category.Descriptive}, anyOf = {Stop.class})
/*     */ public final class MeshPatch
/*     */   extends ContainerNode
/*     */ {
/*     */   public static final String TAG = "meshpatch";
/*     */   private static final int MAX_DEPTH = 10;
/*     */   Color north;
/*     */   Color east;
/*     */   Color south;
/*     */   Color west;
/*     */   @NotNull
/*  55 */   final CoonPatch coonPatch = CoonPatch.createUninitialized();
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  59 */     return "meshpatch";
/*     */   }
/*     */   
/*     */   public void renderPath(@NotNull Graphics2D g) {
/*  63 */     AffineTransform at = g.getTransform();
/*  64 */     float scaleX = (float)GeometryUtil.scaleYOfTransform(at);
/*  65 */     float scaleY = (float)GeometryUtil.scaleYOfTransform(at);
/*  66 */     int depth = Math.max(
/*  67 */         Math.max(this.coonPatch.north.estimateStepCount(scaleX, scaleY), this.coonPatch.east
/*  68 */           .estimateStepCount(scaleX, scaleY)), 
/*  69 */         Math.max(this.coonPatch.south.estimateStepCount(scaleX, scaleY), this.coonPatch.west
/*  70 */           .estimateStepCount(scaleX, scaleY)));
/*  71 */     renderPath(g, this.coonPatch, scaleX, scaleY, Math.min(10, depth));
/*     */   }
/*     */   
/*     */   private void renderPath(@NotNull Graphics2D g, @NotNull CoonPatch patch, float scaleX, float scaleY, int depth) {
/*  75 */     CoonValues weights = patch.coonValues;
/*     */ 
/*     */     
/*  78 */     if (depth == 0 || GeometryUtil.distanceSquared(weights.north, weights.south, scaleX, scaleY) * 
/*  79 */       GeometryUtil.distanceSquared(weights.east, weights.west, scaleX, scaleY) < 1.0E-6D) {
/*  80 */       float u = (weights.north.x + weights.east.x + weights.south.x + weights.west.x) / 4.0F;
/*  81 */       float v = (weights.north.y + weights.east.y + weights.south.y + weights.west.y) / 4.0F;
/*  82 */       GraphicsUtil.safelySetPaint(g, bilinearInterpolation(u, v));
/*  83 */       Shape s = patch.toShape();
/*  84 */       g.fill(s.getBounds2D());
/*     */     } else {
/*  86 */       Subdivided<CoonPatch> patchSubdivided = patch.subdivide();
/*  87 */       renderPath(g, (CoonPatch)patchSubdivided.northWest, scaleX, scaleY, depth - 1);
/*  88 */       renderPath(g, (CoonPatch)patchSubdivided.northEast, scaleX, scaleY, depth - 1);
/*  89 */       renderPath(g, (CoonPatch)patchSubdivided.southEast, scaleX, scaleY, depth - 1);
/*  90 */       renderPath(g, (CoonPatch)patchSubdivided.southWest, scaleX, scaleY, depth - 1);
/*     */     } 
/*     */   }
/*     */   @NotNull
/*     */   private Color bilinearInterpolation(float dx, float dy) {
/*  95 */     float r = GeometryUtil.lerp(dy, GeometryUtil.lerp(dx, this.north.getRed(), this.east.getRed()), GeometryUtil.lerp(dx, this.west.getRed(), this.south.getRed()));
/*  96 */     float g = GeometryUtil.lerp(dy, GeometryUtil.lerp(dx, this.north.getGreen(), this.east.getGreen()), GeometryUtil.lerp(dx, this.west.getGreen(), this.south.getGreen()));
/*  97 */     float b = GeometryUtil.lerp(dy, GeometryUtil.lerp(dx, this.north.getBlue(), this.east.getBlue()), GeometryUtil.lerp(dx, this.west.getBlue(), this.south.getBlue()));
/*  98 */     float a = GeometryUtil.lerp(dy, GeometryUtil.lerp(dx, this.north.getAlpha(), this.east.getAlpha()), GeometryUtil.lerp(dx, this.west.getAlpha(), this.south.getAlpha()));
/*  99 */     return new Color(clampColor(r), clampColor(g), clampColor(b), clampColor(a));
/*     */   }
/*     */   
/*     */   private int clampColor(float v) {
/* 103 */     return Math.max(Math.min(255, (int)v), 0);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\mesh\MeshPatch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */