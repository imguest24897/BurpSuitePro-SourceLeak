/*    */ package com.install4j.runtime.launcher.integration;
/*    */ 
/*    */ import com.ejt.internal.util.XMLEnum;
/*    */ 
/*    */ public enum LaunchMode implements XMLEnum<LaunchMode> {
/*  6 */   STARTUP_SYNC("Blocking at startup", "startupSync"),
/*  7 */   STARTUP_ASNYC("Non-blocking at startup", "startupAsync"),
/*  8 */   FIRST_WINDOW("When first window is shown", "startupFirstWindow");
/*    */   
/*    */   private final String verbose;
/*    */   private final String xmlValue;
/*    */   
/*    */   LaunchMode(String verbose, String xmlValue) {
/* 14 */     this.verbose = verbose;
/* 15 */     this.xmlValue = xmlValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getXMLValue() {
/* 20 */     return this.xmlValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public LaunchMode[] getXMLEnums() {
/* 25 */     return values();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 30 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\integration\LaunchMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */