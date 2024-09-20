/*     */ package com.nimbusds.jose.util;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BoundedInputStream
/*     */   extends InputStream
/*     */ {
/*     */   private final InputStream in;
/*     */   private final long max;
/*     */   private long pos;
/*     */   private long mark;
/*     */   private boolean propagateClose;
/*     */   
/*     */   public BoundedInputStream(InputStream in, long size) {
/*  72 */     this.pos = 0L;
/*  73 */     this.mark = -1L;
/*  74 */     this.propagateClose = true;
/*  75 */     this.max = size;
/*  76 */     this.in = in;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BoundedInputStream(InputStream in) {
/*  86 */     this(in, -1L);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getLimitBytes() {
/*  96 */     return this.max;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int read() throws IOException {
/* 102 */     if (this.max >= 0L && this.pos >= this.max) {
/* 103 */       throw new IOException("Exceeded configured input limit of " + this.max + " bytes");
/*     */     }
/* 105 */     int result = this.in.read();
/* 106 */     this.pos++;
/* 107 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int read(byte[] b) throws IOException {
/* 114 */     return read(b, 0, b.length);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int read(byte[] b, int off, int len) throws IOException {
/* 120 */     if (this.max >= 0L && this.pos >= this.max) {
/* 121 */       throw new IOException("Exceeded configured input limit of " + this.max + " bytes");
/*     */     }
/* 123 */     int bytesRead = this.in.read(b, off, len);
/*     */     
/* 125 */     if (bytesRead == -1) {
/* 126 */       return -1;
/*     */     }
/* 128 */     this.pos += bytesRead;
/*     */     
/* 130 */     if (this.max >= 0L && this.pos >= this.max) {
/* 131 */       throw new IOException("Exceeded configured input limit of " + this.max + " bytes");
/*     */     }
/* 133 */     return bytesRead;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long skip(long n) throws IOException {
/* 141 */     long toSkip = (this.max >= 0L) ? Math.min(n, this.max - this.pos) : n;
/* 142 */     long skippedBytes = this.in.skip(toSkip);
/* 143 */     this.pos += skippedBytes;
/* 144 */     return skippedBytes;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int available() throws IOException {
/* 150 */     return (this.max >= 0L && this.pos >= this.max) ? 0 : this.in.available();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 156 */     return this.in.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 162 */     if (this.propagateClose) {
/* 163 */       this.in.close();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void reset() throws IOException {
/* 170 */     this.in.reset();
/* 171 */     this.pos = this.mark;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void mark(int readlimit) {
/* 177 */     this.in.mark(readlimit);
/* 178 */     this.mark = this.pos;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean markSupported() {
/* 184 */     return this.in.markSupported();
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
/*     */   public boolean isPropagateClose() {
/* 197 */     return this.propagateClose;
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
/*     */   public void setPropagateClose(boolean propagateClose) {
/* 211 */     this.propagateClose = propagateClose;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\BoundedInputStream.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */