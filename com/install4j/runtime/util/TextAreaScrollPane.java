/*    */ package com.install4j.runtime.util;
/*    */ import java.awt.Dimension;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JScrollPane;
/*    */ import javax.swing.JViewport;
/*    */ 
/*    */ public class TextAreaScrollPane extends JScrollPane {
/*    */   public TextAreaScrollPane(JComponent component, boolean hasPreferredWidth) {
/*  9 */     super(component);
/* 10 */     setAlignmentX(0.0F);
/* 11 */     if (hasPreferredWidth) {
/* 12 */       JViewport viewport = getViewport();
/* 13 */       Dimension preferredSize = component.getPreferredSize();
/* 14 */       viewport.setMinimumSize(preferredSize);
/* 15 */       viewport.setMaximumSize(preferredSize);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public Dimension getMinimumSize() {
/* 21 */     return getPreferredSize();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\TextAreaScrollPane.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */