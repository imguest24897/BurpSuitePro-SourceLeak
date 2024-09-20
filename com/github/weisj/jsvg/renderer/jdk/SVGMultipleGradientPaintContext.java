/*     */ package com.github.weisj.jsvg.renderer.jdk;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.MultipleGradientPaint;
/*     */ import java.awt.PaintContext;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.NoninvertibleTransformException;
/*     */ import java.awt.image.ColorModel;
/*     */ import java.awt.image.DataBufferInt;
/*     */ import java.awt.image.DirectColorModel;
/*     */ import java.awt.image.Raster;
/*     */ import java.awt.image.SinglePixelPackedSampleModel;
/*     */ import java.lang.ref.SoftReference;
/*     */ import java.lang.ref.WeakReference;
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
/*     */ abstract class SVGMultipleGradientPaintContext
/*     */   implements PaintContext
/*     */ {
/*     */   private static final float MIN_INTERVAL_LENGTH = 0.001F;
/*     */   protected ColorModel model;
/*  81 */   private static final ColorModel XRGB_MODEL = new DirectColorModel(24, 16711680, 65280, 255);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static ColorModel cachedModel;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static WeakReference<Raster> cached;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Raster saved;
/*     */ 
/*     */ 
/*     */   
/*     */   protected MultipleGradientPaint.CycleMethod cycleMethod;
/*     */ 
/*     */ 
/*     */   
/*     */   protected MultipleGradientPaint.ColorSpaceType colorSpace;
/*     */ 
/*     */ 
/*     */   
/*     */   protected float a00;
/*     */ 
/*     */ 
/*     */   
/*     */   protected float a01;
/*     */ 
/*     */ 
/*     */   
/*     */   protected float a10;
/*     */ 
/*     */ 
/*     */   
/*     */   protected float a11;
/*     */ 
/*     */ 
/*     */   
/*     */   protected float a02;
/*     */ 
/*     */ 
/*     */   
/*     */   protected float a12;
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean isSimpleLookup;
/*     */ 
/*     */ 
/*     */   
/*     */   protected int fastGradientArraySize;
/*     */ 
/*     */ 
/*     */   
/*     */   protected int[] gradient;
/*     */ 
/*     */ 
/*     */   
/*     */   private int[][] gradients;
/*     */ 
/*     */ 
/*     */   
/*     */   private float[] normalizedIntervals;
/*     */ 
/*     */ 
/*     */   
/*     */   private final float[] fractions;
/*     */ 
/*     */ 
/*     */   
/*     */   private int transparencyTest;
/*     */ 
/*     */ 
/*     */   
/* 160 */   private static final int[] SRGBtoLinearRGB = new int[256];
/* 161 */   private static final int[] LinearRGBtoSRGB = new int[256];
/*     */   protected static final int GRADIENT_SIZE = 256;
/*     */   
/*     */   static {
/* 165 */     for (int k = 0; k < 256; k++) {
/* 166 */       SRGBtoLinearRGB[k] = convertSRGBtoLinearRGB(k);
/* 167 */       LinearRGBtoSRGB[k] = convertLinearRGBtoSRGB(k);
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
/*     */   protected static final int GRADIENT_SIZE_INDEX = 255;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final int MAX_GRADIENT_ARRAY_SIZE = 5000;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected SVGMultipleGradientPaintContext(@NotNull SVGMultipleGradientPaint mgp, @NotNull AffineTransform t, float[] fractions, @NotNull Color[] colors, MultipleGradientPaint.CycleMethod cycleMethod, MultipleGradientPaint.ColorSpaceType colorSpace) {
/*     */     AffineTransform tInv;
/*     */     try {
/* 198 */       t.invert();
/* 199 */       tInv = t;
/* 200 */     } catch (NoninvertibleTransformException e) {
/*     */ 
/*     */       
/* 203 */       tInv = new AffineTransform();
/*     */     } 
/* 205 */     double[] m = new double[6];
/* 206 */     tInv.getMatrix(m);
/* 207 */     this.a00 = (float)m[0];
/* 208 */     this.a10 = (float)m[1];
/* 209 */     this.a01 = (float)m[2];
/* 210 */     this.a11 = (float)m[3];
/* 211 */     this.a02 = (float)m[4];
/* 212 */     this.a12 = (float)m[5];
/*     */ 
/*     */     
/* 215 */     this.cycleMethod = cycleMethod;
/* 216 */     this.colorSpace = colorSpace;
/*     */ 
/*     */     
/* 219 */     this.fractions = fractions;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 225 */     int[] gradient = (mgp.gradient != null) ? mgp.gradient.get() : null;
/*     */     
/* 227 */     int[][] gradients = (mgp.gradients != null) ? mgp.gradients.get() : null;
/*     */     
/* 229 */     if (gradient == null && gradients == null) {
/*     */       
/* 231 */       calculateLookupData(colors);
/*     */ 
/*     */ 
/*     */       
/* 235 */       mgp.model = this.model;
/* 236 */       mgp.normalizedIntervals = this.normalizedIntervals;
/* 237 */       mgp.isSimpleLookup = this.isSimpleLookup;
/* 238 */       if (this.isSimpleLookup) {
/*     */         
/* 240 */         mgp.fastGradientArraySize = this.fastGradientArraySize;
/* 241 */         mgp.gradient = (SoftReference)new SoftReference<>(this.gradient);
/*     */       } else {
/*     */         
/* 244 */         mgp.gradients = (SoftReference)new SoftReference<>(this.gradients);
/*     */       } 
/*     */     } else {
/*     */       
/* 248 */       this.model = mgp.model;
/* 249 */       this.normalizedIntervals = mgp.normalizedIntervals;
/* 250 */       this.isSimpleLookup = mgp.isSimpleLookup;
/* 251 */       this.gradient = gradient;
/* 252 */       this.fastGradientArraySize = mgp.fastGradientArraySize;
/* 253 */       this.gradients = gradients;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void calculateLookupData(Color[] colors) {
/*     */     Color[] normalizedColors;
/* 264 */     if (this.colorSpace == MultipleGradientPaint.ColorSpaceType.LINEAR_RGB) {
/*     */       
/* 266 */       normalizedColors = new Color[colors.length];
/*     */       
/* 268 */       for (int j = 0; j < colors.length; j++) {
/* 269 */         int argb = colors[j].getRGB();
/* 270 */         int a = argb >>> 24;
/* 271 */         int r = SRGBtoLinearRGB[argb >> 16 & 0xFF];
/* 272 */         int g = SRGBtoLinearRGB[argb >> 8 & 0xFF];
/* 273 */         int b = SRGBtoLinearRGB[argb & 0xFF];
/* 274 */         normalizedColors[j] = new Color(r, g, b, a);
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 279 */       normalizedColors = colors;
/*     */     } 
/*     */ 
/*     */     
/* 283 */     this.normalizedIntervals = new float[this.fractions.length - 1];
/*     */ 
/*     */     
/* 286 */     for (int i = 0; i < this.normalizedIntervals.length; i++)
/*     */     {
/* 288 */       this.normalizedIntervals[i] = this.fractions[i + 1] - this.fractions[i];
/*     */     }
/*     */ 
/*     */     
/* 292 */     this.transparencyTest = -16777216;
/*     */ 
/*     */     
/* 295 */     this.gradients = new int[this.normalizedIntervals.length][];
/*     */ 
/*     */     
/* 298 */     float Imin = 1.0F;
/* 299 */     for (float interval : this.normalizedIntervals) {
/* 300 */       if (interval > 0.001F) {
/* 301 */         Imin = Math.min(Imin, interval);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 310 */     int estimatedSize = 0;
/* 311 */     for (float normalizedInterval : this.normalizedIntervals) {
/* 312 */       estimatedSize += (int)(normalizedInterval / Imin * 256.0F);
/*     */     }
/*     */     
/* 315 */     if (estimatedSize > 5000) {
/*     */       
/* 317 */       calculateMultipleArrayGradient(normalizedColors);
/*     */     } else {
/*     */       
/* 320 */       calculateSingleArrayGradient(normalizedColors, Imin);
/*     */     } 
/*     */ 
/*     */     
/* 324 */     if (this.transparencyTest >>> 24 == 255) {
/* 325 */       this.model = XRGB_MODEL;
/*     */     } else {
/* 327 */       this.model = ColorModel.getRGBdefault();
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
/*     */ 
/*     */   
/*     */   private void calculateSingleArrayGradient(Color[] colors, float Imin) {
/* 356 */     this.isSimpleLookup = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 362 */     int gradientsTot = 1;
/*     */ 
/*     */     
/* 365 */     for (int i = 0; i < this.gradients.length; i++) {
/*     */ 
/*     */       
/* 368 */       int nGradients = (int)(this.normalizedIntervals[i] / Imin * 255.0F);
/* 369 */       gradientsTot += nGradients;
/* 370 */       this.gradients[i] = new int[nGradients];
/*     */ 
/*     */       
/* 373 */       int rgb1 = colors[i].getRGB();
/* 374 */       int rgb2 = colors[i + 1].getRGB();
/*     */ 
/*     */       
/* 377 */       interpolate(rgb1, rgb2, this.gradients[i]);
/*     */ 
/*     */ 
/*     */       
/* 381 */       this.transparencyTest &= rgb1;
/* 382 */       this.transparencyTest &= rgb2;
/*     */     } 
/*     */ 
/*     */     
/* 386 */     this.gradient = new int[gradientsTot];
/* 387 */     int curOffset = 0;
/* 388 */     for (int[] ints : this.gradients) {
/* 389 */       System.arraycopy(ints, 0, this.gradient, curOffset, ints.length);
/* 390 */       curOffset += ints.length;
/*     */     } 
/* 392 */     this.gradient[this.gradient.length - 1] = colors[colors.length - 1].getRGB();
/*     */ 
/*     */ 
/*     */     
/* 396 */     if (this.colorSpace == MultipleGradientPaint.ColorSpaceType.LINEAR_RGB) {
/* 397 */       for (int j = 0; j < this.gradient.length; j++) {
/* 398 */         this.gradient[j] = convertEntireColorLinearRGBtoSRGB(this.gradient[j]);
/*     */       }
/*     */     }
/*     */     
/* 402 */     this.fastGradientArraySize = this.gradient.length - 1;
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
/*     */   private void calculateMultipleArrayGradient(Color[] colors) {
/* 425 */     this.isSimpleLookup = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 431 */     for (int i = 0; i < this.gradients.length; i++) {
/*     */ 
/*     */       
/* 434 */       this.gradients[i] = new int[256];
/*     */ 
/*     */       
/* 437 */       int rgb1 = colors[i].getRGB();
/* 438 */       int rgb2 = colors[i + 1].getRGB();
/*     */ 
/*     */       
/* 441 */       interpolate(rgb1, rgb2, this.gradients[i]);
/*     */ 
/*     */ 
/*     */       
/* 445 */       this.transparencyTest &= rgb1;
/* 446 */       this.transparencyTest &= rgb2;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 451 */     if (this.colorSpace == MultipleGradientPaint.ColorSpaceType.LINEAR_RGB) {
/* 452 */       for (int j = 0; j < this.gradients.length; j++) {
/* 453 */         for (int k = 0; k < (this.gradients[j]).length; k++) {
/* 454 */           this.gradients[j][k] = convertEntireColorLinearRGBtoSRGB(this.gradients[j][k]);
/*     */         }
/*     */       } 
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
/*     */   private void interpolate(int rgb1, int rgb2, int[] output) {
/* 473 */     float stepSize = 1.0F / output.length;
/*     */ 
/*     */     
/* 476 */     int a1 = rgb1 >> 24 & 0xFF;
/* 477 */     int r1 = rgb1 >> 16 & 0xFF;
/* 478 */     int g1 = rgb1 >> 8 & 0xFF;
/* 479 */     int b1 = rgb1 & 0xFF;
/*     */ 
/*     */     
/* 482 */     int da = (rgb2 >> 24 & 0xFF) - a1;
/* 483 */     int dr = (rgb2 >> 16 & 0xFF) - r1;
/* 484 */     int dg = (rgb2 >> 8 & 0xFF) - g1;
/* 485 */     int db = (rgb2 & 0xFF) - b1;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 490 */     for (int i = 0; i < output.length; i++) {
/* 491 */       output[i] = (int)((a1 + (i * da) * stepSize) + 0.5D) << 24 | (int)((r1 + (i * dr) * stepSize) + 0.5D) << 16 | (int)((g1 + (i * dg) * stepSize) + 0.5D) << 8 | (int)((b1 + (i * db) * stepSize) + 0.5D);
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
/*     */   private int convertEntireColorLinearRGBtoSRGB(int rgb) {
/* 508 */     int a1 = rgb >> 24 & 0xFF;
/* 509 */     int r1 = rgb >> 16 & 0xFF;
/* 510 */     int g1 = rgb >> 8 & 0xFF;
/* 511 */     int b1 = rgb & 0xFF;
/*     */ 
/*     */     
/* 514 */     r1 = LinearRGBtoSRGB[r1];
/* 515 */     g1 = LinearRGBtoSRGB[g1];
/* 516 */     b1 = LinearRGBtoSRGB[b1];
/*     */ 
/*     */     
/* 519 */     return a1 << 24 | r1 << 16 | g1 << 8 | b1;
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
/*     */   protected final int indexIntoGradientsArrays(float position) {
/* 537 */     if (this.cycleMethod == MultipleGradientPaint.CycleMethod.NO_CYCLE) {
/* 538 */       if (position > 1.0F) {
/*     */         
/* 540 */         position = 1.0F;
/* 541 */       } else if (position < 0.0F) {
/*     */         
/* 543 */         position = 0.0F;
/*     */       } 
/* 545 */     } else if (this.cycleMethod == MultipleGradientPaint.CycleMethod.REPEAT) {
/*     */ 
/*     */       
/* 548 */       position -= (int)position;
/*     */ 
/*     */       
/* 551 */       if (position < 0.0F)
/*     */       {
/* 553 */         position++;
/*     */       }
/*     */     } else {
/* 556 */       if (position < 0.0F)
/*     */       {
/* 558 */         position = -position;
/*     */       }
/*     */ 
/*     */       
/* 562 */       int part = (int)position;
/*     */ 
/*     */       
/* 565 */       position -= part;
/*     */       
/* 567 */       if ((part & 0x1) == 1)
/*     */       {
/* 569 */         position = 1.0F - position;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 575 */     if (this.isSimpleLookup)
/*     */     {
/* 577 */       return this.gradient[(int)(position * this.fastGradientArraySize)];
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 582 */     for (int i = 0; i < this.gradients.length; i++) {
/* 583 */       if (position < this.fractions[i + 1]) {
/*     */         
/* 585 */         float delta = position - this.fractions[i];
/*     */ 
/*     */         
/* 588 */         int index = (int)(delta / this.normalizedIntervals[i] * 255.0F);
/*     */         
/* 590 */         return this.gradients[i][index];
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 595 */     return this.gradients[this.gradients.length - 1][255];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int convertSRGBtoLinearRGB(int color) {
/* 605 */     float output, input = color / 255.0F;
/* 606 */     if (input <= 0.04045F) {
/* 607 */       output = input / 12.92F;
/*     */     } else {
/* 609 */       output = (float)Math.pow((input + 0.055D) / 1.055D, 2.4D);
/*     */     } 
/*     */     
/* 612 */     return Math.round(output * 255.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int convertLinearRGBtoSRGB(int color) {
/* 622 */     float output, input = color / 255.0F;
/* 623 */     if (input <= 0.0031308D) {
/* 624 */       output = input * 12.92F;
/*     */     } else {
/* 626 */       output = 1.055F * (float)Math.pow(input, 0.4166666666666667D) - 0.055F;
/*     */     } 
/*     */     
/* 629 */     return Math.round(output * 255.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final Raster getRaster(int x, int y, int w, int h) {
/* 636 */     Raster raster = this.saved;
/* 637 */     if (raster == null || raster.getWidth() < w || raster.getHeight() < h) {
/* 638 */       raster = getCachedRaster(this.model, w, h);
/* 639 */       this.saved = raster;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 649 */     DataBufferInt rasterDB = (DataBufferInt)raster.getDataBuffer();
/* 650 */     int[] pixels = rasterDB.getData(0);
/* 651 */     int off = rasterDB.getOffset();
/* 652 */     int scanlineStride = ((SinglePixelPackedSampleModel)raster.getSampleModel()).getScanlineStride();
/* 653 */     int adjust = scanlineStride - w;
/*     */     
/* 655 */     fillRaster(pixels, off, adjust, x, y, w, h);
/*     */     
/* 657 */     return raster;
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
/*     */   private static synchronized Raster getCachedRaster(ColorModel cm, int w, int h) {
/* 669 */     if (Objects.equals(cm, cachedModel) && 
/* 670 */       cached != null) {
/* 671 */       Raster ras = cached.get();
/* 672 */       if (ras != null && ras.getWidth() >= w && ras.getHeight() >= h) {
/* 673 */         cached = null;
/* 674 */         return ras;
/*     */       } 
/*     */     } 
/*     */     
/* 678 */     return cm.createCompatibleWritableRaster(w, h);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static synchronized void putCachedRaster(ColorModel cm, Raster ras) {
/* 687 */     if (cached != null) {
/* 688 */       Raster cras = cached.get();
/* 689 */       if (cras != null) {
/* 690 */         int cw = cras.getWidth();
/* 691 */         int ch = cras.getHeight();
/* 692 */         int iw = ras.getWidth();
/* 693 */         int ih = ras.getHeight();
/* 694 */         if (cw >= iw && ch >= ih) {
/*     */           return;
/*     */         }
/* 697 */         if (cw * ch >= iw * ih) {
/*     */           return;
/*     */         }
/*     */       } 
/*     */     } 
/* 702 */     cachedModel = cm;
/* 703 */     cached = new WeakReference<>(ras);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void dispose() {
/* 708 */     if (this.saved != null) {
/* 709 */       putCachedRaster(this.model, this.saved);
/* 710 */       this.saved = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public final ColorModel getColorModel() {
/* 716 */     return this.model;
/*     */   }
/*     */   
/*     */   protected abstract void fillRaster(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\renderer\jdk\SVGMultipleGradientPaintContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */