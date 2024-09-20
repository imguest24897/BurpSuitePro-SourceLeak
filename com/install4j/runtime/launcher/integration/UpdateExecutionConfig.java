/*    */ package com.install4j.runtime.launcher.integration;
/*    */ 
/*    */ import com.install4j.runtime.beans.applications.ExecutionMode;
/*    */ import java.io.File;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class UpdateExecutionConfig
/*    */ {
/*    */   private ExecutionMode executionMode;
/*    */   private String unattendedUpdateTitle;
/*    */   private String installationDirectory;
/* 13 */   private final List<String> arguments = new ArrayList<>();
/*    */   private String languageId;
/*    */   private File installerFile;
/*    */   
/*    */   public UpdateExecutionConfig(ExecutionMode executionMode, String unattendedUpdateTitle) {
/* 18 */     this.executionMode = executionMode;
/* 19 */     this.unattendedUpdateTitle = unattendedUpdateTitle;
/*    */   }
/*    */   
/*    */   public UpdateExecutionConfig(List<String> arguments) {
/* 23 */     if (arguments != null) {
/* 24 */       this.arguments.addAll(arguments);
/*    */     }
/*    */   }
/*    */   
/*    */   void setUnattendedUpdateTitle(String unattendedUpdateTitle) {
/* 29 */     this.unattendedUpdateTitle = unattendedUpdateTitle;
/*    */   }
/*    */   
/*    */   public ExecutionMode getExecutionMode() {
/* 33 */     return this.executionMode;
/*    */   }
/*    */   
/*    */   public String getUnattendedUpdateTitle() {
/* 37 */     return this.unattendedUpdateTitle;
/*    */   }
/*    */   
/*    */   String getInstallationDirectory() {
/* 41 */     return this.installationDirectory;
/*    */   }
/*    */   
/*    */   void setInstallationDirectory(String installationDirectory) {
/* 45 */     this.installationDirectory = installationDirectory;
/*    */   }
/*    */   
/*    */   public List<String> getArguments() {
/* 49 */     return this.arguments;
/*    */   }
/*    */   
/*    */   void setLanguageId(String languageId) {
/* 53 */     this.languageId = languageId;
/*    */   }
/*    */   
/*    */   public String getLanguageId() {
/* 57 */     return this.languageId;
/*    */   }
/*    */   
/*    */   void setInstallerFile(File installerFile) {
/* 61 */     this.installerFile = installerFile;
/*    */   }
/*    */   
/*    */   File getInstallerFile() {
/* 65 */     return this.installerFile;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\integration\UpdateExecutionConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */