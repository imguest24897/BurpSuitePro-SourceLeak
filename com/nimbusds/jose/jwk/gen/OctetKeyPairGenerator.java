/*     */ package com.nimbusds.jose.jwk.gen;
/*     */ 
/*     */ import com.google.crypto.tink.subtle.Ed25519Sign;
/*     */ import com.google.crypto.tink.subtle.X25519;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.jwk.JWK;
/*     */ import com.nimbusds.jose.jwk.OctetKeyPair;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.security.GeneralSecurityException;
/*     */ import java.security.InvalidKeyException;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedHashSet;
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
/*     */ public class OctetKeyPairGenerator
/*     */   extends JWKGenerator<OctetKeyPair>
/*     */ {
/*     */   private final Curve crv;
/*     */   public static final Set<Curve> SUPPORTED_CURVES;
/*     */   
/*     */   static {
/*  63 */     Set<Curve> curves = new LinkedHashSet<>();
/*  64 */     curves.add(Curve.X25519);
/*  65 */     curves.add(Curve.Ed25519);
/*  66 */     SUPPORTED_CURVES = Collections.unmodifiableSet(curves);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OctetKeyPairGenerator(Curve crv) {
/*  77 */     if (crv == null) {
/*  78 */       throw new IllegalArgumentException("The curve must not be null");
/*     */     }
/*     */     
/*  81 */     if (!SUPPORTED_CURVES.contains(crv)) {
/*  82 */       throw new IllegalArgumentException("Curve not supported for OKP generation");
/*     */     }
/*     */     
/*  85 */     this.crv = crv;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OctetKeyPair generate() throws JOSEException {
/*     */     Base64URL privateKey, publicKey;
/*  96 */     if (this.crv.equals(Curve.X25519)) {
/*     */       byte[] privateKeyBytes, publicKeyBytes;
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 102 */         privateKeyBytes = X25519.generatePrivateKey();
/* 103 */         publicKeyBytes = X25519.publicFromPrivate(privateKeyBytes);
/*     */       }
/* 105 */       catch (InvalidKeyException e) {
/*     */         
/* 107 */         throw new JOSEException(e.getMessage(), e);
/*     */       } 
/*     */       
/* 110 */       privateKey = Base64URL.encode(privateKeyBytes);
/* 111 */       publicKey = Base64URL.encode(publicKeyBytes);
/*     */     }
/* 113 */     else if (this.crv.equals(Curve.Ed25519)) {
/*     */       Ed25519Sign.KeyPair tinkKeyPair;
/*     */ 
/*     */       
/*     */       try {
/* 118 */         tinkKeyPair = Ed25519Sign.KeyPair.newKeyPair();
/*     */       }
/* 120 */       catch (GeneralSecurityException e) {
/*     */         byte[] publicKeyBytes;
/* 122 */         throw new JOSEException(publicKeyBytes.getMessage(), publicKeyBytes);
/*     */       } 
/*     */       
/* 125 */       privateKey = Base64URL.encode(tinkKeyPair.getPrivateKey());
/* 126 */       publicKey = Base64URL.encode(tinkKeyPair.getPublicKey());
/*     */     }
/*     */     else {
/*     */       
/* 130 */       throw new JOSEException("Curve not supported");
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 137 */     OctetKeyPair.Builder builder = (new OctetKeyPair.Builder(this.crv, publicKey)).d(privateKey).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg);
/*     */     
/* 139 */     if (this.x5tKid) {
/* 140 */       builder.keyIDFromThumbprint();
/*     */     } else {
/* 142 */       builder.keyID(this.kid);
/*     */     } 
/*     */     
/* 145 */     return builder.build();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\gen\OctetKeyPairGenerator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */