/*     */ package com.github.weisj.jsvg.geometry.noise;
/*     */ 
/*     */ import java.awt.geom.Rectangle2D;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class PerlinTurbulence
/*     */ {
/*     */   private static final int RAND_m = 2147483647;
/*     */   private static final int RAND_a = 16807;
/*     */   private static final int RAND_q = 127773;
/*     */   private static final int RAND_r = 2836;
/*     */   private static final int BSize = 256;
/*     */   private static final int BM = 255;
/*     */   private static final double PerlinN = 4096.0D;
/*  52 */   private final int[] uLatticeSelector = new int[257];
/*  53 */   private final double[] fGradient = new double[2056];
/*     */   private final int numOctaves;
/*     */   private final double xFrequency;
/*     */   private final double yFrequency;
/*     */   
/*     */   public PerlinTurbulence(int seed, int numOctaves, double xFrequency, double yFrequency) {
/*  59 */     this.numOctaves = numOctaves;
/*  60 */     this.xFrequency = xFrequency;
/*  61 */     this.yFrequency = yFrequency;
/*  62 */     init(seed);
/*     */   }
/*     */   
/*     */   public static final class StitchInfo {
/*     */     private int width;
/*     */     private int height;
/*     */     private int wrapX;
/*     */     private int wrapY;
/*     */   }
/*     */   
/*     */   private static int setupSeed(int seed) {
/*  73 */     if (seed <= 0) seed = -(seed % 2147483646) + 1; 
/*  74 */     if (seed > 2147483646) seed = 2147483646; 
/*  75 */     return seed;
/*     */   }
/*     */   
/*     */   private static int random(int seed) {
/*  79 */     int result = 16807 * seed % 127773 - 2836 * seed / 127773;
/*  80 */     if (result <= 0) result += Integer.MAX_VALUE; 
/*  81 */     return result;
/*     */   }
/*     */   
/*     */   private void init(int seed) {
/*  85 */     int lSeed = setupSeed(seed);
/*     */     
/*     */     int k;
/*     */     
/*  89 */     for (k = 0; k < 4; k++) {
/*  90 */       for (int m = 0; m < 256; m++) {
/*     */         double u, v;
/*     */         do {
/*  93 */           u = ((lSeed = random(lSeed)) % 512) - 256.0D;
/*  94 */           v = ((lSeed = random(lSeed)) % 512) - 256.0D;
/*  95 */         } while (u == 0.0D && v == 0.0D);
/*     */         
/*  97 */         double s = Math.sqrt(u * u + v * v);
/*  98 */         double si = 1.0D / s;
/*  99 */         this.fGradient[m * 8 + k * 2] = u * si;
/* 100 */         this.fGradient[m * 8 + k * 2 + 1] = v * si;
/*     */       } 
/*     */     } 
/*     */     int i;
/* 104 */     for (i = 0; i < 256; i++) {
/* 105 */       this.uLatticeSelector[i] = i;
/*     */     }
/* 107 */     while (--i > 0) {
/* 108 */       k = this.uLatticeSelector[i];
/* 109 */       int m = (lSeed = random(lSeed)) % 256;
/* 110 */       this.uLatticeSelector[i] = this.uLatticeSelector[m];
/* 111 */       this.uLatticeSelector[m] = k;
/*     */ 
/*     */ 
/*     */       
/* 115 */       int s1 = i << 3;
/* 116 */       int s2 = m << 3;
/* 117 */       for (m = 0; m < 8; m++) {
/* 118 */         double s = this.fGradient[s1 + m];
/* 119 */         this.fGradient[s1 + m] = this.fGradient[s2 + m];
/* 120 */         this.fGradient[s2 + m] = s;
/*     */       } 
/*     */     } 
/* 123 */     this.uLatticeSelector[256] = this.uLatticeSelector[0];
/* 124 */     for (int j = 0; j < 8; j++)
/* 125 */       this.fGradient[2048 + j] = this.fGradient[j]; 
/*     */   }
/*     */   
/*     */   private static double curve(double t) {
/* 129 */     return t * t * (3.0D - 2.0D * t);
/*     */   }
/*     */   
/*     */   private static double lerp(double t, double a, double b) {
/* 133 */     return a + t * (b - a);
/*     */   }
/*     */   
/*     */   private void noise2(double[] noiseChannels, double vec0, double vec1, @Nullable StitchInfo stitchInfo) {
/* 137 */     double t = vec0 + 4096.0D;
/* 138 */     int bx0 = (int)t;
/* 139 */     int bx1 = bx0 + 1;
/* 140 */     double rx0 = t - bx0;
/* 141 */     double rx1 = rx0 - 1.0D;
/* 142 */     double sx = curve(rx0);
/*     */     
/* 144 */     t = vec1 + 4096.0D;
/* 145 */     int by0 = (int)t;
/* 146 */     int by1 = by0 + 1;
/* 147 */     double ry0 = t - (int)t;
/* 148 */     double ry1 = ry0 - 1.0D;
/* 149 */     double sy = curve(ry0);
/*     */ 
/*     */     
/* 152 */     if (stitchInfo != null) {
/* 153 */       if (bx0 >= stitchInfo.wrapX)
/* 154 */         bx0 -= stitchInfo.width; 
/* 155 */       if (bx1 >= stitchInfo.wrapX) {
/* 156 */         bx1 -= stitchInfo.width;
/*     */       }
/* 158 */       if (by0 >= stitchInfo.wrapY)
/* 159 */         by0 -= stitchInfo.height; 
/* 160 */       if (by1 >= stitchInfo.wrapY) {
/* 161 */         by1 -= stitchInfo.height;
/*     */       }
/*     */     } 
/* 164 */     bx0 &= 0xFF;
/* 165 */     bx1 &= 0xFF;
/* 166 */     by0 &= 0xFF;
/* 167 */     by1 &= 0xFF;
/*     */     
/* 169 */     int i = this.uLatticeSelector[bx0];
/* 170 */     int j = this.uLatticeSelector[bx1];
/*     */     
/* 172 */     int b00 = (i + by0 & 0xFF) << 3;
/* 173 */     int b10 = (j + by0 & 0xFF) << 3;
/* 174 */     int b01 = (i + by1 & 0xFF) << 3;
/* 175 */     int b11 = (j + by1 & 0xFF) << 3;
/*     */     
/* 177 */     for (int channelIndex = 0; channelIndex < noiseChannels.length; channelIndex++) {
/* 178 */       int offset = 2 * channelIndex;
/* 179 */       noiseChannels[channelIndex] = 
/* 180 */         lerp(sy, 
/* 181 */           lerp(sx, rx0 * this.fGradient[b00 + offset] + ry0 * this.fGradient[b00 + offset + 1], rx1 * this.fGradient[b10 + offset] + ry0 * this.fGradient[b10 + offset + 1]), 
/*     */ 
/*     */           
/* 184 */           lerp(sx, rx0 * this.fGradient[b01 + offset] + ry1 * this.fGradient[b01 + offset + 1], rx1 * this.fGradient[b11 + offset] + ry1 * this.fGradient[b11 + offset + 1]));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void turbulence(double[] turbulenceChannels, double pointX, double pointY, boolean fractalSum, @Nullable StitchInfo stitchInfo, @Nullable Rectangle2D.Double tile) {
/* 192 */     double baseFrequencyX = this.xFrequency;
/* 193 */     double baseFrequencyY = this.yFrequency;
/* 194 */     if (stitchInfo != null) {
/* 195 */       assert tile != null;
/* 196 */       if (baseFrequencyX != 0.0D) {
/* 197 */         baseFrequencyX = adjustFrequency(baseFrequencyX, tile.width);
/*     */       }
/* 199 */       if (baseFrequencyY != 0.0D) {
/* 200 */         baseFrequencyY = adjustFrequency(baseFrequencyY, tile.height);
/*     */       }
/*     */       
/* 203 */       stitchInfo.width = (int)(tile.width * baseFrequencyX + 0.5D);
/* 204 */       stitchInfo.wrapX = (int)(tile.x * baseFrequencyX + 4096.0D + stitchInfo.width);
/*     */       
/* 206 */       stitchInfo.height = (int)(tile.height * baseFrequencyY + 0.5D);
/* 207 */       stitchInfo.wrapY = (int)(tile.y * baseFrequencyY + 4096.0D + stitchInfo.height);
/*     */     } 
/*     */ 
/*     */     
/* 211 */     (new double[4])[0] = 127.5D; (new double[4])[1] = 127.5D; (new double[4])[2] = 127.5D; (new double[4])[3] = 127.5D;
/* 212 */     (new double[4])[0] = 0.0D; (new double[4])[1] = 0.0D; (new double[4])[2] = 0.0D; (new double[4])[3] = 0.0D; double[] fSum = fractalSum ? new double[4] : new double[4];
/*     */     
/* 214 */     double vec0 = pointX * baseFrequencyX;
/* 215 */     double vec1 = pointY * baseFrequencyY;
/*     */     
/* 217 */     double ratio = fractalSum ? 127.5D : 255.0D;
/*     */     
/* 219 */     for (int nOctave = 0; nOctave < this.numOctaves; nOctave++) {
/* 220 */       noise2(turbulenceChannels, vec0, vec1, stitchInfo);
/* 221 */       if (fractalSum) {
/* 222 */         for (int i = 0; i < turbulenceChannels.length; i++) {
/* 223 */           fSum[i] = fSum[i] + turbulenceChannels[i] * ratio;
/*     */         }
/*     */       } else {
/* 226 */         for (int i = 0; i < turbulenceChannels.length; i++) {
/* 227 */           fSum[i] = fSum[i] + Math.abs(turbulenceChannels[i]) * ratio;
/*     */         }
/*     */       } 
/* 230 */       vec0 *= 2.0D;
/* 231 */       vec1 *= 2.0D;
/* 232 */       ratio *= 0.5D;
/* 233 */       if (stitchInfo != null) {
/*     */ 
/*     */         
/* 236 */         stitchInfo.width *= 2;
/* 237 */         stitchInfo.wrapX *= 2;
/* 238 */         stitchInfo.wrapX += 4096;
/*     */         
/* 240 */         stitchInfo.height *= 2;
/* 241 */         stitchInfo.wrapY *= 2;
/* 242 */         stitchInfo.wrapY += 4096;
/*     */       } 
/*     */     } 
/*     */     
/* 246 */     System.arraycopy(fSum, 0, turbulenceChannels, 0, fSum.length);
/*     */   }
/*     */   
/*     */   private double adjustFrequency(double frequency, double tileSize) {
/* 250 */     double fLoFreq = Math.floor(tileSize * frequency) / tileSize;
/* 251 */     double fHiFreq = Math.ceil(tileSize * frequency) / tileSize;
/* 252 */     if (frequency / fLoFreq < fHiFreq / frequency) {
/* 253 */       return fLoFreq;
/*     */     }
/* 255 */     return fHiFreq;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\noise\PerlinTurbulence.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */