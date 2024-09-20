/*    */ package com.github.weisj.jsvg.nodes.prototype.impl;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*    */ import com.github.weisj.jsvg.nodes.ClipPath;
/*    */ import com.github.weisj.jsvg.nodes.Mask;
/*    */ import com.github.weisj.jsvg.nodes.filter.Filter;
/*    */ import com.github.weisj.jsvg.nodes.prototype.HasGeometryContext;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import java.awt.geom.AffineTransform;
/*    */ import java.awt.geom.Point2D;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class HasGeometryContextImpl
/*    */   implements HasGeometryContext
/*    */ {
/*    */   @Nullable
/*    */   private final AffineTransform transform;
/*    */   @NotNull
/*    */   private final Length transformOriginX;
/*    */   @NotNull
/*    */   private final Length transformOriginY;
/*    */   @Nullable
/*    */   private final ClipPath clipPath;
/*    */   @Nullable
/*    */   private final Mask mask;
/*    */   @Nullable
/*    */   private final Filter filter;
/*    */   
/*    */   private HasGeometryContextImpl(@Nullable AffineTransform transform, @NotNull Length transformOriginX, @NotNull Length transformOriginY, @Nullable ClipPath clipPath, @Nullable Mask mask, @Nullable Filter filter) {
/* 52 */     this.transform = transform;
/* 53 */     this.transformOriginX = transformOriginX;
/* 54 */     this.transformOriginY = transformOriginY;
/* 55 */     this.clipPath = clipPath;
/* 56 */     this.mask = mask;
/* 57 */     this.filter = filter;
/*    */   }
/*    */   @NotNull
/*    */   public static HasGeometryContext parse(@NotNull AttributeNode attributeNode) {
/* 61 */     Length[] transformOrigin = attributeNode.getLengthList("transform-origin");
/* 62 */     return new HasGeometryContextImpl(attributeNode
/* 63 */         .parseTransform("transform"), 
/* 64 */         (transformOrigin.length > 0) ? transformOrigin[0] : Length.ZERO, 
/* 65 */         (transformOrigin.length > 1) ? transformOrigin[1] : Length.ZERO, attributeNode
/* 66 */         .getClipPath(), attributeNode
/* 67 */         .getMask(), attributeNode
/* 68 */         .getFilter());
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public ClipPath clipPath() {
/* 73 */     return this.clipPath;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Mask mask() {
/* 78 */     return this.mask;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Filter filter() {
/* 83 */     return this.filter;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public AffineTransform transform() {
/* 88 */     return this.transform;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Point2D transformOrigin(@NotNull MeasureContext context) {
/* 93 */     return new Point2D.Float(this.transformOriginX
/* 94 */         .resolveWidth(context), this.transformOriginY
/* 95 */         .resolveHeight(context));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\impl\HasGeometryContextImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */