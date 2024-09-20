/*     */ package com.github.weisj.jsvg.nodes;
/*     */ 
/*     */ import com.github.weisj.jsvg.util.ImageUtil;
/*     */ import java.awt.image.Raster;
/*     */ import java.awt.image.WritableRaster;
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
/*     */ public final class InplaceBoxBlurFilter
/*     */ {
/*     */   public static void horizontalPass(@NotNull Raster src, @NotNull WritableRaster dst, int skipX, int skipY, int boxSize, int loc) {
/*  42 */     int width = src.getWidth();
/*  43 */     int height = src.getHeight();
/*     */     
/*  45 */     if (width < 2 * skipX + boxSize)
/*  46 */       return;  if (height < 2 * skipY)
/*     */       return; 
/*  48 */     int srcScanStride = ImageUtil.getINT_RGBA_ScanlineStride(src);
/*  49 */     int dstScanStride = ImageUtil.getINT_RGBA_ScanlineStride(dst);
/*     */     
/*  51 */     int srcOff = ImageUtil.getINT_RGBA_DataOffset(src);
/*  52 */     int dstOff = ImageUtil.getINT_RGBA_DataOffset(dst);
/*     */     
/*  54 */     int[] srcPixels = ImageUtil.getINT_RGBA_DataBank(src);
/*  55 */     int[] dstPixels = ImageUtil.getINT_RGBA_DataBank(dst);
/*     */     
/*  57 */     int[] buffer = new int[boxSize];
/*     */     
/*  59 */     int scale = 16777216 / boxSize;
/*     */     
/*  61 */     for (int y = skipY; y < height - skipY; y++) {
/*  62 */       int sp = srcOff + y * srcScanStride;
/*  63 */       int dp = dstOff + y * dstScanStride;
/*  64 */       int rowEnd = sp + width - skipX;
/*     */       
/*  66 */       int k = 0;
/*  67 */       int sumA = 0;
/*  68 */       int sumR = 0;
/*  69 */       int sumG = 0;
/*  70 */       int sumB = 0;
/*     */       
/*  72 */       sp += skipX;
/*  73 */       int end = sp + boxSize;
/*     */       
/*  75 */       while (sp < end) {
/*  76 */         int curr = buffer[k] = srcPixels[sp];
/*  77 */         sumA += curr >>> 24;
/*  78 */         sumR += curr >> 16 & 0xFF;
/*  79 */         sumG += curr >> 8 & 0xFF;
/*  80 */         sumB += curr & 0xFF;
/*  81 */         k++;
/*  82 */         sp++;
/*     */       } 
/*     */       
/*  85 */       dp += skipX + loc;
/*  86 */       int prev = dstPixels[dp] = sumA * scale & 0xFF000000 | (sumR * scale & 0xFF000000) >>> 8 | (sumG * scale & 0xFF000000) >>> 16 | (sumB * scale & 0xFF000000) >>> 24;
/*     */ 
/*     */ 
/*     */       
/*  90 */       dp++;
/*  91 */       k = 0;
/*  92 */       while (sp < rowEnd) {
/*  93 */         int curr = buffer[k];
/*  94 */         if (curr == srcPixels[sp]) {
/*  95 */           dstPixels[dp] = prev;
/*     */         } else {
/*  97 */           sumA -= curr >>> 24;
/*  98 */           sumR -= curr >> 16 & 0xFF;
/*  99 */           sumG -= curr >> 8 & 0xFF;
/* 100 */           sumB -= curr & 0xFF;
/*     */           
/* 102 */           curr = buffer[k] = srcPixels[sp];
/*     */           
/* 104 */           sumA += curr >>> 24;
/* 105 */           sumR += curr >> 16 & 0xFF;
/* 106 */           sumG += curr >> 8 & 0xFF;
/* 107 */           sumB += curr & 0xFF;
/* 108 */           prev = dstPixels[dp] = sumA * scale & 0xFF000000 | (sumR * scale & 0xFF000000) >>> 8 | (sumG * scale & 0xFF000000) >>> 16 | (sumB * scale & 0xFF000000) >>> 24;
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 113 */         k = (k + 1) % boxSize;
/* 114 */         sp++;
/* 115 */         dp++;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void verticalPass(@NotNull Raster src, @NotNull WritableRaster dst, int skipX, int skipY, int boxSize, int loc) {
/* 122 */     int w = src.getWidth();
/* 123 */     int h = src.getHeight();
/*     */     
/* 125 */     if (w < 2 * skipX)
/* 126 */       return;  if (h < 2 * skipY + boxSize)
/*     */       return; 
/* 128 */     int srcScanStride = ImageUtil.getINT_RGBA_ScanlineStride(src);
/* 129 */     int dstScanStride = ImageUtil.getINT_RGBA_ScanlineStride(dst);
/*     */     
/* 131 */     int srcOff = ImageUtil.getINT_RGBA_DataOffset(src);
/* 132 */     int dstOff = ImageUtil.getINT_RGBA_DataOffset(dst);
/*     */     
/* 134 */     int[] srcPixels = ImageUtil.getINT_RGBA_DataBank(src);
/* 135 */     int[] dstPixels = ImageUtil.getINT_RGBA_DataBank(dst);
/*     */     
/* 137 */     int[] buffer = new int[boxSize];
/*     */ 
/*     */     
/* 140 */     int scale = 16777216 / boxSize;
/*     */     
/* 142 */     for (int x = skipX; x < w - skipX; x++) {
/* 143 */       int sp = srcOff + x;
/* 144 */       int dp = dstOff + x;
/* 145 */       int colEnd = sp + (h - skipY) * srcScanStride;
/*     */       
/* 147 */       int k = 0;
/* 148 */       int sumA = 0;
/* 149 */       int sumR = 0;
/* 150 */       int sumG = 0;
/* 151 */       int sumB = 0;
/*     */       
/* 153 */       sp += skipY * srcScanStride;
/* 154 */       int end = sp + boxSize * srcScanStride;
/*     */       
/* 156 */       while (sp < end) {
/* 157 */         int curr = buffer[k] = srcPixels[sp];
/* 158 */         sumA += curr >>> 24;
/* 159 */         sumR += curr >> 16 & 0xFF;
/* 160 */         sumG += curr >> 8 & 0xFF;
/* 161 */         sumB += curr & 0xFF;
/* 162 */         k++;
/* 163 */         sp += srcScanStride;
/*     */       } 
/*     */ 
/*     */       
/* 167 */       dp += (skipY + loc) * dstScanStride;
/* 168 */       int prev = dstPixels[dp] = sumA * scale & 0xFF000000 | (sumR * scale & 0xFF000000) >>> 8 | (sumG * scale & 0xFF000000) >>> 16 | (sumB * scale & 0xFF000000) >>> 24;
/*     */ 
/*     */ 
/*     */       
/* 172 */       dp += dstScanStride;
/* 173 */       k = 0;
/* 174 */       while (sp < colEnd) {
/* 175 */         int curr = buffer[k];
/* 176 */         if (curr == srcPixels[sp]) {
/* 177 */           dstPixels[dp] = prev;
/*     */         } else {
/* 179 */           sumA -= curr >>> 24;
/* 180 */           sumR -= curr >> 16 & 0xFF;
/* 181 */           sumG -= curr >> 8 & 0xFF;
/* 182 */           sumB -= curr & 0xFF;
/*     */           
/* 184 */           curr = buffer[k] = srcPixels[sp];
/*     */           
/* 186 */           sumA += curr >>> 24;
/* 187 */           sumR += curr >> 16 & 0xFF;
/* 188 */           sumG += curr >> 8 & 0xFF;
/* 189 */           sumB += curr & 0xFF;
/* 190 */           prev = dstPixels[dp] = sumA * scale & 0xFF000000 | (sumR * scale & 0xFF000000) >>> 8 | (sumG * scale & 0xFF000000) >>> 16 | (sumB * scale & 0xFF000000) >>> 24;
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 195 */         k = (k + 1) % boxSize;
/* 196 */         sp += srcScanStride;
/* 197 */         dp += dstScanStride;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\InplaceBoxBlurFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */