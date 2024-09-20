/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.util.ByteUtils;
/*     */ import com.nimbusds.jose.util.IntegerUtils;
/*     */ import com.nimbusds.jose.util.StandardCharset;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import javax.crypto.Mac;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PBKDF2
/*     */ {
/*     */   public static final int MIN_SALT_LENGTH = 8;
/*  56 */   static final byte[] ZERO_BYTE = new byte[] { 0 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static final long MAX_DERIVED_KEY_LENGTH = 4294967295L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static byte[] formatSalt(JWEAlgorithm alg, byte[] salt) throws JOSEException {
/*  82 */     byte[] algBytes = alg.toString().getBytes(StandardCharset.UTF_8);
/*     */     
/*  84 */     if (salt == null) {
/*  85 */       throw new JOSEException("The salt must not be null");
/*     */     }
/*     */     
/*  88 */     if (salt.length < 8) {
/*  89 */       throw new JOSEException("The salt must be at least 8 bytes long");
/*     */     }
/*     */     
/*  92 */     ByteArrayOutputStream out = new ByteArrayOutputStream();
/*     */     try {
/*  94 */       out.write(algBytes);
/*  95 */       out.write(ZERO_BYTE);
/*  96 */       out.write(salt);
/*  97 */     } catch (IOException e) {
/*  98 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */     
/* 101 */     return out.toByteArray();
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
/*     */   public static SecretKey deriveKey(byte[] password, byte[] formattedSalt, int iterationCount, PRFParams prfParams) throws JOSEException {
/* 126 */     if (formattedSalt == null) {
/* 127 */       throw new JOSEException("The formatted salt must not be null");
/*     */     }
/*     */     
/* 130 */     if (iterationCount < 1) {
/* 131 */       throw new JOSEException("The iteration count must be greater than 0");
/*     */     }
/*     */     
/* 134 */     SecretKey macKey = new SecretKeySpec(password, prfParams.getMACAlgorithm());
/*     */     
/* 136 */     Mac prf = HMAC.getInitMac(macKey, prfParams.getMacProvider());
/*     */     
/* 138 */     int hLen = prf.getMacLength();
/*     */ 
/*     */ 
/*     */     
/* 142 */     if (prfParams.getDerivedKeyByteLength() > 4294967295L) {
/* 143 */       throw new JOSEException("Derived key too long: " + prfParams.getDerivedKeyByteLength());
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     int l = (int)Math.ceil(prfParams.getDerivedKeyByteLength() / hLen);
/* 156 */     int r = prfParams.getDerivedKeyByteLength() - (l - 1) * hLen;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 189 */     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 190 */     for (int i = 0; i < l; i++) {
/* 191 */       byte[] block = extractBlock(formattedSalt, iterationCount, i + 1, prf);
/* 192 */       if (i == l - 1) {
/* 193 */         block = ByteUtils.subArray(block, 0, r);
/*     */       }
/* 195 */       byteArrayOutputStream.write(block, 0, block.length);
/*     */     } 
/*     */ 
/*     */     
/* 199 */     return new SecretKeySpec(byteArrayOutputStream.toByteArray(), "AES");
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
/*     */   static byte[] extractBlock(byte[] formattedSalt, int iterationCount, int blockIndex, Mac prf) throws JOSEException {
/* 220 */     if (formattedSalt == null) {
/* 221 */       throw new JOSEException("The formatted salt must not be null");
/*     */     }
/*     */     
/* 224 */     if (iterationCount < 1) {
/* 225 */       throw new JOSEException("The iteration count must be greater than 0");
/*     */     }
/*     */ 
/*     */     
/* 229 */     byte[] lastU = null;
/* 230 */     byte[] xorU = null;
/*     */     
/* 232 */     for (int i = 1; i <= iterationCount; i++) {
/*     */       byte[] currentU;
/*     */       
/* 235 */       if (i == 1) {
/*     */         
/* 237 */         byte[] inputBytes = ByteUtils.concat(new byte[][] { formattedSalt, IntegerUtils.toBytes(blockIndex) });
/* 238 */         currentU = prf.doFinal(inputBytes);
/* 239 */         xorU = currentU;
/*     */       }
/*     */       else {
/*     */         
/* 243 */         currentU = prf.doFinal(lastU);
/* 244 */         for (int j = 0; j < currentU.length; j++)
/*     */         {
/* 246 */           xorU[j] = (byte)(currentU[j] ^ xorU[j]);
/*     */         }
/*     */       } 
/*     */       
/* 250 */       lastU = currentU;
/*     */     } 
/* 252 */     return xorU;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\PBKDF2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */