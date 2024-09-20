/*    */ package com.formdev.flatlaf.ui;
/*    */ 
/*    */ import java.awt.Component;
/*    */ import javax.swing.UIManager;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FlatTextBorder
/*    */   extends FlatBorder
/*    */ {
/*    */   @Styleable
/* 33 */   protected int arc = UIManager.getInt("TextComponent.arc");
/*    */   
/*    */   @Styleable
/*    */   protected Boolean roundRect;
/*    */ 
/*    */   
/*    */   protected int getArc(Component c) {
/* 40 */     if (isCellEditor(c)) {
/* 41 */       return 0;
/*    */     }
/* 43 */     Boolean roundRect = FlatUIUtils.isRoundRect(c);
/* 44 */     if (roundRect == null)
/* 45 */       roundRect = this.roundRect; 
/* 46 */     return (roundRect != null) ? (roundRect.booleanValue() ? 32767 : 0) : this.arc;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatTextBorder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */