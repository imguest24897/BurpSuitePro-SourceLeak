/*     */ package com.twitter.hpack;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.util.Arrays;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Encoder
/*     */ {
/*     */   private static final int BUCKET_SIZE = 17;
/*  27 */   private static final byte[] EMPTY = new byte[0];
/*     */   
/*     */   private final boolean useIndexing;
/*     */   
/*     */   private final boolean forceHuffmanOn;
/*     */   
/*     */   private final boolean forceHuffmanOff;
/*     */   
/*  35 */   private final HeaderEntry[] headerFields = new HeaderEntry[17];
/*  36 */   private final HeaderEntry head = new HeaderEntry(-1, EMPTY, EMPTY, 2147483647, null);
/*     */   
/*     */   private int size;
/*     */   
/*     */   private int capacity;
/*     */ 
/*     */   
/*     */   public Encoder(int maxHeaderTableSize) {
/*  44 */     this(maxHeaderTableSize, true, false, false);
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
/*     */   Encoder(int maxHeaderTableSize, boolean useIndexing, boolean forceHuffmanOn, boolean forceHuffmanOff) {
/*  56 */     if (maxHeaderTableSize < 0) {
/*  57 */       throw new IllegalArgumentException("Illegal Capacity: " + maxHeaderTableSize);
/*     */     }
/*  59 */     this.useIndexing = useIndexing;
/*  60 */     this.forceHuffmanOn = forceHuffmanOn;
/*  61 */     this.forceHuffmanOff = forceHuffmanOff;
/*  62 */     this.capacity = maxHeaderTableSize;
/*  63 */     this.head.before = this.head.after = this.head;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void encodeHeader(OutputStream out, byte[] name, byte[] value, boolean sensitive) throws IOException {
/*  72 */     if (sensitive) {
/*  73 */       int nameIndex = getNameIndex(name);
/*  74 */       encodeLiteral(out, name, value, HpackUtil.IndexType.NEVER, nameIndex);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*  79 */     if (this.capacity == 0) {
/*  80 */       int staticTableIndex = StaticTable.getIndex(name, value);
/*  81 */       if (staticTableIndex == -1) {
/*  82 */         int nameIndex = StaticTable.getIndex(name);
/*  83 */         encodeLiteral(out, name, value, HpackUtil.IndexType.NONE, nameIndex);
/*     */       } else {
/*  85 */         encodeInteger(out, 128, 7, staticTableIndex);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/*  90 */     int headerSize = HeaderField.sizeOf(name, value);
/*     */ 
/*     */     
/*  93 */     if (headerSize > this.capacity) {
/*  94 */       int nameIndex = getNameIndex(name);
/*  95 */       encodeLiteral(out, name, value, HpackUtil.IndexType.NONE, nameIndex);
/*     */       
/*     */       return;
/*     */     } 
/*  99 */     HeaderEntry headerField = getEntry(name, value);
/* 100 */     if (headerField != null) {
/* 101 */       int index = getIndex(headerField.index) + StaticTable.length;
/*     */       
/* 103 */       encodeInteger(out, 128, 7, index);
/*     */     } else {
/* 105 */       int staticTableIndex = StaticTable.getIndex(name, value);
/* 106 */       if (staticTableIndex != -1) {
/*     */         
/* 108 */         encodeInteger(out, 128, 7, staticTableIndex);
/*     */       } else {
/* 110 */         int nameIndex = getNameIndex(name);
/* 111 */         if (this.useIndexing) {
/* 112 */           ensureCapacity(headerSize);
/*     */         }
/* 114 */         HpackUtil.IndexType indexType = this.useIndexing ? HpackUtil.IndexType.INCREMENTAL : HpackUtil.IndexType.NONE;
/* 115 */         encodeLiteral(out, name, value, indexType, nameIndex);
/* 116 */         if (this.useIndexing) {
/* 117 */           add(name, value);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxHeaderTableSize(OutputStream out, int maxHeaderTableSize) throws IOException {
/* 127 */     if (maxHeaderTableSize < 0) {
/* 128 */       throw new IllegalArgumentException("Illegal Capacity: " + maxHeaderTableSize);
/*     */     }
/* 130 */     if (this.capacity == maxHeaderTableSize) {
/*     */       return;
/*     */     }
/* 133 */     this.capacity = maxHeaderTableSize;
/* 134 */     ensureCapacity(0);
/* 135 */     encodeInteger(out, 32, 5, maxHeaderTableSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxHeaderTableSize() {
/* 142 */     return this.capacity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void encodeInteger(OutputStream out, int mask, int n, int i) throws IOException {
/* 149 */     if (n < 0 || n > 8) {
/* 150 */       throw new IllegalArgumentException("N: " + n);
/*     */     }
/* 152 */     int nbits = 255 >>> 8 - n;
/* 153 */     if (i < nbits) {
/* 154 */       out.write(mask | i);
/*     */     } else {
/* 156 */       out.write(mask | nbits);
/* 157 */       int length = i - nbits;
/*     */       while (true) {
/* 159 */         if ((length & 0xFFFFFF80) == 0) {
/* 160 */           out.write(length);
/*     */           return;
/*     */         } 
/* 163 */         out.write(length & 0x7F | 0x80);
/* 164 */         length >>>= 7;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void encodeStringLiteral(OutputStream out, byte[] string) throws IOException {
/* 174 */     int huffmanLength = Huffman.ENCODER.getEncodedLength(string);
/* 175 */     if ((huffmanLength < string.length && !this.forceHuffmanOff) || this.forceHuffmanOn) {
/* 176 */       encodeInteger(out, 128, 7, huffmanLength);
/* 177 */       Huffman.ENCODER.encode(out, string);
/*     */     } else {
/* 179 */       encodeInteger(out, 0, 7, string.length);
/* 180 */       out.write(string, 0, string.length);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void encodeLiteral(OutputStream out, byte[] name, byte[] value, HpackUtil.IndexType indexType, int nameIndex) throws IOException {
/*     */     int mask, prefixBits;
/* 191 */     switch (indexType) {
/*     */       case INCREMENTAL:
/* 193 */         mask = 64;
/* 194 */         prefixBits = 6;
/*     */         break;
/*     */       case NONE:
/* 197 */         mask = 0;
/* 198 */         prefixBits = 4;
/*     */         break;
/*     */       case NEVER:
/* 201 */         mask = 16;
/* 202 */         prefixBits = 4;
/*     */         break;
/*     */       default:
/* 205 */         throw new IllegalStateException("should not reach here");
/*     */     } 
/* 207 */     encodeInteger(out, mask, prefixBits, (nameIndex == -1) ? 0 : nameIndex);
/* 208 */     if (nameIndex == -1) {
/* 209 */       encodeStringLiteral(out, name);
/*     */     }
/* 211 */     encodeStringLiteral(out, value);
/*     */   }
/*     */   
/*     */   private int getNameIndex(byte[] name) {
/* 215 */     int index = StaticTable.getIndex(name);
/* 216 */     if (index == -1) {
/* 217 */       index = getIndex(name);
/* 218 */       if (index >= 0) {
/* 219 */         index += StaticTable.length;
/*     */       }
/*     */     } 
/* 222 */     return index;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void ensureCapacity(int headerSize) throws IOException {
/* 230 */     while (this.size + headerSize > this.capacity) {
/* 231 */       int index = length();
/* 232 */       if (index == 0) {
/*     */         break;
/*     */       }
/* 235 */       remove();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int length() {
/* 244 */     return (this.size == 0) ? 0 : (this.head.after.index - this.head.before.index + 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int size() {
/* 252 */     return this.size;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   HeaderField getHeaderField(int index) {
/* 260 */     HeaderEntry entry = this.head;
/* 261 */     while (index-- >= 0) {
/* 262 */       entry = entry.before;
/*     */     }
/* 264 */     return entry;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private HeaderEntry getEntry(byte[] name, byte[] value) {
/* 272 */     if (length() == 0 || name == null || value == null) {
/* 273 */       return null;
/*     */     }
/* 275 */     int h = hash(name);
/* 276 */     int i = index(h);
/* 277 */     for (HeaderEntry e = this.headerFields[i]; e != null; e = e.next) {
/* 278 */       if (e.hash == h && HpackUtil.equals(name, e.name) && HpackUtil.equals(value, e.value))
/*     */       {
/*     */         
/* 281 */         return e;
/*     */       }
/*     */     } 
/* 284 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int getIndex(byte[] name) {
/* 292 */     if (length() == 0 || name == null) {
/* 293 */       return -1;
/*     */     }
/* 295 */     int h = hash(name);
/* 296 */     int i = index(h);
/* 297 */     int index = -1;
/* 298 */     for (HeaderEntry e = this.headerFields[i]; e != null; e = e.next) {
/* 299 */       if (e.hash == h && HpackUtil.equals(name, e.name)) {
/* 300 */         index = e.index;
/*     */         break;
/*     */       } 
/*     */     } 
/* 304 */     return getIndex(index);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int getIndex(int index) {
/* 311 */     if (index == -1) {
/* 312 */       return index;
/*     */     }
/* 314 */     return index - this.head.before.index + 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void add(byte[] name, byte[] value) {
/* 325 */     int headerSize = HeaderField.sizeOf(name, value);
/*     */ 
/*     */     
/* 328 */     if (headerSize > this.capacity) {
/* 329 */       clear();
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 334 */     while (this.size + headerSize > this.capacity) {
/* 335 */       remove();
/*     */     }
/*     */ 
/*     */     
/* 339 */     name = Arrays.copyOf(name, name.length);
/* 340 */     value = Arrays.copyOf(value, value.length);
/*     */     
/* 342 */     int h = hash(name);
/* 343 */     int i = index(h);
/* 344 */     HeaderEntry old = this.headerFields[i];
/* 345 */     HeaderEntry e = new HeaderEntry(h, name, value, this.head.before.index - 1, old);
/* 346 */     this.headerFields[i] = e;
/* 347 */     e.addBefore(this.head);
/* 348 */     this.size += headerSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private HeaderField remove() {
/* 355 */     if (this.size == 0) {
/* 356 */       return null;
/*     */     }
/* 358 */     HeaderEntry eldest = this.head.after;
/* 359 */     int h = eldest.hash;
/* 360 */     int i = index(h);
/* 361 */     HeaderEntry prev = this.headerFields[i];
/* 362 */     HeaderEntry e = prev;
/* 363 */     while (e != null) {
/* 364 */       HeaderEntry next = e.next;
/* 365 */       if (e == eldest) {
/* 366 */         if (prev == eldest) {
/* 367 */           this.headerFields[i] = next;
/*     */         } else {
/* 369 */           prev.next = next;
/*     */         } 
/* 371 */         eldest.remove();
/* 372 */         this.size -= eldest.size();
/* 373 */         return eldest;
/*     */       } 
/* 375 */       prev = e;
/* 376 */       e = next;
/*     */     } 
/* 378 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void clear() {
/* 385 */     Arrays.fill((Object[])this.headerFields, (Object)null);
/* 386 */     this.head.before = this.head.after = this.head;
/* 387 */     this.size = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int hash(byte[] name) {
/* 394 */     int h = 0;
/* 395 */     for (int i = 0; i < name.length; i++) {
/* 396 */       h = 31 * h + name[i];
/*     */     }
/* 398 */     if (h > 0)
/* 399 */       return h; 
/* 400 */     if (h == Integer.MIN_VALUE) {
/* 401 */       return Integer.MAX_VALUE;
/*     */     }
/* 403 */     return -h;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int index(int h) {
/* 411 */     return h % 17;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static class HeaderEntry
/*     */     extends HeaderField
/*     */   {
/*     */     HeaderEntry before;
/*     */ 
/*     */     
/*     */     HeaderEntry after;
/*     */     
/*     */     HeaderEntry next;
/*     */     
/*     */     int hash;
/*     */     
/*     */     int index;
/*     */ 
/*     */     
/*     */     HeaderEntry(int hash, byte[] name, byte[] value, int index, HeaderEntry next) {
/* 432 */       super(name, value);
/* 433 */       this.index = index;
/* 434 */       this.hash = hash;
/* 435 */       this.next = next;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private void remove() {
/* 442 */       this.before.after = this.after;
/* 443 */       this.after.before = this.before;
/* 444 */       this.before = null;
/* 445 */       this.after = null;
/* 446 */       this.next = null;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private void addBefore(HeaderEntry existingEntry) {
/* 453 */       this.after = existingEntry;
/* 454 */       this.before = existingEntry.before;
/* 455 */       this.before.after = this;
/* 456 */       this.after.before = this;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\twitter\hpack\Encoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */