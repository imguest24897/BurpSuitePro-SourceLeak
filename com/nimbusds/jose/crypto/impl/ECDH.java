/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.google.crypto.tink.subtle.X25519;
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.jwk.OctetKeyPair;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.security.InvalidKeyException;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.Provider;
/*     */ import java.security.interfaces.ECPublicKey;
/*     */ import javax.crypto.KeyAgreement;
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
/*     */ public class ECDH
/*     */ {
/*     */   public enum AlgorithmMode
/*     */   {
/*  59 */     DIRECT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  65 */     KW;
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
/*     */   public static AlgorithmMode resolveAlgorithmMode(JWEAlgorithm alg) throws JOSEException {
/*  82 */     if (alg.equals(JWEAlgorithm.ECDH_ES))
/*     */     {
/*  84 */       return AlgorithmMode.DIRECT;
/*     */     }
/*  86 */     if (alg.equals(JWEAlgorithm.ECDH_ES_A128KW) || alg
/*  87 */       .equals(JWEAlgorithm.ECDH_ES_A192KW) || alg
/*  88 */       .equals(JWEAlgorithm.ECDH_ES_A256KW))
/*     */     {
/*  90 */       return AlgorithmMode.KW;
/*     */     }
/*     */     
/*  93 */     throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(alg, ECDHCryptoProvider.SUPPORTED_ALGORITHMS));
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
/*     */   public static int sharedKeyLength(JWEAlgorithm alg, EncryptionMethod enc) throws JOSEException {
/* 117 */     if (alg.equals(JWEAlgorithm.ECDH_ES)) {
/*     */       
/* 119 */       int length = enc.cekBitLength();
/*     */       
/* 121 */       if (length == 0) {
/* 122 */         throw new JOSEException("Unsupported JWE encryption method " + enc);
/*     */       }
/*     */       
/* 125 */       return length;
/*     */     } 
/* 127 */     if (alg.equals(JWEAlgorithm.ECDH_ES_A128KW))
/* 128 */       return 128; 
/* 129 */     if (alg.equals(JWEAlgorithm.ECDH_ES_A192KW))
/* 130 */       return 192; 
/* 131 */     if (alg.equals(JWEAlgorithm.ECDH_ES_A256KW)) {
/* 132 */       return 256;
/*     */     }
/* 134 */     throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(alg, ECDHCryptoProvider.SUPPORTED_ALGORITHMS));
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
/*     */   public static SecretKey deriveSharedSecret(ECPublicKey publicKey, PrivateKey privateKey, Provider provider) throws JOSEException {
/*     */     KeyAgreement keyAgreement;
/*     */     try {
/* 166 */       if (provider != null) {
/* 167 */         keyAgreement = KeyAgreement.getInstance("ECDH", provider);
/*     */       } else {
/* 169 */         keyAgreement = KeyAgreement.getInstance("ECDH");
/*     */       }
/*     */     
/* 172 */     } catch (NoSuchAlgorithmException e) {
/* 173 */       throw new JOSEException("Couldn't get an ECDH key agreement instance: " + e.getMessage(), e);
/*     */     } 
/*     */     
/*     */     try {
/* 177 */       keyAgreement.init(privateKey);
/* 178 */       keyAgreement.doPhase(publicKey, true);
/*     */     }
/* 180 */     catch (InvalidKeyException e) {
/* 181 */       throw new JOSEException("Invalid key for ECDH key agreement: " + e.getMessage(), e);
/*     */     } 
/*     */     
/* 184 */     return new SecretKeySpec(keyAgreement.generateSecret(), "AES");
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
/*     */   public static SecretKey deriveSharedSecret(OctetKeyPair publicKey, OctetKeyPair privateKey) throws JOSEException {
/*     */     byte[] sharedSecretBytes;
/* 206 */     if (publicKey.isPrivate()) {
/* 207 */       throw new JOSEException("Expected public key but received OKP with 'd' value");
/*     */     }
/*     */     
/* 210 */     if (!Curve.X25519.equals(publicKey.getCurve())) {
/* 211 */       throw new JOSEException("Expected public key OKP with crv=X25519");
/*     */     }
/*     */     
/* 214 */     if (!privateKey.isPrivate()) {
/* 215 */       throw new JOSEException("Expected private key but received OKP without 'd' value");
/*     */     }
/*     */     
/* 218 */     if (!Curve.X25519.equals(privateKey.getCurve())) {
/* 219 */       throw new JOSEException("Expected private key OKP with crv=X25519");
/*     */     }
/*     */     
/* 222 */     byte[] privateKeyBytes = privateKey.getDecodedD();
/* 223 */     byte[] publicKeyBytes = publicKey.getDecodedX();
/*     */ 
/*     */     
/*     */     try {
/* 227 */       sharedSecretBytes = X25519.computeSharedSecret(privateKeyBytes, publicKeyBytes);
/* 228 */     } catch (InvalidKeyException e) {
/* 229 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */     
/* 232 */     return new SecretKeySpec(sharedSecretBytes, "AES");
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
/*     */   public static SecretKey deriveSharedKey(JWEHeader header, SecretKey Z, ConcatKDF concatKDF) throws JOSEException {
/*     */     String algID;
/* 255 */     int sharedKeyLength = sharedKeyLength(header.getAlgorithm(), header.getEncryptionMethod());
/*     */ 
/*     */     
/* 258 */     AlgorithmMode algMode = resolveAlgorithmMode(header.getAlgorithm());
/*     */ 
/*     */ 
/*     */     
/* 262 */     if (algMode == AlgorithmMode.DIRECT) {
/*     */       
/* 264 */       algID = header.getEncryptionMethod().getName();
/* 265 */     } else if (algMode == AlgorithmMode.KW) {
/*     */       
/* 267 */       algID = header.getAlgorithm().getName();
/*     */     } else {
/* 269 */       throw new JOSEException("Unsupported JWE ECDH algorithm mode: " + algMode);
/*     */     } 
/*     */     
/* 272 */     return concatKDF.deriveKey(Z, sharedKeyLength, 
/*     */ 
/*     */         
/* 275 */         ConcatKDF.encodeDataWithLength(algID.getBytes(StandardCharsets.US_ASCII)), 
/* 276 */         ConcatKDF.encodeDataWithLength(header.getAgreementPartyUInfo()), 
/* 277 */         ConcatKDF.encodeDataWithLength(header.getAgreementPartyVInfo()), 
/* 278 */         ConcatKDF.encodeIntData(sharedKeyLength), 
/* 279 */         ConcatKDF.encodeNoData());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\ECDH.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */