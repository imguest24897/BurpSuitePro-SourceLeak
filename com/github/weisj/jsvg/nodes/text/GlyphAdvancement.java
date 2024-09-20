/*     */ package com.github.weisj.jsvg.nodes.text;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.text.LengthAdjust;
/*     */ import com.google.errorprone.annotations.Immutable;
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
/*     */ @Immutable
/*     */ final class GlyphAdvancement
/*     */ {
/*     */   private final float spacingAdjustment;
/*     */   private final float absoluteSpacingAdjustment;
/*     */   private final float glyphAdjustment;
/*     */   private final boolean needsLastSpacing;
/*     */   
/*     */   private GlyphAdvancement() {
/*  40 */     this.spacingAdjustment = 1.0F;
/*  41 */     this.absoluteSpacingAdjustment = 0.0F;
/*  42 */     this.glyphAdjustment = 1.0F;
/*  43 */     this.needsLastSpacing = false;
/*     */   }
/*     */   
/*     */   GlyphAdvancement(@NotNull TextMetrics textMetrics, float desiredLength, @NotNull LengthAdjust lengthAdjust) {
/*  47 */     double totalSpace = desiredLength - textMetrics.fixedGlyphLength();
/*  48 */     switch (lengthAdjust) {
/*     */       
/*     */       default:
/*  51 */         this.spacingAdjustment = 1.0F;
/*  52 */         this.glyphAdjustment = 1.0F;
/*  53 */         if (textMetrics.glyphCount() == 0) {
/*  54 */           this.absoluteSpacingAdjustment = 0.0F;
/*  55 */           this.needsLastSpacing = false;
/*     */         } else {
/*  57 */           float adjustableSpace = (float)(totalSpace - textMetrics.glyphLength());
/*  58 */           int spacingCount = textMetrics.controllableLetterSpacingCount();
/*  59 */           if (spacingCount == 0) {
/*  60 */             this.absoluteSpacingAdjustment = adjustableSpace;
/*  61 */             this.needsLastSpacing = true;
/*     */           } else {
/*  63 */             this.absoluteSpacingAdjustment = adjustableSpace / spacingCount;
/*  64 */             this.needsLastSpacing = false;
/*     */           } 
/*     */         }  return;
/*     */       case SpacingAndGlyphs:
/*     */         break;
/*  69 */     }  this.absoluteSpacingAdjustment = 0.0F;
/*  70 */     this.needsLastSpacing = false;
/*  71 */     this.spacingAdjustment = (float)(totalSpace / textMetrics.totalAdjustableLength());
/*  72 */     this.glyphAdjustment = this.spacingAdjustment;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static GlyphAdvancement defaultAdvancement() {
/*  78 */     return new GlyphAdvancement();
/*     */   }
/*     */   
/*     */   public float maxLookBehind() {
/*  82 */     return -Math.min(0.0F, this.absoluteSpacingAdjustment);
/*     */   }
/*     */   
/*     */   float spacingAdvancement(float letterSpacing) {
/*  86 */     return letterSpacing * this.spacingAdjustment + this.absoluteSpacingAdjustment;
/*     */   }
/*     */   
/*     */   float glyphAdvancement(@NotNull Glyph glyph) {
/*  90 */     return glyph.advance() * this.glyphAdjustment;
/*     */   }
/*     */   
/*     */   boolean shouldSkipLastSpacing() {
/*  94 */     if (this.needsLastSpacing) return false; 
/*  95 */     return (this.absoluteSpacingAdjustment != 0.0F || this.spacingAdjustment != 1.0F || this.glyphAdjustment != 1.0F);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   AffineTransform glyphTransform(@NotNull AffineTransform transform) {
/* 100 */     if (this.glyphAdjustment == 1.0F) return transform; 
/* 101 */     AffineTransform glyphTransform = new AffineTransform(transform);
/* 102 */     glyphTransform.scale(this.glyphAdjustment, 1.0D);
/* 103 */     return glyphTransform;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 108 */     return "GlyphAdvancement{spacingAdjustment=" + this.spacingAdjustment + ", absoluteSpacingAdjustment=" + this.absoluteSpacingAdjustment + ", glyphAdjustment=" + this.glyphAdjustment + ", needsLastSpacing=" + this.needsLastSpacing + '}';
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\text\GlyphAdvancement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */