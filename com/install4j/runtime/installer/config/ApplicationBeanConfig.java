/*     */ package com.install4j.runtime.installer.config;
/*     */ 
/*     */ import com.install4j.runtime.beans.applications.Application;
/*     */ import com.install4j.runtime.installer.helper.VariableEncoding;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ public class ApplicationBeanConfig
/*     */   extends AbstractBeanConfig {
/*     */   protected Application instance;
/*     */   private Map<String, String> installerVariables;
/*     */   protected List<AbstractBeanConfig> screenConfigs;
/*     */   
/*     */   public Application getOrInstantiateApplication(boolean suppressErrors) {
/*  21 */     if (this.instance == null) {
/*  22 */       this.instance = (Application)instantiateBean(suppressErrors);
/*     */     }
/*  24 */     return this.instance;
/*     */   }
/*     */   private Map<String, AbstractBeanConfig> id2BeanConfig; private HashSet<String> hiddenVariableNames; private Set<String> responseFileVariableNames; private Map<String, String> responseFileComments;
/*     */   
/*     */   public boolean isInstantiated() {
/*  29 */     return (this.instance != null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void clearInstance() {
/*  34 */     this.instance = null;
/*     */   }
/*     */   
/*     */   public List<AbstractBeanConfig> getScreenConfigs() {
/*  38 */     return this.screenConfigs;
/*     */   }
/*     */   
/*     */   public Map<String, String> getInstallerVariables() {
/*  42 */     return this.installerVariables;
/*     */   }
/*     */   
/*     */   public HashSet<String> getHiddenVariableNames() {
/*  46 */     return this.hiddenVariableNames;
/*     */   }
/*     */   
/*     */   public Set<String> getResponseFileVariableNames() {
/*  50 */     return this.responseFileVariableNames;
/*     */   }
/*     */   
/*     */   public Map<String, String> getResponseFileComments() {
/*  54 */     return this.responseFileComments;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void read(Element element) {
/*  59 */     super.read(element);
/*     */     
/*  61 */     this.hiddenVariableNames = new HashSet<>();
/*  62 */     this.responseFileVariableNames = new HashSet<>();
/*  63 */     this.responseFileComments = new HashMap<>();
/*  64 */     this.installerVariables = InstallerConfig.readVariables(findChild(element, "variables"), variableElement -> {
/*     */           String name = VariableEncoding.getRealVariableName(readAttribute(variableElement, "name", (String)null));
/*     */           
/*     */           if (readAttribute(variableElement, "hidden", false)) {
/*     */             this.hiddenVariableNames.add(name);
/*     */           }
/*     */           if (readAttribute(variableElement, "registerForResponseFile", false)) {
/*     */             this.responseFileVariableNames.add(name);
/*     */           }
/*     */           String comment = readAttribute(variableElement, "responseFileComment", "");
/*     */           if (!comment.isEmpty()) {
/*     */             this.responseFileComments.put(name, comment);
/*     */           }
/*     */         });
/*  78 */     this.screenConfigs = Collections.unmodifiableList(readScreenConfigs(findChild(element, "screens")));
/*     */   }
/*     */   
/*     */   public Map<String, AbstractBeanConfig> getId2BeanConfig() {
/*  82 */     return this.id2BeanConfig;
/*     */   }
/*     */ 
/*     */   
/*     */   protected final List<AbstractBeanConfig> readScreenConfigs(Element screensElement) {
/*  87 */     List<AbstractBeanConfig> screenConfigs = new LinkedList<>();
/*  88 */     this.id2BeanConfig = new HashMap<>();
/*     */     
/*  90 */     for (Element beanElement : childElements(screensElement)) {
/*  91 */       AbstractBeanConfig beanConfig; String beanElementName = beanElement.getTagName();
/*     */       
/*  93 */       if (beanElementName.equalsIgnoreCase("screen")) {
/*  94 */         beanConfig = new ScreenBeanConfig();
/*  95 */       } else if (beanElementName.equalsIgnoreCase("group")) {
/*  96 */         beanConfig = new GroupBeanConfig(true);
/*  97 */       } else if (beanElementName.equalsIgnoreCase("link")) {
/*  98 */         if (readAttribute(beanElement, "group", false)) {
/*  99 */           beanConfig = new LinkGroupBeanConfig(true);
/*     */         } else {
/* 101 */           beanConfig = new LinkScreenBeanConfig();
/*     */         } 
/*     */       } else {
/*     */         continue;
/*     */       } 
/* 106 */       beanConfig.read(beanElement);
/* 107 */       screenConfigs.add(beanConfig);
/* 108 */       beanConfig.addAllTo(this.id2BeanConfig);
/*     */     } 
/*     */     
/* 111 */     for (AbstractBeanConfig beanConfig : this.id2BeanConfig.values()) {
/* 112 */       if (beanConfig instanceof LinkBeanConfig) {
/* 113 */         ((LinkBeanConfig)beanConfig).setDelegate(this.id2BeanConfig);
/*     */       }
/*     */     } 
/*     */     
/* 117 */     return screenConfigs;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\ApplicationBeanConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */