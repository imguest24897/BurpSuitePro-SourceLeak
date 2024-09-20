/*    */ package com.install4j.runtime.beans.actions.services;
/*    */ 
/*    */ public enum ServiceAccount
/*    */ {
/*  5 */   LOCAL_SYSTEM("Local System", "NT AUTHORITY\\System"),
/*  6 */   LOCAL_SERVICE("Local Service", "NT AUTHORITY\\LocalService"),
/*  7 */   NETWORK_SERVICE("Network Service", "NT AUTHORITY\\NetworkService"),
/*  8 */   OTHER("Other", null);
/*    */   
/*    */   private final String verbose;
/*    */   private final String accountName;
/*    */   
/*    */   ServiceAccount(String verbose, String accountName) {
/* 14 */     this.verbose = verbose;
/* 15 */     this.accountName = accountName;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 20 */     return this.verbose;
/*    */   }
/*    */   
/*    */   public String getAccountName() {
/* 24 */     return this.accountName;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\services\ServiceAccount.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */