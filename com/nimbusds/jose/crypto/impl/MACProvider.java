/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWSAlgorithm;
/*     */ import com.nimbusds.jose.KeyLengthException;
/*     */ import com.nimbusds.jose.util.StandardCharset;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.Set;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.spec.SecretKeySpec;
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
/*     */ public abstract class MACProvider
/*     */   extends BaseJWSProvider
/*     */ {
/*     */   public static final Set<JWSAlgorithm> SUPPORTED_ALGORITHMS;
/*     */   private final byte[] secret;
/*     */   
/*     */   static {
/*  58 */     Set<JWSAlgorithm> algs = new LinkedHashSet<>();
/*  59 */     algs.add(JWSAlgorithm.HS256);
/*  60 */     algs.add(JWSAlgorithm.HS384);
/*  61 */     algs.add(JWSAlgorithm.HS512);
/*  62 */     SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(algs);
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
/*     */   protected static String getJCAAlgorithmName(JWSAlgorithm alg) throws JOSEException {
/*  80 */     if (alg.equals(JWSAlgorithm.HS256))
/*  81 */       return "HMACSHA256"; 
/*  82 */     if (alg.equals(JWSAlgorithm.HS384))
/*  83 */       return "HMACSHA384"; 
/*  84 */     if (alg.equals(JWSAlgorithm.HS512)) {
/*  85 */       return "HMACSHA512";
/*     */     }
/*  87 */     throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(alg, SUPPORTED_ALGORITHMS));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MACProvider(byte[] secret, Set<JWSAlgorithm> supportedAlgs) throws KeyLengthException {
/* 115 */     super(supportedAlgs);
/*     */     
/* 117 */     if (secret.length < 32) {
/* 118 */       throw new KeyLengthException("The secret length must be at least 256 bits");
/*     */     }
/*     */     
/* 121 */     this.secret = secret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SecretKey getSecretKey() {
/* 132 */     return new SecretKeySpec(this.secret, "MAC");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte[] getSecret() {
/* 143 */     return this.secret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSecretString() {
/* 154 */     return new String(this.secret, StandardCharset.UTF_8);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\MACProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */