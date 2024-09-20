/*    */ package com.nimbusds.jose;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ActionRequiredForJWSCompletionException
/*    */   extends JOSEException
/*    */ {
/*    */   private final JWSSignerOption option;
/*    */   private final CompletableJWSObjectSigning completableSigning;
/*    */   
/*    */   public ActionRequiredForJWSCompletionException(String message, JWSSignerOption option, CompletableJWSObjectSigning completableSigning) {
/* 47 */     super(message);
/* 48 */     if (option == null) {
/* 49 */       throw new IllegalArgumentException("The triggering option must not be null");
/*    */     }
/* 51 */     this.option = option;
/*    */     
/* 53 */     if (completableSigning == null) {
/* 54 */       throw new IllegalArgumentException("The completable signing must not be null");
/*    */     }
/* 56 */     this.completableSigning = completableSigning;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public JWSSignerOption getTriggeringOption() {
/* 66 */     return this.option;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public CompletableJWSObjectSigning getCompletableJWSObjectSigning() {
/* 77 */     return this.completableSigning;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\ActionRequiredForJWSCompletionException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */