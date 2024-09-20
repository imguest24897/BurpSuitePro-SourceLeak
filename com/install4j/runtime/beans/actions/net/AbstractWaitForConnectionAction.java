/*    */ package com.install4j.runtime.beans.actions.net;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public abstract class AbstractWaitForConnectionAction
/*    */   extends SystemInstallOrUninstallAction
/*    */ {
/* 12 */   private int timeout = 60;
/*    */   private boolean indeterminateProgress = true;
/*    */   
/*    */   public int getTimeout() {
/* 16 */     return replaceWithTextOverride("timeout", this.timeout);
/*    */   }
/*    */   
/*    */   protected abstract boolean tryConnect(Context paramContext) throws IOException, UserCanceledException;
/*    */   
/*    */   public void setTimeout(int timeout) {
/* 22 */     this.timeout = timeout;
/*    */   }
/*    */   
/*    */   public boolean isIndeterminateProgress() {
/* 26 */     return replaceWithTextOverride("indeterminateProgress", this.indeterminateProgress);
/*    */   }
/*    */   
/*    */   public void setIndeterminateProgress(boolean indeterminateProgress) {
/* 30 */     this.indeterminateProgress = indeterminateProgress;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 35 */     ProgressInterface progressInterface = context.getProgressInterface();
/* 36 */     if (isIndeterminateProgress()) {
/* 37 */       progressInterface.setIndeterminateProgress(true);
/*    */     }
/*    */     try {
/* 40 */       long endTime, startTime = System.currentTimeMillis();
/*    */       
/* 42 */       if (getTimeout() > 0) {
/* 43 */         endTime = startTime + getTimeout() * 1000L;
/*    */       } else {
/* 45 */         endTime = Long.MAX_VALUE;
/*    */       } 
/* 47 */       while (System.currentTimeMillis() < endTime && 
/* 48 */         !context.isCancelling()) {
/*    */ 
/*    */         
/*    */         try {
/* 52 */           if (tryConnect(context)) {
/* 53 */             return true;
/*    */           }
/* 55 */         } catch (IOException iOException) {}
/*    */         
/*    */         try {
/* 58 */           Thread.sleep(1000L);
/* 59 */         } catch (InterruptedException interruptedException) {}
/*    */       } 
/*    */       
/* 62 */       return false;
/*    */     } finally {
/* 64 */       if (isIndeterminateProgress()) {
/* 65 */         progressInterface.setIndeterminateProgress(false);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 72 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\net\AbstractWaitForConnectionAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */