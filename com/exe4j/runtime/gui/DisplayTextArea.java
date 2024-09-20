/*    */ package com.exe4j.runtime.gui;
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
/*    */   private int fontStyle;
/*    */   private Border border;
/*    */   private int maxWidth;
/*    */   
/*    */   public DisplayTextArea() {
/* 17 */     this(true, -1, -1);
/*    */   }
/*    */ 
/*    */   
/*    */   public DisplayTextArea(boolean lineWrap, int fontStyle, int maxWidth) {
/* 22 */     this.fontStyle = fontStyle;
/* 23 */     this.maxWidth = maxWidth;
/* 24 */     setLineWrap(lineWrap);
/* 25 */     setWrapStyleWord(lineWrap);
/* 26 */     setEditable(false);
/* 27 */     setRequestFocusEnabled(false);
/*    */     
/* 29 */     setMargin(NO_MARGIN);
/* 30 */     updateUI();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public final void processEvent(AWTEvent awtevent) {}
/*    */ 
/*    */   
/*    */   public Dimension getPreferredSize() {
/* 39 */     Dimension dimension = super.getPreferredSize();
/* 40 */     if (this.maxWidth > -1) {
/* 41 */       dimension.width = Math.min(dimension.width, this.maxWidth);
/*    */     }
/* 43 */     return dimension;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setBorder(Border border) {
/* 48 */     this.border = border;
/* 49 */     super.setBorder(border);
/*    */   }
/*    */ 
/*    */   
/*    */   public void updateUI() {
/* 54 */     setUI(new BasicTextAreaUI());
/* 55 */     invalidate();
/*    */     
/* 57 */     JLabel label = new JLabel();
/* 58 */     Font font = label.getFont();
/* 59 */     if (this.fontStyle != -1) {
/* 60 */       font = font.deriveFont(this.fontStyle);
/*    */     }
/* 62 */     setFont(font);
/* 63 */     setBorder(this.border);
/* 64 */     setOpaque(false);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtime\gui\DisplayTextArea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */