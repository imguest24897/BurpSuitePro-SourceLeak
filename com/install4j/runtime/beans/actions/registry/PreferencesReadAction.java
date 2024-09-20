/*    */ package com.install4j.runtime.beans.actions.registry;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import com.install4j.runtime.installer.helper.PreferencesUtil;
/*    */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*    */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*    */ import java.io.Serializable;
/*    */ import java.util.prefs.BackingStoreException;
/*    */ import java.util.prefs.Preferences;
/*    */ 
/*    */ public abstract class PreferencesReadAction
/*    */   extends PreferencesAction
/*    */ {
/* 16 */   private PreferenceReadType preferenceReadType = PreferenceReadType.USER;
/*    */   
/*    */   public PreferenceReadType getPreferenceReadType() {
/* 19 */     return (PreferenceReadType)replaceWithTextOverride("preferenceReadType", this.preferenceReadType, PreferenceReadType.class);
/*    */   }
/*    */   
/*    */   public void setPreferenceReadType(PreferenceReadType preferenceReadType) {
/* 23 */     this.preferenceReadType = preferenceReadType;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 28 */     return false;
/*    */   }
/*    */   
/*    */   protected boolean executePreferencesReader(PreferencesReader preferencesReader, Context context) {
/* 32 */     boolean success = false;
/*    */     
/* 34 */     if (getPreferenceReadType() == PreferenceReadType.SYSTEM || getPreferenceReadType() == PreferenceReadType.SYSTEM_THEN_USER)
/*    */     {
/* 36 */       success |= executePreferencesReader(preferencesReader, getPackageName(), false, context);
/*    */     }
/* 38 */     if (getPreferenceReadType() == PreferenceReadType.USER || getPreferenceReadType() == PreferenceReadType.SYSTEM_THEN_USER) {
/* 39 */       success |= executePreferencesReader(preferencesReader, getPackageName(), true, context);
/*    */     }
/*    */     
/* 42 */     return success;
/*    */   }
/*    */   
/*    */   private static boolean executePreferencesReader(PreferencesReader preferencesReader, String packageName, boolean userSpecific, Context context) {
/* 46 */     if (HelperCommunication.getInstance().isElevatedHelper() && userSpecific) {
/* 47 */       return executePreferencesReaderUnelevated(preferencesReader, packageName);
/*    */     }
/*    */     try {
/* 50 */       PreferencesUtil.getRootNode(userSpecific).sync();
/* 51 */       Preferences packageNode = PreferencesUtil.getPackageNodeNoCreation(packageName, userSpecific);
/* 52 */       if (packageNode != null) {
/*    */         
/* 54 */         packageNode.sync();
/* 55 */         return preferencesReader.readFromPreferences(packageNode, context);
/*    */       } 
/* 57 */       Logger.getInstance().log(null, "Package " + packageName + " does not exist", false);
/*    */     }
/* 59 */     catch (Exception e) {
/* 60 */       Logger.getInstance().log(e);
/*    */     } 
/* 62 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   private static boolean executePreferencesReaderUnelevated(final PreferencesReader preferencesReader, final String packageName) {
/* 67 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*    */         {
/*    */           protected boolean fetchValue(Context context) throws Exception {
/* 70 */             return PreferencesReadAction.executePreferencesReader(preferencesReader, packageName, true, context);
/*    */           }
/*    */         });
/*    */   }
/*    */   
/*    */   public static interface PreferencesReader extends Serializable {
/*    */     boolean readFromPreferences(Preferences param1Preferences, Context param1Context) throws BackingStoreException;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\PreferencesReadAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */