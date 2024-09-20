/*     */ package com.nimbusds.jose.jwk.gen;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.jwk.JWK;
/*     */ import com.nimbusds.jose.jwk.RSAKey;
/*     */ import java.security.KeyPair;
/*     */ import java.security.KeyPairGenerator;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.interfaces.RSAPublicKey;
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
/*     */ public class RSAKeyGenerator
/*     */   extends JWKGenerator<RSAKey>
/*     */ {
/*     */   public static final int MIN_KEY_SIZE_BITS = 2048;
/*     */   private final int size;
/*     */   
/*     */   public RSAKeyGenerator(int size) {
/*  59 */     this(size, false);
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
/*     */   public RSAKeyGenerator(int size, boolean allowWeakKeys) {
/*  73 */     if (!allowWeakKeys && size < 2048) {
/*  74 */       throw new IllegalArgumentException("The key size must be at least 2048 bits");
/*     */     }
/*  76 */     this.size = size;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RSAKey generate() throws JOSEException {
/*     */     KeyPairGenerator generator;
/*     */     try {
/*  86 */       if (this.keyStore != null) {
/*     */         
/*  88 */         generator = KeyPairGenerator.getInstance("RSA", this.keyStore.getProvider());
/*     */       } else {
/*  90 */         generator = KeyPairGenerator.getInstance("RSA");
/*     */       } 
/*  92 */       generator.initialize(this.size);
/*  93 */     } catch (NoSuchAlgorithmException e) {
/*  94 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */     
/*  97 */     KeyPair kp = generator.generateKeyPair();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 104 */     RSAKey.Builder builder = (new RSAKey.Builder((RSAPublicKey)kp.getPublic())).privateKey(kp.getPrivate()).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg).keyStore(this.keyStore);
/*     */     
/* 106 */     if (this.x5tKid) {
/* 107 */       builder.keyIDFromThumbprint();
/*     */     } else {
/* 109 */       builder.keyID(this.kid);
/*     */     } 
/*     */     
/* 112 */     return builder.build();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\gen\RSAKeyGenerator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */