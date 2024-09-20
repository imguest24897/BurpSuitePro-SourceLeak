/*    */ package com.install4j.runtime.installer.helper.content.xz.lzma;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ final class State
/*    */ {
/*    */   static final int STATES = 12;
/*    */   private static final int LIT_STATES = 7;
/*    */   private static final int LIT_LIT = 0;
/*    */   private static final int MATCH_LIT_LIT = 1;
/*    */   private static final int REP_LIT_LIT = 2;
/*    */   private static final int SHORTREP_LIT_LIT = 3;
/*    */   private static final int MATCH_LIT = 4;
/*    */   private static final int REP_LIT = 5;
/*    */   private static final int SHORTREP_LIT = 6;
/*    */   private static final int LIT_MATCH = 7;
/*    */   private static final int LIT_LONGREP = 8;
/*    */   private static final int LIT_SHORTREP = 9;
/*    */   private static final int NONLIT_MATCH = 10;
/*    */   private static final int NONLIT_REP = 11;
/*    */   private int state;
/*    */   
/*    */   State() {}
/*    */   
/*    */   State(State other) {
/* 36 */     this.state = other.state;
/*    */   }
/*    */   
/*    */   void reset() {
/* 40 */     this.state = 0;
/*    */   }
/*    */   
/*    */   int get() {
/* 44 */     return this.state;
/*    */   }
/*    */   
/*    */   void set(State other) {
/* 48 */     this.state = other.state;
/*    */   }
/*    */   
/*    */   void updateLiteral() {
/* 52 */     if (this.state <= 3) {
/* 53 */       this.state = 0;
/* 54 */     } else if (this.state <= 9) {
/* 55 */       this.state -= 3;
/*    */     } else {
/* 57 */       this.state -= 6;
/*    */     } 
/*    */   }
/*    */   void updateMatch() {
/* 61 */     this.state = (this.state < 7) ? 7 : 10;
/*    */   }
/*    */   
/*    */   void updateLongRep() {
/* 65 */     this.state = (this.state < 7) ? 8 : 11;
/*    */   }
/*    */   
/*    */   void updateShortRep() {
/* 69 */     this.state = (this.state < 7) ? 9 : 11;
/*    */   }
/*    */   
/*    */   boolean isLiteral() {
/* 73 */     return (this.state < 7);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\xz\lzma\State.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */