/*    */ package com.install4j.runtime.installer.frontend;
/*    */ 
/*    */ import com.install4j.api.formcomponents.ComponentTuple;
/*    */ import javax.swing.JComponent;
/*    */ 
/*    */ public class ComponentTupleImpl
/*    */   implements ComponentTuple
/*    */ {
/*    */   private JComponent leftComponent;
/*    */   private JComponent centerComponent;
/*    */   private JComponent rightComponent;
/*    */   
/*    */   public ComponentTupleImpl(JComponent leftComponent, JComponent centerComponent, JComponent rightComponent) {
/* 14 */     this.leftComponent = leftComponent;
/* 15 */     this.centerComponent = centerComponent;
/* 16 */     this.rightComponent = rightComponent;
/*    */   }
/*    */ 
/*    */   
/*    */   public JComponent getLeftComponent() {
/* 21 */     return this.leftComponent;
/*    */   }
/*    */ 
/*    */   
/*    */   public JComponent getCenterComponent() {
/* 26 */     return this.centerComponent;
/*    */   }
/*    */ 
/*    */   
/*    */   public JComponent getRightComponent() {
/* 31 */     return this.rightComponent;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\ComponentTupleImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */