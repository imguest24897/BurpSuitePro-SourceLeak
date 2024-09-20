/*    */ package com.exe4j.runtime.util;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class EmptyInputStream
/*    */   extends InputStream {
/*    */   public int read() throws IOException {
/*    */     while (true) {
/*    */       try {
/*    */         while (true)
/* 12 */           Thread.sleep(Long.MAX_VALUE);  break;
/* 13 */       } catch (InterruptedException e) {
/* 14 */         e.printStackTrace();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtim\\util\EmptyInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */