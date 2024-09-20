/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.util.IntegerUtils;
/*     */ import com.nimbusds.jose.util.StandardCharset;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.security.MessageDigest;
/*     */ import java.security.NoSuchAlgorithmException;
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
/*     */ public class LegacyConcatKDF
/*     */ {
/*  54 */   private static final byte[] ONE_BYTES = new byte[] { 0, 0, 0, 1 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  60 */   private static final byte[] ZERO_BYTES = new byte[] { 0, 0, 0, 0 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   private static final byte[] ENCRYPTION_BYTES = new byte[] { 69, 110, 99, 114, 121, 112, 116, 105, 111, 110 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  75 */   private static final byte[] INTEGRITY_BYTES = new byte[] { 73, 110, 116, 101, 103, 114, 105, 116, 121 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static SecretKey generateCEK(SecretKey key, EncryptionMethod enc, byte[] epu, byte[] epv) throws JOSEException {
/*     */     int hashBitLength;
/*     */     MessageDigest md;
/* 102 */     ByteArrayOutputStream baos = new ByteArrayOutputStream();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 108 */       baos.write(ONE_BYTES);
/*     */ 
/*     */       
/* 111 */       byte[] cmkBytes = key.getEncoded();
/* 112 */       baos.write(cmkBytes);
/*     */ 
/*     */       
/* 115 */       int cmkBitLength = cmkBytes.length * 8;
/* 116 */       hashBitLength = cmkBitLength;
/* 117 */       int cekBitLength = cmkBitLength / 2;
/* 118 */       byte[] cekBitLengthBytes = IntegerUtils.toBytes(cekBitLength);
/* 119 */       baos.write(cekBitLengthBytes);
/*     */ 
/*     */       
/* 122 */       byte[] encBytes = enc.toString().getBytes(StandardCharset.UTF_8);
/* 123 */       baos.write(encBytes);
/*     */ 
/*     */       
/* 126 */       if (epu != null) {
/*     */         
/* 128 */         baos.write(IntegerUtils.toBytes(epu.length));
/* 129 */         baos.write(epu);
/*     */       } else {
/*     */         
/* 132 */         baos.write(ZERO_BYTES);
/*     */       } 
/*     */ 
/*     */       
/* 136 */       if (epv != null) {
/*     */         
/* 138 */         baos.write(IntegerUtils.toBytes(epv.length));
/* 139 */         baos.write(epv);
/*     */       } else {
/*     */         
/* 142 */         baos.write(ZERO_BYTES);
/*     */       } 
/*     */ 
/*     */       
/* 146 */       baos.write(ENCRYPTION_BYTES);
/*     */     }
/* 148 */     catch (IOException e) {
/*     */       
/* 150 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */ 
/*     */     
/* 154 */     byte[] hashInput = baos.toByteArray();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 160 */       md = MessageDigest.getInstance("SHA-" + hashBitLength);
/*     */     }
/* 162 */     catch (NoSuchAlgorithmException e) {
/*     */       
/* 164 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */     
/* 167 */     byte[] hashOutput = md.digest(hashInput);
/*     */     
/* 169 */     byte[] cekBytes = new byte[hashOutput.length / 2];
/* 170 */     System.arraycopy(hashOutput, 0, cekBytes, 0, cekBytes.length);
/*     */     
/* 172 */     return new SecretKeySpec(cekBytes, "AES");
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
/*     */   public static SecretKey generateCIK(SecretKey key, EncryptionMethod enc, byte[] epu, byte[] epv) throws JOSEException {
/*     */     int hashBitLength, cikBitLength;
/*     */     MessageDigest md;
/* 197 */     ByteArrayOutputStream baos = new ByteArrayOutputStream();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 204 */       baos.write(ONE_BYTES);
/*     */ 
/*     */       
/* 207 */       byte[] cmkBytes = key.getEncoded();
/* 208 */       baos.write(cmkBytes);
/*     */ 
/*     */       
/* 211 */       int cmkBitLength = cmkBytes.length * 8;
/* 212 */       hashBitLength = cmkBitLength;
/* 213 */       cikBitLength = cmkBitLength;
/* 214 */       byte[] cikBitLengthBytes = IntegerUtils.toBytes(cikBitLength);
/* 215 */       baos.write(cikBitLengthBytes);
/*     */ 
/*     */       
/* 218 */       byte[] encBytes = enc.toString().getBytes(StandardCharset.UTF_8);
/* 219 */       baos.write(encBytes);
/*     */ 
/*     */       
/* 222 */       if (epu != null) {
/*     */         
/* 224 */         baos.write(IntegerUtils.toBytes(epu.length));
/* 225 */         baos.write(epu);
/*     */       } else {
/*     */         
/* 228 */         baos.write(ZERO_BYTES);
/*     */       } 
/*     */ 
/*     */       
/* 232 */       if (epv != null) {
/*     */         
/* 234 */         baos.write(IntegerUtils.toBytes(epv.length));
/* 235 */         baos.write(epv);
/*     */       } else {
/*     */         
/* 238 */         baos.write(ZERO_BYTES);
/*     */       } 
/*     */ 
/*     */       
/* 242 */       baos.write(INTEGRITY_BYTES);
/*     */     }
/* 244 */     catch (IOException e) {
/*     */       
/* 246 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */ 
/*     */     
/* 250 */     byte[] hashInput = baos.toByteArray();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 256 */       md = MessageDigest.getInstance("SHA-" + hashBitLength);
/*     */     }
/* 258 */     catch (NoSuchAlgorithmException e) {
/*     */       
/* 260 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */ 
/*     */     
/* 264 */     return new SecretKeySpec(md.digest(hashInput), "HMACSHA" + cikBitLength);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\LegacyConcatKDF.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */