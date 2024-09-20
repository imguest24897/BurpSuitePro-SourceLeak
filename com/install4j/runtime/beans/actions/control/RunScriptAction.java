/*    */ package com.install4j.runtime.beans.actions.control;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.beans.Bean;
/*    */ import com.install4j.api.beans.ScriptProperty;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ 
/*    */ public class RunScriptAction
/*    */   extends SystemInstallOrUninstallAction {
/*    */   private ScriptProperty script;
/*    */   private ScriptProperty rollbackScript;
/*    */   
/*    */   public ScriptProperty getScript() {
/* 17 */     return (ScriptProperty)replaceWithTextOverride("script", this.script, ScriptProperty.class);
/*    */   }
/*    */   
/*    */   public void setScript(ScriptProperty script) {
/* 21 */     this.script = script;
/*    */   }
/*    */   
/*    */   public ScriptProperty getRollbackScript() {
/* 25 */     return (ScriptProperty)replaceWithTextOverride("rollbackScript", this.rollbackScript, ScriptProperty.class);
/*    */   }
/*    */   
/*    */   public void setRollbackScript(ScriptProperty rollbackScript) {
/* 29 */     this.rollbackScript = rollbackScript;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) {
/*    */     try {
/* 35 */       Boolean aBoolean = (Boolean)context.runScript(getScript(), (Bean)this, new Object[0]);
/* 36 */       if (aBoolean == null) {
/* 37 */         return true;
/*    */       }
/* 39 */       return aBoolean.booleanValue();
/*    */     }
/* 41 */     catch (Exception e) {
/* 42 */       Util.printAnnotatedStackTrace(e);
/* 43 */       Logger.getInstance().log(e);
/* 44 */       return false;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void rollback(InstallerContext context) {
/*    */     try {
/* 51 */       context.runScript(getRollbackScript(), (Bean)this, new Object[0]);
/* 52 */     } catch (Exception e) {
/* 53 */       Util.printAnnotatedStackTrace(e);
/* 54 */       Logger.getInstance().log(e);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 60 */     return (getRollbackScript() != null && getRollbackScript().getValue().trim().length() > 0);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\control\RunScriptAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */