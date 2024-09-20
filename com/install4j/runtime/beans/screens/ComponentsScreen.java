/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ import com.install4j.runtime.installer.config.InstallerConfig;
/*    */ 
/*    */ public class ComponentsScreen
/*    */   extends SystemFormScreen
/*    */ {
/*    */   public boolean isHidden() {
/*  9 */     return (InstallerConfig.getCurrentInstance().getComponents().size() == 0 || getContext().getBooleanVariable("sys.preventComponentCustomization"));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isScrollFormPanel() {
/* 14 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTitle() {
/* 19 */     return getMessage(".WizardSelectComponents");
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSubTitle() {
/* 24 */     return getMessage(".SelectComponentsDesc");
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\ComponentsScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */