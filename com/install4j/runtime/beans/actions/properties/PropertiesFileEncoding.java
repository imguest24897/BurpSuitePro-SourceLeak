/*    */ package com.install4j.runtime.beans.actions.properties;
/*    */ 
/*    */ public enum PropertiesFileEncoding {
/*  4 */   UTF8("UTF-8", "UTF-8"),
/*  5 */   JAVA_PROPERTIES("java.util.Properties", "ISO-8859-1"),
/*  6 */   OTHER("Other", null);
/*    */   
/*    */   private final String verbose;
/*    */   private final String charsetName;
/*    */   
/*    */   PropertiesFileEncoding(String verbose, String charsetName) {
/* 12 */     this.verbose = verbose;
/* 13 */     this.charsetName = charsetName;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 18 */     return this.verbose;
/*    */   }
/*    */   
/*    */   public String getCharsetName(String explicitEncoding) {
/* 22 */     if (this.charsetName != null) {
/* 23 */       return this.charsetName;
/*    */     }
/* 25 */     return explicitEncoding;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\properties\PropertiesFileEncoding.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */