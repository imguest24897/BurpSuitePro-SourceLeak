/*    */ package com.install4j.api.beaninfo;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum FailureStrategy
/*    */ {
/* 12 */   CONTINUE(com.install4j.runtime.beans.actions.FailureStrategy.CONTINUE.getIntValue()),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 17 */   QUIT(com.install4j.runtime.beans.actions.FailureStrategy.QUIT.getIntValue()),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 22 */   ASK_USER(com.install4j.runtime.beans.actions.FailureStrategy.ASK_USER.getIntValue()),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 27 */   ASK_USER_RETRY(com.install4j.runtime.beans.actions.FailureStrategy.ASK_USER_RETRY.getIntValue()),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 33 */   RETURN_TO_SCREEN(com.install4j.runtime.beans.actions.FailureStrategy.RETURN_TO_SCREEN.getIntValue());
/*    */   
/*    */   private final int id;
/*    */   
/*    */   FailureStrategy(int id) {
/* 38 */     this.id = id;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getId() {
/* 46 */     return this.id;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\FailureStrategy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */