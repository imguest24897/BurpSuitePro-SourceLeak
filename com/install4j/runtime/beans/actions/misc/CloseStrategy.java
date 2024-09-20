/*    */ package com.install4j.runtime.beans.actions.misc;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum CloseStrategy
/*    */ {
/*  7 */   NONE(0, "None"),
/*  8 */   ASK_ONLY(1, "Ask user to manually close"),
/*  9 */   ASK_FOR_CLOSE(2, "Allow soft close"),
/* 10 */   ASK_FOR_CLOSE_AND_TERMINATE(3, "Allow soft close and termination"),
/* 11 */   ASK_FOR_TERMINATE(4, "Allow termination"),
/* 12 */   CLOSE(5, "Soft close immediately"),
/* 13 */   TERMINATE(6, "Terminate immediately");
/*    */   
/*    */   private final int type;
/*    */   private final String name;
/*    */   
/*    */   CloseStrategy(int type, String name) {
/* 19 */     this.type = type;
/* 20 */     this.name = name;
/*    */   }
/*    */   
/*    */   int getType() {
/* 24 */     return this.type;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 29 */     return this.name;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\CloseStrategy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */