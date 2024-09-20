/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ public class LicenseScreen
/*    */   extends SystemFormScreen
/*    */ {
/*    */   public boolean isScrollFormPanel() {
/*  7 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTitle() {
/* 12 */     return getMessage(".WizardLicense");
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSubTitle() {
/* 17 */     return getMessage(".LicenseLabel");
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\LicenseScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */