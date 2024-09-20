/*    */ package com.install4j.runtime.beans.groups;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum TabLayoutPolicy
/*    */ {
/*  8 */   WRAP("Wrap tabs", 0),
/*  9 */   SCROLL("Scroll tabs", 1);
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   private final int value;
/*    */   
/*    */   TabLayoutPolicy(String verbose, int value) {
/* 16 */     this.verbose = verbose;
/* 17 */     this.value = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 22 */     return this.verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getValue() {
/* 27 */     return this.value;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\groups\TabLayoutPolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */