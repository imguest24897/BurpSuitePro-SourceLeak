/*     */ package com.install4j.runtime.beans.actions.registry;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.PreferencesUtil;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.prefs.BackingStoreException;
/*     */ import java.util.prefs.Preferences;
/*     */ 
/*     */ 
/*     */ public abstract class PreferencesDeleteAction
/*     */   extends PreferencesAction
/*     */ {
/*  23 */   private PreferenceDeleteType preferenceDeleteType = PreferenceDeleteType.USER;
/*     */   
/*     */   public PreferenceDeleteType getPreferenceDeleteType() {
/*  26 */     return (PreferenceDeleteType)replaceWithTextOverride("preferenceDeleteType", this.preferenceDeleteType, PreferenceDeleteType.class);
/*     */   }
/*     */   
/*     */   public void setPreferenceDeleteType(PreferenceDeleteType preferenceDeleteType) {
/*  30 */     this.preferenceDeleteType = preferenceDeleteType;
/*     */   }
/*     */   
/*     */   protected boolean executePreferencesDeleter(PreferencesDeleter preferencesDeleter, Context context) {
/*  34 */     boolean success = false;
/*     */     
/*  36 */     if (getPreferenceDeleteType() == PreferenceDeleteType.SYSTEM || getPreferenceDeleteType() == PreferenceDeleteType.SYSTEM_AND_USER)
/*     */     {
/*  38 */       success |= handleRollbackActions(executePreferenceDeleter(preferencesDeleter, getPackageName(), false, context));
/*     */     }
/*  40 */     if (getPreferenceDeleteType() == PreferenceDeleteType.USER || getPreferenceDeleteType() == PreferenceDeleteType.SYSTEM_AND_USER) {
/*  41 */       success |= handleRollbackActions(executePreferenceDeleter(preferencesDeleter, getPackageName(), true, context));
/*     */     }
/*     */     
/*  44 */     return success;
/*     */   }
/*     */   
/*     */   private static List<PreferencesAction.PreferencesRollbackAction> executePreferenceDeleter(PreferencesDeleter preferencesDeleter, String packageName, boolean userSpecific, Context context) {
/*  48 */     if (HelperCommunication.getInstance().isElevatedHelper() && userSpecific) {
/*  49 */       return executePreferenceDeleterUnelevated(preferencesDeleter, packageName, true);
/*     */     }
/*     */     try {
/*  52 */       PreferencesAction.PackageNodeProvider packageNodeProvider = new PreferencesAction.PackageNodeProvider(packageName, userSpecific, false);
/*  53 */       Preferences packageNode = packageNodeProvider.getPackageNodeUnguarded();
/*  54 */       if (packageNode != null) {
/*  55 */         List<PreferencesAction.PreferencesRollbackAction> rollbackActions = new ArrayList<>();
/*  56 */         boolean success = preferencesDeleter.deleteFromPreferences(packageNodeProvider, context, rollbackActions);
/*  57 */         packageNode.flush();
/*  58 */         return success ? rollbackActions : null;
/*     */       } 
/*  60 */       Logger.getInstance().log(null, "Package " + packageName + " does not exist", false);
/*     */     }
/*  62 */     catch (Exception e) {
/*  63 */       Logger.getInstance().log(e);
/*     */     } 
/*  65 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private static List<PreferencesAction.PreferencesRollbackAction> executePreferenceDeleterUnelevated(final PreferencesDeleter preferencesDeleter, final String packageName, final boolean userSpecific) {
/*  70 */     return (List<PreferencesAction.PreferencesRollbackAction>)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<List<PreferencesAction.PreferencesRollbackAction>>()
/*     */         {
/*     */           protected List<PreferencesAction.PreferencesRollbackAction> fetchValue(Context context) throws Exception {
/*  73 */             return PreferencesDeleteAction.executePreferenceDeleter(preferencesDeleter, packageName, userSpecific, context);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   protected static void deleteNode(PreferencesAction.PackageNodeProvider packageNodeProvider, List<PreferencesAction.PreferencesRollbackAction> rollbackActions) throws BackingStoreException {
/*  79 */     PerformedAction performedAction = new PerformedAction(packageNodeProvider);
/*  80 */     packageNodeProvider.getPackageNode().removeNode();
/*  81 */     rollbackActions.add(performedAction);
/*     */   }
/*     */   
/*     */   protected static boolean deleteKey(PreferencesAction.PackageNodeProvider packageNodeProvider, String key, List<PreferencesAction.PreferencesRollbackAction> rollbackActions) throws BackingStoreException {
/*  85 */     Preferences packageNode = packageNodeProvider.getPackageNode();
/*  86 */     String[] keys = packageNode.keys();
/*  87 */     if (keys == null || !Arrays.<String>asList(keys).contains(key)) {
/*  88 */       Logger.getInstance().log(null, "Key " + key + " does not exist", false);
/*  89 */       return false;
/*     */     } 
/*  91 */     PerformedAction performedAction = new PerformedAction(packageNodeProvider, key);
/*  92 */     packageNode.remove(key);
/*  93 */     rollbackActions.add(performedAction);
/*  94 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private static class PerformedAction
/*     */     extends PreferencesAction.PreferencesRollbackAction
/*     */   {
/*     */     private PreferencesAction.PackageNodeProvider packageNodeProvider;
/*     */     private String key;
/*     */     private String oldValue;
/*     */     private byte[] exportedTree;
/*     */     
/*     */     public PerformedAction(PreferencesAction.PackageNodeProvider packageNodeProvider, String key) {
/* 107 */       this.packageNodeProvider = packageNodeProvider;
/* 108 */       this.key = key;
/* 109 */       this.oldValue = packageNodeProvider.getPackageNode().get(key, null);
/*     */     }
/*     */     
/*     */     public PerformedAction(PreferencesAction.PackageNodeProvider packageNodeProvider) throws BackingStoreException {
/* 113 */       ByteArrayOutputStream out = new ByteArrayOutputStream();
/*     */       try {
/* 115 */         packageNodeProvider.getPackageNode().exportSubtree(out);
/* 116 */         this.exportedTree = out.toByteArray();
/* 117 */       } catch (IOException e) {
/* 118 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     protected void rollbackDirectly(Context context) {
/* 125 */       Preferences packageNode = this.packageNodeProvider.getPackageNode();
/* 126 */       if (packageNode != null && this.oldValue != null) {
/* 127 */         Preferences newNode = PreferencesUtil.getPackageNode(packageNode.absolutePath(), packageNode.isUserNode());
/* 128 */         newNode.put(this.key, this.oldValue);
/*     */         try {
/* 130 */           newNode.flush();
/* 131 */         } catch (BackingStoreException e) {
/* 132 */           Logger.getInstance().log(e);
/*     */         } 
/*     */       } 
/* 135 */       if (this.exportedTree != null)
/*     */         try {
/* 137 */           Preferences.importPreferences(new ByteArrayInputStream(this.exportedTree));
/* 138 */         } catch (IOException|java.util.prefs.InvalidPreferencesFormatException e) {
/* 139 */           Logger.getInstance().log(e);
/*     */         }  
/*     */     }
/*     */   }
/*     */   
/*     */   protected static interface PreferencesDeleter extends Serializable {
/*     */     boolean deleteFromPreferences(PreferencesAction.PackageNodeProvider param1PackageNodeProvider, Context param1Context, List<PreferencesAction.PreferencesRollbackAction> param1List) throws BackingStoreException;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\registry\PreferencesDeleteAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */