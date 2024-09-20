/*     */ package com.install4j.runtime.installer.helper.registry;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import java.util.StringTokenizer;
/*     */ 
/*     */ 
/*     */ public class InstallRegistry
/*     */ {
/*     */   private static final String REGVAL_PREFIX_INST_DIR = "instdir";
/*     */   public static final String REGVAL_PREFIX_ALL_INST_DIR = "allinstdirs";
/*     */   
/*     */   public static boolean isNoPreferences() {
/*  26 */     return (Boolean.getBoolean("noPreferences") || (ContextImpl.getSingleContextInt() != null && 
/*  27 */       ContextImpl.getSingleContextInt().getBooleanVariable("sys.noPreferences")));
/*     */   }
/*     */   private static final String REGVAL_PREFIX_SINGLE_BUNDLE_NAME = "singleBundleName"; private static final String DELIMITER = ";"; private static RegistryInterface registry;
/*     */   public static void registerApplication(final String applicationId, final File installationDir, final String singleBundleName) {
/*  31 */     HelperCommunication.getInstance().executeAction(ExecutionContext.MAXIMUM, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/*  34 */             InstallRegistry.registerApplicationInt(applicationId, installationDir, singleBundleName);
/*     */           }
/*     */         });
/*     */   }
/*     */   private static void registerApplicationInt(String applicationId, File installationDir, String singleBundleName) {
/*  39 */     init();
/*     */     
/*     */     try {
/*  42 */       installationDir = installationDir.getCanonicalFile();
/*  43 */     } catch (IOException e) {
/*  44 */       e.printStackTrace();
/*     */     } 
/*     */     
/*  47 */     String singleInstDir = registry.getValue("instdir" + applicationId);
/*     */     
/*  49 */     unregisterApplication(applicationId, installationDir);
/*     */     
/*  51 */     String allKeyName = "allinstdirs" + applicationId;
/*  52 */     String instDirValue = registry.getValue(allKeyName);
/*     */     
/*  54 */     if (instDirValue == null) {
/*  55 */       if (singleInstDir != null && singleInstDir.trim().length() > 0) {
/*     */         try {
/*  57 */           File singleFile = (new File(singleInstDir)).getCanonicalFile();
/*  58 */           if (!Objects.equals(singleFile, installationDir)) {
/*  59 */             instDirValue = installationDir.getAbsolutePath() + ";" + singleFile.getAbsolutePath();
/*     */           }
/*  61 */         } catch (IOException e) {
/*  62 */           e.printStackTrace();
/*     */         } 
/*     */       }
/*     */       
/*  66 */       if (instDirValue == null) {
/*  67 */         instDirValue = installationDir.getAbsolutePath();
/*     */       }
/*     */     } else {
/*  70 */       instDirValue = installationDir.getAbsolutePath() + ";" + instDirValue;
/*     */     } 
/*     */     
/*  73 */     registry.setValue(allKeyName, instDirValue);
/*  74 */     registry.setValue("instdir" + applicationId, installationDir.getAbsolutePath());
/*     */ 
/*     */     
/*  77 */     if (singleBundleName != null) {
/*  78 */       registry.setValue("singleBundleName" + applicationId + "_" + installationDir.getAbsolutePath(), singleBundleName);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void unregisterApplication(String applicationId, File installationDir) {
/*  83 */     init();
/*     */     
/*     */     try {
/*  86 */       installationDir = installationDir.getCanonicalFile();
/*  87 */     } catch (IOException e) {
/*  88 */       e.printStackTrace();
/*     */     } 
/*     */     
/*  91 */     registry.deleteValue("instdir" + applicationId);
/*     */     
/*  93 */     String allKeyName = "allinstdirs" + applicationId;
/*  94 */     String instDirValue = registry.getValue(allKeyName);
/*     */     
/*  96 */     StringBuilder buffer = new StringBuilder();
/*     */     
/*  98 */     if (instDirValue != null) {
/*  99 */       for (StringTokenizer tokenizer = new StringTokenizer(instDirValue, ";"); tokenizer.hasMoreTokens(); ) {
/* 100 */         String value = tokenizer.nextToken();
/*     */         try {
/* 102 */           if (!Objects.equals((new File(value)).getCanonicalFile(), installationDir)) {
/* 103 */             buffer.append(value).append(";");
/*     */           }
/* 105 */         } catch (IOException e) {
/* 106 */           e.printStackTrace();
/*     */         } 
/*     */       } 
/*     */     }
/* 110 */     String newInstDirValue = buffer.toString();
/* 111 */     if (Objects.equals(newInstDirValue, "")) {
/* 112 */       registry.deleteValue(allKeyName);
/*     */     } else {
/* 114 */       registry.setValue(allKeyName, newInstDirValue);
/*     */     } 
/*     */     
/* 117 */     registry.deleteValue("singleBundleName" + applicationId + "_" + installationDir.getAbsolutePath());
/*     */   }
/*     */   
/*     */   public static String getInstallationDir(String applicationId) {
/* 121 */     String[] allDirs = getAllInstallationDirs(applicationId, false);
/* 122 */     if (allDirs.length > 0) {
/* 123 */       return allDirs[0];
/*     */     }
/* 125 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String[] getAllInstallationDirs(String applicationId, boolean checkOtherBitness) {
/* 130 */     List<String> ret = new ArrayList<>();
/* 131 */     Set<String> addedDirs = new HashSet<>();
/*     */     
/* 133 */     addAllInstallationDirs(applicationId, ret, addedDirs, false);
/* 134 */     if (checkOtherBitness) {
/* 135 */       addAllInstallationDirs(applicationId, ret, addedDirs, true);
/*     */     }
/*     */     
/* 138 */     return ret.<String>toArray(new String[0]);
/*     */   }
/*     */   
/*     */   private static void addAllInstallationDirs(String applicationId, List<String> ret, Set<String> addedDirs, boolean otherBitness) {
/* 142 */     String instDirs = getValue("allinstdirs" + applicationId, otherBitness);
/* 143 */     if (instDirs != null) {
/* 144 */       for (StringTokenizer tokenizer = new StringTokenizer(instDirs, ";"); tokenizer.hasMoreTokens(); ) {
/* 145 */         String value = tokenizer.nextToken();
/* 146 */         if (value != null && value.trim().length() > 0 && addedDirs.add(value)) {
/* 147 */           ret.add(value);
/*     */         }
/*     */       } 
/*     */     } else {
/* 151 */       String value = getValue("instdir" + applicationId, otherBitness);
/* 152 */       if (value != null && value.trim().length() > 0 && addedDirs.add(value)) {
/* 153 */         ret.add(value);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static String getSingleBundleName(String applicationId, String installationDir) {
/*     */     try {
/* 160 */       return getValue("singleBundleName" + applicationId + "_" + (new File(installationDir)).getCanonicalFile());
/* 161 */     } catch (IOException e) {
/* 162 */       e.printStackTrace();
/* 163 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static String getValue(String valueName) {
/* 168 */     init();
/* 169 */     return registry.getValue(valueName);
/*     */   }
/*     */   
/*     */   public static String getValue(String valueName, boolean otherBitness) {
/* 173 */     init();
/* 174 */     if (otherBitness) {
/* 175 */       return registry.getOtherBitnessValue(valueName);
/*     */     }
/* 177 */     return registry.getValue(valueName);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void setValue(final String valueName, final String value) {
/* 182 */     HelperCommunication.getInstance().executeAction(ExecutionContext.MAXIMUM, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 185 */             InstallRegistry.init();
/* 186 */             InstallRegistry.registry.deleteValue(valueName);
/* 187 */             InstallRegistry.registry.setValue(valueName, value);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private static void init() {
/* 193 */     if (registry == null)
/* 194 */       if (InstallerUtil.isWindows()) {
/* 195 */         registry = new Win32Registry();
/* 196 */       } else if (isNoPreferences()) {
/* 197 */         registry = new NoRegistry();
/*     */       } else {
/* 199 */         registry = new PreferencesRegistry();
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\registry\InstallRegistry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */