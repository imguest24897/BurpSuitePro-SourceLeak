/*    */ package com.install4j.runtime.beans.applications;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ public abstract class ApplicationWithPath
/*    */   extends Application
/*    */ {
/* 10 */   private String executableName = "";
/*    */   
/*    */   private boolean useCustomMacosExecutableName = false;
/* 13 */   private String customMacosExecutableName = "";
/*    */   
/*    */   private File executableDirectory;
/*    */   private String unixMode;
/*    */   
/*    */   protected ApplicationWithPath() {
/* 19 */     setUnixMode(getDefaultUnixMode());
/*    */   }
/*    */ 
/*    */   
/*    */   protected abstract String getDefaultUnixMode();
/*    */   
/*    */   public String getExecutableName() {
/* 26 */     return replaceVariables(this.executableName);
/*    */   }
/*    */   
/*    */   public void setExecutableName(String executableName) {
/* 30 */     this.executableName = executableName;
/*    */   }
/*    */   
/*    */   public boolean isUseCustomMacosExecutableName() {
/* 34 */     return replaceWithTextOverride("useCustomMacosExecutableName", this.useCustomMacosExecutableName);
/*    */   }
/*    */   
/*    */   public void setUseCustomMacosExecutableName(boolean useCustomMacosExecutableName) {
/* 38 */     this.useCustomMacosExecutableName = useCustomMacosExecutableName;
/*    */   }
/*    */   
/*    */   public String getCustomMacosExecutableName() {
/* 42 */     return replaceVariables(replaceVariables(this.customMacosExecutableName));
/*    */   }
/*    */   
/*    */   public void setCustomMacosExecutableName(String customMacosExecutableName) {
/* 46 */     this.customMacosExecutableName = customMacosExecutableName;
/*    */   }
/*    */   
/*    */   public File getExecutableDirectory() {
/* 50 */     return (File)replaceWithTextOverride("executableDirectory", this.executableDirectory, File.class);
/*    */   }
/*    */   
/*    */   public void setExecutableDirectory(File executableDirectory) {
/* 54 */     this.executableDirectory = executableDirectory;
/*    */   }
/*    */   
/*    */   public String getUnixMode() {
/* 58 */     return replaceVariables(this.unixMode);
/*    */   }
/*    */   
/*    */   public void setUnixMode(String unixMode) {
/* 62 */     this.unixMode = unixMode;
/*    */   }
/*    */   
/*    */   public String getUsedExecutableDirectory() {
/* 66 */     if (getExecutableDirectory() != null && getExecutableDirectory().getPath().trim().length() > 0) {
/* 67 */       return getExecutableDirectory().getPath();
/*    */     }
/* 69 */     return ".install4j";
/*    */   }
/*    */ 
/*    */   
/*    */   public String getUsedExecutablePath(boolean macos) {
/* 74 */     StringBuilder buffer = new StringBuilder();
/* 75 */     String usedExecutableDirectory = getUsedExecutableDirectory();
/* 76 */     if (!Objects.equals(usedExecutableDirectory, ".")) {
/* 77 */       buffer.append(usedExecutableDirectory);
/* 78 */       buffer.append(File.separatorChar);
/*    */     } 
/* 80 */     if (macos && isUseCustomMacosExecutableName()) {
/* 81 */       buffer.append(getCustomMacosExecutableName());
/*    */     } else {
/* 83 */       buffer.append(getExecutableName().replace('\\', '/'));
/*    */     } 
/*    */     
/* 86 */     return buffer.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\applications\ApplicationWithPath.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */