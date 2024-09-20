/*    */ package com.install4j.runtime.installer.config.laf;
/*    */ 
/*    */ import com.ejt.internal.util.XMLEnum;
/*    */ 
/*    */ public enum FlatLafLightTheme implements XMLEnum<FlatLafLightTheme>, FlatLafTheme {
/*  6 */   LIGHT("light", "Flat Light"),
/*  7 */   LIGHT_INTELLIJ("lightIntelliJ", "Flat IntelliJ"),
/*  8 */   CUSTOM("custom", "IntelliJ theme from custom code");
/*    */   
/*    */   private final String xmlValue;
/*    */   private final String verbose;
/*    */   
/*    */   FlatLafLightTheme(String xmlValue, String verbose) {
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
/*    */   public FlatLafLightTheme[] getXMLEnums() {
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\laf\FlatLafLightTheme.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */