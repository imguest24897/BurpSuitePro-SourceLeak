/*    */ package com.install4j.runtime.beans.actions.registry;
/*    */ 
/*    */ public enum PreferenceWriteType
/*    */ {
/*  5 */   USER("User specific"),
/*  6 */   SYSTEM("System wide"),
/*  7 */   SYSTEM_FALLBACK("System wide, fallback to user specific");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   PreferenceWriteType(String verbose) {
/* 12 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 17 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\PreferenceWriteType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */