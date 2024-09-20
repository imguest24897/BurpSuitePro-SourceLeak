/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWECryptoParts;
/*     */ import com.nimbusds.jose.JWEEncrypter;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.crypto.impl.ECDH1PU;
/*     */ import com.nimbusds.jose.crypto.impl.ECDH1PUCryptoProvider;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.jwk.ECKey;
/*     */ import com.nimbusds.jose.jwk.JWK;
/*     */ import java.security.GeneralSecurityException;
/*     */ import java.security.KeyPair;
/*     */ import java.security.KeyPairGenerator;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.Provider;
/*     */ import java.security.interfaces.ECPrivateKey;
/*     */ import java.security.interfaces.ECPublicKey;
/*     */ import java.security.spec.ECParameterSpec;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedHashSet;
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
/*     */ @ThreadSafe
/*     */ public class ECDH1PUEncrypter
/*     */   extends ECDH1PUCryptoProvider
/*     */   implements JWEEncrypter
/*     */ {
/*     */   public static final Set<Curve> SUPPORTED_ELLIPTIC_CURVES;
/*     */   private final ECPublicKey publicKey;
/*     */   private final ECPrivateKey privateKey;
/*     */   private final SecretKey contentEncryptionKey;
/*     */   
/*     */   static {
/* 107 */     Set<Curve> curves = new LinkedHashSet<>();
/* 108 */     curves.add(Curve.P_256);
/* 109 */     curves.add(Curve.P_384);
/* 110 */     curves.add(Curve.P_521);
/* 111 */     SUPPORTED_ELLIPTIC_CURVES = Collections.unmodifiableSet(curves);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ECDH1PUEncrypter(ECPrivateKey privateKey, ECPublicKey publicKey) throws JOSEException {
/* 142 */     this(privateKey, publicKey, (SecretKey)null);
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
/*     */ 
/*     */   
/*     */   public ECDH1PUEncrypter(ECPrivateKey privateKey, ECPublicKey publicKey, SecretKey contentEncryptionKey) throws JOSEException {
/* 167 */     super(Curve.forECParameterSpec(publicKey.getParams()));
/*     */     
/* 169 */     this.privateKey = privateKey;
/* 170 */     this.publicKey = publicKey;
/*     */     
/* 172 */     if (contentEncryptionKey != null && (contentEncryptionKey.getAlgorithm() == null || !contentEncryptionKey.getAlgorithm().equals("AES"))) {
/* 173 */       throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES");
/*     */     }
/* 175 */     this.contentEncryptionKey = contentEncryptionKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ECPublicKey getPublicKey() {
/* 186 */     return this.publicKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ECPrivateKey getPrivateKey() {
/* 197 */     return this.privateKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<Curve> supportedEllipticCurves() {
/* 204 */     return SUPPORTED_ELLIPTIC_CURVES;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWECryptoParts encrypt(JWEHeader header, byte[] clearText) throws JOSEException {
/* 213 */     KeyPair ephemeralKeyPair = generateEphemeralKeyPair(this.publicKey.getParams());
/* 214 */     ECPublicKey ephemeralPublicKey = (ECPublicKey)ephemeralKeyPair.getPublic();
/* 215 */     ECPrivateKey ephemeralPrivateKey = (ECPrivateKey)ephemeralKeyPair.getPrivate();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 220 */     JWEHeader updatedHeader = (new JWEHeader.Builder(header)).ephemeralPublicKey((JWK)(new ECKey.Builder(getCurve(), ephemeralPublicKey)).build()).build();
/*     */     
/* 222 */     SecretKey Z = ECDH1PU.deriveSenderZ(this.privateKey, this.publicKey, ephemeralPrivateKey, 
/*     */ 
/*     */ 
/*     */         
/* 226 */         getJCAContext().getKeyEncryptionProvider());
/*     */ 
/*     */     
/* 229 */     return encryptWithZ(updatedHeader, Z, clearText, this.contentEncryptionKey);
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
/*     */   private KeyPair generateEphemeralKeyPair(ECParameterSpec ecParameterSpec) throws JOSEException {
/* 245 */     Provider keProvider = getJCAContext().getKeyEncryptionProvider();
/*     */     
/*     */     try {
/*     */       KeyPairGenerator generator;
/*     */       
/* 250 */       if (keProvider != null) {
/* 251 */         generator = KeyPairGenerator.getInstance("EC", keProvider);
/*     */       } else {
/* 253 */         generator = KeyPairGenerator.getInstance("EC");
/*     */       } 
/*     */       
/* 256 */       generator.initialize(ecParameterSpec);
/* 257 */       return generator.generateKeyPair();
/* 258 */     } catch (NoSuchAlgorithmException|java.security.InvalidAlgorithmParameterException e) {
/* 259 */       throw new JOSEException("Couldn't generate ephemeral EC key pair: " + e.getMessage(), e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\ECDH1PUEncrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */