/*    */ package com.nimbusds.jose.jwk;
/*    */ 
/*    */ import com.nimbusds.jose.KeyException;
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
/*    */ public class JWKException
/*    */   extends KeyException
/*    */ {
/*    */   public JWKException(String message) {
/* 37 */     super(message);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static JWKException expectedClass(Class<? extends JWK> expectedJWKClass) {
/* 48 */     return new JWKException("Invalid JWK: Must be an instance of " + expectedJWKClass);
/*    */   }
/*    */ 
/*    */   
/*    */   public static JWKException expectedPrivate() {
/* 53 */     return new JWKException("Expected private JWK but none available");
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\JWKException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */