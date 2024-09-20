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
/*     */ public abstract class ECDHCryptoProvider
/*     */   extends BaseJWEProvider
/*     */ {
/*     */   public static final Set<JWEAlgorithm> SUPPORTED_ALGORITHMS;
/*  84 */   public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;
/*     */   private final Curve curve;
/*     */   
/*     */   static {
/*  88 */     Set<JWEAlgorithm> algs = new LinkedHashSet<>();
/*  89 */     algs.add(JWEAlgorithm.ECDH_ES);
/*  90 */     algs.add(JWEAlgorithm.ECDH_ES_A128KW);
/*  91 */     algs.add(JWEAlgorithm.ECDH_ES_A192KW);
/*  92 */     algs.add(JWEAlgorithm.ECDH_ES_A256KW);
/*  93 */     SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(algs);
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
/*     */   
/*     */   protected ECDHCryptoProvider(Curve curve) throws JOSEException {
/* 121 */     super(SUPPORTED_ALGORITHMS, ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS);
/*     */     
/* 123 */     Curve definedCurve = (curve != null) ? curve : new Curve("unknown");
/*     */     
/* 125 */     if (!supportedEllipticCurves().contains(curve)) {
/* 126 */       throw new JOSEException(AlgorithmSupportMessage.unsupportedEllipticCurve(definedCurve, 
/* 127 */             supportedEllipticCurves()));
/*     */     }
/*     */     
/* 130 */     this.curve = curve;
/*     */     
/* 132 */     this.concatKDF = new ConcatKDF("SHA-256");
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
/* 143 */     return this.concatKDF;
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
/* 163 */     return this.curve;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected JWECryptoParts encryptWithZ(JWEHeader header, SecretKey Z, byte[] clearText) throws JOSEException {
/* 173 */     return encryptWithZ(header, Z, clearText, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected JWECryptoParts encryptWithZ(JWEHeader header, SecretKey Z, byte[] clearText, SecretKey contentEncryptionKey) throws JOSEException {
/*     */     SecretKey cek;
/*     */     Base64URL encryptedKey;
/* 186 */     JWEAlgorithm alg = header.getAlgorithm();
/* 187 */     ECDH.AlgorithmMode algMode = ECDH.resolveAlgorithmMode(alg);
/* 188 */     EncryptionMethod enc = header.getEncryptionMethod();
/*     */ 
/*     */     
/* 191 */     getConcatKDF().getJCAContext().setProvider(getJCAContext().getMACProvider());
/* 192 */     SecretKey sharedKey = ECDH.deriveSharedKey(header, Z, getConcatKDF());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 197 */     if (algMode.equals(ECDH.AlgorithmMode.DIRECT)) {
/* 198 */       cek = sharedKey;
/* 199 */       encryptedKey = null;
/* 200 */     } else if (algMode.equals(ECDH.AlgorithmMode.KW)) {
/* 201 */       if (contentEncryptionKey != null) {
/* 202 */         cek = contentEncryptionKey;
/*     */       } else {
/* 204 */         cek = ContentCryptoProvider.generateCEK(enc, getJCAContext().getSecureRandom());
/*     */       } 
/* 206 */       encryptedKey = Base64URL.encode(AESKW.wrapCEK(cek, sharedKey, getJCAContext().getKeyEncryptionProvider()));
/*     */     } else {
/* 208 */       throw new JOSEException("Unexpected JWE ECDH algorithm mode: " + algMode);
/*     */     } 
/*     */     
/* 211 */     return ContentCryptoProvider.encrypt(header, clearText, cek, encryptedKey, getJCAContext());
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
/*     */   protected byte[] decryptWithZ(JWEHeader header, SecretKey Z, Base64URL encryptedKey, Base64URL iv, Base64URL cipherText, Base64URL authTag) throws JOSEException {
/*     */     SecretKey cek;
/* 227 */     JWEAlgorithm alg = header.getAlgorithm();
/* 228 */     ECDH.AlgorithmMode algMode = ECDH.resolveAlgorithmMode(alg);
/*     */ 
/*     */     
/* 231 */     getConcatKDF().getJCAContext().setProvider(getJCAContext().getMACProvider());
/* 232 */     SecretKey sharedKey = ECDH.deriveSharedKey(header, Z, getConcatKDF());
/*     */ 
/*     */ 
/*     */     
/* 236 */     if (algMode.equals(ECDH.AlgorithmMode.DIRECT)) {
/* 237 */       cek = sharedKey;
/* 238 */     } else if (algMode.equals(ECDH.AlgorithmMode.KW)) {
/* 239 */       if (encryptedKey == null) {
/* 240 */         throw new JOSEException("Missing JWE encrypted key");
/*     */       }
/* 242 */       cek = AESKW.unwrapCEK(sharedKey, encryptedKey.decode(), getJCAContext().getKeyEncryptionProvider());
/*     */     } else {
/* 244 */       throw new JOSEException("Unexpected JWE ECDH algorithm mode: " + algMode);
/*     */     } 
/*     */     
/* 247 */     return ContentCryptoProvider.decrypt(header, encryptedKey, iv, cipherText, authTag, cek, getJCAContext());
/*     */   }
/*     */   
/*     */   public abstract Set<Curve> supportedEllipticCurves();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\ECDHCryptoProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */