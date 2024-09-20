/*    */ package com.install4j.api.context;
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
/*    */ 
/*    */ public enum OverwriteMode
/*    */ {
/* 16 */   NEVER("Never", 0),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 21 */   ALWAYS("Always", 1),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 28 */   IF_NEWER("If newer", 2),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 36 */   IF_NEWER_OTHERWISE_ASK("If newer otherwise ask", 3),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 43 */   ALWAYS_ASK_EXCEPT_FOR_UPDATE("Always ask except for update", 4),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 49 */   ALWAYS_ASK("Always ask", 5);
/*    */   
/*    */   private final String description;
/*    */   
/*    */   private final int intValue;
/*    */ 
/*    */   
/*    */   public static OverwriteMode getFromIntValue(int overwrite) {
/* 57 */     for (OverwriteMode overwriteMode : values()) {
/* 58 */       if (overwriteMode.intValue == overwrite) {
/* 59 */         return overwriteMode;
/*    */       }
/*    */     } 
/* 62 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   OverwriteMode(String description, int value) {
/* 69 */     this.description = description;
/* 70 */     this.intValue = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getIntValue() {
/* 78 */     return this.intValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 83 */     return this.description;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\OverwriteMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */