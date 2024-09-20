/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum WindowsGroup
/*    */ {
/*  7 */   AUTHENTICATED_USERS("Authenticated users", 1, null),
/*  8 */   WORLD("World", 2, null),
/*    */   
/* 10 */   ADMINISTRATORS("Administrators", 3, "S-1-5-32-544"),
/* 11 */   USERS("Users", 3, "S-1-5-32-545"),
/* 12 */   GUESTS("Guests", 3, "S-1-5-32-546"),
/*    */ 
/*    */ 
/*    */   
/* 16 */   ORIGINAL_USER("Original User", 3, null),
/* 17 */   SID_OR_ACCOUNT_NAME("SID or Account Name", 3, null);
/*    */   
/*    */   private final String verbose;
/*    */   private final int intValue;
/*    */   private final String sid;
/*    */   
/*    */   WindowsGroup(String verbose, int intValue, String sid) {
/* 24 */     this.verbose = verbose;
/* 25 */     this.intValue = intValue;
/* 26 */     this.sid = sid;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 31 */     return this.verbose;
/*    */   }
/*    */   
/*    */   public int getIntValue() {
/* 35 */     return this.intValue;
/*    */   }
/*    */   
/*    */   public String getSid() {
/* 39 */     return this.sid;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\WindowsGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */