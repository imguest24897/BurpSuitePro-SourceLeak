/*     */ package org.brotli.dec;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class Decode
/*     */ {
/*     */   private static final int DEFAULT_CODE_LENGTH = 8;
/*     */   private static final int CODE_LENGTH_REPEAT_CODE = 16;
/*     */   private static final int NUM_LITERAL_CODES = 256;
/*     */   private static final int NUM_INSERT_AND_COPY_CODES = 704;
/*     */   private static final int NUM_BLOCK_LENGTH_CODES = 26;
/*     */   private static final int LITERAL_CONTEXT_BITS = 6;
/*     */   private static final int DISTANCE_CONTEXT_BITS = 2;
/*     */   private static final int HUFFMAN_TABLE_BITS = 8;
/*     */   private static final int HUFFMAN_TABLE_MASK = 255;
/*     */   private static final int CODE_LENGTH_CODES = 18;
/*  40 */   private static final int[] CODE_LENGTH_CODE_ORDER = new int[] { 1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
/*     */ 
/*     */   
/*     */   private static final int NUM_DISTANCE_SHORT_CODES = 16;
/*     */   
/*  45 */   private static final int[] DISTANCE_SHORT_CODE_INDEX_OFFSET = new int[] { 3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2 };
/*     */ 
/*     */ 
/*     */   
/*  49 */   private static final int[] DISTANCE_SHORT_CODE_VALUE_OFFSET = new int[] { 0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   private static final int[] FIXED_TABLE = new int[] { 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int decodeVarLenUnsignedByte(BitReader br) {
/*  65 */     if (BitReader.readBits(br, 1) != 0) {
/*  66 */       int n = BitReader.readBits(br, 3);
/*  67 */       if (n == 0) {
/*  68 */         return 1;
/*     */       }
/*  70 */       return BitReader.readBits(br, n) + (1 << n);
/*     */     } 
/*     */     
/*  73 */     return 0;
/*     */   }
/*     */   
/*     */   private static void decodeMetaBlockLength(BitReader br, State state) {
/*  77 */     state.inputEnd = (BitReader.readBits(br, 1) == 1);
/*  78 */     state.metaBlockLength = 0;
/*  79 */     state.isUncompressed = false;
/*  80 */     state.isMetadata = false;
/*  81 */     if (state.inputEnd && BitReader.readBits(br, 1) != 0) {
/*     */       return;
/*     */     }
/*  84 */     int sizeNibbles = BitReader.readBits(br, 2) + 4;
/*  85 */     if (sizeNibbles == 7) {
/*  86 */       state.isMetadata = true;
/*  87 */       if (BitReader.readBits(br, 1) != 0) {
/*  88 */         throw new BrotliRuntimeException("Corrupted reserved bit");
/*     */       }
/*  90 */       int sizeBytes = BitReader.readBits(br, 2);
/*  91 */       if (sizeBytes == 0) {
/*     */         return;
/*     */       }
/*  94 */       for (int i = 0; i < sizeBytes; i++) {
/*  95 */         int bits = BitReader.readBits(br, 8);
/*  96 */         if (bits == 0 && i + 1 == sizeBytes && sizeBytes > 1) {
/*  97 */           throw new BrotliRuntimeException("Exuberant nibble");
/*     */         }
/*  99 */         state.metaBlockLength |= bits << i * 8;
/*     */       } 
/*     */     } else {
/* 102 */       for (int i = 0; i < sizeNibbles; i++) {
/* 103 */         int bits = BitReader.readBits(br, 4);
/* 104 */         if (bits == 0 && i + 1 == sizeNibbles && sizeNibbles > 4) {
/* 105 */           throw new BrotliRuntimeException("Exuberant nibble");
/*     */         }
/* 107 */         state.metaBlockLength |= bits << i * 4;
/*     */       } 
/*     */     } 
/* 110 */     state.metaBlockLength++;
/* 111 */     if (!state.inputEnd) {
/* 112 */       state.isUncompressed = (BitReader.readBits(br, 1) == 1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int readSymbol(int[] table, int offset, BitReader br) {
/* 120 */     int val = (int)(br.accumulator >>> br.bitOffset);
/* 121 */     offset += val & 0xFF;
/* 122 */     int bits = table[offset] >> 16;
/* 123 */     int sym = table[offset] & 0xFFFF;
/* 124 */     if (bits <= 8) {
/* 125 */       br.bitOffset += bits;
/* 126 */       return sym;
/*     */     } 
/* 128 */     offset += sym;
/* 129 */     int mask = (1 << bits) - 1;
/* 130 */     offset += (val & mask) >>> 8;
/* 131 */     br.bitOffset += (table[offset] >> 16) + 8;
/* 132 */     return table[offset] & 0xFFFF;
/*     */   }
/*     */   
/*     */   private static int readBlockLength(int[] table, int offset, BitReader br) {
/* 136 */     BitReader.fillBitWindow(br);
/* 137 */     int code = readSymbol(table, offset, br);
/* 138 */     int n = Prefix.BLOCK_LENGTH_N_BITS[code];
/* 139 */     return Prefix.BLOCK_LENGTH_OFFSET[code] + BitReader.readBits(br, n);
/*     */   }
/*     */   
/*     */   private static int translateShortCodes(int code, int[] ringBuffer, int index) {
/* 143 */     if (code < 16) {
/* 144 */       index += DISTANCE_SHORT_CODE_INDEX_OFFSET[code];
/* 145 */       index &= 0x3;
/* 146 */       return ringBuffer[index] + DISTANCE_SHORT_CODE_VALUE_OFFSET[code];
/*     */     } 
/* 148 */     return code - 16 + 1;
/*     */   }
/*     */   
/*     */   private static void moveToFront(int[] v, int index) {
/* 152 */     int value = v[index];
/* 153 */     for (; index > 0; index--) {
/* 154 */       v[index] = v[index - 1];
/*     */     }
/* 156 */     v[0] = value;
/*     */   }
/*     */   
/*     */   private static void inverseMoveToFrontTransform(byte[] v, int vLen) {
/* 160 */     int[] mtf = new int[256]; int i;
/* 161 */     for (i = 0; i < 256; i++) {
/* 162 */       mtf[i] = i;
/*     */     }
/* 164 */     for (i = 0; i < vLen; i++) {
/* 165 */       int index = v[i] & 0xFF;
/* 166 */       v[i] = (byte)mtf[index];
/* 167 */       if (index != 0) {
/* 168 */         moveToFront(mtf, index);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static void readHuffmanCodeLengths(int[] codeLengthCodeLengths, int numSymbols, int[] codeLengths, BitReader br) {
/* 175 */     int symbol = 0;
/* 176 */     int prevCodeLen = 8;
/* 177 */     int repeat = 0;
/* 178 */     int repeatCodeLen = 0;
/* 179 */     int space = 32768;
/* 180 */     int[] table = new int[32];
/*     */     
/* 182 */     Huffman.buildHuffmanTable(table, 0, 5, codeLengthCodeLengths, 18);
/*     */     
/* 184 */     while (symbol < numSymbols && space > 0) {
/* 185 */       BitReader.readMoreInput(br);
/* 186 */       BitReader.fillBitWindow(br);
/* 187 */       int p = (int)(br.accumulator >>> br.bitOffset) & 0x1F;
/* 188 */       br.bitOffset += table[p] >> 16;
/* 189 */       int codeLen = table[p] & 0xFFFF;
/* 190 */       if (codeLen < 16) {
/* 191 */         repeat = 0;
/* 192 */         codeLengths[symbol++] = codeLen;
/* 193 */         if (codeLen != 0) {
/* 194 */           prevCodeLen = codeLen;
/* 195 */           space -= 32768 >> codeLen;
/*     */         }  continue;
/*     */       } 
/* 198 */       int extraBits = codeLen - 14;
/* 199 */       int newLen = 0;
/* 200 */       if (codeLen == 16) {
/* 201 */         newLen = prevCodeLen;
/*     */       }
/* 203 */       if (repeatCodeLen != newLen) {
/* 204 */         repeat = 0;
/* 205 */         repeatCodeLen = newLen;
/*     */       } 
/* 207 */       int oldRepeat = repeat;
/* 208 */       if (repeat > 0) {
/* 209 */         repeat -= 2;
/* 210 */         repeat <<= extraBits;
/*     */       } 
/* 212 */       repeat += BitReader.readBits(br, extraBits) + 3;
/* 213 */       int repeatDelta = repeat - oldRepeat;
/* 214 */       if (symbol + repeatDelta > numSymbols) {
/* 215 */         throw new BrotliRuntimeException("symbol + repeatDelta > numSymbols");
/*     */       }
/* 217 */       for (int i = 0; i < repeatDelta; i++) {
/* 218 */         codeLengths[symbol++] = repeatCodeLen;
/*     */       }
/* 220 */       if (repeatCodeLen != 0) {
/* 221 */         space -= repeatDelta << 15 - repeatCodeLen;
/*     */       }
/*     */     } 
/*     */     
/* 225 */     if (space != 0) {
/* 226 */       throw new BrotliRuntimeException("Unused space");
/*     */     }
/*     */     
/* 229 */     Utils.fillWithZeroes(codeLengths, symbol, numSymbols - symbol);
/*     */   }
/*     */ 
/*     */   
/*     */   static void readHuffmanCode(int alphabetSize, int[] table, int offset, BitReader br) {
/* 234 */     boolean ok = true;
/*     */     
/* 236 */     BitReader.readMoreInput(br);
/*     */     
/* 238 */     int[] codeLengths = new int[alphabetSize];
/* 239 */     int simpleCodeOrSkip = BitReader.readBits(br, 2);
/* 240 */     if (simpleCodeOrSkip == 1) {
/* 241 */       int maxBitsCounter = alphabetSize - 1;
/* 242 */       int maxBits = 0;
/* 243 */       int[] symbols = new int[4];
/* 244 */       int numSymbols = BitReader.readBits(br, 2) + 1;
/* 245 */       while (maxBitsCounter != 0) {
/* 246 */         maxBitsCounter >>= 1;
/* 247 */         maxBits++;
/*     */       } 
/*     */ 
/*     */       
/* 251 */       for (int i = 0; i < numSymbols; i++) {
/* 252 */         symbols[i] = BitReader.readBits(br, maxBits) % alphabetSize;
/* 253 */         codeLengths[symbols[i]] = 2;
/*     */       } 
/* 255 */       codeLengths[symbols[0]] = 1;
/* 256 */       switch (numSymbols) {
/*     */         case 1:
/*     */           break;
/*     */         case 2:
/* 260 */           ok = (symbols[0] != symbols[1]);
/* 261 */           codeLengths[symbols[1]] = 1;
/*     */           break;
/*     */         case 3:
/* 264 */           ok = (symbols[0] != symbols[1] && symbols[0] != symbols[2] && symbols[1] != symbols[2]);
/*     */           break;
/*     */         
/*     */         default:
/* 268 */           ok = (symbols[0] != symbols[1] && symbols[0] != symbols[2] && symbols[0] != symbols[3] && symbols[1] != symbols[2] && symbols[1] != symbols[3] && symbols[2] != symbols[3]);
/*     */           
/* 270 */           if (BitReader.readBits(br, 1) == 1) {
/* 271 */             codeLengths[symbols[2]] = 3;
/* 272 */             codeLengths[symbols[3]] = 3; break;
/*     */           } 
/* 274 */           codeLengths[symbols[0]] = 2;
/*     */           break;
/*     */       } 
/*     */     
/*     */     } else {
/* 279 */       int[] codeLengthCodeLengths = new int[18];
/* 280 */       int space = 32;
/* 281 */       int numCodes = 0;
/* 282 */       for (int i = simpleCodeOrSkip; i < 18 && space > 0; i++) {
/* 283 */         int codeLenIdx = CODE_LENGTH_CODE_ORDER[i];
/* 284 */         BitReader.fillBitWindow(br);
/* 285 */         int p = (int)(br.accumulator >>> br.bitOffset) & 0xF;
/*     */         
/* 287 */         br.bitOffset += FIXED_TABLE[p] >> 16;
/* 288 */         int v = FIXED_TABLE[p] & 0xFFFF;
/* 289 */         codeLengthCodeLengths[codeLenIdx] = v;
/* 290 */         if (v != 0) {
/* 291 */           space -= 32 >> v;
/* 292 */           numCodes++;
/*     */         } 
/*     */       } 
/* 295 */       ok = (numCodes == 1 || space == 0);
/* 296 */       readHuffmanCodeLengths(codeLengthCodeLengths, alphabetSize, codeLengths, br);
/*     */     } 
/* 298 */     if (!ok) {
/* 299 */       throw new BrotliRuntimeException("Can't readHuffmanCode");
/*     */     }
/* 301 */     Huffman.buildHuffmanTable(table, offset, 8, codeLengths, alphabetSize);
/*     */   }
/*     */   
/*     */   private static int decodeContextMap(int contextMapSize, byte[] contextMap, BitReader br) {
/* 305 */     BitReader.readMoreInput(br);
/* 306 */     int numTrees = decodeVarLenUnsignedByte(br) + 1;
/*     */     
/* 308 */     if (numTrees == 1) {
/* 309 */       Utils.fillWithZeroes(contextMap, 0, contextMapSize);
/* 310 */       return numTrees;
/*     */     } 
/*     */     
/* 313 */     boolean useRleForZeros = (BitReader.readBits(br, 1) == 1);
/* 314 */     int maxRunLengthPrefix = 0;
/* 315 */     if (useRleForZeros) {
/* 316 */       maxRunLengthPrefix = BitReader.readBits(br, 4) + 1;
/*     */     }
/* 318 */     int[] table = new int[1080];
/* 319 */     readHuffmanCode(numTrees + maxRunLengthPrefix, table, 0, br);
/* 320 */     for (int i = 0; i < contextMapSize; ) {
/* 321 */       BitReader.readMoreInput(br);
/* 322 */       BitReader.fillBitWindow(br);
/* 323 */       int code = readSymbol(table, 0, br);
/* 324 */       if (code == 0) {
/* 325 */         contextMap[i] = 0;
/* 326 */         i++; continue;
/* 327 */       }  if (code <= maxRunLengthPrefix) {
/* 328 */         int reps = (1 << code) + BitReader.readBits(br, code);
/* 329 */         while (reps != 0) {
/* 330 */           if (i >= contextMapSize) {
/* 331 */             throw new BrotliRuntimeException("Corrupted context map");
/*     */           }
/* 333 */           contextMap[i] = 0;
/* 334 */           i++;
/* 335 */           reps--;
/*     */         }  continue;
/*     */       } 
/* 338 */       contextMap[i] = (byte)(code - maxRunLengthPrefix);
/* 339 */       i++;
/*     */     } 
/*     */     
/* 342 */     if (BitReader.readBits(br, 1) == 1) {
/* 343 */       inverseMoveToFrontTransform(contextMap, contextMapSize);
/*     */     }
/* 345 */     return numTrees;
/*     */   }
/*     */   
/*     */   private static void decodeBlockTypeAndLength(State state, int treeType) {
/* 349 */     BitReader br = state.br;
/* 350 */     int[] ringBuffers = state.blockTypeRb;
/* 351 */     int offset = treeType * 2;
/* 352 */     BitReader.fillBitWindow(br);
/* 353 */     int blockType = readSymbol(state.blockTypeTrees, treeType * 1080, br);
/*     */     
/* 355 */     state.blockLength[treeType] = readBlockLength(state.blockLenTrees, treeType * 1080, br);
/*     */ 
/*     */     
/* 358 */     if (blockType == 1) {
/* 359 */       blockType = ringBuffers[offset + 1] + 1;
/* 360 */     } else if (blockType == 0) {
/* 361 */       blockType = ringBuffers[offset];
/*     */     } else {
/* 363 */       blockType -= 2;
/*     */     } 
/* 365 */     if (blockType >= state.numBlockTypes[treeType]) {
/* 366 */       blockType -= state.numBlockTypes[treeType];
/*     */     }
/* 368 */     ringBuffers[offset] = ringBuffers[offset + 1];
/* 369 */     ringBuffers[offset + 1] = blockType;
/*     */   }
/*     */   
/*     */   private static void decodeLiteralBlockSwitch(State state) {
/* 373 */     decodeBlockTypeAndLength(state, 0);
/* 374 */     int literalBlockType = state.blockTypeRb[1];
/* 375 */     state.contextMapSlice = literalBlockType << 6;
/* 376 */     state.literalTreeIndex = state.contextMap[state.contextMapSlice] & 0xFF;
/* 377 */     state.literalTree = state.hGroup0.trees[state.literalTreeIndex];
/* 378 */     int contextMode = state.contextModes[literalBlockType];
/* 379 */     state.contextLookupOffset1 = Context.LOOKUP_OFFSETS[contextMode];
/* 380 */     state.contextLookupOffset2 = Context.LOOKUP_OFFSETS[contextMode + 1];
/*     */   }
/*     */   
/*     */   private static void decodeCommandBlockSwitch(State state) {
/* 384 */     decodeBlockTypeAndLength(state, 1);
/* 385 */     state.treeCommandOffset = state.hGroup1.trees[state.blockTypeRb[3]];
/*     */   }
/*     */   
/*     */   private static void decodeDistanceBlockSwitch(State state) {
/* 389 */     decodeBlockTypeAndLength(state, 2);
/* 390 */     state.distContextMapSlice = state.blockTypeRb[5] << 2;
/*     */   }
/*     */   
/*     */   private static void maybeReallocateRingBuffer(State state) {
/* 394 */     int newSize = state.maxRingBufferSize;
/* 395 */     if (newSize > state.expectedTotalSize) {
/*     */       
/* 397 */       int minimalNewSize = (int)state.expectedTotalSize + state.customDictionary.length;
/* 398 */       while (newSize >> 1 > minimalNewSize) {
/* 399 */         newSize >>= 1;
/*     */       }
/* 401 */       if (!state.inputEnd && newSize < 16384 && state.maxRingBufferSize >= 16384) {
/* 402 */         newSize = 16384;
/*     */       }
/*     */     } 
/* 405 */     if (newSize <= state.ringBufferSize) {
/*     */       return;
/*     */     }
/* 408 */     int ringBufferSizeWithSlack = newSize + 37;
/* 409 */     byte[] newBuffer = new byte[ringBufferSizeWithSlack];
/* 410 */     if (state.ringBuffer != null) {
/* 411 */       System.arraycopy(state.ringBuffer, 0, newBuffer, 0, state.ringBufferSize);
/*     */     
/*     */     }
/* 414 */     else if (state.customDictionary.length != 0) {
/* 415 */       int length = state.customDictionary.length;
/* 416 */       int offset = 0;
/* 417 */       if (length > state.maxBackwardDistance) {
/* 418 */         offset = length - state.maxBackwardDistance;
/* 419 */         length = state.maxBackwardDistance;
/*     */       } 
/* 421 */       System.arraycopy(state.customDictionary, offset, newBuffer, 0, length);
/* 422 */       state.pos = length;
/* 423 */       state.bytesToIgnore = length;
/*     */     } 
/*     */     
/* 426 */     state.ringBuffer = newBuffer;
/* 427 */     state.ringBufferSize = newSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void readMetablockInfo(State state) {
/* 436 */     BitReader br = state.br;
/*     */     
/* 438 */     if (state.inputEnd) {
/* 439 */       state.nextRunningState = 10;
/* 440 */       state.bytesToWrite = state.pos;
/* 441 */       state.bytesWritten = 0;
/* 442 */       state.runningState = 12;
/*     */       
/*     */       return;
/*     */     } 
/* 446 */     state.hGroup0.codes = null;
/* 447 */     state.hGroup0.trees = null;
/* 448 */     state.hGroup1.codes = null;
/* 449 */     state.hGroup1.trees = null;
/* 450 */     state.hGroup2.codes = null;
/* 451 */     state.hGroup2.trees = null;
/*     */     
/* 453 */     BitReader.readMoreInput(br);
/* 454 */     decodeMetaBlockLength(br, state);
/* 455 */     if (state.metaBlockLength == 0 && !state.isMetadata) {
/*     */       return;
/*     */     }
/* 458 */     if (state.isUncompressed || state.isMetadata) {
/* 459 */       BitReader.jumpToByteBoundary(br);
/* 460 */       state.runningState = state.isMetadata ? 4 : 5;
/*     */     } else {
/* 462 */       state.runningState = 2;
/*     */     } 
/*     */     
/* 465 */     if (state.isMetadata) {
/*     */       return;
/*     */     }
/* 468 */     state.expectedTotalSize += state.metaBlockLength;
/* 469 */     if (state.ringBufferSize < state.maxRingBufferSize) {
/* 470 */       maybeReallocateRingBuffer(state);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void readMetablockHuffmanCodesAndContextMaps(State state) {
/* 475 */     BitReader br = state.br;
/*     */     
/* 477 */     for (int i = 0; i < 3; i++) {
/* 478 */       state.numBlockTypes[i] = decodeVarLenUnsignedByte(br) + 1;
/* 479 */       state.blockLength[i] = 268435456;
/* 480 */       if (state.numBlockTypes[i] > 1) {
/* 481 */         readHuffmanCode(state.numBlockTypes[i] + 2, state.blockTypeTrees, i * 1080, br);
/*     */         
/* 483 */         readHuffmanCode(26, state.blockLenTrees, i * 1080, br);
/*     */         
/* 485 */         state.blockLength[i] = readBlockLength(state.blockLenTrees, i * 1080, br);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 490 */     BitReader.readMoreInput(br);
/* 491 */     state.distancePostfixBits = BitReader.readBits(br, 2);
/* 492 */     state
/* 493 */       .numDirectDistanceCodes = 16 + (BitReader.readBits(br, 4) << state.distancePostfixBits);
/* 494 */     state.distancePostfixMask = (1 << state.distancePostfixBits) - 1;
/* 495 */     int numDistanceCodes = state.numDirectDistanceCodes + (48 << state.distancePostfixBits);
/*     */     
/* 497 */     state.contextModes = new byte[state.numBlockTypes[0]];
/* 498 */     for (int k = 0; k < state.numBlockTypes[0]; ) {
/*     */       
/* 500 */       int limit = Math.min(k + 96, state.numBlockTypes[0]);
/* 501 */       for (; k < limit; k++) {
/* 502 */         state.contextModes[k] = (byte)(BitReader.readBits(br, 2) << 1);
/*     */       }
/* 504 */       BitReader.readMoreInput(br);
/*     */     } 
/*     */ 
/*     */     
/* 508 */     state.contextMap = new byte[state.numBlockTypes[0] << 6];
/* 509 */     int numLiteralTrees = decodeContextMap(state.numBlockTypes[0] << 6, state.contextMap, br);
/*     */     
/* 511 */     state.trivialLiteralContext = true;
/* 512 */     for (int j = 0; j < state.numBlockTypes[0] << 6; j++) {
/* 513 */       if (state.contextMap[j] != j >> 6) {
/* 514 */         state.trivialLiteralContext = false;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*     */     
/* 520 */     state.distContextMap = new byte[state.numBlockTypes[2] << 2];
/* 521 */     int numDistTrees = decodeContextMap(state.numBlockTypes[2] << 2, state.distContextMap, br);
/*     */ 
/*     */     
/* 524 */     HuffmanTreeGroup.init(state.hGroup0, 256, numLiteralTrees);
/* 525 */     HuffmanTreeGroup.init(state.hGroup1, 704, state.numBlockTypes[1]);
/* 526 */     HuffmanTreeGroup.init(state.hGroup2, numDistanceCodes, numDistTrees);
/*     */     
/* 528 */     HuffmanTreeGroup.decode(state.hGroup0, br);
/* 529 */     HuffmanTreeGroup.decode(state.hGroup1, br);
/* 530 */     HuffmanTreeGroup.decode(state.hGroup2, br);
/*     */     
/* 532 */     state.contextMapSlice = 0;
/* 533 */     state.distContextMapSlice = 0;
/* 534 */     state.contextLookupOffset1 = Context.LOOKUP_OFFSETS[state.contextModes[0]];
/* 535 */     state.contextLookupOffset2 = Context.LOOKUP_OFFSETS[state.contextModes[0] + 1];
/* 536 */     state.literalTreeIndex = 0;
/* 537 */     state.literalTree = state.hGroup0.trees[0];
/* 538 */     state.treeCommandOffset = state.hGroup1.trees[0];
/*     */     
/* 540 */     state.blockTypeRb[4] = 1; state.blockTypeRb[2] = 1; state.blockTypeRb[0] = 1;
/* 541 */     state.blockTypeRb[5] = 0; state.blockTypeRb[3] = 0; state.blockTypeRb[1] = 0;
/*     */   }
/*     */   
/*     */   private static void copyUncompressedData(State state) {
/* 545 */     BitReader br = state.br;
/* 546 */     byte[] ringBuffer = state.ringBuffer;
/*     */ 
/*     */     
/* 549 */     if (state.metaBlockLength <= 0) {
/* 550 */       BitReader.reload(br);
/* 551 */       state.runningState = 1;
/*     */       
/*     */       return;
/*     */     } 
/* 555 */     int chunkLength = Math.min(state.ringBufferSize - state.pos, state.metaBlockLength);
/* 556 */     BitReader.copyBytes(br, ringBuffer, state.pos, chunkLength);
/* 557 */     state.metaBlockLength -= chunkLength;
/* 558 */     state.pos += chunkLength;
/* 559 */     if (state.pos == state.ringBufferSize) {
/* 560 */       state.nextRunningState = 5;
/* 561 */       state.bytesToWrite = state.ringBufferSize;
/* 562 */       state.bytesWritten = 0;
/* 563 */       state.runningState = 12;
/*     */       
/*     */       return;
/*     */     } 
/* 567 */     BitReader.reload(br);
/* 568 */     state.runningState = 1;
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean writeRingBuffer(State state) {
/* 573 */     if (state.bytesToIgnore != 0) {
/* 574 */       state.bytesWritten += state.bytesToIgnore;
/* 575 */       state.bytesToIgnore = 0;
/*     */     } 
/* 577 */     int toWrite = Math.min(state.outputLength - state.outputUsed, state.bytesToWrite - state.bytesWritten);
/*     */     
/* 579 */     if (toWrite != 0) {
/* 580 */       System.arraycopy(state.ringBuffer, state.bytesWritten, state.output, state.outputOffset + state.outputUsed, toWrite);
/*     */       
/* 582 */       state.outputUsed += toWrite;
/* 583 */       state.bytesWritten += toWrite;
/*     */     } 
/*     */     
/* 586 */     return (state.outputUsed < state.outputLength);
/*     */   }
/*     */   
/*     */   static void setCustomDictionary(State state, byte[] data) {
/* 590 */     state.customDictionary = (data == null) ? new byte[0] : data;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void decompress(State state) {
/* 597 */     if (state.runningState == 0) {
/* 598 */       throw new IllegalStateException("Can't decompress until initialized");
/*     */     }
/* 600 */     if (state.runningState == 11) {
/* 601 */       throw new IllegalStateException("Can't decompress after close");
/*     */     }
/* 603 */     BitReader br = state.br;
/* 604 */     int ringBufferMask = state.ringBufferSize - 1;
/* 605 */     byte[] ringBuffer = state.ringBuffer;
/*     */     
/* 607 */     while (state.runningState != 10) {
/*     */       int cmdCode; int rangeIdx; int insertCode; int copyCode; int src; int dst; int copyLength;
/* 609 */       switch (state.runningState) {
/*     */         case 1:
/* 611 */           if (state.metaBlockLength < 0) {
/* 612 */             throw new BrotliRuntimeException("Invalid metablock length");
/*     */           }
/* 614 */           readMetablockInfo(state);
/*     */           
/* 616 */           ringBufferMask = state.ringBufferSize - 1;
/* 617 */           ringBuffer = state.ringBuffer;
/*     */           continue;
/*     */         
/*     */         case 2:
/* 621 */           readMetablockHuffmanCodesAndContextMaps(state);
/* 622 */           state.runningState = 3;
/*     */ 
/*     */         
/*     */         case 3:
/* 626 */           if (state.metaBlockLength <= 0) {
/* 627 */             state.runningState = 1;
/*     */             continue;
/*     */           } 
/* 630 */           BitReader.readMoreInput(br);
/* 631 */           if (state.blockLength[1] == 0) {
/* 632 */             decodeCommandBlockSwitch(state);
/*     */           }
/* 634 */           state.blockLength[1] = state.blockLength[1] - 1;
/* 635 */           BitReader.fillBitWindow(br);
/* 636 */           cmdCode = readSymbol(state.hGroup1.codes, state.treeCommandOffset, br);
/* 637 */           rangeIdx = cmdCode >>> 6;
/* 638 */           state.distanceCode = 0;
/* 639 */           if (rangeIdx >= 2) {
/* 640 */             rangeIdx -= 2;
/* 641 */             state.distanceCode = -1;
/*     */           } 
/* 643 */           insertCode = Prefix.INSERT_RANGE_LUT[rangeIdx] + (cmdCode >>> 3 & 0x7);
/* 644 */           copyCode = Prefix.COPY_RANGE_LUT[rangeIdx] + (cmdCode & 0x7);
/* 645 */           state
/* 646 */             .insertLength = Prefix.INSERT_LENGTH_OFFSET[insertCode] + BitReader.readBits(br, Prefix.INSERT_LENGTH_N_BITS[insertCode]);
/* 647 */           state
/* 648 */             .copyLength = Prefix.COPY_LENGTH_OFFSET[copyCode] + BitReader.readBits(br, Prefix.COPY_LENGTH_N_BITS[copyCode]);
/*     */           
/* 650 */           state.j = 0;
/* 651 */           state.runningState = 6;
/*     */ 
/*     */         
/*     */         case 6:
/* 655 */           if (state.trivialLiteralContext) {
/* 656 */             while (state.j < state.insertLength) {
/* 657 */               BitReader.readMoreInput(br);
/* 658 */               if (state.blockLength[0] == 0) {
/* 659 */                 decodeLiteralBlockSwitch(state);
/*     */               }
/* 661 */               state.blockLength[0] = state.blockLength[0] - 1;
/* 662 */               BitReader.fillBitWindow(br);
/* 663 */               ringBuffer[state.pos] = 
/* 664 */                 (byte)readSymbol(state.hGroup0.codes, state.literalTree, br);
/* 665 */               state.j++;
/* 666 */               if (state.pos++ == ringBufferMask) {
/* 667 */                 state.nextRunningState = 6;
/* 668 */                 state.bytesToWrite = state.ringBufferSize;
/* 669 */                 state.bytesWritten = 0;
/* 670 */                 state.runningState = 12;
/*     */                 break;
/*     */               } 
/*     */             } 
/*     */           } else {
/* 675 */             int prevByte1 = ringBuffer[state.pos - 1 & ringBufferMask] & 0xFF;
/* 676 */             int prevByte2 = ringBuffer[state.pos - 2 & ringBufferMask] & 0xFF;
/* 677 */             while (state.j < state.insertLength) {
/* 678 */               BitReader.readMoreInput(br);
/* 679 */               if (state.blockLength[0] == 0) {
/* 680 */                 decodeLiteralBlockSwitch(state);
/*     */               }
/* 682 */               int literalTreeIndex = state.contextMap[state.contextMapSlice + (Context.LOOKUP[state.contextLookupOffset1 + prevByte1] | Context.LOOKUP[state.contextLookupOffset2 + prevByte2])] & 0xFF;
/*     */ 
/*     */               
/* 685 */               state.blockLength[0] = state.blockLength[0] - 1;
/* 686 */               prevByte2 = prevByte1;
/* 687 */               BitReader.fillBitWindow(br);
/* 688 */               prevByte1 = readSymbol(state.hGroup0.codes, state.hGroup0.trees[literalTreeIndex], br);
/*     */               
/* 690 */               ringBuffer[state.pos] = (byte)prevByte1;
/* 691 */               state.j++;
/* 692 */               if (state.pos++ == ringBufferMask) {
/* 693 */                 state.nextRunningState = 6;
/* 694 */                 state.bytesToWrite = state.ringBufferSize;
/* 695 */                 state.bytesWritten = 0;
/* 696 */                 state.runningState = 12;
/*     */                 break;
/*     */               } 
/*     */             } 
/*     */           } 
/* 701 */           if (state.runningState != 6) {
/*     */             continue;
/*     */           }
/* 704 */           state.metaBlockLength -= state.insertLength;
/* 705 */           if (state.metaBlockLength <= 0) {
/* 706 */             state.runningState = 3;
/*     */             continue;
/*     */           } 
/* 709 */           if (state.distanceCode < 0) {
/* 710 */             BitReader.readMoreInput(br);
/* 711 */             if (state.blockLength[2] == 0) {
/* 712 */               decodeDistanceBlockSwitch(state);
/*     */             }
/* 714 */             state.blockLength[2] = state.blockLength[2] - 1;
/* 715 */             BitReader.fillBitWindow(br);
/* 716 */             state.distanceCode = readSymbol(state.hGroup2.codes, state.hGroup2.trees[state.distContextMap[state.distContextMapSlice + ((state.copyLength > 4) ? 3 : (state.copyLength - 2))] & 0xFF], br);
/*     */ 
/*     */             
/* 719 */             if (state.distanceCode >= state.numDirectDistanceCodes) {
/* 720 */               state.distanceCode -= state.numDirectDistanceCodes;
/* 721 */               int postfix = state.distanceCode & state.distancePostfixMask;
/* 722 */               state.distanceCode >>>= state.distancePostfixBits;
/* 723 */               int n = (state.distanceCode >>> 1) + 1;
/* 724 */               int offset = (2 + (state.distanceCode & 0x1) << n) - 4;
/* 725 */               state
/* 726 */                 .distanceCode = state.numDirectDistanceCodes + postfix + (offset + BitReader.readBits(br, n) << state.distancePostfixBits);
/*     */             } 
/*     */           } 
/*     */ 
/*     */ 
/*     */           
/* 732 */           state.distance = translateShortCodes(state.distanceCode, state.distRb, state.distRbIdx);
/* 733 */           if (state.distance < 0) {
/* 734 */             throw new BrotliRuntimeException("Negative distance");
/*     */           }
/*     */           
/* 737 */           if (state.maxDistance != state.maxBackwardDistance && state.pos < state.maxBackwardDistance) {
/*     */             
/* 739 */             state.maxDistance = state.pos;
/*     */           } else {
/* 741 */             state.maxDistance = state.maxBackwardDistance;
/*     */           } 
/*     */           
/* 744 */           state.copyDst = state.pos;
/* 745 */           if (state.distance > state.maxDistance) {
/* 746 */             state.runningState = 9;
/*     */             
/*     */             continue;
/*     */           } 
/* 750 */           if (state.distanceCode > 0) {
/* 751 */             state.distRb[state.distRbIdx & 0x3] = state.distance;
/* 752 */             state.distRbIdx++;
/*     */           } 
/*     */           
/* 755 */           if (state.copyLength > state.metaBlockLength) {
/* 756 */             throw new BrotliRuntimeException("Invalid backward reference");
/*     */           }
/* 758 */           state.j = 0;
/* 759 */           state.runningState = 7;
/*     */         
/*     */         case 7:
/* 762 */           src = state.pos - state.distance & ringBufferMask;
/* 763 */           dst = state.pos;
/* 764 */           copyLength = state.copyLength - state.j;
/* 765 */           if (src + copyLength < ringBufferMask && dst + copyLength < ringBufferMask) {
/* 766 */             for (int k = 0; k < copyLength; k++) {
/* 767 */               ringBuffer[dst++] = ringBuffer[src++];
/*     */             }
/* 769 */             state.j += copyLength;
/* 770 */             state.metaBlockLength -= copyLength;
/* 771 */             state.pos += copyLength;
/*     */           } else {
/* 773 */             while (state.j < state.copyLength) {
/* 774 */               ringBuffer[state.pos] = ringBuffer[state.pos - state.distance & ringBufferMask];
/*     */               
/* 776 */               state.metaBlockLength--;
/* 777 */               state.j++;
/* 778 */               if (state.pos++ == ringBufferMask) {
/* 779 */                 state.nextRunningState = 7;
/* 780 */                 state.bytesToWrite = state.ringBufferSize;
/* 781 */                 state.bytesWritten = 0;
/* 782 */                 state.runningState = 12;
/*     */                 break;
/*     */               } 
/*     */             } 
/*     */           } 
/* 787 */           if (state.runningState == 7) {
/* 788 */             state.runningState = 3;
/*     */           }
/*     */           continue;
/*     */         
/*     */         case 9:
/* 793 */           if (state.copyLength >= 4 && state.copyLength <= 24) {
/*     */             
/* 795 */             int offset = Dictionary.OFFSETS_BY_LENGTH[state.copyLength];
/* 796 */             int wordId = state.distance - state.maxDistance - 1;
/* 797 */             int shift = Dictionary.SIZE_BITS_BY_LENGTH[state.copyLength];
/* 798 */             int mask = (1 << shift) - 1;
/* 799 */             int wordIdx = wordId & mask;
/* 800 */             int transformIdx = wordId >>> shift;
/* 801 */             offset += wordIdx * state.copyLength;
/* 802 */             if (transformIdx < Transform.TRANSFORMS.length) {
/* 803 */               int len = Transform.transformDictionaryWord(ringBuffer, state.copyDst, 
/* 804 */                   Dictionary.getData(), offset, state.copyLength, Transform.TRANSFORMS[transformIdx]);
/*     */               
/* 806 */               state.copyDst += len;
/* 807 */               state.pos += len;
/* 808 */               state.metaBlockLength -= len;
/* 809 */               if (state.copyDst >= state.ringBufferSize) {
/* 810 */                 state.nextRunningState = 8;
/* 811 */                 state.bytesToWrite = state.ringBufferSize;
/* 812 */                 state.bytesWritten = 0;
/* 813 */                 state.runningState = 12;
/*     */                 continue;
/*     */               } 
/*     */             } else {
/* 817 */               throw new BrotliRuntimeException("Invalid backward reference");
/*     */             } 
/*     */           } else {
/* 820 */             throw new BrotliRuntimeException("Invalid backward reference");
/*     */           } 
/* 822 */           state.runningState = 3;
/*     */           continue;
/*     */         
/*     */         case 8:
/* 826 */           System.arraycopy(ringBuffer, state.ringBufferSize, ringBuffer, 0, state.copyDst - state.ringBufferSize);
/*     */           
/* 828 */           state.runningState = 3;
/*     */           continue;
/*     */         
/*     */         case 4:
/* 832 */           while (state.metaBlockLength > 0) {
/* 833 */             BitReader.readMoreInput(br);
/*     */             
/* 835 */             BitReader.readBits(br, 8);
/* 836 */             state.metaBlockLength--;
/*     */           } 
/* 838 */           state.runningState = 1;
/*     */           continue;
/*     */ 
/*     */         
/*     */         case 5:
/* 843 */           copyUncompressedData(state);
/*     */           continue;
/*     */         
/*     */         case 12:
/* 847 */           if (!writeRingBuffer(state)) {
/*     */             return;
/*     */           }
/*     */           
/* 851 */           if (state.pos >= state.maxBackwardDistance) {
/* 852 */             state.maxDistance = state.maxBackwardDistance;
/*     */           }
/* 854 */           state.pos &= ringBufferMask;
/* 855 */           state.runningState = state.nextRunningState;
/*     */           continue;
/*     */       } 
/*     */       
/* 859 */       throw new BrotliRuntimeException("Unexpected state " + state.runningState);
/*     */     } 
/*     */     
/* 862 */     if (state.runningState == 10) {
/* 863 */       if (state.metaBlockLength < 0) {
/* 864 */         throw new BrotliRuntimeException("Invalid metablock length");
/*     */       }
/* 866 */       BitReader.jumpToByteBoundary(br);
/* 867 */       BitReader.checkHealth(state.br, true);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\brotli\dec\Decode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */