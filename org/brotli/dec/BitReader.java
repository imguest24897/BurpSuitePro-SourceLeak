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
/*     */ final class BitReader
/*     */ {
/*     */   private static final int CAPACITY = 1024;
/*     */   private static final int SLACK = 16;
/*     */   private static final int INT_BUFFER_SIZE = 1040;
/*     */   private static final int BYTE_READ_SIZE = 4096;
/*     */   private static final int BYTE_BUFFER_SIZE = 4160;
/*  27 */   private final byte[] byteBuffer = new byte[4160];
/*  28 */   private final int[] intBuffer = new int[1040];
/*  29 */   private final IntReader intReader = new IntReader();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private InputStream input;
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean endOfStreamReached;
/*     */ 
/*     */ 
/*     */   
/*     */   long accumulator;
/*     */ 
/*     */ 
/*     */   
/*     */   int bitOffset;
/*     */ 
/*     */ 
/*     */   
/*     */   private int intOffset;
/*     */ 
/*     */ 
/*     */   
/*  54 */   private int tailBytes = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void readMoreInput(BitReader br) {
/*  66 */     if (br.intOffset <= 1015) {
/*     */       return;
/*     */     }
/*  69 */     if (br.endOfStreamReached) {
/*  70 */       if (intAvailable(br) >= -2) {
/*     */         return;
/*     */       }
/*  73 */       throw new BrotliRuntimeException("No more input");
/*     */     } 
/*  75 */     int readOffset = br.intOffset << 2;
/*  76 */     int bytesRead = 4096 - readOffset;
/*  77 */     System.arraycopy(br.byteBuffer, readOffset, br.byteBuffer, 0, bytesRead);
/*  78 */     br.intOffset = 0;
/*     */     try {
/*  80 */       while (bytesRead < 4096) {
/*  81 */         int len = br.input.read(br.byteBuffer, bytesRead, 4096 - bytesRead);
/*     */         
/*  83 */         if (len <= 0) {
/*  84 */           br.endOfStreamReached = true;
/*  85 */           br.tailBytes = bytesRead;
/*  86 */           bytesRead += 3;
/*     */           break;
/*     */         } 
/*  89 */         bytesRead += len;
/*     */       } 
/*  91 */     } catch (IOException e) {
/*  92 */       throw new BrotliRuntimeException("Failed to read input", e);
/*     */     } 
/*  94 */     IntReader.convert(br.intReader, bytesRead >> 2);
/*     */   }
/*     */   
/*     */   static void checkHealth(BitReader br, boolean endOfStream) {
/*  98 */     if (!br.endOfStreamReached) {
/*     */       return;
/*     */     }
/* 101 */     int byteOffset = (br.intOffset << 2) + (br.bitOffset + 7 >> 3) - 8;
/* 102 */     if (byteOffset > br.tailBytes) {
/* 103 */       throw new BrotliRuntimeException("Read after end");
/*     */     }
/* 105 */     if (endOfStream && byteOffset != br.tailBytes) {
/* 106 */       throw new BrotliRuntimeException("Unused bytes after end");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void fillBitWindow(BitReader br) {
/* 114 */     if (br.bitOffset >= 32) {
/* 115 */       br.accumulator = br.intBuffer[br.intOffset++] << 32L | br.accumulator >>> 32L;
/* 116 */       br.bitOffset -= 32;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static int readBits(BitReader br, int n) {
/* 124 */     fillBitWindow(br);
/* 125 */     int val = (int)(br.accumulator >>> br.bitOffset) & (1 << n) - 1;
/* 126 */     br.bitOffset += n;
/* 127 */     return val;
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
/*     */   static void init(BitReader br, InputStream input) {
/* 140 */     if (br.input != null) {
/* 141 */       throw new IllegalStateException("Bit reader already has associated input stream");
/*     */     }
/* 143 */     IntReader.init(br.intReader, br.byteBuffer, br.intBuffer);
/* 144 */     br.input = input;
/* 145 */     br.accumulator = 0L;
/* 146 */     br.bitOffset = 64;
/* 147 */     br.intOffset = 1024;
/* 148 */     br.endOfStreamReached = false;
/* 149 */     prepare(br);
/*     */   }
/*     */   
/*     */   private static void prepare(BitReader br) {
/* 153 */     readMoreInput(br);
/* 154 */     checkHealth(br, false);
/* 155 */     fillBitWindow(br);
/* 156 */     fillBitWindow(br);
/*     */   }
/*     */   
/*     */   static void reload(BitReader br) {
/* 160 */     if (br.bitOffset == 64) {
/* 161 */       prepare(br);
/*     */     }
/*     */   }
/*     */   
/*     */   static void close(BitReader br) throws IOException {
/* 166 */     InputStream is = br.input;
/* 167 */     br.input = null;
/* 168 */     if (is != null) {
/* 169 */       is.close();
/*     */     }
/*     */   }
/*     */   
/*     */   static void jumpToByteBoundary(BitReader br) {
/* 174 */     int padding = 64 - br.bitOffset & 0x7;
/* 175 */     if (padding != 0) {
/* 176 */       int paddingBits = readBits(br, padding);
/* 177 */       if (paddingBits != 0) {
/* 178 */         throw new BrotliRuntimeException("Corrupted padding bits");
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   static int intAvailable(BitReader br) {
/* 184 */     int limit = 1024;
/* 185 */     if (br.endOfStreamReached) {
/* 186 */       limit = br.tailBytes + 3 >> 2;
/*     */     }
/* 188 */     return limit - br.intOffset;
/*     */   }
/*     */   
/*     */   static void copyBytes(BitReader br, byte[] data, int offset, int length) {
/* 192 */     if ((br.bitOffset & 0x7) != 0) {
/* 193 */       throw new BrotliRuntimeException("Unaligned copyBytes");
/*     */     }
/*     */ 
/*     */     
/* 197 */     while (br.bitOffset != 64 && length != 0) {
/* 198 */       data[offset++] = (byte)(int)(br.accumulator >>> br.bitOffset);
/* 199 */       br.bitOffset += 8;
/* 200 */       length--;
/*     */     } 
/* 202 */     if (length == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 207 */     int copyInts = Math.min(intAvailable(br), length >> 2);
/* 208 */     if (copyInts > 0) {
/* 209 */       int readOffset = br.intOffset << 2;
/* 210 */       System.arraycopy(br.byteBuffer, readOffset, data, offset, copyInts << 2);
/* 211 */       offset += copyInts << 2;
/* 212 */       length -= copyInts << 2;
/* 213 */       br.intOffset += copyInts;
/*     */     } 
/* 215 */     if (length == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 220 */     if (intAvailable(br) > 0) {
/*     */       
/* 222 */       fillBitWindow(br);
/* 223 */       while (length != 0) {
/* 224 */         data[offset++] = (byte)(int)(br.accumulator >>> br.bitOffset);
/* 225 */         br.bitOffset += 8;
/* 226 */         length--;
/*     */       } 
/* 228 */       checkHealth(br, false);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*     */     try {
/* 234 */       while (length > 0) {
/* 235 */         int len = br.input.read(data, offset, length);
/* 236 */         if (len == -1) {
/* 237 */           throw new BrotliRuntimeException("Unexpected end of input");
/*     */         }
/* 239 */         offset += len;
/* 240 */         length -= len;
/*     */       } 
/* 242 */     } catch (IOException e) {
/* 243 */       throw new BrotliRuntimeException("Failed to read input", e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\brotli\dec\BitReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */