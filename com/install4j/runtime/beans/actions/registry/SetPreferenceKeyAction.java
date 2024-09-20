/*    */ package com.install4j.runtime.beans.actions.registry;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import java.util.List;
/*    */ 
/*    */ public class SetPreferenceKeyAction
/*    */   extends PreferencesWriteAction
/*    */ {
/* 10 */   private String key = "";
/* 11 */   private String value = "";
/*    */   
/*    */   public String getKey() {
/* 14 */     return replaceVariables(replaceVariables(this.key));
/*    */   }
/*    */   
/*    */   public void setKey(String key) {
/* 18 */     this.key = key;
/*    */   }
/*    */   
/*    */   public String getValue() {
/* 22 */     return replaceVariables(replaceVariables(this.value));
/*    */   }
/*    */   
/*    */   public void setValue(String value) {
/* 26 */     this.value = value;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 32 */     if (getKey().trim().length() == 0) {
/* 33 */       return false;
/*    */     }
/*    */     
/* 36 */     return executePreferencesWriter(new SetKeyPreferencesWriter(getKey(), getValue()), context);
/*    */   }
/*    */   
/*    */   private static class SetKeyPreferencesWriter
/*    */     implements PreferencesWriteAction.PreferencesWriter
/*    */   {
/*    */     private String key;
/*    */     private String value;
/*    */     
/*    */     public SetKeyPreferencesWriter(String key, String value) {
/* 46 */       this.key = key;
/*    */       
/* 48 */       this.value = value;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean writeToPreferences(PreferencesAction.PackageNodeProvider packageNodeProvider, Context context, List<PreferencesAction.PreferencesRollbackAction> rollbackActions) {
/* 53 */       PreferencesWriteAction.writeValue(packageNodeProvider, this.key, this.value, rollbackActions);
/* 54 */       return true;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\SetPreferenceKeyAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */