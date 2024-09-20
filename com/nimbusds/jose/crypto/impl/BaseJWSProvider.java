/*    */ package com.nimbusds.jose.crypto.impl;
/*    */ 
/*    */ import com.nimbusds.jose.JWSAlgorithm;
/*    */ import com.nimbusds.jose.JWSProvider;
/*    */ import com.nimbusds.jose.jca.JCAContext;
/*    */ import java.util.Collections;
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
/*    */ public abstract class BaseJWSProvider
/*    */   implements JWSProvider
/*    */ {
/*    */   private final Set<JWSAlgorithm> algs;
/* 47 */   private final JCAContext jcaContext = new JCAContext();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public BaseJWSProvider(Set<JWSAlgorithm> algs) {
/* 58 */     if (algs == null) {
/* 59 */       throw new IllegalArgumentException("The supported JWS algorithm set must not be null");
/*    */     }
/*    */     
/* 62 */     this.algs = Collections.unmodifiableSet(algs);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Set<JWSAlgorithm> supportedJWSAlgorithms() {
/* 69 */     return this.algs;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public JCAContext getJCAContext() {
/* 76 */     return this.jcaContext;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\BaseJWSProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */