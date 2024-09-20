/*     */ package com.install4j.runtime.installer.helper.content;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.runtime.installer.config.ComponentConfig;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Properties;
/*     */ import java.util.Set;
/*     */ import java.util.StringTokenizer;
/*     */ 
/*     */ class ContentStats {
/*  21 */   private Properties stats = new Properties(); private static ContentStats instance;
/*     */   
/*     */   public static ContentStats getInstance() throws IOException {
/*  24 */     if (instance == null) {
/*  25 */       if (HelperCommunication.getInstance().isElevatedHelper()) {
/*  26 */         HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */             {
/*     */               protected void run(Context context) throws Exception {
/*  29 */                 ContentStats.getInstance();
/*     */               }
/*     */             });
/*     */       }
/*  33 */       instance = new ContentStats();
/*     */     } 
/*  35 */     return instance;
/*     */   }
/*     */   
/*     */   private ContentStats() throws IOException {
/*  39 */     InputStream in = new FileInputStream(InstallerUtil.getInstallerFile("stats.properties"));
/*  40 */     this.stats.load(in);
/*  41 */     in.close();
/*     */   }
/*     */   
/*     */   public long getSelectedContentSize() throws IOException {
/*  45 */     return getStatValue("content.size.", getSelectedContentNumbers(null));
/*     */   }
/*     */   
/*     */   public long getSelectedContentCount() throws IOException {
/*  49 */     return getStatValue("content.count.", getSelectedContentNumbers(null));
/*     */   }
/*     */   
/*     */   public long getSelectedContentSize(String componentId) throws IOException {
/*  53 */     return getStatValue("content.size.", getSelectedContentNumbers(componentId));
/*     */   }
/*     */   
/*     */   public long getSelectedContentCount(String componentId) throws IOException {
/*  57 */     return getStatValue("content.count.", getSelectedContentNumbers(componentId));
/*     */   }
/*     */   
/*     */   private long getStatValue(String type, Set<String> contentNumbers) {
/*  61 */     long ret = 0L;
/*     */     
/*  63 */     for (String number : contentNumbers) {
/*  64 */       ret += Long.parseLong(this.stats.getProperty(type + number));
/*     */     }
/*     */     
/*  67 */     return ret;
/*     */   }
/*     */   
/*     */   public Set<String> getSelectedContentNumbers(String componentId) {
/*  71 */     HashSet<String> ret = new HashSet<>();
/*     */     
/*  73 */     if (componentId == null) {
/*  74 */       addContentNumbers(ret, String.valueOf(0));
/*     */       
/*  76 */       for (String s : getSelectedComponents()) {
/*  77 */         addContentNumbers(ret, s);
/*     */       }
/*     */     } else {
/*  80 */       addContentNumbers(ret, componentId);
/*     */     } 
/*     */     
/*  83 */     return ret;
/*     */   }
/*     */   
/*     */   private static Collection<String> getSelectedComponents() {
/*  87 */     return (Collection<String>)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<Collection<String>>()
/*     */         {
/*     */           protected Collection<String> fetchValue(Context context) throws Exception {
/*  90 */             List<String> ret = new ArrayList<>();
/*  91 */             for (ComponentConfig componentConfig : InstallerConfig.getCurrentInstance().getComponents()) {
/*  92 */               if (componentConfig.isSelected()) {
/*  93 */                 ret.add(componentConfig.getId());
/*     */               }
/*     */             } 
/*  96 */             return ret;
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private void addContentNumbers(Set<String> ret, String componentId) {
/* 102 */     int setNumbers = Integer.parseInt(this.stats.getProperty("setCount", "0"));
/*     */     
/* 104 */     for (int i = 0; i < setNumbers; i++) {
/* 105 */       String components = this.stats.getProperty("components." + i);
/* 106 */       for (StringTokenizer stringTokenizer = new StringTokenizer(components, "."); stringTokenizer.hasMoreTokens(); ) {
/* 107 */         String componentInFile = stringTokenizer.nextToken();
/* 108 */         if (Objects.equals(componentInFile, componentId)) {
/* 109 */           ret.add(String.valueOf(i));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public long getFileSize(String number) {
/* 116 */     return Long.parseLong(this.stats.getProperty("file.size." + number));
/*     */   }
/*     */   
/*     */   public String getDirName() {
/* 120 */     return this.stats.getProperty("dirName");
/*     */   }
/*     */   
/*     */   public String getFileName(String number) {
/* 124 */     return this.stats.getProperty("file.name." + number);
/*     */   }
/*     */   
/*     */   public String getComponentListString(String number) {
/* 128 */     return this.stats.getProperty("components." + number);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 133 */     return "ContentStats{stats=" + this.stats + '}';
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\ContentStats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */