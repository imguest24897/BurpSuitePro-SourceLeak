/*    */ package com.install4j.runtime.beans.actions.registry;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import com.install4j.runtime.installer.helper.VariableEncoding;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class SaveInstallerVariablesAction
/*    */   extends PreferencesWriteAction
/*    */ {
/*    */   private String[] installerVariables;
/*    */   
/*    */   public String[] getInstallerVariables() {
/* 17 */     return (String[])replaceWithTextOverride("installerVariables", replaceVariables(this.installerVariables), String[].class);
/*    */   }
/*    */   
/*    */   public void setInstallerVariables(String[] installerVariables) {
/* 21 */     this.installerVariables = installerVariables;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 26 */     String[] installerVariables = getInstallerVariables();
/*    */     
/* 28 */     if (installerVariables == null || installerVariables.length == 0) {
/* 29 */       return false;
/*    */     }
/*    */     
/* 32 */     Map<String, String> encodedVariables = new HashMap<>();
/* 33 */     for (String variableName : installerVariables) {
/* 34 */       Object variableValue = context.getVariable(variableName);
/* 35 */       if (!VariableEncoding.encodeVariable(encodedVariables, variableName, variableValue) && variableValue != null) {
/* 36 */         Logger.getInstance().log(this, "The variable " + variableName + " of type " + variableValue.getClass().getName() + " cannot be encoded to a string", false);
/* 37 */         return false;
/*    */       } 
/*    */     } 
/*    */     
/* 41 */     return executePreferencesWriter(new SaveInstallerVariablesPreferencesWriter(encodedVariables), context);
/*    */   }
/*    */   
/*    */   private static class SaveInstallerVariablesPreferencesWriter implements PreferencesWriteAction.PreferencesWriter {
/*    */     private final Map<String, String> encodedVariables;
/*    */     
/*    */     public SaveInstallerVariablesPreferencesWriter(Map<String, String> encodedVariables) {
/* 48 */       this.encodedVariables = encodedVariables;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean writeToPreferences(PreferencesAction.PackageNodeProvider packageNodeProvider, Context context, List<PreferencesAction.PreferencesRollbackAction> rollbackActions) {
/* 53 */       for (Map.Entry<String, String> entry : this.encodedVariables.entrySet()) {
/* 54 */         PreferencesWriteAction.writeValue(packageNodeProvider, entry.getKey(), entry.getValue(), rollbackActions);
/*    */       }
/* 56 */       return true;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\SaveInstallerVariablesAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */