/*    */ package com.install4j.api.beaninfo;
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
/*    */ public enum FileContentType
/*    */ {
/* 15 */   OTHER("Other"),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 21 */   TEXT("Text"),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 27 */   HTML("HTML");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   FileContentType(String verbose) {
/* 32 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 37 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\FileContentType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */