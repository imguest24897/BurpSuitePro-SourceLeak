/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import java.security.InvalidKeyException;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.Provider;
/*     */ import javax.crypto.Mac;
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
/*     */ @ThreadSafe
/*     */ public class HMAC
/*     */ {
/*     */   public static Mac getInitMac(SecretKey secretKey, Provider provider) throws JOSEException {
/*     */     Mac mac;
/*     */     try {
/*  51 */       if (provider != null) {
/*  52 */         mac = Mac.getInstance(secretKey.getAlgorithm(), provider);
/*     */       } else {
/*  54 */         mac = Mac.getInstance(secretKey.getAlgorithm());
/*     */       } 
/*     */       
/*  57 */       mac.init(secretKey);
/*     */     }
/*  59 */     catch (NoSuchAlgorithmException e) {
/*     */       
/*  61 */       throw new JOSEException("Unsupported HMAC algorithm: " + e.getMessage(), e);
/*     */     }
/*  63 */     catch (InvalidKeyException e) {
/*     */       
/*  65 */       throw new JOSEException("Invalid HMAC key: " + e.getMessage(), e);
/*     */     } 
/*     */     
/*  68 */     return mac;
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
/*     */   public static byte[] compute(String alg, byte[] secret, byte[] message, Provider provider) throws JOSEException {
/*  94 */     return compute(new SecretKeySpec(secret, alg), message, provider);
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
/*     */   public static byte[] compute(SecretKey secretKey, byte[] message, Provider provider) throws JOSEException {
/* 118 */     Mac mac = getInitMac(secretKey, provider);
/* 119 */     mac.update(message);
/* 120 */     return mac.doFinal();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\HMAC.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */