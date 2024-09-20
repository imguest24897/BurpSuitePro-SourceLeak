/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.CriticalHeaderParamsAware;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEDecrypter;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
/*     */ import com.nimbusds.jose.crypto.impl.ECDH;
/*     */ import com.nimbusds.jose.crypto.impl.ECDHCryptoProvider;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.jwk.OctetKeyPair;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.util.Collections;
/*     */ import java.util.Set;
/*     */ import javax.crypto.SecretKey;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class X25519Decrypter
/*     */   extends ECDHCryptoProvider
/*     */   implements JWEDecrypter, CriticalHeaderParamsAware
/*     */ {
/*     */   private final OctetKeyPair privateKey;
/*  90 */   private final CriticalHeaderParamsDeferral critPolicy = new CriticalHeaderParamsDeferral();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public X25519Decrypter(OctetKeyPair privateKey) throws JOSEException {
/* 103 */     this(privateKey, null);
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
/*     */   public X25519Decrypter(OctetKeyPair privateKey, Set<String> defCritHeaders) throws JOSEException {
/* 120 */     super(privateKey.getCurve());
/*     */     
/* 122 */     if (!Curve.X25519.equals(privateKey.getCurve())) {
/* 123 */       throw new JOSEException("X25519Decrypter only supports OctetKeyPairs with crv=X25519");
/*     */     }
/*     */     
/* 126 */     if (!privateKey.isPrivate()) {
/* 127 */       throw new JOSEException("The OctetKeyPair doesn't contain a private part");
/*     */     }
/*     */     
/* 130 */     this.privateKey = privateKey;
/*     */     
/* 132 */     this.critPolicy.setDeferredCriticalHeaderParams(defCritHeaders);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<Curve> supportedEllipticCurves() {
/* 139 */     return Collections.singleton(Curve.X25519);
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
/* 150 */     return this.privateKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getProcessedCriticalHeaderParams() {
/* 157 */     return this.critPolicy.getProcessedCriticalHeaderParams();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getDeferredCriticalHeaderParams() {
/* 164 */     return this.critPolicy.getProcessedCriticalHeaderParams();
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
/*     */   public byte[] decrypt(JWEHeader header, Base64URL encryptedKey, Base64URL iv, Base64URL cipherText, Base64URL authTag) throws JOSEException {
/* 177 */     this.critPolicy.ensureHeaderPasses(header);
/*     */ 
/*     */     
/* 180 */     OctetKeyPair ephemeralPublicKey = (OctetKeyPair)header.getEphemeralPublicKey();
/*     */     
/* 182 */     if (ephemeralPublicKey == null) {
/* 183 */       throw new JOSEException("Missing ephemeral public key epk JWE header parameter");
/*     */     }
/*     */     
/* 186 */     if (!this.privateKey.getCurve().equals(ephemeralPublicKey.getCurve())) {
/* 187 */       throw new JOSEException("Curve of ephemeral public key does not match curve of private key");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 193 */     SecretKey Z = ECDH.deriveSharedSecret(ephemeralPublicKey, this.privateKey);
/*     */     
/* 195 */     return decryptWithZ(header, Z, encryptedKey, iv, cipherText, authTag);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\X25519Decrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */