/*     */ package com.install4j.runtime.installer.helper.content.xz.lz;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.content.xz.ArrayCache;
/*     */ import com.install4j.runtime.installer.helper.content.xz.CorruptedInputException;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class LZDecoder
/*     */ {
/*     */   private final byte[] buf;
/*     */   private final int bufSize;
/*  22 */   private int start = 0;
/*  23 */   private int pos = 0;
/*  24 */   private int full = 0;
/*  25 */   private int limit = 0;
/*  26 */   private int pendingLen = 0;
/*  27 */   private int pendingDist = 0;
/*     */   
/*     */   public LZDecoder(int dictSize, byte[] presetDict, ArrayCache arrayCache) {
/*  30 */     this.bufSize = dictSize;
/*  31 */     this.buf = arrayCache.getByteArray(this.bufSize, false);
/*     */     
/*  33 */     if (presetDict != null) {
/*  34 */       this.pos = Math.min(presetDict.length, dictSize);
/*  35 */       this.full = this.pos;
/*  36 */       this.start = this.pos;
/*  37 */       System.arraycopy(presetDict, presetDict.length - this.pos, this.buf, 0, this.pos);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void putArraysToCache(ArrayCache arrayCache) {
/*  42 */     arrayCache.putArray(this.buf);
/*     */   }
/*     */   
/*     */   public void reset() {
/*  46 */     this.start = 0;
/*  47 */     this.pos = 0;
/*  48 */     this.full = 0;
/*  49 */     this.limit = 0;
/*  50 */     this.buf[this.bufSize - 1] = 0;
/*     */   }
/*     */   
/*     */   public void setLimit(int outMax) {
/*  54 */     if (this.bufSize - this.pos <= outMax) {
/*  55 */       this.limit = this.bufSize;
/*     */     } else {
/*  57 */       this.limit = this.pos + outMax;
/*     */     } 
/*     */   }
/*     */   public boolean hasSpace() {
/*  61 */     return (this.pos < this.limit);
/*     */   }
/*     */   
/*     */   public boolean hasPending() {
/*  65 */     return (this.pendingLen > 0);
/*     */   }
/*     */   
/*     */   public int getPos() {
/*  69 */     return this.pos;
/*     */   }
/*     */   
/*     */   public int getByte(int dist) {
/*  73 */     int offset = this.pos - dist - 1;
/*  74 */     if (dist >= this.pos) {
/*  75 */       offset += this.bufSize;
/*     */     }
/*  77 */     return this.buf[offset] & 0xFF;
/*     */   }
/*     */   
/*     */   public void putByte(byte b) {
/*  81 */     this.buf[this.pos++] = b;
/*     */     
/*  83 */     if (this.full < this.pos)
/*  84 */       this.full = this.pos; 
/*     */   }
/*     */   
/*     */   public void repeat(int dist, int len) throws IOException {
/*  88 */     if (dist < 0 || dist >= this.full) {
/*  89 */       throw new CorruptedInputException();
/*     */     }
/*  91 */     int left = Math.min(this.limit - this.pos, len);
/*  92 */     this.pendingLen = len - left;
/*  93 */     this.pendingDist = dist;
/*     */     
/*  95 */     int back = this.pos - dist - 1;
/*  96 */     if (dist >= this.pos) {
/*  97 */       back += this.bufSize;
/*     */     }
/*     */     do {
/* 100 */       this.buf[this.pos++] = this.buf[back++];
/* 101 */       if (back != this.bufSize)
/* 102 */         continue;  back = 0;
/* 103 */     } while (--left > 0);
/*     */     
/* 105 */     if (this.full < this.pos)
/* 106 */       this.full = this.pos; 
/*     */   }
/*     */   
/*     */   public void repeatPending() throws IOException {
/* 110 */     if (this.pendingLen > 0) {
/* 111 */       repeat(this.pendingDist, this.pendingLen);
/*     */     }
/*     */   }
/*     */   
/*     */   public void copyUncompressed(DataInputStream inData, int len) throws IOException {
/* 116 */     int copySize = Math.min(this.bufSize - this.pos, len);
/* 117 */     inData.readFully(this.buf, this.pos, copySize);
/* 118 */     this.pos += copySize;
/*     */     
/* 120 */     if (this.full < this.pos)
/* 121 */       this.full = this.pos; 
/*     */   }
/*     */   
/*     */   public int flush(byte[] out, int outOff) {
/* 125 */     int copySize = this.pos - this.start;
/* 126 */     if (this.pos == this.bufSize) {
/* 127 */       this.pos = 0;
/*     */     }
/* 129 */     System.arraycopy(this.buf, this.start, out, outOff, copySize);
/* 130 */     this.start = this.pos;
/*     */     
/* 132 */     return copySize;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\xz\lz\LZDecoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */