/*    */ package com.nimbusds.jose.crypto.utils;
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
/*    */ public class ConstantTimeUtils
/*    */ {
/*    */   public static boolean areEqual(byte[] a, byte[] b) {
/* 44 */     if (a.length != b.length) {
/* 45 */       return false;
/*    */     }
/*    */     
/* 48 */     int result = 0;
/* 49 */     for (int i = 0; i < a.length; i++) {
/* 50 */       result |= a[i] ^ b[i];
/*    */     }
/*    */     
/* 53 */     return (result == 0);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypt\\utils\ConstantTimeUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */