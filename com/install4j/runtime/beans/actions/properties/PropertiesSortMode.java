/*    */ package com.install4j.runtime.beans.actions.properties;
/*    */ 
/*    */ public enum PropertiesSortMode {
/*  4 */   UNSORTED_APPEND("Unsorted, new keys at the end"),
/*  5 */   UNSORTED_PREPEND("Unsorted, new keys at the beginning"),
/*  6 */   KEYS_ALPHABETICALLY("Sort keys alphabetically");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   PropertiesSortMode(String verbose) {
/* 11 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 16 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\properties\PropertiesSortMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */