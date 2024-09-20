/*    */ package com.install4j.runtime.beans.actions.registry;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.util.List;
/*    */ import java.util.prefs.BackingStoreException;
/*    */ import java.util.prefs.Preferences;
/*    */ 
/*    */ public class DeletePreferenceItemAction
/*    */   extends PreferencesDeleteAction
/*    */ {
/* 13 */   private String key = "";
/*    */   private boolean onlyIfEmpty = true;
/*    */   
/*    */   public String getKey() {
/* 17 */     return replaceVariables(replaceVariables(this.key));
/*    */   }
/*    */   
/*    */   public void setKey(String key) {
/* 21 */     this.key = key;
/*    */   }
/*    */   
/*    */   public boolean isOnlyIfEmpty() {
/* 25 */     return replaceWithTextOverride("onlyIfEmpty", this.onlyIfEmpty);
/*    */   }
/*    */   
/*    */   public void setOnlyIfEmpty(boolean onlyIfEmpty) {
/* 29 */     this.onlyIfEmpty = onlyIfEmpty;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 34 */     if (getKey().trim().length() == 0 && getPackageName().trim().length() == 0) {
/* 35 */       return false;
/*    */     }
/*    */     
/* 38 */     return executePreferencesDeleter(new DeleteItemPreferencesDeleter(getKey(), isOnlyIfEmpty()), context);
/*    */   }
/*    */   
/*    */   private static class DeleteItemPreferencesDeleter
/*    */     implements PreferencesDeleteAction.PreferencesDeleter {
/*    */     private String key;
/*    */     private boolean onlyIfEmpty;
/*    */     
/*    */     public DeleteItemPreferencesDeleter(String key, boolean onlyIfEmpty) {
/* 47 */       this.key = key.trim();
/* 48 */       this.onlyIfEmpty = onlyIfEmpty;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean deleteFromPreferences(PreferencesAction.PackageNodeProvider packageNodeProvider, Context context, List<PreferencesAction.PreferencesRollbackAction> rollbackActions) throws BackingStoreException {
/* 53 */       Preferences packageNode = packageNodeProvider.getPackageNode();
/* 54 */       if (this.key.length() == 0) {
/* 55 */         if (this.onlyIfEmpty && ((packageNode.childrenNames()).length > 0 || (packageNode.keys()).length > 0)) {
/* 56 */           Logger.getInstance().log(this, "Node is not empty", false);
/* 57 */           return false;
/*    */         } 
/* 59 */         PreferencesDeleteAction.deleteNode(packageNodeProvider, rollbackActions);
/* 60 */         return true;
/*    */       } 
/* 62 */       return PreferencesDeleteAction.deleteKey(packageNodeProvider, this.key, rollbackActions);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\DeletePreferenceItemAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */