/*     */ package com.install4j.runtime.installer.frontend;
/*     */ 
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import java.io.File;
/*     */ 
/*     */ public class ProgressDelegate
/*     */   implements ProgressInterface
/*     */ {
/*     */   private ProgressInterface progressInterface;
/*     */   
/*     */   public ProgressDelegate(ProgressInterface progressInterface) {
/*  13 */     this.progressInterface = progressInterface;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatusMessage(String message) {
/*  18 */     if (this.progressInterface != null) {
/*  19 */       this.progressInterface.setStatusMessage(message);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDetailMessage(String message) {
/*  25 */     if (this.progressInterface != null) {
/*  26 */       this.progressInterface.setDetailMessage(message);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPercentCompleted(int val) {
/*  32 */     if (this.progressInterface != null) {
/*  33 */       this.progressInterface.setPercentCompleted(val);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int getPercentCompleted() {
/*  39 */     if (this.progressInterface != null) {
/*  40 */       return this.progressInterface.getPercentCompleted();
/*     */     }
/*  42 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSecondaryPercentCompleted(int value) {
/*  48 */     if (this.progressInterface != null) {
/*  49 */       this.progressInterface.setSecondaryPercentCompleted(value);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIndeterminateProgress(boolean indeterminateProgress) {
/*  55 */     if (this.progressInterface != null) {
/*  56 */       this.progressInterface.setIndeterminateProgress(indeterminateProgress);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void showFailure(String message) {
/*  62 */     if (this.progressInterface != null) {
/*  63 */       this.progressInterface.showFailure(message);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int askOverwrite(File file) throws UserCanceledException {
/*  69 */     if (this.progressInterface != null) {
/*  70 */       return this.progressInterface.askOverwrite(file);
/*     */     }
/*  72 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int askRetry(File file) throws UserCanceledException {
/*  78 */     if (this.progressInterface != null) {
/*  79 */       return this.progressInterface.askRetry(file);
/*     */     }
/*  81 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean askContinue(File file) throws UserCanceledException {
/*  87 */     if (this.progressInterface != null) {
/*  88 */       return this.progressInterface.askContinue(file);
/*     */     }
/*  90 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isUnattendedProgressDialog() {
/*  96 */     if (this.progressInterface != null) {
/*  97 */       return this.progressInterface.isUnattendedProgressDialog();
/*     */     }
/*  99 */     return super.isUnattendedProgressDialog();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isAlertsShown() {
/* 105 */     if (this.progressInterface != null) {
/* 106 */       return this.progressInterface.isAlertsShown();
/*     */     }
/* 108 */     return super.isAlertsShown();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\ProgressDelegate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */