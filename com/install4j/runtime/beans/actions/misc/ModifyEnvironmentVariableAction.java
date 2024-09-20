/*     */ package com.install4j.runtime.beans.actions.misc;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.actions.AutoUninstallAction;
/*     */ import com.install4j.api.actions.InstallAction;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UninstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.platform.win32.EnvVars;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Properties;
/*     */ 
/*     */ public class ModifyEnvironmentVariableAction
/*     */   extends SystemInstallOrUninstallAction implements AutoUninstallAction {
/*  19 */   private ModifyStringType type = ModifyStringType.SET;
/*     */   
/*     */   private String variableName;
/*     */   
/*     */   private String value;
/*     */   private boolean userSpecific = true;
/*     */   private boolean revertOnUninstallation = true;
/*     */   private boolean revertOnlyIfNotModified = false;
/*  27 */   private Properties persistentProperties = new Properties();
/*     */   
/*     */   private static final String PROP_VARIABLE_NAME = "variableName";
/*     */   
/*     */   private static final String PROP_VARIABLE_VALUE = "variableValue";
/*     */   private static final String PROP_USER_SPECIFIC = "userSpecific";
/*     */   private static final String PROP_TYPE = "type";
/*     */   private static final String PROP_ORIGINAL_VALUE = "originalValue";
/*     */   private static final String PROP_MODIFIED_VALUE = "modifiedValue";
/*     */   private static final String PROP_AUTO_UNINSTALL_TYPE = "autoUninstallType";
/*     */   private static final String AUTO_UNINSTALL_TYPE_NEVER = "never";
/*     */   private static final String AUTO_UNINSTALL_TYPE_ONLY_IF_NOT_MODIFIED = "onlyIfNotModified";
/*     */   private static final String AUTO_UNINSTALL_TYPE_ALWAYS = "always";
/*     */   
/*     */   public ModifyStringType getType() {
/*  42 */     return (ModifyStringType)replaceWithTextOverride("type", this.type, ModifyStringType.class);
/*     */   }
/*     */   
/*     */   public void setType(ModifyStringType type) {
/*  46 */     this.type = type;
/*     */   }
/*     */   
/*     */   public String getVariableName() {
/*  50 */     return replaceVariables(replaceVariables(this.variableName));
/*     */   }
/*     */   
/*     */   public void setVariableName(String variableName) {
/*  54 */     this.variableName = variableName;
/*     */   }
/*     */   
/*     */   public String getValue() {
/*  58 */     return replaceVariables(replaceVariables(this.value));
/*     */   }
/*     */   
/*     */   public void setValue(String value) {
/*  62 */     this.value = value;
/*     */   }
/*     */   
/*     */   public boolean isUserSpecific() {
/*  66 */     return replaceWithTextOverride("userSpecific", this.userSpecific);
/*     */   }
/*     */   
/*     */   public void setUserSpecific(boolean userSpecific) {
/*  70 */     this.userSpecific = userSpecific;
/*     */   }
/*     */   
/*     */   public boolean isRevertOnUninstallation() {
/*  74 */     return replaceWithTextOverride("revertOnUninstallation", this.revertOnUninstallation);
/*     */   }
/*     */   
/*     */   public void setRevertOnUninstallation(boolean revertOnUninstallation) {
/*  78 */     this.revertOnUninstallation = revertOnUninstallation;
/*     */   }
/*     */   
/*     */   public boolean isRevertOnlyIfNotModified() {
/*  82 */     return replaceWithTextOverride("revertOnlyIfNotModified", this.revertOnlyIfNotModified);
/*     */   }
/*     */   
/*     */   public void setRevertOnlyIfNotModified(boolean revertOnlyIfNotModified) {
/*  86 */     this.revertOnlyIfNotModified = revertOnlyIfNotModified;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/*  91 */     if (!InstallerUtil.isWindows()) {
/*  92 */       return true;
/*     */     }
/*     */     
/*     */     try {
/*  96 */       String autoUninstallType = "never";
/*     */       
/*  98 */       if (isRevertOnUninstallation()) {
/*  99 */         String originalValue = EnvVars.getWinNT(getVariableName(), isUserSpecific());
/* 100 */         if (originalValue != null) {
/* 101 */           getPersistentProperties().setProperty("originalValue", originalValue);
/*     */         }
/* 103 */         if (isRevertOnlyIfNotModified()) {
/* 104 */           autoUninstallType = "onlyIfNotModified";
/*     */         } else {
/* 106 */           autoUninstallType = "always";
/*     */         } 
/*     */       } 
/*     */       
/* 110 */       ModifyStringType type = getType();
/* 111 */       String usedValue = (type == ModifyStringType.REMOVE) ? null : getValue();
/* 112 */       List<InstallAction> rollbackActions = EnvVars.set(getVariableName(), usedValue, isUserSpecific(), (type == ModifyStringType.APPEND), (type == ModifyStringType.PREPEND));
/*     */       
/* 114 */       addRollbackActions(rollbackActions);
/* 115 */       if (rollbackActions.size() == 0) {
/* 116 */         autoUninstallType = "never";
/*     */       }
/*     */       
/* 119 */       if (!Objects.equals(autoUninstallType, "never")) {
/* 120 */         String modifiedValue = EnvVars.getWinNT(getVariableName(), isUserSpecific());
/* 121 */         if (modifiedValue != null) {
/* 122 */           getPersistentProperties().setProperty("modifiedValue", modifiedValue);
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 127 */       getPersistentProperties().setProperty("variableName", getVariableName());
/* 128 */       if (usedValue != null) {
/* 129 */         getPersistentProperties().setProperty("variableValue", usedValue);
/*     */       }
/* 131 */       getPersistentProperties().setProperty("userSpecific", String.valueOf(isUserSpecific()));
/* 132 */       getPersistentProperties().setProperty("type", type.toString());
/* 133 */       getPersistentProperties().setProperty("autoUninstallType", autoUninstallType);
/*     */       
/* 135 */       return true;
/* 136 */     } catch (IOException e) {
/* 137 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean uninstall(UninstallerContext context) throws UserCanceledException {
/* 143 */     if (Boolean.getBoolean("install4j.debugModifyEnvVar")) {
/* 144 */       Util.logInfo(this, getPersistentProperties().toString());
/*     */     }
/* 146 */     if (getPersistentProperties().size() == 0) {
/* 147 */       return execute((Context)context);
/*     */     }
/*     */     try {
/* 150 */       String autoUninstallType = getPersistentProperties().getProperty("autoUninstallType");
/* 151 */       if (!Objects.equals(autoUninstallType, "never")) {
/* 152 */         String variableName = getPersistentProperties().getProperty("variableName");
/* 153 */         boolean userSpecific = Boolean.parseBoolean(getPersistentProperties().getProperty("userSpecific"));
/* 154 */         String currentValue = EnvVars.getWinNT(variableName, userSpecific);
/* 155 */         String originalValue = getPersistentProperties().getProperty("originalValue");
/* 156 */         ModifyStringType type = ModifyStringType.getFromString(getPersistentProperties().getProperty("type"));
/* 157 */         if (currentValue != null) {
/* 158 */           if (Objects.equals(autoUninstallType, "onlyIfNotModified")) {
/* 159 */             if (Objects.equals(currentValue, getPersistentProperties().getProperty("modifiedValue"))) {
/* 160 */               EnvVars.setWinNT(variableName, originalValue, userSpecific);
/*     */             }
/*     */           }
/* 163 */           else if (type == ModifyStringType.SET || type == ModifyStringType.REMOVE || currentValue.equals(getPersistentProperties().getProperty("modifiedValue"))) {
/* 164 */             EnvVars.setWinNT(variableName, originalValue, userSpecific);
/*     */           } else {
/* 166 */             int index; String addedMainValue = getPersistentProperties().getProperty("variableValue");
/* 167 */             String addedValue = addedMainValue;
/*     */             
/* 169 */             if (type == ModifyStringType.APPEND) {
/* 170 */               if (originalValue != null && originalValue.length() > 0) {
/* 171 */                 addedValue = ";" + addedValue;
/*     */               }
/* 173 */               if (currentValue.endsWith(addedValue)) {
/* 174 */                 index = currentValue.length() - addedValue.length();
/*     */               } else {
/* 176 */                 index = currentValue.lastIndexOf(addedValue + ";");
/*     */               } 
/* 178 */               if (index == -1) {
/* 179 */                 addedValue = addedMainValue;
/* 180 */                 if (currentValue.endsWith(addedValue)) {
/* 181 */                   index = currentValue.length() - addedValue.length();
/*     */                 } else {
/* 183 */                   index = currentValue.lastIndexOf(addedValue + ";");
/*     */                 } 
/*     */               } 
/*     */             } else {
/* 187 */               if (originalValue != null && originalValue.length() > 0) {
/* 188 */                 addedValue = addedValue + ";";
/*     */               }
/* 190 */               if (currentValue.startsWith(addedValue)) {
/* 191 */                 index = 0;
/*     */               } else {
/* 193 */                 index = currentValue.indexOf(";" + addedValue) - 1;
/*     */               } 
/* 195 */               if (index < 0) {
/* 196 */                 addedValue = addedMainValue;
/* 197 */                 if (currentValue.startsWith(addedValue)) {
/* 198 */                   index = 0;
/*     */                 } else {
/* 200 */                   index = currentValue.indexOf(";" + addedValue) - 1;
/*     */                 } 
/*     */               } 
/*     */             } 
/* 204 */             if (index > -1) {
/* 205 */               String newValue = currentValue.substring(0, index) + currentValue.substring(index + addedValue.length());
/* 206 */               EnvVars.setWinNT(variableName, newValue, userSpecific);
/*     */             }
/*     */           
/*     */           } 
/* 210 */         } else if (type == ModifyStringType.REMOVE) {
/* 211 */           EnvVars.setWinNT(variableName, originalValue, userSpecific);
/*     */         } 
/*     */       } 
/* 214 */     } catch (Exception e) {
/* 215 */       e.printStackTrace();
/*     */     } 
/*     */ 
/*     */     
/* 219 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Properties getPersistentProperties() {
/* 226 */     return (Properties)replaceWithTextOverride("persistentProperties", this.persistentProperties, Properties.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPersistentProperties(Properties properties) {
/* 231 */     this.persistentProperties = properties;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\ModifyEnvironmentVariableAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */