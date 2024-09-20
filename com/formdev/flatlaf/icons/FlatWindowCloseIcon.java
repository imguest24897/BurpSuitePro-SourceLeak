/*    */ package com.formdev.flatlaf.icons;
/*    */ 
/*    */ import com.formdev.flatlaf.ui.FlatButtonUI;
/*    */ import com.formdev.flatlaf.ui.FlatUIUtils;
/*    */ import com.formdev.flatlaf.util.SystemInfo;
/*    */ import java.awt.BasicStroke;
/*    */ import java.awt.Color;
/*    */ import java.awt.Component;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.geom.Path2D;
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
/*    */ public class FlatWindowCloseIcon
/*    */   extends FlatWindowAbstractIcon
/*    */ {
/*    */   private final Color hoverForeground;
/*    */   private final Color pressedForeground;
/*    */   
/*    */   public FlatWindowCloseIcon() {
/* 45 */     this(null);
/*    */   }
/*    */ 
/*    */   
/*    */   public FlatWindowCloseIcon(String windowStyle) {
/* 50 */     super(FlatUIUtils.getSubUIDimension("TitlePane.buttonSize", windowStyle), 
/* 51 */         FlatUIUtils.getSubUIInt("TitlePane.buttonSymbolHeight", windowStyle, 10), 
/* 52 */         FlatUIUtils.getSubUIColor("TitlePane.closeHoverBackground", windowStyle), 
/* 53 */         FlatUIUtils.getSubUIColor("TitlePane.closePressedBackground", windowStyle));
/*    */     
/* 55 */     this.hoverForeground = FlatUIUtils.getSubUIColor("TitlePane.closeHoverForeground", windowStyle);
/* 56 */     this.pressedForeground = FlatUIUtils.getSubUIColor("TitlePane.closePressedForeground", windowStyle);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void paintIconAt1x(Graphics2D g, int x, int y, int width, int height, double scaleFactor) {
/* 61 */     int iwh = (int)(getSymbolHeight() * scaleFactor);
/* 62 */     int ix = x + (width - iwh) / 2;
/* 63 */     int iy = y + (height - iwh) / 2;
/* 64 */     int ix2 = ix + iwh - 1;
/* 65 */     int iy2 = iy + iwh - 1;
/* 66 */     float thickness = SystemInfo.isWindows_11_orLater ? (float)scaleFactor : (int)scaleFactor;
/*    */     
/* 68 */     Path2D path = new Path2D.Float(0, 4);
/* 69 */     path.moveTo(ix, iy);
/* 70 */     path.lineTo(ix2, iy2);
/* 71 */     path.moveTo(ix, iy2);
/* 72 */     path.lineTo(ix2, iy);
/* 73 */     g.setStroke(new BasicStroke(thickness));
/* 74 */     g.draw(path);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Color getForeground(Component c) {
/* 79 */     return FlatButtonUI.buttonStateColor(c, c.getForeground(), null, null, this.hoverForeground, this.pressedForeground);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\icons\FlatWindowCloseIcon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */