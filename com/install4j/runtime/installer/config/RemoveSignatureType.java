/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import com.ejt.internal.util.XMLEnum;
/*    */ 
/*    */ public enum RemoveSignatureType implements XMLEnum<RemoveSignatureType> {
/*  6 */   KEEP("keep"),
/*  7 */   REMOVE_SIGNATURE("signature"),
/*  8 */   REMOVE_FILE("file");
/*    */   
/*    */   private final String xmlValue;
/*    */   
/*    */   RemoveSignatureType(String xmlValue) {
/* 13 */     this.xmlValue = xmlValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getXMLValue() {
/* 18 */     return this.xmlValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public RemoveSignatureType[] getXMLEnums() {
/* 23 */     return values();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\RemoveSignatureType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */