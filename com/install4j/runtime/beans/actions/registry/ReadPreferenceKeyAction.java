/*    */ package com.install4j.runtime.beans.actions.registry;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import java.util.prefs.BackingStoreException;
/*    */ import java.util.prefs.Preferences;
/*    */ 
/*    */ public class ReadPreferenceKeyAction
/*    */   extends PreferencesReadAction
/*    */ {
/* 11 */   private String key = "";
/* 12 */   private String variableName = "";
/*    */   private boolean useDefault = false;
/* 14 */   private String defaultValue = "";
/*    */   
/*    */   public String getKey() {
/* 17 */     return replaceVariables(replaceVariables(this.key));
/*    */   }
/*    */   
/*    */   public void setKey(String key) {
/* 21 */     this.key = key;
/*    */   }
/*    */   
/*    */   public String getVariableName() {
/* 25 */     return replaceVariables(this.variableName);
/*    */   }
/*    */   
/*    */   public void setVariableName(String variableName) {
/* 29 */     this.variableName = variableName;
/*    */   }
/*    */   
/*    */   public boolean isUseDefault() {
/* 33 */     return replaceWithTextOverride("useDefault", this.useDefault);
/*    */   }
/*    */   
/*    */   public void setUseDefault(boolean useDefault) {
/* 37 */     this.useDefault = useDefault;
/*    */   }
/*    */   
/*    */   public String getDefaultValue() {
/* 41 */     return replaceVariables(replaceVariables(this.defaultValue));
/*    */   }
/*    */   
/*    */   public void setDefaultValue(String defaultValue) {
/* 45 */     this.defaultValue = defaultValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 50 */     return executePreferencesReader(new ReadKeyPreferencesReader(getKey(), isUseDefault() ? getDefaultValue() : null, getVariableName()), context);
/*    */   }
/*    */   
/*    */   private static class ReadKeyPreferencesReader
/*    */     implements PreferencesReadAction.PreferencesReader {
/*    */     private String key;
/*    */     private String defaultValue;
/*    */     private String variableName;
/*    */     
/*    */     public ReadKeyPreferencesReader(String key, String defaultValue, String variableName) {
/* 60 */       this.key = key;
/* 61 */       this.defaultValue = defaultValue;
/* 62 */       this.variableName = variableName;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean readFromPreferences(Preferences packageNode, Context context) throws BackingStoreException {
/* 67 */       String value = packageNode.get(this.key, this.defaultValue);
/* 68 */       if (value != null) {
/* 69 */         context.setVariable(this.variableName, value);
/* 70 */         return true;
/*    */       } 
/* 72 */       return false;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\ReadPreferenceKeyAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */