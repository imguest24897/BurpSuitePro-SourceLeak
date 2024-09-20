/*     */ package com.install4j.runtime.beans.applications;
/*     */ 
/*     */ import com.install4j.api.beans.AbstractBean;
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ public abstract class Application
/*     */   extends AbstractBean
/*     */ {
/*     */   private boolean allowUnattended = true;
/*     */   private boolean allowConsole = true;
/*     */   private boolean unixFallbackToConsole = true;
/*     */   private boolean disableConsoleOnWindows = false;
/*  16 */   private ExecutionMode executionMode = ExecutionMode.GUI;
/*  17 */   private String splashMessage = "";
/*     */   
/*     */   private boolean unattendedAlerts = false;
/*     */   private ScriptProperty unattendedProgressInterfaceProvider;
/*     */   private boolean windowsConsoleExecutable = false;
/*     */   private ScriptProperty consoleScreenChangeHandler;
/*     */   private ScriptProperty helpCustomizer;
/*  24 */   private int frameWidth = 500;
/*  25 */   private int frameHeight = 390;
/*     */   
/*     */   private boolean frameSizeClientArea = true;
/*  28 */   private String vmParameters = "";
/*  29 */   private String arguments = "";
/*     */   
/*     */   private boolean resizable = true;
/*     */   
/*     */   private boolean rollback = true;
/*     */   private boolean useCustomIcon = false;
/*  35 */   private List<ExternalFile> customIconImageFiles = new ArrayList<>();
/*     */   
/*     */   private boolean customizeVersionInfo = false;
/*  38 */   private String versionInfoProductName = "";
/*  39 */   private String versionInfoFileVersion = "";
/*  40 */   private String versionInfoInternalName = "";
/*  41 */   private String versionInfoFileDescription = "";
/*  42 */   private String versionInfoCopyright = "";
/*     */   
/*     */   public boolean isAllowUnattended() {
/*  45 */     return replaceWithTextOverride("allowUnattended", this.allowUnattended);
/*     */   }
/*     */   
/*     */   public void setAllowUnattended(boolean allowUnattended) {
/*  49 */     this.allowUnattended = allowUnattended;
/*     */   }
/*     */   
/*     */   public boolean isAllowConsole() {
/*  53 */     return replaceWithTextOverride("allowConsole", this.allowConsole);
/*     */   }
/*     */   
/*     */   public void setAllowConsole(boolean allowConsole) {
/*  57 */     this.allowConsole = allowConsole;
/*     */   }
/*     */   
/*     */   public boolean isDisableConsoleOnWindows() {
/*  61 */     return replaceWithTextOverride("disableConsoleOnWindows", this.disableConsoleOnWindows);
/*     */   }
/*     */   
/*     */   public void setDisableConsoleOnWindows(boolean disableConsoleOnWindows) {
/*  65 */     this.disableConsoleOnWindows = disableConsoleOnWindows;
/*     */   }
/*     */   
/*     */   public boolean isUnixFallbackToConsole() {
/*  69 */     return replaceWithTextOverride("unixFallbackToConsole", this.unixFallbackToConsole);
/*     */   }
/*     */   
/*     */   public void setUnixFallbackToConsole(boolean unixFallbackToConsole) {
/*  73 */     this.unixFallbackToConsole = unixFallbackToConsole;
/*     */   }
/*     */   
/*     */   public ExecutionMode getExecutionMode() {
/*  77 */     return (ExecutionMode)replaceWithTextOverride("executionMode", this.executionMode, ExecutionMode.class);
/*     */   }
/*     */   
/*     */   public void setExecutionMode(ExecutionMode executionMode) {
/*  81 */     this.executionMode = executionMode;
/*     */   }
/*     */   
/*     */   public String getSplashMessage() {
/*  85 */     return replaceVariables(this.splashMessage);
/*     */   }
/*     */   
/*     */   public void setSplashMessage(String splashMessage) {
/*  89 */     this.splashMessage = splashMessage;
/*     */   }
/*     */   
/*     */   public boolean isUnattendedAlerts() {
/*  93 */     return replaceWithTextOverride("unattendedAlerts", this.unattendedAlerts);
/*     */   }
/*     */   
/*     */   public void setUnattendedAlerts(boolean unattendedAlerts) {
/*  97 */     this.unattendedAlerts = unattendedAlerts;
/*     */   }
/*     */   
/*     */   public ScriptProperty getUnattendedProgressInterfaceProvider() {
/* 101 */     return (ScriptProperty)replaceWithTextOverride("unattendedProgressInterfaceProvider", this.unattendedProgressInterfaceProvider, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setUnattendedProgressInterfaceProvider(ScriptProperty unattendedProgressInterfaceProvider) {
/* 105 */     this.unattendedProgressInterfaceProvider = unattendedProgressInterfaceProvider;
/*     */   }
/*     */   
/*     */   public int getFrameWidth() {
/* 109 */     return replaceWithTextOverride("frameWidth", this.frameWidth);
/*     */   }
/*     */   
/*     */   public void setFrameWidth(int frameWidth) {
/* 113 */     this.frameWidth = frameWidth;
/*     */   }
/*     */   
/*     */   public int getFrameHeight() {
/* 117 */     return replaceWithTextOverride("frameHeight", this.frameHeight);
/*     */   }
/*     */   
/*     */   public void setFrameHeight(int frameHeight) {
/* 121 */     this.frameHeight = frameHeight;
/*     */   }
/*     */   
/*     */   public boolean isFrameSizeClientArea() {
/* 125 */     return replaceWithTextOverride("frameSizeClientArea", this.frameSizeClientArea);
/*     */   }
/*     */   
/*     */   public void setFrameSizeClientArea(boolean frameSizeClientArea) {
/* 129 */     this.frameSizeClientArea = frameSizeClientArea;
/*     */   }
/*     */   
/*     */   public String getVmParameters() {
/* 133 */     return replaceVariables(this.vmParameters);
/*     */   }
/*     */   
/*     */   public void setVmParameters(String vmParameters) {
/* 137 */     this.vmParameters = vmParameters;
/*     */   }
/*     */   
/*     */   public String getArguments() {
/* 141 */     return replaceVariables(this.arguments);
/*     */   }
/*     */   
/*     */   public void setArguments(String arguments) {
/* 145 */     this.arguments = arguments;
/*     */   }
/*     */   
/*     */   public boolean isResizable() {
/* 149 */     return replaceWithTextOverride("resizable", this.resizable);
/*     */   }
/*     */   
/*     */   public void setResizable(boolean resizable) {
/* 153 */     this.resizable = resizable;
/*     */   }
/*     */   
/*     */   public boolean isRollback() {
/* 157 */     return replaceWithTextOverride("rollback", this.rollback);
/*     */   }
/*     */   
/*     */   public void setRollback(boolean rollback) {
/* 161 */     this.rollback = rollback;
/*     */   }
/*     */   
/*     */   public boolean isUseCustomIcon() {
/* 165 */     return replaceWithTextOverride("useCustomIcon", this.useCustomIcon);
/*     */   }
/*     */   
/*     */   public void setUseCustomIcon(boolean useCustomIcon) {
/* 169 */     this.useCustomIcon = useCustomIcon;
/*     */   }
/*     */   
/*     */   public List<ExternalFile> getCustomIconImageFiles() {
/* 173 */     return (List<ExternalFile>)replaceWithTextOverride("customIconImageFiles", this.customIconImageFiles, List.class);
/*     */   }
/*     */   
/*     */   public void setCustomIconImageFiles(List<ExternalFile> customIconImageFiles) {
/* 177 */     this.customIconImageFiles = customIconImageFiles;
/*     */   }
/*     */   
/*     */   public boolean isWindowsConsoleExecutable() {
/* 181 */     return replaceWithTextOverride("windowsConsoleExecutable", this.windowsConsoleExecutable);
/*     */   }
/*     */   
/*     */   public void setWindowsConsoleExecutable(boolean windowsConsoleExecutable) {
/* 185 */     this.windowsConsoleExecutable = windowsConsoleExecutable;
/*     */   }
/*     */   
/*     */   public ScriptProperty getConsoleScreenChangeHandler() {
/* 189 */     return (ScriptProperty)replaceWithTextOverride("consoleScreenChangeHandler", this.consoleScreenChangeHandler, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setConsoleScreenChangeHandler(ScriptProperty consoleScreenChangeHandler) {
/* 193 */     this.consoleScreenChangeHandler = consoleScreenChangeHandler;
/*     */   }
/*     */   
/*     */   public ScriptProperty getHelpCustomizer() {
/* 197 */     return (ScriptProperty)replaceWithTextOverride("helpCustomizer", this.helpCustomizer, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setHelpCustomizer(ScriptProperty helpCustomizer) {
/* 201 */     this.helpCustomizer = helpCustomizer;
/*     */   }
/*     */   
/*     */   public boolean isCustomizeVersionInfo() {
/* 205 */     return replaceWithTextOverride("customizeVersionInfo", this.customizeVersionInfo);
/*     */   }
/*     */   
/*     */   public void setCustomizeVersionInfo(boolean customizeVersionInfo) {
/* 209 */     this.customizeVersionInfo = customizeVersionInfo;
/*     */   }
/*     */   
/*     */   public String getVersionInfoProductName() {
/* 213 */     return replaceVariables(this.versionInfoProductName);
/*     */   }
/*     */   
/*     */   public void setVersionInfoProductName(String versionInfoProductName) {
/* 217 */     this.versionInfoProductName = versionInfoProductName;
/*     */   }
/*     */   
/*     */   public String getVersionInfoFileVersion() {
/* 221 */     return replaceVariables(this.versionInfoFileVersion);
/*     */   }
/*     */   
/*     */   public void setVersionInfoFileVersion(String versionInfoFileVersion) {
/* 225 */     this.versionInfoFileVersion = versionInfoFileVersion;
/*     */   }
/*     */   
/*     */   public String getVersionInfoInternalName() {
/* 229 */     return replaceVariables(this.versionInfoInternalName);
/*     */   }
/*     */   
/*     */   public void setVersionInfoInternalName(String versionInfoInternalName) {
/* 233 */     this.versionInfoInternalName = versionInfoInternalName;
/*     */   }
/*     */   
/*     */   public String getVersionInfoFileDescription() {
/* 237 */     return replaceVariables(this.versionInfoFileDescription);
/*     */   }
/*     */   
/*     */   public void setVersionInfoFileDescription(String versionInfoFileDescription) {
/* 241 */     this.versionInfoFileDescription = versionInfoFileDescription;
/*     */   }
/*     */   
/*     */   public String getVersionInfoCopyright() {
/* 245 */     return replaceVariables(this.versionInfoCopyright);
/*     */   }
/*     */   
/*     */   public void setVersionInfoCopyright(String versionInfoCopyright) {
/* 249 */     this.versionInfoCopyright = versionInfoCopyright;
/*     */   }
/*     */   
/*     */   public abstract String getApplicationMode();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\applications\Application.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */