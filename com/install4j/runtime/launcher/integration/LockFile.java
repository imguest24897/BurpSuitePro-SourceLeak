/*     */ package com.install4j.runtime.launcher.integration;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.Closeable;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.RandomAccessFile;
/*     */ import java.nio.channels.FileLock;
/*     */ import java.util.List;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LockFile
/*     */ {
/*     */   private static final String INIT_LOCK_NAME = "init.lck";
/*     */   private static final String INSTALLER_LOCK_NAME = "installer.lck";
/*     */   private static final String PROPNAME_LOCK_FILE = "install4j.lockFile";
/*     */   private static final String PROPNAME_TIMEOUT = "install4j.lockFileTimeout";
/*     */   
/*     */   public static void deleteShutdownLockFile() {
/*  24 */     String lockFileName = System.getProperty("install4j.lockFile");
/*  25 */     if (lockFileName != null) {
/*  26 */       UpdateLog.log(20, "deleting shutdown lock file " + lockFileName);
/*  27 */       (new File(lockFileName)).delete();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void waitForShutdownLockFile() {
/*  32 */     String lockFileName = System.getProperty("install4j.lockFile");
/*  33 */     if (lockFileName != null) {
/*  34 */       File lockFile = new File(lockFileName);
/*  35 */       if (lockFile.isFile()) {
/*  36 */         UpdateLog.log(5, "waiting for shutdown lock " + lockFile); 
/*  37 */         try { RandomAccessFile randomAccessFile = new RandomAccessFile(lockFile, "rw"); 
/*  38 */           try { int maxTryCount = Integer.getInteger("install4j.lockFileTimeout", 120).intValue() * 2;
/*  39 */             int tryCount = 0;
/*  40 */             FileLock fileLock = randomAccessFile.getChannel().tryLock();
/*  41 */             while (fileLock == null) {
/*  42 */               if (tryCount++ == maxTryCount) {
/*  43 */                 Util.showMessage(Messages.getString(".NoTerminationUpdaterInvocationError"), 0);
/*  44 */                 System.exit(1);
/*     */               } 
/*     */               try {
/*  47 */                 Thread.sleep(500L);
/*  48 */               } catch (InterruptedException e) {
/*  49 */                 e.printStackTrace();
/*     */               } 
/*  51 */               fileLock = randomAccessFile.getChannel().tryLock();
/*     */             } 
/*  53 */             fileLock.release();
/*  54 */             randomAccessFile.close(); } catch (Throwable throwable) { try { randomAccessFile.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  } catch (IOException e)
/*  55 */         { UpdateLog.log(e); }
/*     */         finally
/*  57 */         { if (!lockFile.delete() && lockFile.isFile()) {
/*  58 */             lockFile.deleteOnExit();
/*     */           } }
/*     */         
/*  61 */         UpdateLog.log(5, "shutdown lock " + lockFile + " released");
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static String createShutdownLockFile() {
/*     */     try {
/*  68 */       File file = File.createTempFile("lock", ".tmp", AutomaticUpdate.getUpdateDir());
/*  69 */       (new RandomAccessFile(file, "rw")).getChannel().lock();
/*  70 */       UpdateLog.log(5, "created shutdown lock " + file);
/*  71 */       return file.getAbsolutePath();
/*  72 */     } catch (IOException e) {
/*  73 */       UpdateLog.log(e);
/*  74 */       e.printStackTrace();
/*     */       
/*  76 */       return null;
/*     */     } 
/*     */   }
/*     */   static void addShutdownLockFile(List<String> arguments) {
/*  80 */     String lockFileName = createShutdownLockFile();
/*  81 */     if (lockFileName != null) {
/*  82 */       arguments.add("-Dinstall4j.lockFile=" + lockFileName);
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean waitForInstallerLock(Process installerProcess) {
/*  87 */     UpdateLog.log(5, "waiting for installer lock " + installerProcess);
/*  88 */     for (int tryCount = 0; tryCount < 1500; tryCount++) {
/*  89 */       File file = new File(AutomaticUpdate.getUpdateDir(), "installer.lck");
/*  90 */       if (file.isFile()) {
/*     */         try {
/*  92 */           RandomAccessFile raFile = new RandomAccessFile(file, "r"); 
/*  93 */           try { FileLock fileLock = raFile.getChannel().tryLock(0L, Long.MAX_VALUE, true); 
/*  94 */             try { if (fileLock == null)
/*  95 */               { UpdateLog.log(10, "installer lock was acquired. Continuing. (alive: " + installerProcess.isAlive() + ")");
/*  96 */                 boolean bool = true;
/*     */ 
/*     */ 
/*     */                 
/* 100 */                 if (fileLock != null) fileLock.close(); 
/* 101 */                 raFile.close(); return bool; }  if (tryCount == 0) UpdateLog.log(10, "installer lock not yet acquired. Waiting. (alive: " + installerProcess.isAlive() + ")");  if (fileLock != null) fileLock.close();  } catch (Throwable throwable) { if (fileLock != null) try { fileLock.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }  raFile.close(); } catch (Throwable throwable) { try { raFile.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; } 
/* 102 */         } catch (IOException iOException) {}
/*     */       }
/*     */       
/* 105 */       if (!installerProcess.isAlive()) {
/* 106 */         UpdateLog.log(5, "installer process terminated before installer lock was acquired");
/* 107 */         return false;
/*     */       } 
/*     */       try {
/* 110 */         Thread.sleep(200L);
/* 111 */       } catch (InterruptedException interruptedException) {}
/*     */     } 
/*     */     
/* 114 */     UpdateLog.log(5, "waiting for installer lock timed out");
/* 115 */     return false;
/*     */   }
/*     */   
/*     */   public static void createInstallerLock() {
/* 119 */     RandomAccessFile raFile = null;
/* 120 */     Throwable lastException = null;
/* 121 */     for (int tryCount = 0; tryCount < 40; tryCount++) {
/* 122 */       if (raFile != null) {
/*     */         try {
/* 124 */           raFile.close();
/* 125 */         } catch (IOException iOException) {}
/*     */       }
/*     */       
/*     */       try {
/* 129 */         AutomaticUpdate.getUpdateDir().mkdirs();
/* 130 */         File file = new File(AutomaticUpdate.getUpdateDir(), "installer.lck");
/* 131 */         UpdateLog.log(20, "creating installer lock file " + file);
/* 132 */         raFile = new RandomAccessFile(file, "rw");
/*     */         
/* 134 */         FileLock fileLock = raFile.getChannel().lock(0L, Long.MAX_VALUE, false);
/* 135 */         if (fileLock != null) {
/* 136 */           UpdateLog.log(20, "locked " + file);
/*     */           return;
/*     */         } 
/* 139 */         Thread.sleep(100L);
/* 140 */       } catch (Throwable e) {
/* 141 */         lastException = e;
/*     */       } 
/*     */     } 
/* 144 */     if (lastException != null) {
/* 145 */       UpdateLog.log(lastException);
/* 146 */       Logger.getInstance().log(lastException);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static Closeable tryInitLock() {
/*     */     try {
/* 153 */       return new InitLock(new File(AutomaticUpdate.getUpdateDir(), "init.lck"));
/* 154 */     } catch (IOException e) {
/* 155 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static class InitLock implements Closeable {
/*     */     private final RandomAccessFile raFile;
/*     */     private final FileLock lock;
/*     */     
/*     */     public InitLock(File file) throws IOException {
/* 164 */       file.getParentFile().mkdirs();
/* 165 */       this.raFile = new RandomAccessFile(file, "rw");
/* 166 */       this.lock = this.raFile.getChannel().tryLock(0L, Long.MAX_VALUE, false);
/* 167 */       if (this.lock == null) {
/* 168 */         throw new IOException("lock not acquired");
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void close() throws IOException {
/*     */       try {
/* 176 */         this.lock.close();
/* 177 */       } catch (IOException iOException) {}
/*     */       
/* 179 */       this.raFile.close();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\integration\LockFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */