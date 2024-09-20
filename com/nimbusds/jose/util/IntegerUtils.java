/*    */ package com.nimbusds.jose.util;
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
/*    */ public class IntegerUtils
/*    */ {
/*    */   public static byte[] toBytes(int intValue) {
/* 39 */     byte[] res = new byte[4];
/* 40 */     res[0] = (byte)(intValue >>> 24);
/* 41 */     res[1] = (byte)(intValue >>> 16 & 0xFF);
/* 42 */     res[2] = (byte)(intValue >>> 8 & 0xFF);
/* 43 */     res[3] = (byte)(intValue & 0xFF);
/* 44 */     return res;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\IntegerUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */