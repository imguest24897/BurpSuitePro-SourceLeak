/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import com.install4j.api.styles.Style;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collections;
/*    */ import java.util.LinkedList;
/*    */ import java.util.List;
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class OverriddenStyleBeanConfig
/*    */   extends StyleBeanConfig
/*    */ {
/*    */   private List<WrapperBeanConfig> overriddenBeanConfigs;
/*    */   private String referenceId;
/*    */   private Style instance;
/*    */   private StyleBeanConfig delegate;
/*    */   
/*    */   public Style getOrInstantiateStyle(boolean suppressErrors) {
/* 21 */     if (this.instance == null) {
/* 22 */       this.instance = (Style)getDelegate().instantiateBean(suppressErrors);
/*    */     }
/* 24 */     return this.instance;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<WrapperBeanConfig> getOverriddenBeanConfigs() {
/* 29 */     return this.overriddenBeanConfigs;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isInstantiated() {
/* 34 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void batchInstantiate() {
/* 39 */     for (WrapperBeanConfig overriddenBeanConfig : this.overriddenBeanConfigs) {
/* 40 */       overriddenBeanConfig.batchInstantiate();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public List<AbstractBeanConfig> getFormComponentConfigs() {
/* 46 */     return getDelegate().getFormComponentConfigs();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void read(Element element) {
/* 51 */     super.read(element);
/* 52 */     this.referenceId = readAttribute(element, "referenceId", this.referenceId);
/* 53 */     readOverriddenBeans(element);
/*    */   }
/*    */   
/*    */   private void readOverriddenBeans(Element element) {
/* 57 */     Element overriddenStylesElement = findChild(element, "overriddenBeans");
/* 58 */     List<WrapperBeanConfig> overriddenBeanConfigs = new LinkedList<>();
/*    */     
/* 60 */     if (overriddenStylesElement != null) {
/* 61 */       for (Element beanElement : childElements(overriddenStylesElement)) {
/* 62 */         WrapperBeanConfig beanConfig = (WrapperBeanConfig)readNestedBeanConfig(beanElement);
/* 63 */         if (beanConfig != null) {
/* 64 */           overriddenBeanConfigs.add(beanConfig);
/*    */         }
/*    */       } 
/*    */     }
/* 68 */     this.overriddenBeanConfigs = Collections.unmodifiableList(overriddenBeanConfigs);
/*    */   }
/*    */   
/*    */   private StyleBeanConfig getDelegate() {
/* 72 */     if (this.delegate == null) {
/* 73 */       this.delegate = InstallerConfig.getCurrentInstance().getStyleConfigById(this.referenceId).clone();
/*    */     }
/* 75 */     return this.delegate;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void clearInstance() {
/* 80 */     this.instance = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public StyleBeanConfig clone() {
/* 85 */     OverriddenStyleBeanConfig clone = (OverriddenStyleBeanConfig)super.clone();
/* 86 */     if (this.overriddenBeanConfigs != null) {
/* 87 */       clone.overriddenBeanConfigs = new ArrayList<>();
/* 88 */       for (WrapperBeanConfig overriddenBeanConfig : this.overriddenBeanConfigs) {
/* 89 */         clone.overriddenBeanConfigs.add((WrapperBeanConfig)overriddenBeanConfig.clone());
/*    */       }
/*    */     } 
/* 92 */     return clone;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\OverriddenStyleBeanConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */