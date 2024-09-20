/*     */ package com.install4j.api.context;
/*     */ 
/*     */ import java.io.File;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DefaultUnattendedProgressInterface
/*     */   implements UnattendedProgressInterface
/*     */ {
/*     */   private int percentCompleted;
/*     */   
/*     */   public void setVisible(boolean visible) {}
/*     */   
/*     */   public void setCancelButtonEnabled(boolean enabled) {}
/*     */   
/*     */   public void setCancelButtonVisible(boolean visible) {}
/*     */   
/*     */   public void setStatusMessage(String message) {}
/*     */   
/*     */   public void setDetailMessage(String message) {}
/*     */   
/*     */   public void setPercentCompleted(int value) {
/*  60 */     this.percentCompleted = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPercentCompleted() {
/*  69 */     return this.percentCompleted;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSecondaryPercentCompleted(int value) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIndeterminateProgress(boolean indeterminateProgress) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void showFailure(String message) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int askOverwrite(File file) throws UserCanceledException {
/* 101 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int askRetry(File file) throws UserCanceledException {
/* 112 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean askContinue(File file) throws UserCanceledException {
/* 123 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\DefaultUnattendedProgressInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */