/*    */ package com.nimbusds.jose.crypto.opts;
/*    */ 
/*    */ import com.nimbusds.jose.JWSSignerOption;
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
/*    */ @Immutable
/*    */ public final class UserAuthenticationRequired
/*    */   implements JWSSignerOption
/*    */ {
/* 36 */   private static final UserAuthenticationRequired SINGLETON = new UserAuthenticationRequired();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static UserAuthenticationRequired getInstance() {
/* 45 */     return SINGLETON;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 55 */     return "UserAuthenticationRequired";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\opts\UserAuthenticationRequired.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */