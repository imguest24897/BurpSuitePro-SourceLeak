/*      */ package com.nimbusds.jose.jwk;
/*      */ 
/*      */ import com.nimbusds.jose.Algorithm;
/*      */ import com.nimbusds.jose.JOSEException;
/*      */ import com.nimbusds.jose.util.Base64;
/*      */ import com.nimbusds.jose.util.Base64URL;
/*      */ import com.nimbusds.jose.util.ByteUtils;
/*      */ import com.nimbusds.jose.util.IntegerOverflowException;
/*      */ import com.nimbusds.jose.util.JSONArrayUtils;
/*      */ import com.nimbusds.jose.util.JSONObjectUtils;
/*      */ import java.io.Serializable;
/*      */ import java.math.BigInteger;
/*      */ import java.net.URI;
/*      */ import java.security.GeneralSecurityException;
/*      */ import java.security.Key;
/*      */ import java.security.KeyFactory;
/*      */ import java.security.KeyPair;
/*      */ import java.security.KeyStore;
/*      */ import java.security.KeyStoreException;
/*      */ import java.security.MessageDigest;
/*      */ import java.security.NoSuchAlgorithmException;
/*      */ import java.security.PrivateKey;
/*      */ import java.security.PublicKey;
/*      */ import java.security.UnrecoverableKeyException;
/*      */ import java.security.cert.Certificate;
/*      */ import java.security.cert.CertificateEncodingException;
/*      */ import java.security.cert.X509Certificate;
/*      */ import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
/*      */ import java.security.interfaces.RSAPrivateCrtKey;
/*      */ import java.security.interfaces.RSAPrivateKey;
/*      */ import java.security.interfaces.RSAPublicKey;
/*      */ import java.security.spec.InvalidKeySpecException;
/*      */ import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;
/*      */ import java.security.spec.RSAOtherPrimeInfo;
/*      */ import java.security.spec.RSAPrivateCrtKeySpec;
/*      */ import java.security.spec.RSAPrivateKeySpec;
/*      */ import java.security.spec.RSAPublicKeySpec;
/*      */ import java.text.ParseException;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collections;
/*      */ import java.util.LinkedHashMap;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Objects;
/*      */ import java.util.Set;
/*      */ import net.jcip.annotations.Immutable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Immutable
/*      */ public final class RSAKey
/*      */   extends JWK
/*      */   implements AsymmetricJWK
/*      */ {
/*      */   private static final long serialVersionUID = 1L;
/*      */   private final Base64URL n;
/*      */   private final Base64URL e;
/*      */   private final Base64URL d;
/*      */   private final Base64URL p;
/*      */   private final Base64URL q;
/*      */   private final Base64URL dp;
/*      */   private final Base64URL dq;
/*      */   private final Base64URL qi;
/*      */   private final List<OtherPrimesInfo> oth;
/*      */   private final PrivateKey privateKey;
/*      */   
/*      */   @Immutable
/*      */   public static class OtherPrimesInfo
/*      */     implements Serializable
/*      */   {
/*      */     private static final long serialVersionUID = 1L;
/*      */     private final Base64URL r;
/*      */     private final Base64URL d;
/*      */     private final Base64URL t;
/*      */     
/*      */     public OtherPrimesInfo(Base64URL r, Base64URL d, Base64URL t) {
/*  183 */       if (r == null)
/*      */       {
/*  185 */         throw new IllegalArgumentException("The prime factor must not be null");
/*      */       }
/*      */       
/*  188 */       this.r = r;
/*      */       
/*  190 */       if (d == null)
/*      */       {
/*  192 */         throw new IllegalArgumentException("The factor CRT exponent must not be null");
/*      */       }
/*      */       
/*  195 */       this.d = d;
/*      */       
/*  197 */       if (t == null)
/*      */       {
/*  199 */         throw new IllegalArgumentException("The factor CRT coefficient must not be null");
/*      */       }
/*      */       
/*  202 */       this.t = t;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public OtherPrimesInfo(RSAOtherPrimeInfo oth) {
/*  215 */       this.r = Base64URL.encode(oth.getPrime());
/*  216 */       this.d = Base64URL.encode(oth.getExponent());
/*  217 */       this.t = Base64URL.encode(oth.getCrtCoefficient());
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Base64URL getPrimeFactor() {
/*  228 */       return this.r;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Base64URL getFactorCRTExponent() {
/*  240 */       return this.d;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Base64URL getFactorCRTCoefficient() {
/*  253 */       return this.t;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static List<OtherPrimesInfo> toList(RSAOtherPrimeInfo[] othArray) {
/*  270 */       List<OtherPrimesInfo> list = new ArrayList<>();
/*      */       
/*  272 */       if (othArray == null)
/*      */       {
/*      */         
/*  275 */         return list;
/*      */       }
/*      */       
/*  278 */       for (RSAOtherPrimeInfo oth : othArray)
/*      */       {
/*  280 */         list.add(new OtherPrimesInfo(oth));
/*      */       }
/*      */       
/*  283 */       return list;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class Builder
/*      */   {
/*      */     private final Base64URL n;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final Base64URL e;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL d;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL p;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL q;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL dp;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL dq;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL qi;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private List<RSAKey.OtherPrimesInfo> oth;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private PrivateKey priv;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private KeyUse use;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Set<KeyOperation> ops;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Algorithm alg;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private String kid;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private URI x5u;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     private Base64URL x5t;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL x5t256;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private List<Base64> x5c;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private KeyStore ks;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder(Base64URL n, Base64URL e) {
/*  450 */       if (n == null) {
/*  451 */         throw new IllegalArgumentException("The modulus value must not be null");
/*      */       }
/*      */       
/*  454 */       this.n = n;
/*      */ 
/*      */       
/*  457 */       if (e == null) {
/*  458 */         throw new IllegalArgumentException("The public exponent value must not be null");
/*      */       }
/*      */       
/*  461 */       this.e = e;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder(RSAPublicKey pub) {
/*  473 */       this.n = Base64URL.encode(pub.getModulus());
/*  474 */       this.e = Base64URL.encode(pub.getPublicExponent());
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder(RSAKey rsaJWK) {
/*  486 */       this.n = rsaJWK.n;
/*  487 */       this.e = rsaJWK.e;
/*  488 */       this.d = rsaJWK.d;
/*  489 */       this.p = rsaJWK.p;
/*  490 */       this.q = rsaJWK.q;
/*  491 */       this.dp = rsaJWK.dp;
/*  492 */       this.dq = rsaJWK.dq;
/*  493 */       this.qi = rsaJWK.qi;
/*  494 */       this.oth = rsaJWK.oth;
/*  495 */       this.priv = rsaJWK.privateKey;
/*  496 */       this.use = rsaJWK.getKeyUse();
/*  497 */       this.ops = rsaJWK.getKeyOperations();
/*  498 */       this.alg = rsaJWK.getAlgorithm();
/*  499 */       this.kid = rsaJWK.getKeyID();
/*  500 */       this.x5u = rsaJWK.getX509CertURL();
/*  501 */       this.x5t = rsaJWK.getX509CertThumbprint();
/*  502 */       this.x5t256 = rsaJWK.getX509CertSHA256Thumbprint();
/*  503 */       this.x5c = rsaJWK.getX509CertChain();
/*  504 */       this.ks = rsaJWK.getKeyStore();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder privateExponent(Base64URL d) {
/*  521 */       this.d = d;
/*  522 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder privateKey(RSAPrivateKey priv) {
/*  536 */       if (priv instanceof RSAPrivateCrtKey)
/*  537 */         return privateKey((RSAPrivateCrtKey)priv); 
/*  538 */       if (priv instanceof RSAMultiPrimePrivateCrtKey) {
/*  539 */         return privateKey((RSAMultiPrimePrivateCrtKey)priv);
/*      */       }
/*  541 */       this.d = Base64URL.encode(priv.getPrivateExponent());
/*  542 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder privateKey(PrivateKey priv) {
/*  558 */       if (priv instanceof RSAPrivateKey) {
/*  559 */         return privateKey((RSAPrivateKey)priv);
/*      */       }
/*      */       
/*  562 */       if (!"RSA".equalsIgnoreCase(priv.getAlgorithm())) {
/*  563 */         throw new IllegalArgumentException("The private key algorithm must be RSA");
/*      */       }
/*      */       
/*  566 */       this.priv = priv;
/*  567 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder firstPrimeFactor(Base64URL p) {
/*  585 */       this.p = p;
/*  586 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder secondPrimeFactor(Base64URL q) {
/*  604 */       this.q = q;
/*  605 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder firstFactorCRTExponent(Base64URL dp) {
/*  623 */       this.dp = dp;
/*  624 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder secondFactorCRTExponent(Base64URL dq) {
/*  642 */       this.dq = dq;
/*  643 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder firstCRTCoefficient(Base64URL qi) {
/*  661 */       this.qi = qi;
/*  662 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder otherPrimes(List<RSAKey.OtherPrimesInfo> oth) {
/*  677 */       this.oth = oth;
/*  678 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder privateKey(RSAPrivateCrtKey priv) {
/*  698 */       this.d = Base64URL.encode(priv.getPrivateExponent());
/*  699 */       this.p = Base64URL.encode(priv.getPrimeP());
/*  700 */       this.q = Base64URL.encode(priv.getPrimeQ());
/*  701 */       this.dp = Base64URL.encode(priv.getPrimeExponentP());
/*  702 */       this.dq = Base64URL.encode(priv.getPrimeExponentQ());
/*  703 */       this.qi = Base64URL.encode(priv.getCrtCoefficient());
/*      */       
/*  705 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder privateKey(RSAMultiPrimePrivateCrtKey priv) {
/*  726 */       this.d = Base64URL.encode(priv.getPrivateExponent());
/*  727 */       this.p = Base64URL.encode(priv.getPrimeP());
/*  728 */       this.q = Base64URL.encode(priv.getPrimeQ());
/*  729 */       this.dp = Base64URL.encode(priv.getPrimeExponentP());
/*  730 */       this.dq = Base64URL.encode(priv.getPrimeExponentQ());
/*  731 */       this.qi = Base64URL.encode(priv.getCrtCoefficient());
/*  732 */       this.oth = RSAKey.OtherPrimesInfo.toList(priv.getOtherPrimeInfo());
/*      */       
/*  734 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder keyUse(KeyUse use) {
/*  749 */       this.use = use;
/*  750 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder keyOperations(Set<KeyOperation> ops) {
/*  765 */       this.ops = ops;
/*  766 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder algorithm(Algorithm alg) {
/*  780 */       this.alg = alg;
/*  781 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder keyID(String kid) {
/*  797 */       this.kid = kid;
/*  798 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder keyIDFromThumbprint() throws JOSEException {
/*  818 */       return keyIDFromThumbprint("SHA-256");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder keyIDFromThumbprint(String hashAlg) throws JOSEException {
/*  841 */       LinkedHashMap<String, Object> requiredParams = new LinkedHashMap<>();
/*  842 */       requiredParams.put("e", this.e.toString());
/*  843 */       requiredParams.put("kty", KeyType.RSA.getValue());
/*  844 */       requiredParams.put("n", this.n.toString());
/*  845 */       this.kid = ThumbprintUtils.compute(hashAlg, requiredParams).toString();
/*  846 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder x509CertURL(URI x5u) {
/*  860 */       this.x5u = x5u;
/*  861 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public Builder x509CertThumbprint(Base64URL x5t) {
/*  877 */       this.x5t = x5t;
/*  878 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder x509CertSHA256Thumbprint(Base64URL x5t256) {
/*  893 */       this.x5t256 = x5t256;
/*  894 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder x509CertChain(List<Base64> x5c) {
/*  908 */       this.x5c = x5c;
/*  909 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder keyStore(KeyStore keyStore) {
/*  923 */       this.ks = keyStore;
/*  924 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public RSAKey build() {
/*      */       try {
/*  940 */         return new RSAKey(this.n, this.e, this.d, this.p, this.q, this.dp, this.dq, this.qi, this.oth, this.priv, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.ks);
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  945 */       catch (IllegalArgumentException e) {
/*      */         
/*  947 */         throw new IllegalStateException(e.getMessage(), e);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RSAKey(Base64URL n, Base64URL e, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/* 1061 */     this(n, e, (Base64URL)null, (Base64URL)null, (Base64URL)null, (Base64URL)null, (Base64URL)null, (Base64URL)null, (List<OtherPrimesInfo>)null, (PrivateKey)null, use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RSAKey(Base64URL n, Base64URL e, Base64URL d, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/* 1105 */     this(n, e, d, (Base64URL)null, (Base64URL)null, (Base64URL)null, (Base64URL)null, (Base64URL)null, (List<OtherPrimesInfo>)null, (PrivateKey)null, use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*      */ 
/*      */     
/* 1108 */     if (d == null) {
/* 1109 */       throw new IllegalArgumentException("The private exponent must not be null");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RSAKey(Base64URL n, Base64URL e, Base64URL p, Base64URL q, Base64URL dp, Base64URL dq, Base64URL qi, List<OtherPrimesInfo> oth, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/* 1171 */     this(n, e, (Base64URL)null, p, q, dp, dq, qi, oth, (PrivateKey)null, use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*      */ 
/*      */ 
/*      */     
/* 1175 */     if (p == null) {
/* 1176 */       throw new IllegalArgumentException("The first prime factor must not be null");
/*      */     }
/*      */     
/* 1179 */     if (q == null) {
/* 1180 */       throw new IllegalArgumentException("The second prime factor must not be null");
/*      */     }
/*      */     
/* 1183 */     if (dp == null) {
/* 1184 */       throw new IllegalArgumentException("The first factor CRT exponent must not be null");
/*      */     }
/*      */     
/* 1187 */     if (dq == null) {
/* 1188 */       throw new IllegalArgumentException("The second factor CRT exponent must not be null");
/*      */     }
/*      */     
/* 1191 */     if (qi == null) {
/* 1192 */       throw new IllegalArgumentException("The first CRT coefficient must not be null");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public RSAKey(Base64URL n, Base64URL e, Base64URL d, Base64URL p, Base64URL q, Base64URL dp, Base64URL dq, Base64URL qi, List<OtherPrimesInfo> oth, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c) {
/* 1259 */     this(n, e, d, p, q, dp, dq, qi, oth, (PrivateKey)null, use, ops, alg, kid, x5u, x5t, x5t256, x5c, (KeyStore)null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RSAKey(Base64URL n, Base64URL e, Base64URL d, Base64URL p, Base64URL q, Base64URL dp, Base64URL dq, Base64URL qi, List<OtherPrimesInfo> oth, PrivateKey prv, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/* 1329 */     super(KeyType.RSA, use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1334 */     if (n == null) {
/* 1335 */       throw new IllegalArgumentException("The modulus value must not be null");
/*      */     }
/* 1337 */     this.n = n;
/*      */ 
/*      */     
/* 1340 */     if (e == null) {
/* 1341 */       throw new IllegalArgumentException("The public exponent value must not be null");
/*      */     }
/* 1343 */     this.e = e;
/*      */     
/* 1345 */     if (getParsedX509CertChain() != null && 
/* 1346 */       !matches(getParsedX509CertChain().get(0))) {
/* 1347 */       throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1352 */     this.d = d;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1357 */     if (p != null && q != null && dp != null && dq != null && qi != null) {
/*      */ 
/*      */       
/* 1360 */       this.p = p;
/* 1361 */       this.q = q;
/* 1362 */       this.dp = dp;
/* 1363 */       this.dq = dq;
/* 1364 */       this.qi = qi;
/*      */ 
/*      */       
/* 1367 */       if (oth != null) {
/* 1368 */         this.oth = Collections.unmodifiableList(oth);
/*      */       } else {
/* 1370 */         this.oth = Collections.emptyList();
/*      */       }
/*      */     
/* 1373 */     } else if (p == null && q == null && dp == null && dq == null && qi == null && oth == null) {
/*      */ 
/*      */       
/* 1376 */       this.p = null;
/* 1377 */       this.q = null;
/* 1378 */       this.dp = null;
/* 1379 */       this.dq = null;
/* 1380 */       this.qi = null;
/*      */       
/* 1382 */       this.oth = Collections.emptyList();
/*      */     } else {
/* 1384 */       if (p != null || q != null || dp != null || dq != null || qi != null) {
/*      */         
/* 1386 */         if (p == null)
/* 1387 */           throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first prime factor must not be null"); 
/* 1388 */         if (q == null)
/* 1389 */           throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second prime factor must not be null"); 
/* 1390 */         if (dp == null)
/* 1391 */           throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first factor CRT exponent must not be null"); 
/* 1392 */         if (dq == null) {
/* 1393 */           throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
/*      */         }
/* 1395 */         throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
/*      */       } 
/*      */ 
/*      */       
/* 1399 */       this.p = null;
/* 1400 */       this.q = null;
/* 1401 */       this.dp = null;
/* 1402 */       this.dq = null;
/* 1403 */       this.qi = null;
/* 1404 */       this.oth = Collections.emptyList();
/*      */     } 
/*      */     
/* 1407 */     this.privateKey = prv;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RSAKey(RSAPublicKey pub, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/* 1439 */     this(Base64URL.encode(pub.getModulus()), 
/* 1440 */         Base64URL.encode(pub.getPublicExponent()), use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RSAKey(RSAPublicKey pub, RSAPrivateKey priv, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/* 1478 */     this(Base64URL.encode(pub.getModulus()), 
/* 1479 */         Base64URL.encode(pub.getPublicExponent()), 
/* 1480 */         Base64URL.encode(priv.getPrivateExponent()), use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RSAKey(RSAPublicKey pub, RSAPrivateCrtKey priv, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/* 1518 */     this(Base64URL.encode(pub.getModulus()), 
/* 1519 */         Base64URL.encode(pub.getPublicExponent()), 
/* 1520 */         Base64URL.encode(priv.getPrivateExponent()), 
/* 1521 */         Base64URL.encode(priv.getPrimeP()), 
/* 1522 */         Base64URL.encode(priv.getPrimeQ()), 
/* 1523 */         Base64URL.encode(priv.getPrimeExponentP()), 
/* 1524 */         Base64URL.encode(priv.getPrimeExponentQ()), 
/* 1525 */         Base64URL.encode(priv.getCrtCoefficient()), (List<OtherPrimesInfo>)null, (PrivateKey)null, use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RSAKey(RSAPublicKey pub, RSAMultiPrimePrivateCrtKey priv, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/* 1566 */     this(Base64URL.encode(pub.getModulus()), 
/* 1567 */         Base64URL.encode(pub.getPublicExponent()), 
/* 1568 */         Base64URL.encode(priv.getPrivateExponent()), 
/* 1569 */         Base64URL.encode(priv.getPrimeP()), 
/* 1570 */         Base64URL.encode(priv.getPrimeQ()), 
/* 1571 */         Base64URL.encode(priv.getPrimeExponentP()), 
/* 1572 */         Base64URL.encode(priv.getPrimeExponentQ()), 
/* 1573 */         Base64URL.encode(priv.getCrtCoefficient()), 
/* 1574 */         OtherPrimesInfo.toList(priv.getOtherPrimeInfo()), (PrivateKey)null, use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RSAKey(RSAPublicKey pub, PrivateKey priv, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/* 1613 */     this(Base64URL.encode(pub.getModulus()), 
/* 1614 */         Base64URL.encode(pub.getPublicExponent()), (Base64URL)null, (Base64URL)null, (Base64URL)null, (Base64URL)null, (Base64URL)null, (Base64URL)null, (List<OtherPrimesInfo>)null, priv, use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Base64URL getModulus() {
/* 1637 */     return this.n;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Base64URL getPublicExponent() {
/* 1649 */     return this.e;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Base64URL getPrivateExponent() {
/* 1663 */     return this.d;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Base64URL getFirstPrimeFactor() {
/* 1677 */     return this.p;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Base64URL getSecondPrimeFactor() {
/* 1691 */     return this.q;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Base64URL getFirstFactorCRTExponent() {
/* 1706 */     return this.dp;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Base64URL getSecondFactorCRTExponent() {
/* 1721 */     return this.dq;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Base64URL getFirstCRTCoefficient() {
/* 1736 */     return this.qi;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public List<OtherPrimesInfo> getOtherPrimes() {
/* 1749 */     return this.oth;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RSAPublicKey toRSAPublicKey() throws JOSEException {
/* 1766 */     BigInteger modulus = this.n.decodeToBigInteger();
/* 1767 */     BigInteger exponent = this.e.decodeToBigInteger();
/*      */     
/* 1769 */     RSAPublicKeySpec spec = new RSAPublicKeySpec(modulus, exponent);
/*      */     
/*      */     try {
/* 1772 */       KeyFactory factory = KeyFactory.getInstance("RSA");
/*      */       
/* 1774 */       return (RSAPublicKey)factory.generatePublic(spec);
/*      */     }
/* 1776 */     catch (NoSuchAlgorithmException|InvalidKeySpecException e) {
/*      */       
/* 1778 */       throw new JOSEException(e.getMessage(), e);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RSAPrivateKey toRSAPrivateKey() throws JOSEException {
/*      */     RSAPrivateKeySpec spec;
/* 1797 */     if (this.d == null)
/*      */     {
/* 1799 */       return null;
/*      */     }
/*      */     
/* 1802 */     BigInteger modulus = this.n.decodeToBigInteger();
/* 1803 */     BigInteger privateExponent = this.d.decodeToBigInteger();
/*      */ 
/*      */ 
/*      */     
/* 1807 */     if (this.p == null) {
/*      */       
/* 1809 */       spec = new RSAPrivateKeySpec(modulus, privateExponent);
/*      */     }
/*      */     else {
/*      */       
/* 1813 */       BigInteger publicExponent = this.e.decodeToBigInteger();
/* 1814 */       BigInteger primeP = this.p.decodeToBigInteger();
/* 1815 */       BigInteger primeQ = this.q.decodeToBigInteger();
/* 1816 */       BigInteger primeExponentP = this.dp.decodeToBigInteger();
/* 1817 */       BigInteger primeExponentQ = this.dq.decodeToBigInteger();
/* 1818 */       BigInteger crtCoefficient = this.qi.decodeToBigInteger();
/*      */       
/* 1820 */       if (this.oth != null && !this.oth.isEmpty()) {
/*      */         
/* 1822 */         RSAOtherPrimeInfo[] otherInfo = new RSAOtherPrimeInfo[this.oth.size()];
/*      */         
/* 1824 */         for (int i = 0; i < this.oth.size(); i++) {
/*      */           
/* 1826 */           OtherPrimesInfo opi = this.oth.get(i);
/*      */           
/* 1828 */           BigInteger otherPrime = opi.getPrimeFactor().decodeToBigInteger();
/* 1829 */           BigInteger otherPrimeExponent = opi.getFactorCRTExponent().decodeToBigInteger();
/* 1830 */           BigInteger otherCrtCoefficient = opi.getFactorCRTCoefficient().decodeToBigInteger();
/*      */           
/* 1832 */           otherInfo[i] = new RSAOtherPrimeInfo(otherPrime, otherPrimeExponent, otherCrtCoefficient);
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1837 */         spec = new RSAMultiPrimePrivateCrtKeySpec(modulus, publicExponent, privateExponent, primeP, primeQ, primeExponentP, primeExponentQ, crtCoefficient, otherInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1848 */         spec = new RSAPrivateCrtKeySpec(modulus, publicExponent, privateExponent, primeP, primeQ, primeExponentP, primeExponentQ, crtCoefficient);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1860 */       KeyFactory factory = KeyFactory.getInstance("RSA");
/*      */       
/* 1862 */       return (RSAPrivateKey)factory.generatePrivate(spec);
/*      */     }
/* 1864 */     catch (InvalidKeySpecException|NoSuchAlgorithmException e) {
/*      */       
/* 1866 */       throw new JOSEException(e.getMessage(), e);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PublicKey toPublicKey() throws JOSEException {
/* 1875 */     return toRSAPublicKey();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PrivateKey toPrivateKey() throws JOSEException {
/* 1883 */     PrivateKey prv = toRSAPrivateKey();
/*      */     
/* 1885 */     if (prv != null)
/*      */     {
/* 1887 */       return prv;
/*      */     }
/*      */ 
/*      */     
/* 1891 */     return this.privateKey;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public KeyPair toKeyPair() throws JOSEException {
/* 1911 */     return new KeyPair(toRSAPublicKey(), toPrivateKey());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean matches(X509Certificate cert) {
/*      */     RSAPublicKey certRSAKey;
/*      */     try {
/* 1920 */       certRSAKey = (RSAPublicKey)((X509Certificate)getParsedX509CertChain().get(0)).getPublicKey();
/* 1921 */     } catch (ClassCastException ex) {
/* 1922 */       return false;
/*      */     } 
/* 1924 */     if (!this.e.decodeToBigInteger().equals(certRSAKey.getPublicExponent())) {
/* 1925 */       return false;
/*      */     }
/* 1927 */     return this.n.decodeToBigInteger().equals(certRSAKey.getModulus());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LinkedHashMap<String, ?> getRequiredParams() {
/* 1935 */     LinkedHashMap<String, String> requiredParams = new LinkedHashMap<>();
/* 1936 */     requiredParams.put("e", this.e.toString());
/* 1937 */     requiredParams.put("kty", getKeyType().getValue());
/* 1938 */     requiredParams.put("n", this.n.toString());
/* 1939 */     return requiredParams;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isPrivate() {
/* 1947 */     return (this.d != null || this.p != null || this.privateKey != null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int size() {
/*      */     try {
/* 1955 */       return ByteUtils.safeBitLength(this.n.decode());
/* 1956 */     } catch (IntegerOverflowException e) {
/* 1957 */       throw new ArithmeticException(e.getMessage());
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RSAKey toPublicJWK() {
/* 1970 */     return new RSAKey(
/* 1971 */         getModulus(), getPublicExponent(), 
/* 1972 */         getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), 
/* 1973 */         getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), 
/* 1974 */         getKeyStore());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Map<String, Object> toJSONObject() {
/* 1981 */     Map<String, Object> o = super.toJSONObject();
/*      */ 
/*      */     
/* 1984 */     o.put("n", this.n.toString());
/* 1985 */     o.put("e", this.e.toString());
/* 1986 */     if (this.d != null) {
/* 1987 */       o.put("d", this.d.toString());
/*      */     }
/* 1989 */     if (this.p != null) {
/* 1990 */       o.put("p", this.p.toString());
/*      */     }
/* 1992 */     if (this.q != null) {
/* 1993 */       o.put("q", this.q.toString());
/*      */     }
/* 1995 */     if (this.dp != null) {
/* 1996 */       o.put("dp", this.dp.toString());
/*      */     }
/* 1998 */     if (this.dq != null) {
/* 1999 */       o.put("dq", this.dq.toString());
/*      */     }
/* 2001 */     if (this.qi != null) {
/* 2002 */       o.put("qi", this.qi.toString());
/*      */     }
/* 2004 */     if (this.oth != null && !this.oth.isEmpty()) {
/*      */       
/* 2006 */       List<Object> a = JSONArrayUtils.newJSONArray();
/*      */       
/* 2008 */       for (OtherPrimesInfo other : this.oth) {
/*      */         
/* 2010 */         Map<String, Object> oo = JSONObjectUtils.newJSONObject();
/* 2011 */         oo.put("r", other.r.toString());
/* 2012 */         oo.put("d", other.d.toString());
/* 2013 */         oo.put("t", other.t.toString());
/*      */         
/* 2015 */         a.add(oo);
/*      */       } 
/*      */       
/* 2018 */       o.put("oth", a);
/*      */     } 
/*      */     
/* 2021 */     return o;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static RSAKey parse(String s) throws ParseException {
/* 2039 */     return parse(JSONObjectUtils.parse(s));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static RSAKey parse(Map<String, Object> jsonObject) throws ParseException {
/* 2059 */     if (!KeyType.RSA.equals(JWKMetadata.parseKeyType(jsonObject))) {
/* 2060 */       throw new ParseException("The key type \"kty\" must be RSA", 0);
/*      */     }
/*      */ 
/*      */     
/* 2064 */     Base64URL n = JSONObjectUtils.getBase64URL(jsonObject, "n");
/* 2065 */     Base64URL e = JSONObjectUtils.getBase64URL(jsonObject, "e");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2070 */     Base64URL d = JSONObjectUtils.getBase64URL(jsonObject, "d");
/*      */ 
/*      */     
/* 2073 */     Base64URL p = JSONObjectUtils.getBase64URL(jsonObject, "p");
/* 2074 */     Base64URL q = JSONObjectUtils.getBase64URL(jsonObject, "q");
/* 2075 */     Base64URL dp = JSONObjectUtils.getBase64URL(jsonObject, "dp");
/* 2076 */     Base64URL dq = JSONObjectUtils.getBase64URL(jsonObject, "dq");
/* 2077 */     Base64URL qi = JSONObjectUtils.getBase64URL(jsonObject, "qi");
/*      */     
/* 2079 */     List<OtherPrimesInfo> oth = null;
/* 2080 */     if (jsonObject.containsKey("oth")) {
/*      */       
/* 2082 */       List<Object> arr = JSONObjectUtils.getJSONArray(jsonObject, "oth");
/* 2083 */       if (arr != null) {
/* 2084 */         oth = new ArrayList<>(arr.size());
/*      */         
/* 2086 */         for (Object o : arr) {
/*      */           
/* 2088 */           if (o instanceof Map) {
/* 2089 */             Map<String, Object> otherJson = (Map<String, Object>)o;
/*      */             
/* 2091 */             Base64URL r = JSONObjectUtils.getBase64URL(otherJson, "r");
/* 2092 */             Base64URL odq = JSONObjectUtils.getBase64URL(otherJson, "dq");
/* 2093 */             Base64URL t = JSONObjectUtils.getBase64URL(otherJson, "t");
/*      */             try {
/* 2095 */               oth.add(new OtherPrimesInfo(r, odq, t));
/* 2096 */             } catch (IllegalArgumentException iae) {
/* 2097 */               throw new ParseException(iae.getMessage(), 0);
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*      */     try {
/* 2105 */       return new RSAKey(n, e, d, p, q, dp, dq, qi, oth, null, 
/* 2106 */           JWKMetadata.parseKeyUse(jsonObject), 
/* 2107 */           JWKMetadata.parseKeyOperations(jsonObject), 
/* 2108 */           JWKMetadata.parseAlgorithm(jsonObject), 
/* 2109 */           JWKMetadata.parseKeyID(jsonObject), 
/* 2110 */           JWKMetadata.parseX509CertURL(jsonObject), 
/* 2111 */           JWKMetadata.parseX509CertThumbprint(jsonObject), 
/* 2112 */           JWKMetadata.parseX509CertSHA256Thumbprint(jsonObject), 
/* 2113 */           JWKMetadata.parseX509CertChain(jsonObject), null);
/*      */     
/*      */     }
/* 2116 */     catch (IllegalArgumentException ex) {
/*      */ 
/*      */       
/* 2119 */       throw new ParseException(ex.getMessage(), 0);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static RSAKey parse(X509Certificate cert) throws JOSEException {
/* 2148 */     if (!(cert.getPublicKey() instanceof RSAPublicKey)) {
/* 2149 */       throw new JOSEException("The public key of the X.509 certificate is not RSA");
/*      */     }
/*      */     
/* 2152 */     RSAPublicKey publicKey = (RSAPublicKey)cert.getPublicKey();
/*      */     
/*      */     try {
/* 2155 */       MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
/*      */       
/* 2157 */       return (new Builder(publicKey))
/* 2158 */         .keyUse(KeyUse.from(cert))
/* 2159 */         .keyID(cert.getSerialNumber().toString(10))
/* 2160 */         .x509CertChain(Collections.singletonList(Base64.encode(cert.getEncoded())))
/* 2161 */         .x509CertSHA256Thumbprint(Base64URL.encode(sha256.digest(cert.getEncoded())))
/* 2162 */         .build();
/* 2163 */     } catch (NoSuchAlgorithmException e) {
/* 2164 */       throw new JOSEException("Couldn't encode x5t parameter: " + e.getMessage(), e);
/* 2165 */     } catch (CertificateEncodingException e) {
/* 2166 */       throw new JOSEException("Couldn't encode x5c parameter: " + e.getMessage(), e);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static RSAKey load(KeyStore keyStore, String alias, char[] pin) throws KeyStoreException, JOSEException {
/*      */     Key key;
/* 2193 */     Certificate cert = keyStore.getCertificate(alias);
/*      */     
/* 2195 */     if (!(cert instanceof X509Certificate)) {
/* 2196 */       return null;
/*      */     }
/*      */     
/* 2199 */     X509Certificate x509Cert = (X509Certificate)cert;
/*      */     
/* 2201 */     if (!(x509Cert.getPublicKey() instanceof RSAPublicKey)) {
/* 2202 */       throw new JOSEException("Couldn't load RSA JWK: The key algorithm is not RSA");
/*      */     }
/*      */     
/* 2205 */     RSAKey rsaJWK = parse(x509Cert);
/*      */ 
/*      */     
/* 2208 */     rsaJWK = (new Builder(rsaJWK)).keyID(alias).keyStore(keyStore).build();
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 2213 */       key = keyStore.getKey(alias, pin);
/* 2214 */     } catch (UnrecoverableKeyException|NoSuchAlgorithmException e) {
/* 2215 */       throw new JOSEException("Couldn't retrieve private RSA key (bad pin?): " + e.getMessage(), e);
/*      */     } 
/*      */     
/* 2218 */     if (key instanceof RSAPrivateKey)
/*      */     {
/* 2220 */       return (new Builder(rsaJWK))
/* 2221 */         .privateKey((RSAPrivateKey)key)
/* 2222 */         .build(); } 
/* 2223 */     if (key instanceof PrivateKey && "RSA".equalsIgnoreCase(key.getAlgorithm()))
/*      */     {
/* 2225 */       return (new Builder(rsaJWK))
/* 2226 */         .privateKey((PrivateKey)key)
/* 2227 */         .build();
/*      */     }
/* 2229 */     return rsaJWK;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean equals(Object o) {
/* 2236 */     if (this == o) return true; 
/* 2237 */     if (!(o instanceof RSAKey)) return false; 
/* 2238 */     if (!super.equals(o)) return false; 
/* 2239 */     RSAKey rsaKey = (RSAKey)o;
/* 2240 */     return (Objects.equals(this.n, rsaKey.n) && 
/* 2241 */       Objects.equals(this.e, rsaKey.e) && 
/* 2242 */       Objects.equals(this.d, rsaKey.d) && 
/* 2243 */       Objects.equals(this.p, rsaKey.p) && 
/* 2244 */       Objects.equals(this.q, rsaKey.q) && 
/* 2245 */       Objects.equals(this.dp, rsaKey.dp) && 
/* 2246 */       Objects.equals(this.dq, rsaKey.dq) && 
/* 2247 */       Objects.equals(this.qi, rsaKey.qi) && 
/* 2248 */       Objects.equals(this.oth, rsaKey.oth) && 
/* 2249 */       Objects.equals(this.privateKey, rsaKey.privateKey));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int hashCode() {
/* 2255 */     return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.n, this.e, this.d, this.p, this.q, this.dp, this.dq, this.qi, this.oth, this.privateKey });
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\RSAKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */