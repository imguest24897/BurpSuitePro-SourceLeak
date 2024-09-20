/*     */ package com.nimbusds.jose.jwk;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.JSONObjectUtils;
/*     */ import com.nimbusds.jose.util.StandardCharset;
/*     */ import java.security.MessageDigest;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.util.LinkedHashMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ThumbprintUtils
/*     */ {
/*     */   public static Base64URL compute(JWK jwk) throws JOSEException {
/*  55 */     return compute("SHA-256", jwk);
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
/*     */   public static Base64URL compute(String hashAlg, JWK jwk) throws JOSEException {
/*  72 */     LinkedHashMap<String, ?> orderedParams = jwk.getRequiredParams();
/*     */     
/*  74 */     return compute(hashAlg, orderedParams);
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
/*     */   public static Base64URL compute(String hashAlg, LinkedHashMap<String, ?> params) throws JOSEException {
/*     */     MessageDigest md;
/*  93 */     String json = JSONObjectUtils.toJSONString(params);
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  98 */       md = MessageDigest.getInstance(hashAlg);
/*     */     }
/* 100 */     catch (NoSuchAlgorithmException e) {
/*     */       
/* 102 */       throw new JOSEException("Couldn't compute JWK thumbprint: Unsupported hash algorithm: " + e.getMessage(), e);
/*     */     } 
/*     */     
/* 105 */     md.update(json.getBytes(StandardCharset.UTF_8));
/*     */     
/* 107 */     return Base64URL.encode(md.digest());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\ThumbprintUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */