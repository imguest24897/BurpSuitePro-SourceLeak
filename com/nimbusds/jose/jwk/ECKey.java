/*      */ package com.nimbusds.jose.jwk;
/*      */ 
/*      */ import com.nimbusds.jose.Algorithm;
/*      */ import com.nimbusds.jose.JOSEException;
/*      */ import com.nimbusds.jose.crypto.utils.ECChecks;
/*      */ import com.nimbusds.jose.util.Base64;
/*      */ import com.nimbusds.jose.util.Base64URL;
/*      */ import com.nimbusds.jose.util.BigIntegerUtils;
/*      */ import com.nimbusds.jose.util.JSONObjectUtils;
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
/*      */ import java.security.Provider;
/*      */ import java.security.PublicKey;
/*      */ import java.security.UnrecoverableKeyException;
/*      */ import java.security.cert.Certificate;
/*      */ import java.security.cert.CertificateEncodingException;
/*      */ import java.security.cert.X509Certificate;
/*      */ import java.security.interfaces.ECPrivateKey;
/*      */ import java.security.interfaces.ECPublicKey;
/*      */ import java.security.spec.ECParameterSpec;
/*      */ import java.security.spec.ECPoint;
/*      */ import java.security.spec.ECPrivateKeySpec;
/*      */ import java.security.spec.ECPublicKeySpec;
/*      */ import java.text.ParseException;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collections;
/*      */ import java.util.HashSet;
/*      */ import java.util.LinkedHashMap;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Objects;
/*      */ import java.util.Set;
/*      */ import net.jcip.annotations.Immutable;
/*      */ import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*      */ public final class ECKey
/*      */   extends JWK
/*      */   implements AsymmetricJWK, CurveBasedJWK
/*      */ {
/*      */   private static final long serialVersionUID = 1L;
/*  120 */   public static final Set<Curve> SUPPORTED_CURVES = Collections.unmodifiableSet(new HashSet<>(
/*  121 */         Arrays.asList(new Curve[] { Curve.P_256, Curve.SECP256K1, Curve.P_384, Curve.P_521 })));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final Curve crv;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final Base64URL x;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final Base64URL y;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final Base64URL d;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final PrivateKey privateKey;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class Builder
/*      */   {
/*      */     private final Curve crv;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final Base64URL x;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final Base64URL y;
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
/*      */     private PrivateKey priv;
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
/*      */     private Set<KeyOperation> ops;
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
/*      */     private String kid;
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
/*      */     @Deprecated
/*      */     private Base64URL x5t;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL x5t256;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private List<Base64> x5c;
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
/*      */     public Builder(Curve crv, Base64URL x, Base64URL y) {
/*  242 */       if (crv == null) {
/*  243 */         throw new IllegalArgumentException("The curve must not be null");
/*      */       }
/*      */       
/*  246 */       this.crv = crv;
/*      */       
/*  248 */       if (x == null) {
/*  249 */         throw new IllegalArgumentException("The 'x' coordinate must not be null");
/*      */       }
/*      */       
/*  252 */       this.x = x;
/*      */       
/*  254 */       if (y == null) {
/*  255 */         throw new IllegalArgumentException("The 'y' coordinate must not be null");
/*      */       }
/*      */       
/*  258 */       this.y = y;
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
/*      */     public Builder(Curve crv, ECPublicKey pub) {
/*  272 */       this(crv, 
/*  273 */           ECKey.encodeCoordinate(pub.getParams().getCurve().getField().getFieldSize(), pub.getW().getAffineX()), 
/*  274 */           ECKey.encodeCoordinate(pub.getParams().getCurve().getField().getFieldSize(), pub.getW().getAffineY()));
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
/*      */     public Builder(ECKey ecJWK) {
/*  286 */       this.crv = ecJWK.crv;
/*  287 */       this.x = ecJWK.x;
/*  288 */       this.y = ecJWK.y;
/*  289 */       this.d = ecJWK.d;
/*  290 */       this.priv = ecJWK.privateKey;
/*  291 */       this.use = ecJWK.getKeyUse();
/*  292 */       this.ops = ecJWK.getKeyOperations();
/*  293 */       this.alg = ecJWK.getAlgorithm();
/*  294 */       this.kid = ecJWK.getKeyID();
/*  295 */       this.x5u = ecJWK.getX509CertURL();
/*  296 */       this.x5t = ecJWK.getX509CertThumbprint();
/*  297 */       this.x5t256 = ecJWK.getX509CertSHA256Thumbprint();
/*  298 */       this.x5c = ecJWK.getX509CertChain();
/*  299 */       this.ks = ecJWK.getKeyStore();
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
/*      */     public Builder d(Base64URL d) {
/*  316 */       this.d = d;
/*  317 */       return this;
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
/*      */     public Builder privateKey(ECPrivateKey priv) {
/*  334 */       if (priv != null) {
/*  335 */         this.d = ECKey.encodeCoordinate(priv.getParams().getCurve().getField().getFieldSize(), priv.getS());
/*      */       }
/*      */       
/*  338 */       return this;
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
/*  354 */       if (priv instanceof ECPrivateKey) {
/*  355 */         return privateKey((ECPrivateKey)priv);
/*      */       }
/*      */       
/*  358 */       if (!"EC".equalsIgnoreCase(priv.getAlgorithm())) {
/*  359 */         throw new IllegalArgumentException("The private key algorithm must be EC");
/*      */       }
/*      */       
/*  362 */       this.priv = priv;
/*  363 */       return this;
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
/*  378 */       this.use = use;
/*  379 */       return this;
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
/*      */     public Builder keyOperations(Set<KeyOperation> ops) {
/*  393 */       this.ops = ops;
/*  394 */       return this;
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
/*  408 */       this.alg = alg;
/*  409 */       return this;
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
/*  425 */       this.kid = kid;
/*  426 */       return this;
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
/*  446 */       return keyIDFromThumbprint("SHA-256");
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
/*  469 */       LinkedHashMap<String, String> requiredParams = new LinkedHashMap<>();
/*  470 */       requiredParams.put("crv", this.crv.toString());
/*  471 */       requiredParams.put("kty", KeyType.EC.getValue());
/*  472 */       requiredParams.put("x", this.x.toString());
/*  473 */       requiredParams.put("y", this.y.toString());
/*  474 */       this.kid = ThumbprintUtils.compute(hashAlg, requiredParams).toString();
/*  475 */       return this;
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
/*  489 */       this.x5u = x5u;
/*  490 */       return this;
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
/*  506 */       this.x5t = x5t;
/*  507 */       return this;
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
/*  522 */       this.x5t256 = x5t256;
/*  523 */       return this;
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
/*  537 */       this.x5c = x5c;
/*  538 */       return this;
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
/*  552 */       this.ks = keyStore;
/*  553 */       return this;
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
/*      */     public ECKey build() {
/*      */       try {
/*  568 */         if (this.d == null && this.priv == null)
/*      */         {
/*  570 */           return new ECKey(this.crv, this.x, this.y, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.ks);
/*      */         }
/*      */         
/*  573 */         if (this.priv != null)
/*      */         {
/*  575 */           return new ECKey(this.crv, this.x, this.y, this.priv, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.ks);
/*      */         }
/*      */ 
/*      */         
/*  579 */         return new ECKey(this.crv, this.x, this.y, this.d, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.ks);
/*      */       }
/*  581 */       catch (IllegalArgumentException e) {
/*  582 */         throw new IllegalStateException(e.getMessage(), e);
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
/*      */   public static Base64URL encodeCoordinate(int fieldSize, BigInteger coordinate) {
/*  602 */     byte[] notPadded = BigIntegerUtils.toBytesUnsigned(coordinate);
/*      */     
/*  604 */     int bytesToOutput = (fieldSize + 7) / 8;
/*      */     
/*  606 */     if (notPadded.length >= bytesToOutput)
/*      */     {
/*      */       
/*  609 */       return Base64URL.encode(notPadded);
/*      */     }
/*      */     
/*  612 */     byte[] padded = new byte[bytesToOutput];
/*      */     
/*  614 */     System.arraycopy(notPadded, 0, padded, bytesToOutput - notPadded.length, notPadded.length);
/*      */     
/*  616 */     return Base64URL.encode(padded);
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
/*      */   private static void ensurePublicCoordinatesOnCurve(Curve crv, Base64URL x, Base64URL y) {
/*  660 */     if (!SUPPORTED_CURVES.contains(crv)) {
/*  661 */       throw new IllegalArgumentException("Unknown / unsupported curve: " + crv);
/*      */     }
/*      */     
/*  664 */     if (!ECChecks.isPointOnCurve(x.decodeToBigInteger(), y.decodeToBigInteger(), crv.toECParameterSpec())) {
/*  665 */       throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + crv + " curve");
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
/*      */   public ECKey(Curve crv, Base64URL x, Base64URL y, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/*  705 */     super(KeyType.EC, use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*      */     
/*  707 */     if (crv == null) {
/*  708 */       throw new IllegalArgumentException("The curve must not be null");
/*      */     }
/*      */     
/*  711 */     this.crv = crv;
/*      */     
/*  713 */     if (x == null) {
/*  714 */       throw new IllegalArgumentException("The 'x' coordinate must not be null");
/*      */     }
/*      */     
/*  717 */     this.x = x;
/*      */     
/*  719 */     if (y == null) {
/*  720 */       throw new IllegalArgumentException("The 'y' coordinate must not be null");
/*      */     }
/*      */     
/*  723 */     this.y = y;
/*      */     
/*  725 */     ensurePublicCoordinatesOnCurve(crv, x, y);
/*      */     
/*  727 */     ensureMatches(getParsedX509CertChain());
/*      */     
/*  729 */     this.d = null;
/*      */     
/*  731 */     this.privateKey = null;
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
/*      */   public ECKey(Curve crv, Base64URL x, Base64URL y, Base64URL d, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/*  774 */     super(KeyType.EC, use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*      */     
/*  776 */     if (crv == null) {
/*  777 */       throw new IllegalArgumentException("The curve must not be null");
/*      */     }
/*      */     
/*  780 */     this.crv = crv;
/*      */     
/*  782 */     if (x == null) {
/*  783 */       throw new IllegalArgumentException("The 'x' coordinate must not be null");
/*      */     }
/*      */     
/*  786 */     this.x = x;
/*      */     
/*  788 */     if (y == null) {
/*  789 */       throw new IllegalArgumentException("The 'y' coordinate must not be null");
/*      */     }
/*      */     
/*  792 */     this.y = y;
/*      */     
/*  794 */     ensurePublicCoordinatesOnCurve(crv, x, y);
/*      */     
/*  796 */     ensureMatches(getParsedX509CertChain());
/*      */     
/*  798 */     if (d == null) {
/*  799 */       throw new IllegalArgumentException("The 'd' coordinate must not be null");
/*      */     }
/*      */     
/*  802 */     this.d = d;
/*      */     
/*  804 */     this.privateKey = null;
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
/*      */   public ECKey(Curve crv, Base64URL x, Base64URL y, PrivateKey priv, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/*  844 */     super(KeyType.EC, use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*      */     
/*  846 */     if (crv == null) {
/*  847 */       throw new IllegalArgumentException("The curve must not be null");
/*      */     }
/*      */     
/*  850 */     this.crv = crv;
/*      */     
/*  852 */     if (x == null) {
/*  853 */       throw new IllegalArgumentException("The 'x' coordinate must not be null");
/*      */     }
/*      */     
/*  856 */     this.x = x;
/*      */     
/*  858 */     if (y == null) {
/*  859 */       throw new IllegalArgumentException("The 'y' coordinate must not be null");
/*      */     }
/*      */     
/*  862 */     this.y = y;
/*      */     
/*  864 */     ensurePublicCoordinatesOnCurve(crv, x, y);
/*      */     
/*  866 */     ensureMatches(getParsedX509CertChain());
/*      */     
/*  868 */     this.d = null;
/*      */     
/*  870 */     this.privateKey = priv;
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
/*      */   public ECKey(Curve crv, ECPublicKey pub, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/*  903 */     this(crv, 
/*  904 */         encodeCoordinate(pub.getParams().getCurve().getField().getFieldSize(), pub.getW().getAffineX()), 
/*  905 */         encodeCoordinate(pub.getParams().getCurve().getField().getFieldSize(), pub.getW().getAffineY()), use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
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
/*      */   public ECKey(Curve crv, ECPublicKey pub, ECPrivateKey priv, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/*  943 */     this(crv, 
/*  944 */         encodeCoordinate(pub.getParams().getCurve().getField().getFieldSize(), pub.getW().getAffineX()), 
/*  945 */         encodeCoordinate(pub.getParams().getCurve().getField().getFieldSize(), pub.getW().getAffineY()), 
/*  946 */         encodeCoordinate(priv.getParams().getCurve().getField().getFieldSize(), priv.getS()), use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
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
/*      */   public ECKey(Curve crv, ECPublicKey pub, PrivateKey priv, KeyUse use, Set<KeyOperation> ops, Algorithm alg, String kid, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, KeyStore ks) {
/*  985 */     this(crv, 
/*      */         
/*  987 */         encodeCoordinate(pub.getParams().getCurve().getField().getFieldSize(), pub.getW().getAffineX()), 
/*  988 */         encodeCoordinate(pub.getParams().getCurve().getField().getFieldSize(), pub.getW().getAffineY()), priv, use, ops, alg, kid, x5u, x5t, x5t256, x5c, ks);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Curve getCurve() {
/*  998 */     return this.crv;
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
/*      */   public Base64URL getX() {
/* 1010 */     return this.x;
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
/*      */   public Base64URL getY() {
/* 1022 */     return this.y;
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
/*      */   public Base64URL getD() {
/* 1037 */     return this.d;
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
/*      */   public ECPublicKey toECPublicKey() throws JOSEException {
/* 1055 */     return toECPublicKey((Provider)null);
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
/*      */   public ECPublicKey toECPublicKey(Provider provider) throws JOSEException {
/* 1075 */     ECParameterSpec spec = this.crv.toECParameterSpec();
/*      */     
/* 1077 */     if (spec == null) {
/* 1078 */       throw new JOSEException("Couldn't get EC parameter spec for curve " + this.crv);
/*      */     }
/*      */     
/* 1081 */     ECPoint w = new ECPoint(this.x.decodeToBigInteger(), this.y.decodeToBigInteger());
/*      */     
/* 1083 */     ECPublicKeySpec publicKeySpec = new ECPublicKeySpec(w, spec);
/*      */     
/*      */     try {
/*      */       KeyFactory keyFactory;
/*      */       
/* 1088 */       if (provider == null) {
/* 1089 */         keyFactory = KeyFactory.getInstance("EC");
/*      */       } else {
/* 1091 */         keyFactory = KeyFactory.getInstance("EC", provider);
/*      */       } 
/*      */       
/* 1094 */       return (ECPublicKey)keyFactory.generatePublic(publicKeySpec);
/*      */     }
/* 1096 */     catch (NoSuchAlgorithmException|java.security.spec.InvalidKeySpecException e) {
/*      */       
/* 1098 */       throw new JOSEException(e.getMessage(), e);
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
/*      */   public ECPrivateKey toECPrivateKey() throws JOSEException {
/* 1118 */     return toECPrivateKey((Provider)null);
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
/*      */   public ECPrivateKey toECPrivateKey(Provider provider) throws JOSEException {
/* 1139 */     if (this.d == null)
/*      */     {
/* 1141 */       return null;
/*      */     }
/*      */     
/* 1144 */     ECParameterSpec spec = this.crv.toECParameterSpec();
/*      */     
/* 1146 */     if (spec == null) {
/* 1147 */       throw new JOSEException("Couldn't get EC parameter spec for curve " + this.crv);
/*      */     }
/*      */     
/* 1150 */     ECPrivateKeySpec privateKeySpec = new ECPrivateKeySpec(this.d.decodeToBigInteger(), spec);
/*      */     
/*      */     try {
/*      */       KeyFactory keyFactory;
/*      */       
/* 1155 */       if (provider == null) {
/* 1156 */         keyFactory = KeyFactory.getInstance("EC");
/*      */       } else {
/* 1158 */         keyFactory = KeyFactory.getInstance("EC", provider);
/*      */       } 
/*      */       
/* 1161 */       return (ECPrivateKey)keyFactory.generatePrivate(privateKeySpec);
/*      */     }
/* 1163 */     catch (NoSuchAlgorithmException|java.security.spec.InvalidKeySpecException e) {
/*      */       
/* 1165 */       throw new JOSEException(e.getMessage(), e);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PublicKey toPublicKey() throws JOSEException {
/* 1174 */     return toECPublicKey();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PrivateKey toPrivateKey() throws JOSEException {
/* 1182 */     PrivateKey prv = toECPrivateKey();
/*      */     
/* 1184 */     if (prv != null)
/*      */     {
/* 1186 */       return prv;
/*      */     }
/*      */ 
/*      */     
/* 1190 */     return this.privateKey;
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
/* 1210 */     return toKeyPair((Provider)null);
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
/*      */   public KeyPair toKeyPair(Provider provider) throws JOSEException {
/* 1232 */     if (this.privateKey != null)
/*      */     {
/* 1234 */       return new KeyPair(toECPublicKey(provider), this.privateKey);
/*      */     }
/* 1236 */     return new KeyPair(toECPublicKey(provider), toECPrivateKey(provider));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean matches(X509Certificate cert) {
/*      */     ECPublicKey certECKey;
/*      */     try {
/* 1246 */       certECKey = (ECPublicKey)((X509Certificate)getParsedX509CertChain().get(0)).getPublicKey();
/* 1247 */     } catch (ClassCastException ex) {
/* 1248 */       return false;
/*      */     } 
/*      */ 
/*      */     
/* 1252 */     if (!getX().decodeToBigInteger().equals(certECKey.getW().getAffineX())) {
/* 1253 */       return false;
/*      */     }
/* 1255 */     return getY().decodeToBigInteger().equals(certECKey.getW().getAffineY());
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
/*      */   private void ensureMatches(List<X509Certificate> chain) {
/* 1272 */     if (chain == null) {
/*      */       return;
/*      */     }
/* 1275 */     if (!matches(chain.get(0))) {
/* 1276 */       throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LinkedHashMap<String, ?> getRequiredParams() {
/* 1284 */     LinkedHashMap<String, String> requiredParams = new LinkedHashMap<>();
/* 1285 */     requiredParams.put("crv", this.crv.toString());
/* 1286 */     requiredParams.put("kty", getKeyType().getValue());
/* 1287 */     requiredParams.put("x", this.x.toString());
/* 1288 */     requiredParams.put("y", this.y.toString());
/* 1289 */     return requiredParams;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isPrivate() {
/* 1296 */     return (this.d != null || this.privateKey != null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int size() {
/* 1303 */     ECParameterSpec ecParameterSpec = this.crv.toECParameterSpec();
/*      */     
/* 1305 */     if (ecParameterSpec == null) {
/* 1306 */       throw new UnsupportedOperationException("Couldn't determine field size for curve " + this.crv.getName());
/*      */     }
/*      */     
/* 1309 */     return ecParameterSpec.getCurve().getField().getFieldSize();
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
/*      */   public ECKey toPublicJWK() {
/* 1322 */     return new ECKey(
/* 1323 */         getCurve(), getX(), getY(), 
/* 1324 */         getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), 
/* 1325 */         getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), 
/* 1326 */         getKeyStore());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Map<String, Object> toJSONObject() {
/* 1333 */     Map<String, Object> o = super.toJSONObject();
/*      */ 
/*      */     
/* 1336 */     o.put("crv", this.crv.toString());
/* 1337 */     o.put("x", this.x.toString());
/* 1338 */     o.put("y", this.y.toString());
/*      */     
/* 1340 */     if (this.d != null) {
/* 1341 */       o.put("d", this.d.toString());
/*      */     }
/*      */     
/* 1344 */     return o;
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
/*      */   public static ECKey parse(String s) throws ParseException {
/* 1362 */     return parse(JSONObjectUtils.parse(s));
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
/*      */   public static ECKey parse(Map<String, Object> jsonObject) throws ParseException {
/*      */     Curve crv;
/* 1382 */     if (!KeyType.EC.equals(JWKMetadata.parseKeyType(jsonObject))) {
/* 1383 */       throw new ParseException("The key type \"kty\" must be EC", 0);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1389 */       crv = Curve.parse(JSONObjectUtils.getString(jsonObject, "crv"));
/* 1390 */     } catch (IllegalArgumentException e) {
/* 1391 */       throw new ParseException(e.getMessage(), 0);
/*      */     } 
/*      */     
/* 1394 */     Base64URL x = JSONObjectUtils.getBase64URL(jsonObject, "x");
/* 1395 */     Base64URL y = JSONObjectUtils.getBase64URL(jsonObject, "y");
/*      */ 
/*      */     
/* 1398 */     Base64URL d = JSONObjectUtils.getBase64URL(jsonObject, "d");
/*      */     
/*      */     try {
/* 1401 */       if (d == null)
/*      */       {
/* 1403 */         return new ECKey(crv, x, y, 
/* 1404 */             JWKMetadata.parseKeyUse(jsonObject), 
/* 1405 */             JWKMetadata.parseKeyOperations(jsonObject), 
/* 1406 */             JWKMetadata.parseAlgorithm(jsonObject), 
/* 1407 */             JWKMetadata.parseKeyID(jsonObject), 
/* 1408 */             JWKMetadata.parseX509CertURL(jsonObject), 
/* 1409 */             JWKMetadata.parseX509CertThumbprint(jsonObject), 
/* 1410 */             JWKMetadata.parseX509CertSHA256Thumbprint(jsonObject), 
/* 1411 */             JWKMetadata.parseX509CertChain(jsonObject), null);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1416 */       return new ECKey(crv, x, y, d, 
/* 1417 */           JWKMetadata.parseKeyUse(jsonObject), 
/* 1418 */           JWKMetadata.parseKeyOperations(jsonObject), 
/* 1419 */           JWKMetadata.parseAlgorithm(jsonObject), 
/* 1420 */           JWKMetadata.parseKeyID(jsonObject), 
/* 1421 */           JWKMetadata.parseX509CertURL(jsonObject), 
/* 1422 */           JWKMetadata.parseX509CertThumbprint(jsonObject), 
/* 1423 */           JWKMetadata.parseX509CertSHA256Thumbprint(jsonObject), 
/* 1424 */           JWKMetadata.parseX509CertChain(jsonObject), null);
/*      */ 
/*      */     
/*      */     }
/* 1428 */     catch (IllegalArgumentException ex) {
/*      */ 
/*      */       
/* 1431 */       throw new ParseException(ex.getMessage(), 0);
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
/*      */   public static ECKey parse(X509Certificate cert) throws JOSEException {
/* 1463 */     if (!(cert.getPublicKey() instanceof ECPublicKey)) {
/* 1464 */       throw new JOSEException("The public key of the X.509 certificate is not EC");
/*      */     }
/*      */     
/* 1467 */     ECPublicKey publicKey = (ECPublicKey)cert.getPublicKey();
/*      */     
/*      */     try {
/* 1470 */       JcaX509CertificateHolder certHolder = new JcaX509CertificateHolder(cert);
/*      */       
/* 1472 */       String oid = certHolder.getSubjectPublicKeyInfo().getAlgorithm().getParameters().toString();
/*      */       
/* 1474 */       Curve crv = Curve.forOID(oid);
/*      */       
/* 1476 */       if (crv == null) {
/* 1477 */         throw new JOSEException("Couldn't determine EC JWK curve for OID " + oid);
/*      */       }
/*      */       
/* 1480 */       MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
/*      */       
/* 1482 */       return (new Builder(crv, publicKey))
/* 1483 */         .keyUse(KeyUse.from(cert))
/* 1484 */         .keyID(cert.getSerialNumber().toString(10))
/* 1485 */         .x509CertChain(Collections.singletonList(Base64.encode(cert.getEncoded())))
/* 1486 */         .x509CertSHA256Thumbprint(Base64URL.encode(sha256.digest(cert.getEncoded())))
/* 1487 */         .build();
/* 1488 */     } catch (NoSuchAlgorithmException e) {
/* 1489 */       throw new JOSEException("Couldn't encode x5t parameter: " + e.getMessage(), e);
/* 1490 */     } catch (CertificateEncodingException e) {
/* 1491 */       throw new JOSEException("Couldn't encode x5c parameter: " + e.getMessage(), e);
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
/*      */   public static ECKey load(KeyStore keyStore, String alias, char[] pin) throws KeyStoreException, JOSEException {
/*      */     Key key;
/* 1519 */     Certificate cert = keyStore.getCertificate(alias);
/*      */     
/* 1521 */     if (!(cert instanceof X509Certificate)) {
/* 1522 */       return null;
/*      */     }
/*      */     
/* 1525 */     X509Certificate x509Cert = (X509Certificate)cert;
/*      */     
/* 1527 */     if (!(x509Cert.getPublicKey() instanceof ECPublicKey)) {
/* 1528 */       throw new JOSEException("Couldn't load EC JWK: The key algorithm is not EC");
/*      */     }
/*      */     
/* 1531 */     ECKey ecJWK = parse(x509Cert);
/*      */ 
/*      */     
/* 1534 */     ecJWK = (new Builder(ecJWK)).keyID(alias).keyStore(keyStore).build();
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1539 */       key = keyStore.getKey(alias, pin);
/* 1540 */     } catch (UnrecoverableKeyException|NoSuchAlgorithmException e) {
/* 1541 */       throw new JOSEException("Couldn't retrieve private EC key (bad pin?): " + e.getMessage(), e);
/*      */     } 
/*      */     
/* 1544 */     if (key instanceof ECPrivateKey)
/*      */     {
/* 1546 */       return (new Builder(ecJWK))
/* 1547 */         .privateKey((ECPrivateKey)key)
/* 1548 */         .build(); } 
/* 1549 */     if (key instanceof PrivateKey && "EC".equalsIgnoreCase(key.getAlgorithm()))
/*      */     {
/* 1551 */       return (new Builder(ecJWK))
/* 1552 */         .privateKey((PrivateKey)key)
/* 1553 */         .build();
/*      */     }
/* 1555 */     return ecJWK;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean equals(Object o) {
/* 1562 */     if (this == o) return true; 
/* 1563 */     if (!(o instanceof ECKey)) return false; 
/* 1564 */     if (!super.equals(o)) return false; 
/* 1565 */     ECKey ecKey = (ECKey)o;
/* 1566 */     return (Objects.equals(this.crv, ecKey.crv) && 
/* 1567 */       Objects.equals(this.x, ecKey.x) && 
/* 1568 */       Objects.equals(this.y, ecKey.y) && 
/* 1569 */       Objects.equals(this.d, ecKey.d) && 
/* 1570 */       Objects.equals(this.privateKey, ecKey.privateKey));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int hashCode() {
/* 1576 */     return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.crv, this.x, this.y, this.d, this.privateKey });
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\ECKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */