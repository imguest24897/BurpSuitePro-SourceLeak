/*    */ package com.install4j.runtime.beans.actions.registry;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.windows.RegistryRoot;
/*    */ import com.install4j.api.windows.WinRegistry;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ 
/*    */ public class ReadRegistryValueAction
/*    */   extends SystemInstallOrUninstallAction {
/*    */   private RegistryRoot registryRoot;
/* 12 */   private String keyName = "";
/* 13 */   private String valueName = "";
/*    */   private boolean useDefault = false;
/* 15 */   private String defaultValue = "";
/* 16 */   private String variableName = "";
/*    */   
/*    */   public RegistryRoot getRegistryRoot() {
/* 19 */     return (RegistryRoot)replaceWithTextOverride("registryRoot", this.registryRoot, RegistryRoot.class);
/*    */   }
/*    */   
/*    */   public void setRegistryRoot(RegistryRoot registryRoot) {
/* 23 */     this.registryRoot = registryRoot;
/*    */   }
/*    */   
/*    */   public String getKeyName() {
/* 27 */     return replaceVariables(replaceVariables(this.keyName));
/*    */   }
/*    */   
/*    */   public void setKeyName(String keyName) {
/* 31 */     this.keyName = keyName;
/*    */   }
/*    */   
/*    */   public String getValueName() {
/* 35 */     return replaceVariables(replaceVariables(this.valueName));
/*    */   }
/*    */   
/*    */   public void setValueName(String valueName) {
/* 39 */     this.valueName = valueName;
/*    */   }
/*    */   
/*    */   public boolean isUseDefault() {
/* 43 */     return replaceWithTextOverride("useDefault", this.useDefault);
/*    */   }
/*    */   
/*    */   public void setUseDefault(boolean useDefault) {
/* 47 */     this.useDefault = useDefault;
/*    */   }
/*    */   
/*    */   public String getDefaultValue() {
/* 51 */     return replaceVariables(replaceVariables(this.defaultValue));
/*    */   }
/*    */   
/*    */   public void setDefaultValue(String defaultValue) {
/* 55 */     this.defaultValue = defaultValue;
/*    */   }
/*    */   
/*    */   public String getVariableName() {
/* 59 */     return replaceVariables(this.variableName);
/*    */   }
/*    */   
/*    */   public void setVariableName(String variableName) {
/* 63 */     this.variableName = variableName;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) {
/* 68 */     if (!InstallerUtil.isWindows()) {
/* 69 */       return true;
/*    */     }
/*    */     
/* 72 */     Object value = WinRegistry.getValue(getRegistryRoot(), getKeyName(), getValueName());
/* 73 */     if (value == null && isUseDefault()) {
/* 74 */       value = getDefaultValue();
/*    */     }
/* 76 */     if (value != null) {
/* 77 */       context.setVariable(getVariableName(), value);
/* 78 */       return true;
/*    */     } 
/* 80 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\ReadRegistryValueAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */