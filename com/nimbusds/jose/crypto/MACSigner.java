/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWSAlgorithm;
/*     */ import com.nimbusds.jose.JWSHeader;
/*     */ import com.nimbusds.jose.JWSSigner;
/*     */ import com.nimbusds.jose.KeyLengthException;
/*     */ import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
/*     */ import com.nimbusds.jose.crypto.impl.HMAC;
/*     */ import com.nimbusds.jose.crypto.impl.MACProvider;
/*     */ import com.nimbusds.jose.jwk.OctetSequenceKey;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.ByteUtils;
/*     */ import com.nimbusds.jose.util.StandardCharset;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.Set;
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
/*     */ @ThreadSafe
/*     */ public class MACSigner
/*     */   extends MACProvider
/*     */   implements JWSSigner
/*     */ {
/*     */   public static int getMinRequiredSecretLength(JWSAlgorithm alg) throws JOSEException {
/*  78 */     if (JWSAlgorithm.HS256.equals(alg))
/*  79 */       return 256; 
/*  80 */     if (JWSAlgorithm.HS384.equals(alg))
/*  81 */       return 384; 
/*  82 */     if (JWSAlgorithm.HS512.equals(alg)) {
/*  83 */       return 512;
/*     */     }
/*  85 */     throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(alg, SUPPORTED_ALGORITHMS));
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
/*     */   public static Set<JWSAlgorithm> getCompatibleAlgorithms(int secretLength) {
/* 103 */     Set<JWSAlgorithm> hmacAlgs = new LinkedHashSet<>();
/*     */     
/* 105 */     if (secretLength >= 256) {
/* 106 */       hmacAlgs.add(JWSAlgorithm.HS256);
/*     */     }
/* 108 */     if (secretLength >= 384) {
/* 109 */       hmacAlgs.add(JWSAlgorithm.HS384);
/*     */     }
/* 111 */     if (secretLength >= 512) {
/* 112 */       hmacAlgs.add(JWSAlgorithm.HS512);
/*     */     }
/* 114 */     return Collections.unmodifiableSet(hmacAlgs);
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
/*     */   public MACSigner(byte[] secret) throws KeyLengthException {
/* 130 */     super(secret, getCompatibleAlgorithms(ByteUtils.bitLength(secret.length)));
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
/*     */   public MACSigner(String secretString) throws KeyLengthException {
/* 146 */     this(secretString.getBytes(StandardCharset.UTF_8));
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
/*     */   public MACSigner(SecretKey secretKey) throws KeyLengthException {
/* 162 */     this(secretKey.getEncoded());
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
/*     */   public MACSigner(OctetSequenceKey jwk) throws KeyLengthException {
/* 178 */     this(jwk.toByteArray());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Base64URL sign(JWSHeader header, byte[] signingInput) throws JOSEException {
/* 186 */     int minRequiredLength = getMinRequiredSecretLength(header.getAlgorithm());
/*     */     
/* 188 */     if ((getSecret()).length < ByteUtils.byteLength(minRequiredLength)) {
/* 189 */       throw new KeyLengthException("The secret length for " + header.getAlgorithm() + " must be at least " + minRequiredLength + " bits");
/*     */     }
/*     */     
/* 192 */     String jcaAlg = getJCAAlgorithmName(header.getAlgorithm());
/* 193 */     byte[] hmac = HMAC.compute(jcaAlg, getSecret(), signingInput, getJCAContext().getProvider());
/* 194 */     return Base64URL.encode(hmac);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\MACSigner.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */