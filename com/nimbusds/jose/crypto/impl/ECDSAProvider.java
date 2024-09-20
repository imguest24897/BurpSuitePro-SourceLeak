/*    */ package com.nimbusds.jose.crypto.impl;
/*    */ 
/*    */ import com.nimbusds.jose.JOSEException;
/*    */ import com.nimbusds.jose.JWSAlgorithm;
/*    */ import java.util.Collections;
/*    */ import java.util.HashSet;
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
/*    */ public abstract class ECDSAProvider
/*    */   extends BaseJWSProvider
/*    */ {
/*    */   public static final Set<JWSAlgorithm> SUPPORTED_ALGORITHMS;
/*    */   
/*    */   static {
/* 58 */     Set<JWSAlgorithm> algs = new LinkedHashSet<>();
/* 59 */     algs.add(JWSAlgorithm.ES256);
/* 60 */     algs.add(JWSAlgorithm.ES256K);
/* 61 */     algs.add(JWSAlgorithm.ES384);
/* 62 */     algs.add(JWSAlgorithm.ES512);
/* 63 */     SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(algs);
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
/*    */   protected ECDSAProvider(JWSAlgorithm alg) throws JOSEException {
/* 79 */     super(new HashSet<>(Collections.singletonList(alg)));
/*    */     
/* 81 */     if (!SUPPORTED_ALGORITHMS.contains(alg)) {
/* 82 */       throw new JOSEException("Unsupported EC DSA algorithm: " + alg);
/*    */     }
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
/*    */   public JWSAlgorithm supportedECDSAAlgorithm() {
/* 96 */     return supportedJWSAlgorithms().iterator().next();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\ECDSAProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */