/*    */ package com.install4j.runtime.launcher.service;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.File;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.RandomAccessFile;
/*    */ import java.nio.channels.FileLock;
/*    */ 
/*    */ public class LockHandler extends CommonHandler {
/* 10 */   private static final boolean PUBLIC_SERVICE_STATUS = Boolean.parseBoolean(System.getProperty("install4j.publicServiceStatus", "true"));
/*    */ 
/*    */   
/*    */   protected boolean isRunning() {
/* 14 */     File watcherFile = getWatcherFile();
/* 15 */     if (watcherFile.exists()) {
/* 16 */       RandomAccessFile randomAccessFile = null;
/*    */       try {
/* 18 */         randomAccessFile = new RandomAccessFile(watcherFile, "r");
/* 19 */         FileLock fileLock = randomAccessFile.getChannel().tryLock(0L, Long.MAX_VALUE, true);
/* 20 */         return (fileLock == null);
/* 21 */       } catch (FileNotFoundException e) {
/* 22 */         System.out.println("Could not determine status of " + getDaemonName() + ". Exiting. Id file: " + watcherFile);
/* 23 */         System.exit(1);
/* 24 */       } catch (IOException e) {
/* 25 */         e.printStackTrace();
/*    */       } finally {
/* 27 */         if (randomAccessFile != null) {
/*    */           try {
/* 29 */             randomAccessFile.close();
/* 30 */           } catch (IOException iOException) {}
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 35 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void finishStartFileCreation(File watcherFile, DataOutputStream out, FileOutputStream fout) throws IOException {
/* 40 */     out.flush();
/* 41 */     if (PUBLIC_SERVICE_STATUS) {
/* 42 */       LauncherHelper.INSTANCE.setPosixFilePermissions(watcherFile, "+r");
/*    */     }
/*    */     try {
/* 45 */       FileLock fileLock = fout.getChannel().tryLock();
/* 46 */       if (fileLock == null) {
/* 47 */         throw new IOException("could not lock file");
/*    */       }
/* 49 */     } catch (OverlappingFileLockException overlappingFileLockException) {}
/*    */   }
/*    */   
/*    */   protected void updateWatcherFile(File watcherFile) {}
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\service\LockHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */