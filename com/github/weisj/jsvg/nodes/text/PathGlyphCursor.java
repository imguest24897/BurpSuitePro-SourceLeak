/*     */ package com.github.weisj.jsvg.nodes.text;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.geometry.util.GeometryUtil;
/*     */ import com.github.weisj.jsvg.geometry.util.SegmentIteratorWithLookBehind;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.PathIterator;
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
/*     */ final class PathGlyphCursor
/*     */   extends GlyphCursor
/*     */ {
/*     */   private float remainingSegmentLength;
/*     */   private float segmentLength;
/*     */   private SegmentIteratorWithLookBehind.Segment currentSegment;
/*     */   @NotNull
/*     */   private final SegmentIteratorWithLookBehind segmentIterator;
/*     */   
/*     */   PathGlyphCursor(@NotNull PathIterator pathIterator, float startOffset) {
/*  43 */     super(0.0F, 0.0F, new AffineTransform());
/*  44 */     this.segmentIterator = new SegmentIteratorWithLookBehind(pathIterator, 0.0F);
/*  45 */     setupInitialData();
/*  46 */     advance(startOffset);
/*     */   }
/*     */   
/*     */   PathGlyphCursor(@NotNull GlyphCursor cursor, float startOffset, @NotNull PathIterator pathIterator) {
/*  50 */     super(cursor);
/*  51 */     this.segmentIterator = new SegmentIteratorWithLookBehind(pathIterator, 0.0F);
/*  52 */     setupInitialData();
/*  53 */     advance(startOffset);
/*     */   }
/*     */   
/*     */   private void setupInitialData() {
/*  57 */     this.currentSegment = this.segmentIterator.currentSegment();
/*  58 */     this.segmentLength = this.remainingSegmentLength = (float)this.currentSegment.length();
/*  59 */     this.x = this.currentSegment.xStart;
/*  60 */     this.y = this.currentSegment.yStart;
/*     */   }
/*     */   
/*     */   private PathGlyphCursor(@NotNull PathGlyphCursor pathCursor) {
/*  64 */     super(pathCursor);
/*     */ 
/*     */     
/*  67 */     this.segmentIterator = pathCursor.segmentIterator;
/*  68 */     this.remainingSegmentLength = pathCursor.remainingSegmentLength;
/*  69 */     this.segmentLength = pathCursor.segmentLength;
/*  70 */     this.currentSegment = pathCursor.currentSegment;
/*     */   }
/*     */ 
/*     */   
/*     */   GlyphCursor derive() {
/*  75 */     return new PathGlyphCursor(this);
/*     */   }
/*     */ 
/*     */   
/*     */   void updateFrom(GlyphCursor local) {
/*  80 */     super.updateFrom(local);
/*  81 */     assert local instanceof PathGlyphCursor;
/*  82 */     PathGlyphCursor glyphCursor = (PathGlyphCursor)local;
/*  83 */     this.remainingSegmentLength = glyphCursor.remainingSegmentLength;
/*  84 */     this.segmentLength = glyphCursor.segmentLength;
/*  85 */     this.currentSegment = glyphCursor.currentSegment;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAdvancement(@NotNull GlyphAdvancement advancement) {
/*  90 */     super.setAdvancement(advancement);
/*     */ 
/*     */     
/*  93 */     this.segmentIterator.setMaxLookBehindLength(
/*  94 */         Math.max(advancement.maxLookBehind(), this.segmentIterator.maxLookBehindLength()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   AffineTransform advance(@NotNull MeasureContext measure, @NotNull Glyph glyph) {
/* 103 */     if (this.segmentIterator.isDone() && GeometryUtil.approximatelyNegative(this.remainingSegmentLength)) return null;
/*     */     
/* 105 */     float deltaX = nextDeltaX(measure);
/* 106 */     if (deltaX != 0.0F) advance(deltaX);
/*     */ 
/*     */     
/* 109 */     float advanceDist = this.advancement.glyphAdvancement(glyph);
/* 110 */     float halfAdvance = advanceDist / 2.0F;
/*     */     
/* 112 */     advance(halfAdvance);
/* 113 */     float walkedFraction = halfAdvance / this.segmentLength;
/* 114 */     float slopeX = walkedFraction * (this.currentSegment.xEnd - this.currentSegment.xStart);
/* 115 */     float slopeY = walkedFraction * (this.currentSegment.yEnd - this.currentSegment.yStart);
/* 116 */     float anchorX = this.x - slopeX;
/* 117 */     float anchorY = this.y - slopeY;
/*     */ 
/*     */     
/* 120 */     if (this.segmentIterator.isDone() && GeometryUtil.approximatelyNegative(this.remainingSegmentLength)) return null; 
/* 121 */     advance(halfAdvance);
/*     */     
/* 123 */     this.transform.setToTranslation(anchorX, anchorY);
/* 124 */     float charRotation = calculateSegmentRotation(anchorX, anchorY, this.x + slopeX, this.y + slopeY);
/* 125 */     this.transform.rotate(charRotation, 0.0D, 0.0D);
/*     */     
/* 127 */     float deltaY = nextDeltaY(measure);
/* 128 */     if (deltaY != 0.0F) {
/*     */       
/* 130 */       float nx = -(this.y - anchorX);
/* 131 */       float ny = this.x - anchorY;
/* 132 */       float nn = deltaY / norm(nx, ny);
/* 133 */       this.transform.translate((nx * nn), (ny * nn));
/*     */     } 
/*     */     
/* 136 */     return this.advancement.glyphTransform(this.transform);
/*     */   }
/*     */ 
/*     */   
/*     */   void advanceSpacing(float letterSpacing) {
/* 141 */     advance(this.advancement.spacingAdvancement(letterSpacing));
/*     */   }
/*     */   
/*     */   private void advance(float distance) {
/* 145 */     if (distance >= 0.0F) {
/* 146 */       advanceInsideSegment(advanceIntoSegment(distance));
/*     */     } else {
/* 148 */       advanceInsideSegment(-reverseIntoSegment(-distance));
/*     */     } 
/*     */   }
/*     */   
/*     */   private float travelledSegmentLength() {
/* 153 */     return this.segmentLength - this.remainingSegmentLength;
/*     */   }
/*     */ 
/*     */   
/*     */   private float advanceIntoSegment(float distance) {
/* 158 */     if (GeometryUtil.approximatelyNegative(distance)) return 0.0F; 
/* 159 */     while (this.segmentIterator.hasNext() && this.remainingSegmentLength < distance) {
/* 160 */       distance -= this.remainingSegmentLength;
/* 161 */       this.segmentIterator.moveToNext();
/* 162 */       this.currentSegment = this.segmentIterator.currentSegment();
/* 163 */       this.x = this.currentSegment.xStart;
/* 164 */       this.y = this.currentSegment.yStart;
/* 165 */       this.segmentLength = (float)this.currentSegment.length();
/* 166 */       this.remainingSegmentLength = this.segmentLength;
/*     */     } 
/* 168 */     return distance;
/*     */   }
/*     */   
/*     */   private float reverseIntoSegment(float distance) {
/* 172 */     if (GeometryUtil.approximatelyNegative(distance)) return 0.0F; 
/* 173 */     while (this.segmentIterator.hasPrevious() && travelledSegmentLength() < distance) {
/* 174 */       distance -= travelledSegmentLength();
/* 175 */       this.segmentIterator.moveToPrevious();
/* 176 */       this.currentSegment = this.segmentIterator.currentSegment();
/* 177 */       this.x = this.currentSegment.xEnd;
/* 178 */       this.y = this.currentSegment.yEnd;
/* 179 */       this.segmentLength = (float)this.currentSegment.length();
/* 180 */       this.remainingSegmentLength = 0.0F;
/*     */     } 
/* 182 */     if (GeometryUtil.notablyGreater(distance, travelledSegmentLength())) {
/* 183 */       throw new IllegalStateException("Not enough buffer " + distance + " > " + travelledSegmentLength());
/*     */     }
/* 185 */     return distance;
/*     */   }
/*     */   
/*     */   private void advanceInsideSegment(float distance) {
/* 189 */     if (GeometryUtil.approximatelyZero(distance))
/* 190 */       return;  if (distance < 0.0F && -distance > travelledSegmentLength()) {
/* 191 */       throw new IllegalStateException("Distance too large " + distance + " of maximum " + 
/* 192 */           travelledSegmentLength());
/*     */     }
/* 194 */     float fractionWalked = distance / this.segmentLength;
/* 195 */     this.x += (this.currentSegment.xEnd - this.currentSegment.xStart) * fractionWalked;
/* 196 */     this.y += (this.currentSegment.yEnd - this.currentSegment.yStart) * fractionWalked;
/* 197 */     this.remainingSegmentLength -= distance;
/*     */   }
/*     */   
/*     */   private float calculateSegmentRotation(float x1, float y1, float x2, float y2) {
/* 201 */     return (float)Math.atan2((y2 - y1), (x2 - x1));
/*     */   }
/*     */   
/*     */   private float norm(float a, float b) {
/* 205 */     return (float)Math.sqrt((a * a + b * b));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\text\PathGlyphCursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */