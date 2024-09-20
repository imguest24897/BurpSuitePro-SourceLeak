/*    */ package com.nimbusds.jose.crypto.bc;
/*    */ 
/*    */ import org.bouncycastle.jce.provider.BouncyCastleProvider;
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
/*    */ public final class BouncyCastleProviderSingleton
/*    */ {
/*    */   private static BouncyCastleProvider bouncyCastleProvider;
/*    */   
/*    */   public static BouncyCastleProvider getInstance() {
/* 68 */     if (bouncyCastleProvider == null) {
/* 69 */       bouncyCastleProvider = new BouncyCastleProvider();
/*    */     }
/* 71 */     return bouncyCastleProvider;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\bc\BouncyCastleProviderSingleton.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */