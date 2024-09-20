/*    */ package com.nimbusds.jose.util;
/*    */ 
/*    */ import java.math.BigInteger;
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
/*    */ public class BigIntegerUtils
/*    */ {
/*    */   public static byte[] toBytesUnsigned(BigInteger bigInt) {
/* 47 */     int bitlen = bigInt.bitLength();
/*    */ 
/*    */     
/* 50 */     bitlen = bitlen + 7 >> 3 << 3;
/* 51 */     byte[] bigBytes = bigInt.toByteArray();
/*    */     
/* 53 */     if (bigInt.bitLength() % 8 != 0 && bigInt.bitLength() / 8 + 1 == bitlen / 8)
/*    */     {
/* 55 */       return bigBytes;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 60 */     int startSrc = 0;
/* 61 */     int len = bigBytes.length;
/*    */ 
/*    */     
/* 64 */     if (bigInt.bitLength() % 8 == 0) {
/*    */       
/* 66 */       startSrc = 1;
/* 67 */       len--;
/*    */     } 
/*    */     
/* 70 */     int startDst = bitlen / 8 - len;
/* 71 */     byte[] resizedBytes = new byte[bitlen / 8];
/* 72 */     System.arraycopy(bigBytes, startSrc, resizedBytes, startDst, len);
/* 73 */     return resizedBytes;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\BigIntegerUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */