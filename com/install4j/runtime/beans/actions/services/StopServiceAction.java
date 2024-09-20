/*    */ package com.install4j.runtime.beans.actions.services;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ public class StopServiceAction
/*    */   extends AbstractControlServiceAction
/*    */ {
/* 12 */   private int windowsStopMinimumWaitTime = 30000;
/*    */ 
/*    */   
/*    */   public int getWindowsStopMinimumWaitTime() {
/* 16 */     return replaceWithTextOverride("windowsStopMinimumWaitTime", this.windowsStopMinimumWaitTime);
/*    */   }
/*    */   
/*    */   public void setWindowsStopMinimumWaitTime(int windowsStopMinimumWaitTime) {
/* 20 */     this.windowsStopMinimumWaitTime = windowsStopMinimumWaitTime;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 25 */     return controlService(context, "stop");
/*    */   }
/*    */ 
/*    */   
/*    */   public void rollback(InstallerContext context) {
/* 30 */     if (isSuccess() && Objects.equals(getPreviouslyRunning(), Boolean.TRUE))
/* 31 */       controlService((Context)context, "start"); 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\services\StopServiceAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */