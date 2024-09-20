/*    */ package com.install4j.runtime.beans.actions.net;
/*    */ 
/*    */ import java.security.MessageDigest;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ 
/*    */ public enum DigestAlgorithm {
/*  7 */   SHA256("SHA-256"),
/*  8 */   MD5("MD5"),
/*  9 */   SHA256_OR_MD5("SHA-256 or MD5");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   DigestAlgorithm(String verbose) {
/* 14 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 19 */     return this.verbose;
/*    */   }
/*    */   
/*    */   public MessageDigest createMessageDigest() {
/*    */     try {
/* 24 */       switch (this) {
/*    */         case SHA256:
/* 26 */           return MessageDigest.getInstance("SHA-256");
/*    */         case MD5:
/* 28 */           return MessageDigest.getInstance("MD5");
/*    */         case SHA256_OR_MD5:
/* 30 */           return new DualDigest(true, true);
/*    */       } 
/* 32 */     } catch (NoSuchAlgorithmException e) {
/* 33 */       throw new RuntimeException(e);
/*    */     } 
/* 35 */     throw new RuntimeException();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\net\DigestAlgorithm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */