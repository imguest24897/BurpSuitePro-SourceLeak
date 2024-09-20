/*     */ package com.github.weisj.jsvg.renderer;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.stroke.LineCap;
/*     */ import com.github.weisj.jsvg.attributes.stroke.LineJoin;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.Unit;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import java.util.Arrays;
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
/*     */ public final class StrokeContext
/*     */ {
/*     */   @Nullable
/*     */   public final Length strokeWidth;
/*     */   @Nullable
/*     */   public final LineCap lineCap;
/*     */   @Nullable
/*     */   public final LineJoin lineJoin;
/*     */   public final float miterLimit;
/*     */   public final Length[] dashPattern;
/*     */   @Nullable
/*     */   public final Length dashOffset;
/*     */   
/*     */   public StrokeContext(@Nullable Length strokeWidth, @Nullable LineCap lineCap, @Nullable LineJoin lineJoin, float miterLimit, @NotNull Length[] dashPattern, @Nullable Length dashOffset) {
/*  46 */     this.strokeWidth = strokeWidth;
/*  47 */     this.lineCap = lineCap;
/*  48 */     this.lineJoin = lineJoin;
/*  49 */     this.miterLimit = miterLimit;
/*  50 */     this.dashPattern = validateDashPattern(dashPattern);
/*  51 */     this.dashOffset = dashOffset;
/*     */   }
/*     */   
/*     */   private static Length[] validateDashPattern(@NotNull Length[] pattern) {
/*  55 */     if (pattern.length == 0) return pattern; 
/*  56 */     for (Length length : pattern) {
/*  57 */       if (length.raw() < 0.0F)
/*     */       {
/*  59 */         return new Length[0];
/*     */       }
/*  61 */       if (!length.isZero()) return pattern;
/*     */     
/*     */     } 
/*  64 */     return new Length[0];
/*     */   }
/*     */   @NotNull
/*     */   public StrokeContext derive(@Nullable StrokeContext context) {
/*  68 */     if (context == null) return this; 
/*  69 */     if (context.isTrivial()) return this; 
/*  70 */     return new StrokeContext(
/*  71 */         (context.strokeWidth != null) ? context.strokeWidth : this.strokeWidth, 
/*  72 */         (context.lineCap != null) ? context.lineCap : this.lineCap, 
/*  73 */         (context.lineJoin != null) ? context.lineJoin : this.lineJoin, 
/*  74 */         Length.isSpecified(context.miterLimit) ? context.miterLimit : this.miterLimit, 
/*  75 */         (context.dashPattern.length > 0) ? context.dashPattern : this.dashPattern, 
/*  76 */         (context.dashOffset != null) ? context.dashOffset : this.dashOffset);
/*     */   }
/*     */   
/*     */   public boolean isTrivial() {
/*  80 */     return (this.strokeWidth == null && this.lineCap == null && this.lineJoin == null && 
/*     */ 
/*     */       
/*  83 */       Length.isUnspecified(this.miterLimit) && this.dashPattern.length == 0 && this.dashOffset == null);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static StrokeContext createDefault() {
/*  89 */     return new StrokeContext(Unit.Raw.valueOf(1.0F), LineCap.Butt, LineJoin.Miter, 4.0F, new Length[0], Length.ZERO);
/*     */   }
/*     */   @NotNull
/*     */   public static StrokeContext parse(@NotNull AttributeNode attributeNode) {
/*  93 */     return new StrokeContext(attributeNode
/*  94 */         .getLength("stroke-width"), (LineCap)attributeNode
/*  95 */         .getEnumNullable("stroke-linecap", LineCap.class), (LineJoin)attributeNode
/*  96 */         .getEnumNullable("stroke-linejoin", LineJoin.class), attributeNode
/*  97 */         .getNonNegativeFloat("stroke-miterlimit", Float.NaN), attributeNode
/*  98 */         .getLengthList("stroke-dasharray"), attributeNode
/*  99 */         .getLength("stroke-dashoffset"));
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 104 */     return "StrokeContext{strokeWidth=" + this.strokeWidth + ", lineCap=" + this.lineCap + ", lineJoin=" + this.lineJoin + ", miterLimit=" + this.miterLimit + ", dashPattern=" + 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 109 */       Arrays.toString((Object[])this.dashPattern) + ", dashOffset=" + this.dashOffset + '}';
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\renderer\StrokeContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */