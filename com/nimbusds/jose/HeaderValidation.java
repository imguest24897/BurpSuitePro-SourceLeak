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
/*    */ 
/*    */ class HeaderValidation
/*    */ {
/*    */   static void ensureDisjoint(JWSHeader jwsHeader, UnprotectedHeader unprotectedHeader) throws IllegalHeaderException {
/* 44 */     if (jwsHeader == null || unprotectedHeader == null) {
/*    */       return;
/*    */     }
/*    */     
/* 48 */     for (String unprotectedParamName : unprotectedHeader.getIncludedParams()) {
/* 49 */       if (jwsHeader.getIncludedParams().contains(unprotectedParamName))
/* 50 */         throw new IllegalHeaderException("The parameters in the JWS protected header and the unprotected header must be disjoint"); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\HeaderValidation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */