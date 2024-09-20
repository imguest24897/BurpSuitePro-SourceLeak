/*    */ package com.install4j.runtime.beans.groups;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum TabPlacement
/*    */ {
/*  9 */   TOP("Top", 1),
/* 10 */   BOTTOM("Bottom", 3),
/* 11 */   LEFT("Left", 2),
/* 12 */   RIGHT("Right", 4);
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   private final int value;
/*    */   
/*    */   TabPlacement(String verbose, int value) {
/* 19 */     this.verbose = verbose;
/* 20 */     this.value = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 25 */     return this.verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getValue() {
/* 30 */     return this.value;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\groups\TabPlacement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */