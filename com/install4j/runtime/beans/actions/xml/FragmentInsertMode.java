/*    */ package com.install4j.runtime.beans.actions.xml;
/*    */ 
/*    */ public enum FragmentInsertMode {
/*  4 */   REPLACE("Replace"),
/*  5 */   FIRST_CHILD("Insert as first child"),
/*  6 */   LAST_CHILD("Insert as last child"),
/*  7 */   BEFORE("Insert before"),
/*  8 */   AFTER("Insert after");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   FragmentInsertMode(String verbose) {
/* 13 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 18 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\xml\FragmentInsertMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */