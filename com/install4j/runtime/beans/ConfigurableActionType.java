/*    */ package com.install4j.runtime.beans;
/*    */ 
/*    */ public enum ConfigurableActionType {
/*  4 */   SCRIPT("Script"),
/*  5 */   ACTION_LIST("Action list");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   ConfigurableActionType(String verbose) {
/* 10 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 15 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\ConfigurableActionType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */