/*    */ package com.install4j.runtime.alert;
/*    */ 
/*    */ public class AlertResult<E> {
/*    */   E selectedButton;
/*    */   int selectedIndex;
/*    */   boolean suppressionSelected;
/*    */   
/*    */   AlertResult(E selectedButton, int selectedIndex, boolean suppressionSelected) {
/*  9 */     this.selectedButton = selectedButton;
/* 10 */     this.selectedIndex = selectedIndex;
/* 11 */     this.suppressionSelected = suppressionSelected;
/*    */   }
/*    */   
/*    */   public E getSelectedButton() {
/* 15 */     return this.selectedButton;
/*    */   }
/*    */   
/*    */   public int getSelectedIndex() {
/* 19 */     return this.selectedIndex;
/*    */   }
/*    */   
/*    */   public boolean isSuppressionSelected() {
/* 23 */     return this.suppressionSelected;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 28 */     return "AlertResult{selectedButton=" + this.selectedButton + ", selectedIndex=" + this.selectedIndex + ", suppressionSelected=" + this.suppressionSelected + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\alert\AlertResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */