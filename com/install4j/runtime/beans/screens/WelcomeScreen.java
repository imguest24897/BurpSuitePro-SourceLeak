/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.screens.Console;
/*    */ import com.install4j.runtime.installer.config.InstallerConfig;
/*    */ import com.install4j.runtime.installer.frontend.Messages;
/*    */ import com.install4j.runtime.util.DisplayTextArea;
/*    */ import java.awt.GridBagConstraints;
/*    */ import java.util.Objects;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ public class WelcomeScreen
/*    */   extends SystemFormScreen
/*    */ {
/*    */   public boolean isPreviousVisible() {
/* 18 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void addScreenContent(JPanel panel, GridBagConstraints gc) {
/* 23 */     super.addScreenContent(panel, gc);
/* 24 */     String extraMessage = getExtraMessage();
/* 25 */     if (!extraMessage.isEmpty()) {
/* 26 */       gc.gridy++;
/* 27 */       gc.weighty = 0.0D;
/* 28 */       gc.fill = 0;
/* 29 */       gc.anchor = 23;
/* 30 */       DisplayTextArea dtxa = addDisplayTextArea("\n" + extraMessage, panel, gc);
/* 31 */       dtxa.setFont(dtxa.getFont().deriveFont(1));
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 37 */     String extraMessage = getExtraMessage();
/* 38 */     if (!Util.isWindows() && !extraMessage.isEmpty()) {
/* 39 */       console.println(extraMessage);
/*    */     }
/* 41 */     return super.handleConsole(console);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTitle() {
/* 46 */     return Messages.format(getMessage(".WelcomeLabel1"), new Object[] { getApplicationName() });
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSubTitle() {
/* 51 */     return "";
/*    */   }
/*    */   
/*    */   private String getExtraMessage() {
/* 55 */     String status = InstallerConfig.getCurrentInstance().getStatus();
/* 56 */     if (!Objects.equals(status, "LCOK")) {
/* 57 */       return "This installer was created with an evaluation version of install4j";
/*    */     }
/* 59 */     return "";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\WelcomeScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */