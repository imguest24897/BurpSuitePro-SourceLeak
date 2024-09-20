/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWSAlgorithm;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.Provider;
/*     */ import java.security.Signature;
/*     */ import java.security.interfaces.ECKey;
/*     */ import java.security.spec.ECParameterSpec;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ECDSA
/*     */ {
/*     */   public static JWSAlgorithm resolveAlgorithm(ECKey ecKey) throws JOSEException {
/*  55 */     ECParameterSpec ecParameterSpec = ecKey.getParams();
/*  56 */     return resolveAlgorithm(Curve.forECParameterSpec(ecParameterSpec));
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
/*     */   public static JWSAlgorithm resolveAlgorithm(Curve curve) throws JOSEException {
/*  73 */     if (curve == null)
/*  74 */       throw new JOSEException("The EC key curve is not supported, must be P-256, P-384 or P-521"); 
/*  75 */     if (Curve.P_256.equals(curve))
/*  76 */       return JWSAlgorithm.ES256; 
/*  77 */     if (Curve.SECP256K1.equals(curve))
/*  78 */       return JWSAlgorithm.ES256K; 
/*  79 */     if (Curve.P_384.equals(curve))
/*  80 */       return JWSAlgorithm.ES384; 
/*  81 */     if (Curve.P_521.equals(curve)) {
/*  82 */       return JWSAlgorithm.ES512;
/*     */     }
/*  84 */     throw new JOSEException("Unexpected curve: " + curve);
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
/*     */   public static Signature getSignerAndVerifier(JWSAlgorithm alg, Provider jcaProvider) throws JOSEException {
/*     */     String jcaAlg;
/* 107 */     if (alg.equals(JWSAlgorithm.ES256)) {
/* 108 */       jcaAlg = "SHA256withECDSA";
/* 109 */     } else if (alg.equals(JWSAlgorithm.ES256K)) {
/* 110 */       jcaAlg = "SHA256withECDSA";
/* 111 */     } else if (alg.equals(JWSAlgorithm.ES384)) {
/* 112 */       jcaAlg = "SHA384withECDSA";
/* 113 */     } else if (alg.equals(JWSAlgorithm.ES512)) {
/* 114 */       jcaAlg = "SHA512withECDSA";
/*     */     } else {
/* 116 */       throw new JOSEException(
/* 117 */           AlgorithmSupportMessage.unsupportedJWSAlgorithm(alg, ECDSAProvider.SUPPORTED_ALGORITHMS));
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 123 */       if (jcaProvider != null) {
/* 124 */         return Signature.getInstance(jcaAlg, jcaProvider);
/*     */       }
/* 126 */       return Signature.getInstance(jcaAlg);
/*     */     }
/* 128 */     catch (NoSuchAlgorithmException e) {
/* 129 */       throw new JOSEException("Unsupported ECDSA algorithm: " + e.getMessage(), e);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getSignatureByteArrayLength(JWSAlgorithm alg) throws JOSEException {
/* 148 */     if (alg.equals(JWSAlgorithm.ES256))
/*     */     {
/* 150 */       return 64;
/*     */     }
/* 152 */     if (alg.equals(JWSAlgorithm.ES256K))
/*     */     {
/* 154 */       return 64;
/*     */     }
/* 156 */     if (alg.equals(JWSAlgorithm.ES384))
/*     */     {
/* 158 */       return 96;
/*     */     }
/* 160 */     if (alg.equals(JWSAlgorithm.ES512))
/*     */     {
/* 162 */       return 132;
/*     */     }
/*     */ 
/*     */     
/* 166 */     throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(alg, ECDSAProvider.SUPPORTED_ALGORITHMS));
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
/*     */   public static byte[] transcodeSignatureToConcat(byte[] derSignature, int outputLength) throws JOSEException {
/*     */     int offset;
/* 187 */     if (derSignature.length < 8 || derSignature[0] != 48) {
/* 188 */       throw new JOSEException("Invalid ECDSA signature format");
/*     */     }
/*     */ 
/*     */     
/* 192 */     if (derSignature[1] > 0) {
/* 193 */       offset = 2;
/* 194 */     } else if (derSignature[1] == -127) {
/* 195 */       offset = 3;
/*     */     } else {
/* 197 */       throw new JOSEException("Invalid ECDSA signature format");
/*     */     } 
/*     */     
/* 200 */     byte rLength = derSignature[offset + 1];
/*     */     
/*     */     int i;
/* 203 */     for (i = rLength; i > 0 && derSignature[offset + 2 + rLength - i] == 0; i--);
/*     */ 
/*     */ 
/*     */     
/* 207 */     byte sLength = derSignature[offset + 2 + rLength + 1];
/*     */     
/*     */     int j;
/* 210 */     for (j = sLength; j > 0 && derSignature[offset + 2 + rLength + 2 + sLength - j] == 0; j--);
/*     */ 
/*     */ 
/*     */     
/* 214 */     int rawLen = Math.max(i, j);
/* 215 */     rawLen = Math.max(rawLen, outputLength / 2);
/*     */     
/* 217 */     if ((derSignature[offset - 1] & 0xFF) != derSignature.length - offset || (derSignature[offset - 1] & 0xFF) != 2 + rLength + 2 + sLength || derSignature[offset] != 2 || derSignature[offset + 2 + rLength] != 2)
/*     */     {
/*     */ 
/*     */       
/* 221 */       throw new JOSEException("Invalid ECDSA signature format");
/*     */     }
/*     */     
/* 224 */     byte[] concatSignature = new byte[2 * rawLen];
/*     */     
/* 226 */     System.arraycopy(derSignature, offset + 2 + rLength - i, concatSignature, rawLen - i, i);
/* 227 */     System.arraycopy(derSignature, offset + 2 + rLength + 2 + sLength - j, concatSignature, 2 * rawLen - j, j);
/*     */     
/* 229 */     return concatSignature;
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
/*     */   public static byte[] transcodeSignatureToDER(byte[] jwsSignature) throws JOSEException {
/*     */     int offset;
/*     */     byte[] derSignature;
/* 251 */     int rawLen = jwsSignature.length / 2;
/*     */     
/*     */     int i;
/*     */     
/* 255 */     for (i = rawLen; i > 0 && jwsSignature[rawLen - i] == 0; i--);
/*     */ 
/*     */ 
/*     */     
/* 259 */     int j = i;
/*     */     
/* 261 */     if (jwsSignature[rawLen - i] < 0) {
/* 262 */       j++;
/*     */     }
/*     */     
/*     */     int k;
/*     */     
/* 267 */     for (k = rawLen; k > 0 && jwsSignature[2 * rawLen - k] == 0; k--);
/*     */ 
/*     */ 
/*     */     
/* 271 */     int l = k;
/*     */     
/* 273 */     if (jwsSignature[2 * rawLen - k] < 0) {
/* 274 */       l++;
/*     */     }
/*     */     
/* 277 */     int len = 2 + j + 2 + l;
/*     */     
/* 279 */     if (len > 255) {
/* 280 */       throw new JOSEException("Invalid ECDSA signature format");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 287 */     if (len < 128) {
/* 288 */       derSignature = new byte[4 + j + 2 + l];
/* 289 */       offset = 1;
/*     */     } else {
/* 291 */       derSignature = new byte[5 + j + 2 + l];
/* 292 */       derSignature[1] = -127;
/* 293 */       offset = 2;
/*     */     } 
/*     */     
/* 296 */     derSignature[0] = 48;
/* 297 */     derSignature[offset++] = (byte)len;
/* 298 */     derSignature[offset++] = 2;
/* 299 */     derSignature[offset++] = (byte)j;
/*     */     
/* 301 */     System.arraycopy(jwsSignature, rawLen - i, derSignature, offset + j - i, i);
/*     */     
/* 303 */     offset += j;
/*     */     
/* 305 */     derSignature[offset++] = 2;
/* 306 */     derSignature[offset++] = (byte)l;
/*     */     
/* 308 */     System.arraycopy(jwsSignature, 2 * rawLen - k, derSignature, offset + l - k, k);
/*     */     
/* 310 */     return derSignature;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\ECDSA.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */