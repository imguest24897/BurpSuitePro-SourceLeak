/*     */ package com.nimbusds.jose.crypto.factories;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWSAlgorithm;
/*     */ import com.nimbusds.jose.JWSHeader;
/*     */ import com.nimbusds.jose.JWSVerifier;
/*     */ import com.nimbusds.jose.KeyTypeException;
/*     */ import com.nimbusds.jose.crypto.ECDSAVerifier;
/*     */ import com.nimbusds.jose.crypto.MACVerifier;
/*     */ import com.nimbusds.jose.crypto.RSASSAVerifier;
/*     */ import com.nimbusds.jose.jca.JCAContext;
/*     */ import com.nimbusds.jose.proc.JWSVerifierFactory;
/*     */ import java.security.Key;
/*     */ import java.security.interfaces.ECPublicKey;
/*     */ import java.security.interfaces.RSAPublicKey;
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
/*     */ @ThreadSafe
/*     */ public class DefaultJWSVerifierFactory
/*     */   implements JWSVerifierFactory
/*     */ {
/*     */   public static final Set<JWSAlgorithm> SUPPORTED_ALGORITHMS;
/*     */   
/*     */   static {
/*  58 */     Set<JWSAlgorithm> algs = new LinkedHashSet<>();
/*  59 */     algs.addAll(MACVerifier.SUPPORTED_ALGORITHMS);
/*  60 */     algs.addAll(RSASSAVerifier.SUPPORTED_ALGORITHMS);
/*  61 */     algs.addAll(ECDSAVerifier.SUPPORTED_ALGORITHMS);
/*  62 */     SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(algs);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   private final JCAContext jcaContext = new JCAContext();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<JWSAlgorithm> supportedJWSAlgorithms() {
/*  75 */     return SUPPORTED_ALGORITHMS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JCAContext getJCAContext() {
/*  82 */     return this.jcaContext;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWSVerifier createJWSVerifier(JWSHeader header, Key key) throws JOSEException {
/*     */     ECDSAVerifier eCDSAVerifier;
/*  92 */     if (MACVerifier.SUPPORTED_ALGORITHMS.contains(header.getAlgorithm())) {
/*     */       
/*  94 */       if (!(key instanceof SecretKey)) {
/*  95 */         throw new KeyTypeException(SecretKey.class);
/*     */       }
/*     */       
/*  98 */       SecretKey macKey = (SecretKey)key;
/*     */       
/* 100 */       MACVerifier mACVerifier = new MACVerifier(macKey);
/*     */     }
/* 102 */     else if (RSASSAVerifier.SUPPORTED_ALGORITHMS.contains(header.getAlgorithm())) {
/*     */       
/* 104 */       if (!(key instanceof RSAPublicKey)) {
/* 105 */         throw new KeyTypeException(RSAPublicKey.class);
/*     */       }
/*     */       
/* 108 */       RSAPublicKey rsaPublicKey = (RSAPublicKey)key;
/*     */       
/* 110 */       RSASSAVerifier rSASSAVerifier = new RSASSAVerifier(rsaPublicKey);
/*     */     }
/* 112 */     else if (ECDSAVerifier.SUPPORTED_ALGORITHMS.contains(header.getAlgorithm())) {
/*     */       
/* 114 */       if (!(key instanceof ECPublicKey)) {
/* 115 */         throw new KeyTypeException(ECPublicKey.class);
/*     */       }
/*     */       
/* 118 */       ECPublicKey ecPublicKey = (ECPublicKey)key;
/*     */       
/* 120 */       eCDSAVerifier = new ECDSAVerifier(ecPublicKey);
/*     */     }
/*     */     else {
/*     */       
/* 124 */       throw new JOSEException("Unsupported JWS algorithm: " + header.getAlgorithm());
/*     */     } 
/*     */ 
/*     */     
/* 128 */     eCDSAVerifier.getJCAContext().setProvider(this.jcaContext.getProvider());
/*     */     
/* 130 */     return (JWSVerifier)eCDSAVerifier;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\factories\DefaultJWSVerifierFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */