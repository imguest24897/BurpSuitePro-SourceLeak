/*    */ package com.install4j.runtime.beans.actions.xml;
/*    */ 
/*    */ public enum FragmentSource {
/*  4 */   DIRECT("Direct entry"),
/*  5 */   FILE("Fragment file");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   FragmentSource(String verbose) {
/* 10 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 15 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\xml\FragmentSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */