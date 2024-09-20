/*     */ package com.install4j.runtime.launcher.service;
/*     */ 
/*     */ import com.exe4j.runtime.util.ResourceHelper;
/*     */ import com.install4j.runtime.launcher.LauncherHelper;
/*     */ import com.install4j.runtime.launcher.util.LauncherUtil;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ 
/*     */ abstract class CommonHandler
/*     */   implements UnixServiceHandler
/*     */ {
/*     */   protected static final int POLLING_PERIOD = 1000;
/*     */   protected static final int RUNNING_MULTIPLIER = 10;
/*  16 */   protected static final int STOP_TIMEOUT_SECONDS = Integer.getInteger("install4j.daemonTimeout", 120).intValue();
/*     */   
/*     */   protected static final int NO_PID_STARTED = 44;
/*     */   protected static final int PID_STARTED = 43;
/*  20 */   private File watcherFile = null;
/*     */   
/*     */   private boolean service = false;
/*     */   
/*     */   private static FileOutputStream startFileOut;
/*     */ 
/*     */   
/*     */   static CommonHandler getDefaultHandler() {
/*  28 */     String daemonHandler = System.getenv("INSTALL4J_DAEMON_HANDLER");
/*  29 */     if (daemonHandler == null && !LauncherUtil.isLinux() && !LauncherUtil.isMacOS()) {
/*  30 */       daemonHandler = "pid";
/*     */     }
/*  32 */     return "pid".equals(daemonHandler) ? new PidHandler() : new LockHandler();
/*     */   } protected abstract boolean isRunning();
/*     */   protected abstract void finishStartFileCreation(File paramFile, DataOutputStream paramDataOutputStream, FileOutputStream paramFileOutputStream) throws IOException;
/*     */   protected abstract void updateWatcherFile(File paramFile);
/*     */   public void setStart() {
/*  37 */     this.service = true;
/*  38 */     File watcherFile = getWatcherFile();
/*  39 */     if (isRunning()) {
/*  40 */       System.out.println(getDaemonName() + " seems to be running. Exiting. Id file: " + watcherFile);
/*  41 */       System.exit(1);
/*     */     } 
/*     */     
/*  44 */     if (watcherFile.exists() && !watcherFile.delete()) {
/*  45 */       System.out.println("Could not delete id file " + watcherFile + ". Aborting.");
/*  46 */       System.exit(1);
/*     */     } 
/*     */     
/*  49 */     boolean hasPid = createStartFile(watcherFile, true);
/*     */     
/*  51 */     (new StopWatcherThread(hasPid)).start();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStop() {
/*  56 */     if (!isRunning()) {
/*  57 */       System.out.println(getDaemonName() + " is not running.");
/*  58 */       System.exit(0);
/*     */     } 
/*     */ 
/*     */     
/*  62 */     File watcherFile = getWatcherFile();
/*     */     try {
/*  64 */       FileOutputStream out = new FileOutputStream(watcherFile, true);
/*  65 */       for (int j = 0; j < 20; j++) {
/*  66 */         out.write(33);
/*     */       }
/*  68 */       out.close();
/*  69 */     } catch (IOException e) {
/*  70 */       System.out.println("Could not stop daemon.");
/*  71 */       System.exit(1);
/*     */     } 
/*     */     
/*  74 */     for (int i = 0; i < 2 * STOP_TIMEOUT_SECONDS && isRunning(); i++) {
/*     */       try {
/*  76 */         Thread.sleep(500L);
/*  77 */       } catch (InterruptedException interruptedException) {}
/*     */     } 
/*     */ 
/*     */     
/*  81 */     if (isRunning()) {
/*  82 */       System.out.println("Timeout. Daemon did not shutdown yet.");
/*  83 */       System.exit(1);
/*     */     } else {
/*  85 */       if (!watcherFile.delete() && watcherFile.exists()) {
/*  86 */         watcherFile.deleteOnExit();
/*     */       }
/*  88 */       System.out.println("Stopped.");
/*  89 */       System.exit(0);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean createStartFile(File watcherFile, boolean startup) {
/*  96 */     boolean hasPid = false;
/*     */     try {
/*  98 */       FileOutputStream fout = new FileOutputStream(watcherFile);
/*  99 */       startFileOut = fout;
/* 100 */       DataOutputStream out = new DataOutputStream(fout);
/* 101 */       int pid = (int)LauncherHelper.INSTANCE.getPid();
/* 102 */       if (pid == 0) {
/* 103 */         out.write(44);
/*     */       } else {
/* 105 */         out.write(43);
/* 106 */         out.writeInt(pid);
/* 107 */         hasPid = true;
/*     */       } 
/* 109 */       finishStartFileCreation(watcherFile, out, fout);
/* 110 */     } catch (IOException e) {
/* 111 */       if (startup) {
/* 112 */         System.out.println("Could not create id file " + watcherFile + ". Aborting.");
/* 113 */         System.exit(1);
/*     */       } else {
/* 115 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/* 118 */     return hasPid;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isService() {
/* 123 */     return this.service;
/*     */   }
/*     */   
/*     */   protected File getWatcherFile() {
/* 127 */     if (this.watcherFile == null) {
/* 128 */       String moduleName = System.getProperty("exe4j.moduleName");
/* 129 */       if (moduleName == null) {
/* 130 */         File runtimeDir = ResourceHelper.getRuntimeDir();
/* 131 */         if (runtimeDir == null) {
/* 132 */           runtimeDir = new File(System.getProperty("user.dir"));
/*     */         }
/* 134 */         moduleName = runtimeDir.getAbsolutePath();
/*     */       } else {
/*     */         try {
/* 137 */           moduleName = (new File(moduleName)).getCanonicalFile().getAbsolutePath();
/* 138 */         } catch (IOException iOException) {}
/*     */       } 
/*     */ 
/*     */       
/* 142 */       String watcherFileName = System.getProperty("install4j.pidDir", "/tmp") + "/i4jdaemon_" + moduleName.replace('/', '_');
/* 143 */       this.watcherFile = new File(watcherFileName);
/*     */     } 
/* 145 */     return this.watcherFile;
/*     */   }
/*     */ 
/*     */   
/*     */   public void reportStatus() {
/* 150 */     if (isRunning()) {
/* 151 */       System.out.println(getDaemonName() + " is running.");
/* 152 */       System.exit(0);
/*     */     } else {
/* 154 */       System.out.println(getDaemonName() + " is stopped.");
/* 155 */       System.exit(3);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected String getDaemonName() {
/* 160 */     String moduleName = System.getProperty("exe4j.moduleName");
/* 161 */     if (moduleName != null) {
/*     */       try {
/* 163 */         return (new File(moduleName)).getName();
/* 164 */       } catch (Throwable throwable) {}
/*     */     }
/*     */     
/* 167 */     return "The daemon";
/*     */   }
/*     */   
/*     */   private class StopWatcherThread
/*     */     extends Thread {
/*     */     private final boolean hasPid;
/*     */     private volatile boolean deleteInHook = true;
/*     */     private volatile boolean recreate = true;
/*     */     
/*     */     public StopWatcherThread(boolean hasPid) {
/* 177 */       this.hasPid = hasPid;
/* 178 */       setDaemon(true);
/*     */     }
/*     */ 
/*     */     
/*     */     public void run() {
/* 183 */       final File watcherFile = CommonHandler.this.getWatcherFile();
/* 184 */       Runtime.getRuntime().addShutdownHook(new Thread("i4j_daemon_delete")
/*     */           {
/*     */             public void run() {
/* 187 */               CommonHandler.StopWatcherThread.this.recreate = false;
/* 188 */               if (CommonHandler.StopWatcherThread.this.deleteInHook) {
/* 189 */                 watcherFile.delete();
/*     */               }
/*     */             }
/*     */           });
/*     */       while (true) {
/*     */         try {
/* 195 */           sleep(1000L);
/* 196 */         } catch (InterruptedException interruptedException) {}
/*     */         
/* 198 */         if (this.recreate && !watcherFile.exists()) {
/* 199 */           CommonHandler.this.createStartFile(watcherFile, false);
/*     */         }
/* 201 */         if (watcherFile.length() > 10L) {
/* 202 */           if (this.hasPid) {
/* 203 */             this.deleteInHook = false;
/*     */           }
/* 205 */           System.exit(0); continue;
/*     */         } 
/* 207 */         CommonHandler.this.updateWatcherFile(watcherFile);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\service\CommonHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */