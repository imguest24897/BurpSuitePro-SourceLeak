/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ import com.install4j.api.context.ControlButtonType;
/*    */ import com.install4j.runtime.installer.frontend.Messages;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InstallationScreen
/*    */   extends SystemProgressScreen
/*    */ {
/*    */   private boolean cancelEnabled = true;
/*    */   
/*    */   public boolean isCancelEnabled() {
/* 14 */     return replaceWithTextOverride("cancelEnabled", this.cancelEnabled);
/*    */   }
/*    */   
/*    */   public void setCancelEnabled(boolean cancelEnabled) {
/* 18 */     this.cancelEnabled = cancelEnabled;
/*    */   }
/*    */ 
/*    */   
/*    */   public void willActivate() {
/* 23 */     super.willActivate();
/* 24 */     getContext().getWizardContext().setControlButtonEnabled(ControlButtonType.CANCEL, isCancelEnabled());
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTitle() {
/* 29 */     return getMessage(".WizardInstalling");
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSubTitle() {
/* 34 */     return Messages.format(getMessage(".InstallingLabel"), new Object[] { getApplicationName() });
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\InstallationScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */