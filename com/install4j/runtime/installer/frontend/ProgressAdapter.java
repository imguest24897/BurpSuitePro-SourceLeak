/*     */ package com.install4j.runtime.installer.frontend;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.util.PercentScaler;
/*     */ import java.io.File;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ProgressAdapter
/*     */   implements ProgressInterface, FileUtil.CopyProgressListener
/*     */ {
/*     */   private ProgressInterface progressInterface;
/*     */   private PercentScaler percentScaler;
/*     */   private boolean filterProgress = false;
/*     */   private long maxCopyProgress;
/*  20 */   private long currentCopyProgress = 0L;
/*     */   
/*     */   public ProgressAdapter(ProgressInterface progressInterface, boolean filterProgress) {
/*  23 */     this.progressInterface = progressInterface;
/*  24 */     this.filterProgress = filterProgress;
/*  25 */     this.percentScaler = new PercentScaler(0, 100);
/*     */   }
/*     */   
/*     */   public ProgressAdapter(ProgressInterface progressInterface, int fromPercent, int toPercent) {
/*  29 */     this.progressInterface = progressInterface;
/*  30 */     this.percentScaler = new PercentScaler(fromPercent, toPercent);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatusMessage(String message) {
/*  35 */     if (this.progressInterface != null) {
/*  36 */       this.progressInterface.setStatusMessage(message);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDetailMessage(String message) {
/*  42 */     if (this.progressInterface != null) {
/*  43 */       this.progressInterface.setDetailMessage(message);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPercentCompleted(int val) {
/*  49 */     if (!this.filterProgress && this.progressInterface != null) {
/*  50 */       this.progressInterface.setPercentCompleted((val == -1) ? -1 : this.percentScaler.scalePercent(val));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int getPercentCompleted() {
/*  56 */     if (!this.filterProgress && this.progressInterface != null) {
/*  57 */       return this.progressInterface.getPercentCompleted();
/*     */     }
/*  59 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSecondaryPercentCompleted(int val) {
/*  65 */     if (!this.filterProgress && this.progressInterface != null) {
/*  66 */       this.progressInterface.setSecondaryPercentCompleted(val);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIndeterminateProgress(boolean indeterminateProgress) {
/*  72 */     if (!this.filterProgress && this.progressInterface != null) {
/*  73 */       this.progressInterface.setIndeterminateProgress(indeterminateProgress);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void showFailure(String message) {
/*  79 */     if (this.progressInterface != null) {
/*  80 */       this.progressInterface.showFailure(message);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int askOverwrite(File file) throws UserCanceledException {
/*  86 */     if (this.progressInterface != null) {
/*  87 */       return this.progressInterface.askOverwrite(file);
/*     */     }
/*  89 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int askRetry(File file) throws UserCanceledException {
/*  95 */     if (this.progressInterface != null) {
/*  96 */       return this.progressInterface.askRetry(file);
/*     */     }
/*  98 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean askContinue(File file) throws UserCanceledException {
/* 104 */     if (this.progressInterface != null) {
/* 105 */       return this.progressInterface.askContinue(file);
/*     */     }
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMaxCopyProgress(long maxCopyProgress) {
/* 112 */     this.maxCopyProgress = maxCopyProgress;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean progressPerformed(long val) {
/* 117 */     this.currentCopyProgress += val;
/* 118 */     setPercentCompleted((int)((100L * this.currentCopyProgress) / this.maxCopyProgress));
/*     */     
/* 120 */     ContextInt context = ContextImpl.getSingleContextInt();
/* 121 */     if (context == null) {
/* 122 */       return true;
/*     */     }
/* 124 */     return !context.isCancelling();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\ProgressAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */