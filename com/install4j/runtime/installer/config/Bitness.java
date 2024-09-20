/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import com.ejt.internal.util.XMLEnum;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public enum Bitness
/*    */   implements XMLEnum<Bitness> {
/*  8 */   UNDEFINED("undefined"),
/*  9 */   BIT32("32") {
/*    */     public boolean isCompatible() {
/* 11 */       return Objects.equals(System.getProperty("sun.arch.data.model", "32"), "32");
/*    */     }
/*    */   },
/* 14 */   BIT64("64") {
/*    */     public boolean isCompatible() {
/* 16 */       return Objects.equals(System.getProperty("sun.arch.data.model", "64"), "64");
/*    */     }
/*    */   };
/*    */   
/*    */   private final String xmlValue;
/*    */   
/*    */   Bitness(String xmlValue) {
/* 23 */     this.xmlValue = xmlValue;
/*    */   }
/*    */   
/*    */   public boolean isCompatible() {
/* 27 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getXMLValue() {
/* 32 */     return this.xmlValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public Bitness[] getXMLEnums() {
/* 37 */     return values();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\Bitness.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */