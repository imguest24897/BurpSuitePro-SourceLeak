/*    */ package com.install4j.runtime.beans.actions.net;
/*    */ 
/*    */ public enum HttpRequestMethod {
/*  4 */   GET,
/*  5 */   POST,
/*  6 */   HEAD,
/*  7 */   OPTIONS,
/*  8 */   PUT,
/*  9 */   DELETE,
/* 10 */   TRACE;
/*    */   
/*    */   public String getMethodName() {
/* 13 */     return name();
/*    */   }
/*    */   
/*    */   public boolean isBodyFormData() {
/* 17 */     switch (this) {
/*    */       case POST:
/*    */       case PUT:
/* 20 */         return true;
/*    */     } 
/* 22 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\net\HttpRequestMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */