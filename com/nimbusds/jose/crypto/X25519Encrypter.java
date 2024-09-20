/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.google.crypto.tink.subtle.X25519;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWECryptoParts;
/*     */ import com.nimbusds.jose.JWEEncrypter;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.crypto.impl.ECDH;
/*     */ import com.nimbusds.jose.crypto.impl.ECDHCryptoProvider;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.jwk.JWK;
/*     */ import com.nimbusds.jose.jwk.OctetKeyPair;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.security.InvalidKeyException;
/*     */ import java.util.Collections;
/*     */ import java.util.Set;
/*     */ import javax.crypto.SecretKey;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ public class X25519Encrypter
/*     */   extends ECDHCryptoProvider
/*     */   implements JWEEncrypter
/*     */ {
/*     */   private final OctetKeyPair publicKey;
/*     */   
/*     */   public X25519Encrypter(OctetKeyPair publicKey) throws JOSEException {
/* 100 */     super(publicKey.getCurve());
/*     */     
/* 102 */     if (!Curve.X25519.equals(publicKey.getCurve())) {
/* 103 */       throw new JOSEException("X25519Encrypter only supports OctetKeyPairs with crv=X25519");
/*     */     }
/*     */     
/* 106 */     if (publicKey.isPrivate()) {
/* 107 */       throw new JOSEException("X25519Encrypter requires a public key, use OctetKeyPair.toPublicJWK()");
/*     */     }
/*     */     
/* 110 */     this.publicKey = publicKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<Curve> supportedEllipticCurves() {
/* 117 */     return Collections.singleton(Curve.X25519);
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
/* 128 */     return this.publicKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWECryptoParts encrypt(JWEHeader header, byte[] clearText) throws JOSEException {
/* 137 */     byte[] ephemeralPublicKeyBytes, ephemeralPrivateKeyBytes = X25519.generatePrivateKey();
/*     */     
/*     */     try {
/* 140 */       ephemeralPublicKeyBytes = X25519.publicFromPrivate(ephemeralPrivateKeyBytes);
/*     */     }
/* 142 */     catch (InvalidKeyException e) {
/*     */       
/* 144 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     OctetKeyPair ephemeralPrivateKey = (new OctetKeyPair.Builder(getCurve(), Base64URL.encode(ephemeralPublicKeyBytes))).d(Base64URL.encode(ephemeralPrivateKeyBytes)).build();
/* 151 */     OctetKeyPair ephemeralPublicKey = ephemeralPrivateKey.toPublicJWK();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 156 */     JWEHeader updatedHeader = (new JWEHeader.Builder(header)).ephemeralPublicKey((JWK)ephemeralPublicKey).build();
/*     */ 
/*     */     
/* 159 */     SecretKey Z = ECDH.deriveSharedSecret(this.publicKey, ephemeralPrivateKey);
/*     */     
/* 161 */     return encryptWithZ(updatedHeader, Z, clearText);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\X25519Encrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */