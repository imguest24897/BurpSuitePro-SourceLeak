/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ public enum AxisType
/*    */ {
/*  5 */   VERTICAL("Vertical"),
/*  6 */   HORIZONTAL("Horizontal");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   AxisType(String verbose) {
/* 11 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 16 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\AxisType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */