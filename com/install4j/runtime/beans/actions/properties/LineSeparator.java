/*    */ package com.install4j.runtime.beans.actions.properties;
/*    */ 
/*    */ public enum LineSeparator {
/*  4 */   SYSTEM("System-dependent", System.getProperty("line.separator")),
/*  5 */   UNIX("Unix (\\n)", "\n"),
/*  6 */   WINDOWS("Windows (\\r\\n)", "\r\n");
/*    */   
/*    */   private final String verbose;
/*    */   private final String separator;
/*    */   
/*    */   LineSeparator(String verbose, String separator) {
/* 12 */     this.verbose = verbose;
/* 13 */     this.separator = separator;
/*    */   }
/*    */   
/*    */   public String getSeparator() {
/* 17 */     return this.separator;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 22 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\properties\LineSeparator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */