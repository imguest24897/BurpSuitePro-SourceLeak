/*    */ package com.install4j.runtime.beans.actions.desktop;
/*    */ 
/*    */ public enum IconSource {
/*  4 */   INSTALLER("Installer icon"),
/*  5 */   CUSTOM("Custom icon");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   IconSource(String verbose) {
/* 10 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 15 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\desktop\IconSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */