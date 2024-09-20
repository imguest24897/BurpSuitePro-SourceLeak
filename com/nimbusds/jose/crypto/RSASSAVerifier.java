/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.CriticalHeaderParamsAware;
/*     */ import com.nimbusds.jose.Header;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWSHeader;
/*     */ import com.nimbusds.jose.JWSVerifier;
/*     */ import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
/*     */ import com.nimbusds.jose.crypto.impl.RSASSA;
/*     */ import com.nimbusds.jose.crypto.impl.RSASSAProvider;
/*     */ import com.nimbusds.jose.jwk.RSAKey;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.security.InvalidKeyException;
/*     */ import java.security.Signature;
/*     */ import java.security.SignatureException;
/*     */ import java.security.interfaces.RSAPublicKey;
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
/*     */ public class RSASSAVerifier
/*     */   extends RSASSAProvider
/*     */   implements JWSVerifier, CriticalHeaderParamsAware
/*     */ {
/*  73 */   private final CriticalHeaderParamsDeferral critPolicy = new CriticalHeaderParamsDeferral();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final RSAPublicKey publicKey;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RSASSAVerifier(RSAPublicKey publicKey) {
/*  89 */     this(publicKey, null);
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
/*     */   public RSASSAVerifier(RSAKey rsaJWK) throws JOSEException {
/* 103 */     this(rsaJWK.toRSAPublicKey(), null);
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
/*     */   public RSASSAVerifier(RSAPublicKey publicKey, Set<String> defCritHeaders) {
/* 118 */     if (publicKey == null) {
/* 119 */       throw new IllegalArgumentException("The public RSA key must not be null");
/*     */     }
/*     */     
/* 122 */     this.publicKey = publicKey;
/*     */     
/* 124 */     this.critPolicy.setDeferredCriticalHeaderParams(defCritHeaders);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RSAPublicKey getPublicKey() {
/* 135 */     return this.publicKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getProcessedCriticalHeaderParams() {
/* 142 */     return this.critPolicy.getProcessedCriticalHeaderParams();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getDeferredCriticalHeaderParams() {
/* 149 */     return this.critPolicy.getDeferredCriticalHeaderParams();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean verify(JWSHeader header, byte[] signedContent, Base64URL signature) throws JOSEException {
/* 159 */     if (!this.critPolicy.headerPasses((Header)header)) {
/* 160 */       return false;
/*     */     }
/*     */     
/* 163 */     Signature verifier = RSASSA.getSignerAndVerifier(header.getAlgorithm(), getJCAContext().getProvider());
/*     */     
/*     */     try {
/* 166 */       verifier.initVerify(this.publicKey);
/*     */     }
/* 168 */     catch (InvalidKeyException e) {
/* 169 */       throw new JOSEException("Invalid public RSA key: " + e.getMessage(), e);
/*     */     } 
/*     */     
/*     */     try {
/* 173 */       verifier.update(signedContent);
/* 174 */       return verifier.verify(signature.decode());
/*     */     }
/* 176 */     catch (SignatureException e) {
/* 177 */       return false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\RSASSAVerifier.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */