/*     */ package com.twitter.hpack;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class HuffmanEncoder
/*     */ {
/*     */   private final int[] codes;
/*     */   private final byte[] lengths;
/*     */   
/*     */   HuffmanEncoder(int[] codes, byte[] lengths) {
/*  32 */     this.codes = codes;
/*  33 */     this.lengths = lengths;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void encode(OutputStream out, byte[] data) throws IOException {
/*  44 */     encode(out, data, 0, data.length);
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
/*     */   public void encode(OutputStream out, byte[] data, int off, int len) throws IOException {
/*  58 */     if (out == null)
/*  59 */       throw new NullPointerException("out"); 
/*  60 */     if (data == null)
/*  61 */       throw new NullPointerException("data"); 
/*  62 */     if (off < 0 || len < 0 || off + len < 0 || off > data.length || off + len > data.length)
/*  63 */       throw new IndexOutOfBoundsException(); 
/*  64 */     if (len == 0) {
/*     */       return;
/*     */     }
/*     */     
/*  68 */     long current = 0L;
/*  69 */     int n = 0;
/*     */     
/*  71 */     for (int i = 0; i < len; i++) {
/*  72 */       int b = data[off + i] & 0xFF;
/*  73 */       int code = this.codes[b];
/*  74 */       int nbits = this.lengths[b];
/*     */       
/*  76 */       current <<= nbits;
/*  77 */       current |= code;
/*  78 */       n += nbits;
/*     */       
/*  80 */       while (n >= 8) {
/*  81 */         n -= 8;
/*  82 */         out.write((int)(current >> n));
/*     */       } 
/*     */     } 
/*     */     
/*  86 */     if (n > 0) {
/*  87 */       current <<= 8 - n;
/*  88 */       current |= (255 >>> n);
/*  89 */       out.write((int)current);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getEncodedLength(byte[] data) {
/*  99 */     if (data == null) {
/* 100 */       throw new NullPointerException("data");
/*     */     }
/* 102 */     long len = 0L;
/* 103 */     for (byte b : data) {
/* 104 */       len += this.lengths[b & 0xFF];
/*     */     }
/* 106 */     return (int)(len + 7L >> 3L);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\twitter\hpack\HuffmanEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */