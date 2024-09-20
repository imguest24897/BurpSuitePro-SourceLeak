/*     */ package com.install4j.runtime.installer.helper.content.apache.archivers.zip;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.CharBuffer;
/*     */ import java.nio.charset.Charset;
/*     */ import java.nio.charset.CharsetDecoder;
/*     */ import java.nio.charset.CharsetEncoder;
/*     */ import java.nio.charset.CoderResult;
/*     */ import java.nio.charset.CodingErrorAction;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class NioZipEncoding
/*     */   implements ZipEncoding, CharsetAccessor
/*     */ {
/*     */   private final Charset charset;
/*     */   private final boolean useReplacement;
/*     */   private static final char REPLACEMENT = '?';
/*  38 */   private static final byte[] REPLACEMENT_BYTES = new byte[] { 63 };
/*  39 */   private static final String REPLACEMENT_STRING = String.valueOf('?');
/*  40 */   private static final char[] HEX_CHARS = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   NioZipEncoding(Charset charset, boolean useReplacement) {
/*  51 */     this.charset = charset;
/*  52 */     this.useReplacement = useReplacement;
/*     */   }
/*     */ 
/*     */   
/*     */   public Charset getCharset() {
/*  57 */     return this.charset;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canEncode(String name) {
/*  65 */     CharsetEncoder enc = newEncoder();
/*     */     
/*  67 */     return enc.canEncode(name);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ByteBuffer encode(String name) {
/*  75 */     CharsetEncoder enc = newEncoder();
/*     */     
/*  77 */     CharBuffer cb = CharBuffer.wrap(name);
/*  78 */     CharBuffer tmp = null;
/*  79 */     ByteBuffer out = ByteBuffer.allocate(estimateInitialBufferSize(enc, cb.remaining()));
/*     */     
/*  81 */     while (cb.remaining() > 0) {
/*  82 */       CoderResult res = enc.encode(cb, out, false);
/*     */       
/*  84 */       if (res.isUnmappable() || res.isMalformed()) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  89 */         int spaceForSurrogate = estimateIncrementalEncodingSize(enc, 6 * res.length());
/*  90 */         if (spaceForSurrogate > out.remaining()) {
/*     */ 
/*     */ 
/*     */           
/*  94 */           int charCount = 0;
/*  95 */           for (int j = cb.position(); j < cb.limit(); j++) {
/*  96 */             charCount += !enc.canEncode(cb.get(j)) ? 6 : 1;
/*     */           }
/*  98 */           int totalExtraSpace = estimateIncrementalEncodingSize(enc, charCount);
/*  99 */           out = ZipEncodingHelper.growBufferBy(out, totalExtraSpace - out.remaining());
/*     */         } 
/* 101 */         if (tmp == null) {
/* 102 */           tmp = CharBuffer.allocate(6);
/*     */         }
/* 104 */         for (int i = 0; i < res.length(); i++)
/* 105 */           out = encodeFully(enc, encodeSurrogate(tmp, cb.get()), out); 
/*     */         continue;
/*     */       } 
/* 108 */       if (res.isOverflow()) {
/* 109 */         int increment = estimateIncrementalEncodingSize(enc, cb.remaining());
/* 110 */         out = ZipEncodingHelper.growBufferBy(out, increment);
/*     */       } 
/*     */     } 
/*     */     
/* 114 */     enc.encode(cb, out, true);
/*     */ 
/*     */     
/* 117 */     out.limit(out.position());
/* 118 */     out.rewind();
/* 119 */     return out;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String decode(byte[] data) throws IOException {
/* 128 */     return newDecoder()
/* 129 */       .decode(ByteBuffer.wrap(data)).toString();
/*     */   }
/*     */   
/*     */   private static ByteBuffer encodeFully(CharsetEncoder enc, CharBuffer cb, ByteBuffer out) {
/* 133 */     ByteBuffer o = out;
/* 134 */     while (cb.hasRemaining()) {
/* 135 */       CoderResult result = enc.encode(cb, o, false);
/* 136 */       if (result.isOverflow()) {
/* 137 */         int increment = estimateIncrementalEncodingSize(enc, cb.remaining());
/* 138 */         o = ZipEncodingHelper.growBufferBy(o, increment);
/*     */       } 
/*     */     } 
/* 141 */     return o;
/*     */   }
/*     */   
/*     */   private static CharBuffer encodeSurrogate(CharBuffer cb, char c) {
/* 145 */     cb.position(0).limit(6);
/* 146 */     cb.put('%');
/* 147 */     cb.put('U');
/*     */     
/* 149 */     cb.put(HEX_CHARS[c >> 12 & 0xF]);
/* 150 */     cb.put(HEX_CHARS[c >> 8 & 0xF]);
/* 151 */     cb.put(HEX_CHARS[c >> 4 & 0xF]);
/* 152 */     cb.put(HEX_CHARS[c & 0xF]);
/* 153 */     cb.flip();
/* 154 */     return cb;
/*     */   }
/*     */   
/*     */   private CharsetEncoder newEncoder() {
/* 158 */     if (this.useReplacement) {
/* 159 */       return this.charset.newEncoder()
/* 160 */         .onMalformedInput(CodingErrorAction.REPLACE)
/* 161 */         .onUnmappableCharacter(CodingErrorAction.REPLACE)
/* 162 */         .replaceWith(REPLACEMENT_BYTES);
/*     */     }
/* 164 */     return this.charset.newEncoder()
/* 165 */       .onMalformedInput(CodingErrorAction.REPORT)
/* 166 */       .onUnmappableCharacter(CodingErrorAction.REPORT);
/*     */   }
/*     */ 
/*     */   
/*     */   private CharsetDecoder newDecoder() {
/* 171 */     if (!this.useReplacement) {
/* 172 */       return this.charset.newDecoder()
/* 173 */         .onMalformedInput(CodingErrorAction.REPORT)
/* 174 */         .onUnmappableCharacter(CodingErrorAction.REPORT);
/*     */     }
/* 176 */     return this.charset.newDecoder()
/* 177 */       .onMalformedInput(CodingErrorAction.REPLACE)
/* 178 */       .onUnmappableCharacter(CodingErrorAction.REPLACE)
/* 179 */       .replaceWith(REPLACEMENT_STRING);
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
/*     */   private static int estimateInitialBufferSize(CharsetEncoder enc, int charChount) {
/* 196 */     float first = enc.maxBytesPerChar();
/* 197 */     float rest = (charChount - 1) * enc.averageBytesPerChar();
/* 198 */     return (int)Math.ceil((first + rest));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int estimateIncrementalEncodingSize(CharsetEncoder enc, int charCount) {
/* 209 */     return (int)Math.ceil((charCount * enc.averageBytesPerChar()));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\apache\archivers\zip\NioZipEncoding.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */