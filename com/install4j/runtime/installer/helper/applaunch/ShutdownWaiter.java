/*    */ package com.install4j.runtime.installer.helper.applaunch;
/*    */ 
/*    */ import com.install4j.api.launcher.ApplicationLauncher;
/*    */ import com.install4j.api.launcher.Variables;
/*    */ import java.io.File;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ class ShutdownWaiter
/*    */   extends Thread {
/*    */   @NotNull
/*    */   private final File shutdownFile;
/*    */   @Nullable
/*    */   private final ApplicationLauncher.Callback callback;
/*    */   private final Process process;
/*    */   private volatile boolean exitCalled;
/*    */   
/*    */   ShutdownWaiter(@NotNull File shutdownFile, @Nullable ApplicationLauncher.Callback callback, Process process) {
/* 19 */     super("_i4j_commfile_waiter");
/* 20 */     setDaemon(true);
/* 21 */     setPriority(4);
/* 22 */     this.process = process;
/* 23 */     this.shutdownFile = shutdownFile;
/* 24 */     this.callback = callback;
/*    */     
/* 26 */     shutdownFile.deleteOnExit();
/*    */   }
/*    */   
/*    */   private boolean isShutdownLauncher() {
/* 30 */     return (this.shutdownFile.length() > 0L);
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 35 */     boolean running = true;
/* 36 */     int exitValue = 0;
/* 37 */     while (!this.exitCalled && running && !isShutdownLauncher()) {
/*    */       try {
/* 39 */         Thread.sleep(500L);
/* 40 */       } catch (InterruptedException e) {
/* 41 */         e.printStackTrace();
/*    */       } 
/*    */       try {
/* 44 */         exitValue = this.process.exitValue();
/* 45 */         running = false;
/* 46 */       } catch (IllegalThreadStateException illegalThreadStateException) {}
/*    */     } 
/*    */ 
/*    */     
/* 50 */     exited(exitValue, isShutdownLauncher());
/*    */   }
/*    */   
/*    */   public boolean isExitCalled() {
/* 54 */     return this.exitCalled;
/*    */   }
/*    */   
/*    */   public synchronized void exited(int exitCode, boolean shutdownLauncher) {
/* 58 */     if (this.exitCalled) {
/*    */       return;
/*    */     }
/* 61 */     this.exitCalled = true;
/*    */     
/* 63 */     Variables.clearInstallerVariablesCache();
/* 64 */     boolean debug = Boolean.getBoolean("install4j.debugShutdownFile");
/* 65 */     if (debug) {
/* 66 */       System.err.println("application exited");
/*    */     }
/* 68 */     if (shutdownLauncher) {
/* 69 */       if (debug) {
/* 70 */         System.err.println("commFile = " + this.shutdownFile);
/* 71 */         System.err.println("commFile.length() = " + this.shutdownFile.length());
/*    */       } 
/* 73 */       if (this.callback != null) {
/* 74 */         this.callback.prepareShutdown();
/*    */       }
/* 76 */       System.exit(0);
/* 77 */     } else if (this.callback != null) {
/* 78 */       this.callback.exited(exitCode);
/*    */     } 
/* 80 */     this.shutdownFile.delete();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\applaunch\ShutdownWaiter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */