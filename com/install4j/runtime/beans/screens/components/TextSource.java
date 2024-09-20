/*    */ package com.install4j.runtime.beans.screens.components;
/*    */ 
/*    */ public enum TextSource
/*    */ {
/*  5 */   FILE("File"),
/*  6 */   DIRECT("Direct");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   TextSource(String verbose) {
/* 11 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 16 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\components\TextSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */