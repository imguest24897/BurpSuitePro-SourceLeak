/*     */ package com.twitter.hpack;
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
/*     */ public final class Decoder
/*     */ {
/*  27 */   private static final IOException DECOMPRESSION_EXCEPTION = new IOException("decompression failure");
/*     */   
/*  29 */   private static final IOException ILLEGAL_INDEX_VALUE = new IOException("illegal index value");
/*     */   
/*  31 */   private static final IOException INVALID_MAX_DYNAMIC_TABLE_SIZE = new IOException("invalid max dynamic table size");
/*     */   
/*  33 */   private static final IOException MAX_DYNAMIC_TABLE_SIZE_CHANGE_REQUIRED = new IOException("max dynamic table size change required");
/*     */ 
/*     */   
/*  36 */   private static final byte[] EMPTY = new byte[0];
/*     */   
/*     */   private final DynamicTable dynamicTable;
/*     */   
/*     */   private int maxHeaderSize;
/*     */   private int maxDynamicTableSize;
/*     */   private int encoderMaxDynamicTableSize;
/*     */   private boolean maxDynamicTableSizeChangeRequired;
/*     */   private long headerSize;
/*     */   private State state;
/*     */   private HpackUtil.IndexType indexType;
/*     */   private int index;
/*     */   private boolean huffmanEncoded;
/*     */   private int skipLength;
/*     */   private int nameLength;
/*     */   private int valueLength;
/*     */   private byte[] name;
/*     */   
/*     */   private enum State
/*     */   {
/*  56 */     READ_HEADER_REPRESENTATION,
/*  57 */     READ_MAX_DYNAMIC_TABLE_SIZE,
/*  58 */     READ_INDEXED_HEADER,
/*  59 */     READ_INDEXED_HEADER_NAME,
/*  60 */     READ_LITERAL_HEADER_NAME_LENGTH_PREFIX,
/*  61 */     READ_LITERAL_HEADER_NAME_LENGTH,
/*  62 */     READ_LITERAL_HEADER_NAME,
/*  63 */     SKIP_LITERAL_HEADER_NAME,
/*  64 */     READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX,
/*  65 */     READ_LITERAL_HEADER_VALUE_LENGTH,
/*  66 */     READ_LITERAL_HEADER_VALUE,
/*  67 */     SKIP_LITERAL_HEADER_VALUE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Decoder(int maxHeaderSize, int maxHeaderTableSize) {
/*  74 */     this.dynamicTable = new DynamicTable(maxHeaderTableSize);
/*  75 */     this.maxHeaderSize = maxHeaderSize;
/*  76 */     this.maxDynamicTableSize = maxHeaderTableSize;
/*  77 */     this.encoderMaxDynamicTableSize = maxHeaderTableSize;
/*  78 */     this.maxDynamicTableSizeChangeRequired = false;
/*  79 */     reset();
/*     */   }
/*     */   
/*     */   private void reset() {
/*  83 */     this.headerSize = 0L;
/*  84 */     this.state = State.READ_HEADER_REPRESENTATION;
/*  85 */     this.indexType = HpackUtil.IndexType.NONE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void decode(InputStream in, HeaderListener headerListener) throws IOException {
/*  92 */     while (in.available() > 0) {
/*  93 */       byte b; int maxSize; int headerIndex; int nameIndex; long newHeaderSize; byte[] value; switch (this.state) {
/*     */         case NONE:
/*  95 */           b = (byte)in.read();
/*  96 */           if (this.maxDynamicTableSizeChangeRequired && (b & 0xE0) != 32)
/*     */           {
/*  98 */             throw MAX_DYNAMIC_TABLE_SIZE_CHANGE_REQUIRED;
/*     */           }
/* 100 */           if (b < 0) {
/*     */             
/* 102 */             this.index = b & Byte.MAX_VALUE;
/* 103 */             if (this.index == 0)
/* 104 */               throw ILLEGAL_INDEX_VALUE; 
/* 105 */             if (this.index == 127) {
/* 106 */               this.state = State.READ_INDEXED_HEADER; continue;
/*     */             } 
/* 108 */             indexHeader(this.index, headerListener); continue;
/*     */           } 
/* 110 */           if ((b & 0x40) == 64) {
/*     */             
/* 112 */             this.indexType = HpackUtil.IndexType.INCREMENTAL;
/* 113 */             this.index = b & 0x3F;
/* 114 */             if (this.index == 0) {
/* 115 */               this.state = State.READ_LITERAL_HEADER_NAME_LENGTH_PREFIX; continue;
/* 116 */             }  if (this.index == 63) {
/* 117 */               this.state = State.READ_INDEXED_HEADER_NAME;
/*     */               continue;
/*     */             } 
/* 120 */             readName(this.index);
/* 121 */             this.state = State.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX; continue;
/*     */           } 
/* 123 */           if ((b & 0x20) == 32) {
/*     */             
/* 125 */             this.index = b & 0x1F;
/* 126 */             if (this.index == 31) {
/* 127 */               this.state = State.READ_MAX_DYNAMIC_TABLE_SIZE; continue;
/*     */             } 
/* 129 */             setDynamicTableSize(this.index);
/* 130 */             this.state = State.READ_HEADER_REPRESENTATION;
/*     */             
/*     */             continue;
/*     */           } 
/* 134 */           this.indexType = ((b & 0x10) == 16) ? HpackUtil.IndexType.NEVER : HpackUtil.IndexType.NONE;
/* 135 */           this.index = b & 0xF;
/* 136 */           if (this.index == 0) {
/* 137 */             this.state = State.READ_LITERAL_HEADER_NAME_LENGTH_PREFIX; continue;
/* 138 */           }  if (this.index == 15) {
/* 139 */             this.state = State.READ_INDEXED_HEADER_NAME;
/*     */             continue;
/*     */           } 
/* 142 */           readName(this.index);
/* 143 */           this.state = State.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX;
/*     */           continue;
/*     */ 
/*     */ 
/*     */         
/*     */         case NEVER:
/* 149 */           maxSize = decodeULE128(in);
/* 150 */           if (maxSize == -1) {
/*     */             return;
/*     */           }
/*     */ 
/*     */           
/* 155 */           if (maxSize > Integer.MAX_VALUE - this.index) {
/* 156 */             throw DECOMPRESSION_EXCEPTION;
/*     */           }
/*     */           
/* 159 */           setDynamicTableSize(this.index + maxSize);
/* 160 */           this.state = State.READ_HEADER_REPRESENTATION;
/*     */           continue;
/*     */         
/*     */         case INCREMENTAL:
/* 164 */           headerIndex = decodeULE128(in);
/* 165 */           if (headerIndex == -1) {
/*     */             return;
/*     */           }
/*     */ 
/*     */           
/* 170 */           if (headerIndex > Integer.MAX_VALUE - this.index) {
/* 171 */             throw DECOMPRESSION_EXCEPTION;
/*     */           }
/*     */           
/* 174 */           indexHeader(this.index + headerIndex, headerListener);
/* 175 */           this.state = State.READ_HEADER_REPRESENTATION;
/*     */           continue;
/*     */ 
/*     */         
/*     */         case null:
/* 180 */           nameIndex = decodeULE128(in);
/* 181 */           if (nameIndex == -1) {
/*     */             return;
/*     */           }
/*     */ 
/*     */           
/* 186 */           if (nameIndex > Integer.MAX_VALUE - this.index) {
/* 187 */             throw DECOMPRESSION_EXCEPTION;
/*     */           }
/*     */           
/* 190 */           readName(this.index + nameIndex);
/* 191 */           this.state = State.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX;
/*     */           continue;
/*     */         
/*     */         case null:
/* 195 */           b = (byte)in.read();
/* 196 */           this.huffmanEncoded = ((b & 0x80) == 128);
/* 197 */           this.index = b & Byte.MAX_VALUE;
/* 198 */           if (this.index == 127) {
/* 199 */             this.state = State.READ_LITERAL_HEADER_NAME_LENGTH; continue;
/*     */           } 
/* 201 */           this.nameLength = this.index;
/*     */ 
/*     */           
/* 204 */           if (this.nameLength == 0) {
/* 205 */             throw DECOMPRESSION_EXCEPTION;
/*     */           }
/*     */ 
/*     */           
/* 209 */           if (exceedsMaxHeaderSize(this.nameLength)) {
/*     */             
/* 211 */             if (this.indexType == HpackUtil.IndexType.NONE) {
/*     */               
/* 213 */               this.name = EMPTY;
/* 214 */               this.skipLength = this.nameLength;
/* 215 */               this.state = State.SKIP_LITERAL_HEADER_NAME;
/*     */               
/*     */               continue;
/*     */             } 
/*     */             
/* 220 */             if (this.nameLength + 32 > this.dynamicTable.capacity()) {
/* 221 */               this.dynamicTable.clear();
/* 222 */               this.name = EMPTY;
/* 223 */               this.skipLength = this.nameLength;
/* 224 */               this.state = State.SKIP_LITERAL_HEADER_NAME;
/*     */               continue;
/*     */             } 
/*     */           } 
/* 228 */           this.state = State.READ_LITERAL_HEADER_NAME;
/*     */           continue;
/*     */ 
/*     */ 
/*     */         
/*     */         case null:
/* 234 */           this.nameLength = decodeULE128(in);
/* 235 */           if (this.nameLength == -1) {
/*     */             return;
/*     */           }
/*     */ 
/*     */           
/* 240 */           if (this.nameLength > Integer.MAX_VALUE - this.index) {
/* 241 */             throw DECOMPRESSION_EXCEPTION;
/*     */           }
/* 243 */           this.nameLength += this.index;
/*     */ 
/*     */           
/* 246 */           if (exceedsMaxHeaderSize(this.nameLength)) {
/* 247 */             if (this.indexType == HpackUtil.IndexType.NONE) {
/*     */               
/* 249 */               this.name = EMPTY;
/* 250 */               this.skipLength = this.nameLength;
/* 251 */               this.state = State.SKIP_LITERAL_HEADER_NAME;
/*     */               
/*     */               continue;
/*     */             } 
/*     */             
/* 256 */             if (this.nameLength + 32 > this.dynamicTable.capacity()) {
/* 257 */               this.dynamicTable.clear();
/* 258 */               this.name = EMPTY;
/* 259 */               this.skipLength = this.nameLength;
/* 260 */               this.state = State.SKIP_LITERAL_HEADER_NAME;
/*     */               continue;
/*     */             } 
/*     */           } 
/* 264 */           this.state = State.READ_LITERAL_HEADER_NAME;
/*     */           continue;
/*     */ 
/*     */         
/*     */         case null:
/* 269 */           if (in.available() < this.nameLength) {
/*     */             return;
/*     */           }
/*     */           
/* 273 */           this.name = readStringLiteral(in, this.nameLength);
/*     */           
/* 275 */           this.state = State.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX;
/*     */           continue;
/*     */         
/*     */         case null:
/* 279 */           this.skipLength = (int)(this.skipLength - in.skip(this.skipLength));
/*     */           
/* 281 */           if (this.skipLength == 0) {
/* 282 */             this.state = State.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX;
/*     */           }
/*     */           continue;
/*     */         
/*     */         case null:
/* 287 */           b = (byte)in.read();
/* 288 */           this.huffmanEncoded = ((b & 0x80) == 128);
/* 289 */           this.index = b & Byte.MAX_VALUE;
/* 290 */           if (this.index == 127) {
/* 291 */             this.state = State.READ_LITERAL_HEADER_VALUE_LENGTH; continue;
/*     */           } 
/* 293 */           this.valueLength = this.index;
/*     */ 
/*     */           
/* 296 */           newHeaderSize = this.nameLength + this.valueLength;
/* 297 */           if (exceedsMaxHeaderSize(newHeaderSize)) {
/*     */             
/* 299 */             this.headerSize = (this.maxHeaderSize + 1);
/*     */             
/* 301 */             if (this.indexType == HpackUtil.IndexType.NONE) {
/*     */               
/* 303 */               this.state = State.SKIP_LITERAL_HEADER_VALUE;
/*     */               
/*     */               continue;
/*     */             } 
/*     */             
/* 308 */             if (newHeaderSize + 32L > this.dynamicTable.capacity()) {
/* 309 */               this.dynamicTable.clear();
/* 310 */               this.state = State.SKIP_LITERAL_HEADER_VALUE;
/*     */               
/*     */               continue;
/*     */             } 
/*     */           } 
/* 315 */           if (this.valueLength == 0) {
/* 316 */             insertHeader(headerListener, this.name, EMPTY, this.indexType);
/* 317 */             this.state = State.READ_HEADER_REPRESENTATION; continue;
/*     */           } 
/* 319 */           this.state = State.READ_LITERAL_HEADER_VALUE;
/*     */           continue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         case null:
/* 327 */           this.valueLength = decodeULE128(in);
/* 328 */           if (this.valueLength == -1) {
/*     */             return;
/*     */           }
/*     */ 
/*     */           
/* 333 */           if (this.valueLength > Integer.MAX_VALUE - this.index) {
/* 334 */             throw DECOMPRESSION_EXCEPTION;
/*     */           }
/* 336 */           this.valueLength += this.index;
/*     */ 
/*     */           
/* 339 */           newHeaderSize = this.nameLength + this.valueLength;
/* 340 */           if (newHeaderSize + this.headerSize > this.maxHeaderSize) {
/*     */             
/* 342 */             this.headerSize = (this.maxHeaderSize + 1);
/*     */             
/* 344 */             if (this.indexType == HpackUtil.IndexType.NONE) {
/*     */               
/* 346 */               this.state = State.SKIP_LITERAL_HEADER_VALUE;
/*     */               
/*     */               continue;
/*     */             } 
/*     */             
/* 351 */             if (newHeaderSize + 32L > this.dynamicTable.capacity()) {
/* 352 */               this.dynamicTable.clear();
/* 353 */               this.state = State.SKIP_LITERAL_HEADER_VALUE;
/*     */               continue;
/*     */             } 
/*     */           } 
/* 357 */           this.state = State.READ_LITERAL_HEADER_VALUE;
/*     */           continue;
/*     */ 
/*     */         
/*     */         case null:
/* 362 */           if (in.available() < this.valueLength) {
/*     */             return;
/*     */           }
/*     */           
/* 366 */           value = readStringLiteral(in, this.valueLength);
/* 367 */           insertHeader(headerListener, this.name, value, this.indexType);
/* 368 */           this.state = State.READ_HEADER_REPRESENTATION;
/*     */           continue;
/*     */         
/*     */         case null:
/* 372 */           this.valueLength = (int)(this.valueLength - in.skip(this.valueLength));
/*     */           
/* 374 */           if (this.valueLength == 0) {
/* 375 */             this.state = State.READ_HEADER_REPRESENTATION;
/*     */           }
/*     */           continue;
/*     */       } 
/*     */       
/* 380 */       throw new IllegalStateException("should not reach here");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean endHeaderBlock() {
/* 390 */     boolean truncated = (this.headerSize > this.maxHeaderSize);
/* 391 */     reset();
/* 392 */     return truncated;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxHeaderTableSize(int maxHeaderTableSize) {
/* 401 */     this.maxDynamicTableSize = maxHeaderTableSize;
/* 402 */     if (this.maxDynamicTableSize < this.encoderMaxDynamicTableSize) {
/*     */ 
/*     */       
/* 405 */       this.maxDynamicTableSizeChangeRequired = true;
/* 406 */       this.dynamicTable.setCapacity(this.maxDynamicTableSize);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxHeaderTableSize() {
/* 415 */     return this.dynamicTable.capacity();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int length() {
/* 423 */     return this.dynamicTable.length();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int size() {
/* 431 */     return this.dynamicTable.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   HeaderField getHeaderField(int index) {
/* 439 */     return this.dynamicTable.getEntry(index + 1);
/*     */   }
/*     */   
/*     */   private void setDynamicTableSize(int dynamicTableSize) throws IOException {
/* 443 */     if (dynamicTableSize > this.maxDynamicTableSize) {
/* 444 */       throw INVALID_MAX_DYNAMIC_TABLE_SIZE;
/*     */     }
/* 446 */     this.encoderMaxDynamicTableSize = dynamicTableSize;
/* 447 */     this.maxDynamicTableSizeChangeRequired = false;
/* 448 */     this.dynamicTable.setCapacity(dynamicTableSize);
/*     */   }
/*     */   
/*     */   private void readName(int index) throws IOException {
/* 452 */     if (index <= StaticTable.length) {
/* 453 */       HeaderField headerField = StaticTable.getEntry(index);
/* 454 */       this.name = headerField.name;
/* 455 */     } else if (index - StaticTable.length <= this.dynamicTable.length()) {
/* 456 */       HeaderField headerField = this.dynamicTable.getEntry(index - StaticTable.length);
/* 457 */       this.name = headerField.name;
/*     */     } else {
/* 459 */       throw ILLEGAL_INDEX_VALUE;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void indexHeader(int index, HeaderListener headerListener) throws IOException {
/* 464 */     if (index <= StaticTable.length) {
/* 465 */       HeaderField headerField = StaticTable.getEntry(index);
/* 466 */       addHeader(headerListener, headerField.name, headerField.value, false);
/* 467 */     } else if (index - StaticTable.length <= this.dynamicTable.length()) {
/* 468 */       HeaderField headerField = this.dynamicTable.getEntry(index - StaticTable.length);
/* 469 */       addHeader(headerListener, headerField.name, headerField.value, false);
/*     */     } else {
/* 471 */       throw ILLEGAL_INDEX_VALUE;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void insertHeader(HeaderListener headerListener, byte[] name, byte[] value, HpackUtil.IndexType indexType) {
/* 476 */     addHeader(headerListener, name, value, (indexType == HpackUtil.IndexType.NEVER));
/*     */     
/* 478 */     switch (indexType) {
/*     */       case NONE:
/*     */       case NEVER:
/*     */         return;
/*     */       
/*     */       case INCREMENTAL:
/* 484 */         this.dynamicTable.add(new HeaderField(name, value));
/*     */     } 
/*     */ 
/*     */     
/* 488 */     throw new IllegalStateException("should not reach here");
/*     */   }
/*     */ 
/*     */   
/*     */   private void addHeader(HeaderListener headerListener, byte[] name, byte[] value, boolean sensitive) {
/* 493 */     if (name.length == 0) {
/* 494 */       throw new AssertionError("name is empty");
/*     */     }
/* 496 */     long newSize = this.headerSize + name.length + value.length;
/* 497 */     if (newSize <= this.maxHeaderSize) {
/* 498 */       headerListener.addHeader(name, value, sensitive);
/* 499 */       this.headerSize = (int)newSize;
/*     */     } else {
/*     */       
/* 502 */       this.headerSize = (this.maxHeaderSize + 1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean exceedsMaxHeaderSize(long size) {
/* 508 */     if (size + this.headerSize <= this.maxHeaderSize) {
/* 509 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 513 */     this.headerSize = (this.maxHeaderSize + 1);
/* 514 */     return true;
/*     */   }
/*     */   
/*     */   private byte[] readStringLiteral(InputStream in, int length) throws IOException {
/* 518 */     byte[] buf = new byte[length];
/* 519 */     if (in.read(buf) != length) {
/* 520 */       throw DECOMPRESSION_EXCEPTION;
/*     */     }
/*     */     
/* 523 */     if (this.huffmanEncoded) {
/* 524 */       return Huffman.DECODER.decode(buf);
/*     */     }
/* 526 */     return buf;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static int decodeULE128(InputStream in) throws IOException {
/* 532 */     in.mark(5);
/* 533 */     int result = 0;
/* 534 */     int shift = 0;
/* 535 */     while (shift < 32) {
/* 536 */       if (in.available() == 0) {
/*     */ 
/*     */         
/* 539 */         in.reset();
/* 540 */         return -1;
/*     */       } 
/* 542 */       byte b = (byte)in.read();
/* 543 */       if (shift == 28 && (b & 0xF8) != 0) {
/*     */         break;
/*     */       }
/* 546 */       result |= (b & Byte.MAX_VALUE) << shift;
/* 547 */       if ((b & 0x80) == 0) {
/* 548 */         return result;
/*     */       }
/* 550 */       shift += 7;
/*     */     } 
/*     */     
/* 553 */     in.reset();
/* 554 */     throw DECOMPRESSION_EXCEPTION;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\twitter\hpack\Decoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */