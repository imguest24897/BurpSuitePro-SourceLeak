/*    */ package com.install4j.runtime.installer.helper.comm.impl;
/*    */ 
/*    */ public class FinishError extends Error {
/*    */   private final int exitCode;
/*    */   
/*    */   public FinishError(int exitCode) {
/*  7 */     this.exitCode = exitCode;
/*    */   }
/*    */   
/*    */   public int getExitCode() {
/* 11 */     return this.exitCode;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\impl\FinishError.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */