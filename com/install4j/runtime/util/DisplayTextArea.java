/*    */ package com.install4j.runtime.util;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Font;
/*    */ import java.awt.Insets;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.border.Border;
/*    */ import javax.swing.plaf.basic.BasicTextAreaUI;
/*    */ 
/*    */ public class DisplayTextArea extends JTextArea {
/* 10 */   private static final Insets NO_MARGIN = new Insets(0, 0, 0, 0);
/*    */   
/*    */   private Border border;
/*    */   private int maxWidth;
/*    */   
/*    */   public DisplayTextArea() {
/* 16 */     this(true, -1, -1);
/*    */   }
/*    */   
/*    */   public DisplayTextArea(boolean lineWrap, int fontStyle, int maxWidth) {
/* 20 */     this.maxWidth = maxWidth;
/*    */     
/* 22 */     setLineWrap(lineWrap);
/* 23 */     setWrapStyleWord(lineWrap);
/* 24 */     setEditable(false);
/* 25 */     setRequestFocusEnabled(false);
/* 26 */     setFocusable(false);
/*    */     
/* 28 */     setMargin(NO_MARGIN);
/* 29 */     updateUI();
/*    */     
/* 31 */     JLabel label = new JLabel();
/* 32 */     Font font = label.getFont();
/* 33 */     if (fontStyle != -1) {
/* 34 */       font = font.deriveFont(fontStyle);
/*    */     }
/* 36 */     setFont(font);
/* 37 */     setBorder(this.border);
/* 38 */     setOpaque(false);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public final void processEvent(AWTEvent awtevent) {}
/*    */ 
/*    */   
/*    */   public Dimension getPreferredSize() {
/* 47 */     Dimension dimension = super.getPreferredSize();
/* 48 */     if (this.maxWidth > -1) {
/* 49 */       dimension.width = Math.min(dimension.width, this.maxWidth);
/*    */     }
/* 51 */     return dimension;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setBorder(Border border) {
/* 56 */     this.border = border;
/* 57 */     super.setBorder(border);
/*    */   }
/*    */ 
/*    */   
/*    */   public void updateUI() {
/* 62 */     setUI(new BasicTextAreaUI());
/* 63 */     invalidate();
/*    */   }
/*    */   
/*    */   public void scrollRectToVisible(Rectangle aRect) {}
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\DisplayTextArea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */