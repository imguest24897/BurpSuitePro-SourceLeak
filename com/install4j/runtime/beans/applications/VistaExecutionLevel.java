/*    */ package com.install4j.runtime.beans.applications;
/*    */ 
/*    */ public enum VistaExecutionLevel
/*    */ {
/*  5 */   AS_INVOKER("As invoker"),
/*  6 */   HIGHEST_AVAILABLE("Highest available"),
/*  7 */   REQUIRE_ADMINISTRATOR("Require administrator");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   VistaExecutionLevel(String verbose) {
/* 12 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 17 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\applications\VistaExecutionLevel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */