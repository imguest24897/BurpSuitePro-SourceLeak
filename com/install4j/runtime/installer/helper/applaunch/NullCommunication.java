/*    */ package com.install4j.runtime.installer.helper.applaunch;
/*    */ 
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ 
/*    */ class NullCommunication extends ProgressCommunication {
/*  6 */   public static NullCommunication INSTANCE = new NullCommunication();
/*    */ 
/*    */ 
/*    */   
/*    */   public void screenActivated(String id) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void actionStarted(String id) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void statusMessage(String message) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void detailMessage(String message) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void percentCompleted(int value) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void secondaryPercentCompleted(int value) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void indeterminateProgress(boolean indeterminateProgress) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void exiting() {}
/*    */ 
/*    */   
/*    */   public ProgressInterface wrap(ProgressInterface progressInterface) {
/* 42 */     return progressInterface;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\applaunch\NullCommunication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */