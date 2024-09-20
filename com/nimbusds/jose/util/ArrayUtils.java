/*    */ package com.nimbusds.jose.util;
/*    */ 
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
/*    */ public class ArrayUtils
/*    */ {
/*    */   public static <T> T[] concat(T[] first, T[]... rest) {
/* 40 */     int totalLength = first.length;
/* 41 */     for (T[] array : rest) {
/* 42 */       totalLength += array.length;
/*    */     }
/* 44 */     T[] result = Arrays.copyOf(first, totalLength);
/* 45 */     int offset = first.length;
/* 46 */     for (T[] array : rest) {
/* 47 */       System.arraycopy(array, 0, result, offset, array.length);
/* 48 */       offset += array.length;
/*    */     } 
/* 50 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\ArrayUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */