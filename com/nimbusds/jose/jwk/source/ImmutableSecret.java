/*    */ package com.nimbusds.jose.jwk.source;
/*    */ 
/*    */ import com.nimbusds.jose.jwk.JWK;
/*    */ import com.nimbusds.jose.jwk.JWKSet;
/*    */ import com.nimbusds.jose.jwk.OctetSequenceKey;
/*    */ import com.nimbusds.jose.proc.SecurityContext;
/*    */ import javax.crypto.SecretKey;
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
/*    */ @Immutable
/*    */ public class ImmutableSecret<C extends SecurityContext>
/*    */   extends ImmutableJWKSet<C>
/*    */ {
/*    */   public ImmutableSecret(byte[] secret) {
/* 47 */     super(new JWKSet((JWK)(new OctetSequenceKey.Builder(secret)).build()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ImmutableSecret(SecretKey secretKey) {
/* 59 */     super(new JWKSet((JWK)(new OctetSequenceKey.Builder(secretKey)).build()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public byte[] getSecret() {
/* 70 */     return ((OctetSequenceKey)getJWKSet().getKeys().get(0)).toByteArray();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public SecretKey getSecretKey() {
/* 81 */     return ((OctetSequenceKey)getJWKSet().getKeys().get(0)).toSecretKey();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\source\ImmutableSecret.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */