/*    */ package com.install4j.runtime.beans.actions.services;
/*    */ 
/*    */ public enum WindowsPriority
/*    */ {
/*  5 */   NORMAL_PRIORITY_CLASS(32, "Normal"),
/*  6 */   ABOVE_NORMAL_PRIORITY_CLASS(32768, "Above normal"),
/*  7 */   BELOW_NORMAL_PRIORITY_CLASS(16384, "Below normal"),
/*  8 */   HIGH_PRIORITY_CLASS(128, "High"),
/*  9 */   IDLE_PRIORITY_CLASS(64, "Idle");
/*    */   
/*    */   private final int value;
/*    */   private final String name;
/*    */   
/*    */   WindowsPriority(int value, String name) {
/* 15 */     this.value = value;
/* 16 */     this.name = name;
/*    */   }
/*    */   
/*    */   int getValue() {
/* 20 */     return this.value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 25 */     return this.name;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\services\WindowsPriority.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */