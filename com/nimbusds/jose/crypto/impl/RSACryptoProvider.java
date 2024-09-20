/*    */ package com.nimbusds.jose.crypto.impl;
/*    */ 
/*    */ import com.nimbusds.jose.EncryptionMethod;
/*    */ import com.nimbusds.jose.JWEAlgorithm;
/*    */ import com.nimbusds.jose.jca.JWEJCAContext;
/*    */ import java.util.Collections;
/*    */ import java.util.LinkedHashSet;
/*    */ import java.util.Set;
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
/*    */ public abstract class RSACryptoProvider
/*    */   extends BaseJWEProvider
/*    */ {
/*    */   public static final Set<JWEAlgorithm> SUPPORTED_ALGORITHMS;
/* 71 */   public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;
/*    */ 
/*    */   
/*    */   static {
/* 75 */     Set<JWEAlgorithm> algs = new LinkedHashSet<>();
/* 76 */     algs.add(JWEAlgorithm.RSA1_5);
/* 77 */     algs.add(JWEAlgorithm.RSA_OAEP);
/* 78 */     algs.add(JWEAlgorithm.RSA_OAEP_256);
/* 79 */     algs.add(JWEAlgorithm.RSA_OAEP_384);
/* 80 */     algs.add(JWEAlgorithm.RSA_OAEP_512);
/* 81 */     SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(algs);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected RSACryptoProvider() {
/* 90 */     super(SUPPORTED_ALGORITHMS, ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\RSACryptoProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */