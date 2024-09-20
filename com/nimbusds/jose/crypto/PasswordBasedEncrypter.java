/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWECryptoParts;
/*     */ import com.nimbusds.jose.JWEEncrypter;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.crypto.impl.AESKW;
/*     */ import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
/*     */ import com.nimbusds.jose.crypto.impl.PBKDF2;
/*     */ import com.nimbusds.jose.crypto.impl.PRFParams;
/*     */ import com.nimbusds.jose.crypto.impl.PasswordBasedCryptoProvider;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.StandardCharset;
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
/*     */ @ThreadSafe
/*     */ public class PasswordBasedEncrypter
/*     */   extends PasswordBasedCryptoProvider
/*     */   implements JWEEncrypter
/*     */ {
/*     */   public static final int MIN_SALT_LENGTH = 8;
/*     */   private final int saltLength;
/*     */   public static final int MIN_RECOMMENDED_ITERATION_COUNT = 1000;
/*     */   private final int iterationCount;
/*     */   
/*     */   public PasswordBasedEncrypter(byte[] password, int saltLength, int iterationCount) {
/* 107 */     super(password);
/*     */     
/* 109 */     if (saltLength < 8) {
/* 110 */       throw new IllegalArgumentException("The minimum salt length (p2s) is 8 bytes");
/*     */     }
/*     */     
/* 113 */     this.saltLength = saltLength;
/*     */     
/* 115 */     if (iterationCount < 1000) {
/* 116 */       throw new IllegalArgumentException("The minimum recommended iteration count (p2c) is 1000");
/*     */     }
/*     */     
/* 119 */     this.iterationCount = iterationCount;
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
/*     */   public PasswordBasedEncrypter(String password, int saltLength, int iterationCount) {
/* 137 */     this(password.getBytes(StandardCharset.UTF_8), saltLength, iterationCount);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWECryptoParts encrypt(JWEHeader header, byte[] clearText) throws JOSEException {
/* 145 */     JWEAlgorithm alg = header.getAlgorithm();
/* 146 */     EncryptionMethod enc = header.getEncryptionMethod();
/*     */     
/* 148 */     byte[] salt = new byte[this.saltLength];
/* 149 */     getJCAContext().getSecureRandom().nextBytes(salt);
/* 150 */     byte[] formattedSalt = PBKDF2.formatSalt(alg, salt);
/* 151 */     PRFParams prfParams = PRFParams.resolve(alg, getJCAContext().getMACProvider());
/* 152 */     SecretKey psKey = PBKDF2.deriveKey(getPassword(), formattedSalt, this.iterationCount, prfParams);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 158 */     JWEHeader updatedHeader = (new JWEHeader.Builder(header)).pbes2Salt(Base64URL.encode(salt)).pbes2Count(this.iterationCount).build();
/*     */     
/* 160 */     SecretKey cek = ContentCryptoProvider.generateCEK(enc, getJCAContext().getSecureRandom());
/*     */ 
/*     */     
/* 163 */     Base64URL encryptedKey = Base64URL.encode(AESKW.wrapCEK(cek, psKey, getJCAContext().getKeyEncryptionProvider()));
/*     */     
/* 165 */     return ContentCryptoProvider.encrypt(updatedHeader, clearText, cek, encryptedKey, getJCAContext());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSaltLength() {
/* 176 */     return this.saltLength;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getIterationCount() {
/* 187 */     return this.iterationCount;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\PasswordBasedEncrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */