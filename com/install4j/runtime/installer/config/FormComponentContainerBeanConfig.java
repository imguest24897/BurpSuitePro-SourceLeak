/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collections;
/*    */ import java.util.LinkedList;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ public abstract class FormComponentContainerBeanConfig
/*    */   extends AbstractBeanConfig {
/*    */   public List<AbstractBeanConfig> getFormComponentConfigs() {
/* 13 */     return this.formComponentConfigs;
/*    */   }
/*    */   private List<AbstractBeanConfig> formComponentConfigs;
/*    */   
/*    */   protected void read(Element element) {
/* 18 */     super.read(element);
/*    */     
/* 20 */     readFormComponentConfigs(element);
/*    */   }
/*    */   
/*    */   private void readFormComponentConfigs(Element element) {
/* 24 */     List<AbstractBeanConfig> formComponentConfigs = new LinkedList<>();
/*    */     
/* 26 */     Element formComponentsElement = findChild(element, "formComponents");
/* 27 */     if (formComponentsElement == null) {
/*    */       return;
/*    */     }
/*    */     
/* 31 */     for (Element beanElement : childElements(formComponentsElement)) {
/* 32 */       AbstractBeanConfig beanConfig; String beanElementName = beanElement.getTagName();
/*    */       
/* 34 */       if (beanElementName.equalsIgnoreCase("formComponent")) {
/* 35 */         beanConfig = new FormComponentBeanConfig();
/* 36 */       } else if (beanElementName.equalsIgnoreCase("group")) {
/* 37 */         beanConfig = new GroupBeanConfig(false);
/*    */       } else {
/*    */         return;
/*    */       } 
/* 41 */       beanConfig.read(beanElement);
/* 42 */       formComponentConfigs.add(beanConfig);
/*    */     } 
/* 44 */     this.formComponentConfigs = Collections.unmodifiableList(formComponentConfigs);
/*    */   }
/*    */ 
/*    */   
/*    */   public void addAllTo(Map<String, AbstractBeanConfig> id2BeanConfig) {
/* 49 */     super.addAllTo(id2BeanConfig);
/*    */     
/* 51 */     if (this.formComponentConfigs != null) {
/* 52 */       for (AbstractBeanConfig formComponentConfig : this.formComponentConfigs) {
/* 53 */         formComponentConfig.addAllTo(id2BeanConfig);
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public FormComponentContainerBeanConfig clone() {
/* 60 */     FormComponentContainerBeanConfig clone = (FormComponentContainerBeanConfig)super.clone();
/* 61 */     if (this.formComponentConfigs != null) {
/* 62 */       clone.formComponentConfigs = new ArrayList<>();
/* 63 */       for (AbstractBeanConfig formComponentConfig : this.formComponentConfigs) {
/* 64 */         clone.formComponentConfigs.add(formComponentConfig.clone());
/*    */       }
/*    */     } 
/* 67 */     return clone;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\FormComponentContainerBeanConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */