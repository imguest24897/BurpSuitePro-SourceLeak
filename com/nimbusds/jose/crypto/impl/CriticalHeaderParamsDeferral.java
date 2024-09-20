/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.Header;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import java.util.Collections;
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
/*     */ public class CriticalHeaderParamsDeferral
/*     */ {
/*  41 */   private Set<String> deferredParams = Collections.emptySet();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getProcessedCriticalHeaderParams() {
/*  52 */     return Collections.singleton("b64");
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
/*     */   public Set<String> getDeferredCriticalHeaderParams() {
/*  66 */     return Collections.unmodifiableSet(this.deferredParams);
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
/*     */   public void setDeferredCriticalHeaderParams(Set<String> defCritHeaders) {
/*  80 */     if (defCritHeaders == null) {
/*  81 */       this.deferredParams = Collections.emptySet();
/*     */     } else {
/*  83 */       this.deferredParams = defCritHeaders;
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
/*     */   public boolean headerPasses(Header header) {
/* 101 */     if (header.getCriticalParams() == null) {
/* 102 */       return true;
/*     */     }
/*     */     
/* 105 */     for (String critParam : header.getCriticalParams()) {
/* 106 */       if (getProcessedCriticalHeaderParams().contains(critParam)) {
/*     */         continue;
/*     */       }
/* 109 */       if (getDeferredCriticalHeaderParams().contains(critParam)) {
/*     */         continue;
/*     */       }
/* 112 */       return false;
/*     */     } 
/* 114 */     return true;
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
/*     */   public void ensureHeaderPasses(JWEHeader header) throws JOSEException {
/* 129 */     if (!headerPasses((Header)header))
/* 130 */       throw new JOSEException("Unsupported critical header parameter(s)"); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\CriticalHeaderParamsDeferral.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */