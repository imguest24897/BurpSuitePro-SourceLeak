/*     */ package com.github.weisj.jsvg.attributes.font;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.geometry.size.Unit;
/*     */ import com.google.errorprone.annotations.Immutable;
/*     */ import java.util.Arrays;
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
/*     */ @Immutable
/*     */ public final class MeasurableFontSpec
/*     */   extends FontSpec
/*     */ {
/*     */   @NotNull
/*     */   public static final String DEFAULT_FONT_FAMILY_NAME = "Default";
/*     */   private final int currentWeight;
/*     */   @NotNull
/*     */   private final Length currentSize;
/*     */   
/*     */   MeasurableFontSpec(@NotNull String[] families, @Nullable FontStyle style, @Nullable Length sizeAdjust, float stretch, int currentWeight, @NotNull Length currentSize) {
/*  44 */     super(families, style, sizeAdjust, stretch);
/*  45 */     this.currentWeight = currentWeight;
/*  46 */     this.currentSize = currentSize;
/*     */   }
/*     */   @NotNull
/*     */   public static MeasurableFontSpec createDefault() {
/*  50 */     return new MeasurableFontSpec(new String[] { "Default"
/*     */         },
/*  52 */         FontStyle.normal(), null, FontStretch.Normal
/*     */         
/*  54 */         .percentage(), 400, Unit.Raw
/*     */         
/*  56 */         .valueOf(SVGFont.defaultFontSize()));
/*     */   }
/*     */   @NotNull
/*     */   public String[] families() {
/*  60 */     return this.families;
/*     */   }
/*     */   @NotNull
/*     */   public FontStyle style() {
/*  64 */     assert this.style != null;
/*  65 */     return this.style;
/*     */   }
/*     */   
/*     */   public float stretch() {
/*  69 */     return this.stretch;
/*     */   }
/*     */   
/*     */   public int currentWeight() {
/*  73 */     return this.currentWeight;
/*     */   }
/*     */   @NotNull
/*     */   public Length currentSize() {
/*  77 */     return this.currentSize;
/*     */   }
/*     */   
/*     */   public float effectiveSize(@NotNull MeasureContext context) {
/*  81 */     float emSize = currentSize().resolveFontSize(context);
/*  82 */     if (this.sizeAdjust != null) {
/*  83 */       return SVGFont.emFromEx(emSize * this.sizeAdjust.resolveFontSize(context));
/*     */     }
/*  85 */     return emSize;
/*     */   }
/*     */   @NotNull
/*     */   public MeasurableFontSpec withFontSize(@Nullable FontSize size, @Nullable Length sizeAdjust) {
/*  89 */     if (size == null && sizeAdjust == null) return this; 
/*  90 */     return new MeasurableFontSpec(this.families, this.style, (sizeAdjust != null) ? sizeAdjust : this.sizeAdjust, this.stretch, this.currentWeight, 
/*  91 */         (size != null) ? size.size(this.currentSize) : this.currentSize);
/*     */   }
/*     */   @NotNull
/*     */   public MeasurableFontSpec derive(@Nullable AttributeFontSpec other) {
/*  95 */     if (other == null) return this;
/*     */ 
/*     */     
/*  98 */     String[] newFamilies = (other.families != null && other.families.length > 0) ? other.families : this.families;
/*     */ 
/*     */     
/* 101 */     FontStyle newStyle = (other.style != null) ? other.style : this.style;
/*     */ 
/*     */     
/* 104 */     int newWeight = (other.weight() != null) ? other.weight().weight(this.currentWeight) : this.currentWeight;
/*     */ 
/*     */     
/* 107 */     Length newSize = (other.size() != null) ? other.size().size(this.currentSize) : this.currentSize;
/*     */ 
/*     */     
/* 110 */     Length newSizeAdjust = (other.sizeAdjust != null) ? other.sizeAdjust : this.sizeAdjust;
/*     */ 
/*     */     
/* 113 */     float newStretch = Length.isSpecified(other.stretch) ? other.stretch : this.stretch;
/* 114 */     return new MeasurableFontSpec(newFamilies, newStyle, newSizeAdjust, newStretch, newWeight, newSize);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 119 */     return "MeasurableFontSpec{families=" + 
/* 120 */       Arrays.toString((Object[])this.families) + ", style=" + this.style + ", sizeAdjust=" + this.sizeAdjust + ", stretch=" + this.stretch + ", currentWeight=" + this.currentWeight + ", currentSize=" + this.currentSize + '}';
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 131 */     if (this == o) return true; 
/* 132 */     if (!(o instanceof MeasurableFontSpec)) return false; 
/* 133 */     if (!super.equals(o)) return false; 
/* 134 */     MeasurableFontSpec fontSpec = (MeasurableFontSpec)o;
/* 135 */     return (this.currentWeight == fontSpec.currentWeight && this.currentSize.equals(fontSpec.currentSize));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 140 */     return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Integer.valueOf(this.currentWeight), this.currentSize });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\font\MeasurableFontSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */