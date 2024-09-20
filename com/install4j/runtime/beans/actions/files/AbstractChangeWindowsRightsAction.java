/*     */ package com.install4j.runtime.beans.actions.files;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.windows.WinUser;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*     */ import com.install4j.runtime.installer.AbstractRemoteCallable;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchStringAction;
/*     */ import com.install4j.runtime.installer.platform.win32.ACLHandling;
/*     */ import java.io.Serializable;
/*     */ 
/*     */ public abstract class AbstractChangeWindowsRightsAction
/*     */   extends SystemInstallOrUninstallAction
/*     */ {
/*  16 */   private WindowsGroup group = WindowsGroup.AUTHENTICATED_USERS;
/*     */   private boolean read;
/*     */   private boolean write;
/*     */   private boolean execute;
/*     */   private boolean all = true;
/*     */   private String sidOrAccountName;
/*  22 */   private AccessMode accessMode = AccessMode.GRANT_ACCESS;
/*     */   
/*     */   private static class GetOriginalUserRemoteCallable
/*     */     extends FetchStringAction {
/*     */     protected String fetchValue(Context context) throws Exception {
/*  27 */       return WinUser.getUserSid();
/*     */     }
/*     */     private GetOriginalUserRemoteCallable() {} }
/*     */   
/*     */   protected final String getUsedSidOrAccountName() {
/*  32 */     if (getGroup() == WindowsGroup.ORIGINAL_USER)
/*  33 */       return HelperCommunication.getInstance().fetchString(ExecutionContext.UNELEVATED, new GetOriginalUserRemoteCallable()); 
/*  34 */     if (getGroup().getSid() != null) {
/*  35 */       return getGroup().getSid();
/*     */     }
/*  37 */     return getSidOrAccountName();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSidOrAccountName() {
/*  42 */     return replaceVariables(replaceVariables(this.sidOrAccountName));
/*     */   }
/*     */   
/*     */   public void setSidOrAccountName(String sidOrAccountName) {
/*  46 */     this.sidOrAccountName = sidOrAccountName;
/*     */   }
/*     */   
/*     */   public WindowsGroup getGroup() {
/*  50 */     return (WindowsGroup)replaceWithTextOverride("group", this.group, WindowsGroup.class);
/*     */   }
/*     */   
/*     */   public void setGroup(WindowsGroup group) {
/*  54 */     this.group = group;
/*     */   }
/*     */   
/*     */   public boolean isRead() {
/*  58 */     return replaceWithTextOverride("read", this.read);
/*     */   }
/*     */   
/*     */   public void setRead(boolean read) {
/*  62 */     this.read = read;
/*     */   }
/*     */   
/*     */   public boolean isWrite() {
/*  66 */     return replaceWithTextOverride("write", this.write);
/*     */   }
/*     */   
/*     */   public void setWrite(boolean write) {
/*  70 */     this.write = write;
/*     */   }
/*     */   
/*     */   public boolean isExecute() {
/*  74 */     return replaceWithTextOverride("execute", this.execute);
/*     */   }
/*     */   
/*     */   public void setExecute(boolean execute) {
/*  78 */     this.execute = execute;
/*     */   }
/*     */   
/*     */   public boolean isAll() {
/*  82 */     return replaceWithTextOverride("all", this.all);
/*     */   }
/*     */   
/*     */   public void setAll(boolean all) {
/*  86 */     this.all = all;
/*     */   }
/*     */   
/*     */   public AccessMode getAccessMode() {
/*  90 */     return (AccessMode)replaceWithTextOverride("accessMode", this.accessMode, AccessMode.class);
/*     */   }
/*     */   
/*     */   public void setAccessMode(AccessMode accessMode) {
/*  94 */     this.accessMode = accessMode;
/*     */   }
/*     */   
/*     */   protected static class ACERemoteCallable
/*     */     extends AbstractRemoteCallable
/*     */   {
/*     */     private final String objectName;
/*     */     private final boolean regKey;
/*     */     private final boolean read;
/*     */     private final boolean write;
/*     */     private final boolean execute;
/*     */     private final boolean all;
/*     */     private final int groupType;
/*     */     private final String sidOrAccountName;
/*     */     private final AbstractChangeWindowsRightsAction.AccessMode accessMode;
/*     */     
/*     */     public ACERemoteCallable(String objectName, boolean regKey, boolean read, boolean write, boolean execute, boolean all, int groupType, String sidOrAccountName, AbstractChangeWindowsRightsAction.AccessMode accessMode) {
/* 111 */       this.objectName = objectName;
/* 112 */       this.regKey = regKey;
/* 113 */       this.read = read;
/* 114 */       this.write = write;
/* 115 */       this.execute = execute;
/* 116 */       this.all = all;
/* 117 */       this.groupType = groupType;
/* 118 */       this.sidOrAccountName = sidOrAccountName;
/* 119 */       this.accessMode = accessMode;
/*     */     }
/*     */ 
/*     */     
/*     */     public Serializable execute() {
/* 124 */       return Boolean.valueOf(ACLHandling.addACE(this.objectName, this.regKey, this.read, this.write, this.execute, this.all, this.groupType, this.sidOrAccountName, this.accessMode.getIntValue()));
/*     */     }
/*     */   }
/*     */   
/*     */   public enum AccessMode {
/* 129 */     GRANT_ACCESS(1, "Grant access"),
/* 130 */     SET_ACCESS(2, "Set access"),
/* 131 */     DENY_ACCESS(3, "Deny access"),
/* 132 */     REVOKE_ACCESS(4, "Revoke access");
/*     */     
/*     */     private final int intValue;
/*     */     private final String verbose;
/*     */     
/*     */     AccessMode(int intValue, String verbose) {
/* 138 */       this.intValue = intValue;
/* 139 */       this.verbose = verbose;
/*     */     }
/*     */     
/*     */     public int getIntValue() {
/* 143 */       return this.intValue;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 149 */       return this.verbose;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\AbstractChangeWindowsRightsAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */