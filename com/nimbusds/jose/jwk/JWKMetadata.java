/*     */ package com.nimbusds.jose.jwk;
/*     */ 
/*     */ import com.nimbusds.jose.Algorithm;
/*     */ import com.nimbusds.jose.util.Base64;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.JSONObjectUtils;
/*     */ import com.nimbusds.jose.util.X509CertChainUtils;
/*     */ import java.net.URI;
/*     */ import java.text.ParseException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ final class JWKMetadata
/*     */ {
/*     */   static KeyType parseKeyType(Map<String, Object> o) throws ParseException {
/*     */     try {
/*  56 */       return KeyType.parse(JSONObjectUtils.getString(o, "kty"));
/*  57 */     } catch (IllegalArgumentException e) {
/*  58 */       throw new ParseException(e.getMessage(), 0);
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
/*     */   static KeyUse parseKeyUse(Map<String, Object> o) throws ParseException {
/*  76 */     return KeyUse.parse(JSONObjectUtils.getString(o, "use"));
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
/*     */   static Set<KeyOperation> parseKeyOperations(Map<String, Object> o) throws ParseException {
/*  92 */     return KeyOperation.parse(JSONObjectUtils.getStringList(o, "key_ops"));
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
/*     */   static Algorithm parseAlgorithm(Map<String, Object> o) throws ParseException {
/* 108 */     return Algorithm.parse(JSONObjectUtils.getString(o, "alg"));
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
/*     */   static String parseKeyID(Map<String, Object> o) throws ParseException {
/* 124 */     return JSONObjectUtils.getString(o, "kid");
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
/*     */   static URI parseX509CertURL(Map<String, Object> o) throws ParseException {
/* 140 */     return JSONObjectUtils.getURI(o, "x5u");
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
/*     */   static Base64URL parseX509CertThumbprint(Map<String, Object> o) throws ParseException {
/* 157 */     return JSONObjectUtils.getBase64URL(o, "x5t");
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
/*     */   static Base64URL parseX509CertSHA256Thumbprint(Map<String, Object> o) throws ParseException {
/* 174 */     return JSONObjectUtils.getBase64URL(o, "x5t#S256");
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
/*     */   static List<Base64> parseX509CertChain(Map<String, Object> o) throws ParseException {
/* 193 */     List<Base64> chain = X509CertChainUtils.toBase64List(JSONObjectUtils.getJSONArray(o, "x5c"));
/*     */     
/* 195 */     if (chain == null || !chain.isEmpty()) {
/* 196 */       return chain;
/*     */     }
/*     */     
/* 199 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\JWKMetadata.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */