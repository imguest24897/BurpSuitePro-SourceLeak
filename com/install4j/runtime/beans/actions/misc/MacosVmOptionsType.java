/*    */ package com.install4j.runtime.beans.actions.misc;
/*    */ 
/*    */ public enum MacosVmOptionsType
/*    */ {
/*  5 */   INNER("Contained in the application bundle"),
/*  6 */   OUTER("Next to the application bundle");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   MacosVmOptionsType(String verbose) {
/* 11 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 16 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\MacosVmOptionsType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */