/*    */ package com.install4j.runtime.beans.actions;
/*    */ 
/*    */ import com.ejt.internal.util.LegacyXmlIntIdEnum;
/*    */ import com.ejt.internal.util.XMLEnum;
/*    */ 
/*    */ public enum FailureStrategy implements XMLEnum<FailureStrategy>, LegacyXmlIntIdEnum {
/*  7 */   CONTINUE("Continue on failure", "continue", 1),
/*  8 */   QUIT("Quit on failure", "quit", 2),
/*  9 */   ASK_USER("Ask user whether to quit on failure", "askQuit", 3),
/* 10 */   ASK_USER_RETRY("Ask user whether to retry or quit on failure", "askRetryQuit", 4),
/* 11 */   RETURN_TO_SCREEN("Return to the parent screen", "returnToScreen", 5);
/*    */   
/*    */   public static FailureStrategy getById(int id) {
/* 14 */     for (FailureStrategy failureStrategy : values()) {
/* 15 */       if (failureStrategy.intValue == id) {
/* 16 */         return failureStrategy;
/*    */       }
/*    */     } 
/* 19 */     return null;
/*    */   }
/*    */   
/*    */   private final int intValue;
/*    */   private final String xmlValue;
/*    */   private final String verbose;
/*    */   
/*    */   FailureStrategy(String verbose, String xmlValue, int intValue) {
/* 27 */     this.verbose = verbose;
/* 28 */     this.intValue = intValue;
/* 29 */     this.xmlValue = xmlValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getIntId() {
/* 34 */     return this.intValue;
/*    */   }
/*    */   
/*    */   public int getIntValue() {
/* 38 */     return this.intValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 43 */     return this.verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getXMLValue() {
/* 48 */     return this.xmlValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public FailureStrategy[] getXMLEnums() {
/* 53 */     return values();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\FailureStrategy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */