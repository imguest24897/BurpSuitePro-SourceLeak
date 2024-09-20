/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ import com.install4j.api.screens.AbstractInstallerOrUninstallerScreen;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ public class StartupScreen
/*    */   extends AbstractInstallerOrUninstallerScreen
/*    */ {
/*    */   public boolean isHidden() {
/* 11 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public JComponent createComponent() {
/* 16 */     return new JPanel();
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTitle() {
/* 21 */     return "";
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSubTitle() {
/* 26 */     return "";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFillVertical() {
/* 31 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFillHorizontal() {
/* 36 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\StartupScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */