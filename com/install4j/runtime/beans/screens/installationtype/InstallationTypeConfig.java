/*    */ package com.install4j.runtime.beans.screens.installationtype;
/*    */ 
/*    */ import com.install4j.runtime.installer.config.ComponentNodeConfig;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class InstallationTypeConfig
/*    */   extends ComponentNodeConfig
/*    */ {
/*    */   private boolean userCanCustomize = true;
/* 11 */   private ComponentsSelectionType componentsSelectionType = ComponentsSelectionType.SPECIFIC;
/* 12 */   private List<String> selectedComponentIds = new ArrayList<>();
/*    */   
/*    */   public InstallationTypeConfig() {
/* 15 */     super(null);
/*    */   }
/*    */   
/*    */   public boolean isUserCanCustomize() {
/* 19 */     return this.userCanCustomize;
/*    */   }
/*    */   
/*    */   public void setUserCanCustomize(boolean userCanCustomize) {
/* 23 */     this.userCanCustomize = userCanCustomize;
/*    */   }
/*    */   
/*    */   public ComponentsSelectionType getComponentsSelectionType() {
/* 27 */     return this.componentsSelectionType;
/*    */   }
/*    */   
/*    */   public void setComponentsSelectionType(ComponentsSelectionType componentsSelectionType) {
/* 31 */     this.componentsSelectionType = componentsSelectionType;
/*    */   }
/*    */   
/*    */   public List<String> getSelectedComponentIds() {
/* 35 */     return this.selectedComponentIds;
/*    */   }
/*    */   
/*    */   public void setSelectedComponentIds(List<String> selectedComponentIds) {
/* 39 */     this.selectedComponentIds = selectedComponentIds;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean getDefaultDisplayDescriptionValue() {
/* 45 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\installationtype\InstallationTypeConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */