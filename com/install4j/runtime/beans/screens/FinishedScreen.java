/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ import com.install4j.runtime.installer.frontend.Messages;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ 
/*    */ public class FinishedScreen
/*    */   extends SystemFormScreen
/*    */ {
/*    */   public static final String FORM_VARIABLE_FINISHED_MESSAGE = "finishedMessage";
/*    */   
/*    */   public boolean isPreviousVisible() {
/* 12 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void willActivate() {
/* 17 */     super.willActivate();
/*    */     
/* 19 */     StringBuilder message = new StringBuilder();
/* 20 */     if (getContext().isConsole()) {
/* 21 */       message.append(Messages.format(getMessage(".FinishedLabelNoIcons"), new Object[] { getApplicationName() }));
/*    */     } else {
/* 23 */       if (InstallerUtil.isWindows() || InstallerUtil.isMacOS()) {
/* 24 */         message.append(Messages.format(getMessage(".FinishedLabel"), new Object[] { getApplicationName() }));
/*    */       } else {
/* 26 */         message.append(Messages.format(getMessage(".FinishedLabelUnix"), new Object[] { getApplicationName() }));
/*    */       } 
/* 28 */       message.append("\n\n");
/* 29 */       message.append(getMessage(".ClickFinish"));
/*    */     } 
/* 31 */     getFormEnvironment().setFormVariable("finishedMessage", message.toString());
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTitle() {
/* 36 */     return Messages.format(getMessage(".FinishedHeadingLabel"), new Object[] { getApplicationName() });
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSubTitle() {
/* 41 */     return "";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\FinishedScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */