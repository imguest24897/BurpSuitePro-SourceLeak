/*    */ package com.install4j.api.context;
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
/*    */ public enum ControlButtonType
/*    */ {
/* 15 */   PREVIOUS("Previous button"),
/*    */ 
/*    */ 
/*    */   
/* 19 */   NEXT("Next button"),
/*    */ 
/*    */ 
/*    */   
/* 23 */   CANCEL("Cancel button");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   ControlButtonType(String verbose) {
/* 28 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 33 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\ControlButtonType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */