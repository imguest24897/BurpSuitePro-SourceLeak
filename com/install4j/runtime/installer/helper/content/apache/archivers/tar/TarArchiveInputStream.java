/*     */ package com.install4j.runtime.installer.helper.content.apache.archivers.tar;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.content.apache.archivers.ArchiveEntry;
/*     */ import com.install4j.runtime.installer.helper.content.apache.archivers.ArchiveInputStream;
/*     */ import com.install4j.runtime.installer.helper.content.apache.archivers.zip.ZipEncoding;
/*     */ import com.install4j.runtime.installer.helper.content.apache.archivers.zip.ZipEncodingHelper;
/*     */ import com.install4j.runtime.installer.helper.content.apache.utils.ArchiveUtils;
/*     */ import com.install4j.runtime.installer.helper.content.apache.utils.IOUtils;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
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
/*     */ public class TarArchiveInputStream
/*     */   extends ArchiveInputStream
/*     */ {
/*     */   private static final int SMALL_BUFFER_SIZE = 256;
/*  53 */   private final byte[] smallBuf = new byte[256];
/*     */ 
/*     */   
/*     */   private final int recordSize;
/*     */ 
/*     */   
/*     */   private final int blockSize;
/*     */ 
/*     */   
/*     */   private boolean hasHitEOF;
/*     */ 
/*     */   
/*     */   private long entrySize;
/*     */ 
/*     */   
/*     */   private long entryOffset;
/*     */ 
/*     */   
/*     */   private final InputStream is;
/*     */ 
/*     */   
/*     */   private TarArchiveEntry currEntry;
/*     */ 
/*     */   
/*     */   private final ZipEncoding zipEncoding;
/*     */ 
/*     */   
/*     */   final String encoding;
/*     */ 
/*     */   
/*  83 */   private Map<String, String> globalPaxHeaders = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TarArchiveInputStream(InputStream is) {
/*  90 */     this(is, 10240, 512);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TarArchiveInputStream(InputStream is, String encoding) {
/* 100 */     this(is, 10240, 512, encoding);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TarArchiveInputStream(InputStream is, int blockSize) {
/* 110 */     this(is, blockSize, 512);
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
/*     */   public TarArchiveInputStream(InputStream is, int blockSize, String encoding) {
/* 122 */     this(is, blockSize, 512, encoding);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TarArchiveInputStream(InputStream is, int blockSize, int recordSize) {
/* 132 */     this(is, blockSize, recordSize, (String)null);
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
/*     */   public TarArchiveInputStream(InputStream is, int blockSize, int recordSize, String encoding) {
/* 145 */     this.is = is;
/* 146 */     this.hasHitEOF = false;
/* 147 */     this.encoding = encoding;
/* 148 */     this.zipEncoding = ZipEncodingHelper.getZipEncoding(encoding);
/* 149 */     this.recordSize = recordSize;
/* 150 */     this.blockSize = blockSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 159 */     this.is.close();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getRecordSize() {
/* 168 */     return this.recordSize;
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
/*     */   public int available() throws IOException {
/* 185 */     if (isDirectory()) {
/* 186 */       return 0;
/*     */     }
/* 188 */     if (this.entrySize - this.entryOffset > 2147483647L) {
/* 189 */       return Integer.MAX_VALUE;
/*     */     }
/* 191 */     return (int)(this.entrySize - this.entryOffset);
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
/*     */   public long skip(long n) throws IOException {
/* 213 */     if (n <= 0L || isDirectory()) {
/* 214 */       return 0L;
/*     */     }
/*     */     
/* 217 */     long available = this.entrySize - this.entryOffset;
/* 218 */     long skipped = IOUtils.skip(this.is, Math.min(n, available));
/* 219 */     count(skipped);
/* 220 */     this.entryOffset += skipped;
/* 221 */     return skipped;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean markSupported() {
/* 231 */     return false;
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
/*     */   public void mark(int markLimit) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void reset() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TarArchiveEntry getNextTarEntry() throws IOException {
/* 264 */     if (isAtEOF()) {
/* 265 */       return null;
/*     */     }
/*     */     
/* 268 */     if (this.currEntry != null) {
/*     */       
/* 270 */       IOUtils.skip((InputStream)this, Long.MAX_VALUE);
/*     */ 
/*     */       
/* 273 */       skipRecordPadding();
/*     */     } 
/*     */     
/* 276 */     byte[] headerBuf = getRecord();
/*     */     
/* 278 */     if (headerBuf == null) {
/*     */       
/* 280 */       this.currEntry = null;
/* 281 */       return null;
/*     */     } 
/*     */     
/*     */     try {
/* 285 */       this.currEntry = new TarArchiveEntry(headerBuf, this.zipEncoding);
/* 286 */     } catch (IllegalArgumentException e) {
/* 287 */       throw new IOException("Error detected parsing the header", e);
/*     */     } 
/*     */     
/* 290 */     this.entryOffset = 0L;
/* 291 */     this.entrySize = this.currEntry.getSize();
/*     */     
/* 293 */     if (this.currEntry.isGNULongLinkEntry()) {
/* 294 */       byte[] longLinkData = getLongNameData();
/* 295 */       if (longLinkData == null)
/*     */       {
/*     */ 
/*     */         
/* 299 */         return null;
/*     */       }
/* 301 */       this.currEntry.setLinkName(this.zipEncoding.decode(longLinkData));
/*     */     } 
/*     */     
/* 304 */     if (this.currEntry.isGNULongNameEntry()) {
/* 305 */       byte[] longNameData = getLongNameData();
/* 306 */       if (longNameData == null)
/*     */       {
/*     */ 
/*     */         
/* 310 */         return null;
/*     */       }
/* 312 */       this.currEntry.setName(this.zipEncoding.decode(longNameData));
/*     */     } 
/*     */     
/* 315 */     if (this.currEntry.isGlobalPaxHeader()) {
/* 316 */       readGlobalPaxHeaders();
/*     */     }
/*     */     
/* 319 */     if (this.currEntry.isPaxHeader()) {
/* 320 */       paxHeaders();
/* 321 */     } else if (!this.globalPaxHeaders.isEmpty()) {
/* 322 */       applyPaxHeadersToCurrentEntry(this.globalPaxHeaders);
/*     */     } 
/*     */     
/* 325 */     if (this.currEntry.isOldGNUSparse()) {
/* 326 */       readOldGNUSparse();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 333 */     this.entrySize = this.currEntry.getSize();
/*     */     
/* 335 */     return this.currEntry;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void skipRecordPadding() throws IOException {
/* 343 */     if (!isDirectory() && this.entrySize > 0L && this.entrySize % this.recordSize != 0L) {
/* 344 */       long numRecords = this.entrySize / this.recordSize + 1L;
/* 345 */       long padding = numRecords * this.recordSize - this.entrySize;
/* 346 */       long skipped = IOUtils.skip(this.is, padding);
/* 347 */       count(skipped);
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
/*     */   protected byte[] getLongNameData() throws IOException {
/* 359 */     ByteArrayOutputStream longName = new ByteArrayOutputStream();
/* 360 */     int length = 0;
/* 361 */     while ((length = read(this.smallBuf)) >= 0) {
/* 362 */       longName.write(this.smallBuf, 0, length);
/*     */     }
/* 364 */     getNextEntry();
/* 365 */     if (this.currEntry == null)
/*     */     {
/*     */       
/* 368 */       return null;
/*     */     }
/* 370 */     byte[] longNameData = longName.toByteArray();
/*     */     
/* 372 */     length = longNameData.length;
/* 373 */     while (length > 0 && longNameData[length - 1] == 0) {
/* 374 */       length--;
/*     */     }
/* 376 */     if (length != longNameData.length) {
/* 377 */       byte[] l = new byte[length];
/* 378 */       System.arraycopy(longNameData, 0, l, 0, length);
/* 379 */       longNameData = l;
/*     */     } 
/* 381 */     return longNameData;
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
/*     */   private byte[] getRecord() throws IOException {
/* 399 */     byte[] headerBuf = readRecord();
/* 400 */     setAtEOF(isEOFRecord(headerBuf));
/* 401 */     if (isAtEOF() && headerBuf != null) {
/* 402 */       tryToConsumeSecondEOFRecord();
/* 403 */       consumeRemainderOfLastBlock();
/* 404 */       headerBuf = null;
/*     */     } 
/* 406 */     return headerBuf;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean isEOFRecord(byte[] record) {
/* 417 */     return (record == null || ArchiveUtils.isArrayZero(record, this.recordSize));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected byte[] readRecord() throws IOException {
/* 428 */     byte[] record = new byte[this.recordSize];
/*     */     
/* 430 */     int readNow = IOUtils.readFully(this.is, record);
/* 431 */     count(readNow);
/* 432 */     if (readNow != this.recordSize) {
/* 433 */       return null;
/*     */     }
/*     */     
/* 436 */     return record;
/*     */   }
/*     */   
/*     */   private void readGlobalPaxHeaders() throws IOException {
/* 440 */     this.globalPaxHeaders = parsePaxHeaders((InputStream)this);
/* 441 */     getNextEntry();
/*     */   }
/*     */   
/*     */   private void paxHeaders() throws IOException {
/* 445 */     Map<String, String> headers = parsePaxHeaders((InputStream)this);
/* 446 */     getNextEntry();
/* 447 */     applyPaxHeadersToCurrentEntry(headers);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   Map<String, String> parsePaxHeaders(InputStream i) throws IOException {
/*     */     int ch;
/* 455 */     Map<String, String> headers = new HashMap<>(this.globalPaxHeaders);
/*     */ 
/*     */     
/*     */     do {
/* 459 */       int len = 0;
/* 460 */       int read = 0;
/* 461 */       while ((ch = i.read()) != -1) {
/* 462 */         read++;
/* 463 */         if (ch == 10)
/*     */           break; 
/* 465 */         if (ch == 32) {
/*     */           
/* 467 */           ByteArrayOutputStream coll = new ByteArrayOutputStream();
/* 468 */           while ((ch = i.read()) != -1) {
/* 469 */             read++;
/* 470 */             if (ch == 61) {
/* 471 */               String keyword = coll.toString("UTF-8");
/*     */               
/* 473 */               int restLen = len - read;
/* 474 */               if (restLen == 1) {
/* 475 */                 headers.remove(keyword); break;
/*     */               } 
/* 477 */               byte[] rest = new byte[restLen];
/* 478 */               int got = IOUtils.readFully(i, rest);
/* 479 */               if (got != restLen) {
/* 480 */                 throw new IOException("Failed to read Paxheader. Expected " + restLen + " bytes, read " + got);
/*     */               }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 487 */               String value = new String(rest, 0, restLen - 1, StandardCharsets.UTF_8);
/*     */               
/* 489 */               headers.put(keyword, value);
/*     */               
/*     */               break;
/*     */             } 
/* 493 */             coll.write((byte)ch);
/*     */           } 
/*     */           break;
/*     */         } 
/* 497 */         len *= 10;
/* 498 */         len += ch - 48;
/*     */       } 
/* 500 */     } while (ch != -1);
/*     */ 
/*     */ 
/*     */     
/* 504 */     return headers;
/*     */   }
/*     */   
/*     */   private void applyPaxHeadersToCurrentEntry(Map<String, String> headers) {
/* 508 */     this.currEntry.updateEntryFromPaxHeaders(headers);
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
/*     */   private void readOldGNUSparse() throws IOException {
/* 525 */     if (this.currEntry.isExtended()) {
/*     */       TarArchiveSparseEntry entry;
/*     */       do {
/* 528 */         byte[] headerBuf = getRecord();
/* 529 */         if (headerBuf == null) {
/* 530 */           this.currEntry = null;
/*     */           break;
/*     */         } 
/* 533 */         entry = new TarArchiveSparseEntry(headerBuf);
/*     */ 
/*     */       
/*     */       }
/* 537 */       while (entry.isExtended());
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean isDirectory() {
/* 542 */     return (this.currEntry != null && this.currEntry.isDirectory());
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
/*     */   public ArchiveEntry getNextEntry() throws IOException {
/* 554 */     return getNextTarEntry();
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
/*     */   private void tryToConsumeSecondEOFRecord() throws IOException {
/* 568 */     boolean shouldReset = true;
/* 569 */     boolean marked = this.is.markSupported();
/* 570 */     if (marked) {
/* 571 */       this.is.mark(this.recordSize);
/*     */     }
/*     */     try {
/* 574 */       shouldReset = !isEOFRecord(readRecord());
/*     */     } finally {
/* 576 */       if (shouldReset && marked) {
/* 577 */         pushedBackBytes(this.recordSize);
/* 578 */         this.is.reset();
/*     */       } 
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
/*     */   public int read(@NotNull byte[] buf, int offset, int numToRead) throws IOException {
/* 598 */     int totalRead = 0;
/*     */     
/* 600 */     if (isAtEOF() || isDirectory() || this.entryOffset >= this.entrySize) {
/* 601 */       return -1;
/*     */     }
/*     */     
/* 604 */     if (this.currEntry == null) {
/* 605 */       throw new IllegalStateException("No current tar entry");
/*     */     }
/*     */     
/* 608 */     numToRead = Math.min(numToRead, available());
/*     */     
/* 610 */     totalRead = this.is.read(buf, offset, numToRead);
/*     */     
/* 612 */     if (totalRead == -1) {
/* 613 */       if (numToRead > 0) {
/* 614 */         throw new IOException("Truncated TAR archive");
/*     */       }
/* 616 */       setAtEOF(true);
/*     */     } else {
/* 618 */       count(totalRead);
/* 619 */       this.entryOffset += totalRead;
/*     */     } 
/*     */     
/* 622 */     return totalRead;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canReadEntryData(ArchiveEntry ae) {
/* 632 */     if (ae instanceof TarArchiveEntry) {
/* 633 */       TarArchiveEntry te = (TarArchiveEntry)ae;
/* 634 */       return !te.isSparse();
/*     */     } 
/* 636 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TarArchiveEntry getCurrentEntry() {
/* 645 */     return this.currEntry;
/*     */   }
/*     */   
/*     */   protected final void setCurrentEntry(TarArchiveEntry e) {
/* 649 */     this.currEntry = e;
/*     */   }
/*     */   
/*     */   protected final boolean isAtEOF() {
/* 653 */     return this.hasHitEOF;
/*     */   }
/*     */   
/*     */   protected final void setAtEOF(boolean b) {
/* 657 */     this.hasHitEOF = b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void consumeRemainderOfLastBlock() throws IOException {
/* 666 */     long bytesReadOfLastBlock = getBytesRead() % this.blockSize;
/* 667 */     if (bytesReadOfLastBlock > 0L) {
/* 668 */       long skipped = IOUtils.skip(this.is, this.blockSize - bytesReadOfLastBlock);
/* 669 */       count(skipped);
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
/*     */   public static boolean matches(byte[] signature, int length) {
/* 683 */     if (length < 265) {
/* 684 */       return false;
/*     */     }
/*     */     
/* 687 */     if (ArchiveUtils.matchAsciiBuffer("ustar\000", signature, 257, 6) && 
/*     */ 
/*     */       
/* 690 */       ArchiveUtils.matchAsciiBuffer("00", signature, 263, 2))
/*     */     {
/*     */       
/* 693 */       return true;
/*     */     }
/* 695 */     if (ArchiveUtils.matchAsciiBuffer("ustar ", signature, 257, 6) && (
/*     */ 
/*     */ 
/*     */       
/* 699 */       ArchiveUtils.matchAsciiBuffer(" \000", signature, 263, 2) || 
/*     */ 
/*     */       
/* 702 */       ArchiveUtils.matchAsciiBuffer("0\000", signature, 263, 2)))
/*     */     {
/*     */ 
/*     */       
/* 706 */       return true;
/*     */     }
/*     */     
/* 709 */     return (ArchiveUtils.matchAsciiBuffer("ustar\000", signature, 257, 6) && 
/*     */ 
/*     */       
/* 712 */       ArchiveUtils.matchAsciiBuffer("\000\000", signature, 263, 2));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\apache\archivers\tar\TarArchiveInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */