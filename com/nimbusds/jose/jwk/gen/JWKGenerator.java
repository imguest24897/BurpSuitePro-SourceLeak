/*     */ package com.nimbusds.jose.jwk.gen;
/*     */ 
/*     */ import com.nimbusds.jose.Algorithm;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.jwk.JWK;
/*     */ import com.nimbusds.jose.jwk.KeyOperation;
/*     */ import com.nimbusds.jose.jwk.KeyUse;
/*     */ import java.security.KeyStore;
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
/*     */ public abstract class JWKGenerator<T extends JWK>
/*     */ {
/*     */   protected KeyUse use;
/*     */   protected Set<KeyOperation> ops;
/*     */   protected Algorithm alg;
/*     */   protected String kid;
/*     */   protected boolean x5tKid;
/*     */   protected KeyStore keyStore;
/*     */   
/*     */   public JWKGenerator<T> keyUse(KeyUse use) {
/*  89 */     this.use = use;
/*  90 */     return this;
/*     */   }
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
/*     */   public JWKGenerator<T> keyOperations(Set<KeyOperation> ops) {
/* 104 */     this.ops = ops;
/* 105 */     return this;
/*     */   }
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
/*     */   public JWKGenerator<T> algorithm(Algorithm alg) {
/* 119 */     this.alg = alg;
/* 120 */     return this;
/*     */   }
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
/*     */   public JWKGenerator<T> keyID(String kid) {
/* 136 */     this.kid = kid;
/* 137 */     return this;
/*     */   }
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
/*     */   public JWKGenerator<T> keyIDFromThumbprint(boolean x5tKid) {
/* 156 */     this.x5tKid = x5tKid;
/* 157 */     return this;
/*     */   }
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
/*     */   public JWKGenerator<T> keyStore(KeyStore keyStore) {
/* 171 */     this.keyStore = keyStore;
/* 172 */     return this;
/*     */   }
/*     */   
/*     */   public abstract T generate() throws JOSEException;
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\gen\JWKGenerator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */