/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.CriticalHeaderParamsAware;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEDecrypter;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
/*     */ import com.nimbusds.jose.crypto.impl.ECDH;
/*     */ import com.nimbusds.jose.crypto.impl.ECDHCryptoProvider;
/*     */ import com.nimbusds.jose.crypto.utils.ECChecks;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.jwk.ECKey;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.interfaces.ECPrivateKey;
/*     */ import java.security.interfaces.ECPublicKey;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedHashSet;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ECDHDecrypter
/*     */   extends ECDHCryptoProvider
/*     */   implements JWEDecrypter, CriticalHeaderParamsAware
/*     */ {
/*     */   public static final Set<Curve> SUPPORTED_ELLIPTIC_CURVES;
/*     */   private final PrivateKey privateKey;
/*     */   
/*     */   static {
/*  99 */     Set<Curve> curves = new LinkedHashSet<>();
/* 100 */     curves.add(Curve.P_256);
/* 101 */     curves.add(Curve.P_384);
/* 102 */     curves.add(Curve.P_521);
/* 103 */     SUPPORTED_ELLIPTIC_CURVES = Collections.unmodifiableSet(curves);
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
/* 116 */   private final CriticalHeaderParamsDeferral critPolicy = new CriticalHeaderParamsDeferral();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ECDHDecrypter(ECPrivateKey privateKey) throws JOSEException {
/* 129 */     this(privateKey, (Set<String>)null);
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
/*     */   public ECDHDecrypter(ECKey ecJWK) throws JOSEException {
/* 144 */     super(ecJWK.getCurve());
/*     */     
/* 146 */     if (!ecJWK.isPrivate()) {
/* 147 */       throw new JOSEException("The EC JWK doesn't contain a private part");
/*     */     }
/*     */     
/* 150 */     this.privateKey = ecJWK.toECPrivateKey();
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
/*     */   public ECDHDecrypter(ECPrivateKey privateKey, Set<String> defCritHeaders) throws JOSEException {
/* 167 */     this(privateKey, defCritHeaders, Curve.forECParameterSpec(privateKey.getParams()));
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
/*     */   public ECDHDecrypter(PrivateKey privateKey, Set<String> defCritHeaders, Curve curve) throws JOSEException {
/* 190 */     super(curve);
/*     */     
/* 192 */     this.critPolicy.setDeferredCriticalHeaderParams(defCritHeaders);
/*     */     
/* 194 */     this.privateKey = privateKey;
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
/* 208 */     return this.privateKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<Curve> supportedEllipticCurves() {
/* 215 */     return SUPPORTED_ELLIPTIC_CURVES;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getProcessedCriticalHeaderParams() {
/* 222 */     return this.critPolicy.getProcessedCriticalHeaderParams();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getDeferredCriticalHeaderParams() {
/* 229 */     return this.critPolicy.getProcessedCriticalHeaderParams();
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
/*     */   public byte[] decrypt(JWEHeader header, Base64URL encryptedKey, Base64URL iv, Base64URL cipherText, Base64URL authTag) throws JOSEException {
/* 241 */     this.critPolicy.ensureHeaderPasses(header);
/*     */ 
/*     */     
/* 244 */     ECKey ephemeralKey = (ECKey)header.getEphemeralPublicKey();
/*     */     
/* 246 */     if (ephemeralKey == null) {
/* 247 */       throw new JOSEException("Missing ephemeral public EC key \"epk\" JWE header parameter");
/*     */     }
/*     */     
/* 250 */     ECPublicKey ephemeralPublicKey = ephemeralKey.toECPublicKey();
/*     */ 
/*     */     
/* 253 */     if (getPrivateKey() instanceof ECPrivateKey) {
/* 254 */       ECPrivateKey ecPrivateKey = (ECPrivateKey)getPrivateKey();
/* 255 */       if (!ECChecks.isPointOnCurve(ephemeralPublicKey, ecPrivateKey)) {
/* 256 */         throw new JOSEException("Invalid ephemeral public EC key: Point(s) not on the expected curve");
/*     */       }
/*     */     }
/* 259 */     else if (!ECChecks.isPointOnCurve(ephemeralPublicKey, getCurve().toECParameterSpec())) {
/* 260 */       throw new JOSEException("Invalid ephemeral public EC key: Point(s) not on the expected curve");
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 265 */     SecretKey Z = ECDH.deriveSharedSecret(ephemeralPublicKey, this.privateKey, 
/*     */ 
/*     */         
/* 268 */         getJCAContext().getKeyEncryptionProvider());
/*     */     
/* 270 */     return decryptWithZ(header, Z, encryptedKey, iv, cipherText, authTag);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\ECDHDecrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */