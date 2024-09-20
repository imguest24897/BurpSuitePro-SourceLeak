/*    */ package com.install4j.runtime.installer.helper.content;
/*    */ 
/*    */ import java.io.FilterInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class CountingInputStream
/*    */   extends FilterInputStream
/*    */ {
/* 11 */   private long count = 0L;
/*    */   
/*    */   public CountingInputStream(InputStream is) {
/* 14 */     super(is);
/*    */   }
/*    */ 
/*    */   
/*    */   public int read() throws IOException {
/* 19 */     int value = this.in.read();
/* 20 */     if (value > -1) {
/* 21 */       this.count++;
/*    */     }
/* 23 */     return value;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int read(@NotNull byte[] b, int off, int len) throws IOException {
/* 29 */     int bytesRead = this.in.read(b, off, len);
/* 30 */     if (bytesRead > 0) {
/* 31 */       this.count += bytesRead;
/*    */     }
/* 33 */     return bytesRead;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public long skip(long n) throws IOException {
/* 39 */     long skipped = super.skip(n);
/* 40 */     this.count += skipped;
/* 41 */     return skipped;
/*    */   }
/*    */   
/*    */   public long getCount() {
/* 45 */     return this.count;
/*    */   }
/*    */   
/*    */   public void resetCount() {
/* 49 */     this.count = 0L;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\CountingInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */