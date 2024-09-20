/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.CriticalHeaderParamsAware;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWEDecrypter;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.KeyLengthException;
/*     */ import com.nimbusds.jose.crypto.impl.AESCryptoProvider;
/*     */ import com.nimbusds.jose.crypto.impl.AESGCMKW;
/*     */ import com.nimbusds.jose.crypto.impl.AESKW;
/*     */ import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
/*     */ import com.nimbusds.jose.crypto.impl.AuthenticatedCipherText;
/*     */ import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
/*     */ import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
/*     */ import com.nimbusds.jose.jwk.OctetSequenceKey;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.util.Set;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.spec.SecretKeySpec;
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
/*     */ @ThreadSafe
/*     */ public class AESDecrypter
/*     */   extends AESCryptoProvider
/*     */   implements JWEDecrypter, CriticalHeaderParamsAware
/*     */ {
/*  83 */   private final CriticalHeaderParamsDeferral critPolicy = new CriticalHeaderParamsDeferral();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AESDecrypter(SecretKey kek) throws KeyLengthException {
/*  98 */     this(kek, (Set<String>)null);
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
/*     */   public AESDecrypter(byte[] keyBytes) throws KeyLengthException {
/* 114 */     this(new SecretKeySpec(keyBytes, "AES"));
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
/*     */   public AESDecrypter(OctetSequenceKey octJWK) throws KeyLengthException {
/* 131 */     this(octJWK.toSecretKey("AES"));
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
/*     */   public AESDecrypter(SecretKey kek, Set<String> defCritHeaders) throws KeyLengthException {
/* 150 */     super(kek);
/*     */     
/* 152 */     this.critPolicy.setDeferredCriticalHeaderParams(defCritHeaders);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getProcessedCriticalHeaderParams() {
/* 159 */     return this.critPolicy.getProcessedCriticalHeaderParams();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getDeferredCriticalHeaderParams() {
/* 166 */     return this.critPolicy.getProcessedCriticalHeaderParams();
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
/* 179 */     if (encryptedKey == null) {
/* 180 */       throw new JOSEException("Missing JWE encrypted key");
/*     */     }
/*     */     
/* 183 */     if (iv == null) {
/* 184 */       throw new JOSEException("Missing JWE initialization vector (IV)");
/*     */     }
/*     */     
/* 187 */     if (authTag == null) {
/* 188 */       throw new JOSEException("Missing JWE authentication tag");
/*     */     }
/*     */     
/* 191 */     this.critPolicy.ensureHeaderPasses(header);
/*     */ 
/*     */     
/* 194 */     JWEAlgorithm alg = header.getAlgorithm();
/* 195 */     int keyLength = header.getEncryptionMethod().cekBitLength();
/*     */ 
/*     */ 
/*     */     
/* 199 */     if (alg.equals(JWEAlgorithm.A128KW) || alg
/* 200 */       .equals(JWEAlgorithm.A192KW) || alg
/* 201 */       .equals(JWEAlgorithm.A256KW)) {
/*     */       
/* 203 */       cek = AESKW.unwrapCEK(getKey(), encryptedKey.decode(), getJCAContext().getKeyEncryptionProvider());
/*     */     }
/* 205 */     else if (alg.equals(JWEAlgorithm.A128GCMKW) || alg
/* 206 */       .equals(JWEAlgorithm.A192GCMKW) || alg
/* 207 */       .equals(JWEAlgorithm.A256GCMKW)) {
/*     */       
/* 209 */       if (header.getIV() == null) {
/* 210 */         throw new JOSEException("Missing JWE \"iv\" header parameter");
/*     */       }
/*     */       
/* 213 */       byte[] keyIV = header.getIV().decode();
/*     */       
/* 215 */       if (header.getAuthTag() == null) {
/* 216 */         throw new JOSEException("Missing JWE \"tag\" header parameter");
/*     */       }
/*     */       
/* 219 */       byte[] keyTag = header.getAuthTag().decode();
/*     */       
/* 221 */       AuthenticatedCipherText authEncrCEK = new AuthenticatedCipherText(encryptedKey.decode(), keyTag);
/* 222 */       cek = AESGCMKW.decryptCEK(getKey(), keyIV, authEncrCEK, keyLength, getJCAContext().getKeyEncryptionProvider());
/*     */     }
/*     */     else {
/*     */       
/* 226 */       throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(alg, SUPPORTED_ALGORITHMS));
/*     */     } 
/*     */     
/* 229 */     return ContentCryptoProvider.decrypt(header, encryptedKey, iv, cipherText, authTag, cek, getJCAContext());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\AESDecrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */