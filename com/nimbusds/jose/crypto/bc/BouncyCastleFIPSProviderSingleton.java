/*    */ package com.nimbusds.jose.crypto.bc;
/*    */ 
/*    */ import org.bouncycastle.jcajce.provider.BouncyCastleFipsProvider;
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
/*    */ public final class BouncyCastleFIPSProviderSingleton
/*    */ {
/*    */   private static BouncyCastleFipsProvider bouncyCastleFIPSProvider;
/*    */   
/*    */   public static BouncyCastleFipsProvider getInstance() {
/* 68 */     if (bouncyCastleFIPSProvider == null) {
/* 69 */       bouncyCastleFIPSProvider = new BouncyCastleFipsProvider();
/*    */     }
/* 71 */     return bouncyCastleFIPSProvider;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\bc\BouncyCastleFIPSProviderSingleton.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */