/*    */ package com.install4j.runtime.installer.helper.content;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ class SplittedFileInputStream extends InputStream {
/*    */   private CountingInputStream in;
/*    */   private long currentFileSize;
/*    */   private File mainFile;
/* 14 */   private int nextIndex = 0;
/*    */   
/*    */   protected SplittedFileInputStream(File mainFile) throws FileNotFoundException {
/* 17 */     this.in = new CountingInputStream(new FileInputStream(mainFile));
/* 18 */     this.currentFileSize = mainFile.length();
/* 19 */     this.mainFile = mainFile;
/*    */   }
/*    */   
/*    */   private boolean checkNextFile() throws IOException {
/* 23 */     File newFile = new File(this.mainFile.getAbsolutePath() + "." + this.nextIndex++);
/* 24 */     if (newFile.exists()) {
/* 25 */       this.in.close();
/* 26 */       this.in = new CountingInputStream(new FileInputStream(newFile));
/* 27 */       this.currentFileSize = newFile.length();
/* 28 */       return true;
/*    */     } 
/* 30 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int read() throws IOException {
/* 35 */     int res = this.in.read();
/* 36 */     if (res == -1 && checkNextFile()) {
/* 37 */       return read();
/*    */     }
/* 39 */     return res;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int read(@NotNull byte[] b) throws IOException {
/* 45 */     return read(b, 0, b.length);
/*    */   }
/*    */ 
/*    */   
/*    */   public int read(@NotNull byte[] b, int off, int len) throws IOException {
/* 50 */     if (isCurrentEOF() && checkNextFile()) {
/* 51 */       return read(b, off, len);
/*    */     }
/* 53 */     return this.in.read(b, off, len);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public long skip(long n) throws IOException {
/* 59 */     if (isCurrentEOF() && checkNextFile()) {
/* 60 */       return skip(n);
/*    */     }
/* 62 */     return this.in.skip(n);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int available() throws IOException {
/* 68 */     if (isCurrentEOF() && checkNextFile()) {
/* 69 */       return available();
/*    */     }
/* 71 */     return this.in.available();
/*    */   }
/*    */ 
/*    */   
/*    */   private boolean isCurrentEOF() {
/* 76 */     return (this.in.getCount() >= this.currentFileSize);
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() throws IOException {
/* 81 */     this.in.close();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\SplittedFileInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */