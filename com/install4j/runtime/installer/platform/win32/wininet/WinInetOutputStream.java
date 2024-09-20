/*    */ package com.install4j.runtime.installer.platform.win32.wininet;
/*    */ 
/*    */ import java.io.ByteArrayOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ final class WinInetOutputStream extends ByteArrayOutputStream {
/*    */   private final CallImpl call;
/*    */   
/*    */   public WinInetOutputStream(CallImpl call, long contentLength) throws IOException {
/* 10 */     super(getByteArrayLength(contentLength));
/* 11 */     this.call = call;
/*    */   }
/*    */   
/*    */   private static int getByteArrayLength(long contentLength) throws IOException {
/* 15 */     if (contentLength > 2147483647L) {
/* 16 */       throw new IOException("maximum content length is 2147483647");
/*    */     }
/* 18 */     return (int)contentLength;
/*    */   }
/*    */   
/*    */   public void close() throws IOException {
/* 22 */     super.close();
/* 23 */     this.call.sendRequest();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\wininet\WinInetOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */