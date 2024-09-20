/*     */ package com.nimbusds.jose.jwk.gen;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.jwk.JWK;
/*     */ import com.nimbusds.jose.jwk.OctetSequenceKey;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.security.SecureRandom;
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
/*     */ public class OctetSequenceKeyGenerator
/*     */   extends JWKGenerator<OctetSequenceKey>
/*     */ {
/*     */   public static final int MIN_KEY_SIZE_BITS = 112;
/*     */   private final int size;
/*     */   private SecureRandom secureRandom;
/*     */   
/*     */   public OctetSequenceKeyGenerator(int size) {
/*  63 */     if (size < 112) {
/*  64 */       throw new IllegalArgumentException("The key size must be at least 112 bits");
/*     */     }
/*  66 */     if (size % 8 != 0) {
/*  67 */       throw new IllegalArgumentException("The key size in bits must be divisible by 8");
/*     */     }
/*  69 */     this.size = size;
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
/*     */   public OctetSequenceKeyGenerator secureRandom(SecureRandom secureRandom) {
/*  83 */     this.secureRandom = secureRandom;
/*  84 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OctetSequenceKey generate() throws JOSEException {
/*  92 */     byte[] keyMaterial = new byte[this.size / 8];
/*     */     
/*  94 */     if (this.secureRandom != null) {
/*  95 */       this.secureRandom.nextBytes(keyMaterial);
/*     */     } else {
/*     */       
/*  98 */       (new SecureRandom()).nextBytes(keyMaterial);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     OctetSequenceKey.Builder builder = (new OctetSequenceKey.Builder(Base64URL.encode(keyMaterial))).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg).keyStore(this.keyStore);
/*     */     
/* 107 */     if (this.x5tKid) {
/* 108 */       builder.keyIDFromThumbprint();
/*     */     } else {
/* 110 */       builder.keyID(this.kid);
/*     */     } 
/*     */     
/* 113 */     return builder.build();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\gen\OctetSequenceKeyGenerator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */