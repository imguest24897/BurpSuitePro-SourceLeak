/*    */ package com.install4j.runtime.installer.platform.win32;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.ByteOrder;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import java.util.Arrays;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public class MsiCommunication
/*    */ {
/* 13 */   private static final String MSI_PIPE_NAME = System.getProperty("install4j.msiPipe");
/*    */   
/*    */   private static final String COMMAND_ELEVATION_REQUESTED = "__I4J_ELEVATION_REQUESTED";
/*    */   
/*    */   private static long pipeId;
/*    */   private static volatile boolean connected;
/*    */   
/*    */   public static synchronized boolean connect() {
/* 21 */     if (Util.isWindows() && !connected && MSI_PIPE_NAME != null && !Objects.equals(MSI_PIPE_NAME, "null")) {
/* 22 */       pipeId = Win32CommunicationBackend.connectClient0(MSI_PIPE_NAME);
/* 23 */       if (pipeId != Win32CommunicationBackend.getInvalidHandle0()) {
/* 24 */         connected = true;
/*    */       }
/*    */     } 
/* 27 */     return connected;
/*    */   }
/*    */   
/*    */   public static boolean isConnected() {
/* 31 */     return connected;
/*    */   }
/*    */   
/*    */   public static synchronized boolean executeElevated(String arguments) {
/* 35 */     if (connect() && writeDataBlock(arguments.getBytes(StandardCharsets.UTF_16LE))) {
/* 36 */       byte[] bytes = readDataBlock();
/* 37 */       if (bytes != null && bytes.length == 4) {
/* 38 */         int result = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().get();
/* 39 */         if (result == 1) {
/* 40 */           return true;
/*    */         }
/* 42 */         Logger.getInstance().error(null, "MSI elevation returned " + result);
/*    */       } else {
/*    */         
/* 45 */         Logger.getInstance().error(null, "MSI elevation returned " + Arrays.toString(bytes));
/*    */       } 
/*    */     } else {
/* 48 */       Logger.getInstance().error(null, "Could not request MSI elevation");
/*    */     } 
/* 50 */     return false;
/*    */   }
/*    */   
/*    */   public static boolean sendElevationRequested() {
/* 54 */     if (connect() && writeDataBlock("__I4J_ELEVATION_REQUESTED".getBytes(StandardCharsets.UTF_16LE))) {
/* 55 */       Logger.getInstance().error(null, "MSI was already started elevated");
/* 56 */       return true;
/*    */     } 
/* 58 */     Logger.getInstance().error(null, "Could not update MSI elevation status");
/* 59 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   private static synchronized boolean writeDataBlock(byte[] bytes) {
/* 64 */     return Win32CommunicationBackend.writeDataBlock0(pipeId, bytes);
/*    */   }
/*    */   
/*    */   private static synchronized byte[] readDataBlock() {
/* 68 */     return Win32CommunicationBackend.readDataBlock0(pipeId);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\MsiCommunication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */