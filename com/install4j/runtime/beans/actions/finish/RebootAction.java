/*    */ package com.install4j.runtime.beans.actions.finish;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ 
/*    */ public class RebootAction
/*    */   extends SystemInstallOrUninstallAction
/*    */ {
/*    */   private boolean askUser = true;
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 13 */     context.triggerReboot(isAskUser());
/* 14 */     return true;
/*    */   }
/*    */   
/*    */   public boolean isAskUser() {
/* 18 */     return replaceWithTextOverride("askUser", this.askUser);
/*    */   }
/*    */   
/*    */   public void setAskUser(boolean askUser) {
/* 22 */     this.askUser = askUser;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 27 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\finish\RebootAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */