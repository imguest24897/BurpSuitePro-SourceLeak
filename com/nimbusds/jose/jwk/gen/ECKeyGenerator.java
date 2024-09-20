/*     */ package com.nimbusds.jose.jwk.gen;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.jwk.ECKey;
/*     */ import com.nimbusds.jose.jwk.JWK;
/*     */ import java.security.GeneralSecurityException;
/*     */ import java.security.KeyPair;
/*     */ import java.security.KeyPairGenerator;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.interfaces.ECPublicKey;
/*     */ import java.security.spec.ECParameterSpec;
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
/*     */ public class ECKeyGenerator
/*     */   extends JWKGenerator<ECKey>
/*     */ {
/*     */   private final Curve crv;
/*     */   
/*     */   public ECKeyGenerator(Curve crv) {
/*  64 */     if (crv == null) {
/*  65 */       throw new IllegalArgumentException("The curve must not be null");
/*     */     }
/*  67 */     this.crv = crv;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ECKey generate() throws JOSEException {
/*     */     KeyPairGenerator generator;
/*  75 */     ECParameterSpec ecSpec = this.crv.toECParameterSpec();
/*     */ 
/*     */     
/*     */     try {
/*  79 */       if (this.keyStore != null) {
/*     */         
/*  81 */         generator = KeyPairGenerator.getInstance("EC", this.keyStore.getProvider());
/*     */       } else {
/*  83 */         generator = KeyPairGenerator.getInstance("EC");
/*     */       } 
/*  85 */       generator.initialize(ecSpec);
/*  86 */     } catch (NoSuchAlgorithmException|java.security.InvalidAlgorithmParameterException e) {
/*  87 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */     
/*  90 */     KeyPair kp = generator.generateKeyPair();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     ECKey.Builder builder = (new ECKey.Builder(this.crv, (ECPublicKey)kp.getPublic())).privateKey(kp.getPrivate()).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg).keyStore(this.keyStore);
/*     */     
/*  99 */     if (this.x5tKid) {
/* 100 */       builder.keyIDFromThumbprint();
/*     */     } else {
/* 102 */       builder.keyID(this.kid);
/*     */     } 
/*     */     
/* 105 */     return builder.build();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\gen\ECKeyGenerator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */