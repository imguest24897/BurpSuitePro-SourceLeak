/*    */ package com.install4j.runtime.beans.actions.misc;
/*    */ 
/*    */ import com.install4j.runtime.beans.actions.files.AbstractModifySingleFileAction;
/*    */ 
/*    */ public abstract class AbstractWriteResponseFileAction
/*    */   extends AbstractModifySingleFileAction {
/*  7 */   private VariableSelectionMode variableSelectionMode = VariableSelectionMode.EXCLUDE;
/*    */   private String[] excludedVariables;
/*    */   private String[] includedVariables;
/*    */   
/*    */   public VariableSelectionMode getVariableSelectionMode() {
/* 12 */     return (VariableSelectionMode)replaceWithTextOverride("variableSelectionMode", this.variableSelectionMode, VariableSelectionMode.class);
/*    */   }
/*    */   
/*    */   public void setVariableSelectionMode(VariableSelectionMode variableSelectionMode) {
/* 16 */     this.variableSelectionMode = variableSelectionMode;
/*    */   }
/*    */   
/*    */   public String[] getExcludedVariables() {
/* 20 */     return (String[])replaceWithTextOverride("excludedVariables", replaceVariables(this.excludedVariables), String[].class);
/*    */   }
/*    */   
/*    */   public void setExcludedVariables(String[] excludedVariables) {
/* 24 */     this.excludedVariables = excludedVariables;
/*    */   }
/*    */   
/*    */   public String[] getIncludedVariables() {
/* 28 */     return (String[])replaceWithTextOverride("includedVariables", replaceVariables(this.includedVariables), String[].class);
/*    */   }
/*    */   
/*    */   public void setIncludedVariables(String[] includedVariables) {
/* 32 */     this.includedVariables = includedVariables;
/*    */   }
/*    */ 
/*    */   
/*    */   protected String[] getVariables() {
/* 37 */     VariableSelectionMode variableMode = getVariableSelectionMode();
/* 38 */     switch (variableMode) {
/*    */       case EXCLUDE:
/* 40 */         return getExcludedVariables();
/*    */       case INCLUDE:
/* 42 */         return getIncludedVariables();
/*    */     } 
/* 44 */     throw new RuntimeException(variableMode.name());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\AbstractWriteResponseFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */