/*    */ package com.install4j.api.beans;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum VariableErrorHandling
/*    */ {
/* 12 */   IGNORE("Ignore"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 17 */   ERROR_MESSAGE("Error message"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 22 */   EXCEPTION("Exception");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   VariableErrorHandling(String verbose) {
/* 27 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 32 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beans\VariableErrorHandling.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */