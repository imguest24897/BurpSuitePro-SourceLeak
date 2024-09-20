/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.util.ByteUtils;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.Provider;
/*     */ import java.security.interfaces.RSAPublicKey;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.IllegalBlockSizeException;
/*     */ import javax.crypto.SecretKey;
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
/*     */ @ThreadSafe
/*     */ public class RSA1_5
/*     */ {
/*     */   public static byte[] encryptCEK(RSAPublicKey pub, SecretKey cek, Provider provider) throws JOSEException {
/*     */     try {
/*  62 */       Cipher cipher = CipherHelper.getInstance("RSA/ECB/PKCS1Padding", provider);
/*  63 */       cipher.init(1, pub);
/*  64 */       return cipher.doFinal(cek.getEncoded());
/*     */     }
/*  66 */     catch (IllegalBlockSizeException e) {
/*  67 */       throw new JOSEException("RSA block size exception: The RSA key is too short, use a longer one", e);
/*  68 */     } catch (Exception e) {
/*     */ 
/*     */       
/*  71 */       throw new JOSEException("Couldn't encrypt Content Encryption Key (CEK): " + e.getMessage(), e);
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
/*     */   public static SecretKey decryptCEK(PrivateKey priv, byte[] encryptedCEK, int keyLength, Provider provider) throws JOSEException {
/*     */     try {
/*  97 */       Cipher cipher = CipherHelper.getInstance("RSA/ECB/PKCS1Padding", provider);
/*  98 */       cipher.init(2, priv);
/*  99 */       byte[] secretKeyBytes = cipher.doFinal(encryptedCEK);
/*     */       
/* 101 */       if (ByteUtils.safeBitLength(secretKeyBytes) != keyLength)
/*     */       {
/* 103 */         return null;
/*     */       }
/*     */       
/* 106 */       return new SecretKeySpec(secretKeyBytes, "AES");
/*     */     }
/* 108 */     catch (Exception e) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 114 */       throw new JOSEException("Couldn't decrypt Content Encryption Key (CEK): " + e.getMessage(), e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\RSA1_5.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */