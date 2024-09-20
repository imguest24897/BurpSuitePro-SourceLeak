/*    */ package com.install4j.runtime.installer.helper.content.xz.rangecoder;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class RangeCoder
/*    */ {
/*    */   static final int SHIFT_BITS = 8;
/*    */   static final int TOP_MASK = -16777216;
/*    */   static final int BIT_MODEL_TOTAL_BITS = 11;
/*    */   static final int BIT_MODEL_TOTAL = 2048;
/*    */   static final short PROB_INIT = 1024;
/*    */   static final int MOVE_BITS = 5;
/*    */   
/*    */   public static final void initProbs(short[] probs) {
/* 24 */     Arrays.fill(probs, (short)1024);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\xz\rangecoder\RangeCoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */