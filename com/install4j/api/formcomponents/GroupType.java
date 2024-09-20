/*    */ package com.install4j.api.formcomponents;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum GroupType
/*    */ {
/* 12 */   VERTICAL("Vertical"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 17 */   HORIZONTAL("Horizontal"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 22 */   TABBED_PANE("Tabbed pane"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 27 */   SINGLE_TAB("Single tab");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   GroupType(String verbose) {
/* 32 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 37 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\formcomponents\GroupType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */