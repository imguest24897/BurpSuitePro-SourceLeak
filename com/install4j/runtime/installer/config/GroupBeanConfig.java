/*     */ package com.install4j.runtime.installer.config;
/*     */ 
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.runtime.beans.groups.Group;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ public class GroupBeanConfig
/*     */   extends AbstractBeanConfig implements GroupProvider {
/*     */   private Group instance;
/*     */   
/*     */   public GroupBeanConfig(boolean screenGroup) {
/*  17 */     this.screenGroup = screenGroup;
/*     */   }
/*     */   private List<AbstractBeanConfig> beanConfigs; private boolean screenGroup;
/*     */   public Group getOrInstantiateGroup(boolean suppressErrors) {
/*  21 */     if (this.instance == null) {
/*  22 */       this.instance = (Group)instantiateBean(suppressErrors);
/*     */     }
/*  24 */     return this.instance;
/*     */   }
/*     */ 
/*     */   
/*     */   public Bean getOrInstantiateBean() {
/*  29 */     return (Bean)getOrInstantiateGroup(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public List<AbstractBeanConfig> getBeanConfigs() {
/*  34 */     return this.beanConfigs;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEnabled() {
/*  39 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isInstantiated() {
/*  44 */     return (this.instance != null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void clearInstance() {
/*  49 */     this.instance = null;
/*  50 */     for (AbstractBeanConfig beanConfig : this.beanConfigs) {
/*  51 */       beanConfig.clearInstance();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setBean(Bean bean) {
/*  57 */     this.instance = (Group)bean;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void read(Element element) {
/*  62 */     super.read(element);
/*     */     
/*  64 */     readBeanConfigs(element);
/*     */   }
/*     */   
/*     */   private void readBeanConfigs(Element element) {
/*  68 */     List<AbstractBeanConfig> beanConfigs = new LinkedList<>();
/*     */     
/*  70 */     Element beansElement = findChild(element, "beans");
/*     */     
/*  72 */     if (beansElement != null) {
/*  73 */       for (Element beanElement : childElements(beansElement)) {
/*     */         AbstractBeanConfig beanConfig;
/*  75 */         String beanElementName = beanElement.getTagName();
/*  76 */         if (beanElementName.equalsIgnoreCase("action")) {
/*  77 */           beanConfig = new ActionBeanConfig();
/*  78 */         } else if (beanElementName.equalsIgnoreCase("screen")) {
/*  79 */           beanConfig = new ScreenBeanConfig();
/*  80 */         } else if (beanElementName.equalsIgnoreCase("link")) {
/*  81 */           if (readAttribute(beanElement, "group", false)) {
/*  82 */             beanConfig = new LinkGroupBeanConfig(this.screenGroup);
/*  83 */           } else if (this.screenGroup) {
/*  84 */             beanConfig = new LinkScreenBeanConfig();
/*     */           } else {
/*  86 */             beanConfig = new LinkActionBeanConfig();
/*     */           } 
/*  88 */         } else if (beanElementName.equalsIgnoreCase("formComponent")) {
/*  89 */           beanConfig = new FormComponentBeanConfig();
/*  90 */         } else if (beanElementName.equalsIgnoreCase("group")) {
/*  91 */           beanConfig = new GroupBeanConfig(this.screenGroup);
/*     */         } else {
/*     */           continue;
/*     */         } 
/*  95 */         beanConfig.read(beanElement);
/*  96 */         beanConfigs.add(beanConfig);
/*     */       } 
/*     */     }
/*     */     
/* 100 */     this.beanConfigs = Collections.unmodifiableList(beanConfigs);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addAllTo(Map<String, AbstractBeanConfig> id2BeanConfig) {
/* 105 */     super.addAllTo(id2BeanConfig);
/*     */     
/* 107 */     for (AbstractBeanConfig beanConfig : this.beanConfigs) {
/* 108 */       beanConfig.addAllTo(id2BeanConfig);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public AbstractBeanConfig clone() {
/* 114 */     GroupBeanConfig clone = (GroupBeanConfig)super.clone();
/* 115 */     List<AbstractBeanConfig> clonedBeanConfigs = new ArrayList<>();
/* 116 */     for (AbstractBeanConfig beanConfig : this.beanConfigs) {
/* 117 */       clonedBeanConfigs.add(beanConfig.clone());
/*     */     }
/* 119 */     clone.beanConfigs = Collections.unmodifiableList(clonedBeanConfigs);
/* 120 */     return clone;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\GroupBeanConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */