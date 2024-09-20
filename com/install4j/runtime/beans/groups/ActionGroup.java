/*    */ package com.install4j.runtime.beans.groups;
/*    */ 
/*    */ import com.install4j.api.beans.ScriptProperty;
/*    */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*    */ import com.install4j.runtime.beans.actions.FailureStrategy;
/*    */ 
/*    */ public class ActionGroup extends ControlFlowGroup {
/*    */   private boolean onErrorBreakGroup = false;
/*  9 */   private String defaultErrorMessage = "";
/*    */   private ScriptProperty retryExpression;
/* 11 */   private FailureStrategy failureStrategy = FailureStrategy.CONTINUE;
/* 12 */   private String errorMessage = "";
/*    */   
/*    */   public String getDefaultErrorMessage() {
/* 15 */     return replaceVariables(replaceVariables(this.defaultErrorMessage, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*    */   }
/*    */   
/*    */   public void setDefaultErrorMessage(String defaultErrorMessage) {
/* 19 */     this.defaultErrorMessage = defaultErrorMessage;
/*    */   }
/*    */   
/*    */   public boolean isOnErrorBreakGroup() {
/* 23 */     return replaceWithTextOverride("onErrorBreakGroup", this.onErrorBreakGroup);
/*    */   }
/*    */   
/*    */   public void setOnErrorBreakGroup(boolean onErrorBreakGroup) {
/* 27 */     this.onErrorBreakGroup = onErrorBreakGroup;
/*    */   }
/*    */   
/*    */   public ScriptProperty getRetryExpression() {
/* 31 */     return (ScriptProperty)replaceWithTextOverride("retryExpression", this.retryExpression, ScriptProperty.class);
/*    */   }
/*    */   
/*    */   public void setRetryExpression(ScriptProperty retryExpression) {
/* 35 */     this.retryExpression = retryExpression;
/*    */   }
/*    */   
/*    */   public FailureStrategy getFailureStrategy() {
/* 39 */     return (FailureStrategy)replaceWithTextOverride("failureStrategy", this.failureStrategy, FailureStrategy.class);
/*    */   }
/*    */   
/*    */   public void setFailureStrategy(FailureStrategy failureStrategy) {
/* 43 */     this.failureStrategy = failureStrategy;
/*    */   }
/*    */   
/*    */   public String getErrorMessage() {
/* 47 */     return replaceVariables(this.errorMessage);
/*    */   }
/*    */   
/*    */   public void setErrorMessage(String errorMessage) {
/* 51 */     this.errorMessage = errorMessage;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\groups\ActionGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */