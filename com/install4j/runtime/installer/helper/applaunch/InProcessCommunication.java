/*    */ package com.install4j.runtime.installer.helper.applaunch;
/*    */ 
/*    */ import com.install4j.api.launcher.ApplicationLauncher;
/*    */ import com.install4j.runtime.util.DaemonThreadFactory;
/*    */ import java.util.concurrent.ExecutorService;
/*    */ import java.util.concurrent.Executors;
/*    */ import java.util.concurrent.ThreadFactory;
/*    */ 
/*    */ class InProcessCommunication extends ProgressCommunication {
/* 10 */   private final ExecutorService executorService = Executors.newSingleThreadExecutor((ThreadFactory)new DaemonThreadFactory("progress-comm-"));
/*    */   private final ApplicationLauncher.ProgressListener progressListener;
/*    */   
/*    */   InProcessCommunication(ApplicationLauncher.ProgressListener progressListener) {
/* 14 */     this.progressListener = progressListener;
/*    */   }
/*    */ 
/*    */   
/*    */   public void screenActivated(String id) {
/* 19 */     this.executorService.execute(() -> this.progressListener.screenActivated(id));
/*    */   }
/*    */ 
/*    */   
/*    */   public void actionStarted(String id) {
/* 24 */     this.executorService.execute(() -> this.progressListener.actionStarted(id));
/*    */   }
/*    */ 
/*    */   
/*    */   public void statusMessage(String message) {
/* 29 */     this.executorService.execute(() -> this.progressListener.statusMessage(message));
/*    */   }
/*    */ 
/*    */   
/*    */   public void detailMessage(String message) {
/* 34 */     this.executorService.execute(() -> this.progressListener.detailMessage(message));
/*    */   }
/*    */ 
/*    */   
/*    */   public void percentCompleted(int value) {
/* 39 */     this.executorService.execute(() -> this.progressListener.percentCompleted(value));
/*    */   }
/*    */ 
/*    */   
/*    */   public void secondaryPercentCompleted(int value) {
/* 44 */     this.executorService.execute(() -> this.progressListener.secondaryPercentCompleted(value));
/*    */   }
/*    */ 
/*    */   
/*    */   public void indeterminateProgress(boolean indeterminateProgress) {
/* 49 */     this.executorService.execute(() -> this.progressListener.indeterminateProgress(indeterminateProgress));
/*    */   }
/*    */ 
/*    */   
/*    */   public void exiting() {
/* 54 */     this.executorService.shutdown();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\applaunch\InProcessCommunication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */