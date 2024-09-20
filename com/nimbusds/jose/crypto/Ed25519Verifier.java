/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.google.crypto.tink.subtle.Ed25519Verify;
/*     */ import com.nimbusds.jose.CriticalHeaderParamsAware;
/*     */ import com.nimbusds.jose.Header;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWSAlgorithm;
/*     */ import com.nimbusds.jose.JWSHeader;
/*     */ import com.nimbusds.jose.JWSVerifier;
/*     */ import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
/*     */ import com.nimbusds.jose.crypto.impl.EdDSAProvider;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.jwk.OctetKeyPair;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.security.GeneralSecurityException;
/*     */ import java.util.Set;
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
/*     */ @ThreadSafe
/*     */ public class Ed25519Verifier
/*     */   extends EdDSAProvider
/*     */   implements JWSVerifier, CriticalHeaderParamsAware
/*     */ {
/*  63 */   private final CriticalHeaderParamsDeferral critPolicy = new CriticalHeaderParamsDeferral();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final OctetKeyPair publicKey;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Ed25519Verify tinkVerifier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Ed25519Verifier(OctetKeyPair publicKey) throws JOSEException {
/*  82 */     this(publicKey, null);
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
/*     */   public Ed25519Verifier(OctetKeyPair publicKey, Set<String> defCritHeaders) throws JOSEException {
/* 101 */     if (!Curve.Ed25519.equals(publicKey.getCurve())) {
/* 102 */       throw new JOSEException("Ed25519Verifier only supports OctetKeyPairs with crv=Ed25519");
/*     */     }
/*     */     
/* 105 */     if (publicKey.isPrivate()) {
/* 106 */       throw new JOSEException("Ed25519Verifier requires a public key, use OctetKeyPair.toPublicJWK()");
/*     */     }
/*     */     
/* 109 */     this.publicKey = publicKey;
/* 110 */     this.tinkVerifier = new Ed25519Verify(publicKey.getDecodedX());
/* 111 */     this.critPolicy.setDeferredCriticalHeaderParams(defCritHeaders);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OctetKeyPair getPublicKey() {
/* 122 */     return this.publicKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getProcessedCriticalHeaderParams() {
/* 129 */     return this.critPolicy.getProcessedCriticalHeaderParams();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getDeferredCriticalHeaderParams() {
/* 136 */     return this.critPolicy.getProcessedCriticalHeaderParams();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean verify(JWSHeader header, byte[] signedContent, Base64URL signature) throws JOSEException {
/* 147 */     JWSAlgorithm alg = header.getAlgorithm();
/* 148 */     if (!JWSAlgorithm.EdDSA.equals(alg)) {
/* 149 */       throw new JOSEException("Ed25519Verifier requires alg=EdDSA in JWSHeader");
/*     */     }
/*     */ 
/*     */     
/* 153 */     if (!this.critPolicy.headerPasses((Header)header)) {
/* 154 */       return false;
/*     */     }
/*     */     
/* 157 */     byte[] jwsSignature = signature.decode();
/*     */     
/*     */     try {
/* 160 */       this.tinkVerifier.verify(jwsSignature, signedContent);
/* 161 */       return true;
/*     */     }
/* 163 */     catch (GeneralSecurityException e) {
/* 164 */       return false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\Ed25519Verifier.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */