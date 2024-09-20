/*    */ package com.install4j.runtime.installer.helper.content.xz.rangecoder;
/*    */ 
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class RangeDecoder
/*    */   extends RangeCoder
/*    */ {
/* 16 */   int range = 0;
/* 17 */   int code = 0;
/*    */ 
/*    */   
/*    */   public int decodeBit(short[] probs, int index) throws IOException {
/*    */     int bit;
/* 22 */     normalize();
/*    */     
/* 24 */     int prob = probs[index];
/* 25 */     int bound = (this.range >>> 11) * prob;
/*    */ 
/*    */ 
/*    */     
/* 29 */     if ((this.code ^ Integer.MIN_VALUE) < (bound ^ Integer.MIN_VALUE)) {
/* 30 */       this.range = bound;
/* 31 */       probs[index] = (short)(prob + (2048 - prob >>> 5));
/*    */       
/* 33 */       bit = 0;
/*    */     } else {
/* 35 */       this.range -= bound;
/* 36 */       this.code -= bound;
/* 37 */       probs[index] = (short)(prob - (prob >>> 5));
/* 38 */       bit = 1;
/*    */     } 
/*    */     
/* 41 */     return bit;
/*    */   }
/*    */   public abstract void normalize() throws IOException;
/*    */   public int decodeBitTree(short[] probs) throws IOException {
/* 45 */     int symbol = 1;
/*    */     
/*    */     do {
/* 48 */       symbol = symbol << 1 | decodeBit(probs, symbol);
/* 49 */     } while (symbol < probs.length);
/*    */     
/* 51 */     return symbol - probs.length;
/*    */   }
/*    */   
/*    */   public int decodeReverseBitTree(short[] probs) throws IOException {
/* 55 */     int symbol = 1;
/* 56 */     int i = 0;
/* 57 */     int result = 0;
/*    */     
/*    */     do {
/* 60 */       int bit = decodeBit(probs, symbol);
/* 61 */       symbol = symbol << 1 | bit;
/* 62 */       result |= bit << i++;
/* 63 */     } while (symbol < probs.length);
/*    */     
/* 65 */     return result;
/*    */   }
/*    */   
/*    */   public int decodeDirectBits(int count) throws IOException {
/* 69 */     int result = 0;
/*    */     
/*    */     do {
/* 72 */       normalize();
/*    */       
/* 74 */       this.range >>>= 1;
/* 75 */       int t = this.code - this.range >>> 31;
/* 76 */       this.code -= this.range & t - 1;
/* 77 */       result = result << 1 | 1 - t;
/* 78 */     } while (--count != 0);
/*    */     
/* 80 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\xz\rangecoder\RangeDecoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */