/*    */ package com.install4j.runtime.beans.actions.net;
/*    */ 
/*    */ import java.security.MessageDigest;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ 
/*    */ public class DualDigest extends MessageDigest {
/*    */   private final MessageDigest md5;
/*    */   private final MessageDigest sha256;
/*    */   
/*    */   public DualDigest(boolean useSha256, boolean useMd5) {
/* 11 */     super("SHA-256_AND_MD5");
/*    */     try {
/* 13 */       if (useMd5) {
/* 14 */         this.md5 = MessageDigest.getInstance("MD5");
/*    */       } else {
/* 16 */         this.md5 = null;
/*    */       } 
/* 18 */       if (useSha256) {
/* 19 */         this.sha256 = MessageDigest.getInstance("SHA-256");
/*    */       } else {
/* 21 */         this.sha256 = null;
/*    */       } 
/* 23 */     } catch (NoSuchAlgorithmException e) {
/* 24 */       throw new RuntimeException(e);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void engineReset() {
/* 30 */     reset(this.md5);
/* 31 */     reset(this.sha256);
/*    */   }
/*    */   
/*    */   private static void reset(MessageDigest md) {
/* 35 */     if (md != null) {
/* 36 */       md.reset();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void engineUpdate(byte input) {
/* 42 */     update(this.md5, input);
/* 43 */     update(this.sha256, input);
/*    */   }
/*    */   
/*    */   private static void update(MessageDigest md, byte input) {
/* 47 */     if (md != null) {
/* 48 */       md.update(input);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void engineUpdate(byte[] input, int offset, int len) {
/* 54 */     update(this.md5, input, offset, len);
/* 55 */     update(this.sha256, input, offset, len);
/*    */   }
/*    */   
/*    */   private static void update(MessageDigest md, byte[] input, int offset, int len) {
/* 59 */     if (md != null) {
/* 60 */       md.update(input, offset, len);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public byte[] engineDigest() {
/* 66 */     return new byte[0];
/*    */   }
/*    */   
/*    */   public MessageDigest getMd5() {
/* 70 */     return this.md5;
/*    */   }
/*    */   
/*    */   public MessageDigest getSha256() {
/* 74 */     return this.sha256;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\net\DualDigest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */