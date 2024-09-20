/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.google.crypto.tink.subtle.XChaCha20Poly1305;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.util.ByteUtils;
/*     */ import com.nimbusds.jose.util.Container;
/*     */ import java.security.GeneralSecurityException;
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
/*     */ @ThreadSafe
/*     */ public class XC20P
/*     */ {
/*     */   public static final int AUTH_TAG_BIT_LENGTH = 128;
/*     */   public static final int IV_BIT_LENGTH = 192;
/*     */   
/*     */   public static AuthenticatedCipherText encryptAuthenticated(SecretKey secretKey, Container<byte[]> ivContainer, byte[] plainText, byte[] authData) throws JOSEException {
/*     */     XChaCha20Poly1305 aead;
/*     */     byte[] cipherOutput;
/*     */     try {
/*  87 */       aead = new XChaCha20Poly1305(secretKey.getEncoded());
/*     */     }
/*  89 */     catch (GeneralSecurityException e) {
/*  90 */       throw new JOSEException("Invalid XChaCha20Poly1305 key: " + e.getMessage(), e);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  96 */       cipherOutput = aead.encrypt(plainText, authData);
/*     */     }
/*  98 */     catch (GeneralSecurityException e) {
/*  99 */       throw new JOSEException("Couldn't encrypt with XChaCha20Poly1305: " + e.getMessage(), e);
/*     */     } 
/*     */     
/* 102 */     int tagPos = cipherOutput.length - ByteUtils.byteLength(128);
/* 103 */     int cipherTextPos = ByteUtils.byteLength(192);
/*     */     
/* 105 */     byte[] iv = ByteUtils.subArray(cipherOutput, 0, cipherTextPos);
/* 106 */     byte[] cipherText = ByteUtils.subArray(cipherOutput, cipherTextPos, tagPos - cipherTextPos);
/* 107 */     byte[] authTag = ByteUtils.subArray(cipherOutput, tagPos, ByteUtils.byteLength(128));
/*     */ 
/*     */     
/* 110 */     ivContainer.set(iv);
/*     */     
/* 112 */     return new AuthenticatedCipherText(cipherText, authTag);
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
/*     */   public static byte[] decryptAuthenticated(SecretKey secretKey, byte[] iv, byte[] cipherText, byte[] authData, byte[] authTag) throws JOSEException {
/*     */     XChaCha20Poly1305 aead;
/*     */     try {
/* 140 */       aead = new XChaCha20Poly1305(secretKey.getEncoded());
/*     */     }
/* 142 */     catch (GeneralSecurityException e) {
/* 143 */       throw new JOSEException("Invalid XChaCha20Poly1305 key: " + e.getMessage(), e);
/*     */     } 
/*     */     
/* 146 */     byte[] cipherInput = ByteUtils.concat(new byte[][] { iv, cipherText, authTag });
/*     */     
/*     */     try {
/* 149 */       return aead.decrypt(cipherInput, authData);
/*     */     }
/* 151 */     catch (GeneralSecurityException e) {
/*     */       
/* 153 */       throw new JOSEException("XChaCha20Poly1305 decryption failed: " + e.getMessage(), e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\XC20P.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */