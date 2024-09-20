/*    */ package com.nimbusds.jose.jwk;
/*    */ 
/*    */ import java.util.LinkedList;
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
/*    */ 
/*    */ 
/*    */ @Immutable
/*    */ public final class JWKSelector
/*    */ {
/*    */   private final JWKMatcher matcher;
/*    */   
/*    */   public JWKSelector(JWKMatcher matcher) {
/* 50 */     if (matcher == null) {
/* 51 */       throw new IllegalArgumentException("The JWK matcher must not be null");
/*    */     }
/*    */     
/* 54 */     this.matcher = matcher;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public JWKMatcher getMatcher() {
/* 65 */     return this.matcher;
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
/*    */ 
/*    */ 
/*    */   
/*    */   public List<JWK> select(JWKSet jwkSet) {
/* 80 */     List<JWK> selectedKeys = new LinkedList<>();
/*    */     
/* 82 */     if (jwkSet == null) {
/* 83 */       return selectedKeys;
/*    */     }
/* 85 */     for (JWK key : jwkSet.getKeys()) {
/*    */       
/* 87 */       if (this.matcher.matches(key)) {
/* 88 */         selectedKeys.add(key);
/*    */       }
/*    */     } 
/*    */     
/* 92 */     return selectedKeys;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\JWKSelector.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */