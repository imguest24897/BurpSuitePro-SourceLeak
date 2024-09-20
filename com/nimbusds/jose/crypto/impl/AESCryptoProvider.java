/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.KeyLengthException;
/*     */ import com.nimbusds.jose.jca.JWEJCAContext;
/*     */ import com.nimbusds.jose.util.ByteUtils;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.crypto.SecretKey;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AESCryptoProvider
/*     */   extends BaseJWEProvider
/*     */ {
/*     */   public static final Set<JWEAlgorithm> SUPPORTED_ALGORITHMS;
/*  75 */   public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;
/*     */ 
/*     */   
/*     */   public static final Map<Integer, Set<JWEAlgorithm>> COMPATIBLE_ALGORITHMS;
/*     */ 
/*     */   
/*     */   private final SecretKey kek;
/*     */ 
/*     */   
/*     */   static {
/*  85 */     Set<JWEAlgorithm> algs = new LinkedHashSet<>();
/*  86 */     algs.add(JWEAlgorithm.A128KW);
/*  87 */     algs.add(JWEAlgorithm.A192KW);
/*  88 */     algs.add(JWEAlgorithm.A256KW);
/*  89 */     algs.add(JWEAlgorithm.A128GCMKW);
/*  90 */     algs.add(JWEAlgorithm.A192GCMKW);
/*  91 */     algs.add(JWEAlgorithm.A256GCMKW);
/*  92 */     SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(algs);
/*     */     
/*  94 */     Map<Integer, Set<JWEAlgorithm>> algsMap = new HashMap<>();
/*  95 */     Set<JWEAlgorithm> bit128Algs = new HashSet<>();
/*  96 */     Set<JWEAlgorithm> bit192Algs = new HashSet<>();
/*  97 */     Set<JWEAlgorithm> bit256Algs = new HashSet<>();
/*  98 */     bit128Algs.add(JWEAlgorithm.A128GCMKW);
/*  99 */     bit128Algs.add(JWEAlgorithm.A128KW);
/* 100 */     bit192Algs.add(JWEAlgorithm.A192GCMKW);
/* 101 */     bit192Algs.add(JWEAlgorithm.A192KW);
/* 102 */     bit256Algs.add(JWEAlgorithm.A256GCMKW);
/* 103 */     bit256Algs.add(JWEAlgorithm.A256KW);
/* 104 */     algsMap.put(Integer.valueOf(128), Collections.unmodifiableSet(bit128Algs));
/* 105 */     algsMap.put(Integer.valueOf(192), Collections.unmodifiableSet(bit192Algs));
/* 106 */     algsMap.put(Integer.valueOf(256), Collections.unmodifiableSet(bit256Algs));
/* 107 */     COMPATIBLE_ALGORITHMS = Collections.unmodifiableMap(algsMap);
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
/*     */   private static Set<JWEAlgorithm> getCompatibleJWEAlgorithms(int kekLength) throws KeyLengthException {
/* 130 */     Set<JWEAlgorithm> algs = COMPATIBLE_ALGORITHMS.get(Integer.valueOf(kekLength));
/*     */     
/* 132 */     if (algs == null) {
/* 133 */       throw new KeyLengthException("The Key Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes) or 256 bits (32 bytes)");
/*     */     }
/*     */     
/* 136 */     return algs;
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
/*     */   protected AESCryptoProvider(SecretKey kek) throws KeyLengthException {
/* 152 */     super(getCompatibleJWEAlgorithms(ByteUtils.bitLength(kek.getEncoded())), ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS);
/*     */     
/* 154 */     this.kek = kek;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SecretKey getKey() {
/* 165 */     return this.kek;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\AESCryptoProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */