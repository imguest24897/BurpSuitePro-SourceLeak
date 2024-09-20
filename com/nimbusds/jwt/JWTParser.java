/*    */ package com.nimbusds.jwt;
/*    */ 
/*    */ import com.nimbusds.jose.Algorithm;
/*    */ import com.nimbusds.jose.Header;
/*    */ import com.nimbusds.jose.util.Base64URL;
/*    */ import com.nimbusds.jose.util.JSONObjectUtils;
/*    */ import java.text.ParseException;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class JWTParser
/*    */ {
/*    */   public static JWT parse(String s) throws ParseException {
/*    */     Map<String, Object> jsonObject;
/* 57 */     int firstDotPos = s.indexOf(".");
/*    */     
/* 59 */     if (firstDotPos == -1) {
/* 60 */       throw new ParseException("Invalid JWT serialization: Missing dot delimiter(s)", 0);
/*    */     }
/* 62 */     Base64URL header = new Base64URL(s.substring(0, firstDotPos));
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/* 67 */       jsonObject = JSONObjectUtils.parse(header.decodeToString());
/*    */     }
/* 69 */     catch (ParseException e) {
/*    */       
/* 71 */       throw new ParseException("Invalid unsecured/JWS/JWE header: " + e.getMessage(), 0);
/*    */     } 
/*    */     
/* 74 */     Algorithm alg = Header.parseAlgorithm(jsonObject);
/*    */     
/* 76 */     if (alg.equals(Algorithm.NONE))
/* 77 */       return PlainJWT.parse(s); 
/* 78 */     if (alg instanceof com.nimbusds.jose.JWSAlgorithm)
/* 79 */       return SignedJWT.parse(s); 
/* 80 */     if (alg instanceof com.nimbusds.jose.JWEAlgorithm) {
/* 81 */       return EncryptedJWT.parse(s);
/*    */     }
/* 83 */     throw new AssertionError("Unexpected algorithm type: " + alg);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jwt\JWTParser.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */