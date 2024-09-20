/*    */ package com.install4j.runtime.beans.applications;
/*    */ 
/*    */ import com.install4j.runtime.beans.AllowDirectFieldAccess;
/*    */ import java.io.File;
/*    */ 
/*    */ public class CustomApplication
/*    */   extends ApplicationWithPath
/*    */ {
/*    */   private boolean createExecutable = true;
/* 10 */   private String windowTitle = "";
/*    */   
/*    */   private boolean changeWorkingDir = false;
/* 13 */   private File workingDir = new File(".");
/*    */   
/*    */   private boolean singleInstance = true;
/* 16 */   private VistaExecutionLevel vistaExecutionLevel = VistaExecutionLevel.AS_INVOKER;
/*    */   private boolean showCancelMessage = true;
/* 18 */   private String cancelMessage = "${i18n:ExitApplication}";
/*    */   
/*    */   public boolean isCreateExecutable() {
/* 21 */     return replaceWithTextOverride("createExecutable", this.createExecutable);
/*    */   }
/*    */   
/*    */   public void setCreateExecutable(boolean createExecutable) {
/* 25 */     this.createExecutable = createExecutable;
/*    */   }
/*    */   
/*    */   public boolean isChangeWorkingDir() {
/* 29 */     return replaceWithTextOverride("changeWorkingDir", this.changeWorkingDir);
/*    */   }
/*    */   
/*    */   public void setChangeWorkingDir(boolean changeWorkingDir) {
/* 33 */     this.changeWorkingDir = changeWorkingDir;
/*    */   }
/*    */   
/*    */   public File getWorkingDir() {
/* 37 */     return (File)replaceWithTextOverride("workingDir", this.workingDir, File.class);
/*    */   }
/*    */   
/*    */   public void setWorkingDir(File workingDir) {
/* 41 */     this.workingDir = workingDir;
/*    */   }
/*    */   
/*    */   public String getWindowTitle() {
/* 45 */     return replaceVariables(replaceVariables(this.windowTitle));
/*    */   }
/*    */   
/*    */   @AllowDirectFieldAccess
/*    */   public String getWindowTitleRaw() {
/* 50 */     return this.windowTitle;
/*    */   }
/*    */   
/*    */   public void setWindowTitle(String windowTitle) {
/* 54 */     this.windowTitle = windowTitle;
/*    */   }
/*    */   
/*    */   public VistaExecutionLevel getVistaExecutionLevel() {
/* 58 */     return (VistaExecutionLevel)replaceWithTextOverride("vistaExecutionLevel", this.vistaExecutionLevel, VistaExecutionLevel.class);
/*    */   }
/*    */   
/*    */   public void setVistaExecutionLevel(VistaExecutionLevel vistaExecutionLevel) {
/* 62 */     this.vistaExecutionLevel = vistaExecutionLevel;
/*    */   }
/*    */ 
/*    */   
/*    */   protected String getDefaultUnixMode() {
/* 67 */     return "755";
/*    */   }
/*    */   
/*    */   public boolean isShowCancelMessage() {
/* 71 */     return replaceWithTextOverride("showCancelMessage", this.showCancelMessage);
/*    */   }
/*    */   
/*    */   public void setShowCancelMessage(boolean showCancelMessage) {
/* 75 */     this.showCancelMessage = showCancelMessage;
/*    */   }
/*    */   
/*    */   public String getCancelMessage() {
/* 79 */     return replaceVariables(replaceVariables(this.cancelMessage));
/*    */   }
/*    */   
/*    */   public void setCancelMessage(String cancelMessage) {
/* 83 */     this.cancelMessage = cancelMessage;
/*    */   }
/*    */   
/*    */   public boolean isSingleInstance() {
/* 87 */     return replaceWithTextOverride("singleInstance", this.singleInstance);
/*    */   }
/*    */   
/*    */   public void setSingleInstance(boolean singleInstance) {
/* 91 */     this.singleInstance = singleInstance;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getApplicationMode() {
/* 96 */     return "custom";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\applications\CustomApplication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */