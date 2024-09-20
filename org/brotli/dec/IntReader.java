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
/*    */ final class IntReader
/*    */ {
/*    */   private byte[] byteBuffer;
/*    */   private int[] intBuffer;
/*    */   
/*    */   static void init(IntReader ir, byte[] byteBuffer, int[] intBuffer) {
/* 18 */     ir.byteBuffer = byteBuffer;
/* 19 */     ir.intBuffer = intBuffer;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   static void convert(IntReader ir, int intLen) {
/* 29 */     for (int i = 0; i < intLen; i++)
/* 30 */       ir.intBuffer[i] = ir.byteBuffer[i * 4] & 0xFF | (ir.byteBuffer[i * 4 + 1] & 0xFF) << 8 | (ir.byteBuffer[i * 4 + 2] & 0xFF) << 16 | (ir.byteBuffer[i * 4 + 3] & 0xFF) << 24; 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\brotli\dec\IntReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */