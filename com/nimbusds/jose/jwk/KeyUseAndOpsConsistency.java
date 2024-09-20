/*    */ package com.nimbusds.jose.jwk;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.Collections;
/*    */ import java.util.HashMap;
/*    */ import java.util.HashSet;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
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
/*    */ class KeyUseAndOpsConsistency
/*    */ {
/*    */   static final Map<KeyUse, Set<KeyOperation>> MAP;
/*    */   
/*    */   static {
/* 42 */     Map<KeyUse, Set<KeyOperation>> map = new HashMap<>();
/* 43 */     map.put(KeyUse.SIGNATURE, new HashSet<>(
/*    */           
/* 45 */           Arrays.asList(new KeyOperation[] { KeyOperation.SIGN, KeyOperation.VERIFY })));
/*    */ 
/*    */     
/* 48 */     map.put(KeyUse.ENCRYPTION, new HashSet<>(
/*    */           
/* 50 */           Arrays.asList(new KeyOperation[] { KeyOperation.ENCRYPT, KeyOperation.DECRYPT, KeyOperation.WRAP_KEY, KeyOperation.UNWRAP_KEY })));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 56 */     MAP = Collections.unmodifiableMap(map);
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
/*    */ 
/*    */ 
/*    */   
/*    */   static boolean areConsistent(KeyUse use, Set<KeyOperation> ops) {
/* 74 */     if (use == null || ops == null) {
/* 75 */       return true;
/*    */     }
/*    */     
/* 78 */     return (!MAP.containsKey(use) || ((Set)MAP.get(use)).containsAll(ops));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\KeyUseAndOpsConsistency.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */