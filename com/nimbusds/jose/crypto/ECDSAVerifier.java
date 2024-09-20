/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.CriticalHeaderParamsAware;
/*     */ import com.nimbusds.jose.Header;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWSAlgorithm;
/*     */ import com.nimbusds.jose.JWSHeader;
/*     */ import com.nimbusds.jose.JWSVerifier;
/*     */ import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
/*     */ import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
/*     */ import com.nimbusds.jose.crypto.impl.ECDSA;
/*     */ import com.nimbusds.jose.crypto.impl.ECDSAProvider;
/*     */ import com.nimbusds.jose.crypto.utils.ECChecks;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.jwk.ECKey;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.security.InvalidKeyException;
/*     */ import java.security.Signature;
/*     */ import java.security.SignatureException;
/*     */ import java.security.interfaces.ECPublicKey;
/*     */ import java.util.Set;
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
/*     */ @ThreadSafe
/*     */ public class ECDSAVerifier
/*     */   extends ECDSAProvider
/*     */   implements JWSVerifier, CriticalHeaderParamsAware
/*     */ {
/*  70 */   private final CriticalHeaderParamsDeferral critPolicy = new CriticalHeaderParamsDeferral();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final ECPublicKey publicKey;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ECDSAVerifier(ECPublicKey publicKey) throws JOSEException {
/*  90 */     this(publicKey, (Set<String>)null);
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
/*     */   public ECDSAVerifier(ECKey ecJWK) throws JOSEException {
/* 105 */     this(ecJWK.toECPublicKey());
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
/*     */   public ECDSAVerifier(ECPublicKey publicKey, Set<String> defCritHeaders) throws JOSEException {
/* 123 */     super(ECDSA.resolveAlgorithm(publicKey));
/*     */     
/* 125 */     this.publicKey = publicKey;
/*     */     
/* 127 */     if (!ECChecks.isPointOnCurve(publicKey, (
/*     */         
/* 129 */         (Curve)Curve.forJWSAlgorithm(supportedECDSAAlgorithm()).iterator().next()).toECParameterSpec())) {
/* 130 */       throw new JOSEException("Curve / public key parameters mismatch");
/*     */     }
/*     */     
/* 133 */     this.critPolicy.setDeferredCriticalHeaderParams(defCritHeaders);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ECPublicKey getPublicKey() {
/* 144 */     return this.publicKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getProcessedCriticalHeaderParams() {
/* 151 */     return this.critPolicy.getProcessedCriticalHeaderParams();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getDeferredCriticalHeaderParams() {
/* 158 */     return this.critPolicy.getProcessedCriticalHeaderParams();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean verify(JWSHeader header, byte[] signedContent, Base64URL signature) throws JOSEException {
/*     */     byte[] derSignature;
/* 168 */     JWSAlgorithm alg = header.getAlgorithm();
/*     */     
/* 170 */     if (!supportedJWSAlgorithms().contains(alg)) {
/* 171 */       throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(alg, supportedJWSAlgorithms()));
/*     */     }
/*     */     
/* 174 */     if (!this.critPolicy.headerPasses((Header)header)) {
/* 175 */       return false;
/*     */     }
/*     */     
/* 178 */     byte[] jwsSignature = signature.decode();
/*     */ 
/*     */ 
/*     */     
/* 182 */     if (ECDSA.getSignatureByteArrayLength(header.getAlgorithm()) != jwsSignature.length)
/*     */     {
/*     */       
/* 185 */       return false;
/*     */     }
/*     */     
/*     */     try {
/* 189 */       derSignature = ECDSA.transcodeSignatureToDER(jwsSignature);
/* 190 */     } catch (JOSEException e) {
/*     */       
/* 192 */       return false;
/*     */     } 
/*     */     
/* 195 */     Signature sig = ECDSA.getSignerAndVerifier(alg, getJCAContext().getProvider());
/*     */     
/*     */     try {
/* 198 */       sig.initVerify(this.publicKey);
/* 199 */       sig.update(signedContent);
/* 200 */       return sig.verify(derSignature);
/*     */     }
/* 202 */     catch (InvalidKeyException e) {
/* 203 */       throw new JOSEException("Invalid EC public key: " + e.getMessage(), e);
/* 204 */     } catch (SignatureException e) {
/* 205 */       return false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\ECDSAVerifier.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */