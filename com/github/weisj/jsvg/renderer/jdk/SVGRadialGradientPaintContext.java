/*     */ package com.github.weisj.jsvg.renderer.jdk;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.MultipleGradientPaint;
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
/*     */ final class SVGRadialGradientPaintContext
/*     */   extends SVGMultipleGradientPaintContext
/*     */ {
/*     */   private final boolean isSimpleFocus;
/*     */   private final boolean isNonCyclic;
/*     */   private final float centerX;
/*     */   private final float centerY;
/*     */   private float focusX;
/*     */   private float focusY;
/*     */   private final float radiusSq;
/*     */   private final float focusRadius;
/*     */   private final float focusRadiusSq;
/*     */   private final float constA;
/*     */   private final float constB;
/*     */   private final float gDeltaDelta;
/*     */   private final float trivial;
/*     */   private static final float FOCUS_CLAMP_DOWNSCALE = 0.99F;
/*     */   private static final int SQRT_LUT_SIZE = 2048;
/*     */   
/*     */   SVGRadialGradientPaintContext(@NotNull SVGRadialGradientPaint paint, @NotNull AffineTransform t, float cx, float cy, float r, float fx, float fy, float fr, float[] fractions, @NotNull Color[] colors, MultipleGradientPaint.CycleMethod cycleMethod, MultipleGradientPaint.ColorSpaceType colorSpace) {
/* 126 */     super(paint, t, fractions, colors, cycleMethod, colorSpace);
/*     */ 
/*     */     
/* 129 */     this.centerX = cx;
/* 130 */     this.centerY = cy;
/* 131 */     this.focusX = fx;
/* 132 */     this.focusY = fy;
/*     */ 
/*     */     
/* 135 */     this.isSimpleFocus = (this.focusX == this.centerX && this.focusY == this.centerY && fr == 0.0F);
/* 136 */     this.isNonCyclic = (cycleMethod == MultipleGradientPaint.CycleMethod.NO_CYCLE);
/*     */ 
/*     */     
/* 139 */     this.radiusSq = r * r;
/* 140 */     this.focusRadius = fr;
/* 141 */     this.focusRadiusSq = fr * fr;
/*     */     
/* 143 */     float dX = this.focusX - this.centerX;
/* 144 */     float dY = this.focusY - this.centerY;
/*     */     
/* 146 */     double distSq = (dX * dX + dY * dY);
/*     */ 
/*     */     
/* 149 */     if (distSq > (this.radiusSq * 0.99F)) {
/*     */       
/* 151 */       float scale = (float)Math.sqrt((this.radiusSq * 0.99F) / distSq);
/* 152 */       dX *= scale;
/* 153 */       dY *= scale;
/* 154 */       this.focusX = this.centerX + dX;
/* 155 */       this.focusY = this.centerY + dY;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 160 */     this.trivial = (float)Math.sqrt((this.radiusSq - dX * dX));
/*     */ 
/*     */     
/* 163 */     this.constA = this.a02 - this.centerX;
/* 164 */     this.constB = this.a12 - this.centerY;
/*     */ 
/*     */     
/* 167 */     this.gDeltaDelta = 2.0F * (this.a00 * this.a00 + this.a10 * this.a10) / this.radiusSq;
/*     */   }
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
/*     */   protected void fillRaster(int[] pixels, int off, int adjust, int x, int y, int w, int h) {
/* 180 */     if (this.isSimpleFocus && this.isNonCyclic && this.isSimpleLookup) {
/* 181 */       simpleNonCyclicFillRaster(pixels, off, adjust, x, y, w, h);
/*     */     } else {
/* 183 */       cyclicCircularGradientFillRaster(pixels, off, adjust, x, y, w, h);
/*     */     } 
/*     */   }
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
/*     */   private void simpleNonCyclicFillRaster(int[] pixels, int off, int adjust, int x, int y, int w, int h) {
/* 210 */     float rowX = this.a00 * x + this.a01 * y + this.constA;
/* 211 */     float rowY = this.a10 * x + this.a11 * y + this.constB;
/*     */ 
/*     */     
/* 214 */     float gDeltaDelta = this.gDeltaDelta;
/*     */ 
/*     */     
/* 217 */     adjust += w;
/*     */ 
/*     */     
/* 220 */     int rgbclip = this.gradient[this.fastGradientArraySize];
/*     */     
/* 222 */     for (int j = 0; j < h; j++) {
/*     */       
/* 224 */       float gRel = (rowX * rowX + rowY * rowY) / this.radiusSq;
/* 225 */       float gDelta = 2.0F * (this.a00 * rowX + this.a10 * rowY) / this.radiusSq + gDeltaDelta / 2.0F;
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
/* 237 */       int i = 0;
/*     */       
/* 239 */       while (i < w && gRel >= 1.0F) {
/* 240 */         pixels[off + i] = rgbclip;
/* 241 */         gRel += gDelta;
/* 242 */         gDelta += gDeltaDelta;
/* 243 */         i++;
/*     */       } 
/*     */       
/* 246 */       while (i < w && gRel < 1.0F) {
/*     */         int gIndex;
/*     */         
/* 249 */         if (gRel <= 0.0F) {
/* 250 */           gIndex = 0;
/*     */         } else {
/* 252 */           float fIndex = gRel * 2048.0F;
/* 253 */           int iIndex = (int)fIndex;
/* 254 */           float s0 = sqrtLookup[iIndex];
/* 255 */           float s1 = sqrtLookup[iIndex + 1] - s0;
/* 256 */           fIndex = s0 + (fIndex - iIndex) * s1;
/* 257 */           gIndex = (int)(fIndex * this.fastGradientArraySize);
/*     */         } 
/*     */ 
/*     */         
/* 261 */         pixels[off + i] = this.gradient[gIndex];
/*     */ 
/*     */         
/* 264 */         gRel += gDelta;
/* 265 */         gDelta += gDeltaDelta;
/* 266 */         i++;
/*     */       } 
/*     */       
/* 269 */       while (i < w) {
/* 270 */         pixels[off + i] = rgbclip;
/* 271 */         i++;
/*     */       } 
/*     */       
/* 274 */       off += adjust;
/* 275 */       rowX += this.a01;
/* 276 */       rowY += this.a11;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 282 */   private static final float[] sqrtLookup = new float[2049];
/*     */   static {
/* 284 */     for (int i = 0; i < sqrtLookup.length; i++) {
/* 285 */       sqrtLookup[i] = (float)Math.sqrt((i / 2048.0F));
/*     */     }
/*     */   }
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
/*     */   private void cyclicCircularGradientFillRaster(int[] pixels, int off, int adjust, int x, int y, int w, int h) {
/* 310 */     double constC = (-this.radiusSq + this.centerX * this.centerX + this.centerY * this.centerY);
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
/* 322 */     float constX = this.a00 * x + this.a01 * y + this.a02;
/* 323 */     float constY = this.a10 * x + this.a11 * y + this.a12;
/*     */ 
/*     */     
/* 326 */     float precalc2 = 2.0F * this.centerY;
/* 327 */     float precalc3 = -2.0F * this.centerX;
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
/* 345 */     int indexer = off;
/*     */ 
/*     */     
/* 348 */     int pixInc = w + adjust;
/*     */ 
/*     */     
/* 351 */     for (int j = 0; j < h; j++) {
/*     */ 
/*     */       
/* 354 */       float X = this.a01 * j + constX;
/* 355 */       float Y = this.a11 * j + constY;
/*     */ 
/*     */       
/* 358 */       for (int i = 0; i < w; i++) {
/*     */         double solutionX, solutionY; int colorAtPoint;
/* 360 */         if (X == this.focusX) {
/*     */           
/* 362 */           solutionX = this.focusX;
/* 363 */           solutionY = this.centerY;
/* 364 */           solutionY += (Y > this.focusY) ? this.trivial : -this.trivial;
/*     */         } else {
/*     */           
/* 367 */           double slope = ((Y - this.focusY) / (X - this.focusX));
/* 368 */           double yIntercept = Y - slope * X;
/*     */ 
/*     */ 
/*     */           
/* 372 */           double A = slope * slope + 1.0D;
/* 373 */           double B = precalc3 + -2.0D * slope * (this.centerY - yIntercept);
/* 374 */           double C = constC + yIntercept * (yIntercept - precalc2);
/*     */           
/* 376 */           float det = (float)Math.sqrt(B * B - 4.0D * A * C);
/* 377 */           solutionX = -B;
/*     */ 
/*     */ 
/*     */           
/* 381 */           solutionX += (X < this.focusX) ? -det : det;
/* 382 */           solutionX /= 2.0D * A;
/* 383 */           solutionY = slope * solutionX + yIntercept;
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 391 */         float deltaXSq = X - this.focusX;
/* 392 */         deltaXSq *= deltaXSq;
/*     */         
/* 394 */         float deltaYSq = Y - this.focusY;
/* 395 */         deltaYSq *= deltaYSq;
/*     */         
/* 397 */         float currentToFocusSq = deltaXSq + deltaYSq;
/*     */ 
/*     */         
/* 400 */         if (currentToFocusSq <= this.focusRadiusSq) {
/*     */           
/* 402 */           colorAtPoint = indexIntoGradientsArrays(0.0F);
/*     */         } else {
/*     */           float g;
/*     */           
/* 406 */           deltaXSq = (float)solutionX - this.focusX;
/* 407 */           deltaXSq *= deltaXSq;
/*     */           
/* 409 */           deltaYSq = (float)solutionY - this.focusY;
/* 410 */           deltaYSq *= deltaYSq;
/*     */           
/* 412 */           float intersectToFocusSq = deltaXSq + deltaYSq;
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 417 */           if (this.focusRadius > 0.0F) {
/* 418 */             float currentToFocus = (float)Math.sqrt(currentToFocusSq);
/* 419 */             float intersectToFocus = (float)Math.sqrt(intersectToFocusSq);
/* 420 */             g = (currentToFocus - this.focusRadius) / (intersectToFocus - this.focusRadius);
/*     */           } else {
/* 422 */             g = (float)Math.sqrt((currentToFocusSq / intersectToFocusSq));
/*     */           } 
/*     */           
/* 425 */           colorAtPoint = indexIntoGradientsArrays(g);
/*     */         } 
/*     */ 
/*     */         
/* 429 */         pixels[indexer + i] = colorAtPoint;
/*     */ 
/*     */         
/* 432 */         X += this.a00;
/* 433 */         Y += this.a10;
/*     */       } 
/*     */       
/* 436 */       indexer += pixInc;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\renderer\jdk\SVGRadialGradientPaintContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */