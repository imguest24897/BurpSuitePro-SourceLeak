/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ public class DefaultInfoScreen
/*    */   extends SystemFormScreen
/*    */ {
/*    */   public String getTitle() {
/*  7 */     return getMessage(".WizardInfoBefore");
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSubTitle() {
/* 12 */     return getMessage(".InfoBeforeLabel");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isScrollFormPanel() {
/* 17 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\DefaultInfoScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */