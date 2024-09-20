/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ import com.install4j.api.context.ControlButtonType;
/*    */ import com.install4j.runtime.installer.frontend.Messages;
/*    */ 
/*    */ public class UninstallationScreen
/*    */   extends SystemProgressScreen
/*    */ {
/*    */   public void willActivate() {
/* 10 */     super.willActivate();
/* 11 */     getContext().getWizardContext().setControlButtonEnabled(ControlButtonType.CANCEL, false);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTitle() {
/* 16 */     return Messages.format(getMessage(".UninstallAppFullTitle"), new Object[] { getApplicationName() });
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSubTitle() {
/* 21 */     return Messages.format(getMessage(".UninstallStatusLabel"), new Object[] { getApplicationName() });
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\UninstallationScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */