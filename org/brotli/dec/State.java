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
/*     */ final class State
/*     */ {
/*  17 */   int runningState = 0;
/*     */   int nextRunningState;
/*  19 */   final BitReader br = new BitReader();
/*     */   byte[] ringBuffer;
/*  21 */   final int[] blockTypeTrees = new int[3240];
/*  22 */   final int[] blockLenTrees = new int[3240];
/*     */   
/*     */   int metaBlockLength;
/*     */   
/*     */   boolean inputEnd;
/*     */   
/*     */   boolean isUncompressed;
/*     */   boolean isMetadata;
/*  30 */   final HuffmanTreeGroup hGroup0 = new HuffmanTreeGroup();
/*  31 */   final HuffmanTreeGroup hGroup1 = new HuffmanTreeGroup();
/*  32 */   final HuffmanTreeGroup hGroup2 = new HuffmanTreeGroup();
/*  33 */   final int[] blockLength = new int[3];
/*  34 */   final int[] numBlockTypes = new int[3];
/*  35 */   final int[] blockTypeRb = new int[6];
/*  36 */   final int[] distRb = new int[] { 16, 15, 11, 4 };
/*  37 */   int pos = 0;
/*  38 */   int maxDistance = 0;
/*  39 */   int distRbIdx = 0;
/*     */   boolean trivialLiteralContext = false;
/*  41 */   int literalTreeIndex = 0;
/*     */   int literalTree;
/*     */   int j;
/*     */   int insertLength;
/*     */   byte[] contextModes;
/*     */   byte[] contextMap;
/*     */   int contextMapSlice;
/*     */   int distContextMapSlice;
/*     */   int contextLookupOffset1;
/*     */   int contextLookupOffset2;
/*     */   int treeCommandOffset;
/*     */   int distanceCode;
/*     */   byte[] distContextMap;
/*     */   int numDirectDistanceCodes;
/*     */   int distancePostfixMask;
/*     */   int distancePostfixBits;
/*     */   int distance;
/*     */   int copyLength;
/*     */   int copyDst;
/*     */   int maxBackwardDistance;
/*     */   int maxRingBufferSize;
/*  62 */   int ringBufferSize = 0;
/*  63 */   long expectedTotalSize = 0L;
/*  64 */   byte[] customDictionary = new byte[0];
/*  65 */   int bytesToIgnore = 0;
/*     */   
/*     */   int outputOffset;
/*     */   
/*     */   int outputLength;
/*     */   int outputUsed;
/*     */   int bytesWritten;
/*     */   int bytesToWrite;
/*     */   byte[] output;
/*     */   
/*     */   private static int decodeWindowBits(BitReader br) {
/*  76 */     if (BitReader.readBits(br, 1) == 0) {
/*  77 */       return 16;
/*     */     }
/*  79 */     int n = BitReader.readBits(br, 3);
/*  80 */     if (n != 0) {
/*  81 */       return 17 + n;
/*     */     }
/*  83 */     n = BitReader.readBits(br, 3);
/*  84 */     if (n != 0) {
/*  85 */       return 8 + n;
/*     */     }
/*  87 */     return 17;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void setInput(State state, InputStream input) {
/*  97 */     if (state.runningState != 0) {
/*  98 */       throw new IllegalStateException("State MUST be uninitialized");
/*     */     }
/* 100 */     BitReader.init(state.br, input);
/* 101 */     int windowBits = decodeWindowBits(state.br);
/* 102 */     if (windowBits == 9) {
/* 103 */       throw new BrotliRuntimeException("Invalid 'windowBits' code");
/*     */     }
/* 105 */     state.maxRingBufferSize = 1 << windowBits;
/* 106 */     state.maxBackwardDistance = state.maxRingBufferSize - 16;
/* 107 */     state.runningState = 1;
/*     */   }
/*     */   
/*     */   static void close(State state) throws IOException {
/* 111 */     if (state.runningState == 0) {
/* 112 */       throw new IllegalStateException("State MUST be initialized");
/*     */     }
/* 114 */     if (state.runningState == 11) {
/*     */       return;
/*     */     }
/* 117 */     state.runningState = 11;
/* 118 */     BitReader.close(state.br);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\brotli\dec\State.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */