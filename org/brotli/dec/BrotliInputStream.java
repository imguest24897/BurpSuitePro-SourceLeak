/*     */ package org.brotli.dec;
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
/*     */ public class BrotliInputStream
/*     */   extends InputStream
/*     */ {
/*     */   public static final int DEFAULT_INTERNAL_BUFFER_SIZE = 16384;
/*     */   private byte[] buffer;
/*     */   private int remainingBufferBytes;
/*     */   private int bufferOffset;
/*  39 */   private final State state = new State();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BrotliInputStream(InputStream source) throws IOException {
/*  53 */     this(source, 16384, null);
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
/*     */   public BrotliInputStream(InputStream source, int byteReadBufferSize) throws IOException {
/*  70 */     this(source, byteReadBufferSize, null);
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
/*     */   public BrotliInputStream(InputStream source, int byteReadBufferSize, byte[] customDictionary) throws IOException {
/*  89 */     if (byteReadBufferSize <= 0)
/*  90 */       throw new IllegalArgumentException("Bad buffer size:" + byteReadBufferSize); 
/*  91 */     if (source == null) {
/*  92 */       throw new IllegalArgumentException("source is null");
/*     */     }
/*  94 */     this.buffer = new byte[byteReadBufferSize];
/*  95 */     this.remainingBufferBytes = 0;
/*  96 */     this.bufferOffset = 0;
/*     */     try {
/*  98 */       State.setInput(this.state, source);
/*  99 */     } catch (BrotliRuntimeException ex) {
/* 100 */       throw new IOException("Brotli decoder initialization failed", ex);
/*     */     } 
/* 102 */     if (customDictionary != null) {
/* 103 */       Decode.setCustomDictionary(this.state, customDictionary);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 112 */     State.close(this.state);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int read() throws IOException {
/* 120 */     if (this.bufferOffset >= this.remainingBufferBytes) {
/* 121 */       this.remainingBufferBytes = read(this.buffer, 0, this.buffer.length);
/* 122 */       this.bufferOffset = 0;
/* 123 */       if (this.remainingBufferBytes == -1) {
/* 124 */         return -1;
/*     */       }
/*     */     } 
/* 127 */     return this.buffer[this.bufferOffset++] & 0xFF;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int read(byte[] destBuffer, int destOffset, int destLen) throws IOException {
/* 135 */     if (destOffset < 0)
/* 136 */       throw new IllegalArgumentException("Bad offset: " + destOffset); 
/* 137 */     if (destLen < 0)
/* 138 */       throw new IllegalArgumentException("Bad length: " + destLen); 
/* 139 */     if (destOffset + destLen > destBuffer.length) {
/* 140 */       throw new IllegalArgumentException("Buffer overflow: " + (destOffset + destLen) + " > " + destBuffer.length);
/*     */     }
/* 142 */     if (destLen == 0) {
/* 143 */       return 0;
/*     */     }
/* 145 */     int copyLen = Math.max(this.remainingBufferBytes - this.bufferOffset, 0);
/* 146 */     if (copyLen != 0) {
/* 147 */       copyLen = Math.min(copyLen, destLen);
/* 148 */       System.arraycopy(this.buffer, this.bufferOffset, destBuffer, destOffset, copyLen);
/* 149 */       this.bufferOffset += copyLen;
/* 150 */       destOffset += copyLen;
/* 151 */       destLen -= copyLen;
/* 152 */       if (destLen == 0) {
/* 153 */         return copyLen;
/*     */       }
/*     */     } 
/*     */     try {
/* 157 */       this.state.output = destBuffer;
/* 158 */       this.state.outputOffset = destOffset;
/* 159 */       this.state.outputLength = destLen;
/* 160 */       this.state.outputUsed = 0;
/* 161 */       Decode.decompress(this.state);
/* 162 */       if (this.state.outputUsed == 0) {
/* 163 */         return -1;
/*     */       }
/* 165 */       return this.state.outputUsed + copyLen;
/* 166 */     } catch (BrotliRuntimeException ex) {
/* 167 */       throw new IOException("Brotli stream decoding failed", ex);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\brotli\dec\BrotliInputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */