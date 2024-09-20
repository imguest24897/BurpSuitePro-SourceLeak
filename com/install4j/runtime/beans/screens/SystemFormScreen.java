/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.formcomponents.FormEnvironment;
/*    */ import com.install4j.api.screens.Console;
/*    */ import com.install4j.api.screens.FormPanelContainer;
/*    */ import com.install4j.runtime.installer.frontend.FormPanel;
/*    */ import java.awt.GridBagConstraints;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ public abstract class SystemFormScreen
/*    */   extends SystemScreen
/*    */   implements FormPanelContainer
/*    */ {
/*    */   private JPanel formPanel;
/*    */   private FormEnvironment formEnvironment;
/*    */   
/*    */   public void resetFormComponents() {
/* 20 */     ((FormPanel)this.formPanel).previous();
/*    */   }
/*    */ 
/*    */   
/*    */   public void setFormPanel(JPanel formPanel, FormEnvironment formEnvironment) {
/* 25 */     this.formPanel = formPanel;
/* 26 */     this.formEnvironment = formEnvironment;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isScrollFormPanel() {
/* 31 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public FormEnvironment getFormEnvironment() {
/* 36 */     return this.formEnvironment;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void addScreenContent(JPanel panel, GridBagConstraints gc) {
/* 41 */     gc.weightx = gc.weighty = 1.0D;
/* 42 */     gc.fill = 1;
/* 43 */     panel.add(this.formPanel, gc);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 48 */     return (super.handleConsole(console) && this.formEnvironment.handleConsole(console));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\SystemFormScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */