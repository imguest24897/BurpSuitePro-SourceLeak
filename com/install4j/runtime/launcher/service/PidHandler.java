/*    */ package com.install4j.runtime.launcher.service;
/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ class PidHandler extends CommonHandler {
/*    */   protected boolean isRunning() {
/*  9 */     File watcherFile = getWatcherFile();
/* 10 */     if (watcherFile.exists()) {
/*    */       try {
/* 12 */         DataInputStream in = new DataInputStream(new FileInputStream(watcherFile));
/*    */         try {
/* 14 */           int status = in.read();
/* 15 */           if (status == 43) {
/* 16 */             int pid = in.readInt();
/* 17 */             if (pid > 0) {
/* 18 */               return isProcessRunning(pid);
/*    */             }
/*    */           } 
/*    */         } finally {
/* 22 */           in.close();
/*    */         } 
/* 24 */       } catch (Throwable throwable) {}
/*    */       
/* 26 */       return (System.currentTimeMillis() - watcherFile.lastModified() < 10000L);
/*    */     } 
/* 28 */     return false;
/*    */   }
/*    */   
/*    */   private static boolean isProcessRunning(int pid) throws InterruptedException, IOException {
/* 32 */     return (Runtime.getRuntime().exec("ps -p " + pid).waitFor() == 0);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void updateWatcherFile(File watcherFile) {
/* 37 */     watcherFile.setLastModified(System.currentTimeMillis());
/*    */   }
/*    */ 
/*    */   
/*    */   protected void finishStartFileCreation(File watcherFile, DataOutputStream out, FileOutputStream fout) throws IOException {
/* 42 */     out.close();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\service\PidHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */