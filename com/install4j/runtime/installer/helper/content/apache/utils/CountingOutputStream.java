/*    */ package com.install4j.runtime.installer.helper.content.apache.utils;
/*    */ 
/*    */ import java.io.FilterOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ public class CountingOutputStream
/*    */   extends FilterOutputStream
/*    */ {
/* 33 */   private long bytesWritten = 0L;
/*    */   
/*    */   public CountingOutputStream(OutputStream out) {
/* 36 */     super(out);
/*    */   }
/*    */ 
/*    */   
/*    */   public void write(int b) throws IOException {
/* 41 */     this.out.write(b);
/* 42 */     count(1L);
/*    */   }
/*    */   
/*    */   public void write(@NotNull byte[] b) throws IOException {
/* 46 */     write(b, 0, b.length);
/*    */   }
/*    */   
/*    */   public void write(@NotNull byte[] b, int off, int len) throws IOException {
/* 50 */     this.out.write(b, off, len);
/* 51 */     count(len);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void count(long written) {
/* 61 */     if (written != -1L) {
/* 62 */       this.bytesWritten += written;
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getBytesWritten() {
/* 71 */     return this.bytesWritten;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\apach\\utils\CountingOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */