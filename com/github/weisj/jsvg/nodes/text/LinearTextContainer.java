/*     */ package com.github.weisj.jsvg.nodes.text;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.Path2D;
/*     */ import org.jetbrains.annotations.MustBeInvokedByOverriders;
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
/*     */ abstract class LinearTextContainer
/*     */   extends TextContainer
/*     */ {
/*     */   protected Length[] x;
/*     */   protected Length[] y;
/*     */   protected Length[] dx;
/*     */   protected Length[] dy;
/*     */   protected float[] rotate;
/*     */   
/*     */   @MustBeInvokedByOverriders
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  45 */     super.build(attributeNode);
/*  46 */     this.x = attributeNode.getLengthList("x");
/*  47 */     this.y = attributeNode.getLengthList("y");
/*  48 */     this.dx = attributeNode.getLengthList("dx");
/*  49 */     this.dy = attributeNode.getLengthList("dy");
/*  50 */     this.rotate = attributeNode.getFloatList("rotate");
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Shape untransformedElementShape(@NotNull RenderContext context) {
/*  56 */     Path2D textPath = new Path2D.Float();
/*  57 */     appendTextShape(createCursor(), textPath, context);
/*  58 */     return textPath;
/*     */   }
/*     */ 
/*     */   
/*     */   public void render(@NotNull RenderContext context, @NotNull Graphics2D g) {
/*  63 */     renderSegment(createCursor(), context, g);
/*     */   }
/*     */   @NotNull
/*     */   private GlyphCursor createCursor() {
/*  67 */     return new GlyphCursor(0.0F, 0.0F, new AffineTransform());
/*     */   }
/*     */ 
/*     */   
/*     */   protected GlyphCursor createLocalCursor(@NotNull RenderContext context, @NotNull GlyphCursor current) {
/*  72 */     GlyphCursor local = current.derive();
/*  73 */     if (this.x.length != 0) {
/*  74 */       local.xLocations = this.x;
/*  75 */       local.xOff = 0;
/*     */     } 
/*  77 */     if (this.y.length != 0) {
/*  78 */       local.yLocations = this.y;
/*  79 */       local.yOff = 0;
/*     */     } 
/*  81 */     if (this.dx.length != 0) {
/*  82 */       local.xDeltas = this.dx;
/*  83 */       local.dyOff = 0;
/*     */     } 
/*  85 */     if (this.dy.length != 0) {
/*  86 */       local.yDeltas = this.dy;
/*  87 */       local.dyOff = 0;
/*     */     } 
/*  89 */     if (this.rotate.length != 0) {
/*  90 */       local.rotations = this.rotate;
/*  91 */       local.rotOff = 0;
/*     */     } 
/*  93 */     return local;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void cleanUpLocalCursor(@NotNull GlyphCursor current, @NotNull GlyphCursor local) {
/*  98 */     current.updateFrom(local);
/*  99 */     if (this.x.length == 0) current.xOff = local.xOff; 
/* 100 */     if (this.y.length == 0) current.yOff = local.yOff; 
/* 101 */     if (this.dx.length == 0) current.dxOff = local.dxOff; 
/* 102 */     if (this.dy.length == 0) current.dyOff = local.dyOff; 
/* 103 */     if (this.rotate.length == 0) current.rotOff = local.rotOff; 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\text\LinearTextContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */