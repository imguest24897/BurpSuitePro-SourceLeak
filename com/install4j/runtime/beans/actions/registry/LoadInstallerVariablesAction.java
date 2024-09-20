/*    */ package com.install4j.runtime.beans.actions.registry;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import com.install4j.runtime.installer.helper.VariableEncoding;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.prefs.BackingStoreException;
/*    */ import java.util.prefs.Preferences;
/*    */ 
/*    */ 
/*    */ public class LoadInstallerVariablesAction
/*    */   extends PreferencesReadAction
/*    */ {
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 17 */     return executePreferencesReader(new LoadInstallerVariablesPreferencesReader(), context);
/*    */   }
/*    */   
/*    */   private static class LoadInstallerVariablesPreferencesReader implements PreferencesReadAction.PreferencesReader {
/*    */     private LoadInstallerVariablesPreferencesReader() {}
/*    */     
/*    */     public boolean readFromPreferences(Preferences packageNode, Context context) throws BackingStoreException {
/* 24 */       String[] keys = packageNode.keys();
/* 25 */       if (keys == null || keys.length == 0) {
/* 26 */         Logger.getInstance().log(this, "No installer variables found", false);
/* 27 */         return false;
/*    */       } 
/*    */       
/* 30 */       Map<String, String> encodedVariables = new HashMap<>();
/* 31 */       for (String key : keys) {
/* 32 */         encodedVariables.put(key, packageNode.get(key, null));
/*    */       }
/*    */       
/* 35 */       Map<String, Object> decodedVariables = VariableEncoding.decodeVariables(encodedVariables, false);
/* 36 */       for (Map.Entry<String, Object> entry : decodedVariables.entrySet()) {
/* 37 */         context.setVariable(entry.getKey(), entry.getValue());
/*    */       }
/*    */       
/* 40 */       return true;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\LoadInstallerVariablesAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */