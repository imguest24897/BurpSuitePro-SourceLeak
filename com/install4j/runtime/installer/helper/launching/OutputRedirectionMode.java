/*    */ package com.install4j.runtime.installer.helper.launching;
/*    */ 
/*    */ public enum OutputRedirectionMode
/*    */ {
/*  5 */   NONE("No redirection", false),
/*  6 */   INHERIT("Inherit parent handle", false),
/*  7 */   LOG_FILE("To log file", true),
/*  8 */   VARIABLE("To installer variable", true),
/*  9 */   FILE("To file", true);
/*    */   
/*    */   private final String verbose;
/*    */   private final boolean waitRequired;
/*    */   
/*    */   OutputRedirectionMode(String verbose, boolean waitRequired) {
/* 15 */     this.verbose = verbose;
/* 16 */     this.waitRequired = waitRequired;
/*    */   }
/*    */   
/*    */   public boolean isWaitRequired() {
/* 20 */     return this.waitRequired;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 25 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\launching\OutputRedirectionMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */