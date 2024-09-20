/*    */ package org.brotli.dec;
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
/*    */ final class Utils
/*    */ {
/* 14 */   private static final byte[] BYTE_ZEROES = new byte[1024];
/*    */   
/* 16 */   private static final int[] INT_ZEROES = new int[1024];
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
/*    */   static void fillWithZeroes(byte[] dest, int offset, int length) {
/* 29 */     int cursor = 0;
/* 30 */     while (cursor < length) {
/* 31 */       int step = Math.min(cursor + 1024, length) - cursor;
/* 32 */       System.arraycopy(BYTE_ZEROES, 0, dest, offset + cursor, step);
/* 33 */       cursor += step;
/*    */     } 
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
/*    */ 
/*    */   
/*    */   static void fillWithZeroes(int[] dest, int offset, int length) {
/* 48 */     int cursor = 0;
/* 49 */     while (cursor < length) {
/* 50 */       int step = Math.min(cursor + 1024, length) - cursor;
/* 51 */       System.arraycopy(INT_ZEROES, 0, dest, offset + cursor, step);
/* 52 */       cursor += step;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\brotli\dec\Utils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */