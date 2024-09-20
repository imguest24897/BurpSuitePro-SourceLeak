/*     */ package com.nimbusds.jose.jwk;
/*     */ 
/*     */ import com.nimbusds.jose.Algorithm;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.util.Base64;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.JSONArrayUtils;
/*     */ import com.nimbusds.jose.util.JSONObjectUtils;
/*     */ import com.nimbusds.jose.util.X509CertChainUtils;
/*     */ import com.nimbusds.jose.util.X509CertUtils;
/*     */ import java.io.Serializable;
/*     */ import java.net.URI;
/*     */ import java.security.KeyPair;
/*     */ import java.security.KeyStore;
/*     */ import java.security.KeyStoreException;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.PublicKey;
/*     */ import java.security.cert.Certificate;
/*     */ import java.security.cert.X509Certificate;
/*     */ import java.security.interfaces.ECPrivateKey;
/*     */ import java.security.interfaces.ECPublicKey;
/*     */ import java.security.interfaces.RSAPrivateKey;
/*     */ import java.security.interfaces.RSAPublicKey;
/*     */ import java.security.spec.ECParameterSpec;
/*     */ import java.text.ParseException;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class JWK
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   public static final String MIME_TYPE = "application/jwk+json; charset=UTF-8";
/*     */   private final KeyType kty;
/*     */   private final KeyUse use;
/*     */   private final Set<KeyOperation> ops;
/*     */   private final Algorithm alg;
/*     */   private final String kid;
/*     */   private final URI x5u;
/*     */   @Deprecated
/*     */   private final Base64URL x5t;
/*     */   private final Base64URL x5t256;
/*     */   private final List<Base64> x5c;
/*     */   private final List<X509Certificate> parsedX5c;
/*     */   private final KeyStore keyStore;
/*     */   
/*     */   protected JWK(KeyType kty, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/* 187 */     if (kty == null) {
/* 188 */       throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
/*     */     }
/*     */     
/* 191 */     this.kty = kty;
/*     */     
/* 193 */     if (!KeyUseAndOpsConsistency.areConsistent(use, ops)) {
/* 194 */       throw new IllegalArgumentException("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
/*     */     }
/*     */ 
/*     */     
/* 198 */     this.use = use;
/* 199 */     this.ops = ops;
/*     */     
/* 201 */     this.alg = alg;
/* 202 */     this.kid = kid;
/*     */     
/* 204 */     this.x5u = x5u;
/* 205 */     this.x5t = x5t;
/* 206 */     this.x5t256 = x5t256;
/*     */     
/* 208 */     if (x5c != null && x5c.isEmpty()) {
/* 209 */       throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
/*     */     }
/* 211 */     this.x5c = x5c;
/*     */     
/*     */     try {
/* 214 */       this.parsedX5c = X509CertChainUtils.parse(x5c);
/* 215 */     } catch (ParseException e) {
/* 216 */       throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e.getMessage(), e);
/*     */     } 
/*     */     
/* 219 */     this.keyStore = ks;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public KeyType getKeyType() {
/* 230 */     return this.kty;
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
/*     */   public KeyUse getKeyUse() {
/* 242 */     return this.use;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<KeyOperation> getKeyOperations() {
/* 253 */     return this.ops;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Algorithm getAlgorithm() {
/* 264 */     return this.alg;
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
/*     */   public String getKeyID() {
/* 278 */     return this.kid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public URI getX509CertURL() {
/* 289 */     return this.x5u;
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
/*     */   @Deprecated
/*     */   public Base64URL getX509CertThumbprint() {
/* 303 */     return this.x5t;
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
/*     */   public Base64URL getX509CertSHA256Thumbprint() {
/* 316 */     return this.x5t256;
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
/*     */   public List<Base64> getX509CertChain() {
/* 328 */     if (this.x5c == null) {
/* 329 */       return null;
/*     */     }
/*     */     
/* 332 */     return Collections.unmodifiableList(this.x5c);
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
/*     */   public List<X509Certificate> getParsedX509CertChain() {
/* 344 */     if (this.parsedX5c == null) {
/* 345 */       return null;
/*     */     }
/*     */     
/* 348 */     return Collections.unmodifiableList(this.parsedX5c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public KeyStore getKeyStore() {
/* 359 */     return this.keyStore;
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
/*     */   public abstract LinkedHashMap<String, ?> getRequiredParams();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Base64URL computeThumbprint() throws JOSEException {
/* 385 */     return computeThumbprint("SHA-256");
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
/*     */   public Base64URL computeThumbprint(String hashAlg) throws JOSEException {
/* 403 */     return ThumbprintUtils.compute(hashAlg, this);
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
/*     */   public ThumbprintURI computeThumbprintURI() throws JOSEException {
/* 419 */     return new ThumbprintURI("sha-256", computeThumbprint("SHA-256"));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract boolean isPrivate();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract JWK toPublicJWK();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract int size();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RSAKey toRSAKey() {
/* 457 */     return (RSAKey)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ECKey toECKey() {
/* 467 */     return (ECKey)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OctetSequenceKey toOctetSequenceKey() {
/* 477 */     return (OctetSequenceKey)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OctetKeyPair toOctetKeyPair() {
/* 487 */     return (OctetKeyPair)this;
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
/*     */   public Map<String, Object> toJSONObject() {
/* 509 */     Map<String, Object> o = JSONObjectUtils.newJSONObject();
/*     */     
/* 511 */     o.put("kty", this.kty.getValue());
/*     */     
/* 513 */     if (this.use != null) {
/* 514 */       o.put("use", this.use.identifier());
/*     */     }
/*     */     
/* 517 */     if (this.ops != null) {
/* 518 */       List<Object> stringValues = JSONArrayUtils.newJSONArray();
/* 519 */       for (KeyOperation op : this.ops) {
/* 520 */         stringValues.add(op.identifier());
/*     */       }
/* 522 */       o.put("key_ops", stringValues);
/*     */     } 
/*     */     
/* 525 */     if (this.alg != null) {
/* 526 */       o.put("alg", this.alg.getName());
/*     */     }
/*     */     
/* 529 */     if (this.kid != null) {
/* 530 */       o.put("kid", this.kid);
/*     */     }
/*     */     
/* 533 */     if (this.x5u != null) {
/* 534 */       o.put("x5u", this.x5u.toString());
/*     */     }
/*     */     
/* 537 */     if (this.x5t != null) {
/* 538 */       o.put("x5t", this.x5t.toString());
/*     */     }
/*     */     
/* 541 */     if (this.x5t256 != null) {
/* 542 */       o.put("x5t#S256", this.x5t256.toString());
/*     */     }
/*     */     
/* 545 */     if (this.x5c != null) {
/* 546 */       List<Object> stringValues = JSONArrayUtils.newJSONArray();
/* 547 */       for (Base64 base64 : this.x5c) {
/* 548 */         stringValues.add(base64.toString());
/*     */       }
/* 550 */       o.put("x5c", stringValues);
/*     */     } 
/*     */     
/* 553 */     return o;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toJSONString() {
/* 563 */     return JSONObjectUtils.toJSONString(toJSONObject());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 573 */     return JSONObjectUtils.toJSONString(toJSONObject());
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
/*     */   public static JWK parse(String s) throws ParseException {
/* 592 */     return parse(JSONObjectUtils.parse(s));
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
/*     */   public static JWK parse(Map<String, Object> jsonObject) throws ParseException {
/* 612 */     String ktyString = JSONObjectUtils.getString(jsonObject, "kty");
/*     */     
/* 614 */     if (ktyString == null) {
/* 615 */       throw new ParseException("Missing key type \"kty\" parameter", 0);
/*     */     }
/*     */     
/* 618 */     KeyType kty = KeyType.parse(ktyString);
/*     */     
/* 620 */     if (kty == KeyType.EC)
/*     */     {
/* 622 */       return ECKey.parse(jsonObject);
/*     */     }
/* 624 */     if (kty == KeyType.RSA)
/*     */     {
/* 626 */       return RSAKey.parse(jsonObject);
/*     */     }
/* 628 */     if (kty == KeyType.OCT)
/*     */     {
/* 630 */       return OctetSequenceKey.parse(jsonObject);
/*     */     }
/* 632 */     if (kty == KeyType.OKP)
/*     */     {
/* 634 */       return OctetKeyPair.parse(jsonObject);
/*     */     }
/*     */ 
/*     */     
/* 638 */     throw new ParseException("Unsupported key type \"kty\" parameter: " + kty, 0);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static JWK parse(X509Certificate cert) throws JOSEException {
/* 670 */     if (cert.getPublicKey() instanceof RSAPublicKey)
/* 671 */       return RSAKey.parse(cert); 
/* 672 */     if (cert.getPublicKey() instanceof ECPublicKey) {
/* 673 */       return ECKey.parse(cert);
/*     */     }
/* 675 */     throw new JOSEException("Unsupported public key algorithm: " + cert.getPublicKey().getAlgorithm());
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static JWK parseFromPEMEncodedX509Cert(String pemEncodedCert) throws JOSEException {
/* 708 */     X509Certificate cert = X509CertUtils.parse(pemEncodedCert);
/*     */     
/* 710 */     if (cert == null) {
/* 711 */       throw new JOSEException("Couldn't parse PEM-encoded X.509 certificate");
/*     */     }
/*     */     
/* 714 */     return parse(cert);
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
/*     */   public static JWK load(KeyStore keyStore, String alias, char[] pin) throws KeyStoreException, JOSEException {
/* 741 */     Certificate cert = keyStore.getCertificate(alias);
/*     */     
/* 743 */     if (cert == null)
/*     */     {
/* 745 */       return OctetSequenceKey.load(keyStore, alias, pin);
/*     */     }
/*     */     
/* 748 */     if (cert.getPublicKey() instanceof RSAPublicKey)
/* 749 */       return RSAKey.load(keyStore, alias, pin); 
/* 750 */     if (cert.getPublicKey() instanceof ECPublicKey) {
/* 751 */       return ECKey.load(keyStore, alias, pin);
/*     */     }
/* 753 */     throw new JOSEException("Unsupported public key algorithm: " + cert.getPublicKey().getAlgorithm());
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
/*     */   public static JWK parseFromPEMEncodedObjects(String pemEncodedObjects) throws JOSEException {
/* 781 */     List<KeyPair> keys = PEMEncodedKeyParser.parseKeys(pemEncodedObjects);
/* 782 */     if (keys.isEmpty()) {
/* 783 */       throw new JOSEException("No PEM-encoded keys found");
/*     */     }
/*     */     
/* 786 */     KeyPair pair = mergeKeyPairs(keys);
/*     */     
/* 788 */     PublicKey publicKey = pair.getPublic();
/* 789 */     PrivateKey privateKey = pair.getPrivate();
/*     */     
/* 791 */     if (publicKey == null)
/*     */     {
/* 793 */       throw new JOSEException("Missing PEM-encoded public key to construct JWK");
/*     */     }
/*     */     
/* 796 */     if (publicKey instanceof ECPublicKey) {
/* 797 */       ECPublicKey ecPubKey = (ECPublicKey)publicKey;
/* 798 */       ECParameterSpec pubParams = ecPubKey.getParams();
/*     */       
/* 800 */       if (privateKey instanceof ECPrivateKey) {
/* 801 */         validateEcCurves(ecPubKey, (ECPrivateKey)privateKey);
/*     */       }
/* 803 */       if (privateKey != null && !(privateKey instanceof ECPrivateKey)) {
/* 804 */         throw new JOSEException("Unsupported " + KeyType.EC.getValue() + " private key type: " + privateKey);
/*     */       }
/*     */       
/* 807 */       Curve curve = Curve.forECParameterSpec(pubParams);
/* 808 */       ECKey.Builder builder = new ECKey.Builder(curve, (ECPublicKey)publicKey);
/*     */       
/* 810 */       if (privateKey != null) {
/* 811 */         builder.privateKey((ECPrivateKey)privateKey);
/*     */       }
/* 813 */       return builder.build();
/*     */     } 
/*     */     
/* 816 */     if (publicKey instanceof RSAPublicKey) {
/* 817 */       RSAKey.Builder builder = new RSAKey.Builder((RSAPublicKey)publicKey);
/* 818 */       if (privateKey instanceof RSAPrivateKey) {
/* 819 */         builder.privateKey((RSAPrivateKey)privateKey);
/* 820 */       } else if (privateKey != null) {
/* 821 */         throw new JOSEException("Unsupported " + KeyType.RSA.getValue() + " private key type: " + privateKey);
/*     */       } 
/* 823 */       return builder.build();
/*     */     } 
/*     */     
/* 826 */     throw new JOSEException("Unsupported algorithm of PEM-encoded key: " + publicKey.getAlgorithm());
/*     */   }
/*     */ 
/*     */   
/*     */   private static void validateEcCurves(ECPublicKey publicKey, ECPrivateKey privateKey) throws JOSEException {
/* 831 */     ECParameterSpec pubParams = publicKey.getParams();
/* 832 */     ECParameterSpec privParams = privateKey.getParams();
/* 833 */     if (!pubParams.getCurve().equals(privParams.getCurve())) {
/* 834 */       throw new JOSEException("Public/private " + KeyType.EC.getValue() + " key curve mismatch: " + publicKey);
/*     */     }
/* 836 */     if (pubParams.getCofactor() != privParams.getCofactor()) {
/* 837 */       throw new JOSEException("Public/private " + KeyType.EC.getValue() + " key cofactor mismatch: " + publicKey);
/*     */     }
/* 839 */     if (!pubParams.getGenerator().equals(privParams.getGenerator())) {
/* 840 */       throw new JOSEException("Public/private " + KeyType.EC.getValue() + " key generator mismatch: " + publicKey);
/*     */     }
/* 842 */     if (!pubParams.getOrder().equals(privParams.getOrder())) {
/* 843 */       throw new JOSEException("Public/private " + KeyType.EC.getValue() + " key order mismatch: " + publicKey);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static KeyPair mergeKeyPairs(List<KeyPair> keys) throws JOSEException {
/*     */     KeyPair pair;
/* 850 */     if (keys.size() == 1) {
/*     */ 
/*     */       
/* 853 */       pair = keys.get(0);
/* 854 */     } else if (keys.size() == 2) {
/*     */       
/* 856 */       pair = twoKeysToKeyPair(keys);
/*     */     } else {
/* 858 */       throw new JOSEException("Expected key or pair of PEM-encoded keys");
/*     */     } 
/* 860 */     return pair;
/*     */   }
/*     */ 
/*     */   
/*     */   private static KeyPair twoKeysToKeyPair(List<? extends KeyPair> keys) throws JOSEException {
/* 865 */     KeyPair key1 = keys.get(0);
/* 866 */     KeyPair key2 = keys.get(1);
/* 867 */     if (key1.getPublic() != null && key2.getPrivate() != null)
/* 868 */       return new KeyPair(key1.getPublic(), key2.getPrivate()); 
/* 869 */     if (key1.getPrivate() != null && key2.getPublic() != null) {
/* 870 */       return new KeyPair(key2.getPublic(), key1.getPrivate());
/*     */     }
/* 872 */     throw new JOSEException("Not a public/private key pair");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 879 */     if (this == o) return true; 
/* 880 */     if (!(o instanceof JWK)) return false; 
/* 881 */     JWK jwk = (JWK)o;
/* 882 */     return (Objects.equals(this.kty, jwk.kty) && 
/* 883 */       Objects.equals(this.use, jwk.use) && 
/* 884 */       Objects.equals(this.ops, jwk.ops) && 
/* 885 */       Objects.equals(this.alg, jwk.alg) && 
/* 886 */       Objects.equals(this.kid, jwk.kid) && 
/* 887 */       Objects.equals(this.x5u, jwk.x5u) && 
/* 888 */       Objects.equals(this.x5t, jwk.x5t) && 
/* 889 */       Objects.equals(this.x5t256, jwk.x5t256) && 
/* 890 */       Objects.equals(this.x5c, jwk.x5c) && 
/* 891 */       Objects.equals(this.keyStore, jwk.keyStore));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 897 */     return Objects.hash(new Object[] { this.kty, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.keyStore });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\JWK.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */