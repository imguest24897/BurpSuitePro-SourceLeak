/*    */ package com.exe4j.runtime.util;
/*    */ 
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class LazyFileOutputStream extends OutputStream {
/*    */   private String fileName;
/*    */   private boolean append;
/*    */   private OutputStream fos;
/*    */   
/*    */   public LazyFileOutputStream(String fileName) {
/* 14 */     this.append = fileName.endsWith("+");
/* 15 */     if (this.append) {
/* 16 */       fileName = fileName.substring(0, fileName.length() - 1);
/*    */     }
/* 18 */     this.fileName = fileName;
/*    */   }
/*    */ 
/*    */   
/*    */   public void write(byte[] b) throws IOException {
/* 23 */     init();
/* 24 */     this.fos.write(b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void write(byte[] b, int off, int len) throws IOException {
/* 29 */     init();
/* 30 */     this.fos.write(b, off, len);
/*    */   }
/*    */ 
/*    */   
/*    */   public void write(int b) throws IOException {
/* 35 */     init();
/* 36 */     this.fos.write(b);
/*    */   }
/*    */   
/*    */   private void init() {
/* 40 */     if (this.fos == null)
/*    */       try {
/* 42 */         this.fos = new FileOutputStream(this.fileName, this.append);
/* 43 */       } catch (FileNotFoundException e) {
/*    */         
/* 45 */         this.fos = new NullOutputStream();
/*    */       }  
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtim\\util\LazyFileOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */