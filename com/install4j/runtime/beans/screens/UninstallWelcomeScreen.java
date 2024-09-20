/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ import com.install4j.runtime.installer.frontend.Messages;
/*    */ 
/*    */ public class UninstallWelcomeScreen
/*    */   extends SystemFormScreen
/*    */ {
/*    */   public static final String FORM_VARIABLE_WELCOME_MESSAGE = "welcomeMessage";
/*    */   
/*    */   public boolean isPreviousVisible() {
/* 11 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void willActivate() {
/* 16 */     super.willActivate();
/*    */     
/* 18 */     StringBuilder message = new StringBuilder();
/* 19 */     message.append(Messages.format(getMessage(".ConfirmUninstall"), new Object[] { getApplicationName() }));
/* 20 */     message.append("\n\n");
/* 21 */     message.append(getMessage(".ClickNext"));
/*    */     
/* 23 */     getFormEnvironment().setFormVariable("welcomeMessage", message.toString());
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTitle() {
/* 28 */     return Messages.format(getMessage(".UninstallAppFullTitle"), new Object[] { getApplicationName() });
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSubTitle() {
/* 33 */     return "";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\UninstallWelcomeScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */