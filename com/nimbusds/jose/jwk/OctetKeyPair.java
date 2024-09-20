/*     */ package com.nimbusds.jose.jwk;
/*     */ 
/*     */ import com.nimbusds.jose.Algorithm;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.util.Base64;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.ByteUtils;
/*     */ import com.nimbusds.jose.util.JSONObjectUtils;
/*     */ import java.net.URI;
/*     */ import java.security.KeyPair;
/*     */ import java.security.KeyStore;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.PublicKey;
/*     */ import java.security.cert.X509Certificate;
/*     */ import java.text.ParseException;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.HashSet;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
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
/*     */ @Immutable
/*     */ public class OctetKeyPair
/*     */   extends JWK
/*     */   implements AsymmetricJWK, CurveBasedJWK
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*  99 */   public static final Set<Curve> SUPPORTED_CURVES = Collections.unmodifiableSet(new HashSet<>(
/* 100 */         Arrays.asList(new Curve[] { Curve.Ed25519, Curve.Ed448, Curve.X25519, Curve.X448 })));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Curve crv;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Base64URL x;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final byte[] decodedX;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Base64URL d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final byte[] decodedD;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Builder
/*     */   {
/*     */     private final Curve crv;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final Base64URL x;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Base64URL d;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private KeyUse use;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Set<KeyOperation> ops;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Algorithm alg;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private String kid;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private URI x5u;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     private Base64URL x5t;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Base64URL x5t256;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private List<Base64> x5c;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private KeyStore ks;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder(Curve crv, Base64URL x) {
/* 203 */       if (crv == null) {
/* 204 */         throw new IllegalArgumentException("The curve must not be null");
/*     */       }
/*     */       
/* 207 */       this.crv = crv;
/*     */       
/* 209 */       if (x == null) {
/* 210 */         throw new IllegalArgumentException("The 'x' coordinate must not be null");
/*     */       }
/*     */       
/* 213 */       this.x = x;
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
/*     */     public Builder(OctetKeyPair okpJWK) {
/* 225 */       this.crv = okpJWK.crv;
/* 226 */       this.x = okpJWK.x;
/* 227 */       this.d = okpJWK.d;
/* 228 */       this.use = okpJWK.getKeyUse();
/* 229 */       this.ops = okpJWK.getKeyOperations();
/* 230 */       this.alg = okpJWK.getAlgorithm();
/* 231 */       this.kid = okpJWK.getKeyID();
/* 232 */       this.x5u = okpJWK.getX509CertURL();
/* 233 */       this.x5t = okpJWK.getX509CertThumbprint();
/* 234 */       this.x5t256 = okpJWK.getX509CertSHA256Thumbprint();
/* 235 */       this.x5c = okpJWK.getX509CertChain();
/* 236 */       this.ks = okpJWK.getKeyStore();
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
/*     */     public Builder d(Base64URL d) {
/* 250 */       this.d = d;
/* 251 */       return this;
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
/* 266 */       this.use = use;
/* 267 */       return this;
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
/*     */     public Builder keyOperations(Set<KeyOperation> ops) {
/* 281 */       this.ops = ops;
/* 282 */       return this;
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
/* 296 */       this.alg = alg;
/* 297 */       return this;
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
/* 313 */       this.kid = kid;
/* 314 */       return this;
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
/* 334 */       return keyIDFromThumbprint("SHA-256");
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
/* 357 */       LinkedHashMap<String, String> requiredParams = new LinkedHashMap<>();
/* 358 */       requiredParams.put("crv", this.crv.toString());
/* 359 */       requiredParams.put("kty", KeyType.OKP.getValue());
/* 360 */       requiredParams.put("x", this.x.toString());
/* 361 */       this.kid = ThumbprintUtils.compute(hashAlg, requiredParams).toString();
/* 362 */       return this;
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
/* 376 */       this.x5u = x5u;
/* 377 */       return this;
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
/* 393 */       this.x5t = x5t;
/* 394 */       return this;
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
/* 409 */       this.x5t256 = x5t256;
/* 410 */       return this;
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
/* 424 */       this.x5c = x5c;
/* 425 */       return this;
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
/* 439 */       this.ks = keyStore;
/* 440 */       return this;
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
/*     */     public OctetKeyPair build() {
/*     */       try {
/* 455 */         if (this.d == null)
/*     */         {
/* 457 */           return new OctetKeyPair(this.crv, this.x, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.ks);
/*     */         }
/*     */ 
/*     */         
/* 461 */         return new OctetKeyPair(this.crv, this.x, this.d, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.ks);
/*     */       }
/* 463 */       catch (IllegalArgumentException e) {
/* 464 */         throw new IllegalStateException(e.getMessage(), e);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OctetKeyPair(Curve crv, Base64URL x, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/* 532 */     super(KeyType.OKP, use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*     */     
/* 534 */     if (crv == null) {
/* 535 */       throw new IllegalArgumentException("The curve must not be null");
/*     */     }
/*     */     
/* 538 */     if (!SUPPORTED_CURVES.contains(crv)) {
/* 539 */       throw new IllegalArgumentException("Unknown / unsupported curve: " + crv);
/*     */     }
/*     */     
/* 542 */     this.crv = crv;
/*     */     
/* 544 */     if (x == null) {
/* 545 */       throw new IllegalArgumentException("The 'x' parameter must not be null");
/*     */     }
/*     */     
/* 548 */     this.x = x;
/* 549 */     this.decodedX = x.decode();
/*     */     
/* 551 */     this.d = null;
/* 552 */     this.decodedD = null;
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
/*     */   public OctetKeyPair(Curve crv, Base64URL x, Base64URL d, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/* 585 */     super(KeyType.OKP, use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*     */     
/* 587 */     if (crv == null) {
/* 588 */       throw new IllegalArgumentException("The curve must not be null");
/*     */     }
/*     */     
/* 591 */     if (!SUPPORTED_CURVES.contains(crv)) {
/* 592 */       throw new IllegalArgumentException("Unknown / unsupported curve: " + crv);
/*     */     }
/*     */     
/* 595 */     this.crv = crv;
/*     */     
/* 597 */     if (x == null) {
/* 598 */       throw new IllegalArgumentException("The 'x' parameter must not be null");
/*     */     }
/*     */     
/* 601 */     this.x = x;
/* 602 */     this.decodedX = x.decode();
/*     */     
/* 604 */     if (d == null) {
/* 605 */       throw new IllegalArgumentException("The 'd' parameter must not be null");
/*     */     }
/*     */     
/* 608 */     this.d = d;
/* 609 */     this.decodedD = d.decode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Curve getCurve() {
/* 616 */     return this.crv;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Base64URL getX() {
/* 627 */     return this.x;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte[] getDecodedX() {
/* 638 */     return (byte[])this.decodedX.clone();
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
/*     */   public Base64URL getD() {
/* 650 */     return this.d;
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
/*     */   public byte[] getDecodedD() {
/* 662 */     return (this.decodedD == null) ? null : (byte[])this.decodedD.clone();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PublicKey toPublicKey() throws JOSEException {
/* 670 */     throw new JOSEException("Export to java.security.PublicKey not supported");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PrivateKey toPrivateKey() throws JOSEException {
/* 678 */     throw new JOSEException("Export to java.security.PrivateKey not supported");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public KeyPair toKeyPair() throws JOSEException {
/* 686 */     throw new JOSEException("Export to java.security.KeyPair not supported");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean matches(X509Certificate cert) {
/* 693 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LinkedHashMap<String, ?> getRequiredParams() {
/* 701 */     LinkedHashMap<String, String> requiredParams = new LinkedHashMap<>();
/* 702 */     requiredParams.put("crv", this.crv.toString());
/* 703 */     requiredParams.put("kty", getKeyType().getValue());
/* 704 */     requiredParams.put("x", this.x.toString());
/* 705 */     return requiredParams;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isPrivate() {
/* 712 */     return (this.d != null);
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
/*     */   public OctetKeyPair toPublicJWK() {
/* 725 */     return new OctetKeyPair(
/* 726 */         getCurve(), getX(), 
/* 727 */         getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), 
/* 728 */         getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), 
/* 729 */         getKeyStore());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Object> toJSONObject() {
/* 736 */     Map<String, Object> o = super.toJSONObject();
/*     */ 
/*     */     
/* 739 */     o.put("crv", this.crv.toString());
/* 740 */     o.put("x", this.x.toString());
/*     */     
/* 742 */     if (this.d != null) {
/* 743 */       o.put("d", this.d.toString());
/*     */     }
/*     */     
/* 746 */     return o;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int size() {
/* 753 */     return ByteUtils.bitLength(this.x.decode());
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
/*     */   public static OctetKeyPair parse(String s) throws ParseException {
/* 771 */     return parse(JSONObjectUtils.parse(s));
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
/*     */   public static OctetKeyPair parse(Map<String, Object> jsonObject) throws ParseException {
/*     */     Curve crv;
/* 791 */     if (!KeyType.OKP.equals(JWKMetadata.parseKeyType(jsonObject))) {
/* 792 */       throw new ParseException("The key type kty must be " + KeyType.OKP.getValue(), 0);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 798 */       crv = Curve.parse(JSONObjectUtils.getString(jsonObject, "crv"));
/* 799 */     } catch (IllegalArgumentException e) {
/* 800 */       throw new ParseException(e.getMessage(), 0);
/*     */     } 
/*     */     
/* 803 */     Base64URL x = JSONObjectUtils.getBase64URL(jsonObject, "x");
/*     */ 
/*     */     
/* 806 */     Base64URL d = JSONObjectUtils.getBase64URL(jsonObject, "d");
/*     */     
/*     */     try {
/* 809 */       if (d == null)
/*     */       {
/* 811 */         return new OctetKeyPair(crv, x, 
/* 812 */             JWKMetadata.parseKeyUse(jsonObject), 
/* 813 */             JWKMetadata.parseKeyOperations(jsonObject), 
/* 814 */             JWKMetadata.parseAlgorithm(jsonObject), 
/* 815 */             JWKMetadata.parseKeyID(jsonObject), 
/* 816 */             JWKMetadata.parseX509CertURL(jsonObject), 
/* 817 */             JWKMetadata.parseX509CertThumbprint(jsonObject), 
/* 818 */             JWKMetadata.parseX509CertSHA256Thumbprint(jsonObject), 
/* 819 */             JWKMetadata.parseX509CertChain(jsonObject), null);
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 824 */       return new OctetKeyPair(crv, x, d, 
/* 825 */           JWKMetadata.parseKeyUse(jsonObject), 
/* 826 */           JWKMetadata.parseKeyOperations(jsonObject), 
/* 827 */           JWKMetadata.parseAlgorithm(jsonObject), 
/* 828 */           JWKMetadata.parseKeyID(jsonObject), 
/* 829 */           JWKMetadata.parseX509CertURL(jsonObject), 
/* 830 */           JWKMetadata.parseX509CertThumbprint(jsonObject), 
/* 831 */           JWKMetadata.parseX509CertSHA256Thumbprint(jsonObject), 
/* 832 */           JWKMetadata.parseX509CertChain(jsonObject), null);
/*     */ 
/*     */     
/*     */     }
/* 836 */     catch (IllegalArgumentException ex) {
/*     */ 
/*     */       
/* 839 */       throw new ParseException(ex.getMessage(), 0);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 846 */     if (this == o) return true; 
/* 847 */     if (!(o instanceof OctetKeyPair)) return false; 
/* 848 */     if (!super.equals(o)) return false; 
/* 849 */     OctetKeyPair that = (OctetKeyPair)o;
/* 850 */     return (Objects.equals(this.crv, that.crv) && 
/* 851 */       Objects.equals(this.x, that.x) && 
/* 852 */       Arrays.equals(this.decodedX, that.decodedX) && 
/* 853 */       Objects.equals(this.d, that.d) && 
/* 854 */       Arrays.equals(this.decodedD, that.decodedD));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 860 */     int result = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.crv, this.x, this.d });
/* 861 */     result = 31 * result + Arrays.hashCode(this.decodedX);
/* 862 */     result = 31 * result + Arrays.hashCode(this.decodedD);
/* 863 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\OctetKeyPair.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */