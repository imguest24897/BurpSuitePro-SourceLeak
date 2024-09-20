/*   */ package com.install4j.runtime.util;
/*   */ 
/*   */ import java.awt.Dimension;
/*   */ import javax.swing.JTextArea;
/*   */ 
/*   */ public class MinimumSizeTextArea
/*   */   extends JTextArea {
/*   */   public Dimension getMinimumSize() {
/* 9 */     return getPreferredSize();
/*   */   }
/*   */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\MinimumSizeTextArea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */