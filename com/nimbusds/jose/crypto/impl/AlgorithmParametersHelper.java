/*    */ package com.nimbusds.jose.crypto.impl;
/*    */ 
/*    */ import java.security.AlgorithmParameters;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.Provider;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AlgorithmParametersHelper
/*    */ {
/*    */   public static AlgorithmParameters getInstance(String name, Provider provider) throws NoSuchAlgorithmException {
/* 53 */     if (provider == null) {
/* 54 */       return AlgorithmParameters.getInstance(name);
/*    */     }
/* 56 */     return AlgorithmParameters.getInstance(name, provider);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\AlgorithmParametersHelper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */