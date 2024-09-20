/*     */ package com.install4j.runtime.beans.actions.control;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*     */ import javax.swing.SwingUtilities;
/*     */ 
/*     */ public class SetProgressAction
/*     */   extends SystemInstallOrUninstallAction
/*     */ {
/*  12 */   private ProgressChangeType progressChangeType = ProgressChangeType.SET_PERCENT;
/*     */   
/*     */   private int percentValue;
/*  15 */   private int timerPeriod = 1000;
/*  16 */   private int timerMaxPercentValue = 100;
/*     */   
/*     */   private static TimerThread timerThread;
/*     */ 
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/*  22 */     ProgressInterface progressInterface = context.getProgressInterface();
/*  23 */     cancelTimer();
/*  24 */     if (getProgressChangeType() == ProgressChangeType.SET_PERCENT) {
/*  25 */       progressInterface.setIndeterminateProgress(false);
/*  26 */       progressInterface.setPercentCompleted(getPercentValue());
/*  27 */     } else if (getProgressChangeType() == ProgressChangeType.ADD_PERCENT) {
/*  28 */       progressInterface.setIndeterminateProgress(false);
/*  29 */       progressInterface.setPercentCompleted(getPercentValue() + progressInterface.getPercentCompleted());
/*  30 */     } else if (getProgressChangeType() == ProgressChangeType.SET_INDETERMINATE) {
/*  31 */       progressInterface.setIndeterminateProgress(true);
/*  32 */     } else if (getProgressChangeType() == ProgressChangeType.SET_DETERMINATE) {
/*  33 */       progressInterface.setIndeterminateProgress(false);
/*  34 */     } else if (getProgressChangeType() == ProgressChangeType.SET_TIMER) {
/*  35 */       progressInterface.setIndeterminateProgress(false);
/*  36 */       timerThread = new TimerThread(progressInterface, getTimerPeriod(), getTimerMaxPercentValue());
/*  37 */       timerThread.start();
/*     */     } 
/*  39 */     return true;
/*     */   }
/*     */   
/*     */   public ProgressChangeType getProgressChangeType() {
/*  43 */     return (ProgressChangeType)replaceWithTextOverride("progressChangeType", this.progressChangeType, ProgressChangeType.class);
/*     */   }
/*     */   
/*     */   public void setProgressChangeType(ProgressChangeType progressChangeType) {
/*  47 */     this.progressChangeType = progressChangeType;
/*     */   }
/*     */   
/*     */   public int getPercentValue() {
/*  51 */     return replaceWithTextOverride("percentValue", this.percentValue);
/*     */   }
/*     */   
/*     */   public void setPercentValue(int percentValue) {
/*  55 */     this.percentValue = percentValue;
/*     */   }
/*     */   
/*     */   public int getTimerPeriod() {
/*  59 */     return replaceWithTextOverride("timerPeriod", this.timerPeriod);
/*     */   }
/*     */   
/*     */   public void setTimerPeriod(int timerPeriod) {
/*  63 */     this.timerPeriod = timerPeriod;
/*     */   }
/*     */   
/*     */   public int getTimerMaxPercentValue() {
/*  67 */     return replaceWithTextOverride("timerMaxPercentValue", this.timerMaxPercentValue);
/*     */   }
/*     */   
/*     */   public void setTimerMaxPercentValue(int timerMaxPercentValue) {
/*  71 */     this.timerMaxPercentValue = timerMaxPercentValue;
/*     */   }
/*     */   
/*     */   private static void cancelTimer() {
/*  75 */     if (timerThread != null && timerThread.isAlive()) {
/*  76 */       timerThread.cancel();
/*  77 */       timerThread.interrupt();
/*     */       try {
/*  79 */         timerThread.join();
/*  80 */       } catch (InterruptedException e) {
/*  81 */         e.printStackTrace();
/*     */       } 
/*  83 */       timerThread = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isRollbackSupported() {
/*  89 */     return false;
/*     */   }
/*     */   
/*     */   private static class TimerThread
/*     */     extends Thread
/*     */   {
/*     */     private boolean canceled;
/*     */     private ProgressInterface progressInterface;
/*     */     private int timerPeriod;
/*     */     private int timerMaxPercentValue;
/*     */     
/*     */     public TimerThread(ProgressInterface progressInterface, int timerPeriod, int timerMaxPercentValue) {
/* 101 */       super("progress timer");
/* 102 */       this.progressInterface = progressInterface;
/* 103 */       this.timerPeriod = timerPeriod;
/* 104 */       this.timerMaxPercentValue = Math.min(timerMaxPercentValue, 100);
/*     */     }
/*     */ 
/*     */     
/*     */     public void run() {
/* 109 */       while (!this.canceled && this.progressInterface.getPercentCompleted() < this.timerMaxPercentValue) {
/* 110 */         SwingUtilities.invokeLater(() -> this.progressInterface.setPercentCompleted(this.progressInterface.getPercentCompleted() + 1));
/*     */         try {
/* 112 */           Thread.sleep(this.timerPeriod);
/* 113 */         } catch (InterruptedException interruptedException) {}
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void cancel() {
/* 120 */       this.canceled = true;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\control\SetProgressAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */