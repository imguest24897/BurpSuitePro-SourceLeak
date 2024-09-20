/*     */ package com.install4j.runtime.beans.actions.registry;
/*     */ 
/*     */ import com.install4j.api.actions.InstallAction;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.windows.RegistryRoot;
/*     */ import com.install4j.api.windows.WinRegistry;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ 
/*     */ public class DeleteRegistryItemAction
/*     */   extends SystemInstallOrUninstallAction {
/*     */   private RegistryRoot registryRoot;
/*  17 */   private String keyName = "";
/*  18 */   private String valueName = "";
/*     */   
/*     */   private boolean onlyIfEmpty = true;
/*     */   
/*     */   public DeleteRegistryItemAction() {}
/*     */   
/*     */   public DeleteRegistryItemAction(RegistryRoot registryRoot, String keyName, String valueName, boolean onlyIfEmpty) {
/*  25 */     setRegistryRoot(registryRoot);
/*  26 */     setKeyName(keyName);
/*  27 */     setValueName(valueName);
/*  28 */     setOnlyIfEmpty(onlyIfEmpty);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/*  33 */     if (!InstallerUtil.isWindows()) {
/*  34 */       return true;
/*     */     }
/*     */     
/*  37 */     String valueName = getValueName();
/*  38 */     PerformedAction performedAction = new PerformedAction();
/*  39 */     addRollbackAction((InstallAction)performedAction);
/*  40 */     if (valueName.trim().length() == 0) {
/*  41 */       if (context instanceof InstallerContext) {
/*     */         try {
/*  43 */           performedAction.backupFile = File.createTempFile("i4j", ".reg");
/*  44 */           performedAction.backupFile.delete();
/*  45 */           if (!WinRegistry.saveKey(getRegistryRoot(), getKeyName(), performedAction.backupFile.getAbsolutePath())) {
/*  46 */             performedAction.backupFile.delete();
/*  47 */             performedAction.backupFile = null;
/*     */           } else {
/*  49 */             InstallerUtil.deleteOnExit(performedAction.backupFile);
/*     */           } 
/*  51 */         } catch (IOException e) {
/*  52 */           e.printStackTrace();
/*     */         } 
/*     */       }
/*     */       
/*  56 */       WinRegistry.deleteKey(getRegistryRoot(), getKeyName(), isOnlyIfEmpty());
/*     */     } else {
/*  58 */       performedAction.oldValue = WinRegistry.getValue(getRegistryRoot(), getKeyName(), valueName);
/*  59 */       WinRegistry.deleteValue(getRegistryRoot(), getKeyName(), valueName);
/*     */     } 
/*  61 */     return true;
/*     */   }
/*     */   
/*     */   public RegistryRoot getRegistryRoot() {
/*  65 */     return (RegistryRoot)replaceWithTextOverride("registryRoot", this.registryRoot, RegistryRoot.class);
/*     */   }
/*     */   
/*     */   public void setRegistryRoot(RegistryRoot registryRoot) {
/*  69 */     this.registryRoot = registryRoot;
/*     */   }
/*     */   
/*     */   public String getKeyName() {
/*  73 */     return replaceVariables(replaceVariables(this.keyName));
/*     */   }
/*     */   
/*     */   public void setKeyName(String keyName) {
/*  77 */     this.keyName = keyName;
/*     */   }
/*     */   
/*     */   public String getValueName() {
/*  81 */     return replaceVariables(replaceVariables(this.valueName));
/*     */   }
/*     */   
/*     */   public void setValueName(String valueName) {
/*  85 */     this.valueName = valueName;
/*     */   }
/*     */   
/*     */   public boolean isOnlyIfEmpty() {
/*  89 */     return replaceWithTextOverride("onlyIfEmpty", this.onlyIfEmpty);
/*     */   }
/*     */   
/*     */   public void setOnlyIfEmpty(boolean onlyIfEmpty) {
/*  93 */     this.onlyIfEmpty = onlyIfEmpty;
/*     */   }
/*     */   
/*     */   private class PerformedAction extends DeleteRegistryItemAction {
/*     */     private Object oldValue;
/*     */     private File backupFile;
/*     */     
/*     */     public PerformedAction() {
/* 101 */       setRegistryRoot(DeleteRegistryItemAction.this.getRegistryRoot());
/* 102 */       setKeyName(DeleteRegistryItemAction.this.getKeyName());
/* 103 */       setValueName(DeleteRegistryItemAction.this.getValueName());
/*     */     }
/*     */ 
/*     */     
/*     */     public void rollback(InstallerContext context) {
/* 108 */       if (this.backupFile != null) {
/* 109 */         WinRegistry.restoreKey(getRegistryRoot(), getKeyName(), this.backupFile.getAbsolutePath());
/* 110 */       } else if (this.oldValue != null) {
/* 111 */         WinRegistry.setValue(getRegistryRoot(), getKeyName(), getValueName(), this.oldValue);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\DeleteRegistryItemAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */