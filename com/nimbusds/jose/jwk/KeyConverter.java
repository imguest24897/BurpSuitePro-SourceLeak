/*    */ package com.nimbusds.jose.jwk;
/*    */ 
/*    */ import com.nimbusds.jose.JOSEException;
/*    */ import java.security.Key;
/*    */ import java.security.KeyPair;
/*    */ import java.util.Collections;
/*    */ import java.util.LinkedList;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class KeyConverter
/*    */ {
/*    */   public static List<Key> toJavaKeys(List<JWK> jwkList) {
/* 51 */     if (jwkList == null) {
/* 52 */       return Collections.emptyList();
/*    */     }
/*    */     
/* 55 */     List<Key> out = new LinkedList<>();
/* 56 */     for (JWK jwk : jwkList) {
/*    */       try {
/* 58 */         if (jwk instanceof AsymmetricJWK) {
/* 59 */           KeyPair keyPair = ((AsymmetricJWK)jwk).toKeyPair();
/* 60 */           out.add(keyPair.getPublic());
/* 61 */           if (keyPair.getPrivate() != null)
/* 62 */             out.add(keyPair.getPrivate());  continue;
/*    */         } 
/* 64 */         if (jwk instanceof SecretJWK) {
/* 65 */           out.add(((SecretJWK)jwk).toSecretKey());
/*    */         }
/* 67 */       } catch (JOSEException jOSEException) {}
/*    */     } 
/*    */ 
/*    */     
/* 71 */     return out;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\KeyConverter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */