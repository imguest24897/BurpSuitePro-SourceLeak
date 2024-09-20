/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ public class AlphaTriStateCheckBox extends TriStateCheckBox {
/*    */   private float alpha;
/*    */   
/*    */   public AlphaTriStateCheckBox(float alpha) {
/*  7 */     this.alpha = alpha;
/*  8 */     getIndeterminateCheckbox().setEnabled(false);
/*    */   }
/*    */ 
/*    */   
/*    */   protected float getAlpha() {
/* 13 */     return this.alpha;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\AlphaTriStateCheckBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */