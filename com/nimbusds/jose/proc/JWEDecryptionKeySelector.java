/*     */ package com.nimbusds.jose.proc;
/*     */ 
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWEHeader;
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
/*     */ 
/*     */ 
/*     */ @ThreadSafe
/*     */ public class JWEDecryptionKeySelector<C extends SecurityContext>
/*     */   extends AbstractJWKSelectorWithSource<C>
/*     */   implements JWEKeySelector<C>
/*     */ {
/*     */   private final JWEAlgorithm jweAlg;
/*     */   private final EncryptionMethod jweEnc;
/*     */   
/*     */   public JWEDecryptionKeySelector(JWEAlgorithm jweAlg, EncryptionMethod jweEnc, JWKSource<C> jwkSource) {
/*  73 */     super(jwkSource);
/*  74 */     if (jweAlg == null) {
/*  75 */       throw new IllegalArgumentException("The JWE algorithm must not be null");
/*     */     }
/*  77 */     this.jweAlg = jweAlg;
/*  78 */     if (jweEnc == null) {
/*  79 */       throw new IllegalArgumentException("The JWE encryption method must not be null");
/*     */     }
/*  81 */     this.jweEnc = jweEnc;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWEAlgorithm getExpectedJWEAlgorithm() {
/*  91 */     return this.jweAlg;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EncryptionMethod getExpectedJWEEncryptionMethod() {
/* 101 */     return this.jweEnc;
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
/*     */   protected JWKMatcher createJWKMatcher(JWEHeader jweHeader) {
/* 115 */     if (!getExpectedJWEAlgorithm().equals(jweHeader.getAlgorithm())) {
/* 116 */       return null;
/*     */     }
/*     */     
/* 119 */     if (!getExpectedJWEEncryptionMethod().equals(jweHeader.getEncryptionMethod())) {
/* 120 */       return null;
/*     */     }
/*     */     
/* 123 */     return JWKMatcher.forJWEHeader(jweHeader);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Key> selectJWEKeys(JWEHeader jweHeader, C context) throws KeySourceException {
/* 131 */     if (!this.jweAlg.equals(jweHeader.getAlgorithm()) || !this.jweEnc.equals(jweHeader.getEncryptionMethod()))
/*     */     {
/* 133 */       return Collections.emptyList();
/*     */     }
/*     */     
/* 136 */     JWKMatcher jwkMatcher = createJWKMatcher(jweHeader);
/* 137 */     List<JWK> jwkMatches = getJWKSource().get(new JWKSelector(jwkMatcher), (SecurityContext)context);
/* 138 */     List<Key> sanitizedKeyList = new LinkedList<>();
/*     */     
/* 140 */     for (Key key : KeyConverter.toJavaKeys(jwkMatches)) {
/* 141 */       if (key instanceof java.security.PrivateKey || key instanceof javax.crypto.SecretKey) {
/* 142 */         sanitizedKeyList.add(key);
/*     */       }
/*     */     } 
/*     */     
/* 146 */     return sanitizedKeyList;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\proc\JWEDecryptionKeySelector.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */