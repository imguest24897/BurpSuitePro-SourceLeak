/*    */ package com.nimbusds.jose.proc;
/*    */ 
/*    */ import com.nimbusds.jose.JWSAlgorithm;
/*    */ import com.nimbusds.jose.JWSHeader;
/*    */ import java.security.Key;
/*    */ import java.util.Collections;
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
/*    */ public class SingleKeyJWSKeySelector<C extends SecurityContext>
/*    */   implements JWSKeySelector<C>
/*    */ {
/*    */   private final List<Key> singletonKeyList;
/*    */   private final JWSAlgorithm expectedJWSAlg;
/*    */   
/*    */   public SingleKeyJWSKeySelector(JWSAlgorithm expectedJWSAlg, Key key) {
/* 35 */     if (expectedJWSAlg == null) {
/* 36 */       throw new IllegalArgumentException("The expected JWS algorithm cannot be null");
/*    */     }
/* 38 */     if (key == null) {
/* 39 */       throw new IllegalArgumentException("The key cannot be null");
/*    */     }
/* 41 */     this.singletonKeyList = Collections.singletonList(key);
/* 42 */     this.expectedJWSAlg = expectedJWSAlg;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public List<? extends Key> selectJWSKeys(JWSHeader header, C context) {
/* 49 */     if (!this.expectedJWSAlg.equals(header.getAlgorithm())) {
/* 50 */       return Collections.emptyList();
/*    */     }
/*    */     
/* 53 */     return this.singletonKeyList;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\proc\SingleKeyJWSKeySelector.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */