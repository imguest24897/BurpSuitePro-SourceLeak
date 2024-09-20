/*    */ package com.install4j.runtime.beans.actions;
/*    */ 
/*    */ import com.install4j.api.actions.AbstractInstallAction;
/*    */ import com.install4j.api.actions.InstallAction;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.runtime.beans.SystemLoaded;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ 
/*    */ public abstract class SystemInstallAction
/*    */   extends AbstractInstallAction
/*    */   implements SystemLoaded {
/* 14 */   private List<InstallAction> rollbackActions = new ArrayList<>();
/*    */   
/*    */   protected void addRollbackAction(InstallAction action) {
/* 17 */     this.rollbackActions.add(action);
/*    */   }
/*    */   
/*    */   protected void addRollbackActions(Collection<SystemInstallOrUninstallAction> collection) {
/* 21 */     this.rollbackActions.addAll(collection);
/*    */   }
/*    */ 
/*    */   
/*    */   public void rollback(InstallerContext context) {
/* 26 */     for (int i = this.rollbackActions.size() - 1; i >= 0; i--) {
/* 27 */       InstallAction action = this.rollbackActions.get(i);
/* 28 */       action.rollback(context);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\SystemInstallAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */