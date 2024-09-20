/*     */ package com.github.weisj.jsvg.attributes.filter;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.size.FloatInsets;
/*     */ import com.github.weisj.jsvg.geometry.util.GeometryUtil;
/*     */ import com.github.weisj.jsvg.nodes.filter.FilterLayoutContext;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.util.function.BiFunction;
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
/*     */ public final class LayoutBounds
/*     */ {
/*     */   @NotNull
/*     */   private final Data data;
/*     */   @NotNull
/*     */   private final BiFunction<Data, ComputeFlags, Data> transformer;
/*     */   private final ComputeFlags additionalFlags;
/*     */   
/*     */   public static final class Data
/*     */   {
/*     */     @NotNull
/*     */     private final Rectangle2D bounds;
/*     */     @NotNull
/*     */     private final FloatInsets clipBoundsEscapeInsets;
/*     */     
/*     */     private Data(@NotNull Rectangle2D bounds, @NotNull FloatInsets clipBoundsEscapeInsets) {
/*  40 */       this.bounds = bounds;
/*  41 */       this.clipBoundsEscapeInsets = clipBoundsEscapeInsets;
/*     */     }
/*     */     @NotNull
/*     */     public FloatInsets clipBoundsEscapeInsets() {
/*  45 */       return this.clipBoundsEscapeInsets;
/*     */     }
/*     */     @NotNull
/*     */     public Rectangle2D bounds() {
/*  49 */       return this.bounds;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  54 */       return "Data{bounds=" + 
/*  55 */         GeometryUtil.compactRepresentation(this.bounds) + ", clipBoundsEscapeInsets=" + this.clipBoundsEscapeInsets + '}';
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class ComputeFlags
/*     */   {
/*     */     @NotNull
/*  63 */     public static final ComputeFlags INITIAL = new ComputeFlags(false);
/*     */     public final boolean operatesOnWholeFilterRegion;
/*     */     
/*     */     public ComputeFlags(boolean operatesOnWholeFilterRegion) {
/*  67 */       this.operatesOnWholeFilterRegion = operatesOnWholeFilterRegion;
/*     */     }
/*     */     @NotNull
/*     */     public ComputeFlags or(@NotNull ComputeFlags other) {
/*  71 */       return new ComputeFlags((this.operatesOnWholeFilterRegion || other.operatesOnWholeFilterRegion));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LayoutBounds(@NotNull Rectangle2D bounds, @NotNull FloatInsets clipBoundsEscapeInsets) {
/*  80 */     this.data = new Data(bounds, clipBoundsEscapeInsets);
/*  81 */     this.transformer = ((d, f) -> d);
/*  82 */     this.additionalFlags = new ComputeFlags(false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private LayoutBounds(@NotNull Data data, @NotNull BiFunction<Data, ComputeFlags, Data> transformer, @NotNull ComputeFlags flags) {
/*  88 */     this.data = data;
/*  89 */     this.transformer = transformer;
/*  90 */     this.additionalFlags = flags;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public LayoutBounds transform(@NotNull BiFunction<Data, ComputeFlags, Data> transformer) {
/*  95 */     return new LayoutBounds(this.data, (data, flags) -> { Data newData = transformer.apply(data, flags); return transformer.apply(newData, flags); }this.additionalFlags);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public LayoutBounds withFlags(@NotNull ComputeFlags flags) {
/* 102 */     return new LayoutBounds(this.data, this.transformer, this.additionalFlags.or(flags));
/*     */   }
/*     */   @NotNull
/*     */   public Data resolve(@NotNull ComputeFlags flags) {
/* 106 */     return this.transformer.apply(this.data, flags.or(this.additionalFlags));
/*     */   }
/*     */   @NotNull
/*     */   public LayoutBounds union(@NotNull LayoutBounds other) {
/* 110 */     return transform((data, flags) -> {
/*     */           Data otherData = other.resolve(flags);
/*     */           return new Data(data.bounds.createUnion(otherData.bounds), GeometryUtil.max(data.clipBoundsEscapeInsets, otherData.clipBoundsEscapeInsets));
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public LayoutBounds grow(float horizontal, float vertical, @NotNull FilterLayoutContext context) {
/* 119 */     return transform((data, flags) -> {
/*     */           FloatInsets insets = data.clipBoundsEscapeInsets;
/*     */           Rectangle2D clipBounds = context.clipBounds();
/*     */           FloatInsets growInsets = new FloatInsets(vertical, horizontal, vertical, horizontal);
/*     */           Rectangle2D newBounds = GeometryUtil.grow(data.bounds, growInsets);
/*     */           FloatInsets ins = GeometryUtil.min(GeometryUtil.overhangInsets(clipBounds, newBounds), growInsets);
/*     */           return new Data(newBounds, GeometryUtil.max(insets, ins));
/*     */         });
/*     */   }
/*     */   @NotNull
/*     */   public LayoutBounds translate(float dx, float dy, @NotNull FilterLayoutContext context) {
/* 130 */     return transform((data, flags) -> {
/*     */           FloatInsets insets = data.clipBoundsEscapeInsets;
/*     */           Rectangle2D clipBounds = context.clipBounds();
/*     */           FloatInsets offsetInsets = new FloatInsets(Math.max(-dy, 0.0F), Math.max(-dx, 0.0F), Math.max(dy, 0.0F), Math.max(dx, 0.0F));
/*     */           Rectangle2D newBounds = GeometryUtil.grow(data.bounds, offsetInsets);
/*     */           FloatInsets ins = GeometryUtil.min(GeometryUtil.overhangInsets(clipBounds, data.bounds), offsetInsets);
/*     */           return new Data(newBounds, GeometryUtil.max(insets, ins));
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 147 */     return "LayoutBounds{data=" + this.data + ", transformer=" + this.transformer + '}';
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\filter\LayoutBounds.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */