/*    */ package com.nimbusds.jose.jwk.source;
/*    */ 
/*    */ import com.nimbusds.jose.jwk.JWKSet;
/*    */ import java.util.Date;
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
/*    */ @Immutable
/*    */ public final class JWKSetWithTimestamp
/*    */ {
/*    */   private final JWKSet jwkSet;
/*    */   private final Date timestamp;
/*    */   
/*    */   public JWKSetWithTimestamp(JWKSet jwkSet) {
/* 48 */     this(jwkSet, new Date());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public JWKSetWithTimestamp(JWKSet jwkSet, Date timestamp) {
/* 59 */     if (jwkSet == null) {
/* 60 */       throw new IllegalArgumentException("The JWK set must not be null");
/*    */     }
/* 62 */     this.jwkSet = jwkSet;
/* 63 */     if (timestamp == null) {
/* 64 */       throw new IllegalArgumentException("The timestamp must not null");
/*    */     }
/* 66 */     this.timestamp = timestamp;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public JWKSet getJWKSet() {
/* 76 */     return this.jwkSet;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Date getDate() {
/* 86 */     return this.timestamp;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\source\JWKSetWithTimestamp.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */