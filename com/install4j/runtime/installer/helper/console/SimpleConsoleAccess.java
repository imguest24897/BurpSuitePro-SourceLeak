/*     */ package com.install4j.runtime.installer.helper.console;
/*     */ 
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ 
/*     */ public class SimpleConsoleAccess implements ConsoleAccess {
/*     */   private static final String EXE4J_PROP_CONSOLE_CODEPAGE = "exe4j.consoleCodepage";
/*     */   private static final String INSTALL4J_PROP_CONSOLE_ENCODING = "install4j.consoleEncoding";
/*     */   
/*     */   public SimpleConsoleAccess() {
/*  19 */     String encoding = System.getProperty("install4j.consoleEncoding");
/*     */     
/*  21 */     if (encoding == null) {
/*  22 */       encoding = System.getProperty("exe4j.consoleCodepage");
/*     */     }
/*     */     
/*  25 */     if (encoding == null) {
/*  26 */       this.stdout = new PrintWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out)));
/*  27 */       this.stdin = new BufferedReader(new InputStreamReader(new FileInputStream(FileDescriptor.in)));
/*     */     } else {
/*     */       try {
/*  30 */         this.stdout = new PrintWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), encoding));
/*  31 */         this.stdin = new BufferedReader(new InputStreamReader(new FileInputStream(FileDescriptor.in), encoding));
/*  32 */       } catch (UnsupportedEncodingException e) {
/*  33 */         this.stdout = new PrintWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out)));
/*  34 */         this.stdin = new BufferedReader(new InputStreamReader(new FileInputStream(FileDescriptor.in)));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   private BufferedReader stdin; private PrintWriter stdout; private Thread ioThread;
/*     */   
/*     */   public void print(String text) {
/*  41 */     this.stdout.print(text);
/*     */   }
/*     */ 
/*     */   
/*     */   public void println(String text) {
/*  46 */     this.stdout.println(text);
/*     */   }
/*     */ 
/*     */   
/*     */   public void println() {
/*  51 */     this.stdout.println();
/*     */   }
/*     */ 
/*     */   
/*     */   public void flush() {
/*  56 */     this.stdout.flush();
/*     */   }
/*     */ 
/*     */   
/*     */   public String readLine(String prompt) throws UserCanceledException {
/*  61 */     this.ioThread = Thread.currentThread();
/*     */     try {
/*  63 */       InputReaderThread inputReaderThread = new InputReaderThread();
/*  64 */       inputReaderThread.start();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*     */     finally {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  77 */       synchronized (this) {
/*  78 */         Thread.interrupted();
/*  79 */         this.ioThread = null;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String readPassword(String prompt) throws UserCanceledException {
/*  86 */     return readLine(prompt);
/*     */   }
/*     */ 
/*     */   
/*     */   public void cancel() {
/*  91 */     if (this.ioThread != null)
/*  92 */       this.ioThread.interrupt(); 
/*     */   }
/*     */   
/*     */   private class InputReaderThread
/*     */     extends Thread {
/*     */     private String result;
/*     */     
/*     */     public InputReaderThread() {
/* 100 */       super("console input reader thread");
/*     */     }
/*     */     
/*     */     public String getResult() {
/* 104 */       return this.result;
/*     */     }
/*     */ 
/*     */     
/*     */     public void run() {
/*     */       try {
/* 110 */         defaultRead();
/* 111 */       } catch (IOException e) {
/* 112 */         e.printStackTrace();
/* 113 */         this.result = "";
/* 114 */       } catch (Exception e) {
/* 115 */         this.result = null;
/*     */       } 
/*     */     }
/*     */     
/*     */     private void defaultRead() throws IOException {
/* 120 */       String rawResult = SimpleConsoleAccess.this.stdin.readLine();
/*     */       
/*     */       int startIndex;
/* 123 */       for (startIndex = 0; startIndex < rawResult.length() && 
/* 124 */         Character.isISOControl(rawResult.charAt(startIndex)); startIndex++);
/*     */ 
/*     */ 
/*     */       
/* 128 */       if (startIndex > 0) {
/* 129 */         rawResult = rawResult.substring(startIndex);
/* 130 */       } else if (startIndex == rawResult.length()) {
/* 131 */         rawResult = "";
/*     */       } 
/* 133 */       StringBuilder resBuffer = new StringBuilder();
/* 134 */       for (int i = 0; i < rawResult.length(); i++) {
/* 135 */         if (rawResult.charAt(i) == '') {
/* 136 */           if (resBuffer.length() > 0) {
/* 137 */             resBuffer.setLength(resBuffer.length() - 1);
/*     */           }
/*     */         } else {
/* 140 */           resBuffer.append(rawResult.charAt(i));
/*     */         } 
/*     */       } 
/* 143 */       this.result = resBuffer.toString();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\console\SimpleConsoleAccess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */