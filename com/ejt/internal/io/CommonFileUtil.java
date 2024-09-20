/*    */ package com.ejt.internal.io;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.Writer;
/*    */ import java.util.LinkedList;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class CommonFileUtil {
/*    */   public static long pumpCharStream(Reader reader, Writer writer) throws IOException {
/* 12 */     long count = 0L;
/*    */     int c;
/* 14 */     while ((c = reader.read()) != -1) {
/* 15 */       if (writer != null) {
/* 16 */         writer.write(c);
/*    */       }
/* 18 */       count++;
/*    */     } 
/*    */     
/* 21 */     if (writer != null) {
/* 22 */       writer.flush();
/*    */     }
/*    */     
/* 25 */     return count;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static LinkedList<String> readLines(File file) throws IOException {
/* 30 */     FileInputStream fis = null;
/*    */     try {
/* 32 */       fis = new FileInputStream(file);
/* 33 */       return readLines(fis);
/*    */     } finally {
/* 35 */       if (fis != null) {
/*    */         try {
/* 37 */           fis.close();
/* 38 */         } catch (IOException iOException) {}
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static LinkedList<String> readLines(InputStream fis) throws IOException {
/* 46 */     LinkedList<String> lineList = new LinkedList<String>();
/* 47 */     BufferedReader br = new BufferedReader(new InputStreamReader(fis));
/*    */     String line;
/* 49 */     while ((line = br.readLine()) != null) {
/* 50 */       while (line.endsWith("\r") || line.endsWith("\n")) {
/* 51 */         line = line.substring(0, line.length() - 1);
/*    */       }
/* 53 */       lineList.add(line);
/*    */     } 
/* 55 */     return lineList;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\internal\io\CommonFileUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */