/*     */ package com.install4j.runtime.installer.helper.content.xz.lzma;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.content.xz.rangecoder.RangeCoder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ abstract class LZMACoder
/*     */ {
/*     */   static final int POS_STATES_MAX = 16;
/*     */   static final int MATCH_LEN_MIN = 2;
/*     */   static final int MATCH_LEN_MAX = 273;
/*     */   static final int DIST_STATES = 4;
/*     */   static final int DIST_SLOTS = 64;
/*     */   static final int DIST_MODEL_START = 4;
/*     */   static final int DIST_MODEL_END = 14;
/*     */   static final int FULL_DISTANCES = 128;
/*     */   static final int ALIGN_BITS = 4;
/*     */   static final int ALIGN_SIZE = 16;
/*     */   static final int ALIGN_MASK = 15;
/*     */   static final int REPS = 4;
/*     */   final int posMask;
/*  37 */   final int[] reps = new int[4];
/*  38 */   final State state = new State();
/*     */   
/*  40 */   final short[][] isMatch = new short[12][16];
/*  41 */   final short[] isRep = new short[12];
/*  42 */   final short[] isRep0 = new short[12];
/*  43 */   final short[] isRep1 = new short[12];
/*  44 */   final short[] isRep2 = new short[12];
/*  45 */   final short[][] isRep0Long = new short[12][16];
/*  46 */   final short[][] distSlots = new short[4][64];
/*  47 */   final short[][] distSpecial = new short[][] { new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32] };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  52 */   final short[] distAlign = new short[16];
/*     */   
/*     */   static final int getDistState(int len) {
/*  55 */     return (len < 6) ? (
/*  56 */       len - 2) : 
/*  57 */       3;
/*     */   }
/*     */   
/*     */   LZMACoder(int pb) {
/*  61 */     this.posMask = (1 << pb) - 1;
/*     */   }
/*     */   
/*     */   void reset() {
/*  65 */     this.reps[0] = 0;
/*  66 */     this.reps[1] = 0;
/*  67 */     this.reps[2] = 0;
/*  68 */     this.reps[3] = 0;
/*  69 */     this.state.reset();
/*     */     int i;
/*  71 */     for (i = 0; i < this.isMatch.length; i++) {
/*  72 */       RangeCoder.initProbs(this.isMatch[i]);
/*     */     }
/*  74 */     RangeCoder.initProbs(this.isRep);
/*  75 */     RangeCoder.initProbs(this.isRep0);
/*  76 */     RangeCoder.initProbs(this.isRep1);
/*  77 */     RangeCoder.initProbs(this.isRep2);
/*     */     
/*  79 */     for (i = 0; i < this.isRep0Long.length; i++) {
/*  80 */       RangeCoder.initProbs(this.isRep0Long[i]);
/*     */     }
/*  82 */     for (i = 0; i < this.distSlots.length; i++) {
/*  83 */       RangeCoder.initProbs(this.distSlots[i]);
/*     */     }
/*  85 */     for (i = 0; i < this.distSpecial.length; i++) {
/*  86 */       RangeCoder.initProbs(this.distSpecial[i]);
/*     */     }
/*  88 */     RangeCoder.initProbs(this.distAlign);
/*     */   }
/*     */   
/*     */   abstract class LiteralCoder
/*     */   {
/*     */     private final int lc;
/*     */     private final int literalPosMask;
/*     */     
/*     */     LiteralCoder(int lc, int lp) {
/*  97 */       this.lc = lc;
/*  98 */       this.literalPosMask = (1 << lp) - 1;
/*     */     }
/*     */     
/*     */     final int getSubcoderIndex(int prevByte, int pos) {
/* 102 */       int low = prevByte >> 8 - this.lc;
/* 103 */       int high = (pos & this.literalPosMask) << this.lc;
/* 104 */       return low + high;
/*     */     }
/*     */     
/*     */     abstract class LiteralSubcoder
/*     */     {
/* 109 */       final short[] probs = new short[768];
/*     */       
/*     */       void reset() {
/* 112 */         RangeCoder.initProbs(this.probs);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   abstract class LengthCoder
/*     */   {
/*     */     static final int LOW_SYMBOLS = 8;
/*     */     static final int MID_SYMBOLS = 8;
/*     */     static final int HIGH_SYMBOLS = 256;
/* 123 */     final short[] choice = new short[2];
/* 124 */     final short[][] low = new short[16][8];
/* 125 */     final short[][] mid = new short[16][8];
/* 126 */     final short[] high = new short[256];
/*     */     
/*     */     void reset() {
/* 129 */       RangeCoder.initProbs(this.choice);
/*     */       int i;
/* 131 */       for (i = 0; i < this.low.length; i++) {
/* 132 */         RangeCoder.initProbs(this.low[i]);
/*     */       }
/* 134 */       for (i = 0; i < this.low.length; i++) {
/* 135 */         RangeCoder.initProbs(this.mid[i]);
/*     */       }
/* 137 */       RangeCoder.initProbs(this.high);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\xz\lzma\LZMACoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */