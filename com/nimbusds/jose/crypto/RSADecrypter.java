/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.CriticalHeaderParamsAware;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWEDecrypter;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
/*     */ import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
/*     */ import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
/*     */ import com.nimbusds.jose.crypto.impl.RSA1_5;
/*     */ import com.nimbusds.jose.crypto.impl.RSACryptoProvider;
/*     */ import com.nimbusds.jose.crypto.impl.RSAKeyUtils;
/*     */ import com.nimbusds.jose.crypto.impl.RSA_OAEP;
/*     */ import com.nimbusds.jose.crypto.impl.RSA_OAEP_SHA2;
/*     */ import com.nimbusds.jose.jwk.RSAKey;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.security.PrivateKey;
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
/*     */ @ThreadSafe
/*     */ public class RSADecrypter
/*     */   extends RSACryptoProvider
/*     */   implements JWEDecrypter, CriticalHeaderParamsAware
/*     */ {
/*  84 */   private final CriticalHeaderParamsDeferral critPolicy = new CriticalHeaderParamsDeferral();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final PrivateKey privateKey;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Exception cekDecryptionException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RSADecrypter(PrivateKey privateKey) {
/* 112 */     this(privateKey, (Set<String>)null, false);
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
/*     */   public RSADecrypter(RSAKey rsaJWK) throws JOSEException {
/* 130 */     this(RSAKeyUtils.toRSAPrivateKey(rsaJWK));
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
/*     */   public RSADecrypter(PrivateKey privateKey, Set<String> defCritHeaders) {
/* 151 */     this(privateKey, defCritHeaders, false);
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
/*     */   public RSADecrypter(PrivateKey privateKey, Set<String> defCritHeaders, boolean allowWeakKey) {
/* 175 */     if (!privateKey.getAlgorithm().equalsIgnoreCase("RSA")) {
/* 176 */       throw new IllegalArgumentException("The private key algorithm must be RSA");
/*     */     }
/*     */     
/* 179 */     if (!allowWeakKey) {
/*     */       
/* 181 */       int keyBitLength = RSAKeyUtils.keyBitLength(privateKey);
/*     */       
/* 183 */       if (keyBitLength > 0 && keyBitLength < 2048) {
/* 184 */         throw new IllegalArgumentException("The RSA key size must be at least 2048 bits");
/*     */       }
/*     */     } 
/*     */     
/* 188 */     this.privateKey = privateKey;
/*     */     
/* 190 */     this.critPolicy.setDeferredCriticalHeaderParams(defCritHeaders);
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
/*     */   public PrivateKey getPrivateKey() {
/* 204 */     return this.privateKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getProcessedCriticalHeaderParams() {
/* 211 */     return this.critPolicy.getProcessedCriticalHeaderParams();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getDeferredCriticalHeaderParams() {
/* 218 */     return this.critPolicy.getProcessedCriticalHeaderParams();
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
/*     */   public byte[] decrypt(JWEHeader header, Base64URL encryptedKey, Base64URL iv, Base64URL cipherText, Base64URL authTag) throws JOSEException {
/*     */     SecretKey cek;
/* 231 */     if (encryptedKey == null) {
/* 232 */       throw new JOSEException("Missing JWE encrypted key");
/*     */     }
/*     */     
/* 235 */     if (iv == null) {
/* 236 */       throw new JOSEException("Missing JWE initialization vector (IV)");
/*     */     }
/*     */     
/* 239 */     if (authTag == null) {
/* 240 */       throw new JOSEException("Missing JWE authentication tag");
/*     */     }
/*     */     
/* 243 */     this.critPolicy.ensureHeaderPasses(header);
/*     */ 
/*     */ 
/*     */     
/* 247 */     JWEAlgorithm alg = header.getAlgorithm();
/*     */ 
/*     */ 
/*     */     
/* 251 */     if (alg.equals(JWEAlgorithm.RSA1_5)) {
/*     */       
/* 253 */       int keyLength = header.getEncryptionMethod().cekBitLength();
/*     */ 
/*     */ 
/*     */       
/* 257 */       SecretKey randomCEK = ContentCryptoProvider.generateCEK(header.getEncryptionMethod(), getJCAContext().getSecureRandom());
/*     */       
/*     */       try {
/* 260 */         cek = RSA1_5.decryptCEK(this.privateKey, encryptedKey.decode(), keyLength, getJCAContext().getKeyEncryptionProvider());
/*     */         
/* 262 */         if (cek == null)
/*     */         {
/*     */           
/* 265 */           cek = randomCEK;
/*     */         }
/*     */       }
/* 268 */       catch (Exception e) {
/*     */         
/* 270 */         this.cekDecryptionException = e;
/* 271 */         cek = randomCEK;
/*     */       } 
/*     */       
/* 274 */       this.cekDecryptionException = null;
/*     */     }
/* 276 */     else if (alg.equals(JWEAlgorithm.RSA_OAEP)) {
/* 277 */       cek = RSA_OAEP.decryptCEK(this.privateKey, encryptedKey.decode(), getJCAContext().getKeyEncryptionProvider());
/* 278 */     } else if (alg.equals(JWEAlgorithm.RSA_OAEP_256)) {
/* 279 */       cek = RSA_OAEP_SHA2.decryptCEK(this.privateKey, encryptedKey.decode(), 256, getJCAContext().getKeyEncryptionProvider());
/* 280 */     } else if (alg.equals(JWEAlgorithm.RSA_OAEP_384)) {
/* 281 */       cek = RSA_OAEP_SHA2.decryptCEK(this.privateKey, encryptedKey.decode(), 384, getJCAContext().getKeyEncryptionProvider());
/* 282 */     } else if (alg.equals(JWEAlgorithm.RSA_OAEP_512)) {
/* 283 */       cek = RSA_OAEP_SHA2.decryptCEK(this.privateKey, encryptedKey.decode(), 512, getJCAContext().getKeyEncryptionProvider());
/*     */     } else {
/* 285 */       throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(alg, SUPPORTED_ALGORITHMS));
/*     */     } 
/*     */     
/* 288 */     return ContentCryptoProvider.decrypt(header, encryptedKey, iv, cipherText, authTag, cek, getJCAContext());
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
/*     */   public Exception getCEKDecryptionException() {
/* 301 */     return this.cekDecryptionException;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\RSADecrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */