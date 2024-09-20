/*    */ package com.install4j.runtime.beans.actions.registry;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import com.install4j.runtime.installer.helper.PreferencesUtil;
/*    */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*    */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import java.util.prefs.BackingStoreException;
/*    */ import java.util.prefs.Preferences;
/*    */ 
/*    */ public abstract class PreferencesWriteAction
/*    */   extends PreferencesAction
/*    */ {
/* 18 */   private PreferenceWriteType preferenceWriteType = PreferenceWriteType.USER;
/*    */   
/*    */   public PreferenceWriteType getPreferenceWriteType() {
/* 21 */     return (PreferenceWriteType)replaceWithTextOverride("preferenceWriteType", this.preferenceWriteType, PreferenceWriteType.class);
/*    */   }
/*    */   
/*    */   public void setPreferenceWriteType(PreferenceWriteType preferenceWriteType) {
/* 25 */     this.preferenceWriteType = preferenceWriteType;
/*    */   }
/*    */   
/*    */   protected static void writeValue(PreferencesAction.PackageNodeProvider packageNodeProvider, String key, String value, List<PreferencesAction.PreferencesRollbackAction> rollbackActions) {
/* 29 */     Preferences packageNode = packageNodeProvider.getPackageNode();
/* 30 */     String oldValue = packageNode.get(key, null);
/* 31 */     packageNode.put(key, value);
/* 32 */     rollbackActions.add(new PerformedAction(packageNodeProvider, key, oldValue));
/*    */   }
/*    */   
/*    */   protected boolean executePreferencesWriter(PreferencesWriter preferencesWriter, Context context) {
/* 36 */     List<PreferencesAction.PreferencesRollbackAction> rollbackActions = new ArrayList<>();
/*    */     try {
/* 38 */       boolean userSpecific = (getPreferenceWriteType() == PreferenceWriteType.USER);
/* 39 */       return handleRollbackActions(executePreferencesWriter(preferencesWriter, getPackageName(), userSpecific, context, rollbackActions));
/* 40 */     } catch (BackingStoreException e1) {
/* 41 */       Logger.getInstance().log(e1);
/* 42 */       if (getPreferenceWriteType() == PreferenceWriteType.SYSTEM_FALLBACK) {
/*    */         try {
/* 44 */           return handleRollbackActions(executePreferencesWriter(preferencesWriter, getPackageName(), true, context, rollbackActions));
/* 45 */         } catch (BackingStoreException e2) {
/* 46 */           Logger.getInstance().log(e2);
/* 47 */           return false;
/*    */         } 
/*    */       }
/*    */       
/* 51 */       return false;
/*    */     } 
/*    */   }
/*    */   private static List<PreferencesAction.PreferencesRollbackAction> executePreferencesWriter(final PreferencesWriter preferencesWriter, final String packageName, boolean userSpecific, Context context, final List<PreferencesAction.PreferencesRollbackAction> rollbackActions) throws BackingStoreException {
/* 55 */     if (HelperCommunication.getInstance().isElevatedHelper() && userSpecific) {
/* 56 */       return (List<PreferencesAction.PreferencesRollbackAction>)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<List<PreferencesAction.PreferencesRollbackAction>>()
/*    */           {
/*    */             protected List<PreferencesAction.PreferencesRollbackAction> fetchValue(Context context) throws Exception {
/* 59 */               return PreferencesWriteAction.executePreferencesWriter(preferencesWriter, packageName, true, context, rollbackActions);
/*    */             }
/*    */           });
/*    */     }
/* 63 */     PreferencesAction.PackageNodeProvider packageNodeProvider = new PreferencesAction.PackageNodeProvider(packageName, userSpecific, true);
/* 64 */     Preferences packageNode = packageNodeProvider.getPackageNode();
/* 65 */     boolean success = preferencesWriter.writeToPreferences(packageNodeProvider, context, rollbackActions);
/* 66 */     packageNode.flush();
/* 67 */     return success ? rollbackActions : null;
/*    */   }
/*    */   
/*    */   private static class PerformedAction
/*    */     extends PreferencesAction.PreferencesRollbackAction
/*    */   {
/*    */     private PreferencesAction.PackageNodeProvider packageNodeProvider;
/*    */     private String key;
/*    */     private String oldValue;
/*    */     
/*    */     public PerformedAction(PreferencesAction.PackageNodeProvider packageNodeProvider, String key, String oldValue) {
/* 78 */       this.packageNodeProvider = packageNodeProvider;
/* 79 */       this.key = key;
/* 80 */       this.oldValue = oldValue;
/*    */     }
/*    */ 
/*    */     
/*    */     protected void rollbackDirectly(Context context) {
/* 85 */       Preferences packageNode = this.packageNodeProvider.getPackageNode();
/* 86 */       Preferences newNode = PreferencesUtil.getPackageNode(packageNode.absolutePath(), packageNode.isUserNode());
/* 87 */       if (this.oldValue == null) {
/* 88 */         newNode.remove(this.key);
/*    */       } else {
/* 90 */         newNode.put(this.key, this.oldValue);
/* 91 */         Logger.getInstance().info(this, "put '" + this.oldValue + "' in '" + this.key + "'.");
/*    */       } 
/*    */       try {
/* 94 */         newNode.flush();
/* 95 */         Logger.getInstance().info(this, "flushed " + newNode.absolutePath());
/* 96 */       } catch (BackingStoreException e) {
/* 97 */         Logger.getInstance().log(e);
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   protected static interface PreferencesWriter extends Serializable {
/*    */     boolean writeToPreferences(PreferencesAction.PackageNodeProvider param1PackageNodeProvider, Context param1Context, List<PreferencesAction.PreferencesRollbackAction> param1List) throws BackingStoreException;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\PreferencesWriteAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */