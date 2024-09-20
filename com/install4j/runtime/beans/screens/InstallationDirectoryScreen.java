/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ import com.install4j.runtime.installer.frontend.Messages;
/*    */ 
/*    */ public class InstallationDirectoryScreen
/*    */   extends SystemFormScreen
/*    */ {
/*    */   public String getTitle() {
/*  9 */     return getMessage(".WizardSelectDir");
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSubTitle() {
/* 14 */     return Messages.format(getMessage(".SelectDirDesc"), new Object[] { getApplicationName() });
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\InstallationDirectoryScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */