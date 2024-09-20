/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ 
/*    */ public enum ZipMethod
/*    */ {
/*  6 */   DEFLATED("Deflated", 8),
/*  7 */   STORED("Stored", 0);
/*    */   
/*    */   private final String verbose;
/*    */   private final int intValue;
/*    */   
/*    */   ZipMethod(String verbose, int intValue) {
/* 13 */     this.verbose = verbose;
/* 14 */     this.intValue = intValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 19 */     return this.verbose;
/*    */   }
/*    */   
/*    */   public int getIntValue() {
/* 23 */     return this.intValue;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\ZipMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */