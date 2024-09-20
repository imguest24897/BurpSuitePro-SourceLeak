/*    */ package com.install4j.runtime.beans.actions.properties;
/*    */ 
/*    */ public enum PropertiesSource {
/*  4 */   DIRECT("Direct entry"),
/*  5 */   FILE("Properties file"),
/*  6 */   VARIABLE("Installer variable");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   PropertiesSource(String verbose) {
/* 11 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 16 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\properties\PropertiesSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */