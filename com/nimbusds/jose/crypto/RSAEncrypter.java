/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWECryptoParts;
/*     */ import com.nimbusds.jose.JWEEncrypter;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
/*     */ import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
/*     */ import com.nimbusds.jose.crypto.impl.RSA1_5;
/*     */ import com.nimbusds.jose.crypto.impl.RSACryptoProvider;
/*     */ import com.nimbusds.jose.crypto.impl.RSA_OAEP;
/*     */ import com.nimbusds.jose.crypto.impl.RSA_OAEP_SHA2;
/*     */ import com.nimbusds.jose.jwk.RSAKey;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.security.interfaces.RSAPublicKey;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.HashSet;
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
/*     */ @ThreadSafe
/*     */ public class RSAEncrypter
/*     */   extends RSACryptoProvider
/*     */   implements JWEEncrypter
/*     */ {
/*     */   private final RSAPublicKey publicKey;
/*     */   private final SecretKey contentEncryptionKey;
/*     */   
/*     */   public RSAEncrypter(RSAPublicKey publicKey) {
/* 108 */     this(publicKey, (SecretKey)null);
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
/*     */   public RSAEncrypter(RSAKey rsaJWK) throws JOSEException {
/* 122 */     this(rsaJWK.toRSAPublicKey());
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
/*     */   public RSAEncrypter(RSAPublicKey publicKey, SecretKey contentEncryptionKey) {
/* 141 */     if (publicKey == null) {
/* 142 */       throw new IllegalArgumentException("The public RSA key must not be null");
/*     */     }
/* 144 */     this.publicKey = publicKey;
/*     */     
/* 146 */     Set<String> acceptableCEKAlgs = Collections.unmodifiableSet(new HashSet<>(
/* 147 */           Arrays.asList(new String[] { "AES", "ChaCha20" })));
/*     */ 
/*     */     
/* 150 */     if (contentEncryptionKey != null) {
/* 151 */       if (contentEncryptionKey.getAlgorithm() == null || !acceptableCEKAlgs.contains(contentEncryptionKey.getAlgorithm())) {
/* 152 */         throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES or ChaCha20");
/*     */       }
/* 154 */       this.contentEncryptionKey = contentEncryptionKey;
/*     */     } else {
/*     */       
/* 157 */       this.contentEncryptionKey = null;
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
/*     */   public RSAPublicKey getPublicKey() {
/* 169 */     return this.publicKey;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public JWECryptoParts encrypt(JWEHeader header, byte[] clearText) throws JOSEException {
/*     */     SecretKey cek;
/*     */     Base64URL encryptedKey;
/* 177 */     JWEAlgorithm alg = header.getAlgorithm();
/* 178 */     EncryptionMethod enc = header.getEncryptionMethod();
/*     */ 
/*     */ 
/*     */     
/* 182 */     if (this.contentEncryptionKey != null) {
/*     */       
/* 184 */       cek = this.contentEncryptionKey;
/*     */     } else {
/*     */       
/* 187 */       cek = ContentCryptoProvider.generateCEK(enc, getJCAContext().getSecureRandom());
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 192 */     if (alg.equals(JWEAlgorithm.RSA1_5)) {
/* 193 */       encryptedKey = Base64URL.encode(RSA1_5.encryptCEK(this.publicKey, cek, getJCAContext().getKeyEncryptionProvider()));
/* 194 */     } else if (alg.equals(JWEAlgorithm.RSA_OAEP)) {
/* 195 */       encryptedKey = Base64URL.encode(RSA_OAEP.encryptCEK(this.publicKey, cek, getJCAContext().getKeyEncryptionProvider()));
/* 196 */     } else if (alg.equals(JWEAlgorithm.RSA_OAEP_256)) {
/* 197 */       encryptedKey = Base64URL.encode(RSA_OAEP_SHA2.encryptCEK(this.publicKey, cek, 256, getJCAContext().getKeyEncryptionProvider()));
/* 198 */     } else if (alg.equals(JWEAlgorithm.RSA_OAEP_384)) {
/* 199 */       encryptedKey = Base64URL.encode(RSA_OAEP_SHA2.encryptCEK(this.publicKey, cek, 384, getJCAContext().getKeyEncryptionProvider()));
/* 200 */     } else if (alg.equals(JWEAlgorithm.RSA_OAEP_512)) {
/* 201 */       encryptedKey = Base64URL.encode(RSA_OAEP_SHA2.encryptCEK(this.publicKey, cek, 512, getJCAContext().getKeyEncryptionProvider()));
/*     */     } else {
/* 203 */       throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(alg, SUPPORTED_ALGORITHMS));
/*     */     } 
/*     */     
/* 206 */     return ContentCryptoProvider.encrypt(header, clearText, cek, encryptedKey, getJCAContext());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\RSAEncrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */