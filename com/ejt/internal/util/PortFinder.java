/*    */ package com.ejt.internal.util;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetSocketAddress;
/*    */ import java.net.ServerSocket;
/*    */ import java.net.SocketAddress;
/*    */ 
/*    */ 
/*    */ public class PortFinder
/*    */ {
/*    */   public static synchronized int findUnusedPort() {
/* 12 */     return findUnusedPort(0);
/*    */   }
/*    */   
/*    */   public static boolean isPortUnused(int port) {
/* 16 */     return (findUnusedPort(port) != -1);
/*    */   }
/*    */   
/*    */   private static int findUnusedPort(int port) {
/* 20 */     ServerSocket ss = null;
/*    */     
/* 22 */     try { if (CommonPlatformUtil.isWindows() || CommonPlatformUtil.isMacOS()) {
/* 23 */         ss = new ServerSocket();
/* 24 */         SocketAddress sa = new InetSocketAddress("127.0.0.1", port);
/* 25 */         ss.bind(sa);
/* 26 */         ss.setReuseAddress(true);
/* 27 */         return ss.getLocalPort();
/*    */       } 
/* 29 */       ss = new ServerSocket(port);
/* 30 */       ss.setReuseAddress(true);
/* 31 */       return ss.getLocalPort(); }
/*    */     
/* 33 */     catch (IOException iOException) {  }
/*    */     finally
/* 35 */     { if (ss != null) {
/*    */         try {
/* 37 */           ss.close();
/* 38 */         } catch (IOException iOException) {}
/*    */       } }
/*    */ 
/*    */     
/* 42 */     return -1;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\interna\\util\PortFinder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */