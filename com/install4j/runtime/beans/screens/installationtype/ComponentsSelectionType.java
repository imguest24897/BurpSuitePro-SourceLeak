/*    */ package com.install4j.runtime.beans.screens.installationtype;
/*    */ 
/*    */ public enum ComponentsSelectionType
/*    */ {
/*  5 */   ALL("All components"),
/*  6 */   DEFAULT("Default components"),
/*  7 */   SPECIFIC("Specific components");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   ComponentsSelectionType(String verbose) {
/* 12 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 17 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\installationtype\ComponentsSelectionType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */