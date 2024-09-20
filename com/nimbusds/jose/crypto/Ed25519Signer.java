/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.google.crypto.tink.subtle.Ed25519Sign;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWSAlgorithm;
/*     */ import com.nimbusds.jose.JWSHeader;
/*     */ import com.nimbusds.jose.JWSSigner;
/*     */ import com.nimbusds.jose.crypto.impl.EdDSAProvider;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.jwk.OctetKeyPair;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.security.GeneralSecurityException;
/*     */ import net.jcip.annotations.ThreadSafe;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ThreadSafe
/*     */ public class Ed25519Signer
/*     */   extends EdDSAProvider
/*     */   implements JWSSigner
/*     */ {
/*     */   private final OctetKeyPair privateKey;
/*     */   private final Ed25519Sign tinkSigner;
/*     */   
/*     */   public Ed25519Signer(OctetKeyPair privateKey) throws JOSEException {
/*  83 */     if (!Curve.Ed25519.equals(privateKey.getCurve())) {
/*  84 */       throw new JOSEException("Ed25519Signer only supports OctetKeyPairs with crv=Ed25519");
/*     */     }
/*     */     
/*  87 */     if (!privateKey.isPrivate()) {
/*  88 */       throw new JOSEException("The OctetKeyPair doesn't contain a private part");
/*     */     }
/*     */     
/*  91 */     this.privateKey = privateKey;
/*     */     
/*     */     try {
/*  94 */       this.tinkSigner = new Ed25519Sign(privateKey.getDecodedD());
/*     */     }
/*  96 */     catch (GeneralSecurityException e) {
/*     */       
/*  98 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OctetKeyPair getPrivateKey() {
/* 110 */     return this.privateKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Base64URL sign(JWSHeader header, byte[] signingInput) throws JOSEException {
/*     */     byte[] jwsSignature;
/* 119 */     JWSAlgorithm alg = header.getAlgorithm();
/* 120 */     if (!JWSAlgorithm.EdDSA.equals(alg)) {
/* 121 */       throw new JOSEException("Ed25519Signer requires alg=EdDSA in JWSHeader");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 127 */       jwsSignature = this.tinkSigner.sign(signingInput);
/*     */     }
/* 129 */     catch (GeneralSecurityException e) {
/*     */       
/* 131 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */     
/* 134 */     return Base64URL.encode(jwsSignature);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\Ed25519Signer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */