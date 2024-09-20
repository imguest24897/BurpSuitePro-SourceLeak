/*     */ package org.brotli.dec;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class Huffman
/*     */ {
/*     */   static final int HUFFMAN_MAX_TABLE_SIZE = 1080;
/*     */   private static final int MAX_LENGTH = 15;
/*     */   
/*     */   private static int getNextKey(int key, int len) {
/*  28 */     int step = 1 << len - 1;
/*  29 */     while ((key & step) != 0) {
/*  30 */       step >>= 1;
/*     */     }
/*  32 */     return (key & step - 1) + step;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void replicateValue(int[] table, int offset, int step, int end, int item) {
/*     */     do {
/*  42 */       end -= step;
/*  43 */       table[offset + end] = item;
/*  44 */     } while (end > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int nextTableBitSize(int[] count, int len, int rootBits) {
/*  53 */     int left = 1 << len - rootBits;
/*  54 */     while (len < 15) {
/*  55 */       left -= count[len];
/*  56 */       if (left <= 0) {
/*     */         break;
/*     */       }
/*  59 */       len++;
/*  60 */       left <<= 1;
/*     */     } 
/*  62 */     return len - rootBits;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void buildHuffmanTable(int[] rootTable, int tableOffset, int rootBits, int[] codeLengths, int codeLengthsSize) {
/*  71 */     int[] sorted = new int[codeLengthsSize];
/*     */     
/*  73 */     int[] count = new int[16];
/*  74 */     int[] offset = new int[16];
/*     */     
/*     */     int symbol;
/*     */     
/*  78 */     for (symbol = 0; symbol < codeLengthsSize; symbol++) {
/*  79 */       count[codeLengths[symbol]] = count[codeLengths[symbol]] + 1;
/*     */     }
/*     */ 
/*     */     
/*  83 */     offset[1] = 0;
/*  84 */     for (int len = 1; len < 15; len++) {
/*  85 */       offset[len + 1] = offset[len] + count[len];
/*     */     }
/*     */ 
/*     */     
/*  89 */     for (symbol = 0; symbol < codeLengthsSize; symbol++) {
/*  90 */       if (codeLengths[symbol] != 0) {
/*  91 */         offset[codeLengths[symbol]] = offset[codeLengths[symbol]] + 1; sorted[offset[codeLengths[symbol]]] = symbol;
/*     */       } 
/*     */     } 
/*     */     
/*  95 */     int tableBits = rootBits;
/*  96 */     int tableSize = 1 << tableBits;
/*  97 */     int totalSize = tableSize;
/*     */ 
/*     */     
/* 100 */     if (offset[15] == 1) {
/* 101 */       for (int m = 0; m < totalSize; m++) {
/* 102 */         rootTable[tableOffset + m] = sorted[0];
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 108 */     int key = 0;
/* 109 */     symbol = 0; int step;
/* 110 */     for (int i = 1; i <= rootBits; i++, step <<= 1) {
/* 111 */       for (; count[i] > 0; count[i] = count[i] - 1) {
/* 112 */         replicateValue(rootTable, tableOffset + key, step, tableSize, i << 16 | sorted[symbol++]);
/* 113 */         key = getNextKey(key, i);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 118 */     int mask = totalSize - 1;
/* 119 */     int low = -1;
/* 120 */     int currentOffset = tableOffset; int k;
/* 121 */     for (int j = rootBits + 1; j <= 15; j++, k <<= 1) {
/* 122 */       for (; count[j] > 0; count[j] = count[j] - 1) {
/* 123 */         if ((key & mask) != low) {
/* 124 */           currentOffset += tableSize;
/* 125 */           tableBits = nextTableBitSize(count, j, rootBits);
/* 126 */           tableSize = 1 << tableBits;
/* 127 */           totalSize += tableSize;
/* 128 */           low = key & mask;
/* 129 */           rootTable[tableOffset + low] = tableBits + rootBits << 16 | currentOffset - tableOffset - low;
/*     */         } 
/*     */         
/* 132 */         replicateValue(rootTable, currentOffset + (key >> rootBits), k, tableSize, j - rootBits << 16 | sorted[symbol++]);
/*     */         
/* 134 */         key = getNextKey(key, j);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\brotli\dec\Huffman.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */