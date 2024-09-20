/*    */ package com.install4j.runtime.installer.helper.comm.responses;
/*    */ 
/*    */ public class ThrowableResponse extends Response {
/*    */   private Throwable throwable;
/*    */   
/*    */   public ThrowableResponse(Throwable throwable) {
/*  7 */     super(false);
/*  8 */     this.throwable = throwable;
/*    */   }
/*    */   
/*    */   public Throwable getThrowable() {
/* 12 */     return this.throwable;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\responses\ThrowableResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */