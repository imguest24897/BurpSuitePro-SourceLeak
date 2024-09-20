/*    */ package com.nimbusds.jwt.proc;
/*    */ 
/*    */ import com.nimbusds.jose.proc.BadJOSEException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BadJWTException
/*    */   extends BadJOSEException
/*    */ {
/*    */   public BadJWTException(String message) {
/* 40 */     super(message);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public BadJWTException(String message, Throwable cause) {
/* 52 */     super(message, cause);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jwt\proc\BadJWTException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */