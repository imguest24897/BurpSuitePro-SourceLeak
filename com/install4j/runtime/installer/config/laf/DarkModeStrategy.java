/*    */ package com.install4j.runtime.installer.config.laf;
/*    */ 
/*    */ import com.ejt.internal.util.XMLEnum;
/*    */ 
/*    */ public enum DarkModeStrategy implements XMLEnum<DarkModeStrategy> {
/*  6 */   AUTO_DETECT("auto", "Auto-detect if light or dark mode should be used"),
/*  7 */   ALWAYS_LIGHT("light", "Always use light mode"),
/*  8 */   ALWAYS_DARK("dark", "Always use dark mode");
/*    */   
/*    */   private final String xmlValue;
/*    */   private final String verbose;
/*    */   
/*    */   DarkModeStrategy(String xmlValue, String verbose) {
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
/*    */   public DarkModeStrategy[] getXMLEnums() {
/* 25 */     return values();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 30 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\laf\DarkModeStrategy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */