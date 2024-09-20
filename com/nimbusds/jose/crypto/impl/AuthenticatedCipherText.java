/*    */ package com.nimbusds.jose.crypto.impl;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Immutable
/*    */ public final class AuthenticatedCipherText
/*    */ {
/*    */   private final byte[] cipherText;
/*    */   private final byte[] authenticationTag;
/*    */   
/*    */   public AuthenticatedCipherText(byte[] cipherText, byte[] authenticationTag) {
/* 55 */     if (cipherText == null) {
/* 56 */       throw new IllegalArgumentException("The cipher text must not be null");
/*    */     }
/* 58 */     this.cipherText = cipherText;
/*    */ 
/*    */     
/* 61 */     if (authenticationTag == null) {
/* 62 */       throw new IllegalArgumentException("The authentication tag must not be null");
/*    */     }
/* 64 */     this.authenticationTag = authenticationTag;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public byte[] getCipherText() {
/* 75 */     return this.cipherText;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public byte[] getAuthenticationTag() {
/* 86 */     return this.authenticationTag;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\AuthenticatedCipherText.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */