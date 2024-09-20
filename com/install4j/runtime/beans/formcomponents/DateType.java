/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ public enum DateType
/*    */ {
/*  5 */   DATE("Date"),
/*  6 */   TIME("Time"),
/*  7 */   DATETIME("Date and time");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   DateType(String verbose) {
/* 12 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 17 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\DateType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */