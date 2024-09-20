/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import java.awt.Component;
/*    */ import java.awt.Dimension;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JLayeredPane;
/*    */ 
/*    */ public class MaximizedLayeredPane extends JLayeredPane {
/*    */   public void doLayout() {
/* 10 */     Component[] component = getComponents();
/* 11 */     int componentCount = getComponentCount();
/* 12 */     for (int i = 0; i < componentCount; i++) {
/* 13 */       component[i].setBounds(0, 0, getWidth(), getHeight());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public Dimension getPreferredSize() {
/* 19 */     Dimension size = new Dimension();
/* 20 */     Component[] components = getComponents();
/* 21 */     int componentCount = getComponentCount();
/* 22 */     for (int i = 0; i < componentCount; i++) {
/* 23 */       JComponent component = (JComponent)components[i];
/* 24 */       Dimension componentPreferredSize = component.getPreferredSize();
/* 25 */       size.width = Math.max(size.width, componentPreferredSize.width);
/* 26 */       size.height = Math.max(size.height, componentPreferredSize.height);
/*    */     } 
/* 28 */     return size;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\MaximizedLayeredPane.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */