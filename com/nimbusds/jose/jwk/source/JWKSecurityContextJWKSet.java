/*    */ package com.nimbusds.jose.jwk.source;
/*    */ 
/*    */ import com.nimbusds.jose.KeySourceException;
/*    */ import com.nimbusds.jose.jwk.JWK;
/*    */ import com.nimbusds.jose.jwk.JWKSelector;
/*    */ import com.nimbusds.jose.jwk.JWKSet;
/*    */ import com.nimbusds.jose.proc.JWKSecurityContext;
/*    */ import com.nimbusds.jose.proc.SecurityContext;
/*    */ import java.util.List;
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
/*    */ public class JWKSecurityContextJWKSet
/*    */   implements JWKSource<JWKSecurityContext>
/*    */ {
/*    */   public List<JWK> get(JWKSelector jwkSelector, JWKSecurityContext context) throws KeySourceException {
/* 43 */     if (context == null) {
/* 44 */       throw new IllegalArgumentException("Security Context must not be null");
/*    */     }
/*    */     
/* 47 */     return jwkSelector.select(new JWKSet(context.getKeys()));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\source\JWKSecurityContextJWKSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */