/*    */ package com.install4j.runtime.launcher.integration;
/*    */ 
/*    */ import com.ejt.internal.util.XMLEnum;
/*    */ 
/*    */ public enum LaunchSchedule implements XMLEnum<LaunchSchedule> {
/*  6 */   ALWAYS("Always", "always"),
/*  7 */   UPDATE_SCHEDULE("According to update schedule registry", "updateSchedule"),
/*  8 */   FIRST_RUN("First run of any launcher in archive media file by the current user", "firstRun");
/*    */   
/*    */   private final String xmlValue;
/*    */   private final String verbose;
/*    */   
/*    */   LaunchSchedule(String verbose, String xmlValue) {
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
/*    */   public LaunchSchedule[] getXMLEnums() {
/* 25 */     return values();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 30 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\integration\LaunchSchedule.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */