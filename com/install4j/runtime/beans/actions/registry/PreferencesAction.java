/*     */ package com.install4j.runtime.beans.actions.registry;
/*     */ 
/*     */ import com.install4j.api.actions.AbstractInstallAction;
/*     */ import com.install4j.api.actions.InstallAction;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*     */ import com.install4j.runtime.installer.helper.PreferencesUtil;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import java.io.Serializable;
/*     */ import java.util.List;
/*     */ import java.util.prefs.BackingStoreException;
/*     */ import java.util.prefs.Preferences;
/*     */ 
/*     */ public abstract class PreferencesAction extends SystemInstallOrUninstallAction {
/*  20 */   private String packageName = "";
/*     */   
/*     */   public String getPackageName() {
/*  23 */     return replaceVariables(replaceVariables(this.packageName));
/*     */   }
/*     */   
/*     */   public void setPackageName(String packageName) {
/*  27 */     this.packageName = packageName;
/*     */   }
/*     */   
/*     */   protected boolean handleRollbackActions(List<PreferencesRollbackAction> rollbackActions) {
/*  31 */     if (rollbackActions == null) {
/*  32 */       return false;
/*     */     }
/*  34 */     for (PreferencesRollbackAction rollbackAction : rollbackActions) {
/*  35 */       addRollbackAction((InstallAction)rollbackAction);
/*     */     }
/*  37 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static abstract class PreferencesRollbackAction
/*     */     extends AbstractInstallAction
/*     */   {
/*  46 */     private boolean elevatedHelper = HelperCommunication.getInstance().isElevatedHelper();
/*     */ 
/*     */     
/*     */     protected abstract void rollbackDirectly(Context param1Context);
/*     */     
/*     */     public boolean isElevatedHelper() {
/*  52 */       return this.elevatedHelper;
/*     */     }
/*     */ 
/*     */     
/*     */     public final void rollback(InstallerContext context) {
/*  57 */       if (HelperCommunication.getInstance().isElevatedHelper() != this.elevatedHelper) {
/*  58 */         HelperCommunication.getInstance().executeAction(ExecutionContext.OTHER, (CommunicationAction)new RunAction()
/*     */             {
/*     */               protected void run(Context context) throws Exception {
/*  61 */                 PreferencesAction.PreferencesRollbackAction.this.rollbackDirectly(context);
/*     */               }
/*     */             });
/*     */       } else {
/*  65 */         rollbackDirectly((Context)context);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean install(InstallerContext context) throws UserCanceledException {
/*  71 */       throw new UnsupportedOperationException();
/*     */     }
/*     */   }
/*     */   
/*     */   protected static class PackageNodeProvider
/*     */     implements Serializable {
/*     */     private String packageName;
/*     */     private boolean userSpecific;
/*     */     private boolean create;
/*     */     
/*     */     public PackageNodeProvider(String packageName, boolean userSpecific, boolean create) {
/*  82 */       this.packageName = packageName;
/*  83 */       this.userSpecific = userSpecific;
/*  84 */       this.create = create;
/*     */     }
/*     */     
/*     */     public Preferences getPackageNode() {
/*     */       try {
/*  89 */         return getPackageNodeUnguarded();
/*  90 */       } catch (BackingStoreException e) {
/*  91 */         e.printStackTrace();
/*  92 */         return null;
/*     */       } 
/*     */     }
/*     */     
/*     */     public Preferences getPackageNodeUnguarded() throws BackingStoreException {
/*  97 */       if (this.create) {
/*  98 */         return PreferencesUtil.getPackageNode(this.packageName, this.userSpecific);
/*     */       }
/* 100 */       return PreferencesUtil.getPackageNodeNoCreation(this.packageName, this.userSpecific);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\PreferencesAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */