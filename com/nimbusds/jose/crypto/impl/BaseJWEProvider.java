/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWEProvider;
/*     */ import com.nimbusds.jose.jca.JCAContext;
/*     */ import com.nimbusds.jose.jca.JWEJCAContext;
/*     */ import java.util.Collections;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ abstract class BaseJWEProvider
/*     */   implements JWEProvider
/*     */ {
/*     */   private final Set<JWEAlgorithm> algs;
/*     */   private final Set<EncryptionMethod> encs;
/*  55 */   private final JWEJCAContext jcaContext = new JWEJCAContext();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BaseJWEProvider(Set<JWEAlgorithm> algs, Set<EncryptionMethod> encs) {
/*  69 */     if (algs == null) {
/*  70 */       throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
/*     */     }
/*     */     
/*  73 */     this.algs = Collections.unmodifiableSet(algs);
/*     */ 
/*     */     
/*  76 */     if (encs == null) {
/*  77 */       throw new IllegalArgumentException("The supported encryption methods must not be null");
/*     */     }
/*     */     
/*  80 */     this.encs = encs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<JWEAlgorithm> supportedJWEAlgorithms() {
/*  87 */     return this.algs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<EncryptionMethod> supportedEncryptionMethods() {
/*  94 */     return this.encs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWEJCAContext getJCAContext() {
/* 101 */     return this.jcaContext;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\BaseJWEProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */