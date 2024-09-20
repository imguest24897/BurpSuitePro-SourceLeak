/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWSAlgorithm;
/*     */ import com.nimbusds.jose.JWSHeader;
/*     */ import com.nimbusds.jose.JWSSigner;
/*     */ import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
/*     */ import com.nimbusds.jose.crypto.impl.ECDSA;
/*     */ import com.nimbusds.jose.crypto.impl.ECDSAProvider;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.jwk.ECKey;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.security.GeneralSecurityException;
/*     */ import java.security.InvalidKeyException;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.Signature;
/*     */ import java.security.interfaces.ECPrivateKey;
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
/*     */ public class ECDSASigner
/*     */   extends ECDSAProvider
/*     */   implements JWSSigner
/*     */ {
/*     */   private final PrivateKey privateKey;
/*     */   
/*     */   public ECDSASigner(ECPrivateKey privateKey) throws JOSEException {
/*  89 */     super(ECDSA.resolveAlgorithm(privateKey));
/*     */     
/*  91 */     this.privateKey = privateKey;
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
/*     */   public ECDSASigner(PrivateKey privateKey, Curve curve) throws JOSEException {
/* 111 */     super(ECDSA.resolveAlgorithm(curve));
/*     */     
/* 113 */     if (!"EC".equalsIgnoreCase(privateKey.getAlgorithm())) {
/* 114 */       throw new IllegalArgumentException("The private key algorithm must be EC");
/*     */     }
/*     */     
/* 117 */     this.privateKey = privateKey;
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
/*     */   public ECDSASigner(ECKey ecJWK) throws JOSEException {
/* 135 */     super(ECDSA.resolveAlgorithm(ecJWK.getCurve()));
/*     */     
/* 137 */     if (!ecJWK.isPrivate()) {
/* 138 */       throw new JOSEException("The EC JWK doesn't contain a private part");
/*     */     }
/*     */     
/* 141 */     this.privateKey = ecJWK.toPrivateKey();
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
/*     */   public PrivateKey getPrivateKey() {
/* 155 */     return this.privateKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Base64URL sign(JWSHeader header, byte[] signingInput) throws JOSEException {
/*     */     byte[] jcaSignature;
/* 163 */     JWSAlgorithm alg = header.getAlgorithm();
/*     */     
/* 165 */     if (!supportedJWSAlgorithms().contains(alg)) {
/* 166 */       throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(alg, supportedJWSAlgorithms()));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 174 */       Signature dsa = ECDSA.getSignerAndVerifier(alg, getJCAContext().getProvider());
/* 175 */       dsa.initSign(this.privateKey, getJCAContext().getSecureRandom());
/* 176 */       dsa.update(signingInput);
/* 177 */       jcaSignature = dsa.sign();
/*     */     }
/* 179 */     catch (InvalidKeyException|java.security.SignatureException e) {
/*     */       
/* 181 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */     
/* 184 */     int rsByteArrayLength = ECDSA.getSignatureByteArrayLength(header.getAlgorithm());
/* 185 */     byte[] jwsSignature = ECDSA.transcodeSignatureToConcat(jcaSignature, rsByteArrayLength);
/* 186 */     return Base64URL.encode(jwsSignature);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\ECDSASigner.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */