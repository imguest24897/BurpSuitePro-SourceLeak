/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.jca.JCAAware;
/*     */ import com.nimbusds.jose.jca.JCAContext;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.ByteUtils;
/*     */ import com.nimbusds.jose.util.IntegerUtils;
/*     */ import com.nimbusds.jose.util.StandardCharset;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.security.MessageDigest;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.Provider;
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
/*     */ @ThreadSafe
/*     */ public class ConcatKDF
/*     */   implements JCAAware<JCAContext>
/*     */ {
/*     */   private final String jcaHashAlg;
/*  60 */   private final JCAContext jcaContext = new JCAContext();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ConcatKDF(String jcaHashAlg) {
/*  72 */     if (jcaHashAlg == null) {
/*  73 */       throw new IllegalArgumentException("The JCA hash algorithm must not be null");
/*     */     }
/*     */     
/*  76 */     this.jcaHashAlg = jcaHashAlg;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getHashAlgorithm() {
/*  87 */     return this.jcaHashAlg;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JCAContext getJCAContext() {
/*  94 */     return this.jcaContext;
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
/*     */   public SecretKey deriveKey(SecretKey sharedSecret, int keyLengthBits, byte[] otherInfo) throws JOSEException {
/* 114 */     ByteArrayOutputStream baos = new ByteArrayOutputStream();
/*     */     
/* 116 */     MessageDigest md = getMessageDigest();
/*     */     
/* 118 */     for (int i = 1; i <= computeDigestCycles(ByteUtils.safeBitLength(md.getDigestLength()), keyLengthBits); i++) {
/*     */       
/* 120 */       byte[] counterBytes = IntegerUtils.toBytes(i);
/*     */       
/* 122 */       md.update(counterBytes);
/* 123 */       md.update(sharedSecret.getEncoded());
/*     */       
/* 125 */       if (otherInfo != null) {
/* 126 */         md.update(otherInfo);
/*     */       }
/*     */       
/*     */       try {
/* 130 */         baos.write(md.digest());
/* 131 */       } catch (IOException e) {
/* 132 */         throw new JOSEException("Couldn't write derived key: " + e.getMessage(), e);
/*     */       } 
/*     */     } 
/*     */     
/* 136 */     byte[] derivedKeyMaterial = baos.toByteArray();
/*     */     
/* 138 */     int keyLengthBytes = ByteUtils.byteLength(keyLengthBits);
/*     */     
/* 140 */     if (derivedKeyMaterial.length == keyLengthBytes)
/*     */     {
/* 142 */       return new SecretKeySpec(derivedKeyMaterial, "AES");
/*     */     }
/*     */     
/* 145 */     return new SecretKeySpec(ByteUtils.subArray(derivedKeyMaterial, 0, keyLengthBytes), "AES");
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
/*     */   public SecretKey deriveKey(SecretKey sharedSecret, int keyLength, byte[] algID, byte[] partyUInfo, byte[] partyVInfo, byte[] suppPubInfo, byte[] suppPrivInfo) throws JOSEException {
/* 174 */     byte[] otherInfo = composeOtherInfo(algID, partyUInfo, partyVInfo, suppPubInfo, suppPrivInfo);
/*     */     
/* 176 */     return deriveKey(sharedSecret, keyLength, otherInfo);
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
/*     */   public SecretKey deriveKey(SecretKey sharedSecret, int keyLength, byte[] algID, byte[] partyUInfo, byte[] partyVInfo, byte[] suppPubInfo, byte[] suppPrivInfo, byte[] tag) throws JOSEException {
/* 205 */     byte[] otherInfo = composeOtherInfo(algID, partyUInfo, partyVInfo, suppPubInfo, suppPrivInfo, tag);
/*     */     
/* 207 */     return deriveKey(sharedSecret, keyLength, otherInfo);
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
/*     */   public static byte[] composeOtherInfo(byte[] algID, byte[] partyUInfo, byte[] partyVInfo, byte[] suppPubInfo, byte[] suppPrivInfo) {
/* 229 */     return ByteUtils.concat(new byte[][] { algID, partyUInfo, partyVInfo, suppPubInfo, suppPrivInfo });
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
/*     */   public static byte[] composeOtherInfo(byte[] algID, byte[] partyUInfo, byte[] partyVInfo, byte[] suppPubInfo, byte[] suppPrivInfo, byte[] tag) {
/* 253 */     return ByteUtils.concat(new byte[][] { algID, partyUInfo, partyVInfo, suppPubInfo, suppPrivInfo, tag });
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
/*     */   private MessageDigest getMessageDigest() throws JOSEException {
/* 269 */     Provider provider = getJCAContext().getProvider();
/*     */     
/*     */     try {
/* 272 */       if (provider == null) {
/* 273 */         return MessageDigest.getInstance(this.jcaHashAlg);
/*     */       }
/* 275 */       return MessageDigest.getInstance(this.jcaHashAlg, provider);
/* 276 */     } catch (NoSuchAlgorithmException e) {
/* 277 */       throw new JOSEException("Couldn't get message digest for KDF: " + e.getMessage(), e);
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
/*     */   public static int computeDigestCycles(int digestLengthBits, int keyLengthBits) {
/* 295 */     return (keyLengthBits + digestLengthBits - 1) / digestLengthBits;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static byte[] encodeNoData() {
/* 306 */     return new byte[0];
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
/*     */   public static byte[] encodeIntData(int data) {
/* 319 */     return IntegerUtils.toBytes(data);
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
/*     */   public static byte[] encodeStringData(String data) {
/* 332 */     byte[] bytes = (data != null) ? data.getBytes(StandardCharset.UTF_8) : null;
/* 333 */     return encodeDataWithLength(bytes);
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
/*     */   public static byte[] encodeDataWithLength(byte[] data) {
/* 346 */     byte[] bytes = (data != null) ? data : new byte[0];
/* 347 */     byte[] length = IntegerUtils.toBytes(bytes.length);
/* 348 */     return ByteUtils.concat(new byte[][] { length, bytes });
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
/*     */   public static byte[] encodeDataWithLength(Base64URL data) {
/* 362 */     byte[] bytes = (data != null) ? data.decode() : null;
/* 363 */     return encodeDataWithLength(bytes);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\ConcatKDF.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */