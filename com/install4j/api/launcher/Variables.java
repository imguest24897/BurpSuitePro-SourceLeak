/*     */ package com.install4j.api.launcher;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.exe4j.runtime.util.ResourceHelper;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.apiimpl.VariablesImpl;
/*     */ import com.install4j.runtime.launcher.LauncherVariables;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Variables
/*     */ {
/*     */   private static Map<String, String> compilerVariables;
/*     */   private static Map<String, Object> installerVariables;
/*     */   
/*     */   public static String getCompilerVariable(String variableName) throws IOException {
/*  39 */     if (compilerVariables == null) {
/*  40 */       InstallerConfig config = InstallerConfig.getConfigFromFile(InstallerUtil.getInstallerFile("i4jparams.conf"));
/*  41 */       compilerVariables = config.getCompilerVariables();
/*     */     } 
/*  43 */     return compilerVariables.get(variableName);
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
/*     */   public static synchronized Map<String, Object> getInstallerVariables() {
/*  56 */     ensureInstallerVariablesRead();
/*  57 */     return installerVariables;
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
/*     */   public static synchronized Object getInstallerVariable(String variableName) {
/*  69 */     ensureInstallerVariablesRead();
/*  70 */     return installerVariables.get(variableName);
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
/*     */   public static Map<String, Object> loadFromPreferenceStore(boolean userSpecific) throws IOException {
/*  83 */     return loadFromPreferenceStore(LauncherVariables.getApplicationId(), userSpecific);
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
/*     */   public static Map<String, Object> loadFromPreferenceStore(String packageName, boolean userSpecific) throws IOException {
/*  96 */     return VariablesImpl.loadVariablesFromPreferenceStore(packageName, userSpecific);
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
/*     */   public static void saveToPreferenceStore(Map<String, Object> variables, boolean userSpecific) throws IOException {
/* 112 */     saveToPreferenceStore(variables, LauncherVariables.getApplicationId(), userSpecific);
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
/*     */   public static void saveToPreferenceStore(Map<String, Object> variables, String packageName, boolean userSpecific) throws IOException {
/* 127 */     VariablesImpl.saveVariablesToPreferenceStore(variables, packageName, userSpecific);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void clearInstallerVariablesCache() {
/* 137 */     installerVariables = null;
/*     */   }
/*     */   
/*     */   private static synchronized void ensureInstallerVariablesRead() {
/* 141 */     if (installerVariables == null) {
/* 142 */       installerVariables = VariablesImpl.readInstallerVariables(InstallerUtil.getInstallerFile("response.varfile"));
/* 143 */       addInstallationDir();
/* 144 */       if (System.getProperty("install4j.commIdentifier") == null) {
/* 145 */         InstallerVariables.initUserVars(installerVariables);
/* 146 */         InstallerVariables.initSystemVars(installerVariables);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void addInstallationDir() {
/* 152 */     String contentDirectory = FileUtil.getCanonicalPath(new File(ResourceHelper.getRuntimeDir(), ".."));
/* 153 */     String installationDirectory = contentDirectory;
/*     */     
/* 155 */     if (Util.isMacOS() && (contentDirectory.endsWith(".app/Contents/java/app") || contentDirectory.endsWith(".app/Contents/Resources/app"))) {
/* 156 */       installationDirectory = FileUtil.getCanonicalPath(new File(contentDirectory, "../../../.."));
/*     */     }
/* 158 */     installerVariables.put("sys.installationDir", installationDirectory);
/* 159 */     installerVariables.put("sys.contentDir", contentDirectory);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\launcher\Variables.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */