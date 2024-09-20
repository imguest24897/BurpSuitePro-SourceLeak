/*     */ package com.nimbusds.jose.jwk;
/*     */ 
/*     */ import com.nimbusds.jose.Algorithm;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.util.Base64;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.ByteUtils;
/*     */ import com.nimbusds.jose.util.IntegerOverflowException;
/*     */ import com.nimbusds.jose.util.JSONObjectUtils;
/*     */ import java.net.URI;
/*     */ import java.security.GeneralSecurityException;
/*     */ import java.security.Key;
/*     */ import java.security.KeyStore;
/*     */ import java.security.KeyStoreException;
/*     */ import java.security.UnrecoverableKeyException;
/*     */ import java.text.ParseException;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.spec.SecretKeySpec;
/*     */ import net.jcip.annotations.Immutable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Immutable
/*     */ public final class OctetSequenceKey
/*     */   extends JWK
/*     */   implements SecretJWK
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private final Base64URL k;
/*     */   
/*     */   public static class Builder
/*     */   {
/*     */     private final Base64URL k;
/*     */     private KeyUse use;
/*     */     private Set<KeyOperation> ops;
/*     */     private Algorithm alg;
/*     */     private String kid;
/*     */     private URI x5u;
/*     */     @Deprecated
/*     */     private Base64URL x5t;
/*     */     private Base64URL x5t256;
/*     */     private List<Base64> x5c;
/*     */     private KeyStore ks;
/*     */     
/*     */     public Builder(Base64URL k) {
/* 167 */       if (k == null) {
/* 168 */         throw new IllegalArgumentException("The key value must not be null");
/*     */       }
/*     */       
/* 171 */       this.k = k;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder(byte[] key) {
/* 183 */       this(Base64URL.encode(key));
/*     */       
/* 185 */       if (key.length == 0) {
/* 186 */         throw new IllegalArgumentException("The key must have a positive length");
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder(SecretKey secretKey) {
/* 199 */       this(secretKey.getEncoded());
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder keyUse(KeyUse use) {
/* 214 */       this.use = use;
/* 215 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder keyOperations(Set<KeyOperation> ops) {
/* 230 */       this.ops = ops;
/* 231 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder algorithm(Algorithm alg) {
/* 245 */       this.alg = alg;
/* 246 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder keyID(String kid) {
/* 262 */       this.kid = kid;
/* 263 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder keyIDFromThumbprint() throws JOSEException {
/* 283 */       return keyIDFromThumbprint("SHA-256");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder keyIDFromThumbprint(String hashAlg) throws JOSEException {
/* 306 */       LinkedHashMap<String, String> requiredParams = new LinkedHashMap<>();
/* 307 */       requiredParams.put("k", this.k.toString());
/* 308 */       requiredParams.put("kty", KeyType.OCT.getValue());
/* 309 */       this.kid = ThumbprintUtils.compute(hashAlg, requiredParams).toString();
/* 310 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder x509CertURL(URI x5u) {
/* 324 */       this.x5u = x5u;
/* 325 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     public Builder x509CertThumbprint(Base64URL x5t) {
/* 341 */       this.x5t = x5t;
/* 342 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder x509CertSHA256Thumbprint(Base64URL x5t256) {
/* 357 */       this.x5t256 = x5t256;
/* 358 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder x509CertChain(List<Base64> x5c) {
/* 372 */       this.x5c = x5c;
/* 373 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder keyStore(KeyStore keyStore) {
/* 387 */       this.ks = keyStore;
/* 388 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public OctetSequenceKey build() {
/*     */       try {
/* 403 */         return new OctetSequenceKey(this.k, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.ks);
/*     */       }
/* 405 */       catch (IllegalArgumentException e) {
/*     */         
/* 407 */         throw new IllegalStateException(e.getMessage(), e);
/*     */       } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OctetSequenceKey(Base64URL k, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/* 441 */     super(KeyType.OCT, use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*     */     
/* 443 */     if (k == null) {
/* 444 */       throw new IllegalArgumentException("The key value must not be null");
/*     */     }
/*     */     
/* 447 */     this.k = k;
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
/*     */   public Base64URL getKeyValue() {
/* 459 */     return this.k;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte[] toByteArray() {
/* 470 */     return getKeyValue().decode();
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
/*     */   public SecretKey toSecretKey() {
/* 483 */     return toSecretKey("NONE");
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
/*     */   public SecretKey toSecretKey(String jcaAlg) {
/* 497 */     return new SecretKeySpec(toByteArray(), jcaAlg);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LinkedHashMap<String, ?> getRequiredParams() {
/* 505 */     LinkedHashMap<String, String> requiredParams = new LinkedHashMap<>();
/* 506 */     requiredParams.put("k", this.k.toString());
/* 507 */     requiredParams.put("kty", getKeyType().toString());
/* 508 */     return requiredParams;
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
/*     */   public boolean isPrivate() {
/* 521 */     return true;
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
/*     */   public OctetSequenceKey toPublicJWK() {
/* 534 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int size() {
/*     */     try {
/* 542 */       return ByteUtils.safeBitLength(this.k.decode());
/* 543 */     } catch (IntegerOverflowException e) {
/* 544 */       throw new ArithmeticException(e.getMessage());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Object> toJSONObject() {
/* 552 */     Map<String, Object> o = super.toJSONObject();
/*     */ 
/*     */     
/* 555 */     o.put("k", this.k.toString());
/*     */     
/* 557 */     return o;
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
/*     */   public static OctetSequenceKey parse(String s) throws ParseException {
/* 575 */     return parse(JSONObjectUtils.parse(s));
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
/*     */   public static OctetSequenceKey parse(Map<String, Object> jsonObject) throws ParseException {
/* 595 */     if (!KeyType.OCT.equals(JWKMetadata.parseKeyType(jsonObject))) {
/* 596 */       throw new ParseException("The key type kty must be " + KeyType.OCT.getValue(), 0);
/*     */     }
/*     */ 
/*     */     
/* 600 */     Base64URL k = JSONObjectUtils.getBase64URL(jsonObject, "k");
/*     */     
/*     */     try {
/* 603 */       return new OctetSequenceKey(k, 
/* 604 */           JWKMetadata.parseKeyUse(jsonObject), 
/* 605 */           JWKMetadata.parseKeyOperations(jsonObject), 
/* 606 */           JWKMetadata.parseAlgorithm(jsonObject), 
/* 607 */           JWKMetadata.parseKeyID(jsonObject), 
/* 608 */           JWKMetadata.parseX509CertURL(jsonObject), 
/* 609 */           JWKMetadata.parseX509CertThumbprint(jsonObject), 
/* 610 */           JWKMetadata.parseX509CertSHA256Thumbprint(jsonObject), 
/* 611 */           JWKMetadata.parseX509CertChain(jsonObject), null);
/*     */     
/*     */     }
/* 614 */     catch (IllegalArgumentException e) {
/* 615 */       throw new ParseException(e.getMessage(), 0);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static OctetSequenceKey load(KeyStore keyStore, String alias, char[] pin) throws KeyStoreException, JOSEException {
/*     */     Key key;
/*     */     try {
/* 639 */       key = keyStore.getKey(alias, pin);
/* 640 */     } catch (UnrecoverableKeyException|java.security.NoSuchAlgorithmException e) {
/* 641 */       throw new JOSEException("Couldn't retrieve secret key (bad pin?): " + e.getMessage(), e);
/*     */     } 
/*     */     
/* 644 */     if (!(key instanceof SecretKey)) {
/* 645 */       return null;
/*     */     }
/*     */     
/* 648 */     return (new Builder((SecretKey)key))
/* 649 */       .keyID(alias)
/* 650 */       .keyStore(keyStore)
/* 651 */       .build();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 657 */     if (this == o) return true; 
/* 658 */     if (!(o instanceof OctetSequenceKey)) return false; 
/* 659 */     if (!super.equals(o)) return false; 
/* 660 */     OctetSequenceKey that = (OctetSequenceKey)o;
/* 661 */     return Objects.equals(this.k, that.k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 667 */     return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.k });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\OctetSequenceKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */