/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ public enum FontType {
/*  4 */   DEFAULT("Default"),
/*  5 */   DERIVED("Derived"),
/*  6 */   CUSTOM("Custom");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   FontType(String verbose) {
/* 11 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 16 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\FontType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */