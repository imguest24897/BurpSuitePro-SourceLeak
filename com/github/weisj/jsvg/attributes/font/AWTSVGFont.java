/*     */ package com.github.weisj.jsvg.attributes.font;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.nodes.text.Glyph;
/*     */ import java.awt.Font;
/*     */ import java.awt.Shape;
/*     */ import java.awt.font.FontRenderContext;
/*     */ import java.awt.font.GlyphMetrics;
/*     */ import java.awt.font.GlyphVector;
/*     */ import java.awt.font.LineMetrics;
/*     */ import java.util.HashMap;
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
/*     */ public final class AWTSVGFont
/*     */   implements SVGFont
/*     */ {
/*     */   @NotNull
/*     */   private final Font font;
/*  39 */   private final FontRenderContext frc = new FontRenderContext(null, true, true);
/*     */   private final HashMap<Character, Glyph> glyphCache;
/*     */   @Nullable
/*     */   private LineMetrics lineMetrics;
/*     */   private float[] baselineOffsets;
/*  44 */   private float exHeight = Float.NaN;
/*  45 */   private float mathBaseline = Float.NaN;
/*     */   
/*     */   public AWTSVGFont(@NotNull Font font) {
/*  48 */     this.font = font;
/*  49 */     this.glyphCache = new HashMap<>();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Glyph codepointGlyph(char codepoint) {
/*  54 */     Glyph glyph = this.glyphCache.get(Character.valueOf(codepoint));
/*  55 */     if (glyph != null) return glyph; 
/*  56 */     glyph = createGlyph(codepoint);
/*  57 */     this.glyphCache.put(Character.valueOf(codepoint), glyph);
/*  58 */     return glyph;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String family() {
/*  63 */     return this.font.getFamily();
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/*  68 */     return this.font.getSize();
/*     */   }
/*     */   @NotNull
/*     */   private LineMetrics lineMetrics() {
/*  72 */     if (this.lineMetrics == null) {
/*  73 */       this.lineMetrics = this.font.getLineMetrics("Ax-", 0, 1, this.frc);
/*     */     }
/*  75 */     return this.lineMetrics;
/*     */   }
/*     */ 
/*     */   
/*     */   public float effectiveExHeight() {
/*  80 */     if (Length.isUnspecified(this.exHeight)) {
/*  81 */       this.exHeight = (float)codepointGlyph('x').glyphOutline().getBounds2D().getHeight();
/*     */     }
/*  83 */     return this.exHeight;
/*     */   }
/*     */ 
/*     */   
/*     */   public float effectiveEmHeight() {
/*  88 */     return this.font.getSize2D();
/*     */   }
/*     */ 
/*     */   
/*     */   public float mathematicalBaseline() {
/*  93 */     if (Length.isUnspecified(this.mathBaseline)) {
/*  94 */       this.mathBaseline = -effectiveExHeight() / 2.0F;
/*     */     }
/*  96 */     return this.mathBaseline;
/*     */   }
/*     */   
/*     */   private float[] baselineOffsets() {
/* 100 */     if (this.baselineOffsets == null) this.baselineOffsets = lineMetrics().getBaselineOffsets(); 
/* 101 */     return this.baselineOffsets;
/*     */   }
/*     */ 
/*     */   
/*     */   public float hangingBaseline() {
/* 106 */     return baselineOffsets()[2];
/*     */   }
/*     */ 
/*     */   
/*     */   public float romanBaseline() {
/* 111 */     return baselineOffsets()[0];
/*     */   }
/*     */ 
/*     */   
/*     */   public float centerBaseline() {
/* 116 */     return baselineOffsets()[1];
/*     */   }
/*     */ 
/*     */   
/*     */   public float middleBaseline() {
/* 121 */     return (romanBaseline() - effectiveExHeight()) / 2.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public float textUnderBaseline() {
/* 126 */     return lineMetrics().getUnderlineOffset();
/*     */   }
/*     */ 
/*     */   
/*     */   public float textOverBaseline() {
/* 131 */     return textUnderBaseline() - effectiveEmHeight();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private Glyph createGlyph(char codepoint) {
/* 136 */     char[] buffer = { codepoint };
/* 137 */     GlyphVector glyphVector = this.font.createGlyphVector(this.frc, buffer);
/* 138 */     GlyphMetrics gm = glyphVector.getGlyphMetrics(0);
/* 139 */     float advance = gm.getAdvanceX();
/* 140 */     Shape shape = glyphVector.getGlyphOutline(0);
/* 141 */     return new Glyph(shape, advance, gm.getBounds2D().isEmpty());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\font\AWTSVGFont.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */