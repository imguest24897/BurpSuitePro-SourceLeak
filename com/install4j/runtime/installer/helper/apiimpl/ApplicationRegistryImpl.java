/*     */ package com.install4j.runtime.installer.helper.apiimpl;
/*     */ 
/*     */ import com.install4j.api.ApplicationRegistry;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.config.Bitness;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.registry.InstallRegistry;
/*     */ import java.io.File;
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ApplicationRegistryImpl
/*     */ {
/*     */   public static boolean checkApplicationId(File dir) {
/*  22 */     InstallerConfig installerConfig = InstallerConfig.getCurrentInstance();
/*     */     
/*  24 */     String oldApplicationId = InstallerUtil.getOldApplicationId(dir);
/*  25 */     String targetAppId = installerConfig.getTargetApplicationId();
/*     */     
/*  27 */     if (!installerConfig.isAddOnInstaller()) {
/*  28 */       return (oldApplicationId == null || oldApplicationId.trim().length() == 0 || Objects.equals(oldApplicationId, targetAppId));
/*     */     }
/*  30 */     if (oldApplicationId == null) {
/*  31 */       return false;
/*     */     }
/*  33 */     return Objects.equals(oldApplicationId, targetAppId);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isUpdateDirectory(File dir) {
/*  39 */     if (dir == null || !dir.exists() || !dir.isDirectory()) {
/*  40 */       return false;
/*     */     }
/*     */     
/*  43 */     InstallerConfig installerConfig = InstallerConfig.getCurrentInstance();
/*     */     
/*  45 */     String oldApplicationId = InstallerUtil.getOldApplicationId(dir);
/*  46 */     String myApplicationId = installerConfig.getApplicationId();
/*     */     
/*  48 */     return Objects.equals(oldApplicationId, myApplicationId);
/*     */   }
/*     */ 
/*     */   
/*     */   public static ApplicationRegistry.ApplicationInfo[] getApplicationInfoById(String id) {
/*  53 */     List<ApplicationRegistry.ApplicationInfo> ret = new ArrayList<>();
/*     */     
/*  55 */     String[] dirPaths = InstallRegistry.getAllInstallationDirs(id, true);
/*     */     
/*  57 */     for (String dirPath : dirPaths) {
/*  58 */       ApplicationRegistry.ApplicationInfo applicationInfo = getApplicationInfoByDir(new File(dirPath));
/*  59 */       if (applicationInfo != null && Objects.equals(id, applicationInfo.getId())) {
/*  60 */         ret.add(applicationInfo);
/*     */       }
/*     */       
/*  63 */       if (Util.isMacOS()) {
/*  64 */         String singleBundleName = InstallRegistry.getSingleBundleName(id, dirPath);
/*  65 */         if (singleBundleName != null) {
/*  66 */           File appDir = new File(dirPath, singleBundleName + "/" + "Contents/Resources/app");
/*     */           
/*  68 */           applicationInfo = getApplicationInfoByDir(appDir);
/*  69 */           if (applicationInfo != null && Objects.equals(id, applicationInfo.getId())) {
/*  70 */             ret.add(applicationInfo);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  77 */     return ret.<ApplicationRegistry.ApplicationInfo>toArray(new ApplicationRegistry.ApplicationInfo[0]);
/*     */   }
/*     */   
/*     */   public static ApplicationInfoImpl getApplicationInfoByDir(File dir) {
/*  81 */     InstallerConfig installerConfig = InstallerUtil.getOldApplicationConfig(dir);
/*  82 */     if (installerConfig == null) {
/*  83 */       return null;
/*     */     }
/*  85 */     return new ApplicationInfoImpl(dir, installerConfig);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ApplicationRegistry.ApplicationInfo[] getAddOnApplicationInfoByDir(File dir) {
/*  96 */     List<InstallerConfig> addOnConfigs = InstallerUtil.getAddOnApplicationConfigs(dir);
/*  97 */     if (addOnConfigs == null) {
/*  98 */       return null;
/*     */     }
/* 100 */     ApplicationRegistry.ApplicationInfo[] ret = new ApplicationRegistry.ApplicationInfo[addOnConfigs.size()];
/*     */     
/* 102 */     for (int i = 0; i < addOnConfigs.size(); i++) {
/* 103 */       ret[i] = new ApplicationInfoImpl(dir, addOnConfigs.get(i));
/*     */     }
/* 105 */     return ret;
/*     */   }
/*     */   
/*     */   public static class ApplicationInfoImpl
/*     */     implements ApplicationRegistry.ApplicationInfo, Serializable
/*     */   {
/*     */     private File installationDirectory;
/*     */     private String id;
/*     */     private String name;
/*     */     private String version;
/*     */     private String mediaSetId;
/*     */     private Bitness bitness;
/*     */     private Map<String, String> compilerVariables;
/*     */     private Map<String, Object> installerVariables;
/*     */     
/*     */     public ApplicationInfoImpl(File installationDirectory, InstallerConfig installerConfig) {
/* 121 */       this.id = installerConfig.getApplicationId();
/* 122 */       this.name = installerConfig.getApplicationName();
/* 123 */       this.version = installerConfig.getApplicationVersion();
/* 124 */       this.mediaSetId = installerConfig.getMediaSetId();
/* 125 */       this.bitness = installerConfig.getBitness();
/* 126 */       this.installationDirectory = installationDirectory;
/* 127 */       this.compilerVariables = installerConfig.getCompilerVariables();
/*     */     }
/*     */ 
/*     */     
/*     */     public String getMediaSetId() {
/* 132 */       return this.mediaSetId;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getCompilerVariable(String variableName) {
/* 137 */       return this.compilerVariables.get(variableName);
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getInstallerVariable(String variableName) {
/* 142 */       ensureInstallerVariablesRead();
/* 143 */       return this.installerVariables.get(variableName);
/*     */     }
/*     */     
/*     */     private synchronized void ensureInstallerVariablesRead() {
/* 147 */       if (this.installerVariables == null) {
/* 148 */         File responseFile = new File(this.installationDirectory, ".install4j/response.varfile");
/* 149 */         this.installerVariables = VariablesImpl.readInstallerVariables(responseFile);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public File getInstallationDirectory() {
/* 155 */       return this.installationDirectory;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getId() {
/* 160 */       return this.id;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 165 */       return this.name;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getVersion() {
/* 170 */       return this.version;
/*     */     }
/*     */     
/*     */     public Bitness getBitness() {
/* 174 */       return this.bitness;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 179 */       return "ApplicationInfo: " + getName() + " " + getVersion() + " (id: " + getId() + "), dir: " + getInstallationDirectory();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\apiimpl\ApplicationRegistryImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */