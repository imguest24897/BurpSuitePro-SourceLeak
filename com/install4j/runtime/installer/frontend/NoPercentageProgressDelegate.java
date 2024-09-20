/*    */ package com.install4j.runtime.installer.frontend;
/*    */ 
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import java.io.File;
/*    */ 
/*    */ public class NoPercentageProgressDelegate
/*    */   implements ProgressInterface
/*    */ {
/*    */   private ProgressInterface progressInterface;
/*    */   
/*    */   public NoPercentageProgressDelegate(ProgressInterface progressInterface) {
/* 13 */     this.progressInterface = progressInterface;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setStatusMessage(String message) {
/* 18 */     if (this.progressInterface != null) {
/* 19 */       this.progressInterface.setStatusMessage(message);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void setDetailMessage(String message) {
/* 25 */     if (this.progressInterface != null) {
/* 26 */       this.progressInterface.setDetailMessage(message);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setPercentCompleted(int val) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void setIndeterminateProgress(boolean indeterminateProgress) {}
/*    */ 
/*    */   
/*    */   public int getPercentCompleted() {
/* 40 */     if (this.progressInterface != null) {
/* 41 */       return this.progressInterface.getPercentCompleted();
/*    */     }
/* 43 */     return 0;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setSecondaryPercentCompleted(int value) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void showFailure(String message) {
/* 53 */     if (this.progressInterface != null) {
/* 54 */       this.progressInterface.showFailure(message);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public int askOverwrite(File file) throws UserCanceledException {
/* 60 */     if (this.progressInterface != null) {
/* 61 */       return this.progressInterface.askOverwrite(file);
/*    */     }
/* 63 */     return 1;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int askRetry(File file) throws UserCanceledException {
/* 69 */     if (this.progressInterface != null) {
/* 70 */       return this.progressInterface.askRetry(file);
/*    */     }
/* 72 */     return 1;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean askContinue(File file) throws UserCanceledException {
/* 78 */     if (this.progressInterface != null) {
/* 79 */       return this.progressInterface.askContinue(file);
/*    */     }
/* 81 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\NoPercentageProgressDelegate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */