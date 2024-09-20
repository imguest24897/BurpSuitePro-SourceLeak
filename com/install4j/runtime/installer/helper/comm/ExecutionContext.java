/*    */ package com.install4j.runtime.installer.helper.comm;
/*    */ 
/*    */ public enum ExecutionContext
/*    */ {
/*  5 */   ELEVATED("elevated"),
/*  6 */   UNELEVATED("unelevated"),
/*  7 */   SAME("same"),
/*  8 */   OTHER("other"),
/*  9 */   MAXIMUM("maximum"),
/* 10 */   ALL("all");
/*    */   
/*    */   private final transient String verbose;
/*    */   
/*    */   ExecutionContext(String verbose) {
/* 15 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 20 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\ExecutionContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */