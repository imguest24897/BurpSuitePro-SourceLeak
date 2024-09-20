/*    */ package com.install4j.runtime.installer.helper.applaunch;
/*    */ 
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.launcher.ApplicationLauncher;
/*    */ import com.install4j.runtime.util.HtmlTextHelper;
/*    */ import java.io.File;
/*    */ import java.util.Objects;
/*    */ import org.jetbrains.annotations.Nls;
/*    */ 
/*    */ public class ProgressInterfaceWrapper
/*    */   implements ProgressInterface
/*    */ {
/*    */   private final ProgressInterface delegate;
/*    */   private final ApplicationLauncher.ProgressListener progressListener;
/*    */   private String lastStatusMessage;
/*    */   private String lastDetailMessage;
/*    */   private int lastPercentCompleted;
/*    */   private int lastSecondaryPercentCompleted;
/*    */   
/*    */   public ProgressInterfaceWrapper(ProgressInterface delegate, ApplicationLauncher.ProgressListener progressListener) {
/* 22 */     this.delegate = delegate;
/* 23 */     this.progressListener = progressListener;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setStatusMessage(@Nls String message) {
/* 28 */     this.delegate.setStatusMessage(message);
/* 29 */     if (!Objects.equals(message, this.lastStatusMessage)) {
/* 30 */       this.progressListener.statusMessage(HtmlTextHelper.formatTextWithoutHtmlTags(message));
/* 31 */       this.lastStatusMessage = message;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void setDetailMessage(@Nls String message) {
/* 37 */     this.delegate.setDetailMessage(message);
/* 38 */     if (!Objects.equals(message, this.lastDetailMessage)) {
/* 39 */       this.progressListener.detailMessage(HtmlTextHelper.formatTextWithoutHtmlTags(message));
/* 40 */       this.lastDetailMessage = message;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void setPercentCompleted(int value) {
/* 46 */     this.delegate.setPercentCompleted(value);
/* 47 */     if (value != this.lastPercentCompleted) {
/* 48 */       this.progressListener.percentCompleted(value);
/* 49 */       this.lastPercentCompleted = value;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int getPercentCompleted() {
/* 55 */     return this.delegate.getPercentCompleted();
/*    */   }
/*    */ 
/*    */   
/*    */   public void setSecondaryPercentCompleted(int value) {
/* 60 */     this.delegate.setSecondaryPercentCompleted(value);
/* 61 */     if (this.lastSecondaryPercentCompleted != value) {
/* 62 */       this.progressListener.secondaryPercentCompleted(value);
/* 63 */       this.lastSecondaryPercentCompleted = value;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void setIndeterminateProgress(boolean indeterminateProgress) {
/* 69 */     this.delegate.setIndeterminateProgress(indeterminateProgress);
/* 70 */     this.progressListener.indeterminateProgress(indeterminateProgress);
/*    */   }
/*    */ 
/*    */   
/*    */   public void showFailure(String message) {
/* 75 */     this.delegate.showFailure(message);
/*    */   }
/*    */ 
/*    */   
/*    */   public int askOverwrite(File file) throws UserCanceledException {
/* 80 */     return this.delegate.askOverwrite(file);
/*    */   }
/*    */ 
/*    */   
/*    */   public int askRetry(File file) throws UserCanceledException {
/* 85 */     return this.delegate.askRetry(file);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean askContinue(File file) throws UserCanceledException {
/* 90 */     return this.delegate.askContinue(file);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\applaunch\ProgressInterfaceWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */