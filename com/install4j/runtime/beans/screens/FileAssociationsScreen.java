/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ import com.install4j.api.screens.Screen;
/*    */ import com.install4j.runtime.beans.formcomponents.FileAssociationsComponent;
/*    */ 
/*    */ public class FileAssociationsScreen
/*    */   extends SystemFormScreen {
/*    */   public boolean isHidden() {
/*  9 */     return (FileAssociationsComponent.findAssociationActions(getContext(), (Screen)this).size() == 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTitle() {
/* 14 */     return getMessage(".WizardSelectAssociations");
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSubTitle() {
/* 19 */     return getMessage(".SelectAssociationsDesc");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isScrollFormPanel() {
/* 24 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\FileAssociationsScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */