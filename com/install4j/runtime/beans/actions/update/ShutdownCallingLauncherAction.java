/*    */ package com.install4j.runtime.beans.actions.update;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.io.File;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class ShutdownCallingLauncherAction
/*    */   extends SystemInstallOrUninstallAction
/*    */ {
/*    */   private boolean wait = true;
/* 17 */   private int timeout = 60;
/*    */   
/*    */   public boolean isWait() {
/* 20 */     return replaceWithTextOverride("wait", this.wait);
/*    */   }
/*    */   
/*    */   public void setWait(boolean wait) {
/* 24 */     this.wait = wait;
/*    */   }
/*    */   
/*    */   public int getTimeout() {
/* 28 */     return replaceWithTextOverride("timeout", this.timeout);
/*    */   }
/*    */   
/*    */   public void setTimeout(int timeout) {
/* 32 */     this.timeout = timeout;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 37 */     return shutdownCallingLauncher(context, isWait(), getTimeout());
/*    */   }
/*    */   
/*    */   public static boolean shutdownCallingLauncher(Context context, boolean wait, int timeout) {
/* 41 */     if (InstallerUtil.isInProcess()) {
/* 42 */       InstallerUtil.setShutdownOnInProcessExit(true);
/* 43 */       return true;
/*    */     } 
/* 45 */     String shutdownFileName = System.getProperty("install4j.shutdownFile");
/* 46 */     if (shutdownFileName == null) {
/* 47 */       Logger.getInstance().error(null, "no shutdown file property");
/* 48 */       return false;
/*    */     } 
/*    */     
/* 51 */     ProgressInterface progressInterface = context.getProgressInterface();
/*    */     
/* 53 */     progressInterface.setStatusMessage(context.getMessage(".WaitLabel"));
/* 54 */     progressInterface.setIndeterminateProgress(true);
/*    */     try {
/* 56 */       File shutdownFile = new File(shutdownFileName);
/* 57 */       if (shutdownFile.exists()) {
/* 58 */         FileOutputStream fos = new FileOutputStream(shutdownFile);
/* 59 */         fos.write(83);
/* 60 */         fos.close();
/*    */         
/* 62 */         if (wait) {
/* 63 */           int seconds = 0;
/* 64 */           while (timeout == 0 || seconds < timeout) {
/* 65 */             if (!shutdownFile.exists()) {
/* 66 */               sleepOneSecond();
/* 67 */               return true;
/*    */             } 
/* 69 */             sleepOneSecond();
/* 70 */             seconds++;
/*    */           } 
/* 72 */           Logger.getInstance().error(null, "timeout");
/* 73 */           return false;
/*    */         } 
/*    */       } else {
/* 76 */         Logger.getInstance().error(null, "calling launcher already terminated");
/*    */       } 
/* 78 */       return true;
/*    */     }
/* 80 */     catch (IOException e) {
/* 81 */       Logger.getInstance().log(e);
/* 82 */       return false;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private static void sleepOneSecond() {
/*    */     try {
/* 89 */       Thread.sleep(1000L);
/* 90 */     } catch (InterruptedException e) {
/* 91 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 97 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\action\\update\ShutdownCallingLauncherAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */