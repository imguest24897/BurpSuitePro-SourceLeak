/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.crypto.utils.ECChecks;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.jwk.OctetKeyPair;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.ByteUtils;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.security.Provider;
/*     */ import java.security.interfaces.ECPrivateKey;
/*     */ import java.security.interfaces.ECPublicKey;
/*     */ import java.util.Objects;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.spec.SecretKeySpec;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ECDH1PU
/*     */ {
/*     */   public static ECDH.AlgorithmMode resolveAlgorithmMode(JWEAlgorithm alg) throws JOSEException {
/*  61 */     Objects.requireNonNull(alg, "The parameter \"alg\" must not be null");
/*     */     
/*  63 */     if (alg.equals(JWEAlgorithm.ECDH_1PU))
/*     */     {
/*  65 */       return ECDH.AlgorithmMode.DIRECT;
/*     */     }
/*     */     
/*  68 */     if (alg.equals(JWEAlgorithm.ECDH_1PU_A128KW) || alg
/*  69 */       .equals(JWEAlgorithm.ECDH_1PU_A192KW) || alg
/*  70 */       .equals(JWEAlgorithm.ECDH_1PU_A256KW))
/*     */     {
/*     */       
/*  73 */       return ECDH.AlgorithmMode.KW;
/*     */     }
/*     */     
/*  76 */     throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(alg, ECDHCryptoProvider.SUPPORTED_ALGORITHMS));
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
/*     */   public static int sharedKeyLength(JWEAlgorithm alg, EncryptionMethod enc) throws JOSEException {
/*  99 */     Objects.requireNonNull(alg, "The parameter \"alg\" must not be null");
/* 100 */     Objects.requireNonNull(enc, "The parameter \"enc\" must not be null");
/*     */     
/* 102 */     if (alg.equals(JWEAlgorithm.ECDH_1PU)) {
/*     */       
/* 104 */       int length = enc.cekBitLength();
/*     */       
/* 106 */       if (length == 0) {
/* 107 */         throw new JOSEException("Unsupported JWE encryption method " + enc);
/*     */       }
/*     */       
/* 110 */       return length;
/*     */     } 
/*     */     
/* 113 */     if (alg.equals(JWEAlgorithm.ECDH_1PU_A128KW)) {
/* 114 */       return 128;
/*     */     }
/*     */     
/* 117 */     if (alg.equals(JWEAlgorithm.ECDH_1PU_A192KW)) {
/* 118 */       return 192;
/*     */     }
/*     */     
/* 121 */     if (alg.equals(JWEAlgorithm.ECDH_1PU_A256KW)) {
/* 122 */       return 256;
/*     */     }
/*     */     
/* 125 */     throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(alg, ECDHCryptoProvider.SUPPORTED_ALGORITHMS));
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
/*     */   public static SecretKey deriveSharedKey(JWEHeader header, SecretKey Z, ConcatKDF concatKDF) throws JOSEException {
/*     */     String algID;
/* 157 */     Objects.requireNonNull(header, "The parameter \"header\" must not be null");
/* 158 */     Objects.requireNonNull(Z, "The parameter \"Z\" must not be null");
/* 159 */     Objects.requireNonNull(concatKDF, "The parameter \"concatKDF\" must not be null");
/*     */     
/* 161 */     int sharedKeyLength = sharedKeyLength(header.getAlgorithm(), header.getEncryptionMethod());
/*     */ 
/*     */     
/* 164 */     ECDH.AlgorithmMode algMode = resolveAlgorithmMode(header.getAlgorithm());
/*     */ 
/*     */ 
/*     */     
/* 168 */     if (algMode == ECDH.AlgorithmMode.DIRECT) {
/*     */       
/* 170 */       algID = header.getEncryptionMethod().getName();
/* 171 */     } else if (algMode == ECDH.AlgorithmMode.KW) {
/*     */       
/* 173 */       algID = header.getAlgorithm().getName();
/*     */     } else {
/* 175 */       throw new JOSEException("Unsupported JWE ECDH algorithm mode: " + algMode);
/*     */     } 
/*     */     
/* 178 */     return concatKDF.deriveKey(Z, sharedKeyLength, 
/*     */ 
/*     */         
/* 181 */         ConcatKDF.encodeDataWithLength(algID.getBytes(StandardCharsets.US_ASCII)), 
/* 182 */         ConcatKDF.encodeDataWithLength(header.getAgreementPartyUInfo()), 
/* 183 */         ConcatKDF.encodeDataWithLength(header.getAgreementPartyVInfo()), 
/* 184 */         ConcatKDF.encodeIntData(sharedKeyLength), 
/* 185 */         ConcatKDF.encodeNoData());
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static SecretKey deriveSharedKey(JWEHeader header, SecretKey Z, Base64URL tag, ConcatKDF concatKDF) throws JOSEException {
/*     */     String algID;
/* 221 */     Objects.requireNonNull(header, "The parameter \"header\" must not be null");
/* 222 */     Objects.requireNonNull(Z, "The parameter \"Z\" must not be null");
/* 223 */     Objects.requireNonNull(tag, "The parameter \"tag\" must not be null");
/* 224 */     Objects.requireNonNull(concatKDF, "The parameter \"concatKDF\" must not be null");
/*     */     
/* 226 */     int sharedKeyLength = sharedKeyLength(header.getAlgorithm(), header.getEncryptionMethod());
/*     */ 
/*     */     
/* 229 */     ECDH.AlgorithmMode algMode = resolveAlgorithmMode(header.getAlgorithm());
/*     */ 
/*     */ 
/*     */     
/* 233 */     if (algMode == ECDH.AlgorithmMode.DIRECT) {
/*     */       
/* 235 */       algID = header.getEncryptionMethod().getName();
/* 236 */     } else if (algMode == ECDH.AlgorithmMode.KW) {
/*     */       
/* 238 */       algID = header.getAlgorithm().getName();
/*     */     } else {
/* 240 */       throw new JOSEException("Unsupported JWE ECDH algorithm mode: " + algMode);
/*     */     } 
/*     */     
/* 243 */     return concatKDF.deriveKey(Z, sharedKeyLength, 
/*     */ 
/*     */         
/* 246 */         ConcatKDF.encodeDataWithLength(algID.getBytes(StandardCharsets.US_ASCII)), 
/* 247 */         ConcatKDF.encodeDataWithLength(header.getAgreementPartyUInfo()), 
/* 248 */         ConcatKDF.encodeDataWithLength(header.getAgreementPartyVInfo()), 
/* 249 */         ConcatKDF.encodeIntData(sharedKeyLength), 
/* 250 */         ConcatKDF.encodeNoData(), 
/* 251 */         ConcatKDF.encodeDataWithLength(tag));
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
/*     */   public static SecretKey deriveZ(SecretKey Ze, SecretKey Zs) {
/* 273 */     Objects.requireNonNull(Ze, "The parameter \"Ze\" must not be null");
/* 274 */     Objects.requireNonNull(Zs, "The parameter \"Zs\" must not be null");
/*     */     
/* 276 */     byte[] encodedKey = ByteUtils.concat(new byte[][] { Ze.getEncoded(), Zs.getEncoded() });
/* 277 */     return new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
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
/*     */   public static SecretKey deriveSenderZ(ECPrivateKey privateKey, ECPublicKey publicKey, ECPrivateKey epk, Provider provider) throws JOSEException {
/* 305 */     validateSameCurve(privateKey, publicKey);
/* 306 */     validateSameCurve(epk, publicKey);
/*     */     
/* 308 */     SecretKey Ze = ECDH.deriveSharedSecret(publicKey, epk, provider);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 314 */     SecretKey Zs = ECDH.deriveSharedSecret(publicKey, privateKey, provider);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 320 */     return deriveZ(Ze, Zs);
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
/*     */   public static SecretKey deriveSenderZ(OctetKeyPair privateKey, OctetKeyPair publicKey, OctetKeyPair epk) throws JOSEException {
/* 344 */     validateSameCurve(privateKey, publicKey);
/* 345 */     validateSameCurve(epk, publicKey);
/*     */     
/* 347 */     SecretKey Ze = ECDH.deriveSharedSecret(publicKey, epk);
/* 348 */     SecretKey Zs = ECDH.deriveSharedSecret(publicKey, privateKey);
/*     */     
/* 350 */     return deriveZ(Ze, Zs);
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
/*     */   public static SecretKey deriveRecipientZ(ECPrivateKey privateKey, ECPublicKey publicKey, ECPublicKey epk, Provider provider) throws JOSEException {
/* 377 */     validateSameCurve(privateKey, publicKey);
/* 378 */     validateSameCurve(privateKey, epk);
/*     */     
/* 380 */     SecretKey Ze = ECDH.deriveSharedSecret(epk, privateKey, provider);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 386 */     SecretKey Zs = ECDH.deriveSharedSecret(publicKey, privateKey, provider);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 392 */     return deriveZ(Ze, Zs);
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
/*     */   public static SecretKey deriveRecipientZ(OctetKeyPair privateKey, OctetKeyPair publicKey, OctetKeyPair epk) throws JOSEException {
/* 412 */     validateSameCurve(privateKey, publicKey);
/* 413 */     validateSameCurve(privateKey, epk);
/*     */     
/* 415 */     SecretKey Ze = ECDH.deriveSharedSecret(epk, privateKey);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 420 */     SecretKey Zs = ECDH.deriveSharedSecret(publicKey, privateKey);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 425 */     return deriveZ(Ze, Zs);
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
/*     */   public static void validateSameCurve(ECPrivateKey privateKey, ECPublicKey publicKey) throws JOSEException {
/* 439 */     Objects.requireNonNull(privateKey, "The parameter \"privateKey\" must not be null");
/* 440 */     Objects.requireNonNull(publicKey, "The parameter \"publicKey\" must not be null");
/*     */     
/* 442 */     if (!privateKey.getParams().getCurve().equals(publicKey.getParams().getCurve())) {
/* 443 */       throw new JOSEException("Curve of public key does not match curve of private key");
/*     */     }
/*     */     
/* 446 */     if (!ECChecks.isPointOnCurve(publicKey, privateKey)) {
/* 447 */       throw new JOSEException("Invalid public EC key: Point(s) not on the expected curve");
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static void validateSameCurve(OctetKeyPair privateKey, OctetKeyPair publicKey) throws JOSEException {
/* 462 */     Objects.requireNonNull(privateKey, "The parameter \"privateKey\" must not be null");
/* 463 */     Objects.requireNonNull(publicKey, "The parameter \"publicKey\" must not be null");
/*     */     
/* 465 */     if (!privateKey.isPrivate()) {
/* 466 */       throw new JOSEException("OKP private key should be a private key");
/*     */     }
/*     */     
/* 469 */     if (publicKey.isPrivate()) {
/* 470 */       throw new JOSEException("OKP public key should not be a private key");
/*     */     }
/*     */     
/* 473 */     if (!publicKey.getCurve().equals(Curve.X25519)) {
/* 474 */       throw new JOSEException("Only supports OctetKeyPairs with crv=X25519");
/*     */     }
/*     */     
/* 477 */     if (!privateKey.getCurve().equals(publicKey.getCurve()))
/* 478 */       throw new JOSEException("Curve of public key does not match curve of private key"); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\ECDH1PU.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */