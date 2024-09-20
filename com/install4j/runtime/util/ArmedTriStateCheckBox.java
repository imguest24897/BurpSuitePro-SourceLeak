/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import javax.swing.ButtonModel;
/*    */ 
/*    */ public class ArmedTriStateCheckBox
/*    */   extends TriStateCheckBox {
/*    */   public ArmedTriStateCheckBox() {
/*  8 */     ButtonModel model = getIndeterminateCheckbox().getModel();
/*  9 */     model.setArmed(true);
/* 10 */     model.setPressed(true);
/*    */   }
/*    */ 
/*    */   
/*    */   protected float getAlpha() {
/* 15 */     return 1.0F;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\ArmedTriStateCheckBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */