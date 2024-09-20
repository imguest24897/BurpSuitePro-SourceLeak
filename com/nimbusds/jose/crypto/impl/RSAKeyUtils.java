/*    */ package com.nimbusds.jose.crypto.impl;
/*    */ 
/*    */ import com.nimbusds.jose.JOSEException;
/*    */ import com.nimbusds.jose.jwk.RSAKey;
/*    */ import java.security.PrivateKey;
/*    */ import java.security.interfaces.RSAPrivateKey;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RSAKeyUtils
/*    */ {
/*    */   public static PrivateKey toRSAPrivateKey(RSAKey rsaJWK) throws JOSEException {
/* 47 */     if (!rsaJWK.isPrivate()) {
/* 48 */       throw new JOSEException("The RSA JWK doesn't contain a private part");
/*    */     }
/*    */     
/* 51 */     return rsaJWK.toPrivateKey();
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
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static int keyBitLength(PrivateKey privateKey) {
/* 67 */     if (!(privateKey instanceof RSAPrivateKey)) {
/* 68 */       return -1;
/*    */     }
/*    */     
/* 71 */     RSAPrivateKey rsaPrivateKey = (RSAPrivateKey)privateKey;
/*    */     
/*    */     try {
/* 74 */       return rsaPrivateKey.getModulus().bitLength();
/* 75 */     } catch (Exception e) {
/*    */ 
/*    */ 
/*    */       
/* 79 */       return -1;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\RSAKeyUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */