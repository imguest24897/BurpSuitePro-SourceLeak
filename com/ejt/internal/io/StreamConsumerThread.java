/*    */ package com.ejt.internal.io;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.Writer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class StreamConsumerThread extends Thread {
/*    */   private InputStream stream;
/*    */   
/*    */   public static void consumeOutput(Process process, StringBuffer outputBuffer, boolean utf8) {
/* 13 */     consumeOutput(process, outputBuffer, outputBuffer, utf8);
/*    */   }
/*    */   private StringBuffer buffer; private boolean utf8;
/*    */   public static void consumeOutput(Process process, StringBuffer outputBuffer, StringBuffer errorBuffer, boolean utf8) {
/* 17 */     if (process != null) {
/* 18 */       StreamConsumerThread inputThread = new StreamConsumerThread(process.getInputStream(), outputBuffer, utf8);
/* 19 */       inputThread.start();
/* 20 */       StreamConsumerThread errorThread = new StreamConsumerThread(process.getErrorStream(), errorBuffer, utf8);
/* 21 */       errorThread.start();
/* 22 */       if (outputBuffer != null) {
/*    */         try {
/* 24 */           inputThread.join();
/* 25 */           errorThread.join();
/* 26 */         } catch (InterruptedException e) {
/* 27 */           e.printStackTrace();
/*    */         } 
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void consumeOutput(Process process) {
/* 34 */     consumeOutput(process, (StringBuffer)null, false);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public StreamConsumerThread(InputStream stream, StringBuffer buffer, boolean utf8) {
/* 42 */     this.stream = stream;
/* 43 */     this.buffer = buffer;
/* 44 */     this.utf8 = utf8;
/*    */   }
/*    */   
/*    */   public void run() {
/*    */     try {
/*    */       InputStreamReader reader;
/* 50 */       StringWriter writer = null;
/* 51 */       if (this.buffer != null) {
/* 52 */         writer = new StringWriter(this.buffer);
/*    */       }
/*    */       
/* 55 */       if (this.utf8) {
/* 56 */         reader = new InputStreamReader(this.stream, "UTF-8");
/*    */       } else {
/* 58 */         reader = new InputStreamReader(this.stream);
/*    */       } 
/* 60 */       CommonFileUtil.pumpCharStream(reader, writer);
/* 61 */     } catch (IOException iOException) {}
/*    */   }
/*    */ 
/*    */   
/*    */   public static class StringWriter
/*    */     extends Writer
/*    */   {
/*    */     private StringBuffer buf;
/*    */     
/*    */     public StringWriter(StringBuffer buffer) {
/* 71 */       this.buf = buffer;
/* 72 */       this.lock = this.buf;
/*    */     }
/*    */ 
/*    */     
/*    */     public void write(int c) {
/* 77 */       this.buf.append((char)c);
/*    */     }
/*    */ 
/*    */     
/*    */     public void write(@NotNull char[] buffer, int off, int len) {
/* 82 */       if (off < 0 || off > buffer.length || len < 0 || off + len > buffer.length || off + len < 0)
/*    */       {
/* 84 */         throw new IndexOutOfBoundsException(); } 
/* 85 */       if (len == 0) {
/*    */         return;
/*    */       }
/* 88 */       this.buf.append(buffer, off, len);
/*    */     }
/*    */     
/*    */     public void flush() {}
/*    */     
/*    */     public void close() throws IOException {}
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\internal\io\StreamConsumerThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */