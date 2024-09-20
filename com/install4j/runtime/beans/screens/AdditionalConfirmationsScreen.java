/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ import com.install4j.api.formcomponents.FormComponent;
/*    */ import com.install4j.runtime.installer.frontend.Messages;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AdditionalConfirmationsScreen
/*    */   extends SystemFormScreen
/*    */ {
/*    */   public static final String FORM_VARIABLE_CONFIRMATION_MESSAGE = "confirmationMessage";
/*    */   
/*    */   public void willActivate() {
/* 14 */     super.willActivate();
/* 15 */     String messageKey = getMessage((getContext() instanceof com.install4j.api.context.UninstallerContext) ? ".SelectTasksUninstallLabel" : ".SelectTasksLabel2");
/* 16 */     getFormEnvironment().setFormVariable("confirmationMessage", Messages.format(messageKey, new Object[] { getApplicationName() }));
/*    */   }
/*    */ 
/*    */   
/*    */   public void activated() {
/* 21 */     FormComponent[] formComponents = getFormEnvironment().getFormComponents();
/* 22 */     if (formComponents.length == 1 && formComponents[0] instanceof com.install4j.runtime.beans.formcomponents.MultilineLabelComponent) {
/* 23 */       getContext().goForward(1, true, true);
/*    */     } else {
/* 25 */       super.activated();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTitle() {
/* 31 */     return getMessage(".WizardSelectTasks");
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSubTitle() {
/* 36 */     return getMessage(".SelectTasksDesc");
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\AdditionalConfirmationsScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */