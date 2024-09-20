/*    */ package com.install4j.runtime.beans.actions.registry;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.RemoteCallable;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.windows.RegistryRoot;
/*    */ import com.install4j.runtime.beans.actions.files.AbstractChangeWindowsRightsAction;
/*    */ import com.install4j.runtime.installer.ContextImpl;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ 
/*    */ public class AddRegistryRightsAction extends AbstractChangeWindowsRightsAction {
/*    */   private RegistryRoot registryRoot;
/* 13 */   private String keyName = "";
/*    */   
/*    */   public RegistryRoot getRegistryRoot() {
/* 16 */     return (RegistryRoot)replaceWithTextOverride("registryRoot", this.registryRoot, RegistryRoot.class);
/*    */   }
/*    */   
/*    */   public void setRegistryRoot(RegistryRoot registryRoot) {
/* 20 */     this.registryRoot = registryRoot;
/*    */   }
/*    */   
/*    */   public String getKeyName() {
/* 24 */     return replaceVariables(replaceVariables(this.keyName));
/*    */   }
/*    */   
/*    */   public void setKeyName(String keyName) {
/* 28 */     this.keyName = keyName;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 33 */     if (!InstallerUtil.isWindows()) {
/* 34 */       return true;
/*    */     }
/*    */     
/* 37 */     return ContextImpl.getContextInt(context).runBooleanActivityWithFallback((RemoteCallable)new AbstractChangeWindowsRightsAction.ACERemoteCallable(getRegistryRootString() + "\\" + getKeyName(), true, 
/* 38 */           isRead(), isWrite(), isExecute(), isAll(), getGroup().getIntValue(), getUsedSidOrAccountName(), getAccessMode()));
/*    */   }
/*    */   
/*    */   private String getRegistryRootString() {
/* 42 */     if (getRegistryRoot() == RegistryRoot.HKEY_LOCAL_MACHINE) {
/* 43 */       return "MACHINE";
/*    */     }
/* 45 */     return getRegistryRoot().toString().substring(5);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 51 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\AddRegistryRightsAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */