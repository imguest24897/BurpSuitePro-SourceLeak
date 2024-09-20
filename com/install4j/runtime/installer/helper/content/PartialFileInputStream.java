/*    */ package com.install4j.runtime.installer.helper.content;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ class PartialFileInputStream
/*    */   extends InputStream
/*    */ {
/*    */   private CountingInputStream in;
/*    */   private long size;
/*    */   
/*    */   protected PartialFileInputStream(File file, long position, long size) throws IOException {
/* 17 */     this.size = size;
/* 18 */     this.in = new CountingInputStream(new FileInputStream(file));
/* 19 */     fullySkip(position);
/* 20 */     this.in.resetCount();
/*    */   }
/*    */ 
/*    */   
/*    */   public int read() throws IOException {
/* 25 */     if (isEOF()) {
/* 26 */       return -1;
/*    */     }
/* 28 */     return this.in.read();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int read(@NotNull byte[] b) throws IOException {
/* 34 */     return read(b, 0, b.length);
/*    */   }
/*    */ 
/*    */   
/*    */   public int read(@NotNull byte[] b, int off, int len) throws IOException {
/* 39 */     long readLength = getReadLength(len);
/* 40 */     if (readLength == 0L && len > 0) {
/* 41 */       return -1;
/*    */     }
/* 43 */     return this.in.read(b, off, (int)readLength);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public long skip(long n) throws IOException {
/* 49 */     return this.in.skip(getReadLength(n));
/*    */   }
/*    */ 
/*    */   
/*    */   public int available() throws IOException {
/* 54 */     return (int)getReadLength(this.in.available());
/*    */   }
/*    */   
/*    */   private long getReadLength(long desiredLength) {
/* 58 */     return Math.min(getRestLength(), desiredLength);
/*    */   }
/*    */   
/*    */   private boolean isEOF() {
/* 62 */     return (getRestLength() <= 0L);
/*    */   }
/*    */   
/*    */   private long getRestLength() {
/* 66 */     return this.size - this.in.getCount();
/*    */   }
/*    */   
/*    */   private void fullySkip(long position) throws IOException {
/* 70 */     long total = 0L;
/*    */     
/*    */     long cur;
/* 73 */     while (total < position && (cur = this.in.skip(position - total)) > 0L) {
/* 74 */       total += cur;
/*    */     }
/*    */     
/* 77 */     if (total < position)
/* 78 */       throw new IOException("could not seek pos " + position); 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\PartialFileInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */