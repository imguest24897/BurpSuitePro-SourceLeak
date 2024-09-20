/*     */ package com.nimbusds.jose.jwk;
/*     */ 
/*     */ import com.nimbusds.jose.Algorithm;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWSAlgorithm;
/*     */ import com.nimbusds.jose.Requirement;
/*     */ import com.nimbusds.jose.util.JSONStringUtils;
/*     */ import java.io.Serializable;
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
/*     */ @Immutable
/*     */ public final class KeyType
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private final String value;
/*     */   private final Requirement requirement;
/*  73 */   public static final KeyType EC = new KeyType("EC", Requirement.RECOMMENDED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  79 */   public static final KeyType RSA = new KeyType("RSA", Requirement.REQUIRED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  85 */   public static final KeyType OCT = new KeyType("oct", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  91 */   public static final KeyType OKP = new KeyType("OKP", Requirement.OPTIONAL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public KeyType(String value, Requirement req) {
/* 105 */     if (value == null)
/*     */     {
/* 107 */       throw new IllegalArgumentException("The key type value must not be null");
/*     */     }
/*     */     
/* 110 */     this.value = value;
/*     */     
/* 112 */     this.requirement = req;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getValue() {
/* 123 */     return this.value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Requirement getRequirement() {
/* 134 */     return this.requirement;
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
/*     */   public int hashCode() {
/* 146 */     return this.value.hashCode();
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
/*     */   public boolean equals(Object object) {
/* 161 */     return (object instanceof KeyType && 
/* 162 */       toString().equals(object.toString()));
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
/*     */   public String toString() {
/* 176 */     return this.value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toJSONString() {
/* 186 */     return JSONStringUtils.toJSONString(this.value);
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
/*     */   public static KeyType parse(String s) {
/* 200 */     if (s == null) {
/* 201 */       throw new IllegalArgumentException("The key type to parse must not be null");
/*     */     }
/*     */     
/* 204 */     if (s.equals(EC.getValue()))
/* 205 */       return EC; 
/* 206 */     if (s.equals(RSA.getValue()))
/* 207 */       return RSA; 
/* 208 */     if (s.equals(OCT.getValue()))
/* 209 */       return OCT; 
/* 210 */     if (s.equals(OKP.getValue())) {
/* 211 */       return OKP;
/*     */     }
/* 213 */     return new KeyType(s, null);
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
/*     */   public static KeyType forAlgorithm(Algorithm alg) {
/* 227 */     if (alg == null) {
/* 228 */       return null;
/*     */     }
/*     */     
/* 231 */     if (JWSAlgorithm.Family.RSA.contains(alg))
/* 232 */       return RSA; 
/* 233 */     if (JWSAlgorithm.Family.EC.contains(alg))
/* 234 */       return EC; 
/* 235 */     if (JWSAlgorithm.Family.HMAC_SHA.contains(alg))
/* 236 */       return OCT; 
/* 237 */     if (JWEAlgorithm.Family.RSA.contains(alg))
/* 238 */       return RSA; 
/* 239 */     if (JWEAlgorithm.Family.ECDH_ES.contains(alg))
/* 240 */       return EC; 
/* 241 */     if (JWEAlgorithm.DIR.equals(alg))
/* 242 */       return OCT; 
/* 243 */     if (JWEAlgorithm.Family.AES_GCM_KW.contains(alg))
/* 244 */       return OCT; 
/* 245 */     if (JWEAlgorithm.Family.AES_KW.contains(alg))
/* 246 */       return OCT; 
/* 247 */     if (JWEAlgorithm.Family.PBES2.contains(alg))
/* 248 */       return OCT; 
/* 249 */     if (JWSAlgorithm.Family.ED.contains(alg)) {
/* 250 */       return OKP;
/*     */     }
/* 252 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\KeyType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */