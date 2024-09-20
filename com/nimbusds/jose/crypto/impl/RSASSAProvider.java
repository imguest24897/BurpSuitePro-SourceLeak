/*    */ package com.nimbusds.jose.crypto.impl;
/*    */ 
/*    */ import com.nimbusds.jose.JWSAlgorithm;
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
/*    */ public abstract class RSASSAProvider
/*    */   extends BaseJWSProvider
/*    */ {
/*    */   public static final Set<JWSAlgorithm> SUPPORTED_ALGORITHMS;
/*    */   
/*    */   static {
/* 56 */     Set<JWSAlgorithm> algs = new LinkedHashSet<>();
/* 57 */     algs.add(JWSAlgorithm.RS256);
/* 58 */     algs.add(JWSAlgorithm.RS384);
/* 59 */     algs.add(JWSAlgorithm.RS512);
/* 60 */     algs.add(JWSAlgorithm.PS256);
/* 61 */     algs.add(JWSAlgorithm.PS384);
/* 62 */     algs.add(JWSAlgorithm.PS512);
/* 63 */     SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(algs);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected RSASSAProvider() {
/* 72 */     super(SUPPORTED_ALGORITHMS);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\RSASSAProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */