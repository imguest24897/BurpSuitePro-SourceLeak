/*     */ package com.install4j.runtime.installer.helper.content.apache.utils;
/*     */ 
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.Closeable;
/*     */ import java.io.EOFException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.channels.ReadableByteChannel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class IOUtils
/*     */ {
/*     */   private static final int COPY_BUF_SIZE = 8024;
/*     */   private static final int SKIP_BUF_SIZE = 4096;
/*  36 */   private static final byte[] SKIP_BUF = new byte[4096];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long copy(InputStream input, OutputStream output) throws IOException {
/*  55 */     return copy(input, output, 8024);
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
/*     */   public static long copy(InputStream input, OutputStream output, int buffersize) throws IOException {
/*  74 */     if (buffersize < 1) {
/*  75 */       throw new IllegalArgumentException("buffersize must be bigger than 0");
/*     */     }
/*  77 */     byte[] buffer = new byte[buffersize];
/*  78 */     int n = 0;
/*  79 */     long count = 0L;
/*  80 */     while (-1 != (n = input.read(buffer))) {
/*  81 */       output.write(buffer, 0, n);
/*  82 */       count += n;
/*     */     } 
/*  84 */     return count;
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
/*     */   public static long skip(InputStream input, long numToSkip) throws IOException {
/* 104 */     long available = numToSkip;
/* 105 */     while (numToSkip > 0L) {
/* 106 */       long skipped = input.skip(numToSkip);
/* 107 */       if (skipped == 0L) {
/*     */         break;
/*     */       }
/* 110 */       numToSkip -= skipped;
/*     */     } 
/*     */     
/* 113 */     while (numToSkip > 0L) {
/* 114 */       int read = readFully(input, SKIP_BUF, 0, 
/* 115 */           (int)Math.min(numToSkip, 4096L));
/* 116 */       if (read < 1) {
/*     */         break;
/*     */       }
/* 119 */       numToSkip -= read;
/*     */     } 
/* 121 */     return available - numToSkip;
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
/*     */   public static int readFully(InputStream input, byte[] b) throws IOException {
/* 137 */     return readFully(input, b, 0, b.length);
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
/*     */   public static int readFully(InputStream input, byte[] b, int offset, int len) throws IOException {
/* 158 */     if (len < 0 || offset < 0 || len + offset > b.length) {
/* 159 */       throw new IndexOutOfBoundsException();
/*     */     }
/* 161 */     int count = 0, x = 0;
/* 162 */     while (count != len) {
/* 163 */       x = input.read(b, offset + count, len - count);
/* 164 */       if (x == -1) {
/*     */         break;
/*     */       }
/* 167 */       count += x;
/*     */     } 
/* 169 */     return count;
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
/*     */   public static void readFully(ReadableByteChannel channel, ByteBuffer b) throws IOException {
/* 187 */     int expectedLength = b.remaining();
/* 188 */     int read = 0;
/* 189 */     while (read < expectedLength) {
/* 190 */       int readNow = channel.read(b);
/* 191 */       if (readNow <= 0) {
/*     */         break;
/*     */       }
/* 194 */       read += readNow;
/*     */     } 
/* 196 */     if (read < expectedLength) {
/* 197 */       throw new EOFException();
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
/*     */   public static byte[] toByteArray(InputStream input) throws IOException {
/* 220 */     ByteArrayOutputStream output = new ByteArrayOutputStream();
/* 221 */     copy(input, output);
/* 222 */     return output.toByteArray();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void closeQuietly(Closeable c) {
/* 231 */     if (c != null)
/*     */       try {
/* 233 */         c.close();
/* 234 */       } catch (IOException iOException) {} 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\apach\\utils\IOUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */