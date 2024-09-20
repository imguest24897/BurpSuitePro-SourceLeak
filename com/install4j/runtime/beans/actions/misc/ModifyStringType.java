/*    */ package com.install4j.runtime.beans.actions.misc;
/*    */ 
/*    */ public enum ModifyStringType
/*    */ {
/*  5 */   SET("Set"),
/*  6 */   APPEND("Append"),
/*  7 */   PREPEND("Prepend"),
/*  8 */   REMOVE("Remove");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   ModifyStringType(String verbose) {
/* 13 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 18 */     return this.verbose;
/*    */   }
/*    */   
/*    */   public static ModifyStringType getFromString(String text) {
/* 22 */     for (ModifyStringType value : values()) {
/* 23 */       if (value.toString().equalsIgnoreCase(text)) {
/* 24 */         return value;
/*    */       }
/*    */     } 
/* 27 */     throw new IllegalArgumentException("unknown type " + text);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\ModifyStringType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */