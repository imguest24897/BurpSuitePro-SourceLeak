/*    */ package com.install4j.api.update;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum ApplicationDisplayMode
/*    */ {
/* 15 */   GUI("GUI", 1),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 21 */   CONSOLE("Console", 2),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 27 */   UNATTENDED("Unattended", 3);
/*    */   
/*    */   private final String description;
/*    */   private final int intValue;
/*    */   
/*    */   ApplicationDisplayMode(String description, int value) {
/* 33 */     this.description = description;
/* 34 */     this.intValue = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getIntValue() {
/* 42 */     return this.intValue;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static ApplicationDisplayMode getFromIntValue(int value) {
/* 51 */     for (ApplicationDisplayMode applicationDisplayMode : values()) {
/* 52 */       if (applicationDisplayMode.getIntValue() == value) {
/* 53 */         return applicationDisplayMode;
/*    */       }
/*    */     } 
/* 56 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 61 */     return this.description;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\ap\\update\ApplicationDisplayMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */