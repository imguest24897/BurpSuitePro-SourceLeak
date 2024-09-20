/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWECryptoParts;
/*     */ import com.nimbusds.jose.JWEEncrypter;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.crypto.impl.ECDH1PU;
/*     */ import com.nimbusds.jose.crypto.impl.ECDH1PUCryptoProvider;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.jwk.JWK;
/*     */ import com.nimbusds.jose.jwk.OctetKeyPair;
/*     */ import com.nimbusds.jose.jwk.gen.OctetKeyPairGenerator;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ public class ECDH1PUX25519Encrypter
/*     */   extends ECDH1PUCryptoProvider
/*     */   implements JWEEncrypter
/*     */ {
/*     */   private final OctetKeyPair publicKey;
/*     */   private final OctetKeyPair privateKey;
/*     */   private final SecretKey contentEncryptionKey;
/*     */   
/*     */   public ECDH1PUX25519Encrypter(OctetKeyPair privateKey, OctetKeyPair publicKey) throws JOSEException {
/* 126 */     this(privateKey, publicKey, (SecretKey)null);
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
/*     */   public ECDH1PUX25519Encrypter(OctetKeyPair privateKey, OctetKeyPair publicKey, SecretKey contentEncryptionKey) throws JOSEException {
/* 149 */     super(publicKey.getCurve());
/*     */     
/* 151 */     this.publicKey = publicKey;
/* 152 */     this.privateKey = privateKey;
/*     */     
/* 154 */     if (contentEncryptionKey != null && (contentEncryptionKey.getAlgorithm() == null || !contentEncryptionKey.getAlgorithm().equals("AES"))) {
/* 155 */       throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES");
/*     */     }
/* 157 */     this.contentEncryptionKey = contentEncryptionKey;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<Curve> supportedEllipticCurves() {
/* 163 */     return Collections.singleton(Curve.X25519);
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
/* 174 */     return this.publicKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OctetKeyPair getPrivateKey() {
/* 184 */     return this.privateKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWECryptoParts encrypt(JWEHeader header, byte[] clearText) throws JOSEException {
/* 191 */     OctetKeyPair ephemeralPrivateKey = (new OctetKeyPairGenerator(getCurve())).generate();
/* 192 */     OctetKeyPair ephemeralPublicKey = ephemeralPrivateKey.toPublicJWK();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 197 */     JWEHeader updatedHeader = (new JWEHeader.Builder(header)).ephemeralPublicKey((JWK)ephemeralPublicKey).build();
/*     */     
/* 199 */     SecretKey Z = ECDH1PU.deriveSenderZ(this.privateKey, this.publicKey, ephemeralPrivateKey);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 205 */     return encryptWithZ(updatedHeader, Z, clearText, this.contentEncryptionKey);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\ECDH1PUX25519Encrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */