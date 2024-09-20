/*     */ package com.github.weisj.jsvg.nodes.text;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.PaintOrder;
/*     */ import com.github.weisj.jsvg.attributes.VectorEffect;
/*     */ import com.github.weisj.jsvg.attributes.font.AttributeFontSpec;
/*     */ import com.github.weisj.jsvg.attributes.font.FontParser;
/*     */ import com.github.weisj.jsvg.attributes.font.SVGFont;
/*     */ import com.github.weisj.jsvg.attributes.text.LengthAdjust;
/*     */ import com.github.weisj.jsvg.attributes.text.TextAnchor;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.nodes.SVGNode;
/*     */ import com.github.weisj.jsvg.nodes.container.BaseContainerNode;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasContext;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasShape;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasVectorEffects;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Renderable;
/*     */ import com.github.weisj.jsvg.nodes.prototype.impl.HasContextImpl;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.NodeRenderer;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.geom.Path2D;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.function.BiConsumer;
/*     */ import org.jetbrains.annotations.MustBeInvokedByOverriders;
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
/*     */ abstract class TextContainer
/*     */   extends BaseContainerNode<TextSegment>
/*     */   implements TextSegment.RenderableSegment, HasShape, HasContext.ByDelegate, HasVectorEffects, Renderable
/*     */ {
/*  56 */   private final List<TextSegment> segments = new ArrayList<>();
/*     */   
/*     */   private PaintOrder paintOrder;
/*     */   
/*     */   protected AttributeFontSpec fontSpec;
/*     */   
/*     */   protected LengthAdjust lengthAdjust;
/*     */   
/*     */   protected Length textLength;
/*     */   private boolean isVisible;
/*     */   private HasContext context;
/*     */   private Set<VectorEffect> vectorEffects;
/*     */   
/*     */   @MustBeInvokedByOverriders
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  71 */     super.build(attributeNode);
/*  72 */     this.paintOrder = PaintOrder.parse(attributeNode);
/*  73 */     this.fontSpec = FontParser.parseFontSpec(attributeNode);
/*  74 */     this.lengthAdjust = (LengthAdjust)attributeNode.getEnum("lengthAdjust", (Enum)LengthAdjust.Spacing);
/*  75 */     this.textLength = attributeNode.getLength("textLength", Length.UNSPECIFIED);
/*  76 */     if (this.textLength.raw() < 0.0F) this.textLength = Length.UNSPECIFIED;
/*     */     
/*  78 */     this.isVisible = parseIsVisible(attributeNode);
/*  79 */     this.context = HasContextImpl.parse(attributeNode);
/*     */ 
/*     */     
/*  82 */     this.vectorEffects = VectorEffect.parse(attributeNode);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Set<VectorEffect> vectorEffects() {
/*  87 */     return this.vectorEffects;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public HasContext contextDelegate() {
/*  92 */     return this.context;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean acceptChild(@Nullable String id, @NotNull SVGNode node) {
/*  97 */     return node instanceof TextSegment;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void doAdd(@NotNull SVGNode node) {
/* 102 */     this.segments.add((TextSegment)node);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void addContent(char[] content) {
/* 107 */     if (content.length == 0)
/* 108 */       return;  this.segments.add(new StringTextSegment(this, this.segments.size(), content));
/*     */   }
/*     */ 
/*     */   
/*     */   public List<? extends TextSegment> children() {
/* 113 */     return this.segments;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected final void renderSegment(@NotNull GlyphCursor cursor, @NotNull RenderContext context, @NotNull Graphics2D g) {
/* 124 */     prepareSegmentForRendering(cursor, context);
/*     */     
/* 126 */     double offset = textAnchorOffset(context.fontRenderContext().textAnchor(), cursor);
/* 127 */     context.translate(g, -offset, 0.0D);
/*     */     
/* 129 */     renderSegmentWithoutLayout(cursor, context, g);
/*     */   }
/*     */   
/*     */   private double textAnchorOffset(@NotNull TextAnchor textAnchor, @NotNull GlyphCursor glyphCursor) {
/* 133 */     switch (textAnchor)
/*     */     
/*     */     { default:
/* 136 */         return 0.0D;
/*     */       case Middle:
/* 138 */         return glyphCursor.completeGlyphRunBounds.getWidth() / 2.0D;
/*     */       case End:
/* 140 */         break; }  return glyphCursor.completeGlyphRunBounds.getWidth();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void forEachSegment(@NotNull RenderContext context, @NotNull BiConsumer<StringTextSegment, RenderContext> onStringTextSegment, @NotNull BiConsumer<TextSegment.RenderableSegment, RenderContext> onRenderableSegment) {
/* 147 */     for (TextSegment segment : children()) {
/* 148 */       RenderContext currentContext = context;
/* 149 */       if (segment instanceof Renderable) {
/* 150 */         currentContext = NodeRenderer.setupRenderContext(segment, context);
/*     */       }
/* 152 */       if (segment instanceof StringTextSegment) {
/* 153 */         onStringTextSegment.accept((StringTextSegment)segment, currentContext); continue;
/* 154 */       }  if (segment instanceof TextSegment.RenderableSegment) {
/* 155 */         onRenderableSegment.accept((TextSegment.RenderableSegment)segment, currentContext); continue;
/*     */       } 
/* 157 */       throw new IllegalStateException("Unexpected segment " + segment);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final class IntermediateTextMetrics { private IntermediateTextMetrics() {}
/*     */     
/* 163 */     double letterSpacingLength = 0.0D;
/* 164 */     double glyphLength = 0.0D;
/* 165 */     double fixedGlyphLength = 0.0D;
/*     */     
/* 167 */     int glyphCount = 0;
/* 168 */     int controllableLetterSpacingCount = 0; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public TextMetrics computeTextMetrics(@NotNull RenderContext context, @NotNull TextSegment.RenderableSegment.UseTextLengthForCalculation flag) {
/* 174 */     if (flag == TextSegment.RenderableSegment.UseTextLengthForCalculation.YES && hasFixedLength()) {
/* 175 */       return new TextMetrics(0.0D, 0.0D, 0, this.textLength
/* 176 */           .resolveLength(context.measureContext()), 0);
/*     */     }
/*     */     
/* 179 */     SVGFont font = context.font();
/* 180 */     float letterSpacing = context.fontRenderContext().letterSpacing().resolveLength(context.measureContext());
/*     */     
/* 182 */     IntermediateTextMetrics metrics = new IntermediateTextMetrics();
/*     */     
/* 184 */     int index = 0;
/* 185 */     for (TextSegment segment : children()) {
/* 186 */       RenderContext currentContext = context;
/* 187 */       if (segment instanceof Renderable) {
/* 188 */         currentContext = NodeRenderer.setupRenderContext(segment, context);
/*     */       }
/* 190 */       if (segment instanceof StringTextSegment) {
/* 191 */         StringTextSegment stringTextSegment = (StringTextSegment)segment;
/* 192 */         accumulateSegmentMetrics(metrics, stringTextSegment, font, letterSpacing, index);
/* 193 */       } else if (segment instanceof TextSegment.RenderableSegment) {
/* 194 */         accumulateRenderableSegmentMetrics((TextSegment.RenderableSegment)segment, metrics, currentContext);
/*     */       } else {
/* 196 */         throw new IllegalStateException("Unexpected segment " + segment);
/*     */       } 
/* 198 */       index++;
/*     */     } 
/* 200 */     return new TextMetrics(metrics.letterSpacingLength, metrics.glyphLength, metrics.glyphCount, metrics.fixedGlyphLength, metrics.controllableLetterSpacingCount);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void accumulateRenderableSegmentMetrics(@NotNull TextSegment.RenderableSegment segment, @NotNull IntermediateTextMetrics metrics, @NotNull RenderContext currentContext) {
/* 206 */     TextMetrics textMetrics = segment.computeTextMetrics(currentContext, TextSegment.RenderableSegment.UseTextLengthForCalculation.YES);
/* 207 */     metrics.letterSpacingLength += textMetrics.letterSpacingLength();
/* 208 */     metrics.glyphLength += textMetrics.glyphLength();
/* 209 */     metrics.glyphCount += textMetrics.glyphCount();
/* 210 */     metrics.fixedGlyphLength += textMetrics.fixedGlyphLength();
/* 211 */     metrics.controllableLetterSpacingCount += textMetrics.controllableLetterSpacingCount();
/*     */   }
/*     */ 
/*     */   
/*     */   private void accumulateSegmentMetrics(@NotNull IntermediateTextMetrics metrics, @NotNull StringTextSegment segment, @NotNull SVGFont font, float letterSpacing, int index) {
/* 216 */     int glyphCount = (segment.codepoints()).length;
/*     */     
/* 218 */     boolean lastSegment = (index == children().size() - 1);
/* 219 */     int whiteSpaceCount = lastSegment ? (glyphCount - 1) : glyphCount;
/*     */     
/* 221 */     metrics.glyphCount += glyphCount;
/* 222 */     metrics.letterSpacingLength += (whiteSpaceCount * letterSpacing);
/* 223 */     metrics.controllableLetterSpacingCount += whiteSpaceCount;
/*     */     
/* 225 */     for (char codepoint : segment.codepoints()) {
/* 226 */       metrics.glyphLength += font.codepointGlyph(codepoint).advance();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasFixedLength() {
/* 232 */     return this.textLength.isSpecified();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderSegmentWithoutLayout(@NotNull GlyphCursor cursor, @NotNull RenderContext context, @NotNull Graphics2D g) {
/* 238 */     forEachSegment(context, (segment, ctx) -> {
/*     */           if (isVisible(ctx)) {
/*     */             GlyphRenderer.renderGlyphRun(g, this.paintOrder, vectorEffects(), segment, cursor.completeGlyphRunBounds);
/*     */           }
/*     */         }(segment, ctx) -> segment.renderSegmentWithoutLayout(cursor, ctx, g));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void prepareSegmentForRendering(@NotNull GlyphCursor cursor, @NotNull RenderContext context) {
/* 250 */     SVGFont font = context.font();
/*     */     
/* 252 */     GlyphCursor localCursor = createLocalCursor(context, cursor);
/* 253 */     localCursor.setAdvancement(localGlyphAdvancement(context, cursor));
/*     */     
/* 255 */     forEachSegment(context, (segment, ctx) -> GlyphRenderer.prepareGlyphRun(segment, localCursor, font, ctx), (segment, ctx) -> segment.prepareSegmentForRendering(localCursor, ctx));
/*     */ 
/*     */ 
/*     */     
/* 259 */     cleanUpLocalCursor(cursor, localCursor);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void appendTextShape(@NotNull GlyphCursor cursor, @NotNull Path2D textShape, @NotNull RenderContext context) {
/* 265 */     SVGFont font = context.font();
/* 266 */     GlyphCursor localCursor = createLocalCursor(context, cursor);
/* 267 */     localCursor.setAdvancement(localGlyphAdvancement(context, cursor));
/*     */     
/* 269 */     forEachSegment(context, (segment, ctx) -> textShape.append(GlyphRenderer.layoutGlyphRun(segment, localCursor, font, ctx.measureContext(), ctx.fontRenderContext()), false), (segment, ctx) -> segment.appendTextShape(localCursor, textShape, ctx));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 274 */     cleanUpLocalCursor(cursor, localCursor);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private GlyphAdvancement localGlyphAdvancement(@NotNull RenderContext context, @NotNull GlyphCursor cursor) {
/* 279 */     if (hasFixedLength()) {
/* 280 */       return new GlyphAdvancement(
/* 281 */           computeTextMetrics(context, TextSegment.RenderableSegment.UseTextLengthForCalculation.NO), this.textLength
/* 282 */           .resolveWidth(context.measureContext()), this.lengthAdjust);
/*     */     }
/* 284 */     return cursor.advancement();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Rectangle2D untransformedElementBounds(@NotNull RenderContext context) {
/* 289 */     return untransformedElementShape(context).getBounds2D();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isVisible(@NotNull RenderContext context) {
/* 294 */     return this.isVisible;
/*     */   }
/*     */   
/*     */   protected abstract GlyphCursor createLocalCursor(@NotNull RenderContext paramRenderContext, @NotNull GlyphCursor paramGlyphCursor);
/*     */   
/*     */   protected abstract void cleanUpLocalCursor(@NotNull GlyphCursor paramGlyphCursor1, @NotNull GlyphCursor paramGlyphCursor2);
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\text\TextContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */