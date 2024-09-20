/*    */ package com.install4j.api.context;
/*    */ 
/*    */ import java.io.ObjectStreamException;
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
/*    */ public enum UninstallMode
/*    */ {
/* 18 */   IF_CREATED("If created", 0),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 23 */   NEVER("Never", 1),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 28 */   ALWAYS("Always", 2),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 34 */   IF_CREATED_BUT_NOT_FOR_UPDATE("If created, but not for update", 3),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 40 */   ALWAYS_BUT_NOT_FOR_UPDATE("Always, but not for update", 4);
/*    */   
/*    */   private final String description;
/*    */   
/*    */   private final int intValue;
/*    */ 
/*    */   
/*    */   public static UninstallMode getFromIntValue(int uninstall) {
/* 48 */     for (UninstallMode uninstallMode : values()) {
/* 49 */       if (uninstallMode.intValue == uninstall) {
/* 50 */         return uninstallMode;
/*    */       }
/*    */     } 
/* 53 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   UninstallMode(String description, int value) {
/* 60 */     this.description = description;
/* 61 */     this.intValue = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 66 */     return this.description;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getIntValue() {
/* 74 */     return this.intValue;
/*    */   }
/*    */   
/*    */   private Object readResolve() throws ObjectStreamException {
/* 78 */     return getFromIntValue(this.intValue);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\UninstallMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */