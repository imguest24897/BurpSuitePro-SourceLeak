/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.crypto.utils.ConstantTimeUtils;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.ByteUtils;
/*     */ import com.nimbusds.jose.util.StandardCharset;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.security.Provider;
/*     */ import java.security.SecureRandom;
/*     */ import java.util.Arrays;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.spec.IvParameterSpec;
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
/*     */ @ThreadSafe
/*     */ public class AESCBC
/*     */ {
/*     */   public static final int IV_BIT_LENGTH = 128;
/*     */   
/*     */   public static byte[] generateIV(SecureRandom randomGen) {
/*  74 */     byte[] bytes = new byte[ByteUtils.byteLength(128)];
/*  75 */     randomGen.nextBytes(bytes);
/*  76 */     return bytes;
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
/*     */   private static Cipher createAESCBCCipher(SecretKey secretKey, boolean forEncryption, byte[] iv, Provider provider) throws JOSEException {
/*     */     Cipher cipher;
/*     */     try {
/* 102 */       cipher = CipherHelper.getInstance("AES/CBC/PKCS5Padding", provider);
/*     */       
/* 104 */       SecretKeySpec keyspec = new SecretKeySpec(secretKey.getEncoded(), "AES");
/*     */       
/* 106 */       IvParameterSpec ivSpec = new IvParameterSpec(iv);
/*     */       
/* 108 */       if (forEncryption)
/*     */       {
/* 110 */         cipher.init(1, keyspec, ivSpec);
/*     */       }
/*     */       else
/*     */       {
/* 114 */         cipher.init(2, keyspec, ivSpec);
/*     */       }
/*     */     
/* 117 */     } catch (Exception e) {
/*     */       
/* 119 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */     
/* 122 */     return cipher;
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
/*     */   public static byte[] encrypt(SecretKey secretKey, byte[] iv, byte[] plainText, Provider provider) throws JOSEException {
/* 146 */     Cipher cipher = createAESCBCCipher(secretKey, true, iv, provider);
/*     */     
/*     */     try {
/* 149 */       return cipher.doFinal(plainText);
/*     */     }
/* 151 */     catch (Exception e) {
/*     */       
/* 153 */       throw new JOSEException(e.getMessage(), e);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static AuthenticatedCipherText encryptAuthenticated(SecretKey secretKey, byte[] iv, byte[] plainText, byte[] aad, Provider ceProvider, Provider macProvider) throws JOSEException {
/* 191 */     CompositeKey compositeKey = new CompositeKey(secretKey);
/*     */ 
/*     */     
/* 194 */     byte[] cipherText = encrypt(compositeKey.getAESKey(), iv, plainText, ceProvider);
/*     */ 
/*     */     
/* 197 */     byte[] al = AAD.computeLength(aad);
/*     */ 
/*     */     
/* 200 */     int hmacInputLength = aad.length + iv.length + cipherText.length + al.length;
/* 201 */     byte[] hmacInput = ByteBuffer.allocate(hmacInputLength).put(aad).put(iv).put(cipherText).put(al).array();
/* 202 */     byte[] hmac = HMAC.compute(compositeKey.getMACKey(), hmacInput, macProvider);
/* 203 */     byte[] authTag = Arrays.copyOf(hmac, compositeKey.getTruncatedMACByteLength());
/*     */     
/* 205 */     return new AuthenticatedCipherText(cipherText, authTag);
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
/*     */   public static AuthenticatedCipherText encryptWithConcatKDF(JWEHeader header, SecretKey secretKey, Base64URL encryptedKey, byte[] iv, byte[] plainText, Provider ceProvider, Provider macProvider) throws JOSEException {
/* 238 */     byte[] epu = null;
/*     */     
/* 240 */     if (header.getCustomParam("epu") instanceof String)
/*     */     {
/* 242 */       epu = (new Base64URL((String)header.getCustomParam("epu"))).decode();
/*     */     }
/*     */     
/* 245 */     byte[] epv = null;
/*     */     
/* 247 */     if (header.getCustomParam("epv") instanceof String)
/*     */     {
/* 249 */       epv = (new Base64URL((String)header.getCustomParam("epv"))).decode();
/*     */     }
/*     */ 
/*     */     
/* 253 */     SecretKey altCEK = LegacyConcatKDF.generateCEK(secretKey, header.getEncryptionMethod(), epu, epv);
/*     */     
/* 255 */     byte[] cipherText = encrypt(altCEK, iv, plainText, ceProvider);
/*     */ 
/*     */     
/* 258 */     SecretKey cik = LegacyConcatKDF.generateCIK(secretKey, header.getEncryptionMethod(), epu, epv);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 263 */     String macInput = header.toBase64URL() + "." + encryptedKey + "." + Base64URL.encode(iv) + "." + Base64URL.encode(cipherText);
/*     */     
/* 265 */     byte[] mac = HMAC.compute(cik, macInput.getBytes(StandardCharset.UTF_8), macProvider);
/*     */     
/* 267 */     return new AuthenticatedCipherText(cipherText, mac);
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
/*     */   public static byte[] decrypt(SecretKey secretKey, byte[] iv, byte[] cipherText, Provider provider) throws JOSEException {
/* 291 */     Cipher cipher = createAESCBCCipher(secretKey, false, iv, provider);
/*     */     
/*     */     try {
/* 294 */       return cipher.doFinal(cipherText);
/*     */     }
/* 296 */     catch (Exception e) {
/*     */       
/* 298 */       throw new JOSEException(e.getMessage(), e);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static byte[] decryptAuthenticated(SecretKey secretKey, byte[] iv, byte[] cipherText, byte[] aad, byte[] authTag, Provider ceProvider, Provider macProvider) throws JOSEException {
/* 339 */     CompositeKey compositeKey = new CompositeKey(secretKey);
/*     */ 
/*     */     
/* 342 */     byte[] al = AAD.computeLength(aad);
/*     */ 
/*     */     
/* 345 */     int hmacInputLength = aad.length + iv.length + cipherText.length + al.length;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 351 */     byte[] hmacInput = ByteBuffer.allocate(hmacInputLength).put(aad).put(iv).put(cipherText).put(al).array();
/* 352 */     byte[] hmac = HMAC.compute(compositeKey.getMACKey(), hmacInput, macProvider);
/*     */     
/* 354 */     byte[] expectedAuthTag = Arrays.copyOf(hmac, compositeKey.getTruncatedMACByteLength());
/*     */     
/* 356 */     if (!ConstantTimeUtils.areEqual(expectedAuthTag, authTag)) {
/* 357 */       throw new JOSEException("MAC check failed");
/*     */     }
/*     */     
/* 360 */     return decrypt(compositeKey.getAESKey(), iv, cipherText, ceProvider);
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
/*     */   public static byte[] decryptWithConcatKDF(JWEHeader header, SecretKey secretKey, Base64URL encryptedKey, Base64URL iv, Base64URL cipherText, Base64URL authTag, Provider ceProvider, Provider macProvider) throws JOSEException {
/* 395 */     byte[] epu = null;
/*     */     
/* 397 */     if (header.getCustomParam("epu") instanceof String)
/*     */     {
/* 399 */       epu = (new Base64URL((String)header.getCustomParam("epu"))).decode();
/*     */     }
/*     */     
/* 402 */     byte[] epv = null;
/*     */     
/* 404 */     if (header.getCustomParam("epv") instanceof String)
/*     */     {
/* 406 */       epv = (new Base64URL((String)header.getCustomParam("epv"))).decode();
/*     */     }
/*     */     
/* 409 */     SecretKey cik = LegacyConcatKDF.generateCIK(secretKey, header.getEncryptionMethod(), epu, epv);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 414 */     String macInput = header.toBase64URL().toString() + "." + encryptedKey.toString() + "." + iv.toString() + "." + cipherText.toString();
/*     */     
/* 416 */     byte[] mac = HMAC.compute(cik, macInput.getBytes(StandardCharset.UTF_8), macProvider);
/*     */     
/* 418 */     if (!ConstantTimeUtils.areEqual(authTag.decode(), mac)) {
/* 419 */       throw new JOSEException("MAC check failed");
/*     */     }
/*     */     
/* 422 */     SecretKey cekAlt = LegacyConcatKDF.generateCEK(secretKey, header.getEncryptionMethod(), epu, epv);
/*     */     
/* 424 */     return decrypt(cekAlt, iv.decode(), cipherText.decode(), ceProvider);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\AESCBC.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */