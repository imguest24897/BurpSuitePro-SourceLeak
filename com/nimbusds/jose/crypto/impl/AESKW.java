/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.util.KeyUtils;
/*     */ import java.security.GeneralSecurityException;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.Provider;
/*     */ import javax.crypto.Cipher;
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
/*     */ @ThreadSafe
/*     */ public class AESKW
/*     */ {
/*     */   public static byte[] wrapCEK(SecretKey cek, SecretKey kek, Provider provider) throws JOSEException {
/*     */     try {
/*     */       Cipher cipher;
/*  70 */       if (provider != null) {
/*  71 */         cipher = Cipher.getInstance("AESWrap", provider);
/*     */       } else {
/*  73 */         cipher = Cipher.getInstance("AESWrap");
/*     */       } 
/*     */       
/*  76 */       cipher.init(3, kek);
/*  77 */       return cipher.wrap(cek);
/*     */     }
/*  79 */     catch (NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException|java.security.InvalidKeyException|javax.crypto.IllegalBlockSizeException e) {
/*  80 */       throw new JOSEException("Couldn't wrap AES key: " + e.getMessage(), e);
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
/*     */   public static SecretKey unwrapCEK(SecretKey kek, byte[] encryptedCEK, Provider provider) throws JOSEException {
/*     */     try {
/*     */       Cipher cipher;
/* 107 */       if (provider != null) {
/* 108 */         cipher = Cipher.getInstance("AESWrap", provider);
/*     */       } else {
/* 110 */         cipher = Cipher.getInstance("AESWrap");
/*     */       } 
/*     */       
/* 113 */       cipher.init(4, KeyUtils.toAESKey(kek));
/* 114 */       return (SecretKey)cipher.unwrap(encryptedCEK, "AES", 3);
/*     */     }
/* 116 */     catch (NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException|java.security.InvalidKeyException e) {
/*     */       
/* 118 */       throw new JOSEException("Couldn't unwrap AES key: " + e.getMessage(), e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\AESKW.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */