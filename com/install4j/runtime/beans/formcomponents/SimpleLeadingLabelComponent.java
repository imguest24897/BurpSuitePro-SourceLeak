/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ public class SimpleLeadingLabelComponent
/*    */   extends LeadingLabelComponent {
/*    */   public JComponent createCenterComponent() {
/*  9 */     return new JPanel()
/*    */       {
/*    */         public boolean isVisible() {
/* 12 */           return false;
/*    */         }
/*    */       };
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFillCenterHorizontal() {
/* 19 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasUserInput() {
/* 24 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\SimpleLeadingLabelComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */