/*    */ package com.install4j.runtime.beans.applications;
/*    */ 
/*    */ import com.install4j.api.beans.ScriptProperty;
/*    */ 
/*    */ public class InstallerApplication
/*    */   extends Application implements SystemApplication {
/*    */   private boolean suppressProgressDialog = false;
/*    */   private boolean createStderrLog = true;
/*  9 */   private String stderrLog = "${compiler:sys.mediaFileName}_error.log";
/*    */   private ScriptProperty languageSelectionScript;
/*    */   
/*    */   public boolean isSuppressProgressDialog() {
/* 13 */     return replaceWithTextOverride("suppressProgressDialog", this.suppressProgressDialog);
/*    */   }
/*    */   
/*    */   public void setSuppressProgressDialog(boolean suppressProgressDialog) {
/* 17 */     this.suppressProgressDialog = suppressProgressDialog;
/*    */   }
/*    */   
/*    */   public boolean isCreateStderrLog() {
/* 21 */     return replaceWithTextOverride("createStderrLog", this.createStderrLog);
/*    */   }
/*    */   
/*    */   public void setCreateStderrLog(boolean createStderrLog) {
/* 25 */     this.createStderrLog = createStderrLog;
/*    */   }
/*    */   
/*    */   public String getStderrLog() {
/* 29 */     return replaceVariables(replaceVariables(this.stderrLog));
/*    */   }
/*    */   
/*    */   public void setStderrLog(String stderrLog) {
/* 33 */     this.stderrLog = stderrLog;
/*    */   }
/*    */   
/*    */   public ScriptProperty getLanguageSelectionScript() {
/* 37 */     return (ScriptProperty)replaceWithTextOverride("languageSelectionScript", this.languageSelectionScript, ScriptProperty.class);
/*    */   }
/*    */   
/*    */   public void setLanguageSelectionScript(ScriptProperty languageSelectionScript) {
/* 41 */     this.languageSelectionScript = languageSelectionScript;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getApplicationMode() {
/* 46 */     return "installer";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\applications\InstallerApplication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */