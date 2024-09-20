/*    */ package com.install4j.api.context;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NotSupportedInElevationException
/*    */   extends RuntimeException
/*    */ {
/*    */   public NotSupportedInElevationException() {
/* 15 */     super("The method is not available in the elevated helper process");
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\NotSupportedInElevationException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */