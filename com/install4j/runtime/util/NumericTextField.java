/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import java.awt.event.KeyAdapter;
/*    */ import java.awt.event.KeyEvent;
/*    */ import javax.swing.JTextField;
/*    */ 
/*    */ public class NumericTextField
/*    */   extends JTextField
/*    */ {
/*    */   public NumericTextField(String text, final int length) {
/* 11 */     setText(text);
/* 12 */     setColumns(length);
/* 13 */     setMinimumSize(getPreferredSize());
/*    */     
/* 15 */     addKeyListener(new KeyAdapter()
/*    */         {
/*    */           public void keyTyped(KeyEvent event) {
/* 18 */             char c = event.getKeyChar();
/* 19 */             if ((c < '0' || c > '9' || NumericTextField.this.getText().length() >= length) && c != '\b' && c != '') {
/*    */ 
/*    */ 
/*    */               
/* 23 */               NumericTextField.this.getToolkit().beep();
/* 24 */               event.consume();
/*    */             } 
/*    */           }
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\NumericTextField.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */