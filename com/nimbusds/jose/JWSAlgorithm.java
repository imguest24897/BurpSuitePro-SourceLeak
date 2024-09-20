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
/*     */ @Immutable
/*     */ public final class JWSAlgorithm
/*     */   extends Algorithm
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*  65 */   public static final JWSAlgorithm HS256 = new JWSAlgorithm("HS256", Requirement.REQUIRED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  71 */   public static final JWSAlgorithm HS384 = new JWSAlgorithm("HS384", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  77 */   public static final JWSAlgorithm HS512 = new JWSAlgorithm("HS512", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  83 */   public static final JWSAlgorithm RS256 = new JWSAlgorithm("RS256", Requirement.RECOMMENDED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  89 */   public static final JWSAlgorithm RS384 = new JWSAlgorithm("RS384", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  95 */   public static final JWSAlgorithm RS512 = new JWSAlgorithm("RS512", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 102 */   public static final JWSAlgorithm ES256 = new JWSAlgorithm("ES256", Requirement.RECOMMENDED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 109 */   public static final JWSAlgorithm ES256K = new JWSAlgorithm("ES256K", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 115 */   public static final JWSAlgorithm ES384 = new JWSAlgorithm("ES384", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 121 */   public static final JWSAlgorithm ES512 = new JWSAlgorithm("ES512", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 128 */   public static final JWSAlgorithm PS256 = new JWSAlgorithm("PS256", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 135 */   public static final JWSAlgorithm PS384 = new JWSAlgorithm("PS384", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 142 */   public static final JWSAlgorithm PS512 = new JWSAlgorithm("PS512", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 148 */   public static final JWSAlgorithm EdDSA = new JWSAlgorithm("EdDSA", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Family
/*     */     extends AlgorithmFamily<JWSAlgorithm>
/*     */   {
/*     */     private static final long serialVersionUID = 1L;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 163 */     public static final Family HMAC_SHA = new Family(new JWSAlgorithm[] { JWSAlgorithm.HS256, JWSAlgorithm.HS384, JWSAlgorithm.HS512 });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     public static final Family RSA = new Family(new JWSAlgorithm[] { JWSAlgorithm.RS256, JWSAlgorithm.RS384, JWSAlgorithm.RS512, JWSAlgorithm.PS256, JWSAlgorithm.PS384, JWSAlgorithm.PS512 });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 176 */     public static final Family EC = new Family(new JWSAlgorithm[] { JWSAlgorithm.ES256, JWSAlgorithm.ES256K, JWSAlgorithm.ES384, JWSAlgorithm.ES512 });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 182 */     public static final Family ED = new Family(new JWSAlgorithm[] { JWSAlgorithm.EdDSA });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 188 */     public static final Family SIGNATURE = new Family(
/* 189 */         (JWSAlgorithm[])ArrayUtils.concat(RSA
/* 190 */           .toArray((Object[])new JWSAlgorithm[0]), (Object[][])new JWSAlgorithm[][] { (JWSAlgorithm[])EC
/* 191 */             .toArray((Object[])new JWSAlgorithm[0]), (JWSAlgorithm[])ED
/* 192 */             .toArray((Object[])new JWSAlgorithm[0]) }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Family(JWSAlgorithm... algs) {
/* 204 */       super(algs);
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
/*     */   public JWSAlgorithm(String name, Requirement req) {
/* 218 */     super(name, req);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWSAlgorithm(String name) {
/* 229 */     super(name, null);
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
/*     */   public static JWSAlgorithm parse(String s) {
/* 243 */     if (s.equals(HS256.getName()))
/* 244 */       return HS256; 
/* 245 */     if (s.equals(HS384.getName()))
/* 246 */       return HS384; 
/* 247 */     if (s.equals(HS512.getName()))
/* 248 */       return HS512; 
/* 249 */     if (s.equals(RS256.getName()))
/* 250 */       return RS256; 
/* 251 */     if (s.equals(RS384.getName()))
/* 252 */       return RS384; 
/* 253 */     if (s.equals(RS512.getName()))
/* 254 */       return RS512; 
/* 255 */     if (s.equals(ES256.getName()))
/* 256 */       return ES256; 
/* 257 */     if (s.equals(ES256K.getName()))
/* 258 */       return ES256K; 
/* 259 */     if (s.equals(ES384.getName()))
/* 260 */       return ES384; 
/* 261 */     if (s.equals(ES512.getName()))
/* 262 */       return ES512; 
/* 263 */     if (s.equals(PS256.getName()))
/* 264 */       return PS256; 
/* 265 */     if (s.equals(PS384.getName()))
/* 266 */       return PS384; 
/* 267 */     if (s.equals(PS512.getName()))
/* 268 */       return PS512; 
/* 269 */     if (s.equals(EdDSA.getName())) {
/* 270 */       return EdDSA;
/*     */     }
/* 272 */     return new JWSAlgorithm(s);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\JWSAlgorithm.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */