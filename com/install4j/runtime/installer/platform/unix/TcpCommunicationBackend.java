/*     */ package com.install4j.runtime.installer.platform.unix;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.comm.CommunicationBackend;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.net.InetAddress;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.ServerSocket;
/*     */ import java.net.Socket;
/*     */ import java.net.SocketException;
/*     */ 
/*     */ public class TcpCommunicationBackend implements CommunicationBackend {
/*     */   private static final int START_PORT = 7546;
/*     */   private ServerSocket serverSocket;
/*     */   private Socket socket;
/*     */   private DataInputStream is;
/*     */   private DataOutputStream os;
/*     */   
/*     */   public boolean writeDataBlock(byte[] bytes) {
/*     */     try {
/*  22 */       this.os.writeInt(bytes.length);
/*  23 */       this.os.flush();
/*  24 */       this.os.write(bytes);
/*  25 */       this.os.flush();
/*  26 */       return true;
/*  27 */     } catch (IOException e) {
/*  28 */       e.printStackTrace();
/*  29 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public byte[] readDataBlock() {
/*     */     try {
/*  36 */       int length = this.is.readInt();
/*  37 */       byte[] ret = new byte[length];
/*  38 */       this.is.readFully(ret);
/*  39 */       return ret;
/*  40 */     } catch (IOException e) {
/*  41 */       e.printStackTrace();
/*     */       
/*  43 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public String createListener() {
/*  48 */     int port = 7546;
/*  49 */     boolean success = false;
/*     */     
/*  51 */     while (port < 7746) {
/*     */       try {
/*  53 */         this.serverSocket = new ServerSocket();
/*  54 */         this.serverSocket.bind(new InetSocketAddress(InetAddress.getLoopbackAddress(), port));
/*  55 */         success = true;
/*     */         break;
/*  57 */       } catch (IOException e) {
/*     */         try {
/*  59 */           Thread.sleep(50L);
/*  60 */         } catch (InterruptedException e1) {
/*  61 */           e1.printStackTrace();
/*     */         } 
/*  63 */         port++;
/*     */       } 
/*     */     } 
/*  66 */     if (!success) {
/*  67 */       this.serverSocket = null;
/*  68 */       return null;
/*     */     } 
/*     */     try {
/*  71 */       this.serverSocket.setSoTimeout(300000);
/*  72 */     } catch (SocketException e) {
/*  73 */       e.printStackTrace();
/*     */     } 
/*  75 */     return String.valueOf(port);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean connect(String identifier) {
/*     */     try {
/*  82 */       if (identifier == null) {
/*  83 */         if (this.serverSocket == null) {
/*  84 */           return false;
/*     */         }
/*  86 */         this.socket = this.serverSocket.accept();
/*     */       } else {
/*  88 */         int tryCount = 0;
/*  89 */         while (this.socket == null && tryCount++ < 600) {
/*     */           try {
/*  91 */             this.socket = new Socket(InetAddress.getLoopbackAddress(), Integer.parseInt(identifier));
/*  92 */           } catch (IOException e) {
/*     */             try {
/*  94 */               Thread.sleep(500L);
/*  95 */             } catch (InterruptedException e1) {
/*  96 */               e1.printStackTrace();
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 101 */       if (this.socket != null) {
/* 102 */         this.is = new DataInputStream(this.socket.getInputStream());
/* 103 */         this.os = new DataOutputStream(this.socket.getOutputStream());
/* 104 */         return true;
/*     */       } 
/* 106 */     } catch (IOException e) {
/* 107 */       e.printStackTrace();
/*     */     } 
/* 109 */     return false;
/*     */   }
/*     */   
/*     */   public boolean isProcessAlive(int id) {
/* 113 */     return true;
/*     */   }
/*     */   
/*     */   public int getProcessId() {
/* 117 */     return -1;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platfor\\unix\TcpCommunicationBackend.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */