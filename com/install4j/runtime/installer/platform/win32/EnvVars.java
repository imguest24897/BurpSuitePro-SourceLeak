/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ 
/*     */ import com.install4j.api.actions.InstallAction;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.windows.RegistryRoot;
/*     */ import com.install4j.api.windows.WinRegistry;
/*     */ import com.install4j.runtime.beans.actions.registry.SetRegistryValueAction;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchStringAction;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Objects;
/*     */ 
/*     */ public class EnvVars {
/*     */   public static final String KEYNAME_GLOBAL = "SYSTEM\\CurrentControlSet\\Control\\Session Manager\\Environment";
/*     */   public static final String KEYNAME_USER = "Environment";
/*     */   public static final String AUTOEXEC_BAT = "c:\\autoexec.bat";
/*     */   
/*     */   public static void setWinNT(String key, String value, boolean userSpecific) throws IOException {
/*  26 */     setWinNT(key, value, userSpecific, false, false);
/*     */   }
/*     */   public static String getWinNT(String key, boolean userSpecific) throws IOException {
/*     */     String keyName;
/*     */     RegistryRoot registryRoot;
/*  31 */     if (HelperCommunication.getInstance().isElevatedHelper() && userSpecific) {
/*  32 */       return getWinNTUnelevated(key);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  37 */     if (userSpecific) {
/*  38 */       keyName = "Environment";
/*  39 */       registryRoot = RegistryRoot.HKEY_CURRENT_USER;
/*     */     } else {
/*  41 */       keyName = "SYSTEM\\CurrentControlSet\\Control\\Session Manager\\Environment";
/*  42 */       registryRoot = RegistryRoot.HKEY_LOCAL_MACHINE;
/*     */     } 
/*     */     
/*  45 */     Object previousValue = WinRegistry.getValue(registryRoot, keyName, key);
/*  46 */     if (previousValue != null) {
/*  47 */       return previousValue.toString();
/*     */     }
/*  49 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private static String getWinNTUnelevated(final String key) {
/*  54 */     return HelperCommunication.getInstance().fetchString(ExecutionContext.UNELEVATED, new FetchStringAction()
/*     */         {
/*     */           protected String fetchValue(Context context) throws Exception {
/*  57 */             return EnvVars.getWinNT(key, true);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public static List<InstallAction> set(String key, String value, boolean userSpecific, boolean append, boolean prepend) throws IOException {
/*  63 */     return setWinNT(key, value, userSpecific, append, prepend);
/*     */   } public static List<InstallAction> setWinNT(String key, String value, boolean userSpecific, boolean append, boolean prepend) throws IOException {
/*     */     String keyName;
/*     */     RegistryRoot registryRoot;
/*  67 */     if (HelperCommunication.getInstance().isElevatedHelper() && userSpecific) {
/*  68 */       return setWinNTUnelevated(key, value, append, prepend);
/*     */     }
/*  70 */     ContextInt contextInt = ContextImpl.getSingleContextInt();
/*     */ 
/*     */ 
/*     */     
/*  74 */     if (userSpecific) {
/*  75 */       keyName = "Environment";
/*  76 */       registryRoot = RegistryRoot.HKEY_CURRENT_USER;
/*     */     } else {
/*  78 */       keyName = "SYSTEM\\CurrentControlSet\\Control\\Session Manager\\Environment";
/*  79 */       registryRoot = RegistryRoot.HKEY_LOCAL_MACHINE;
/*     */     } 
/*     */     
/*  82 */     List<InstallAction> rollbackActions = new ArrayList<>();
/*  83 */     Object previousValue = WinRegistry.getValue(registryRoot, keyName, key);
/*  84 */     if (previousValue != null && value != null && previousValue.toString().length() > 0) {
/*  85 */       String previousString = previousValue.toString();
/*  86 */       String previousStringLC = previousString.toLowerCase(Locale.ENGLISH);
/*  87 */       String valueLC = value.toLowerCase(Locale.ENGLISH);
/*  88 */       if ((append || prepend) && (Objects.equals(previousStringLC, valueLC) || previousStringLC
/*  89 */         .startsWith(valueLC + ";") || previousStringLC
/*  90 */         .endsWith(";" + valueLC) || previousStringLC
/*  91 */         .contains(";" + valueLC + ";")))
/*     */       {
/*     */         
/*  94 */         return rollbackActions;
/*     */       }
/*  96 */       if (append) {
/*  97 */         value = previousString + ";" + value;
/*  98 */       } else if (prepend) {
/*  99 */         value = value + ";" + previousString;
/*     */       } 
/*     */     } 
/*     */     
/* 103 */     SetRegistryValueAction action = new SetRegistryValueAction(registryRoot, keyName, key, value, true);
/* 104 */     if (action.execute((Context)contextInt)) {
/* 105 */       rollbackActions.add(action);
/*     */     }
/*     */     
/* 108 */     Misc.broadcastSettingChange();
/*     */     
/* 110 */     if (rollbackActions.isEmpty()) {
/* 111 */       throw new IOException("Could not access key");
/*     */     }
/* 113 */     return rollbackActions;
/*     */   }
/*     */ 
/*     */   
/*     */   private static List<InstallAction> setWinNTUnelevated(final String key, final String value, final boolean append, final boolean prepend) {
/* 118 */     return (List<InstallAction>)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<List<InstallAction>>()
/*     */         {
/*     */           protected List<InstallAction> fetchValue(Context context) throws Exception {
/* 121 */             return EnvVars.setWinNT(key, value, true, append, prepend);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\EnvVars.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */