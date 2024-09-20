/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.util.ByteUtils;
/*     */ import com.nimbusds.jose.util.Container;
/*     */ import com.nimbusds.jose.util.KeyUtils;
/*     */ import java.security.AlgorithmParameters;
/*     */ import java.security.GeneralSecurityException;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.Provider;
/*     */ import java.security.SecureRandom;
/*     */ import java.security.spec.InvalidParameterSpecException;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.IllegalBlockSizeException;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.spec.GCMParameterSpec;
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
/*     */ @ThreadSafe
/*     */ public class AESGCM
/*     */ {
/*     */   public static final int IV_BIT_LENGTH = 96;
/*     */   public static final int AUTH_TAG_BIT_LENGTH = 128;
/*     */   
/*     */   public static byte[] generateIV(SecureRandom randomGen) {
/*  73 */     byte[] bytes = new byte[12];
/*  74 */     randomGen.nextBytes(bytes);
/*  75 */     return bytes;
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
/*     */   public static AuthenticatedCipherText encrypt(SecretKey secretKey, Container<byte[]> ivContainer, byte[] plainText, byte[] authData, Provider provider) throws JOSEException {
/*     */     Cipher cipher;
/*     */     byte[] cipherOutput;
/* 107 */     SecretKey aesKey = KeyUtils.toAESKey(secretKey);
/*     */ 
/*     */ 
/*     */     
/* 111 */     byte[] iv = (byte[])ivContainer.get();
/*     */     
/*     */     try {
/* 114 */       if (provider != null) {
/* 115 */         cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
/*     */       } else {
/* 117 */         cipher = Cipher.getInstance("AES/GCM/NoPadding");
/*     */       } 
/*     */       
/* 120 */       GCMParameterSpec gcmSpec = new GCMParameterSpec(128, iv);
/* 121 */       cipher.init(1, aesKey, gcmSpec);
/*     */     }
/* 123 */     catch (NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException|java.security.InvalidKeyException|java.security.InvalidAlgorithmParameterException e) {
/*     */       
/* 125 */       throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
/*     */     }
/* 127 */     catch (NoClassDefFoundError e) {
/*     */ 
/*     */       
/* 130 */       return LegacyAESGCM.encrypt(aesKey, iv, plainText, authData);
/*     */     } 
/*     */     
/* 133 */     cipher.updateAAD(authData);
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 138 */       cipherOutput = cipher.doFinal(plainText);
/*     */     }
/* 140 */     catch (IllegalBlockSizeException|javax.crypto.BadPaddingException e) {
/*     */       
/* 142 */       throw new JOSEException("Couldn't encrypt with AES/GCM/NoPadding: " + e.getMessage(), e);
/*     */     } 
/*     */     
/* 145 */     int tagPos = cipherOutput.length - ByteUtils.byteLength(128);
/*     */     
/* 147 */     byte[] cipherText = ByteUtils.subArray(cipherOutput, 0, tagPos);
/* 148 */     byte[] authTag = ByteUtils.subArray(cipherOutput, tagPos, ByteUtils.byteLength(128));
/*     */ 
/*     */     
/* 151 */     ivContainer.set(actualIVOf(cipher));
/*     */     
/* 153 */     return new AuthenticatedCipherText(cipherText, authTag);
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
/*     */   private static byte[] actualIVOf(Cipher cipher) throws JOSEException {
/* 175 */     GCMParameterSpec actualParams = actualParamsOf(cipher);
/*     */     
/* 177 */     byte[] iv = actualParams.getIV();
/* 178 */     int tLen = actualParams.getTLen();
/*     */     
/* 180 */     validate(iv, tLen);
/*     */     
/* 182 */     return iv;
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
/*     */   private static void validate(byte[] iv, int authTagLength) throws JOSEException {
/* 204 */     if (ByteUtils.safeBitLength(iv) != 96) {
/* 205 */       throw new JOSEException(String.format("IV length of %d bits is required, got %d", new Object[] { Integer.valueOf(96), Integer.valueOf(ByteUtils.safeBitLength(iv)) }));
/*     */     }
/*     */     
/* 208 */     if (authTagLength != 128) {
/* 209 */       throw new JOSEException(String.format("Authentication tag length of %d bits is required, got %d", new Object[] { Integer.valueOf(128), Integer.valueOf(authTagLength) }));
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
/*     */   private static GCMParameterSpec actualParamsOf(Cipher cipher) throws JOSEException {
/* 232 */     AlgorithmParameters algorithmParameters = cipher.getParameters();
/*     */     
/* 234 */     if (algorithmParameters == null) {
/* 235 */       throw new JOSEException("AES GCM ciphers are expected to make use of algorithm parameters");
/*     */     }
/*     */ 
/*     */     
/*     */     try {
/* 240 */       return algorithmParameters.<GCMParameterSpec>getParameterSpec(GCMParameterSpec.class);
/* 241 */     } catch (InvalidParameterSpecException shouldNotHappen) {
/* 242 */       throw new JOSEException(shouldNotHappen.getMessage(), shouldNotHappen);
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
/*     */   public static byte[] decrypt(SecretKey secretKey, byte[] iv, byte[] cipherText, byte[] authData, byte[] authTag, Provider provider) throws JOSEException {
/*     */     Cipher cipher;
/* 270 */     SecretKey aesKey = KeyUtils.toAESKey(secretKey);
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 275 */       if (provider != null) {
/* 276 */         cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
/*     */       } else {
/* 278 */         cipher = Cipher.getInstance("AES/GCM/NoPadding");
/*     */       } 
/*     */       
/* 281 */       GCMParameterSpec gcmSpec = new GCMParameterSpec(128, iv);
/* 282 */       cipher.init(2, aesKey, gcmSpec);
/*     */     }
/* 284 */     catch (NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException|java.security.InvalidKeyException|java.security.InvalidAlgorithmParameterException e) {
/*     */       
/* 286 */       throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
/*     */     }
/* 288 */     catch (NoClassDefFoundError e) {
/*     */ 
/*     */       
/* 291 */       return LegacyAESGCM.decrypt(aesKey, iv, cipherText, authData, authTag);
/*     */     } 
/*     */     
/* 294 */     cipher.updateAAD(authData);
/*     */     
/*     */     try {
/* 297 */       return cipher.doFinal(ByteUtils.concat(new byte[][] { cipherText, authTag }));
/*     */     }
/* 299 */     catch (IllegalBlockSizeException|javax.crypto.BadPaddingException e) {
/*     */       
/* 301 */       throw new JOSEException("AES/GCM/NoPadding decryption failed: " + e.getMessage(), e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\AESGCM.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */