/*     */ package com.nimbusds.jose.proc;
/*     */ 
/*     */ import com.nimbusds.jose.JWSAlgorithm;
/*     */ import com.nimbusds.jose.JWSHeader;
/*     */ import com.nimbusds.jose.KeySourceException;
/*     */ import com.nimbusds.jose.jwk.JWK;
/*     */ import com.nimbusds.jose.jwk.JWKMatcher;
/*     */ import com.nimbusds.jose.jwk.JWKSelector;
/*     */ import com.nimbusds.jose.jwk.KeyConverter;
/*     */ import com.nimbusds.jose.jwk.source.JWKSource;
/*     */ import java.security.Key;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import net.jcip.annotations.ThreadSafe;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ThreadSafe
/*     */ public class JWSVerificationKeySelector<C extends SecurityContext>
/*     */   extends AbstractJWKSelectorWithSource<C>
/*     */   implements JWSKeySelector<C>
/*     */ {
/*     */   private final Set<JWSAlgorithm> jwsAlgs;
/*     */   private final boolean singleJwsAlgConstructorWasCalled;
/*     */   
/*     */   public JWSVerificationKeySelector(JWSAlgorithm jwsAlg, JWKSource<C> jwkSource) {
/*  71 */     super(jwkSource);
/*  72 */     if (jwsAlg == null) {
/*  73 */       throw new IllegalArgumentException("The JWS algorithm must not be null");
/*     */     }
/*  75 */     this.jwsAlgs = Collections.singleton(jwsAlg);
/*  76 */     this.singleJwsAlgConstructorWasCalled = true;
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
/*     */   public JWSVerificationKeySelector(Set<JWSAlgorithm> jwsAlgs, JWKSource<C> jwkSource) {
/*  88 */     super(jwkSource);
/*  89 */     if (jwsAlgs == null || jwsAlgs.isEmpty()) {
/*  90 */       throw new IllegalArgumentException("The JWS algorithms must not be null or empty");
/*     */     }
/*  92 */     this.jwsAlgs = Collections.unmodifiableSet(jwsAlgs);
/*  93 */     this.singleJwsAlgConstructorWasCalled = false;
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
/*     */   public boolean isAllowed(JWSAlgorithm jwsAlg) {
/* 105 */     return this.jwsAlgs.contains(jwsAlg);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public JWSAlgorithm getExpectedJWSAlgorithm() {
/* 117 */     if (this.singleJwsAlgConstructorWasCalled) {
/* 118 */       return this.jwsAlgs.iterator().next();
/*     */     }
/* 120 */     throw new UnsupportedOperationException("Since this class was constructed with multiple algorithms, the behavior of this method is undefined.");
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
/*     */   protected JWKMatcher createJWKMatcher(JWSHeader jwsHeader) {
/* 134 */     if (!isAllowed(jwsHeader.getAlgorithm()))
/*     */     {
/* 136 */       return null;
/*     */     }
/* 138 */     return JWKMatcher.forJWSHeader(jwsHeader);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Key> selectJWSKeys(JWSHeader jwsHeader, C context) throws KeySourceException {
/* 147 */     if (!this.jwsAlgs.contains(jwsHeader.getAlgorithm()))
/*     */     {
/* 149 */       return Collections.emptyList();
/*     */     }
/*     */     
/* 152 */     JWKMatcher jwkMatcher = createJWKMatcher(jwsHeader);
/* 153 */     if (jwkMatcher == null) {
/* 154 */       return Collections.emptyList();
/*     */     }
/*     */     
/* 157 */     List<JWK> jwkMatches = getJWKSource().get(new JWKSelector(jwkMatcher), (SecurityContext)context);
/*     */     
/* 159 */     List<Key> sanitizedKeyList = new LinkedList<>();
/*     */     
/* 161 */     for (Key key : KeyConverter.toJavaKeys(jwkMatches)) {
/* 162 */       if (key instanceof java.security.PublicKey || key instanceof javax.crypto.SecretKey) {
/* 163 */         sanitizedKeyList.add(key);
/*     */       }
/*     */     } 
/*     */     
/* 167 */     return sanitizedKeyList;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\proc\JWSVerificationKeySelector.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */