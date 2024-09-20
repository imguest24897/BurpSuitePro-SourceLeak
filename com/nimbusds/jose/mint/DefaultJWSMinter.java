/*     */ package com.nimbusds.jose.mint;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWSHeader;
/*     */ import com.nimbusds.jose.JWSObject;
/*     */ import com.nimbusds.jose.Payload;
/*     */ import com.nimbusds.jose.crypto.factories.DefaultJWSSignerFactory;
/*     */ import com.nimbusds.jose.jwk.JWK;
/*     */ import com.nimbusds.jose.jwk.JWKMatcher;
/*     */ import com.nimbusds.jose.jwk.JWKSelector;
/*     */ import com.nimbusds.jose.jwk.JWKSet;
/*     */ import com.nimbusds.jose.jwk.source.JWKSource;
/*     */ import com.nimbusds.jose.proc.JWKSecurityContext;
/*     */ import com.nimbusds.jose.proc.SecurityContext;
/*     */ import com.nimbusds.jose.produce.JWSSignerFactory;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DefaultJWSMinter<C extends SecurityContext>
/*     */   implements ConfigurableJWSMinter<C>
/*     */ {
/*     */   private JWKSource<C> jwkSource;
/*  50 */   private JWSSignerFactory jwsSignerFactory = (JWSSignerFactory)new DefaultJWSSignerFactory();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWSObject mint(JWSHeader header, Payload payload, C context) throws JOSEException {
/* 111 */     List<JWK> jwks = jwks(header, context);
/* 112 */     if (jwks.isEmpty()) {
/* 113 */       throw new JOSEException("No JWKs found for signing");
/*     */     }
/* 115 */     JWK jwk = jwks.get(0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     JWSHeader withJwk = (new JWSHeader.Builder(header)).keyID(jwk.getKeyID()).x509CertURL(jwk.getX509CertURL()).x509CertChain(jwk.getX509CertChain()).x509CertSHA256Thumbprint(jwk.getX509CertSHA256Thumbprint()).x509CertThumbprint(jwk.getX509CertThumbprint()).build();
/* 123 */     JWSObject jws = new JWSObject(withJwk, payload);
/* 124 */     if (this.jwsSignerFactory == null) {
/* 125 */       throw new JOSEException("No JWS signer factory configured");
/*     */     }
/* 127 */     jws.sign(this.jwsSignerFactory.createJWSSigner(jwk));
/* 128 */     return jws;
/*     */   }
/*     */ 
/*     */   
/*     */   private List<JWK> jwks(JWSHeader header, C context) throws JOSEException {
/* 133 */     JWKMatcher matcher = JWKMatcher.forJWSHeader(header);
/* 134 */     JWKSelector selector = new JWKSelector(matcher);
/* 135 */     if (context instanceof JWKSecurityContext) {
/* 136 */       return selector.select(new JWKSet(((JWKSecurityContext)context).getKeys()));
/*     */     }
/* 138 */     if (this.jwkSource == null) {
/* 139 */       throw new JOSEException("No JWK source configured");
/*     */     }
/* 141 */     return this.jwkSource.get(selector, (SecurityContext)context);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public JWKSource<C> getJWKSource() {
/* 147 */     return this.jwkSource;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWKSource(JWKSource<C> jwkSource) {
/* 153 */     this.jwkSource = jwkSource;
/*     */   }
/*     */ 
/*     */   
/*     */   public JWSSignerFactory getJWSSignerFactory() {
/* 158 */     return this.jwsSignerFactory;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWSSignerFactory(JWSSignerFactory jwsSignerFactory) {
/* 164 */     this.jwsSignerFactory = jwsSignerFactory;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\mint\DefaultJWSMinter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */