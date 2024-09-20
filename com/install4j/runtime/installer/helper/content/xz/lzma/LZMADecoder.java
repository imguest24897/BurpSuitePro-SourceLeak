/*     */ package com.install4j.runtime.installer.helper.content.xz.lzma;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.content.xz.lz.LZDecoder;
/*     */ import com.install4j.runtime.installer.helper.content.xz.rangecoder.RangeDecoder;
/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class LZMADecoder
/*     */   extends LZMACoder
/*     */ {
/*     */   private final LZDecoder lz;
/*     */   private final RangeDecoder rc;
/*     */   private final LiteralDecoder literalDecoder;
/*  22 */   private final LengthDecoder matchLenDecoder = new LengthDecoder();
/*  23 */   private final LengthDecoder repLenDecoder = new LengthDecoder();
/*     */   
/*     */   public LZMADecoder(LZDecoder lz, RangeDecoder rc, int lc, int lp, int pb) {
/*  26 */     super(pb);
/*  27 */     this.lz = lz;
/*  28 */     this.rc = rc;
/*  29 */     this.literalDecoder = new LiteralDecoder(lc, lp);
/*  30 */     reset();
/*     */   }
/*     */ 
/*     */   
/*     */   public void reset() {
/*  35 */     super.reset();
/*  36 */     this.literalDecoder.reset();
/*  37 */     this.matchLenDecoder.reset();
/*  38 */     this.repLenDecoder.reset();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean endMarkerDetected() {
/*  48 */     return (this.reps[0] == -1);
/*     */   }
/*     */   
/*     */   public void decode() throws IOException {
/*  52 */     this.lz.repeatPending();
/*     */     
/*  54 */     while (this.lz.hasSpace()) {
/*  55 */       int posState = this.lz.getPos() & this.posMask;
/*     */       
/*  57 */       if (this.rc.decodeBit(this.isMatch[this.state.get()], posState) == 0) {
/*  58 */         this.literalDecoder.decode();
/*     */         
/*     */         continue;
/*     */       } 
/*  62 */       int len = (this.rc.decodeBit(this.isRep, this.state.get()) == 0) ? decodeMatch(posState) : decodeRepMatch(posState);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  67 */       this.lz.repeat(this.reps[0], len);
/*     */     } 
/*     */ 
/*     */     
/*  71 */     this.rc.normalize();
/*     */   }
/*     */   
/*     */   private int decodeMatch(int posState) throws IOException {
/*  75 */     this.state.updateMatch();
/*     */     
/*  77 */     this.reps[3] = this.reps[2];
/*  78 */     this.reps[2] = this.reps[1];
/*  79 */     this.reps[1] = this.reps[0];
/*     */     
/*  81 */     int len = this.matchLenDecoder.decode(posState);
/*  82 */     int distSlot = this.rc.decodeBitTree(this.distSlots[getDistState(len)]);
/*     */     
/*  84 */     if (distSlot < 4) {
/*  85 */       this.reps[0] = distSlot;
/*     */     } else {
/*  87 */       int limit = (distSlot >> 1) - 1;
/*  88 */       this.reps[0] = (0x2 | distSlot & 0x1) << limit;
/*     */       
/*  90 */       if (distSlot < 14) {
/*  91 */         this.reps[0] = this.reps[0] | this.rc.decodeReverseBitTree(this.distSpecial[distSlot - 4]);
/*     */       } else {
/*     */         
/*  94 */         this.reps[0] = this.reps[0] | this.rc.decodeDirectBits(limit - 4) << 4;
/*     */         
/*  96 */         this.reps[0] = this.reps[0] | this.rc.decodeReverseBitTree(this.distAlign);
/*     */       } 
/*     */     } 
/*     */     
/* 100 */     return len;
/*     */   }
/*     */   
/*     */   private int decodeRepMatch(int posState) throws IOException {
/* 104 */     if (this.rc.decodeBit(this.isRep0, this.state.get()) == 0) {
/* 105 */       if (this.rc.decodeBit(this.isRep0Long[this.state.get()], posState) == 0) {
/* 106 */         this.state.updateShortRep();
/* 107 */         return 1;
/*     */       } 
/*     */     } else {
/*     */       int tmp;
/*     */       
/* 112 */       if (this.rc.decodeBit(this.isRep1, this.state.get()) == 0) {
/* 113 */         tmp = this.reps[1];
/*     */       } else {
/* 115 */         if (this.rc.decodeBit(this.isRep2, this.state.get()) == 0) {
/* 116 */           tmp = this.reps[2];
/*     */         } else {
/* 118 */           tmp = this.reps[3];
/* 119 */           this.reps[3] = this.reps[2];
/*     */         } 
/*     */         
/* 122 */         this.reps[2] = this.reps[1];
/*     */       } 
/*     */       
/* 125 */       this.reps[1] = this.reps[0];
/* 126 */       this.reps[0] = tmp;
/*     */     } 
/*     */     
/* 129 */     this.state.updateLongRep();
/*     */     
/* 131 */     return this.repLenDecoder.decode(posState);
/*     */   }
/*     */   
/*     */   private class LiteralDecoder
/*     */     extends LZMACoder.LiteralCoder {
/*     */     private final LiteralSubdecoder[] subdecoders;
/*     */     
/*     */     LiteralDecoder(int lc, int lp) {
/* 139 */       super(lc, lp);
/*     */       
/* 141 */       this.subdecoders = new LiteralSubdecoder[1 << lc + lp];
/* 142 */       for (int i = 0; i < this.subdecoders.length; i++)
/* 143 */         this.subdecoders[i] = new LiteralSubdecoder(); 
/*     */     }
/*     */     
/*     */     void reset() {
/* 147 */       for (int i = 0; i < this.subdecoders.length; i++)
/* 148 */         this.subdecoders[i].reset(); 
/*     */     }
/*     */     
/*     */     void decode() throws IOException {
/* 152 */       int i = getSubcoderIndex(LZMADecoder.this.lz.getByte(0), LZMADecoder.this.lz.getPos());
/* 153 */       this.subdecoders[i].decode();
/*     */     }
/*     */     
/*     */     private class LiteralSubdecoder
/*     */       extends LZMACoder.LiteralCoder.LiteralSubcoder {
/*     */       void decode() throws IOException {
/* 159 */         int symbol = 1;
/*     */         
/* 161 */         if (LZMADecoder.this.state.isLiteral()) {
/*     */           do {
/* 163 */             symbol = symbol << 1 | LZMADecoder.this.rc.decodeBit(this.probs, symbol);
/* 164 */           } while (symbol < 256);
/*     */         } else {
/*     */           
/* 167 */           int matchByte = LZMADecoder.this.lz.getByte(LZMADecoder.this.reps[0]);
/* 168 */           int offset = 256;
/*     */ 
/*     */ 
/*     */           
/*     */           do {
/* 173 */             matchByte <<= 1;
/* 174 */             int matchBit = matchByte & offset;
/* 175 */             int bit = LZMADecoder.this.rc.decodeBit(this.probs, offset + matchBit + symbol);
/* 176 */             symbol = symbol << 1 | bit;
/* 177 */             offset &= 0 - bit ^ matchBit ^ 0xFFFFFFFF;
/* 178 */           } while (symbol < 256);
/*     */         } 
/*     */         
/* 181 */         LZMADecoder.this.lz.putByte((byte)symbol);
/* 182 */         LZMADecoder.this.state.updateLiteral();
/*     */       }
/*     */       
/*     */       private LiteralSubdecoder() {} } }
/*     */   
/*     */   private class LengthDecoder extends LZMACoder.LengthCoder { private LengthDecoder() {}
/*     */     
/*     */     int decode(int posState) throws IOException {
/* 190 */       if (LZMADecoder.this.rc.decodeBit(this.choice, 0) == 0) {
/* 191 */         return LZMADecoder.this.rc.decodeBitTree(this.low[posState]) + 2;
/*     */       }
/* 193 */       if (LZMADecoder.this.rc.decodeBit(this.choice, 1) == 0) {
/* 194 */         return LZMADecoder.this.rc.decodeBitTree(this.mid[posState]) + 2 + 8;
/*     */       }
/*     */       
/* 197 */       return LZMADecoder.this.rc.decodeBitTree(this.high) + 2 + 8 + 8;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\xz\lzma\LZMADecoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */