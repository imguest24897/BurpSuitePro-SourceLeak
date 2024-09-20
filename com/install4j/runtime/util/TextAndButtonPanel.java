/*    */ package com.install4j.runtime.util;
/*    */ import java.awt.GridBagConstraints;
/*    */ import java.awt.GridBagLayout;
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.JTextField;
/*    */ 
/*    */ public class TextAndButtonPanel extends AbstractTextAndButtonPanel {
/*    */   private JTextField textField;
/*    */   
/*    */   public TextAndButtonPanel(JTextField textField, JButton button) {
/* 11 */     this.textField = textField;
/* 12 */     this.button = button;
/*    */     
/* 14 */     setLayout(new GridBagLayout());
/*    */     
/* 16 */     GridBagConstraints gc = new GridBagConstraints();
/* 17 */     gc.weighty = 0.0D;
/* 18 */     gc.gridy = 0;
/*    */     
/* 20 */     gc.gridx = 0;
/* 21 */     gc.weightx = 1.0D;
/* 22 */     gc.fill = 2;
/*    */     
/* 24 */     add(textField, gc);
/*    */     
/* 26 */     gc.gridx = 1;
/* 27 */     gc.weightx = 0.0D;
/* 28 */     gc.fill = 0;
/* 29 */     gc.insets.left = 5;
/* 30 */     add(button, gc);
/*    */   }
/*    */   private JButton button;
/*    */   
/*    */   protected JTextField getTextField() {
/* 35 */     return this.textField;
/*    */   }
/*    */ 
/*    */   
/*    */   protected JButton getButton() {
/* 40 */     return this.button;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\TextAndButtonPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */