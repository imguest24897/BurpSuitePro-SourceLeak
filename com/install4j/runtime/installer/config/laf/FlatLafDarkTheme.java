/*    */ package com.install4j.runtime.installer.config.laf;
/*    */ 
/*    */ import com.ejt.internal.util.XMLEnum;
/*    */ 
/*    */ public enum FlatLafDarkTheme implements XMLEnum<FlatLafDarkTheme>, FlatLafTheme {
/*  6 */   DARK("dark", "Flat Dark"),
/*  7 */   DARCULA("darcula", "Flat Darcula"),
/*  8 */   CUSTOM("custom", "IntelliJ theme from custom code");
/*    */   
/*    */   private final String xmlValue;
/*    */   private final String verbose;
/*    */   
/*    */   FlatLafDarkTheme(String xmlValue, String verbose) {
/* 14 */     this.xmlValue = xmlValue;
/* 15 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getXMLValue() {
/* 20 */     return this.xmlValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public FlatLafDarkTheme[] getXMLEnums() {
/* 25 */     return values();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isCustom() {
/* 30 */     return (this == CUSTOM);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 35 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\laf\FlatLafDarkTheme.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */