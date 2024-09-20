/*     */ package com.github.weisj.jsvg.geometry.size;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.ViewBox;
/*     */ import com.github.weisj.jsvg.attributes.font.SVGFont;
/*     */ import com.google.errorprone.annotations.Immutable;
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
/*     */ @Immutable
/*     */ public final class MeasureContext
/*     */ {
/*     */   private final float vw;
/*     */   private final float vh;
/*     */   private final float em;
/*     */   private final float ex;
/*     */   
/*     */   public MeasureContext(float vw, float vh, float em, float ex) {
/*  41 */     this.vw = vw;
/*  42 */     this.vh = vh;
/*  43 */     this.em = em;
/*  44 */     this.ex = ex;
/*     */   }
/*     */   @NotNull
/*     */   public static MeasureContext createInitial(@NotNull FloatSize viewBoxSize, float em, float ex) {
/*  48 */     return new MeasureContext(viewBoxSize.width, viewBoxSize.height, em, ex);
/*     */   }
/*     */   @NotNull
/*     */   public MeasureContext derive(float viewWidth, float viewHeight) {
/*  52 */     return new MeasureContext(viewWidth, viewHeight, this.em, this.ex);
/*     */   }
/*     */   @NotNull
/*     */   public MeasureContext derive(@Nullable ViewBox viewBox, float em, float ex) {
/*  56 */     if (viewBox == null && Length.isUnspecified(em) && Length.isUnspecified(ex)) return this; 
/*  57 */     float newVw = this.vw;
/*  58 */     float newVh = this.vh;
/*  59 */     if (viewBox != null) {
/*     */       
/*  61 */       if (viewBox.hasSpecifiedWidth()) newVw = viewBox.width; 
/*  62 */       if (viewBox.hasSpecifiedHeight()) newVh = viewBox.height; 
/*     */     } 
/*  64 */     float effectiveEm = Length.isUnspecified(em) ? this.em : em;
/*  65 */     float effectiveEx = Length.isUnspecified(ex) ? this.ex : ex;
/*  66 */     return new MeasureContext(newVw, newVh, effectiveEm, effectiveEx);
/*     */   }
/*     */   
/*     */   public float viewWidth() {
/*  70 */     return this.vw;
/*     */   }
/*     */   
/*     */   public float viewHeight() {
/*  74 */     return this.vh;
/*     */   }
/*     */   
/*     */   public float normedDiagonalLength() {
/*  78 */     return (float)Math.sqrt(((this.vw * this.vw + this.vh * this.vh) / 2.0F));
/*     */   }
/*     */   
/*     */   public float em() {
/*  82 */     return this.em;
/*     */   }
/*     */   
/*     */   public float rem() {
/*  86 */     return SVGFont.defaultFontSize();
/*     */   }
/*     */   
/*     */   public float ex() {
/*  90 */     return this.ex;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  95 */     return "MeasureContext{vw=" + this.vw + ", vh=" + this.vh + ", em=" + this.em + ", ex=" + this.ex + '}';
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 105 */     if (this == o) return true; 
/* 106 */     if (!(o instanceof MeasureContext)) return false; 
/* 107 */     MeasureContext that = (MeasureContext)o;
/* 108 */     return (Float.compare(that.vw, this.vw) == 0 && 
/* 109 */       Float.compare(that.vh, this.vh) == 0 && 
/* 110 */       Float.compare(that.em, this.em) == 0 && 
/* 111 */       Float.compare(that.ex, this.ex) == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 116 */     return Objects.hash(new Object[] { Float.valueOf(this.vw), Float.valueOf(this.vh), Float.valueOf(this.em), Float.valueOf(this.ex) });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\size\MeasureContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */