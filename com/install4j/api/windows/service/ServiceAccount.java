/*    */ package com.install4j.api.windows.service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum ServiceAccount
/*    */ {
/*  8 */   LOCAL_SYSTEM("Local System", "NT AUTHORITY\\System"),
/*  9 */   LOCAL_SERVICE("Local Service", "NT AUTHORITY\\LocalService"),
/* 10 */   NETWORK_SERVICE("Network Service", "NT AUTHORITY\\NetworkService"),
/* 11 */   OTHER("Other", null);
/*    */   
/*    */   private final String verbose;
/*    */   private final String accountName;
/*    */   
/*    */   ServiceAccount(String verbose, String accountName) {
/* 17 */     this.verbose = verbose;
/* 18 */     this.accountName = accountName;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 23 */     return this.verbose;
/*    */   }
/*    */   
/*    */   public String getAccountName() {
/* 27 */     return this.accountName;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\service\ServiceAccount.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */