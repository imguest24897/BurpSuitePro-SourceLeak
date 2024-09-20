/*     */ package com.install4j.runtime.util;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Rectangle;
/*     */ 
/*     */ public class CustomLabel extends JLabel implements Scrollable {
/*   8 */   private static Rectangle textRect = new Rectangle();
/*   9 */   private static Rectangle iconRect = new Rectangle();
/*  10 */   private static Rectangle viewRect = new Rectangle();
/*  11 */   private static Insets insets = new Insets(0, 0, 0, 0);
/*     */   
/*     */   private boolean underlined = false;
/*     */   
/*     */   private boolean autoTooltip = false;
/*     */   
/*     */   public CustomLabel() {}
/*     */   
/*     */   public CustomLabel(String text) {
/*  20 */     super(text);
/*     */   }
/*     */ 
/*     */   
/*     */   public Dimension getPreferredScrollableViewportSize() {
/*  25 */     return getSize();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
/*  30 */     return getWidth() / 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean getScrollableTracksViewportWidth() {
/*  35 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean getScrollableTracksViewportHeight() {
/*  40 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
/*  45 */     return 10;
/*     */   }
/*     */   
/*     */   public boolean isUnderlined() {
/*  49 */     return this.underlined;
/*     */   }
/*     */   
/*     */   public void setUnderlined(boolean underlined) {
/*  53 */     this.underlined = underlined;
/*  54 */     repaint();
/*     */   }
/*     */   
/*     */   public boolean getAutoTooltip() {
/*  58 */     return this.autoTooltip;
/*     */   }
/*     */   
/*     */   public void setAutoTooltip(boolean autoTooltip) {
/*  62 */     this.autoTooltip = autoTooltip;
/*  63 */     setToolTipText(getText());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setText(String text) {
/*  68 */     super.setText(text);
/*  69 */     if (this.autoTooltip) {
/*  70 */       setToolTipText(text);
/*     */     }
/*     */   }
/*     */   
/*     */   public void setText(short number) {
/*  75 */     setText(String.valueOf(number));
/*     */   }
/*     */   
/*     */   public void setText(int number) {
/*  79 */     setText(String.valueOf(number));
/*     */   }
/*     */   
/*     */   public void setText(double number) {
/*  83 */     setText(String.valueOf(number));
/*     */   }
/*     */   
/*     */   public void setText(float number) {
/*  87 */     setText(String.valueOf(number));
/*     */   }
/*     */   
/*     */   public void setText(long number) {
/*  91 */     setText(String.valueOf(number));
/*     */   }
/*     */ 
/*     */   
/*     */   public void paint(Graphics g) {
/*  96 */     super.paint(g);
/*     */     
/*  98 */     if (this.underlined) {
/*     */       
/* 100 */       getInsets(insets);
/* 101 */       textRect.setFrame(0.0D, 0.0D, 0.0D, 0.0D);
/* 102 */       iconRect.setFrame(0.0D, 0.0D, 0.0D, 0.0D);
/* 103 */       viewRect.setFrame(insets.left, insets.top, (getWidth() - insets.right + insets.left), (getHeight() - insets.bottom + insets.top));
/*     */       
/* 105 */       FontMetrics fm = g.getFontMetrics();
/* 106 */       SwingUtilities.layoutCompoundLabel(this, fm, 
/*     */ 
/*     */           
/* 109 */           getText(), 
/* 110 */           getIcon(), 
/* 111 */           getVerticalAlignment(), 
/* 112 */           getHorizontalAlignment(), 
/* 113 */           getVerticalTextPosition(), 
/* 114 */           getHorizontalTextPosition(), viewRect, iconRect, textRect, 
/*     */ 
/*     */ 
/*     */           
/* 118 */           (getText() == null) ? 0 : getIconTextGap());
/*     */ 
/*     */       
/* 121 */       Integer textShiftOffset = (Integer)UIManager.get("Button.textShiftOffset");
/* 122 */       int textShiftOffsetValue = (textShiftOffset != null) ? textShiftOffset.intValue() : 0;
/* 123 */       g.fillRect(textRect.x, textRect.y + fm
/* 124 */           .getAscent() + textShiftOffsetValue + 1, textRect.width, 1);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\CustomLabel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */