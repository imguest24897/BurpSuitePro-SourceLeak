/*    */ package com.nimbusds.jose.proc;
/*    */ 
/*    */ import com.nimbusds.jose.jwk.source.JWKSource;
/*    */ import net.jcip.annotations.ThreadSafe;
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
/*    */ @ThreadSafe
/*    */ abstract class AbstractJWKSelectorWithSource<C extends SecurityContext>
/*    */ {
/*    */   private final JWKSource<C> jwkSource;
/*    */   
/*    */   public AbstractJWKSelectorWithSource(JWKSource<C> jwkSource) {
/* 47 */     if (jwkSource == null) {
/* 48 */       throw new IllegalArgumentException("The JWK source must not be null");
/*    */     }
/* 50 */     this.jwkSource = jwkSource;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public JWKSource<C> getJWKSource() {
/* 60 */     return this.jwkSource;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\proc\AbstractJWKSelectorWithSource.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */