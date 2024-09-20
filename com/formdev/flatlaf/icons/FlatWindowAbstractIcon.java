/*    */ package com.formdev.flatlaf.icons;
/*    */ 
/*    */ import com.formdev.flatlaf.ui.FlatButtonUI;
/*    */ import com.formdev.flatlaf.ui.FlatUIUtils;
/*    */ import com.formdev.flatlaf.util.HiDPIUtils;
/*    */ import java.awt.Color;
/*    */ import java.awt.Component;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.RenderingHints;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class FlatWindowAbstractIcon
/*    */   extends FlatAbstractIcon
/*    */ {
/*    */   private final int symbolHeight;
/*    */   private final Color hoverBackground;
/*    */   private final Color pressedBackground;
/*    */   
/*    */   protected FlatWindowAbstractIcon(String windowStyle) {
/* 47 */     this(FlatUIUtils.getSubUIDimension("TitlePane.buttonSize", windowStyle), 
/* 48 */         FlatUIUtils.getSubUIInt("TitlePane.buttonSymbolHeight", windowStyle, 10), 
/* 49 */         FlatUIUtils.getSubUIColor("TitlePane.buttonHoverBackground", windowStyle), 
/* 50 */         FlatUIUtils.getSubUIColor("TitlePane.buttonPressedBackground", windowStyle));
/*    */   }
/*    */ 
/*    */   
/*    */   protected FlatWindowAbstractIcon(Dimension size, int symbolHeight, Color hoverBackground, Color pressedBackground) {
/* 55 */     super(size.width, size.height, null);
/* 56 */     this.symbolHeight = symbolHeight;
/* 57 */     this.hoverBackground = hoverBackground;
/* 58 */     this.pressedBackground = pressedBackground;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void paintIcon(Component c, Graphics2D g) {
/* 63 */     paintBackground(c, g);
/*    */     
/* 65 */     g.setColor(getForeground(c));
/* 66 */     HiDPIUtils.paintAtScale1x(g, 0, 0, this.width, this.height, this::paintIconAt1x);
/*    */   }
/*    */   
/*    */   protected abstract void paintIconAt1x(Graphics2D paramGraphics2D, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble);
/*    */   
/*    */   protected void paintBackground(Component c, Graphics2D g) {
/* 72 */     Color background = FlatButtonUI.buttonStateColor(c, null, null, null, this.hoverBackground, this.pressedBackground);
/* 73 */     if (background != null) {
/*    */       
/* 75 */       Object oldHint = g.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
/* 76 */       g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
/*    */       
/* 78 */       g.setColor(FlatUIUtils.deriveColor(background, c.getBackground()));
/* 79 */       g.fillRect(0, 0, this.width, this.height);
/*    */       
/* 81 */       g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, oldHint);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected Color getForeground(Component c) {
/* 86 */     return c.getForeground();
/*    */   }
/*    */ 
/*    */   
/*    */   protected int getSymbolHeight() {
/* 91 */     return this.symbolHeight;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\icons\FlatWindowAbstractIcon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */