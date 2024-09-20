/*    */ package com.install4j.runtime.installer.controller;
/*    */ 
/*    */ public class ReturnToken
/*    */ {
/*    */   private boolean wokenUp;
/*    */   private Object returnValue;
/*    */   
/*    */   public boolean isWokenUp() {
/*  9 */     return this.wokenUp;
/*    */   }
/*    */   
/*    */   public Object getReturnValue() {
/* 13 */     return this.returnValue;
/*    */   }
/*    */   
/*    */   public synchronized void returnToController(Object returnValue) {
/* 17 */     this.returnValue = returnValue;
/* 18 */     this.wokenUp = true;
/* 19 */     notify();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\ReturnToken.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */