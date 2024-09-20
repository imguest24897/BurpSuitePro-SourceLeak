/*    */ package com.install4j.runtime.installer.helper.apiimpl;
/*    */ import com.install4j.runtime.installer.helper.PreferencesUtil;
/*    */ import com.install4j.runtime.installer.helper.VariableEncoding;
/*    */ import com.install4j.runtime.installer.helper.registry.InstallRegistry;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Properties;
/*    */ import java.util.prefs.BackingStoreException;
/*    */ import java.util.prefs.Preferences;
/*    */ 
/*    */ public class VariablesImpl {
/*    */   public static Map<String, Object> loadVariablesFromPreferenceStore(String packageName, boolean userSpecific) throws IOException {
/* 17 */     if (InstallRegistry.isNoPreferences()) {
/* 18 */       return null;
/*    */     }
/*    */     
/*    */     try {
/* 22 */       PreferencesUtil.getRootNode(userSpecific).sync();
/* 23 */       Preferences packageNode = PreferencesUtil.getPackageNodeNoCreation(packageName, userSpecific);
/* 24 */       if (packageNode == null) {
/* 25 */         return null;
/*    */       }
/*    */       
/* 28 */       packageNode.sync();
/*    */       
/* 30 */       String[] keys = packageNode.keys();
/* 31 */       if (keys == null || keys.length == 0) {
/* 32 */         return null;
/*    */       }
/*    */       
/* 35 */       Map<String, String> encodedVariables = new HashMap<>();
/* 36 */       for (String key : keys) {
/* 37 */         encodedVariables.put(key, packageNode.get(key, null));
/*    */       }
/*    */       
/* 40 */       return VariableEncoding.decodeVariables(encodedVariables, false);
/* 41 */     } catch (BackingStoreException e) {
/* 42 */       throw new IOException(e);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void saveVariablesToPreferenceStore(Map<String, Object> variables, String packageName, boolean userSpecific) throws IOException {
/* 47 */     if (InstallRegistry.isNoPreferences()) {
/*    */       return;
/*    */     }
/*    */     
/* 51 */     Map<String, String> encodedVariables = new HashMap<>();
/* 52 */     for (Map.Entry<String, Object> entry : variables.entrySet()) {
/* 53 */       String variableName = entry.getKey();
/* 54 */       Object variableValue = entry.getValue();
/* 55 */       VariableEncoding.encodeVariable(encodedVariables, variableName, variableValue);
/*    */     } 
/*    */     
/*    */     try {
/* 59 */       Preferences packageNode = PreferencesUtil.getPackageNode(packageName, userSpecific);
/* 60 */       for (Map.Entry<String, String> entry : encodedVariables.entrySet()) {
/* 61 */         packageNode.put(entry.getKey(), entry.getValue());
/*    */       }
/*    */       
/* 64 */       packageNode.flush();
/* 65 */     } catch (BackingStoreException e) {
/* 66 */       throw new IOException(e);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static Map<String, Object> readInstallerVariables(File responseFile) {
/*    */     
/* 72 */     try { InputStream in = new BufferedInputStream(new FileInputStream(responseFile)); 
/* 73 */       try { Properties properties = new Properties();
/* 74 */         properties.load(in);
/* 75 */         Map<String, String> encodedVariables = new HashMap<>();
/* 76 */         for (Map.Entry<Object, Object> entry : properties.entrySet()) {
/* 77 */           encodedVariables.put((String)entry.getKey(), (String)entry.getValue());
/*    */         }
/* 79 */         Map<String, Object> map = VariableEncoding.decodeVariables(encodedVariables, true);
/* 80 */         in.close(); return map; } catch (Throwable throwable) { try { in.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  } catch (IOException ignored)
/* 81 */     { return new HashMap<>(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\apiimpl\VariablesImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */