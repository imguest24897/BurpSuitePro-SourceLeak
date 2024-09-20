/*     */ package com.github.weisj.jsvg.nodes.text;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.PaintOrder;
/*     */ import com.github.weisj.jsvg.attributes.VectorEffect;
/*     */ import com.github.weisj.jsvg.attributes.font.SVGFont;
/*     */ import com.github.weisj.jsvg.attributes.text.DominantBaseline;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.renderer.FontRenderContext;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import com.github.weisj.jsvg.renderer.ShapeRenderer;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Shape;
/*     */ import java.awt.Stroke;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.Path2D;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.util.Set;
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
/*     */ final class GlyphRenderer
/*     */ {
/*     */   private static final boolean DEBUG = false;
/*     */   
/*     */   static void prepareGlyphRun(@NotNull StringTextSegment segment, @NotNull GlyphCursor cursor, @NotNull SVGFont font, @NotNull RenderContext context) {
/*  48 */     MeasureContext measure = context.measureContext();
/*     */     
/*  50 */     Shape glyphRun = layoutGlyphRun(segment, cursor, font, measure, context.fontRenderContext());
/*  51 */     Rectangle2D bounds = glyphRun.getBounds2D();
/*     */     
/*  53 */     if (Length.isUnspecified((float)cursor.completeGlyphRunBounds.getX())) {
/*  54 */       cursor.completeGlyphRunBounds.setRect(bounds);
/*     */     } else {
/*  56 */       Rectangle2D.union(cursor.completeGlyphRunBounds, bounds, cursor.completeGlyphRunBounds);
/*     */     } 
/*     */     
/*  59 */     segment.currentGlyphRun = glyphRun;
/*  60 */     segment.currentRenderContext = context;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static void renderGlyphRun(@NotNull Graphics2D g, @NotNull PaintOrder paintOrder, @NotNull Set<VectorEffect> vectorEffects, @NotNull StringTextSegment segment, @NotNull Rectangle2D completeGlyphRunBounds) {
/*  66 */     RenderContext context = segment.currentRenderContext;
/*  67 */     assert context != null;
/*     */     
/*  69 */     Shape glyphRun = segment.currentGlyphRun;
/*  70 */     assert glyphRun != null;
/*     */ 
/*     */ 
/*     */     
/*  74 */     Stroke stroke = context.stroke(1.0F);
/*     */ 
/*     */     
/*  77 */     ShapeRenderer.renderWithPaintOrder(g, true, paintOrder, new ShapeRenderer.ShapePaintContext(context, vectorEffects, stroke, null), new ShapeRenderer.PaintShape(glyphRun, completeGlyphRunBounds), null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  83 */     segment.currentRenderContext = null;
/*  84 */     segment.currentGlyphRun = null;
/*     */   }
/*     */ 
/*     */   
/*     */   static Shape layoutGlyphRun(@NotNull StringTextSegment segment, @NotNull GlyphCursor cursor, @NotNull SVGFont font, @NotNull MeasureContext measure, @NotNull FontRenderContext fontRenderContext) {
/*  89 */     float letterSpacing = fontRenderContext.letterSpacing().resolveLength(measure);
/*     */     
/*  91 */     Path2D glyphPath = new Path2D.Float();
/*     */     
/*  93 */     boolean isLastSegment = segment.isLastSegmentInParent();
/*  94 */     boolean shouldSkipLastSpacing = (isLastSegment && cursor.advancement().shouldSkipLastSpacing());
/*     */     
/*  96 */     char[] codepoints = segment.codepoints();
/*  97 */     for (int i = 0, count = codepoints.length; i < count; i++) {
/*  98 */       char codepoint = codepoints[i];
/*     */       
/* 100 */       boolean lastCodepoint = (i == count - 1);
/*     */       
/* 102 */       Glyph glyph = font.codepointGlyph(codepoint);
/* 103 */       AffineTransform glyphTransform = cursor.advance(measure, glyph);
/*     */       
/* 105 */       boolean skipSpacing = (lastCodepoint && shouldSkipLastSpacing);
/* 106 */       if (!skipSpacing) cursor.advanceSpacing(letterSpacing);
/*     */ 
/*     */       
/* 109 */       if (glyphTransform == null)
/* 110 */         break;  if (glyph.isRendered()) {
/* 111 */         Shape glyphOutline = glyph.glyphOutline();
/*     */         
/* 113 */         float baselineOffset = computeBaselineOffset(font, fontRenderContext);
/* 114 */         glyphTransform.translate(0.0D, -baselineOffset);
/*     */         
/* 116 */         Shape renderPath = glyphTransform.createTransformedShape(glyphOutline);
/* 117 */         glyphPath.append(renderPath, false);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 123 */     return glyphPath;
/*     */   }
/*     */   
/*     */   private static float computeBaselineOffset(@NotNull SVGFont font, @NotNull FontRenderContext fontRenderContext) {
/* 127 */     switch (fontRenderContext.dominantBaseline())
/*     */     
/*     */     { 
/*     */       
/*     */       default:
/* 132 */         return font.romanBaseline();
/*     */       case Hanging:
/* 134 */         return font.hangingBaseline();
/*     */       case Central:
/* 136 */         return font.centerBaseline();
/*     */       case Middle:
/* 138 */         return font.middleBaseline();
/*     */       case Mathematical:
/* 140 */         return font.mathematicalBaseline();
/*     */       case Ideographic:
/*     */       case TextAfterEdge:
/*     */       case TextBottom:
/* 144 */         return font.textUnderBaseline();
/*     */       case TextBeforeEdge:
/*     */       case TextTop:
/* 147 */         break; }  return font.textOverBaseline();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\text\GlyphRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */