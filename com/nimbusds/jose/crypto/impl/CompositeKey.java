/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.KeyLengthException;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.spec.SecretKeySpec;
/*     */ import net.jcip.annotations.Immutable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Immutable
/*     */ public final class CompositeKey
/*     */ {
/*     */   private final SecretKey inputKey;
/*     */   private final SecretKey macKey;
/*     */   private final SecretKey encKey;
/*     */   private final int truncatedMacLength;
/*     */   
/*     */   public CompositeKey(SecretKey inputKey) throws KeyLengthException {
/*  78 */     this.inputKey = inputKey;
/*     */     
/*  80 */     byte[] secretKeyBytes = inputKey.getEncoded();
/*     */     
/*  82 */     if (secretKeyBytes.length == 32) {
/*     */ 
/*     */ 
/*     */       
/*  86 */       this.macKey = new SecretKeySpec(secretKeyBytes, 0, 16, "HMACSHA256");
/*  87 */       this.encKey = new SecretKeySpec(secretKeyBytes, 16, 16, "AES");
/*  88 */       this.truncatedMacLength = 16;
/*     */     }
/*  90 */     else if (secretKeyBytes.length == 48) {
/*     */ 
/*     */ 
/*     */       
/*  94 */       this.macKey = new SecretKeySpec(secretKeyBytes, 0, 24, "HMACSHA384");
/*  95 */       this.encKey = new SecretKeySpec(secretKeyBytes, 24, 24, "AES");
/*  96 */       this.truncatedMacLength = 24;
/*     */     
/*     */     }
/*  99 */     else if (secretKeyBytes.length == 64) {
/*     */ 
/*     */ 
/*     */       
/* 103 */       this.macKey = new SecretKeySpec(secretKeyBytes, 0, 32, "HMACSHA512");
/* 104 */       this.encKey = new SecretKeySpec(secretKeyBytes, 32, 32, "AES");
/* 105 */       this.truncatedMacLength = 32;
/*     */     }
/*     */     else {
/*     */       
/* 109 */       throw new KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
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
/*     */   public SecretKey getInputKey() {
/* 121 */     return this.inputKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SecretKey getMACKey() {
/* 132 */     return this.macKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTruncatedMACByteLength() {
/* 143 */     return this.truncatedMacLength;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SecretKey getAESKey() {
/* 154 */     return this.encKey;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\CompositeKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */