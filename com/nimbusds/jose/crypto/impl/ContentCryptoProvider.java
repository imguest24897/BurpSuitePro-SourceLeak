/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWECryptoParts;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.KeyLengthException;
/*     */ import com.nimbusds.jose.jca.JWEJCAContext;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.ByteUtils;
/*     */ import com.nimbusds.jose.util.Container;
/*     */ import com.nimbusds.jose.util.IntegerOverflowException;
/*     */ import java.security.SecureRandom;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
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
/*     */ public class ContentCryptoProvider
/*     */ {
/*     */   public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS;
/*     */   public static final Map<Integer, Set<EncryptionMethod>> COMPATIBLE_ENCRYPTION_METHODS;
/*     */   
/*     */   static {
/*  56 */     Set<EncryptionMethod> methods = new LinkedHashSet<>();
/*  57 */     methods.add(EncryptionMethod.A128CBC_HS256);
/*  58 */     methods.add(EncryptionMethod.A192CBC_HS384);
/*  59 */     methods.add(EncryptionMethod.A256CBC_HS512);
/*  60 */     methods.add(EncryptionMethod.A128GCM);
/*  61 */     methods.add(EncryptionMethod.A192GCM);
/*  62 */     methods.add(EncryptionMethod.A256GCM);
/*  63 */     methods.add(EncryptionMethod.A128CBC_HS256_DEPRECATED);
/*  64 */     methods.add(EncryptionMethod.A256CBC_HS512_DEPRECATED);
/*  65 */     methods.add(EncryptionMethod.XC20P);
/*  66 */     SUPPORTED_ENCRYPTION_METHODS = Collections.unmodifiableSet(methods);
/*     */     
/*  68 */     Map<Integer, Set<EncryptionMethod>> encsMap = new HashMap<>();
/*  69 */     Set<EncryptionMethod> bit128Encs = new HashSet<>();
/*  70 */     Set<EncryptionMethod> bit192Encs = new HashSet<>();
/*  71 */     Set<EncryptionMethod> bit256Encs = new HashSet<>();
/*  72 */     Set<EncryptionMethod> bit384Encs = new HashSet<>();
/*  73 */     Set<EncryptionMethod> bit512Encs = new HashSet<>();
/*  74 */     bit128Encs.add(EncryptionMethod.A128GCM);
/*  75 */     bit192Encs.add(EncryptionMethod.A192GCM);
/*  76 */     bit256Encs.add(EncryptionMethod.A256GCM);
/*  77 */     bit256Encs.add(EncryptionMethod.A128CBC_HS256);
/*  78 */     bit256Encs.add(EncryptionMethod.A128CBC_HS256_DEPRECATED);
/*  79 */     bit256Encs.add(EncryptionMethod.XC20P);
/*  80 */     bit384Encs.add(EncryptionMethod.A192CBC_HS384);
/*  81 */     bit512Encs.add(EncryptionMethod.A256CBC_HS512);
/*  82 */     bit512Encs.add(EncryptionMethod.A256CBC_HS512_DEPRECATED);
/*  83 */     encsMap.put(Integer.valueOf(128), Collections.unmodifiableSet(bit128Encs));
/*  84 */     encsMap.put(Integer.valueOf(192), Collections.unmodifiableSet(bit192Encs));
/*  85 */     encsMap.put(Integer.valueOf(256), Collections.unmodifiableSet(bit256Encs));
/*  86 */     encsMap.put(Integer.valueOf(384), Collections.unmodifiableSet(bit384Encs));
/*  87 */     encsMap.put(Integer.valueOf(512), Collections.unmodifiableSet(bit512Encs));
/*  88 */     COMPATIBLE_ENCRYPTION_METHODS = Collections.unmodifiableMap(encsMap);
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
/*     */   public static SecretKey generateCEK(EncryptionMethod enc, SecureRandom randomGen) throws JOSEException {
/* 107 */     if (!SUPPORTED_ENCRYPTION_METHODS.contains(enc)) {
/* 108 */       throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(enc, SUPPORTED_ENCRYPTION_METHODS));
/*     */     }
/*     */     
/* 111 */     byte[] cekMaterial = new byte[ByteUtils.byteLength(enc.cekBitLength())];
/*     */     
/* 113 */     randomGen.nextBytes(cekMaterial);
/*     */     
/* 115 */     return new SecretKeySpec(cekMaterial, "AES");
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
/*     */   private static void checkCEKLength(SecretKey cek, EncryptionMethod enc) throws KeyLengthException {
/*     */     try {
/* 133 */       if (enc.cekBitLength() != ByteUtils.safeBitLength(cek.getEncoded())) {
/* 134 */         throw new KeyLengthException("The Content Encryption Key (CEK) length for " + enc + " must be " + enc.cekBitLength() + " bits");
/*     */       }
/* 136 */     } catch (IntegerOverflowException e) {
/* 137 */       throw new KeyLengthException("The Content Encryption Key (CEK) is too long: " + e.getMessage());
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static JWECryptoParts encrypt(JWEHeader header, byte[] clearText, SecretKey cek, Base64URL encryptedKey, JWEJCAContext jcaProvider) throws JOSEException {
/*     */     byte[] iv;
/*     */     AuthenticatedCipherText authCipherText;
/* 165 */     checkCEKLength(cek, header.getEncryptionMethod());
/*     */ 
/*     */     
/* 168 */     byte[] plainText = DeflateHelper.applyCompression(header, clearText);
/*     */ 
/*     */     
/* 171 */     byte[] aad = AAD.compute(header);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 177 */     if (header.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256) || header
/* 178 */       .getEncryptionMethod().equals(EncryptionMethod.A192CBC_HS384) || header
/* 179 */       .getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512)) {
/*     */       
/* 181 */       iv = AESCBC.generateIV(jcaProvider.getSecureRandom());
/*     */       
/* 183 */       authCipherText = AESCBC.encryptAuthenticated(cek, iv, plainText, aad, jcaProvider
/*     */           
/* 185 */           .getContentEncryptionProvider(), jcaProvider
/* 186 */           .getMACProvider());
/*     */     }
/* 188 */     else if (header.getEncryptionMethod().equals(EncryptionMethod.A128GCM) || header
/* 189 */       .getEncryptionMethod().equals(EncryptionMethod.A192GCM) || header
/* 190 */       .getEncryptionMethod().equals(EncryptionMethod.A256GCM)) {
/*     */       
/* 192 */       Container<byte[]> ivContainer = new Container(AESGCM.generateIV(jcaProvider.getSecureRandom()));
/*     */       
/* 194 */       authCipherText = AESGCM.encrypt(cek, ivContainer, plainText, aad, jcaProvider
/*     */           
/* 196 */           .getContentEncryptionProvider());
/*     */       
/* 198 */       iv = (byte[])ivContainer.get();
/*     */     }
/* 200 */     else if (header.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256_DEPRECATED) || header
/* 201 */       .getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
/*     */       
/* 203 */       iv = AESCBC.generateIV(jcaProvider.getSecureRandom());
/*     */       
/* 205 */       authCipherText = AESCBC.encryptWithConcatKDF(header, cek, encryptedKey, iv, plainText, jcaProvider
/*     */           
/* 207 */           .getContentEncryptionProvider(), jcaProvider
/* 208 */           .getMACProvider());
/*     */     }
/* 210 */     else if (header.getEncryptionMethod().equals(EncryptionMethod.XC20P)) {
/*     */       
/* 212 */       Container<byte[]> ivContainer = new Container(null);
/*     */       
/* 214 */       authCipherText = XC20P.encryptAuthenticated(cek, ivContainer, plainText, aad);
/*     */       
/* 216 */       iv = (byte[])ivContainer.get();
/*     */     }
/*     */     else {
/*     */       
/* 220 */       throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(header
/* 221 */             .getEncryptionMethod(), SUPPORTED_ENCRYPTION_METHODS));
/*     */     } 
/*     */ 
/*     */     
/* 225 */     return new JWECryptoParts(header, encryptedKey, 
/*     */ 
/*     */         
/* 228 */         Base64URL.encode(iv), 
/* 229 */         Base64URL.encode(authCipherText.getCipherText()), 
/* 230 */         Base64URL.encode(authCipherText.getAuthenticationTag()));
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
/*     */   public static byte[] decrypt(JWEHeader header, Base64URL encryptedKey, Base64URL iv, Base64URL cipherText, Base64URL authTag, SecretKey cek, JWEJCAContext jcaProvider) throws JOSEException {
/*     */     byte[] plainText;
/* 263 */     checkCEKLength(cek, header.getEncryptionMethod());
/*     */ 
/*     */     
/* 266 */     byte[] aad = AAD.compute(header);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 272 */     if (header.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256) || header
/* 273 */       .getEncryptionMethod().equals(EncryptionMethod.A192CBC_HS384) || header
/* 274 */       .getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512)) {
/*     */       
/* 276 */       plainText = AESCBC.decryptAuthenticated(cek, iv
/*     */           
/* 278 */           .decode(), cipherText
/* 279 */           .decode(), aad, authTag
/*     */           
/* 281 */           .decode(), jcaProvider
/* 282 */           .getContentEncryptionProvider(), jcaProvider
/* 283 */           .getMACProvider());
/*     */     }
/* 285 */     else if (header.getEncryptionMethod().equals(EncryptionMethod.A128GCM) || header
/* 286 */       .getEncryptionMethod().equals(EncryptionMethod.A192GCM) || header
/* 287 */       .getEncryptionMethod().equals(EncryptionMethod.A256GCM)) {
/*     */       
/* 289 */       plainText = AESGCM.decrypt(cek, iv
/*     */           
/* 291 */           .decode(), cipherText
/* 292 */           .decode(), aad, authTag
/*     */           
/* 294 */           .decode(), jcaProvider
/* 295 */           .getContentEncryptionProvider());
/*     */     }
/* 297 */     else if (header.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256_DEPRECATED) || header
/* 298 */       .getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
/*     */       
/* 300 */       plainText = AESCBC.decryptWithConcatKDF(header, cek, encryptedKey, iv, cipherText, authTag, jcaProvider
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 307 */           .getContentEncryptionProvider(), jcaProvider
/* 308 */           .getMACProvider());
/*     */     }
/* 310 */     else if (header.getEncryptionMethod().equals(EncryptionMethod.XC20P)) {
/*     */       
/* 312 */       plainText = XC20P.decryptAuthenticated(cek, iv
/*     */           
/* 314 */           .decode(), cipherText
/* 315 */           .decode(), aad, authTag
/*     */           
/* 317 */           .decode());
/*     */     }
/*     */     else {
/*     */       
/* 321 */       throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(header
/* 322 */             .getEncryptionMethod(), SUPPORTED_ENCRYPTION_METHODS));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 328 */     return DeflateHelper.applyDecompression(header, plainText);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\ContentCryptoProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */