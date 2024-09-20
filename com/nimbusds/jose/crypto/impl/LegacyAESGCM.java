/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import javax.crypto.SecretKey;
/*     */ import net.jcip.annotations.ThreadSafe;
/*     */ import org.bouncycastle.crypto.BlockCipher;
/*     */ import org.bouncycastle.crypto.CipherParameters;
/*     */ import org.bouncycastle.crypto.InvalidCipherTextException;
/*     */ import org.bouncycastle.crypto.engines.AESEngine;
/*     */ import org.bouncycastle.crypto.modes.GCMBlockCipher;
/*     */ import org.bouncycastle.crypto.params.AEADParameters;
/*     */ import org.bouncycastle.crypto.params.KeyParameter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ public class LegacyAESGCM
/*     */ {
/*     */   public static final int AUTH_TAG_BIT_LENGTH = 128;
/*     */   
/*     */   public static AESEngine createAESCipher(SecretKey secretKey, boolean forEncryption) {
/*  65 */     AESEngine cipher = new AESEngine();
/*     */     
/*  67 */     KeyParameter keyParameter = new KeyParameter(secretKey.getEncoded());
/*     */     
/*  69 */     cipher.init(forEncryption, (CipherParameters)keyParameter);
/*     */     
/*  71 */     return cipher;
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
/*     */   private static GCMBlockCipher createAESGCMCipher(SecretKey secretKey, boolean forEncryption, byte[] iv, byte[] authData) {
/*  94 */     AESEngine aESEngine = createAESCipher(secretKey, forEncryption);
/*     */ 
/*     */     
/*  97 */     GCMBlockCipher gcm = new GCMBlockCipher((BlockCipher)aESEngine);
/*     */     
/*  99 */     AEADParameters aeadParams = new AEADParameters(new KeyParameter(secretKey.getEncoded()), 128, iv, authData);
/*     */ 
/*     */ 
/*     */     
/* 103 */     gcm.init(forEncryption, (CipherParameters)aeadParams);
/*     */     
/* 105 */     return gcm;
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
/*     */   public static AuthenticatedCipherText encrypt(SecretKey secretKey, byte[] iv, byte[] plainText, byte[] authData) throws JOSEException {
/* 129 */     GCMBlockCipher cipher = createAESGCMCipher(secretKey, true, iv, authData);
/*     */ 
/*     */ 
/*     */     
/* 133 */     int outputLength = cipher.getOutputSize(plainText.length);
/* 134 */     byte[] output = new byte[outputLength];
/*     */ 
/*     */ 
/*     */     
/* 138 */     int outputOffset = cipher.processBytes(plainText, 0, plainText.length, output, 0);
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 143 */       outputOffset += cipher.doFinal(output, outputOffset);
/*     */     }
/* 145 */     catch (InvalidCipherTextException e) {
/*     */       
/* 147 */       throw new JOSEException("Couldn't generate GCM authentication tag: " + e.getMessage(), e);
/*     */     } 
/*     */ 
/*     */     
/* 151 */     int authTagLength = 16;
/*     */     
/* 153 */     byte[] cipherText = new byte[outputOffset - authTagLength];
/* 154 */     byte[] authTag = new byte[authTagLength];
/*     */     
/* 156 */     System.arraycopy(output, 0, cipherText, 0, cipherText.length);
/* 157 */     System.arraycopy(output, outputOffset - authTagLength, authTag, 0, authTag.length);
/*     */     
/* 159 */     return new AuthenticatedCipherText(cipherText, authTag);
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
/*     */   public static byte[] decrypt(SecretKey secretKey, byte[] iv, byte[] cipherText, byte[] authData, byte[] authTag) throws JOSEException {
/* 185 */     GCMBlockCipher cipher = createAESGCMCipher(secretKey, false, iv, authData);
/*     */ 
/*     */ 
/*     */     
/* 189 */     byte[] input = new byte[cipherText.length + authTag.length];
/*     */     
/* 191 */     System.arraycopy(cipherText, 0, input, 0, cipherText.length);
/* 192 */     System.arraycopy(authTag, 0, input, cipherText.length, authTag.length);
/*     */     
/* 194 */     int outputLength = cipher.getOutputSize(input.length);
/*     */     
/* 196 */     byte[] output = new byte[outputLength];
/*     */ 
/*     */ 
/*     */     
/* 200 */     int outputOffset = cipher.processBytes(input, 0, input.length, output, 0);
/*     */ 
/*     */     
/*     */     try {
/* 204 */       outputOffset += cipher.doFinal(output, outputOffset);
/*     */     }
/* 206 */     catch (InvalidCipherTextException e) {
/*     */       
/* 208 */       throw new JOSEException("Couldn't validate GCM authentication tag: " + e.getMessage(), e);
/*     */     } 
/*     */     
/* 211 */     return output;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\LegacyAESGCM.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */