/*    */ package com.install4j.api.beans;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum ErrorHandlingMode
/*    */ {
/* 12 */   RETRY("Retry"),
/*    */ 
/*    */ 
/*    */   
/* 16 */   IGNORE("Ignore"),
/*    */ 
/*    */ 
/*    */   
/* 20 */   CANCEL("Cancel");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   ErrorHandlingMode(String verbose) {
/* 25 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 30 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beans\ErrorHandlingMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */