/*    */ package com.nimbusds.jose.proc;
/*    */ 
/*    */ import com.nimbusds.jose.jwk.JWK;
/*    */ import java.util.List;
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
/*    */ public class JWKSecurityContext
/*    */   implements SecurityContext
/*    */ {
/*    */   private final List<JWK> keys;
/*    */   
/*    */   public JWKSecurityContext(List<JWK> keys) {
/* 44 */     this.keys = keys;
/*    */     
/* 46 */     if (keys == null) {
/* 47 */       throw new IllegalArgumentException("The list of keys must not be null");
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public List<JWK> getKeys() {
/* 57 */     return this.keys;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\proc\JWKSecurityContext.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */