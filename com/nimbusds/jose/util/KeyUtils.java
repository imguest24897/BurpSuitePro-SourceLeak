/*    */ package com.nimbusds.jose.util;
/*    */ 
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.crypto.spec.SecretKeySpec;
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
/*    */ public class KeyUtils
/*    */ {
/*    */   public static SecretKey toAESKey(SecretKey secretKey) {
/* 44 */     if (secretKey == null) {
/* 45 */       return null;
/*    */     }
/*    */     
/* 48 */     return new SecretKeySpec(secretKey.getEncoded(), "AES");
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\KeyUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */