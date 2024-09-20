/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWECryptoParts;
/*     */ import com.nimbusds.jose.JWEEncrypter;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.crypto.impl.ECDH;
/*     */ import com.nimbusds.jose.crypto.impl.ECDHCryptoProvider;
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
/*     */ 
/*     */ @ThreadSafe
/*     */ public class ECDHEncrypter
/*     */   extends ECDHCryptoProvider
/*     */   implements JWEEncrypter
/*     */ {
/*     */   public static final Set<Curve> SUPPORTED_ELLIPTIC_CURVES;
/*     */   private final ECPublicKey publicKey;
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
/*     */   public ECDHEncrypter(ECPublicKey publicKey) throws JOSEException {
/* 136 */     this(publicKey, (SecretKey)null);
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
/*     */   public ECDHEncrypter(ECKey ecJWK) throws JOSEException {
/* 150 */     super(ecJWK.getCurve());
/*     */     
/* 152 */     this.publicKey = ecJWK.toECPublicKey();
/* 153 */     this.contentEncryptionKey = null;
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
/*     */   public ECDHEncrypter(ECPublicKey publicKey, SecretKey contentEncryptionKey) throws JOSEException {
/* 173 */     super(Curve.forECParameterSpec(publicKey.getParams()));
/*     */     
/* 175 */     this.publicKey = publicKey;
/*     */     
/* 177 */     if (contentEncryptionKey != null) {
/* 178 */       if (contentEncryptionKey.getAlgorithm() == null || !contentEncryptionKey.getAlgorithm().equals("AES")) {
/* 179 */         throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES");
/*     */       }
/* 181 */       this.contentEncryptionKey = contentEncryptionKey;
/*     */     } else {
/*     */       
/* 184 */       this.contentEncryptionKey = null;
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
/*     */   public ECPublicKey getPublicKey() {
/* 196 */     return this.publicKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<Curve> supportedEllipticCurves() {
/* 203 */     return SUPPORTED_ELLIPTIC_CURVES;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWECryptoParts encrypt(JWEHeader header, byte[] clearText) throws JOSEException {
/* 212 */     KeyPair ephemeralKeyPair = generateEphemeralKeyPair(this.publicKey.getParams());
/* 213 */     ECPublicKey ephemeralPublicKey = (ECPublicKey)ephemeralKeyPair.getPublic();
/* 214 */     ECPrivateKey ephemeralPrivateKey = (ECPrivateKey)ephemeralKeyPair.getPrivate();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 219 */     JWEHeader updatedHeader = (new JWEHeader.Builder(header)).ephemeralPublicKey((JWK)(new ECKey.Builder(getCurve(), ephemeralPublicKey)).build()).build();
/*     */ 
/*     */     
/* 222 */     SecretKey Z = ECDH.deriveSharedSecret(this.publicKey, ephemeralPrivateKey, 
/*     */ 
/*     */         
/* 225 */         getJCAContext().getKeyEncryptionProvider());
/*     */     
/* 227 */     return encryptWithZ(updatedHeader, Z, clearText, this.contentEncryptionKey);
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
/* 243 */     Provider keProvider = getJCAContext().getKeyEncryptionProvider();
/*     */     
/*     */     try {
/*     */       KeyPairGenerator generator;
/*     */       
/* 248 */       if (keProvider != null) {
/* 249 */         generator = KeyPairGenerator.getInstance("EC", keProvider);
/*     */       } else {
/* 251 */         generator = KeyPairGenerator.getInstance("EC");
/*     */       } 
/*     */       
/* 254 */       generator.initialize(ecParameterSpec);
/* 255 */       return generator.generateKeyPair();
/* 256 */     } catch (NoSuchAlgorithmException|java.security.InvalidAlgorithmParameterException e) {
/* 257 */       throw new JOSEException("Couldn't generate ephemeral EC key pair: " + e.getMessage(), e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\ECDHEncrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */