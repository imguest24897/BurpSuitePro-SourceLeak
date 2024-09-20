/*     */ package com.github.weisj.jsvg.nodes.text;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.Rectangle2D;
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
/*     */ class GlyphCursor
/*     */ {
/*     */   protected final Rectangle2D completeGlyphRunBounds;
/*     */   @NotNull
/*  35 */   protected GlyphAdvancement advancement = GlyphAdvancement.defaultAdvancement();
/*     */   
/*     */   protected float x;
/*     */   
/*     */   protected float y;
/*     */   
/*     */   protected int glyphOffset;
/*     */   
/*     */   protected final AffineTransform transform;
/*     */   
/*     */   protected Length[] xLocations;
/*     */   
/*     */   protected int xOff;
/*     */   protected Length[] xDeltas;
/*     */   protected int dxOff;
/*     */   protected Length[] yLocations;
/*     */   protected int yOff;
/*     */   protected Length[] yDeltas;
/*     */   protected int dyOff;
/*     */   protected float[] rotations;
/*     */   protected int rotOff;
/*     */   
/*     */   GlyphCursor(float x, float y, @NotNull AffineTransform transform) {
/*  58 */     this(x, y, transform, new Rectangle2D.Float(Float.NaN, Float.NaN, 0.0F, 0.0F));
/*     */   }
/*     */   
/*     */   private GlyphCursor(float x, float y, @NotNull AffineTransform transform, @NotNull Rectangle2D glyphBounds) {
/*  62 */     this.x = x;
/*  63 */     this.y = y;
/*  64 */     this.transform = transform;
/*  65 */     this.completeGlyphRunBounds = glyphBounds;
/*  66 */     this.glyphOffset = 0;
/*     */   }
/*     */   
/*     */   GlyphCursor(@NotNull GlyphCursor c) {
/*  70 */     this(c.x, c.y, c.transform, c.completeGlyphRunBounds);
/*  71 */     this.advancement = c.advancement;
/*  72 */     this.glyphOffset = 0;
/*  73 */     this.xLocations = c.xLocations;
/*  74 */     this.xOff = c.xOff;
/*  75 */     this.yLocations = c.yLocations;
/*  76 */     this.yOff = c.yOff;
/*  77 */     this.xDeltas = c.xDeltas;
/*  78 */     this.dxOff = c.dxOff;
/*  79 */     this.yDeltas = c.yDeltas;
/*  80 */     this.dyOff = c.dyOff;
/*  81 */     this.rotations = c.rotations;
/*  82 */     this.rotOff = c.rotOff;
/*     */   }
/*     */   
/*     */   GlyphCursor derive() {
/*  86 */     return new GlyphCursor(this);
/*     */   }
/*     */   
/*     */   void updateFrom(GlyphCursor local) {
/*  90 */     this.x = local.x;
/*  91 */     this.y = local.y;
/*     */   }
/*     */   
/*     */   public void setAdvancement(@NotNull GlyphAdvancement advancement) {
/*  95 */     this.advancement = advancement;
/*     */   }
/*     */   
/*     */   public GlyphAdvancement advancement() {
/*  99 */     return this.advancement;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   AffineTransform advance(@NotNull MeasureContext measure, @NotNull Glyph glyph) {
/* 107 */     this.x = nextX(measure);
/* 108 */     this.x += nextDeltaX(measure);
/*     */     
/* 110 */     this.y = nextY(measure);
/* 111 */     this.y += nextDeltaY(measure);
/*     */     
/* 113 */     this.transform.setToTranslation(this.x, this.y);
/*     */     
/* 115 */     double rotation = nextRotation();
/* 116 */     if (rotation != 0.0D) {
/* 117 */       this.transform.rotate(rotation);
/*     */     }
/*     */     
/* 120 */     this.glyphOffset++;
/*     */ 
/*     */ 
/*     */     
/* 124 */     this.x += this.advancement.glyphAdvancement(glyph);
/*     */     
/* 126 */     return this.advancement.glyphTransform(this.transform);
/*     */   }
/*     */   
/*     */   void advanceSpacing(float letterSpacing) {
/* 130 */     this.x += this.advancement.spacingAdvancement(letterSpacing);
/*     */   }
/*     */   
/*     */   protected float nextX(@NotNull MeasureContext measure) {
/* 134 */     if (this.xLocations != null && this.xOff < this.xLocations.length) {
/* 135 */       this.x = this.xLocations[this.xOff].resolveWidth(measure);
/* 136 */       this.xOff++;
/*     */     } 
/* 138 */     return this.x;
/*     */   }
/*     */   
/*     */   protected float nextDeltaX(@NotNull MeasureContext measure) {
/* 142 */     if (this.xDeltas != null && this.dxOff < this.xDeltas.length) {
/* 143 */       return this.xDeltas[this.dxOff++].resolveWidth(measure);
/*     */     }
/* 145 */     return 0.0F;
/*     */   }
/*     */   
/*     */   protected float nextY(@NotNull MeasureContext measure) {
/* 149 */     if (this.yLocations != null && this.yOff < this.yLocations.length) {
/* 150 */       this.y = this.yLocations[this.yOff].resolveHeight(measure);
/* 151 */       this.yOff++;
/*     */     } 
/* 153 */     return this.y;
/*     */   }
/*     */   
/*     */   protected float nextDeltaY(@NotNull MeasureContext measure) {
/* 157 */     if (this.yDeltas != null && this.dyOff < this.yDeltas.length) {
/* 158 */       return this.yDeltas[this.dyOff++].resolveHeight(measure);
/*     */     }
/* 160 */     return 0.0F;
/*     */   }
/*     */   
/*     */   protected double nextRotation() {
/* 164 */     if (this.rotations != null && this.rotations.length != 0) {
/* 165 */       float rotation = this.rotations[this.rotOff];
/* 166 */       this.rotOff = Math.min(this.rotations.length - 1, this.rotOff + 1);
/* 167 */       return Math.toRadians(rotation);
/*     */     } 
/* 169 */     return 0.0D;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\text\GlyphCursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */