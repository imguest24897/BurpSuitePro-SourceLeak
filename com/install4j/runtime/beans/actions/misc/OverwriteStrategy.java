/*    */ package com.install4j.runtime.beans.actions.misc;
/*    */ 
/*    */ public enum OverwriteStrategy {
/*  4 */   ON("Overwrite existing"),
/*  5 */   NOT_COMMAND_LINE("Do not overwrite command line"),
/*  6 */   OFF("Do not overwrite existing");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   OverwriteStrategy(String verbose) {
/* 11 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 16 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\OverwriteStrategy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */