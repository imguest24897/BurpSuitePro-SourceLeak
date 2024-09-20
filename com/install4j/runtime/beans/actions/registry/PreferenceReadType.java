/*    */ package com.install4j.runtime.beans.actions.registry;
/*    */ 
/*    */ public enum PreferenceReadType
/*    */ {
/*  5 */   USER("User specific"),
/*  6 */   SYSTEM("System wide"),
/*  7 */   SYSTEM_THEN_USER("System wide, override with user specific");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   PreferenceReadType(String verbose) {
/* 12 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 17 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\PreferenceReadType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */