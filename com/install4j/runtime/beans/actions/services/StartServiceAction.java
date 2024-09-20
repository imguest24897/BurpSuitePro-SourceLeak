/*    */ package com.install4j.runtime.beans.actions.services;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public class StartServiceAction
/*    */   extends AbstractControlServiceAction
/*    */ {
/*    */   private boolean autostartOnly = false;
/*    */   
/*    */   public boolean isAutostartOnly() {
/* 14 */     return replaceWithTextOverride("autostartOnly", this.autostartOnly);
/*    */   }
/*    */   
/*    */   public void setAutostartOnly(boolean autostartOnly) {
/* 18 */     this.autostartOnly = autostartOnly;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 23 */     return controlService(context, "start", isAutostartOnly());
/*    */   }
/*    */ 
/*    */   
/*    */   public void rollback(InstallerContext context) {
/* 28 */     if (isSuccess() && (Objects.equals(getPreviouslyRunning(), Boolean.FALSE) || isDirectControlOnly()))
/* 29 */       controlService((Context)context, "stop"); 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\services\StartServiceAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */