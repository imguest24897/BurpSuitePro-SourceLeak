/*    */ package com.install4j.runtime.beans.actions.control;
/*    */ 
/*    */ public enum ProgressChangeType
/*    */ {
/*  5 */   SET_PERCENT("Set percentage value"),
/*  6 */   ADD_PERCENT("Add percentage value"),
/*  7 */   SET_INDETERMINATE("Set indeterminate state"),
/*  8 */   SET_TIMER("Start a timer"),
/*  9 */   SET_DETERMINATE("Return to determinate state");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   ProgressChangeType(String verbose) {
/* 14 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 19 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\control\ProgressChangeType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */