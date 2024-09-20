/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.JTextField;
/*    */ 
/*    */ public abstract class AbstractTextAndButtonPanel extends JPanel {
/*    */   public int getBaseline(int width, int height) {
/* 10 */     JTextField txtDirectory = getTextField();
/* 11 */     JButton btnBrowse = getButton();
/*    */     
/* 13 */     int baseline = getBaseline(txtDirectory, (txtDirectory.getPreferredSize()).width, (txtDirectory.getPreferredSize()).height);
/*    */ 
/*    */ 
/*    */     
/* 17 */     return baseline + ((btnBrowse.getPreferredSize()).height - (txtDirectory.getPreferredSize()).height) / 2;
/*    */   }
/*    */   
/*    */   private int getBaseline(JComponent component, int width, int height) {
/* 21 */     if (width <= 1 || height <= 1) {
/* 22 */       return -1;
/*    */     }
/* 24 */     return component.getBaseline(width, height);
/*    */   }
/*    */   
/*    */   protected abstract JTextField getTextField();
/*    */   
/*    */   protected abstract JButton getButton();
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\AbstractTextAndButtonPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */