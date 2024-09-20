/*    */ package com.nimbusds.jose.jwk.source;
/*    */ 
/*    */ import com.nimbusds.jose.jwk.JWK;
/*    */ import com.nimbusds.jose.jwk.JWKSelector;
/*    */ import com.nimbusds.jose.jwk.JWKSet;
/*    */ import com.nimbusds.jose.proc.SecurityContext;
/*    */ import java.util.List;
/*    */ import net.jcip.annotations.Immutable;
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
/*    */ @Immutable
/*    */ public class ImmutableJWKSet<C extends SecurityContext>
/*    */   implements JWKSource<C>
/*    */ {
/*    */   private final JWKSet jwkSet;
/*    */   
/*    */   public ImmutableJWKSet(JWKSet jwkSet) {
/* 52 */     if (jwkSet == null) {
/* 53 */       throw new IllegalArgumentException("The JWK set must not be null");
/*    */     }
/* 55 */     this.jwkSet = jwkSet;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public JWKSet getJWKSet() {
/* 65 */     return this.jwkSet;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public List<JWK> get(JWKSelector jwkSelector, C context) {
/* 75 */     return jwkSelector.select(this.jwkSet);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\source\ImmutableJWKSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */