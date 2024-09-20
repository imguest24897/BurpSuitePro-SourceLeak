/*    */ package com.install4j.runtime.beans.actions.registry;
/*    */ 
/*    */ public enum PreferenceDeleteType
/*    */ {
/*  5 */   USER("User specific"),
/*  6 */   SYSTEM("System wide"),
/*  7 */   SYSTEM_AND_USER("System wide and user specific");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   PreferenceDeleteType(String verbose) {
/* 12 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 17 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\PreferenceDeleteType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */