/*     */ package com.nimbusds.jose.proc;
/*     */ 
/*     */ import com.nimbusds.jose.JWSAlgorithm;
/*     */ import com.nimbusds.jose.JWSHeader;
/*     */ import com.nimbusds.jose.KeySourceException;
/*     */ import com.nimbusds.jose.jwk.JWK;
/*     */ import com.nimbusds.jose.jwk.JWKMatcher;
/*     */ import com.nimbusds.jose.jwk.JWKSelector;
/*     */ import com.nimbusds.jose.jwk.KeyType;
/*     */ import com.nimbusds.jose.jwk.KeyUse;
/*     */ import com.nimbusds.jose.jwk.source.JWKSource;
/*     */ import com.nimbusds.jose.jwk.source.RemoteJWKSet;
/*     */ import java.net.URL;
/*     */ import java.security.Key;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JWSAlgorithmFamilyJWSKeySelector<C extends SecurityContext>
/*     */   extends AbstractJWKSelectorWithSource<C>
/*     */   implements JWSKeySelector<C>
/*     */ {
/*  45 */   private final Map<JWSAlgorithm, JWSKeySelector<C>> selectors = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWSAlgorithmFamilyJWSKeySelector(JWSAlgorithm.Family jwsAlgFamily, JWKSource<C> jwkSource) {
/*  57 */     super(jwkSource);
/*  58 */     if (jwsAlgFamily == null) {
/*  59 */       throw new IllegalArgumentException("JWS algorithm family must not be null");
/*     */     }
/*  61 */     for (JWSAlgorithm jwsAlg : jwsAlgFamily) {
/*  62 */       this.selectors.put(jwsAlg, new JWSVerificationKeySelector<>(jwsAlg, jwkSource));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<? extends Key> selectJWSKeys(JWSHeader header, C context) throws KeySourceException {
/*  71 */     JWSKeySelector<C> selector = this.selectors.get(header.getAlgorithm());
/*  72 */     if (selector == null) {
/*  73 */       return Collections.emptyList();
/*     */     }
/*  75 */     return selector.selectJWSKeys(header, context);
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
/*     */   
/*     */   public static <C extends SecurityContext> JWSAlgorithmFamilyJWSKeySelector<C> fromJWKSetURL(URL jwkSetURL) throws KeySourceException {
/*  95 */     RemoteJWKSet remoteJWKSet = new RemoteJWKSet(jwkSetURL);
/*  96 */     return fromJWKSource((JWKSource<C>)remoteJWKSet);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <C extends SecurityContext> JWSAlgorithmFamilyJWSKeySelector<C> fromJWKSource(JWKSource<C> jwkSource) throws KeySourceException {
/* 120 */     JWKMatcher jwkMatcher = (new JWKMatcher.Builder()).publicOnly(true).keyUses(new KeyUse[] { KeyUse.SIGNATURE, null }).keyTypes(new KeyType[] { KeyType.RSA, KeyType.EC }).build();
/* 121 */     List<? extends JWK> jwks = jwkSource.get(new JWKSelector(jwkMatcher), null);
/* 122 */     for (JWK jwk : jwks) {
/* 123 */       if (KeyType.RSA.equals(jwk.getKeyType())) {
/* 124 */         return new JWSAlgorithmFamilyJWSKeySelector<>(JWSAlgorithm.Family.RSA, jwkSource);
/*     */       }
/* 126 */       if (KeyType.EC.equals(jwk.getKeyType())) {
/* 127 */         return new JWSAlgorithmFamilyJWSKeySelector<>(JWSAlgorithm.Family.EC, jwkSource);
/*     */       }
/*     */     } 
/* 130 */     throw new KeySourceException("Couldn't retrieve JWKs");
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\proc\JWSAlgorithmFamilyJWSKeySelector.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */