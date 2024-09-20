/*    */ package com.install4j.runtime.installer.platform.win32.wininet;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ class WinInetInputStream
/*    */   extends InputStream {
/*    */   private final CallImpl call;
/*    */   
/*    */   public WinInetInputStream(CallImpl call) {
/* 12 */     this.call = call;
/*    */   }
/*    */ 
/*    */   
/*    */   public int read() throws IOException {
/* 17 */     return this.call.read();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int read(@NotNull byte[] b, int off, int len) throws IOException {
/* 23 */     if (b == null)
/* 24 */       throw new NullPointerException(); 
/* 25 */     if (off < 0 || len < 0 || len > b.length - off)
/* 26 */       throw new IndexOutOfBoundsException(); 
/* 27 */     if (len == 0) {
/* 28 */       return 0;
/*    */     }
/* 30 */     return this.call.read(b, off, len);
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() throws IOException {
/* 35 */     this.call.close();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\wininet\WinInetInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */