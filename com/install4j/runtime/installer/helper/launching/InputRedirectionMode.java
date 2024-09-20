/*    */ package com.install4j.runtime.installer.helper.launching;
/*    */ 
/*    */ public enum InputRedirectionMode
/*    */ {
/*  5 */   NONE("No redirection"),
/*  6 */   INHERIT("Inherit parent handle"),
/*  7 */   STRING("From string"),
/*  8 */   FILE("From file");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   InputRedirectionMode(String verbose) {
/* 13 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 18 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\launching\InputRedirectionMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */