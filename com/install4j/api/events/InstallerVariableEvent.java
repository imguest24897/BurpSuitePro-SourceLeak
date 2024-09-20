/*    */ package com.install4j.api.events;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.runtime.installer.InstallerVariables;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InstallerVariableEvent
/*    */   extends InstallerEvent
/*    */ {
/*    */   private String variableName;
/*    */   
/*    */   public InstallerVariableEvent(Object source, Context context, String variableName) {
/* 29 */     super(source, context, EventType.VARIABLE_CHANGED);
/* 30 */     this.variableName = variableName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getVariableName() {
/* 38 */     return this.variableName;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 43 */     return super.toString() + " [variable " + this.variableName + "]";
/*    */   }
/*    */ 
/*    */   
/*    */   public String getVerbose() {
/* 48 */     if (InstallerVariables.getHiddenVariables().contains(this.variableName)) {
/* 49 */       return super.getVerbose() + ": " + this.variableName;
/*    */     }
/* 51 */     return super.getVerbose() + ": " + InstallerUtil.getVerboseVariableDefinition(this.variableName, getContext().getVariable(this.variableName));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\events\InstallerVariableEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */