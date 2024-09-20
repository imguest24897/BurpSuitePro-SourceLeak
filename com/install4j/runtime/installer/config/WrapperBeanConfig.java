/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import com.install4j.api.beans.Bean;
/*    */ 
/*    */ public class WrapperBeanConfig
/*    */   extends AbstractBeanConfig {
/*    */   private Bean instance;
/*    */   
/*    */   public Bean getOrInstantiateBean(boolean suppressErrors) {
/* 10 */     if (this.instance == null) {
/* 11 */       this.instance = instantiateBean(suppressErrors);
/*    */     }
/* 13 */     return this.instance;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isInstantiated() {
/* 18 */     return (this.instance != null);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void clearInstance() {
/* 23 */     this.instance = null;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void setBean(Bean bean) {
/* 28 */     this.instance = bean;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\WrapperBeanConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */