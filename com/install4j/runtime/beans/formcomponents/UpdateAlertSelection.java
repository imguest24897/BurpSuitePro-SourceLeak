/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ public enum UpdateAlertSelection {
/*  4 */   EXISTING("Update the existing installation"),
/*  5 */   DIFFERENT("Install into different directory");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   UpdateAlertSelection(String verbose) {
/* 10 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 15 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\UpdateAlertSelection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */