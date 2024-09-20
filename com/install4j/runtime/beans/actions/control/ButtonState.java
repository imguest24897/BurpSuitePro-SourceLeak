/*    */ package com.install4j.runtime.beans.actions.control;
/*    */ 
/*    */ public enum ButtonState
/*    */ {
/*  5 */   ENABLED("Enabled"),
/*  6 */   DISABLED("Disabled"),
/*  7 */   HIDDEN("Hidden");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   ButtonState(String verbose) {
/* 12 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 17 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\control\ButtonState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */