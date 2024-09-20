/*    */ package com.install4j.api.windows.service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum ServiceStartType
/*    */ {
/* 10 */   AUTO(2),
/* 11 */   DEMAND(3),
/* 12 */   DISABLED(4);
/*    */   
/*    */   final int intValue;
/*    */   
/*    */   ServiceStartType(int intValue) {
/* 17 */     this.intValue = intValue;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\service\ServiceStartType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */