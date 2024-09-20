/*    */ package com.install4j.runtime.beans.actions.control;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ 
/*    */ public class SleepAction
/*    */   extends SystemInstallOrUninstallAction {
/*  9 */   private int sleepTimeMs = 1000;
/*    */   
/*    */   public int getSleepTimeMs() {
/* 12 */     return replaceWithTextOverride("sleepTimeMs", this.sleepTimeMs);
/*    */   }
/*    */   
/*    */   public void setSleepTimeMs(int sleepTimeMs) {
/* 16 */     this.sleepTimeMs = sleepTimeMs;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/*    */     try {
/* 22 */       Thread.sleep(getSleepTimeMs());
/* 23 */     } catch (InterruptedException interruptedException) {}
/*    */     
/* 25 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 30 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\control\SleepAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */