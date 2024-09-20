/*    */ package com.install4j.runtime.beans.actions.control;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.beans.Bean;
/*    */ import com.install4j.api.beans.ScriptProperty;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ 
/*    */ public class SetVariableAction
/*    */   extends SystemInstallOrUninstallAction {
/*    */   private ScriptProperty script;
/*    */   private String variableName;
/*    */   private boolean onlyIfUndefined = false;
/*    */   private boolean failIfNull = false;
/*    */   private boolean responseFileVariable = false;
/*    */   
/*    */   public ScriptProperty getScript() {
/* 20 */     return (ScriptProperty)replaceWithTextOverride("script", this.script, ScriptProperty.class);
/*    */   }
/*    */   
/*    */   public void setScript(ScriptProperty script) {
/* 24 */     this.script = script;
/*    */   }
/*    */   
/*    */   public String getVariableName() {
/* 28 */     return replaceVariables(this.variableName);
/*    */   }
/*    */   
/*    */   public void setVariableName(String variableName) {
/* 32 */     this.variableName = variableName;
/*    */   }
/*    */   
/*    */   public boolean isOnlyIfUndefined() {
/* 36 */     return replaceWithTextOverride("onlyIfUndefined", this.onlyIfUndefined);
/*    */   }
/*    */   
/*    */   public void setOnlyIfUndefined(boolean onlyIfUndefined) {
/* 40 */     this.onlyIfUndefined = onlyIfUndefined;
/*    */   }
/*    */   
/*    */   public boolean isFailIfNull() {
/* 44 */     return replaceWithTextOverride("failIfNull", this.failIfNull);
/*    */   }
/*    */   
/*    */   public void setFailIfNull(boolean failIfNull) {
/* 48 */     this.failIfNull = failIfNull;
/*    */   }
/*    */   
/*    */   public boolean isResponseFileVariable() {
/* 52 */     return replaceWithTextOverride("responseFileVariable", this.responseFileVariable);
/*    */   }
/*    */   
/*    */   public void setResponseFileVariable(boolean responseFileVariable) {
/* 56 */     this.responseFileVariable = responseFileVariable;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/*    */     try {
/* 62 */       String name = getVariableName();
/* 63 */       if (!isOnlyIfUndefined() || context.getVariable(name) == null) {
/* 64 */         Object value = context.runScript(getScript(), (Bean)this, new Object[0]);
/* 65 */         if (value == null && isFailIfNull()) {
/* 66 */           return false;
/*    */         }
/* 68 */         context.setVariable(name, value);
/* 69 */         if (isResponseFileVariable()) {
/* 70 */           context.registerResponseFileVariable(name);
/*    */         }
/*    */       } 
/* 73 */       return true;
/* 74 */     } catch (Exception e) {
/* 75 */       Util.printAnnotatedStackTrace(e);
/* 76 */       Logger.getInstance().log(e);
/* 77 */       return false;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 83 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\control\SetVariableAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */