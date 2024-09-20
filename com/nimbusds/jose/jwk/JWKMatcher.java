/*      */ package com.nimbusds.jose.jwk;
/*      */ 
/*      */ import com.nimbusds.jose.Algorithm;
/*      */ import com.nimbusds.jose.JWEHeader;
/*      */ import com.nimbusds.jose.JWSAlgorithm;
/*      */ import com.nimbusds.jose.JWSHeader;
/*      */ import com.nimbusds.jose.util.Base64URL;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collections;
/*      */ import java.util.HashSet;
/*      */ import java.util.LinkedHashSet;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*      */ public class JWKMatcher
/*      */ {
/*      */   private final Set<KeyType> types;
/*      */   private final Set<KeyUse> uses;
/*      */   private final Set<KeyOperation> ops;
/*      */   private final Set<Algorithm> algs;
/*      */   private final Set<String> ids;
/*      */   private final boolean hasUse;
/*      */   private final boolean hasID;
/*      */   private final boolean privateOnly;
/*      */   private final boolean publicOnly;
/*      */   private final int minSizeBits;
/*      */   private final int maxSizeBits;
/*      */   private final Set<Integer> sizesBits;
/*      */   private final Set<Curve> curves;
/*      */   private final Set<Base64URL> x5tS256s;
/*      */   
/*      */   public static class Builder
/*      */   {
/*      */     private Set<KeyType> types;
/*      */     private Set<KeyUse> uses;
/*      */     private Set<KeyOperation> ops;
/*      */     private Set<Algorithm> algs;
/*      */     private Set<String> ids;
/*      */     private boolean hasUse = false;
/*      */     private boolean hasID = false;
/*      */     private boolean privateOnly = false;
/*      */     private boolean publicOnly = false;
/*  216 */     private int minSizeBits = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  223 */     private int maxSizeBits = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Set<Integer> sizesBits;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Set<Curve> curves;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Set<Base64URL> x5tS256s;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder keyType(KeyType kty) {
/*  253 */       if (kty == null) {
/*  254 */         this.types = null;
/*      */       } else {
/*  256 */         this.types = new HashSet<>(Collections.singletonList(kty));
/*      */       } 
/*      */       
/*  259 */       return this;
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
/*      */     public Builder keyTypes(KeyType... types) {
/*  272 */       keyTypes(new LinkedHashSet<>(Arrays.asList(types)));
/*  273 */       return this;
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
/*      */     public Builder keyTypes(Set<KeyType> types) {
/*  286 */       this.types = types;
/*  287 */       return this;
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
/*      */     public Builder keyUse(KeyUse use) {
/*  301 */       if (use == null) {
/*  302 */         this.uses = null;
/*      */       } else {
/*  304 */         this.uses = new HashSet<>(Collections.singletonList(use));
/*      */       } 
/*  306 */       return this;
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
/*      */     public Builder keyUses(KeyUse... uses) {
/*  319 */       keyUses(new LinkedHashSet<>(Arrays.asList(uses)));
/*  320 */       return this;
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
/*      */     public Builder keyUses(Set<KeyUse> uses) {
/*  334 */       this.uses = uses;
/*  335 */       return this;
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
/*      */     public Builder keyOperation(KeyOperation op) {
/*  348 */       if (op == null) {
/*  349 */         this.ops = null;
/*      */       } else {
/*  351 */         this.ops = new HashSet<>(Collections.singletonList(op));
/*      */       } 
/*  353 */       return this;
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
/*      */     public Builder keyOperations(KeyOperation... ops) {
/*  366 */       keyOperations(new LinkedHashSet<>(Arrays.asList(ops)));
/*  367 */       return this;
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
/*  381 */       this.ops = ops;
/*  382 */       return this;
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
/*  396 */       if (alg == null) {
/*  397 */         this.algs = null;
/*      */       } else {
/*  399 */         this.algs = new HashSet<>(Collections.singletonList(alg));
/*      */       } 
/*  401 */       return this;
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
/*      */     public Builder algorithms(Algorithm... algs) {
/*  414 */       algorithms(new LinkedHashSet<>(Arrays.asList(algs)));
/*  415 */       return this;
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
/*      */     public Builder algorithms(Set<Algorithm> algs) {
/*  429 */       this.algs = algs;
/*  430 */       return this;
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
/*      */     public Builder keyID(String id) {
/*  443 */       if (id == null) {
/*  444 */         this.ids = null;
/*      */       } else {
/*  446 */         this.ids = new HashSet<>(Collections.singletonList(id));
/*      */       } 
/*  448 */       return this;
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
/*      */     public Builder keyIDs(String... ids) {
/*  461 */       keyIDs(new LinkedHashSet<>(Arrays.asList(ids)));
/*  462 */       return this;
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
/*      */     public Builder keyIDs(Set<String> ids) {
/*  475 */       this.ids = ids;
/*  476 */       return this;
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
/*      */     public Builder hasKeyUse(boolean hasUse) {
/*  489 */       this.hasUse = hasUse;
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
/*      */     public Builder hasKeyID(boolean hasID) {
/*  503 */       this.hasID = hasID;
/*  504 */       return this;
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
/*      */     public Builder privateOnly(boolean privateOnly) {
/*  517 */       this.privateOnly = privateOnly;
/*  518 */       return this;
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
/*      */     public Builder publicOnly(boolean publicOnly) {
/*  531 */       this.publicOnly = publicOnly;
/*  532 */       return this;
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
/*      */     public Builder minKeySize(int minSizeBits) {
/*  546 */       this.minSizeBits = minSizeBits;
/*  547 */       return this;
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
/*      */     public Builder maxKeySize(int maxSizeBits) {
/*  561 */       this.maxSizeBits = maxSizeBits;
/*  562 */       return this;
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
/*      */     public Builder keySize(int keySizeBits) {
/*  575 */       if (keySizeBits <= 0) {
/*  576 */         this.sizesBits = null;
/*      */       } else {
/*  578 */         this.sizesBits = Collections.singleton(Integer.valueOf(keySizeBits));
/*      */       } 
/*  580 */       return this;
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
/*      */     public Builder keySizes(int... keySizesBits) {
/*  592 */       Set<Integer> sizesSet = new LinkedHashSet<>();
/*  593 */       for (int keySize : keySizesBits) {
/*  594 */         sizesSet.add(Integer.valueOf(keySize));
/*      */       }
/*  596 */       keySizes(sizesSet);
/*  597 */       return this;
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
/*      */     public Builder keySizes(Set<Integer> keySizesBits) {
/*  610 */       this.sizesBits = keySizesBits;
/*  611 */       return this;
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
/*      */     public Builder curve(Curve curve) {
/*  624 */       if (curve == null) {
/*  625 */         this.curves = null;
/*      */       } else {
/*  627 */         this.curves = Collections.singleton(curve);
/*      */       } 
/*  629 */       return this;
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
/*      */     public Builder curves(Curve... curves) {
/*  642 */       curves(new LinkedHashSet<>(Arrays.asList(curves)));
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
/*      */     public Builder curves(Set<Curve> curves) {
/*  656 */       this.curves = curves;
/*  657 */       return this;
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
/*      */     public Builder x509CertSHA256Thumbprint(Base64URL x5tS256) {
/*  671 */       if (x5tS256 == null) {
/*  672 */         this.x5tS256s = null;
/*      */       } else {
/*  674 */         this.x5tS256s = Collections.singleton(x5tS256);
/*      */       } 
/*  676 */       return this;
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
/*      */     public Builder x509CertSHA256Thumbprints(Base64URL... x5tS256s) {
/*  688 */       return x509CertSHA256Thumbprints(new LinkedHashSet<>(Arrays.asList(x5tS256s)));
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
/*      */     public Builder x509CertSHA256Thumbprints(Set<Base64URL> x5tS256s) {
/*  702 */       this.x5tS256s = x5tS256s;
/*  703 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public JWKMatcher build() {
/*  713 */       return new JWKMatcher(this.types, this.uses, this.ops, this.algs, this.ids, this.hasUse, this.hasID, this.privateOnly, this.publicOnly, this.minSizeBits, this.maxSizeBits, this.sizesBits, this.curves, this.x5tS256s);
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
/*      */   @Deprecated
/*      */   public JWKMatcher(Set<KeyType> types, Set<KeyUse> uses, Set<KeyOperation> ops, Set<Algorithm> algs, Set<String> ids, boolean privateOnly, boolean publicOnly) {
/*  743 */     this(types, uses, ops, algs, ids, privateOnly, publicOnly, 0, 0);
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
/*      */   @Deprecated
/*      */   public JWKMatcher(Set<KeyType> types, Set<KeyUse> uses, Set<KeyOperation> ops, Set<Algorithm> algs, Set<String> ids, boolean privateOnly, boolean publicOnly, int minSizeBits, int maxSizeBits) {
/*  778 */     this(types, uses, ops, algs, ids, privateOnly, publicOnly, minSizeBits, maxSizeBits, null);
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
/*      */   @Deprecated
/*      */   public JWKMatcher(Set<KeyType> types, Set<KeyUse> uses, Set<KeyOperation> ops, Set<Algorithm> algs, Set<String> ids, boolean privateOnly, boolean publicOnly, int minSizeBits, int maxSizeBits, Set<Curve> curves) {
/*  816 */     this(types, uses, ops, algs, ids, privateOnly, publicOnly, minSizeBits, maxSizeBits, null, curves);
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
/*      */   @Deprecated
/*      */   public JWKMatcher(Set<KeyType> types, Set<KeyUse> uses, Set<KeyOperation> ops, Set<Algorithm> algs, Set<String> ids, boolean privateOnly, boolean publicOnly, int minSizeBits, int maxSizeBits, Set<Integer> sizesBits, Set<Curve> curves) {
/*  857 */     this(types, uses, ops, algs, ids, false, false, privateOnly, publicOnly, minSizeBits, maxSizeBits, sizesBits, curves);
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
/*      */   @Deprecated
/*      */   public JWKMatcher(Set<KeyType> types, Set<KeyUse> uses, Set<KeyOperation> ops, Set<Algorithm> algs, Set<String> ids, boolean hasUse, boolean hasID, boolean privateOnly, boolean publicOnly, int minSizeBits, int maxSizeBits, Set<Integer> sizesBits, Set<Curve> curves) {
/*  902 */     this(types, uses, ops, algs, ids, hasUse, hasID, privateOnly, publicOnly, minSizeBits, maxSizeBits, sizesBits, curves, null);
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
/*      */   public JWKMatcher(Set<KeyType> types, Set<KeyUse> uses, Set<KeyOperation> ops, Set<Algorithm> algs, Set<String> ids, boolean hasUse, boolean hasID, boolean privateOnly, boolean publicOnly, int minSizeBits, int maxSizeBits, Set<Integer> sizesBits, Set<Curve> curves, Set<Base64URL> x5tS256s) {
/*  948 */     this.types = types;
/*  949 */     this.uses = uses;
/*  950 */     this.ops = ops;
/*  951 */     this.algs = algs;
/*  952 */     this.ids = ids;
/*  953 */     this.hasUse = hasUse;
/*  954 */     this.hasID = hasID;
/*  955 */     this.privateOnly = privateOnly;
/*  956 */     this.publicOnly = publicOnly;
/*  957 */     this.minSizeBits = minSizeBits;
/*  958 */     this.maxSizeBits = maxSizeBits;
/*  959 */     this.sizesBits = sizesBits;
/*  960 */     this.curves = curves;
/*  961 */     this.x5tS256s = x5tS256s;
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
/*      */   public static JWKMatcher forJWEHeader(JWEHeader jweHeader) {
/*  988 */     return (new Builder())
/*  989 */       .keyType(KeyType.forAlgorithm((Algorithm)jweHeader.getAlgorithm()))
/*  990 */       .keyID(jweHeader.getKeyID())
/*  991 */       .keyUses(new KeyUse[] { KeyUse.ENCRYPTION, null
/*  992 */         }).algorithms(new Algorithm[] { (Algorithm)jweHeader.getAlgorithm(), null
/*  993 */         }).build();
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
/*      */   public static JWKMatcher forJWSHeader(JWSHeader jwsHeader) {
/* 1022 */     JWSAlgorithm algorithm = jwsHeader.getAlgorithm();
/* 1023 */     if (JWSAlgorithm.Family.RSA.contains(algorithm) || JWSAlgorithm.Family.EC.contains(algorithm))
/*      */     {
/* 1025 */       return (new Builder())
/* 1026 */         .keyType(KeyType.forAlgorithm((Algorithm)algorithm))
/* 1027 */         .keyID(jwsHeader.getKeyID())
/* 1028 */         .keyUses(new KeyUse[] { KeyUse.SIGNATURE, null
/* 1029 */           }).algorithms(new Algorithm[] { (Algorithm)algorithm, null
/* 1030 */           }).x509CertSHA256Thumbprint(jwsHeader.getX509CertSHA256Thumbprint())
/* 1031 */         .build(); } 
/* 1032 */     if (JWSAlgorithm.Family.HMAC_SHA.contains(algorithm))
/*      */     {
/* 1034 */       return (new Builder())
/* 1035 */         .keyType(KeyType.forAlgorithm((Algorithm)algorithm))
/* 1036 */         .keyID(jwsHeader.getKeyID())
/* 1037 */         .privateOnly(true)
/* 1038 */         .algorithms(new Algorithm[] { (Algorithm)algorithm, null
/* 1039 */           }).build(); } 
/* 1040 */     if (JWSAlgorithm.Family.ED.contains(algorithm)) {
/* 1041 */       return (new Builder())
/* 1042 */         .keyType(KeyType.forAlgorithm((Algorithm)algorithm))
/* 1043 */         .keyID(jwsHeader.getKeyID())
/* 1044 */         .keyUses(new KeyUse[] { KeyUse.SIGNATURE, null
/* 1045 */           }).algorithms(new Algorithm[] { (Algorithm)algorithm, null
/* 1046 */           }).curves(Curve.forJWSAlgorithm(algorithm))
/* 1047 */         .build();
/*      */     }
/* 1049 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set<KeyType> getKeyTypes() {
/* 1060 */     return this.types;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set<KeyUse> getKeyUses() {
/* 1071 */     return this.uses;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set<KeyOperation> getKeyOperations() {
/* 1082 */     return this.ops;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set<Algorithm> getAlgorithms() {
/* 1093 */     return this.algs;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set<String> getKeyIDs() {
/* 1104 */     return this.ids;
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
/*      */   public boolean hasKeyUse() {
/* 1116 */     return this.hasUse;
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
/*      */   public boolean hasKeyID() {
/* 1128 */     return this.hasID;
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
/*      */   public boolean isPrivateOnly() {
/* 1140 */     return this.privateOnly;
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
/*      */   public boolean isPublicOnly() {
/* 1152 */     return this.publicOnly;
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
/*      */   @Deprecated
/*      */   public int getMinSize() {
/* 1165 */     return getMinKeySize();
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
/*      */   public int getMinKeySize() {
/* 1177 */     return this.minSizeBits;
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
/*      */   @Deprecated
/*      */   public int getMaxSize() {
/* 1190 */     return getMaxKeySize();
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
/*      */   public int getMaxKeySize() {
/* 1202 */     return this.maxSizeBits;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set<Integer> getKeySizes() {
/* 1213 */     return this.sizesBits;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set<Curve> getCurves() {
/* 1224 */     return this.curves;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set<Base64URL> getX509CertSHA256Thumbprints() {
/* 1234 */     return this.x5tS256s;
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
/*      */   public boolean matches(JWK key) {
/* 1246 */     if (this.hasUse && key.getKeyUse() == null) {
/* 1247 */       return false;
/*      */     }
/* 1249 */     if (this.hasID && (key.getKeyID() == null || key.getKeyID().trim().isEmpty())) {
/* 1250 */       return false;
/*      */     }
/* 1252 */     if (this.privateOnly && !key.isPrivate()) {
/* 1253 */       return false;
/*      */     }
/* 1255 */     if (this.publicOnly && key.isPrivate()) {
/* 1256 */       return false;
/*      */     }
/* 1258 */     if (this.types != null && !this.types.contains(key.getKeyType())) {
/* 1259 */       return false;
/*      */     }
/* 1261 */     if (this.uses != null && !this.uses.contains(key.getKeyUse())) {
/* 1262 */       return false;
/*      */     }
/* 1264 */     if (this.ops != null)
/*      */     {
/* 1266 */       if (!this.ops.contains(null) || key.getKeyOperations() != null)
/*      */       {
/* 1268 */         if (key.getKeyOperations() == null || !this.ops.containsAll(key.getKeyOperations()))
/*      */         {
/*      */           
/* 1271 */           return false;
/*      */         }
/*      */       }
/*      */     }
/* 1275 */     if (this.algs != null && !this.algs.contains(key.getAlgorithm())) {
/* 1276 */       return false;
/*      */     }
/* 1278 */     if (this.ids != null && !this.ids.contains(key.getKeyID())) {
/* 1279 */       return false;
/*      */     }
/* 1281 */     if (this.minSizeBits > 0)
/*      */     {
/* 1283 */       if (key.size() < this.minSizeBits) {
/* 1284 */         return false;
/*      */       }
/*      */     }
/* 1287 */     if (this.maxSizeBits > 0)
/*      */     {
/* 1289 */       if (key.size() > this.maxSizeBits) {
/* 1290 */         return false;
/*      */       }
/*      */     }
/* 1293 */     if (this.sizesBits != null && 
/* 1294 */       !this.sizesBits.contains(Integer.valueOf(key.size()))) {
/* 1295 */       return false;
/*      */     }
/*      */     
/* 1298 */     if (this.curves != null) {
/*      */       
/* 1300 */       if (!(key instanceof CurveBasedJWK)) {
/* 1301 */         return false;
/*      */       }
/* 1303 */       CurveBasedJWK curveBasedJWK = (CurveBasedJWK)key;
/*      */       
/* 1305 */       if (!this.curves.contains(curveBasedJWK.getCurve())) {
/* 1306 */         return false;
/*      */       }
/*      */     } 
/* 1309 */     if (this.x5tS256s != null) {
/* 1310 */       return this.x5tS256s.contains(key.getX509CertSHA256Thumbprint());
/*      */     }
/*      */     
/* 1313 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString() {
/* 1318 */     StringBuilder sb = new StringBuilder();
/*      */     
/* 1320 */     append(sb, "kty", this.types);
/* 1321 */     append(sb, "use", this.uses);
/* 1322 */     append(sb, "key_ops", this.ops);
/* 1323 */     append(sb, "alg", this.algs);
/* 1324 */     append(sb, "kid", this.ids);
/*      */     
/* 1326 */     if (this.hasUse) {
/* 1327 */       sb.append("has_use=true ");
/*      */     }
/*      */     
/* 1330 */     if (this.hasID) {
/* 1331 */       sb.append("has_id=true ");
/*      */     }
/*      */     
/* 1334 */     if (this.privateOnly) {
/* 1335 */       sb.append("private_only=true ");
/*      */     }
/*      */     
/* 1338 */     if (this.publicOnly) {
/* 1339 */       sb.append("public_only=true ");
/*      */     }
/*      */     
/* 1342 */     if (this.minSizeBits > 0) {
/* 1343 */       sb.append("min_size=" + this.minSizeBits + " ");
/*      */     }
/*      */     
/* 1346 */     if (this.maxSizeBits > 0) {
/* 1347 */       sb.append("max_size=" + this.maxSizeBits + " ");
/*      */     }
/*      */     
/* 1350 */     append(sb, "size", this.sizesBits);
/* 1351 */     append(sb, "crv", this.curves);
/* 1352 */     append(sb, "x5t#S256", this.x5tS256s);
/*      */     
/* 1354 */     return sb.toString().trim();
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
/*      */   private static void append(StringBuilder sb, String key, Set<?> values) {
/* 1367 */     if (values != null) {
/*      */       
/* 1369 */       sb.append(key);
/* 1370 */       sb.append('=');
/* 1371 */       if (values.size() == 1) {
/* 1372 */         Object value = values.iterator().next();
/* 1373 */         if (value == null) {
/* 1374 */           sb.append("ANY");
/*      */         } else {
/* 1376 */           sb.append(value.toString().trim());
/*      */         } 
/*      */       } else {
/* 1379 */         sb.append(values.toString().trim());
/*      */       } 
/*      */       
/* 1382 */       sb.append(' ');
/*      */     } 
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\JWKMatcher.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */