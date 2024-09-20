/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWECryptoParts;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.jca.JWEJCAContext;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedHashSet;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ECDH1PUCryptoProvider
/*     */   extends BaseJWEProvider
/*     */ {
/*     */   public static final Set<JWEAlgorithm> SUPPORTED_ALGORITHMS;
/*  93 */   public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;
/*     */   private final Curve curve;
/*     */   
/*     */   static {
/*  97 */     Set<JWEAlgorithm> algs = new LinkedHashSet<>();
/*  98 */     algs.add(JWEAlgorithm.ECDH_1PU);
/*  99 */     algs.add(JWEAlgorithm.ECDH_1PU_A128KW);
/* 100 */     algs.add(JWEAlgorithm.ECDH_1PU_A192KW);
/* 101 */     algs.add(JWEAlgorithm.ECDH_1PU_A256KW);
/* 102 */     SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(algs);
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
/*     */   private final ConcatKDF concatKDF;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ECDH1PUCryptoProvider(Curve curve) throws JOSEException {
/* 129 */     super(SUPPORTED_ALGORITHMS, ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS);
/*     */     
/* 131 */     Curve definedCurve = (curve != null) ? curve : new Curve("unknown");
/*     */     
/* 133 */     if (!supportedEllipticCurves().contains(curve)) {
/* 134 */       throw new JOSEException(AlgorithmSupportMessage.unsupportedEllipticCurve(definedCurve, 
/* 135 */             supportedEllipticCurves()));
/*     */     }
/*     */     
/* 138 */     this.curve = curve;
/*     */     
/* 140 */     this.concatKDF = new ConcatKDF("SHA-256");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ConcatKDF getConcatKDF() {
/* 151 */     return this.concatKDF;
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
/*     */   public Curve getCurve() {
/* 171 */     return this.curve;
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
/*     */   protected JWECryptoParts encryptWithZ(JWEHeader header, SecretKey Z, byte[] clearText, SecretKey contentEncryptionKey) throws JOSEException {
/* 186 */     JWEAlgorithm alg = header.getAlgorithm();
/* 187 */     ECDH.AlgorithmMode algMode = ECDH1PU.resolveAlgorithmMode(alg);
/* 188 */     EncryptionMethod enc = header.getEncryptionMethod();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 193 */     if (algMode.equals(ECDH.AlgorithmMode.DIRECT)) {
/*     */ 
/*     */       
/* 196 */       getConcatKDF().getJCAContext().setProvider(getJCAContext().getMACProvider());
/* 197 */       SecretKey cek = ECDH1PU.deriveSharedKey(header, Z, getConcatKDF());
/*     */       
/* 199 */       return ContentCryptoProvider.encrypt(header, clearText, cek, null, getJCAContext());
/*     */     } 
/*     */     
/* 202 */     if (algMode.equals(ECDH.AlgorithmMode.KW)) {
/*     */       SecretKey cek;
/*     */ 
/*     */       
/* 206 */       if (!EncryptionMethod.Family.AES_CBC_HMAC_SHA.contains(enc)) {
/* 207 */         throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(header
/* 208 */               .getEncryptionMethod(), EncryptionMethod.Family.AES_CBC_HMAC_SHA));
/*     */       }
/*     */ 
/*     */       
/* 212 */       if (contentEncryptionKey != null) {
/* 213 */         cek = contentEncryptionKey;
/*     */       } else {
/* 215 */         cek = ContentCryptoProvider.generateCEK(enc, getJCAContext().getSecureRandom());
/*     */       } 
/*     */       
/* 218 */       JWECryptoParts encrypted = ContentCryptoProvider.encrypt(header, clearText, cek, null, getJCAContext());
/*     */       
/* 220 */       SecretKey sharedKey = ECDH1PU.deriveSharedKey(header, Z, encrypted.getAuthenticationTag(), getConcatKDF());
/* 221 */       Base64URL encryptedKey = Base64URL.encode(AESKW.wrapCEK(cek, sharedKey, getJCAContext().getKeyEncryptionProvider()));
/*     */       
/* 223 */       return new JWECryptoParts(header, encryptedKey, encrypted
/*     */ 
/*     */           
/* 226 */           .getInitializationVector(), encrypted
/* 227 */           .getCipherText(), encrypted
/* 228 */           .getAuthenticationTag());
/*     */     } 
/*     */ 
/*     */     
/* 232 */     throw new JOSEException("Unexpected JWE ECDH algorithm mode: " + algMode);
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
/*     */   protected byte[] decryptWithZ(JWEHeader header, SecretKey Z, Base64URL encryptedKey, Base64URL iv, Base64URL cipherText, Base64URL authTag) throws JOSEException {
/*     */     SecretKey cek;
/* 247 */     JWEAlgorithm alg = header.getAlgorithm();
/* 248 */     ECDH.AlgorithmMode algMode = ECDH1PU.resolveAlgorithmMode(alg);
/*     */ 
/*     */     
/* 251 */     getConcatKDF().getJCAContext().setProvider(getJCAContext().getMACProvider());
/*     */ 
/*     */ 
/*     */     
/* 255 */     if (algMode.equals(ECDH.AlgorithmMode.DIRECT)) {
/* 256 */       cek = ECDH1PU.deriveSharedKey(header, Z, getConcatKDF());
/* 257 */     } else if (algMode.equals(ECDH.AlgorithmMode.KW)) {
/* 258 */       if (encryptedKey == null) {
/* 259 */         throw new JOSEException("Missing JWE encrypted key");
/*     */       }
/*     */       
/* 262 */       SecretKey sharedKey = ECDH1PU.deriveSharedKey(header, Z, authTag, getConcatKDF());
/* 263 */       cek = AESKW.unwrapCEK(sharedKey, encryptedKey.decode(), getJCAContext().getKeyEncryptionProvider());
/*     */     } else {
/* 265 */       throw new JOSEException("Unexpected JWE ECDH algorithm mode: " + algMode);
/*     */     } 
/*     */     
/* 268 */     return ContentCryptoProvider.decrypt(header, null, iv, cipherText, authTag, cek, getJCAContext());
/*     */   }
/*     */   
/*     */   public abstract Set<Curve> supportedEllipticCurves();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\ECDH1PUCryptoProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */