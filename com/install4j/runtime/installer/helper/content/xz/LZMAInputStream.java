/*     */ package com.install4j.runtime.installer.helper.content.xz;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.content.xz.lz.LZDecoder;
/*     */ import com.install4j.runtime.installer.helper.content.xz.lzma.LZMADecoder;
/*     */ import com.install4j.runtime.installer.helper.content.xz.rangecoder.RangeDecoder;
/*     */ import com.install4j.runtime.installer.helper.content.xz.rangecoder.RangeDecoderFromStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LZMAInputStream
/*     */   extends InputStream
/*     */ {
/*     */   public static final int DICT_SIZE_MAX = 2147483632;
/*     */   private InputStream in;
/*     */   private ArrayCache arrayCache;
/*     */   private LZDecoder lz;
/*     */   private RangeDecoderFromStream rc;
/*     */   private LZMADecoder lzma;
/*     */   private boolean endReached = false;
/*  59 */   private final byte[] tempBuf = new byte[1];
/*     */ 
/*     */ 
/*     */   
/*     */   private long remainingSize;
/*     */ 
/*     */ 
/*     */   
/*  67 */   private IOException exception = null;
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
/*     */   public static int getMemoryUsage(int dictSize, byte propsByte) throws UnsupportedOptionsException, CorruptedInputException {
/*  92 */     if (dictSize < 0 || dictSize > 2147483632) {
/*  93 */       throw new UnsupportedOptionsException("LZMA dictionary is too big for this implementation");
/*     */     }
/*     */     
/*  96 */     int props = propsByte & 0xFF;
/*  97 */     if (props > 224) {
/*  98 */       throw new CorruptedInputException("Invalid LZMA properties byte");
/*     */     }
/* 100 */     props %= 45;
/* 101 */     int lp = props / 9;
/* 102 */     int lc = props - lp * 9;
/*     */     
/* 104 */     return getMemoryUsage(dictSize, lc, lp);
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
/*     */   public static int getMemoryUsage(int dictSize, int lc, int lp) {
/* 124 */     if (lc < 0 || lc > 8 || lp < 0 || lp > 4) {
/* 125 */       throw new IllegalArgumentException("Invalid lc or lp");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     return 10 + getDictSize(dictSize) / 1024 + (1536 << lc + lp) / 1024;
/*     */   }
/*     */ 
/*     */   
/*     */   private static int getDictSize(int dictSize) {
/* 139 */     if (dictSize < 0 || dictSize > 2147483632) {
/* 140 */       throw new IllegalArgumentException("LZMA dictionary is too big for this implementation");
/*     */     }
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
/* 153 */     if (dictSize < 4096) {
/* 154 */       dictSize = 4096;
/*     */     }
/*     */ 
/*     */     
/* 158 */     return dictSize + 15 & 0xFFFFFFF0;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LZMAInputStream(InputStream in) throws IOException {
/* 185 */     this(in, -1);
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
/*     */   public LZMAInputStream(InputStream in, ArrayCache arrayCache) throws IOException {
/* 221 */     this(in, -1, arrayCache);
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
/*     */   public LZMAInputStream(InputStream in, int memoryLimit) throws IOException {
/* 256 */     this(in, memoryLimit, ArrayCache.getDefaultCache());
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
/*     */   public LZMAInputStream(InputStream in, int memoryLimit, ArrayCache arrayCache) throws IOException {
/* 298 */     DataInputStream inData = new DataInputStream(in);
/*     */ 
/*     */     
/* 301 */     byte propsByte = inData.readByte();
/*     */ 
/*     */     
/* 304 */     int dictSize = 0;
/* 305 */     for (int i = 0; i < 4; i++) {
/* 306 */       dictSize |= inData.readUnsignedByte() << 8 * i;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 312 */     long uncompSize = 0L;
/* 313 */     for (int j = 0; j < 8; j++) {
/* 314 */       uncompSize |= inData.readUnsignedByte() << 8 * j;
/*     */     }
/*     */     
/* 317 */     int memoryNeeded = getMemoryUsage(dictSize, propsByte);
/* 318 */     if (memoryLimit != -1 && memoryNeeded > memoryLimit) {
/* 319 */       throw new MemoryLimitException(memoryNeeded, memoryLimit);
/*     */     }
/* 321 */     initialize(in, uncompSize, propsByte, dictSize, null, arrayCache);
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
/*     */   public LZMAInputStream(InputStream in, long uncompSize, byte propsByte, int dictSize) throws IOException {
/* 372 */     initialize(in, uncompSize, propsByte, dictSize, null, 
/* 373 */         ArrayCache.getDefaultCache());
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
/*     */   public LZMAInputStream(InputStream in, long uncompSize, byte propsByte, int dictSize, byte[] presetDict) throws IOException {
/* 411 */     initialize(in, uncompSize, propsByte, dictSize, presetDict, 
/* 412 */         ArrayCache.getDefaultCache());
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
/*     */   public LZMAInputStream(InputStream in, long uncompSize, byte propsByte, int dictSize, byte[] presetDict, ArrayCache arrayCache) throws IOException {
/* 459 */     initialize(in, uncompSize, propsByte, dictSize, presetDict, arrayCache);
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
/*     */   public LZMAInputStream(InputStream in, long uncompSize, int lc, int lp, int pb, int dictSize, byte[] presetDict) throws IOException {
/* 499 */     initialize(in, uncompSize, lc, lp, pb, dictSize, presetDict, 
/* 500 */         ArrayCache.getDefaultCache());
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
/*     */   public LZMAInputStream(InputStream in, long uncompSize, int lc, int lp, int pb, int dictSize, byte[] presetDict, ArrayCache arrayCache) throws IOException {
/* 548 */     initialize(in, uncompSize, lc, lp, pb, dictSize, presetDict, arrayCache);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initialize(InputStream in, long uncompSize, byte propsByte, int dictSize, byte[] presetDict, ArrayCache arrayCache) throws IOException {
/* 558 */     if (uncompSize < -1L) {
/* 559 */       throw new UnsupportedOptionsException("Uncompressed size is too big");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 564 */     int props = propsByte & 0xFF;
/* 565 */     if (props > 224) {
/* 566 */       throw new CorruptedInputException("Invalid LZMA properties byte");
/*     */     }
/* 568 */     int pb = props / 45;
/* 569 */     props -= pb * 9 * 5;
/* 570 */     int lp = props / 9;
/* 571 */     int lc = props - lp * 9;
/*     */ 
/*     */ 
/*     */     
/* 575 */     if (dictSize < 0 || dictSize > 2147483632) {
/* 576 */       throw new UnsupportedOptionsException("LZMA dictionary is too big for this implementation");
/*     */     }
/*     */     
/* 579 */     initialize(in, uncompSize, lc, lp, pb, dictSize, presetDict, arrayCache);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initialize(InputStream in, long uncompSize, int lc, int lp, int pb, int dictSize, byte[] presetDict, ArrayCache arrayCache) throws IOException {
/* 590 */     if (uncompSize < -1L || lc < 0 || lc > 8 || lp < 0 || lp > 4 || pb < 0 || pb > 4)
/*     */     {
/* 592 */       throw new IllegalArgumentException();
/*     */     }
/* 594 */     this.in = in;
/* 595 */     this.arrayCache = arrayCache;
/*     */ 
/*     */ 
/*     */     
/* 599 */     dictSize = getDictSize(dictSize);
/* 600 */     if (uncompSize >= 0L && dictSize > uncompSize) {
/* 601 */       dictSize = getDictSize((int)uncompSize);
/*     */     }
/* 603 */     this.lz = new LZDecoder(getDictSize(dictSize), presetDict, arrayCache);
/* 604 */     this.rc = new RangeDecoderFromStream(in);
/* 605 */     this.lzma = new LZMADecoder(this.lz, (RangeDecoder)this.rc, lc, lp, pb);
/*     */     
/* 607 */     this.remainingSize = uncompSize;
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
/*     */ 
/*     */   
/*     */   public int read() throws IOException {
/* 631 */     return (read(this.tempBuf, 0, 1) == -1) ? -1 : (this.tempBuf[0] & 0xFF);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int read(@NotNull byte[] buf, int off, int len) throws IOException {
/* 659 */     if (off < 0 || len < 0 || off + len < 0 || off + len > buf.length) {
/* 660 */       throw new IndexOutOfBoundsException();
/*     */     }
/* 662 */     if (len == 0) {
/* 663 */       return 0;
/*     */     }
/* 665 */     if (this.in == null) {
/* 666 */       throw new XZIOException("Stream closed");
/*     */     }
/* 668 */     if (this.exception != null) {
/* 669 */       throw this.exception;
/*     */     }
/* 671 */     if (this.endReached) {
/* 672 */       return -1;
/*     */     }
/*     */     try {
/* 675 */       int size = 0;
/*     */       
/* 677 */       while (len > 0) {
/*     */ 
/*     */ 
/*     */         
/* 681 */         int copySizeMax = len;
/* 682 */         if (this.remainingSize >= 0L && this.remainingSize < len) {
/* 683 */           copySizeMax = (int)this.remainingSize;
/*     */         }
/* 685 */         this.lz.setLimit(copySizeMax);
/*     */ 
/*     */         
/*     */         try {
/* 689 */           this.lzma.decode();
/* 690 */         } catch (CorruptedInputException e) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 695 */           if (this.remainingSize != -1L || !this.lzma.endMarkerDetected()) {
/* 696 */             throw e;
/*     */           }
/* 698 */           this.endReached = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 704 */           this.rc.normalize();
/*     */         } 
/*     */ 
/*     */         
/* 708 */         int copiedSize = this.lz.flush(buf, off);
/* 709 */         off += copiedSize;
/* 710 */         len -= copiedSize;
/* 711 */         size += copiedSize;
/*     */         
/* 713 */         if (this.remainingSize >= 0L) {
/*     */           
/* 715 */           this.remainingSize -= copiedSize;
/* 716 */           assert this.remainingSize >= 0L;
/*     */           
/* 718 */           if (this.remainingSize == 0L) {
/* 719 */             this.endReached = true;
/*     */           }
/*     */         } 
/* 722 */         if (this.endReached) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 727 */           if (!this.rc.isFinished() || this.lz.hasPending()) {
/* 728 */             throw new CorruptedInputException();
/*     */           }
/* 730 */           putArraysToCache();
/* 731 */           return (size == 0) ? -1 : size;
/*     */         } 
/*     */       } 
/*     */       
/* 735 */       return size;
/*     */     }
/* 737 */     catch (IOException e) {
/* 738 */       this.exception = e;
/* 739 */       throw e;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void putArraysToCache() {
/* 744 */     if (this.lz != null) {
/* 745 */       this.lz.putArraysToCache(this.arrayCache);
/* 746 */       this.lz = null;
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
/*     */   public void close() throws IOException {
/* 758 */     if (this.in != null) {
/* 759 */       putArraysToCache();
/*     */       
/*     */       try {
/* 762 */         this.in.close();
/*     */       } finally {
/* 764 */         this.in = null;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\xz\LZMAInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */