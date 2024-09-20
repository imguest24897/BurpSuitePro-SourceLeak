/*    */ package com.install4j.runtime.beans.actions;
/*    */ import com.install4j.api.actions.AbstractInstallOrUninstallAction;
/*    */ import com.install4j.api.actions.InstallAction;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.api.context.UninstallerContext;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.SystemLoaded;
/*    */ import com.install4j.runtime.beans.actions.files.ArchiveFileOperationRoot;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ public abstract class SystemInstallOrUninstallAction extends AbstractInstallOrUninstallAction implements SystemLoaded {
/* 19 */   private List<InstallAction> rollbackActions = new ArrayList<>();
/* 20 */   private Map<String, Object> variableBackup = new HashMap<>();
/*    */   
/*    */   private File overriddenTargetDir;
/*    */   private boolean suppressRollback;
/*    */   
/*    */   public abstract boolean execute(Context paramContext) throws UserCanceledException;
/*    */   
/*    */   public boolean install(InstallerContext context) throws UserCanceledException {
/* 28 */     initVariables((Context)context);
/* 29 */     return execute((Context)context);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean uninstall(UninstallerContext context) throws UserCanceledException {
/* 34 */     initVariables((Context)context);
/* 35 */     return execute((Context)context);
/*    */   }
/*    */   
/*    */   private void initVariables(Context context) {
/* 39 */     this.overriddenTargetDir = (File)context.getVariable("sys.overriddenTargetDir");
/* 40 */     this.suppressRollback = context.getBooleanVariable("sys.actionSuppressRollback");
/*    */   }
/*    */   
/*    */   protected File resolveRelativeFile(File file, Context context) {
/* 44 */     return resolveRelativeFile(file, null, context);
/*    */   }
/*    */   
/*    */   protected File resolveRelativeFile(File file, ArchiveFileOperationRoot filesRoot, Context context) {
/* 48 */     if ((filesRoot == null || filesRoot == ArchiveFileOperationRoot.ARCHIVE) && this.overriddenTargetDir != null && file != null && !file.isAbsolute()) {
/* 49 */       return new File(this.overriddenTargetDir, file.getPath());
/*    */     }
/* 51 */     return context.getDestinationFile(file);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean isInOverriddenTargetDir(File file) {
/*    */     try {
/* 57 */       return (this.overriddenTargetDir != null && file != null && file.getCanonicalPath().startsWith(this.overriddenTargetDir.getPath()));
/* 58 */     } catch (IOException e) {
/* 59 */       return false;
/*    */     } 
/*    */   }
/*    */   
/*    */   protected boolean isSuppressRollback() {
/* 64 */     return this.suppressRollback;
/*    */   }
/*    */   
/*    */   protected void addRollbackAction(InstallAction action) {
/* 68 */     this.rollbackActions.add(action);
/*    */   }
/*    */   
/*    */   protected void addRollbackActions(Collection<InstallAction> collection) {
/* 72 */     this.rollbackActions.addAll(collection);
/*    */   }
/*    */ 
/*    */   
/*    */   public void rollback(InstallerContext context) {
/* 77 */     for (int i = this.rollbackActions.size() - 1; i >= 0; i--) {
/* 78 */       InstallAction action = this.rollbackActions.get(i);
/* 79 */       action.rollback(context);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected void overrideVariable(String name, Object value, Context context) {
/* 84 */     this.variableBackup.put(name, context.getVariable(name));
/* 85 */     context.setVariable(name, value);
/*    */   }
/*    */   
/*    */   protected void restoreVariables(Context context) {
/* 89 */     for (Map.Entry<String, Object> entry : this.variableBackup.entrySet()) {
/* 90 */       context.setVariable(entry.getKey(), entry.getValue());
/*    */     }
/* 92 */     this.variableBackup.clear();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\SystemInstallOrUninstallAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */