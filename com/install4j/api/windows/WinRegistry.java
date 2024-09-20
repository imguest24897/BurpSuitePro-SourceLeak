/*     */ package com.install4j.api.windows;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import com.install4j.runtime.installer.platform.win32.Registry;
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WinRegistry
/*     */ {
/*     */   public static boolean keyExists(RegistryRoot root, String keyName) {
/*  30 */     return keyExists(root, keyName, RegistryView.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean createKey(RegistryRoot root, String keyName) {
/*  40 */     return createKey(root, keyName, RegistryView.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object getValue(RegistryRoot root, String keyName, String valueName) {
/*  53 */     return getValue(root, keyName, valueName, RegistryView.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean setValue(RegistryRoot root, String keyName, String valueName, Object value) {
/*  65 */     return setValue(root, keyName, valueName, value, RegistryView.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void deleteValue(RegistryRoot root, String keyName, String valueName) {
/*  75 */     deleteValue(root, keyName, valueName, RegistryView.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void deleteKey(RegistryRoot root, String keyName, boolean onlyIfEmpty) {
/*  86 */     deleteKey(root, keyName, onlyIfEmpty, RegistryView.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String[] getSubKeyNames(RegistryRoot root, String keyName) {
/*  97 */     return getSubKeyNames(root, keyName, RegistryView.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String[] getValueNames(RegistryRoot root, String keyName) {
/* 108 */     return getValueNames(root, keyName, RegistryView.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean saveKey(RegistryRoot root, String keyName, String fileName) {
/* 121 */     return saveKey(root, keyName, fileName, RegistryView.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean restoreKey(RegistryRoot root, String keyName, String fileName) {
/* 135 */     return restoreKey(root, keyName, fileName, RegistryView.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean keyExists(final RegistryRoot root, final String keyName, final RegistryView registryView) {
/* 146 */     if (isUnelevate(root)) {
/* 147 */       return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */           {
/*     */             protected boolean fetchValue(Context context) throws Exception {
/* 150 */               return WinRegistry.keyExists(root, keyName, registryView);
/*     */             }
/*     */           });
/*     */     }
/* 154 */     return Registry.keyExists(root.getType(), keyName, registryView.getUsedType());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean createKey(final RegistryRoot root, final String keyName, final RegistryView registryView) {
/* 166 */     if (isUnelevate(root)) {
/* 167 */       return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */           {
/*     */             protected boolean fetchValue(Context context) throws Exception {
/* 170 */               return WinRegistry.createKey(root, keyName, registryView);
/*     */             }
/*     */           });
/*     */     }
/* 174 */     return Registry.createKey(root.getType(), keyName, registryView.getUsedType());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object getValue(final RegistryRoot root, final String keyName, final String valueName, final RegistryView registryView) {
/* 189 */     if (isUnelevate(root)) {
/* 190 */       return HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<Object>()
/*     */           {
/*     */             protected Object fetchValue(Context context) throws Exception {
/* 193 */               return WinRegistry.getValue(root, keyName, valueName, registryView);
/*     */             }
/*     */           });
/*     */     }
/* 197 */     return Registry.getValue(root.getType(), keyName, valueName, registryView.getUsedType());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean setValue(final RegistryRoot root, final String keyName, final String valueName, final Object value, final RegistryView registryView) {
/* 211 */     if (isUnelevate(root)) {
/* 212 */       return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */           {
/*     */             protected boolean fetchValue(Context context) throws Exception {
/* 215 */               return WinRegistry.setValue(root, keyName, valueName, value, registryView);
/*     */             }
/*     */           });
/*     */     }
/* 219 */     Object usedValue = (value instanceof ExpandString) ? new Registry.ExpandStringImpl(((ExpandString)value).getValue()) : value;
/* 220 */     return Registry.setValue(root.getType(), keyName, valueName, usedValue, registryView.getUsedType());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void deleteValue(final RegistryRoot root, final String keyName, final String valueName, final RegistryView registryView) {
/* 232 */     if (isUnelevate(root)) {
/* 233 */       HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */           {
/*     */             protected void run(Context context) throws Exception {
/* 236 */               WinRegistry.deleteValue(root, keyName, valueName, registryView);
/*     */             }
/*     */           });
/*     */     } else {
/* 240 */       Registry.deleteValue(root.getType(), keyName, valueName, registryView.getUsedType());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void deleteKey(final RegistryRoot root, final String keyName, final boolean onlyIfEmpty, final RegistryView registryView) {
/* 253 */     if (isUnelevate(root)) {
/* 254 */       HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */           {
/*     */             protected void run(Context context) throws Exception {
/* 257 */               WinRegistry.deleteKey(root, keyName, onlyIfEmpty, registryView);
/*     */             }
/*     */           });
/*     */     } else {
/* 261 */       Registry.deleteKey(root.getType(), keyName, onlyIfEmpty, registryView.getUsedType());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String[] getSubKeyNames(final RegistryRoot root, final String keyName, final RegistryView registryView) {
/* 274 */     if (isUnelevate(root)) {
/* 275 */       return (String[])HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<String[]>()
/*     */           {
/*     */             protected String[] fetchValue(Context context) throws Exception {
/* 278 */               return WinRegistry.getSubKeyNames(root, keyName, registryView);
/*     */             }
/*     */           });
/*     */     }
/* 282 */     return Registry.enumSubKeys(root.getType(), keyName, registryView.getUsedType());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String[] getValueNames(final RegistryRoot root, final String keyName, final RegistryView registryView) {
/* 295 */     if (isUnelevate(root)) {
/* 296 */       return (String[])HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<String[]>()
/*     */           {
/*     */             protected String[] fetchValue(Context context) throws Exception {
/* 299 */               return WinRegistry.getValueNames(root, keyName, registryView);
/*     */             }
/*     */           });
/*     */     }
/* 303 */     return Registry.enumValues(root.getType(), keyName, registryView.getUsedType());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean saveKey(final RegistryRoot root, final String keyName, final String fileName, final RegistryView registryView) {
/* 318 */     if (isUnelevate(root)) {
/* 319 */       return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */           {
/*     */             protected boolean fetchValue(Context context) throws Exception {
/* 322 */               return WinRegistry.saveKey(root, keyName, fileName, registryView);
/*     */             }
/*     */           });
/*     */     }
/* 326 */     return Registry.saveKey(root.getType(), keyName, fileName, registryView.getUsedType());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean restoreKey(final RegistryRoot root, final String keyName, final String fileName, final RegistryView registryView) {
/* 342 */     if (isUnelevate(root)) {
/* 343 */       return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */           {
/*     */             protected boolean fetchValue(Context context) throws Exception {
/* 346 */               return WinRegistry.restoreKey(root, keyName, fileName, registryView);
/*     */             }
/*     */           });
/*     */     }
/* 350 */     return Registry.restoreKey(root.getType(), keyName, fileName, registryView.getUsedType());
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean isUnelevate(RegistryRoot root) {
/* 355 */     return (HelperCommunication.getInstance().isElevatedHelper() && root == RegistryRoot.HKEY_CURRENT_USER);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class ExpandString
/*     */     implements Serializable
/*     */   {
/*     */     private String value;
/*     */ 
/*     */ 
/*     */     
/*     */     public ExpandString(String value) {
/* 369 */       this.value = value;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getValue() {
/* 377 */       return this.value;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 382 */       return this.value;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\WinRegistry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */