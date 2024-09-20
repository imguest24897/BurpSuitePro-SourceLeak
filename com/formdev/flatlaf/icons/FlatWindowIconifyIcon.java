/*    */ package com.formdev.flatlaf.icons;
/*    */ 
/*    */ import java.awt.Graphics2D;
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
/*    */ public class FlatWindowIconifyIcon
/*    */   extends FlatWindowAbstractIcon
/*    */ {
/*    */   public FlatWindowIconifyIcon() {
/* 30 */     this(null);
/*    */   }
/*    */ 
/*    */   
/*    */   public FlatWindowIconifyIcon(String windowStyle) {
/* 35 */     super(windowStyle);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void paintIconAt1x(Graphics2D g, int x, int y, int width, int height, double scaleFactor) {
/* 40 */     int iw = (int)(getSymbolHeight() * scaleFactor);
/* 41 */     int ih = (int)scaleFactor;
/* 42 */     int ix = x + (width - iw) / 2;
/* 43 */     int iy = y + (height - ih) / 2;
/*    */     
/* 45 */     g.fillRect(ix, iy, iw, ih);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\icons\FlatWindowIconifyIcon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */