/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.RandomAccessFile;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.charset.Charset;
/*     */ import java.util.LinkedList;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class LogFileTailer
/*     */   extends Thread
/*     */ {
/*  15 */   public static final boolean DEBUG = Boolean.getBoolean("install4j.debugLogFileTailer");
/*     */   
/*     */   private static final String REPLACEMENT = "�";
/*     */   
/*     */   private static final int BUFFER_SIZE = 4096;
/*     */   
/*     */   private final File file;
/*     */   
/*     */   private final TailListener listener;
/*     */   private boolean initialScan = true;
/*     */   private LineQueue lineQueue;
/*     */   private Charset charset;
/*     */   private int maxBytesPerChar;
/*     */   private byte[] newline;
/*  29 */   private long lastPosition = 0L;
/*  30 */   private int replacementOffset = 0;
/*  31 */   private ByteBuffer readBuffer = ByteBuffer.allocate(4096);
/*  32 */   private ByteArrayOutputStream lineBuffer = new ByteArrayOutputStream();
/*     */   
/*     */   public LogFileTailer(File file, Charset charset, int maxLines, TailListener listener) {
/*  35 */     this.file = file;
/*  36 */     this.charset = charset;
/*  37 */     this.listener = listener;
/*     */     
/*  39 */     this.lineQueue = new LineQueue(maxLines);
/*  40 */     this.maxBytesPerChar = (int)this.charset.newEncoder().maxBytesPerChar();
/*  41 */     this.newline = "\n".getBytes(this.charset);
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*     */     while (true) {
/*  47 */       if (isInterrupted()) {
/*     */         return;
/*     */       }
/*     */       try {
/*  51 */         checkLogFile();
/*  52 */       } catch (IOException e) {
/*  53 */         if (DEBUG) {
/*  54 */           e.printStackTrace();
/*     */         }
/*  56 */       } catch (InterruptedException e) {
/*  57 */         if (DEBUG) {
/*  58 */           e.printStackTrace();
/*     */         }
/*     */         return;
/*     */       } 
/*  62 */       if (this.initialScan) {
/*  63 */         if (DEBUG) {
/*  64 */           System.err.println("initial scan complete");
/*  65 */           System.err.println("initial text: " + getText());
/*     */         } 
/*  67 */         this.listener.setText(getText());
/*  68 */         this.initialScan = false;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private String getText() {
/*  74 */     StringBuilder buffer = new StringBuilder();
/*  75 */     for (String line : this.lineQueue) {
/*  76 */       buffer.append(line);
/*     */     }
/*  78 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   private void checkLogFile() throws IOException, InterruptedException {
/*  82 */     Thread.sleep(200L);
/*  83 */     if (DEBUG) {
/*  84 */       boolean exists = this.file.exists();
/*  85 */       System.err.println(this.file.getPath() + " exists " + exists + (exists ? (", length " + this.file.length()) : "") + ", last position " + this.lastPosition + ", initial scan " + this.initialScan);
/*     */     } 
/*  87 */     long fileLength = this.file.length();
/*  88 */     if (!this.initialScan && fileLength < this.lastPosition) {
/*  89 */       logFileRotated();
/*  90 */     } else if (fileLength > this.lastPosition) {
/*  91 */       if (DEBUG) {
/*  92 */         System.err.println("open file");
/*     */       }
/*  94 */       this.readBuffer.clear();
/*  95 */       this.readBuffer.flip();
/*  96 */       RandomAccessFile randomFileAccess = new RandomAccessFile(this.file, "r");
/*  97 */       randomFileAccess.seek(this.lastPosition - this.replacementOffset);
/*  98 */       this.replacementOffset = 0;
/*     */       String line;
/* 100 */       while ((this.readBuffer.hasRemaining() || randomFileAccess.getFilePointer() < randomFileAccess.length()) && (line = readLine(randomFileAccess)) != null) {
/* 101 */         if (DEBUG) {
/* 102 */           System.err.println("line read: " + line);
/*     */         }
/* 104 */         if (this.initialScan) {
/* 105 */           this.lineQueue.add(line); continue;
/*     */         } 
/* 107 */         this.lineQueue.addText(line);
/* 108 */         if (DEBUG) {
/* 109 */           System.err.println("notify listener");
/*     */         }
/* 111 */         this.listener.addText(line);
/*     */       } 
/*     */       
/* 114 */       if (DEBUG) {
/* 115 */         System.err.println("close file");
/*     */       }
/* 117 */       this.lastPosition = randomFileAccess.getFilePointer();
/* 118 */       randomFileAccess.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void logFileRotated() throws IOException, InterruptedException {
/* 123 */     if (DEBUG) {
/* 124 */       System.err.println("log file rotated");
/*     */     }
/* 126 */     this.lineQueue.clear();
/* 127 */     this.replacementOffset = 0;
/* 128 */     this.lastPosition = 0L;
/* 129 */     this.initialScan = true;
/* 130 */     checkLogFile();
/*     */   }
/*     */   
/*     */   public String readLine(RandomAccessFile in) throws IOException {
/* 134 */     this.lineBuffer.reset();
/* 135 */     boolean eof = false;
/* 136 */     int newlineCheckPosition = 0;
/*     */     while (true) {
/* 138 */       if (!this.readBuffer.hasRemaining() && !fillBuffer(in)) {
/* 139 */         eof = true;
/*     */         break;
/*     */       } 
/* 142 */       byte b = this.readBuffer.get();
/* 143 */       this.lineBuffer.write(b);
/* 144 */       if (b == this.newline[newlineCheckPosition]) {
/* 145 */         if (++newlineCheckPosition == this.newline.length)
/*     */           break; 
/*     */         continue;
/*     */       } 
/* 149 */       newlineCheckPosition = 0;
/*     */     } 
/*     */     
/* 152 */     byte[] bytes = this.lineBuffer.toByteArray();
/* 153 */     String string = new String(bytes, this.charset);
/* 154 */     if (eof) {
/* 155 */       while (string.endsWith("�") && this.replacementOffset < this.maxBytesPerChar - 1) {
/*     */         
/* 157 */         this.replacementOffset++;
/* 158 */         string = new String(bytes, 0, bytes.length - this.replacementOffset);
/*     */       } 
/*     */     }
/* 161 */     return string;
/*     */   } public static interface TailListener {
/*     */     void setText(@NotNull String param1String); void addText(@NotNull String param1String); void removeFirstLine(); }
/*     */   private boolean fillBuffer(RandomAccessFile in) throws IOException {
/* 165 */     this.readBuffer.clear();
/* 166 */     int bytesRead = in.getChannel().read(this.readBuffer);
/* 167 */     this.readBuffer.flip();
/* 168 */     return (bytesRead > 0);
/*     */   }
/*     */   
/*     */   private class LineQueue
/*     */     extends LinkedList<String>
/*     */   {
/*     */     public LineQueue(int capacity) {
/* 175 */       this.capacity = capacity;
/*     */     }
/*     */     private int capacity;
/*     */     
/*     */     public boolean add(String e) {
/* 180 */       if (size() >= this.capacity) {
/* 181 */         removeFirst();
/* 182 */         LogFileTailer.this.listener.removeFirstLine();
/*     */       } 
/* 184 */       return super.add(e);
/*     */     }
/*     */     
/*     */     public void addText(String text) {
/* 188 */       if (size() > 0) {
/* 189 */         String lastLine = getLast();
/* 190 */         if (!lastLine.endsWith("\n")) {
/* 191 */           removeLast();
/* 192 */           add(lastLine + text);
/*     */         } else {
/* 194 */           add(text);
/*     */         } 
/*     */       } else {
/* 197 */         add(text);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\LogFileTailer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */