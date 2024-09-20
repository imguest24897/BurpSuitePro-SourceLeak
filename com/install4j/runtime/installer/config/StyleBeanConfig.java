/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import com.install4j.api.beans.Bean;
/*    */ import com.install4j.api.styles.Style;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ 
/*    */ public class StyleBeanConfig
/*    */   extends FormComponentContainerBeanConfig
/*    */   implements StyleProvider {
/*    */   private Style instance;
/*    */   
/*    */   public Style getOrInstantiateStyle(boolean suppressErrors) {
/* 14 */     if (this.instance == null) {
/* 15 */       this.instance = (Style)instantiateBean(suppressErrors);
/*    */     }
/* 17 */     return this.instance;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isInstantiated() {
/* 22 */     return (this.instance != null);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void clearInstance() {
/* 27 */     this.instance = null;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void setBean(Bean bean) {
/* 32 */     this.instance = (Style)bean;
/*    */   }
/*    */ 
/*    */   
/*    */   public StyleBeanConfig clone() {
/* 37 */     return (StyleBeanConfig)super.clone();
/*    */   }
/*    */ 
/*    */   
/*    */   public Style getStyle() {
/* 42 */     return getOrInstantiateStyle(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public StyleProvider cloneStyleProvider() {
/* 47 */     return clone();
/*    */   }
/*    */   
/*    */   public List<WrapperBeanConfig> getOverriddenBeanConfigs() {
/* 51 */     return Collections.emptyList();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\StyleBeanConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */