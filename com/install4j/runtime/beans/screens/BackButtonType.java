/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ import com.ejt.internal.util.LegacyXmlIntIdEnum;
/*    */ import com.ejt.internal.util.XMLEnum;
/*    */ 
/*    */ public enum BackButtonType implements XMLEnum<BackButtonType>, LegacyXmlIntIdEnum {
/*  7 */   VISIBLE("Always visible", "visible", 1),
/*  8 */   SAFE("Safe back button", "safe", 2),
/*  9 */   HIDDEN("Always hidden", "hidden", 3);
/*    */   
/*    */   private final String verbose;
/*    */   private final String xmlValue;
/*    */   private final int legacyId;
/*    */   
/*    */   BackButtonType(String verbose, String xmlValue, int legacyId) {
/* 16 */     this.verbose = verbose;
/* 17 */     this.xmlValue = xmlValue;
/* 18 */     this.legacyId = legacyId;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getIntId() {
/* 23 */     return this.legacyId;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getXMLValue() {
/* 28 */     return this.xmlValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public BackButtonType[] getXMLEnums() {
/* 33 */     return values();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 38 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\BackButtonType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */