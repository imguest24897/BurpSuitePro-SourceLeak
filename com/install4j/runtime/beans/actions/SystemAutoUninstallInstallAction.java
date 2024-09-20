/*    */ package com.install4j.runtime.beans.actions;
/*    */ 
/*    */ import com.install4j.api.actions.AutoUninstallAction;
/*    */ import java.util.Properties;
/*    */ 
/*    */ public abstract class SystemAutoUninstallInstallAction
/*    */   extends SystemInstallAction
/*    */   implements AutoUninstallAction {
/*  9 */   private Properties persistentProperties = new Properties();
/*    */ 
/*    */   
/*    */   public Properties getPersistentProperties() {
/* 13 */     return (Properties)replaceWithTextOverride("persistentProperties", this.persistentProperties, Properties.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setPersistentProperties(Properties properties) {
/* 18 */     this.persistentProperties = properties;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\SystemAutoUninstallInstallAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */