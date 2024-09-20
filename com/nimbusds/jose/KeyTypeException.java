/*    */ package com.nimbusds.jose;
/*    */ 
/*    */ import java.security.Key;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class KeyTypeException
/*    */   extends KeyException
/*    */ {
/*    */   public KeyTypeException(Class<? extends Key> expectedKeyClass) {
/* 43 */     super("Invalid key: Must be an instance of " + expectedKeyClass);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public KeyTypeException(Class<? extends Key> expectedKeyInterface, Class<?>... additionalInterfaces) {
/* 55 */     super("Invalid key: Must be an instance of " + expectedKeyInterface + " and implement all of the following interfaces " + 
/* 56 */         Arrays.toString((Object[])additionalInterfaces));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\KeyTypeException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */