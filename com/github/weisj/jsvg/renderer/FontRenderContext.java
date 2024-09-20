/*     */ package com.github.weisj.jsvg.renderer;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.text.DominantBaseline;
/*     */ import com.github.weisj.jsvg.attributes.text.TextAnchor;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
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
/*     */ 
/*     */ 
/*     */ @Immutable
/*     */ public final class FontRenderContext
/*     */ {
/*     */   @Nullable
/*     */   private final Length letterSpacing;
/*     */   @Nullable
/*     */   private final DominantBaseline dominantBaseline;
/*     */   @Nullable
/*     */   private final TextAnchor textAnchor;
/*     */   
/*     */   public FontRenderContext(@Nullable Length letterSpacing, @Nullable DominantBaseline dominantBaseline, @Nullable TextAnchor textAnchor) {
/*  47 */     this.letterSpacing = letterSpacing;
/*  48 */     this.dominantBaseline = dominantBaseline;
/*  49 */     this.textAnchor = textAnchor;
/*     */   }
/*     */   @NotNull
/*     */   public Length letterSpacing() {
/*  53 */     return (this.letterSpacing != null) ? this.letterSpacing : Length.ZERO;
/*     */   }
/*     */   @NotNull
/*     */   public TextAnchor textAnchor() {
/*  57 */     return (this.textAnchor != null) ? this.textAnchor : TextAnchor.Start;
/*     */   }
/*     */   @NotNull
/*     */   public DominantBaseline dominantBaseline() {
/*  61 */     return (this.dominantBaseline != null) ? this.dominantBaseline : DominantBaseline.Auto;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/*  66 */     if (this == o) return true; 
/*  67 */     if (!(o instanceof FontRenderContext)) return false; 
/*  68 */     FontRenderContext that = (FontRenderContext)o;
/*  69 */     return (Objects.equals(this.letterSpacing, that.letterSpacing) && this.dominantBaseline == that.dominantBaseline && this.textAnchor == that.textAnchor);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  76 */     return Objects.hash(new Object[] { this.letterSpacing, this.dominantBaseline, this.textAnchor });
/*     */   }
/*     */   @NotNull
/*     */   public static FontRenderContext createDefault() {
/*  80 */     return new FontRenderContext(null, null, null);
/*     */   }
/*     */   @NotNull
/*     */   public static FontRenderContext parse(@NotNull AttributeNode attributeNode) {
/*  84 */     DominantBaseline dominantBaseline = (DominantBaseline)attributeNode.getEnum("dominant-baseline", (Enum)DominantBaseline.Auto);
/*  85 */     if (dominantBaseline == DominantBaseline.Auto && attributeNode.tagIsOneOf(new String[] { "textpath", "tspan"
/*     */         }))
/*     */     {
/*  88 */       dominantBaseline = null;
/*     */     }
/*  90 */     return new FontRenderContext(attributeNode
/*  91 */         .getLength("letter-spacing"), dominantBaseline, (TextAnchor)attributeNode
/*     */         
/*  93 */         .getEnumNullable("text-anchor", TextAnchor.class));
/*     */   }
/*     */   @NotNull
/*     */   public FontRenderContext derive(@Nullable FontRenderContext frc) {
/*  97 */     if (frc == null || frc.equals(this)) return this; 
/*  98 */     return new FontRenderContext(
/*  99 */         (frc.letterSpacing != null) ? frc.letterSpacing : this.letterSpacing, 
/* 100 */         (frc.dominantBaseline != null) ? frc.dominantBaseline : this.dominantBaseline, 
/* 101 */         (frc.textAnchor != null) ? frc.textAnchor : this.textAnchor);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\renderer\FontRenderContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */