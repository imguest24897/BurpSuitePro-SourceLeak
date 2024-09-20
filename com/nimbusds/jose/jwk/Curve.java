/*     */ package com.nimbusds.jose.jwk;
/*     */ 
/*     */ import com.nimbusds.jose.JWSAlgorithm;
/*     */ import java.io.Serializable;
/*     */ import java.security.spec.ECParameterSpec;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.HashSet;
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
/*     */ @Immutable
/*     */ public final class Curve
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*  70 */   public static final Curve P_256 = new Curve("P-256", "secp256r1", "1.2.840.10045.3.1.7");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   public static final Curve SECP256K1 = new Curve("secp256k1", "secp256k1", "1.3.132.0.10");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*  84 */   public static final Curve P_256K = new Curve("P-256K", "secp256k1", "1.3.132.0.10");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  89 */   public static final Curve P_384 = new Curve("P-384", "secp384r1", "1.3.132.0.34");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  95 */   public static final Curve P_521 = new Curve("P-521", "secp521r1", "1.3.132.0.35");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 101 */   public static final Curve Ed25519 = new Curve("Ed25519", "Ed25519", null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 107 */   public static final Curve Ed448 = new Curve("Ed448", "Ed448", null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 113 */   public static final Curve X25519 = new Curve("X25519", "X25519", null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 119 */   public static final Curve X448 = new Curve("X448", "X448", null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final String name;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final String stdName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final String oid;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Curve(String name) {
/* 150 */     this(name, null, null);
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
/*     */   public Curve(String name, String stdName, String oid) {
/* 167 */     if (name == null) {
/* 168 */       throw new IllegalArgumentException("The JOSE cryptographic curve name must not be null");
/*     */     }
/*     */     
/* 171 */     this.name = name;
/*     */     
/* 173 */     this.stdName = stdName;
/*     */     
/* 175 */     this.oid = oid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 186 */     return this.name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStdName() {
/* 197 */     return this.stdName;
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
/*     */   public String getOID() {
/* 209 */     return this.oid;
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
/*     */   public ECParameterSpec toECParameterSpec() {
/* 221 */     return ECParameterTable.get(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 231 */     return getName();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object object) {
/* 238 */     return (object instanceof Curve && 
/* 239 */       toString().equals(object.toString()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 245 */     return Objects.hash(new Object[] { getName() });
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
/*     */   public static Curve parse(String s) {
/* 258 */     if (s == null || s.trim().isEmpty()) {
/* 259 */       throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
/*     */     }
/*     */     
/* 262 */     if (s.equals(P_256.getName()))
/* 263 */       return P_256; 
/* 264 */     if (s.equals(P_256K.getName()))
/* 265 */       return P_256K; 
/* 266 */     if (s.equals(SECP256K1.getName()))
/* 267 */       return SECP256K1; 
/* 268 */     if (s.equals(P_384.getName()))
/* 269 */       return P_384; 
/* 270 */     if (s.equals(P_521.getName()))
/* 271 */       return P_521; 
/* 272 */     if (s.equals(Ed25519.getName()))
/* 273 */       return Ed25519; 
/* 274 */     if (s.equals(Ed448.getName()))
/* 275 */       return Ed448; 
/* 276 */     if (s.equals(X25519.getName()))
/* 277 */       return X25519; 
/* 278 */     if (s.equals(X448.getName())) {
/* 279 */       return X448;
/*     */     }
/* 281 */     return new Curve(s);
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
/*     */   public static Curve forStdName(String stdName) {
/* 295 */     if ("secp256r1".equals(stdName) || "prime256v1".equals(stdName))
/* 296 */       return P_256; 
/* 297 */     if ("secp256k1".equals(stdName))
/* 298 */       return SECP256K1; 
/* 299 */     if ("secp384r1".equals(stdName))
/* 300 */       return P_384; 
/* 301 */     if ("secp521r1".equals(stdName))
/* 302 */       return P_521; 
/* 303 */     if (Ed25519.getStdName().equals(stdName))
/* 304 */       return Ed25519; 
/* 305 */     if (Ed448.getStdName().equals(stdName))
/* 306 */       return Ed448; 
/* 307 */     if (X25519.getStdName().equals(stdName))
/* 308 */       return X25519; 
/* 309 */     if (X448.getStdName().equals(stdName)) {
/* 310 */       return X448;
/*     */     }
/* 312 */     return null;
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
/*     */   public static Curve forOID(String oid) {
/* 327 */     if (P_256.getOID().equals(oid))
/* 328 */       return P_256; 
/* 329 */     if (SECP256K1.getOID().equals(oid))
/* 330 */       return SECP256K1; 
/* 331 */     if (P_384.getOID().equals(oid))
/* 332 */       return P_384; 
/* 333 */     if (P_521.getOID().equals(oid)) {
/* 334 */       return P_521;
/*     */     }
/* 336 */     return null;
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
/*     */   public static Set<Curve> forJWSAlgorithm(JWSAlgorithm alg) {
/* 351 */     if (JWSAlgorithm.ES256.equals(alg))
/* 352 */       return Collections.singleton(P_256); 
/* 353 */     if (JWSAlgorithm.ES256K.equals(alg))
/* 354 */       return Collections.singleton(SECP256K1); 
/* 355 */     if (JWSAlgorithm.ES384.equals(alg))
/* 356 */       return Collections.singleton(P_384); 
/* 357 */     if (JWSAlgorithm.ES512.equals(alg))
/* 358 */       return Collections.singleton(P_521); 
/* 359 */     if (JWSAlgorithm.EdDSA.equals(alg)) {
/* 360 */       return Collections.unmodifiableSet(new HashSet<>(
/* 361 */             Arrays.asList(new Curve[] { Ed25519, Ed448 })));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 367 */     return null;
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
/*     */   public static Curve forECParameterSpec(ECParameterSpec spec) {
/* 382 */     return ECParameterTable.get(spec);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\Curve.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */