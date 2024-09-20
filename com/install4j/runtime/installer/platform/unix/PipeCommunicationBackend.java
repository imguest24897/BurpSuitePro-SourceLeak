/*    */ package com.install4j.runtime.installer.platform.unix;
/*    */ 
/*    */ import com.install4j.runtime.installer.helper.comm.CommunicationBackend;
/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.Channels;
/*    */ import java.nio.channels.FileChannel;
/*    */ import java.nio.file.OpenOption;
/*    */ import java.nio.file.Paths;
/*    */ import java.nio.file.StandardOpenOption;
/*    */ 
/*    */ public class PipeCommunicationBackend
/*    */   implements CommunicationBackend
/*    */ {
/*    */   private static final String SPAWNED_SUFFIX = ".spawned";
/*    */   private static final String LISTENER_SUFFIX = ".listener";
/*    */   private DataInputStream is;
/*    */   
/*    */   private String getWriteFilePath() {
/* 23 */     return this.baseFile + (this.listener ? ".listener" : ".spawned");
/*    */   }
/*    */   private DataOutputStream os; private String baseFile; private boolean listener = false;
/*    */   private String getReadFilePath() {
/* 27 */     return this.baseFile + (this.listener ? ".spawned" : ".listener");
/*    */   }
/*    */ 
/*    */   
/*    */   public String createListener() {
/*    */     try {
/* 33 */       this.listener = true;
/* 34 */       File file = File.createTempFile("i4c", ".com");
/* 35 */       file.deleteOnExit();
/* 36 */       String name = file.getAbsolutePath();
/* 37 */       while ((new File(name + ".listener")).exists() || (new File(name + ".spawned")).exists()) {
/* 38 */         file = File.createTempFile("i4c", ".com");
/* 39 */         file.deleteOnExit();
/* 40 */         name = file.getAbsolutePath();
/*    */       } 
/* 42 */       this.baseFile = name;
/*    */       
/* 44 */       Execution.executeAndWait(new String[] { "mkfifo", "-m", "0600", getReadFilePath(), getWriteFilePath() }, null);
/* 45 */       (new File(getReadFilePath())).deleteOnExit();
/* 46 */       (new File(getWriteFilePath())).deleteOnExit();
/*    */       
/* 48 */       return name;
/* 49 */     } catch (IOException e) {
/* 50 */       e.printStackTrace();
/* 51 */       return null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean connect(String identifier) {
/* 57 */     if (identifier == null) {
/* 58 */       if (this.baseFile == null) {
/* 59 */         return false;
/*    */       }
/*    */     } else {
/* 62 */       this.baseFile = identifier;
/*    */     } 
/* 64 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean writeDataBlock(byte[] bytes) {
/*    */     try {
/* 70 */       if (this.os == null) {
/* 71 */         this.os = new DataOutputStream(Channels.newOutputStream(FileChannel.open(Paths.get(getWriteFilePath(), new String[0]), new OpenOption[] { StandardOpenOption.WRITE })));
/*    */       }
/* 73 */       this.os.writeInt(bytes.length);
/* 74 */       this.os.flush();
/* 75 */       this.os.write(bytes);
/* 76 */       this.os.flush();
/* 77 */       return true;
/* 78 */     } catch (IOException e) {
/* 79 */       return false;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public byte[] readDataBlock() {
/*    */     try {
/* 86 */       if (this.is == null) {
/* 87 */         this.is = new DataInputStream(new FileInputStream(getReadFilePath()));
/*    */       }
/* 89 */       int length = this.is.readInt();
/* 90 */       byte[] ret = new byte[length];
/* 91 */       this.is.readFully(ret);
/* 92 */       return ret;
/* 93 */     } catch (IOException iOException) {
/*    */       
/* 95 */       return null;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platfor\\unix\PipeCommunicationBackend.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */