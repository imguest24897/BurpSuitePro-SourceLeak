/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
/*    */ import java.io.Reader;
/*    */ import java.util.Iterator;
/*    */ import java.util.NoSuchElementException;
/*    */ 
/*    */ public class LineIterator
/*    */   implements Iterator<String>, Closeable {
/*    */   private BufferedReader bufferedReader;
/*    */   private String cachedLine;
/*    */   private boolean finished = false;
/*    */   
/*    */   public LineIterator(Reader reader) throws IllegalArgumentException {
/* 17 */     if (reader instanceof BufferedReader) {
/* 18 */       this.bufferedReader = (BufferedReader)reader;
/*    */     } else {
/* 20 */       this.bufferedReader = new BufferedReader(reader);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasNext() {
/* 26 */     if (this.cachedLine != null)
/* 27 */       return true; 
/* 28 */     if (this.finished) {
/* 29 */       return false;
/*    */     }
/*    */     try {
/* 32 */       String line = this.bufferedReader.readLine();
/* 33 */       if (line == null) {
/* 34 */         this.finished = true;
/* 35 */         return false;
/*    */       } 
/* 37 */       this.cachedLine = line;
/* 38 */       return true;
/*    */     }
/* 40 */     catch (IOException e) {
/*    */       try {
/* 42 */         close();
/* 43 */       } catch (IOException iOException) {}
/*    */       
/* 45 */       throw new IllegalStateException(e);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String next() {
/* 52 */     if (!hasNext()) {
/* 53 */       throw new NoSuchElementException();
/*    */     }
/* 55 */     String currentLine = this.cachedLine;
/* 56 */     this.cachedLine = null;
/* 57 */     return currentLine;
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() throws IOException {
/* 62 */     this.finished = true;
/* 63 */     this.bufferedReader.close();
/* 64 */     this.cachedLine = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void remove() {
/* 69 */     throw new UnsupportedOperationException();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\LineIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */