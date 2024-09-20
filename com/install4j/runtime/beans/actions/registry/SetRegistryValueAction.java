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
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.StringTokenizer;
/*     */ 
/*     */ public class SetRegistryValueAction
/*     */   extends SystemInstallOrUninstallAction {
/*     */   private RegistryRoot registryRoot;
/*  19 */   private String keyName = "";
/*  20 */   private String valueName = "";
/*  21 */   private String value = "";
/*     */   
/*     */   private boolean createKey = true;
/*  24 */   private transient Object externalValue = null;
/*     */ 
/*     */   
/*     */   public SetRegistryValueAction() {}
/*     */   
/*     */   public SetRegistryValueAction(RegistryRoot registryRoot, String keyName, String valueName, Object value, boolean createKey) {
/*  30 */     setRegistryRoot(registryRoot);
/*  31 */     setKeyName(keyName);
/*  32 */     setValueName(valueName);
/*  33 */     this.externalValue = value;
/*  34 */     if (this.externalValue == null) setValue((String)null); 
/*  35 */     setCreateKey(createKey);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean execute(Context context) {
/*  40 */     if (!InstallerUtil.isWindows()) {
/*  41 */       return true;
/*     */     }
/*     */     
/*  44 */     PerformedAction performedAction = new PerformedAction();
/*  45 */     addRollbackAction((InstallAction)performedAction);
/*  46 */     if (isCreateKey() && !doCreateKey(performedAction)) {
/*  47 */       Logger.getInstance().error(this, "could not create key " + getRegistryRoot() + " " + getKeyName());
/*  48 */       return false;
/*     */     } 
/*     */     
/*  51 */     performedAction.oldValue = WinRegistry.getValue(getRegistryRoot(), getKeyName(), getValueName());
/*     */     
/*  53 */     Object value = (this.externalValue != null) ? this.externalValue : getValue();
/*  54 */     if (value instanceof String && performedAction.oldValue instanceof WinRegistry.ExpandString) {
/*  55 */       value = new WinRegistry.ExpandString((String)value);
/*     */     }
/*     */     
/*  58 */     if (value == null) {
/*  59 */       performedAction.newValueSet = true;
/*  60 */       WinRegistry.deleteValue(getRegistryRoot(), getKeyName(), getValueName());
/*     */     } else {
/*  62 */       performedAction.newValueSet = WinRegistry.setValue(getRegistryRoot(), getKeyName(), getValueName(), value);
/*  63 */       if (!performedAction.newValueSet) {
/*  64 */         Logger.getInstance().error(this, "could not set value " + getRegistryRoot() + " " + getKeyName() + " " + getValueName() + ": " + value);
/*     */       }
/*     */     } 
/*  67 */     return performedAction.newValueSet;
/*     */   }
/*     */   
/*     */   private boolean doCreateKey(PerformedAction performedAction) {
/*  71 */     String usedKeyName = getKeyName();
/*     */     
/*  73 */     String curKeyName = null;
/*  74 */     for (StringTokenizer tokenizer = new StringTokenizer(usedKeyName, "\\"); tokenizer.hasMoreTokens(); ) {
/*  75 */       String nextToken = tokenizer.nextToken();
/*  76 */       if (curKeyName == null) {
/*  77 */         curKeyName = "";
/*     */       } else {
/*  79 */         curKeyName = curKeyName + "\\";
/*     */       } 
/*  81 */       curKeyName = curKeyName + nextToken;
/*     */       
/*  83 */       if (!WinRegistry.keyExists(getRegistryRoot(), curKeyName)) {
/*  84 */         if (!WinRegistry.createKey(getRegistryRoot(), curKeyName)) {
/*  85 */           return false;
/*     */         }
/*  87 */         performedAction.createdKeys.add(curKeyName);
/*     */       } 
/*     */     } 
/*  90 */     return true;
/*     */   }
/*     */   
/*     */   public RegistryRoot getRegistryRoot() {
/*  94 */     return (RegistryRoot)replaceWithTextOverride("registryRoot", this.registryRoot, RegistryRoot.class);
/*     */   }
/*     */   
/*     */   public void setRegistryRoot(RegistryRoot registryRoot) {
/*  98 */     this.registryRoot = registryRoot;
/*     */   }
/*     */   
/*     */   public String getKeyName() {
/* 102 */     return replaceVariables(replaceVariables(this.keyName));
/*     */   }
/*     */   
/*     */   public void setKeyName(String keyName) {
/* 106 */     this.keyName = keyName;
/*     */   }
/*     */   
/*     */   public String getValueName() {
/* 110 */     return replaceVariables(replaceVariables(this.valueName));
/*     */   }
/*     */   
/*     */   public void setValueName(String valueName) {
/* 114 */     this.valueName = valueName;
/*     */   }
/*     */   
/*     */   public String getValue() {
/* 118 */     return replaceVariables(replaceVariables(this.value));
/*     */   }
/*     */   
/*     */   public void setValue(String value) {
/* 122 */     this.value = value;
/*     */   }
/*     */   
/*     */   public boolean isCreateKey() {
/* 126 */     return replaceWithTextOverride("createKey", this.createKey);
/*     */   }
/*     */   
/*     */   public void setCreateKey(boolean createKey) {
/* 130 */     this.createKey = createKey;
/*     */   }
/*     */   
/*     */   private class PerformedAction extends SetRegistryValueAction {
/* 134 */     List<String> createdKeys = new ArrayList<>();
/*     */     boolean newValueSet = false;
/*     */     Object oldValue;
/*     */     
/*     */     PerformedAction() {
/* 139 */       setRegistryRoot(SetRegistryValueAction.this.getRegistryRoot());
/* 140 */       setKeyName(SetRegistryValueAction.this.getKeyName());
/* 141 */       setValueName(SetRegistryValueAction.this.getValueName());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean install(InstallerContext context) throws UserCanceledException {
/* 146 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void rollback(InstallerContext context) {
/* 151 */       if (this.newValueSet) {
/* 152 */         if (this.oldValue == null) {
/* 153 */           WinRegistry.deleteValue(getRegistryRoot(), getKeyName(), getValueName());
/*     */         } else {
/* 155 */           WinRegistry.setValue(getRegistryRoot(), getKeyName(), getValueName(), this.oldValue);
/*     */         } 
/*     */       }
/* 158 */       for (int i = this.createdKeys.size() - 1; i >= 0; i--) {
/* 159 */         String keyName = this.createdKeys.get(i);
/*     */         
/* 161 */         WinRegistry.getSubKeyNames(getRegistryRoot(), keyName);
/* 162 */         WinRegistry.deleteKey(getRegistryRoot(), keyName, true);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\SetRegistryValueAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */