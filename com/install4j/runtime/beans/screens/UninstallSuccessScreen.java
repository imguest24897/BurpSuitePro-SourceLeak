/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ import com.install4j.runtime.installer.frontend.Messages;
/*    */ 
/*    */ public class UninstallSuccessScreen
/*    */   extends SystemFormScreen
/*    */ {
/*    */   public static final String FORM_VARIABLE_SUCCESS_MESSAGE = "successMessage";
/*    */   
/*    */   public boolean isPreviousVisible() {
/* 11 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void willActivate() {
/* 16 */     super.willActivate();
/* 17 */     getFormEnvironment().setFormVariable("successMessage", Messages.format(getMessage(".UninstalledAll"), new Object[] { getApplicationName() }));
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTitle() {
/* 22 */     return Messages.format(getMessage(".UninstallAppFullTitle"), new Object[] { getApplicationName() });
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSubTitle() {
/* 27 */     return "";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\UninstallSuccessScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */