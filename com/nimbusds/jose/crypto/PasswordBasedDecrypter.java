/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.CriticalHeaderParamsAware;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWEDecrypter;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.crypto.impl.AESKW;
/*     */ import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
/*     */ import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
/*     */ import com.nimbusds.jose.crypto.impl.PBKDF2;
/*     */ import com.nimbusds.jose.crypto.impl.PRFParams;
/*     */ import com.nimbusds.jose.crypto.impl.PasswordBasedCryptoProvider;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.StandardCharset;
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
/*     */ @ThreadSafe
/*     */ public class PasswordBasedDecrypter
/*     */   extends PasswordBasedCryptoProvider
/*     */   implements JWEDecrypter, CriticalHeaderParamsAware
/*     */ {
/*  73 */   private final CriticalHeaderParamsDeferral critPolicy = new CriticalHeaderParamsDeferral();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PasswordBasedDecrypter(byte[] password) {
/*  84 */     super(password);
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
/*     */   public PasswordBasedDecrypter(String password) {
/*  96 */     super(password.getBytes(StandardCharset.UTF_8));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getProcessedCriticalHeaderParams() {
/* 103 */     return this.critPolicy.getProcessedCriticalHeaderParams();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getDeferredCriticalHeaderParams() {
/* 110 */     return this.critPolicy.getProcessedCriticalHeaderParams();
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
/* 123 */     if (encryptedKey == null) {
/* 124 */       throw new JOSEException("Missing JWE encrypted key");
/*     */     }
/*     */     
/* 127 */     if (iv == null) {
/* 128 */       throw new JOSEException("Missing JWE initialization vector (IV)");
/*     */     }
/*     */     
/* 131 */     if (authTag == null) {
/* 132 */       throw new JOSEException("Missing JWE authentication tag");
/*     */     }
/*     */     
/* 135 */     if (header.getPBES2Salt() == null) {
/* 136 */       throw new JOSEException("Missing JWE p2s header parameter");
/*     */     }
/*     */     
/* 139 */     byte[] salt = header.getPBES2Salt().decode();
/*     */     
/* 141 */     if (header.getPBES2Count() < 1) {
/* 142 */       throw new JOSEException("Missing JWE p2c header parameter");
/*     */     }
/*     */     
/* 145 */     int iterationCount = header.getPBES2Count();
/*     */     
/* 147 */     this.critPolicy.ensureHeaderPasses(header);
/*     */     
/* 149 */     JWEAlgorithm alg = header.getAlgorithm();
/* 150 */     byte[] formattedSalt = PBKDF2.formatSalt(alg, salt);
/* 151 */     PRFParams prfParams = PRFParams.resolve(alg, getJCAContext().getMACProvider());
/* 152 */     SecretKey psKey = PBKDF2.deriveKey(getPassword(), formattedSalt, iterationCount, prfParams);
/*     */     
/* 154 */     SecretKey cek = AESKW.unwrapCEK(psKey, encryptedKey.decode(), getJCAContext().getKeyEncryptionProvider());
/*     */     
/* 156 */     return ContentCryptoProvider.decrypt(header, encryptedKey, iv, cipherText, authTag, cek, getJCAContext());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\PasswordBasedDecrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */