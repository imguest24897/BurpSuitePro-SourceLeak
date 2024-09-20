/*     */ package com.nimbusds.jose;
/*     */ 
/*     */ import com.nimbusds.jose.util.ArrayUtils;
/*     */ import java.util.Collection;
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
/*     */ @Immutable
/*     */ public final class JWEAlgorithm
/*     */   extends Algorithm
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Deprecated
/*  71 */   public static final JWEAlgorithm RSA1_5 = new JWEAlgorithm("RSA1_5", Requirement.REQUIRED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*  81 */   public static final JWEAlgorithm RSA_OAEP = new JWEAlgorithm("RSA-OAEP", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  89 */   public static final JWEAlgorithm RSA_OAEP_256 = new JWEAlgorithm("RSA-OAEP-256", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  97 */   public static final JWEAlgorithm RSA_OAEP_384 = new JWEAlgorithm("RSA-OAEP-384", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 105 */   public static final JWEAlgorithm RSA_OAEP_512 = new JWEAlgorithm("RSA-OAEP-512", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 112 */   public static final JWEAlgorithm A128KW = new JWEAlgorithm("A128KW", Requirement.RECOMMENDED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 119 */   public static final JWEAlgorithm A192KW = new JWEAlgorithm("A192KW", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 126 */   public static final JWEAlgorithm A256KW = new JWEAlgorithm("A256KW", Requirement.RECOMMENDED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 134 */   public static final JWEAlgorithm DIR = new JWEAlgorithm("dir", Requirement.RECOMMENDED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 144 */   public static final JWEAlgorithm ECDH_ES = new JWEAlgorithm("ECDH-ES", Requirement.RECOMMENDED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 153 */   public static final JWEAlgorithm ECDH_ES_A128KW = new JWEAlgorithm("ECDH-ES+A128KW", Requirement.RECOMMENDED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 162 */   public static final JWEAlgorithm ECDH_ES_A192KW = new JWEAlgorithm("ECDH-ES+A192KW", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 171 */   public static final JWEAlgorithm ECDH_ES_A256KW = new JWEAlgorithm("ECDH-ES+A256KW", Requirement.RECOMMENDED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 181 */   public static final JWEAlgorithm ECDH_1PU = new JWEAlgorithm("ECDH-1PU", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 190 */   public static final JWEAlgorithm ECDH_1PU_A128KW = new JWEAlgorithm("ECDH-1PU+A128KW", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 199 */   public static final JWEAlgorithm ECDH_1PU_A192KW = new JWEAlgorithm("ECDH-1PU+A192KW", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 208 */   public static final JWEAlgorithm ECDH_1PU_A256KW = new JWEAlgorithm("ECDH-1PU+A256KW", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 214 */   public static final JWEAlgorithm A128GCMKW = new JWEAlgorithm("A128GCMKW", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 220 */   public static final JWEAlgorithm A192GCMKW = new JWEAlgorithm("A192GCMKW", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 226 */   public static final JWEAlgorithm A256GCMKW = new JWEAlgorithm("A256GCMKW", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 233 */   public static final JWEAlgorithm PBES2_HS256_A128KW = new JWEAlgorithm("PBES2-HS256+A128KW", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 240 */   public static final JWEAlgorithm PBES2_HS384_A192KW = new JWEAlgorithm("PBES2-HS384+A192KW", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 247 */   public static final JWEAlgorithm PBES2_HS512_A256KW = new JWEAlgorithm("PBES2-HS512+A256KW", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Family
/*     */     extends AlgorithmFamily<JWEAlgorithm>
/*     */   {
/*     */     private static final long serialVersionUID = 1L;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 262 */     public static final Family RSA = new Family(new JWEAlgorithm[] { JWEAlgorithm.RSA1_5, JWEAlgorithm.RSA_OAEP, JWEAlgorithm.RSA_OAEP_256, JWEAlgorithm.RSA_OAEP_384, JWEAlgorithm.RSA_OAEP_512 });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 268 */     public static final Family AES_KW = new Family(new JWEAlgorithm[] { JWEAlgorithm.A128KW, JWEAlgorithm.A192KW, JWEAlgorithm.A256KW });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 275 */     public static final Family ECDH_ES = new Family(new JWEAlgorithm[] { JWEAlgorithm.ECDH_ES, JWEAlgorithm.ECDH_ES_A128KW, JWEAlgorithm.ECDH_ES_A192KW, JWEAlgorithm.ECDH_ES_A256KW });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 281 */     public static final Family ECDH_1PU = new Family(new JWEAlgorithm[] { JWEAlgorithm.ECDH_1PU, JWEAlgorithm.ECDH_1PU_A128KW, JWEAlgorithm.ECDH_1PU_A192KW, JWEAlgorithm.ECDH_1PU_A256KW });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 287 */     public static final Family AES_GCM_KW = new Family(new JWEAlgorithm[] { JWEAlgorithm.A128GCMKW, JWEAlgorithm.A192GCMKW, JWEAlgorithm.A256GCMKW });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 293 */     public static final Family PBES2 = new Family(new JWEAlgorithm[] { JWEAlgorithm.PBES2_HS256_A128KW, JWEAlgorithm.PBES2_HS384_A192KW, JWEAlgorithm.PBES2_HS512_A256KW });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 300 */     public static final Family ASYMMETRIC = new Family((JWEAlgorithm[])ArrayUtils.concat(RSA
/* 301 */           .toArray((Object[])new JWEAlgorithm[0]), (Object[][])new JWEAlgorithm[][] { (JWEAlgorithm[])ECDH_ES
/* 302 */             .toArray((Object[])new JWEAlgorithm[0]) }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 309 */     public static final Family SYMMETRIC = new Family((JWEAlgorithm[])ArrayUtils.concat(AES_KW
/* 310 */           .toArray((Object[])new JWEAlgorithm[0]), (Object[][])new JWEAlgorithm[][] { (JWEAlgorithm[])AES_GCM_KW
/* 311 */             .toArray((Object[])new JWEAlgorithm[0]), { JWEAlgorithm.DIR } }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Family(JWEAlgorithm... algs) {
/* 322 */       super(algs);
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
/*     */   public JWEAlgorithm(String name, Requirement req) {
/* 336 */     super(name, req);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWEAlgorithm(String name) {
/* 347 */     super(name, null);
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
/*     */   public static JWEAlgorithm parse(String s) {
/* 361 */     if (s.equals(RSA1_5.getName()))
/* 362 */       return RSA1_5; 
/* 363 */     if (s.equals(RSA_OAEP.getName()))
/* 364 */       return RSA_OAEP; 
/* 365 */     if (s.equals(RSA_OAEP_256.getName()))
/* 366 */       return RSA_OAEP_256; 
/* 367 */     if (s.equals(RSA_OAEP_384.getName()))
/* 368 */       return RSA_OAEP_384; 
/* 369 */     if (s.equals(RSA_OAEP_512.getName()))
/* 370 */       return RSA_OAEP_512; 
/* 371 */     if (s.equals(A128KW.getName()))
/* 372 */       return A128KW; 
/* 373 */     if (s.equals(A192KW.getName()))
/* 374 */       return A192KW; 
/* 375 */     if (s.equals(A256KW.getName()))
/* 376 */       return A256KW; 
/* 377 */     if (s.equals(DIR.getName()))
/* 378 */       return DIR; 
/* 379 */     if (s.equals(ECDH_ES.getName()))
/* 380 */       return ECDH_ES; 
/* 381 */     if (s.equals(ECDH_ES_A128KW.getName()))
/* 382 */       return ECDH_ES_A128KW; 
/* 383 */     if (s.equals(ECDH_ES_A192KW.getName()))
/* 384 */       return ECDH_ES_A192KW; 
/* 385 */     if (s.equals(ECDH_ES_A256KW.getName()))
/* 386 */       return ECDH_ES_A256KW; 
/* 387 */     if (s.equals(ECDH_1PU.getName()))
/* 388 */       return ECDH_1PU; 
/* 389 */     if (s.equals(ECDH_1PU_A128KW.getName()))
/* 390 */       return ECDH_1PU_A128KW; 
/* 391 */     if (s.equals(ECDH_1PU_A192KW.getName()))
/* 392 */       return ECDH_1PU_A192KW; 
/* 393 */     if (s.equals(ECDH_1PU_A256KW.getName()))
/* 394 */       return ECDH_1PU_A256KW; 
/* 395 */     if (s.equals(A128GCMKW.getName()))
/* 396 */       return A128GCMKW; 
/* 397 */     if (s.equals(A192GCMKW.getName()))
/* 398 */       return A192GCMKW; 
/* 399 */     if (s.equals(A256GCMKW.getName()))
/* 400 */       return A256GCMKW; 
/* 401 */     if (s.equals(PBES2_HS256_A128KW.getName()))
/* 402 */       return PBES2_HS256_A128KW; 
/* 403 */     if (s.equals(PBES2_HS384_A192KW.getName()))
/* 404 */       return PBES2_HS384_A192KW; 
/* 405 */     if (s.equals(PBES2_HS512_A256KW.getName())) {
/* 406 */       return PBES2_HS512_A256KW;
/*     */     }
/* 408 */     return new JWEAlgorithm(s);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\JWEAlgorithm.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */