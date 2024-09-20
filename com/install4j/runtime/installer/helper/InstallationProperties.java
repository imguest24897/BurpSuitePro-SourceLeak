/*     */ package com.install4j.runtime.installer.helper;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Properties;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class InstallationProperties implements Serializable {
/*     */   private static final String INSTALLATION_PROP_FILE_NAME = "install.prop";
/*     */   public static final String PROP_NAME_LAUNCHER = "launcher";
/*     */   public static final String PROP_NAME_SERVICE = "service";
/*  18 */   private Properties props = new Properties(); public static final String PROP_NAME_SERVICE_NAME = "serviceName"; private static final String PROP_LANGUAGE_ID = "languageId"; private static final String PROP_MSI_ALL_USERS = "msiAllUsers";
/*     */   
/*     */   public InstallationProperties(File runtimeDir) {
/*  21 */     File file = new File(runtimeDir, "install.prop");
/*  22 */     if (file.exists()) {
/*     */       try {
/*  24 */         InputStream in = new BufferedInputStream(new FileInputStream(file));
/*  25 */         this.props.load(in);
/*  26 */         in.close();
/*  27 */       } catch (IOException e) {
/*  28 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public List<String> getPropertyList(String baseName) {
/*  34 */     List<String> ret = new ArrayList<>();
/*  35 */     int index = 0;
/*     */     String value;
/*  37 */     while ((value = this.props.getProperty(baseName + index++)) != null) {
/*  38 */       ret.add(value);
/*     */     }
/*  40 */     return ret;
/*     */   }
/*     */   
/*     */   public Set<File> getCanonicalFilePropertySet(String baseName) {
/*  44 */     Set<File> ret = new HashSet<>();
/*     */     
/*  46 */     List<String> stringList = getPropertyList(baseName);
/*  47 */     for (String fileName : stringList) {
/*  48 */       ret.add(new File(getCanonicalPath(fileName)));
/*     */     }
/*     */     
/*  51 */     return ret;
/*     */   }
/*     */   
/*     */   public Set<String> getCanonicalPathPropertySet(String baseName) throws IOException {
/*  55 */     Set<String> ret = new HashSet<>();
/*     */     
/*  57 */     List<String> stringList = getPropertyList(baseName);
/*  58 */     for (String fileName : stringList) {
/*  59 */       ret.add(getCanonicalPath(fileName));
/*     */     }
/*     */     
/*  62 */     return ret;
/*     */   }
/*     */   
/*     */   private static String getCanonicalPath(String fileName) {
/*     */     try {
/*  67 */       return (new File(fileName)).getCanonicalPath();
/*  68 */     } catch (IOException e) {
/*  69 */       return (new File(fileName)).getAbsolutePath();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void store(File runtimeDir) throws IOException {
/*  75 */     File file = new File(runtimeDir, "install.prop");
/*  76 */     OutputStream out = new BufferedOutputStream(new FileOutputStream(file));
/*  77 */     this.props.store(out, "");
/*  78 */     out.close();
/*  79 */     FileInstaller.getInstance().registerUninstallFile(file);
/*     */   }
/*     */   
/*     */   public void addFileToSet(String baseName, File file) throws IOException {
/*  83 */     Set<File> currentSet = getCanonicalFilePropertySet(baseName);
/*  84 */     File canonicalFile = file.getCanonicalFile();
/*  85 */     if (!currentSet.contains(canonicalFile)) {
/*  86 */       addToList(baseName, canonicalFile.getAbsolutePath());
/*     */     }
/*     */   }
/*     */   
/*     */   public void addStringToSet(String baseName, String entry) throws IOException {
/*  91 */     List<String> currentList = getPropertyList(baseName);
/*  92 */     if (!currentList.contains(entry)) {
/*  93 */       addToList(baseName, entry);
/*     */     }
/*     */   }
/*     */   
/*     */   private void addToList(String baseName, String value) {
/*  98 */     int index = -1;
/*     */     
/* 100 */     while (this.props.getProperty(baseName + ++index) != null);
/*     */     
/* 102 */     this.props.setProperty(baseName + index, value);
/*     */   }
/*     */   
/*     */   public void setLanguageId(String languageId) {
/* 106 */     this.props.setProperty("languageId", languageId);
/*     */   }
/*     */   
/*     */   public String getLanguageId() {
/* 110 */     return this.props.getProperty("languageId");
/*     */   }
/*     */   
/*     */   public void setMsiAllUsers(boolean allUsers) {
/* 114 */     this.props.setProperty("msiAllUsers", String.valueOf(allUsers));
/*     */   }
/*     */   
/*     */   public boolean isMsiAllUsers() {
/* 118 */     return Boolean.parseBoolean(this.props.getProperty("msiAllUsers"));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\InstallationProperties.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */