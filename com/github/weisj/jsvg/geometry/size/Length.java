/*     */ package com.github.weisj.jsvg.geometry.size;
/*     */ 
/*     */ import com.google.errorprone.annotations.Immutable;
/*     */ import java.util.Objects;
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
/*     */ @Immutable
/*     */ public final class Length
/*     */ {
/*     */   public static final float UNSPECIFIED_RAW = NaNF;
/*     */   @NotNull
/*  34 */   public static final Length UNSPECIFIED = new Length(Unit.Raw, Float.NaN); @NotNull
/*  35 */   public static final Length ZERO = new Length(Unit.Raw, 0.0F);
/*     */   
/*     */   @NotNull
/*     */   private final Unit unit;
/*     */   
/*     */   private final float value;
/*     */   private static final float pixelsPerInch = 96.0F;
/*     */   private static final float inchesPerCm = 0.3936F;
/*     */   
/*     */   public Length(@NotNull Unit unit, float value) {
/*  45 */     this.unit = unit;
/*  46 */     this.value = value;
/*     */   }
/*     */   
/*     */   public static boolean isUnspecified(float value) {
/*  50 */     return Float.isNaN(value);
/*     */   }
/*     */   
/*     */   public static boolean isSpecified(float value) {
/*  54 */     return !isUnspecified(value);
/*     */   }
/*     */   
/*     */   private float resolveNonPercentage(@NotNull MeasureContext context) {
/*  58 */     if (isUnspecified()) throw new IllegalStateException("Can't resolve size of unspecified length");
/*     */     
/*  60 */     if (this.unit == Unit.Raw) return this.value; 
/*  61 */     assert this.unit != Unit.PERCENTAGE;
/*  62 */     switch (this.unit) {
/*     */       case PX:
/*  64 */         return this.value;
/*     */       case IN:
/*  66 */         return 96.0F * this.value;
/*     */       case CM:
/*  68 */         return 37.7856F * this.value;
/*     */       case MM:
/*  70 */         return 3.7785597F * this.value;
/*     */       case PT:
/*  72 */         return 1.3333334F * this.value;
/*     */       case PC:
/*  74 */         return 16.0F * this.value;
/*     */       case EM:
/*  76 */         return context.em() * this.value;
/*     */       case REM:
/*  78 */         return context.rem() * this.value;
/*     */       case EX:
/*  80 */         return context.ex() * this.value;
/*     */     } 
/*  82 */     throw new UnsupportedOperationException("Not implemented: Can't convert " + this.unit + " to pixel");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float resolveWidth(@NotNull MeasureContext context) {
/*  92 */     if (this.unit == Unit.PERCENTAGE) {
/*  93 */       return this.value * context.viewWidth() / 100.0F;
/*     */     }
/*  95 */     return resolveNonPercentage(context);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float resolveHeight(@NotNull MeasureContext context) {
/* 105 */     if (this.unit == Unit.PERCENTAGE) {
/* 106 */       return this.value * context.viewHeight() / 100.0F;
/*     */     }
/* 108 */     return resolveNonPercentage(context);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float resolveLength(@NotNull MeasureContext context) {
/* 119 */     if (this.unit == Unit.PERCENTAGE) {
/* 120 */       return this.value / 100.0F * context.normedDiagonalLength();
/*     */     }
/* 122 */     return resolveNonPercentage(context);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float resolveFontSize(@NotNull MeasureContext context) {
/* 133 */     if (this.unit == Unit.PERCENTAGE) {
/* 134 */       return this.value / 100.0F * context.em();
/*     */     }
/* 136 */     return resolveNonPercentage(context);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 142 */     return this.value + this.unit.suffix();
/*     */   }
/*     */   
/*     */   public boolean isZero() {
/* 146 */     return (this.value == 0.0F);
/*     */   }
/*     */   
/*     */   public float raw() {
/* 150 */     return this.value;
/*     */   }
/*     */   @NotNull
/*     */   public Unit unit() {
/* 154 */     return this.unit;
/*     */   }
/*     */   
/*     */   public boolean isUnspecified() {
/* 158 */     return isUnspecified(raw());
/*     */   }
/*     */   
/*     */   public boolean isSpecified() {
/* 162 */     return !isUnspecified();
/*     */   }
/*     */   @NotNull
/*     */   public Length coerceNonNegative() {
/* 166 */     if (isSpecified() && raw() <= 0.0F) return ZERO; 
/* 167 */     return this;
/*     */   }
/*     */   
/*     */   public Length orElseIfUnspecified(float value) {
/* 171 */     if (isUnspecified()) return Unit.Raw.valueOf(value); 
/* 172 */     return this;
/*     */   }
/*     */   
/*     */   public Length multiply(float scalingFactor) {
/* 176 */     if (scalingFactor == 0.0F) return ZERO; 
/* 177 */     return new Length(unit(), scalingFactor * raw());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 182 */     if (this == o) return true; 
/* 183 */     if (!(o instanceof Length)) return false; 
/* 184 */     Length length = (Length)o;
/* 185 */     return (this.unit == length.unit && Float.compare(length.value, this.value) == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 190 */     return Objects.hash(new Object[] { this.unit, Float.valueOf(this.value) });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\size\Length.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */