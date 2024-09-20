/*    */ package com.nimbusds.jose.crypto.opts;
/*    */ 
/*    */ import com.nimbusds.jose.JWSSignerOption;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class OptionUtils
/*    */ {
/*    */   public static <T extends JWSSignerOption> boolean optionIsPresent(Set<JWSSignerOption> opts, Class<T> tClass) {
/* 43 */     if (opts == null || opts.isEmpty()) {
/* 44 */       return false;
/*    */     }
/*    */     
/* 47 */     for (JWSSignerOption o : opts) {
/*    */       
/* 49 */       if (o.getClass().isAssignableFrom(tClass)) {
/* 50 */         return true;
/*    */       }
/*    */     } 
/*    */     
/* 54 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\opts\OptionUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */