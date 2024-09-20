/*    */ package com.formdev.flatlaf.icons;
/*    */ 
/*    */ import com.formdev.flatlaf.ui.FlatUIUtils;
/*    */ import com.formdev.flatlaf.util.SystemInfo;
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
/*    */ public class FlatWindowMaximizeIcon
/*    */   extends FlatWindowAbstractIcon
/*    */ {
/*    */   public FlatWindowMaximizeIcon() {
/* 32 */     this(null);
/*    */   }
/*    */ 
/*    */   
/*    */   public FlatWindowMaximizeIcon(String windowStyle) {
/* 37 */     super(windowStyle);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void paintIconAt1x(Graphics2D g, int x, int y, int width, int height, double scaleFactor) {
/* 42 */     int iwh = (int)(getSymbolHeight() * scaleFactor);
/* 43 */     int ix = x + (width - iwh) / 2;
/* 44 */     int iy = y + (height - iwh) / 2;
/* 45 */     float thickness = SystemInfo.isWindows_11_orLater ? (float)scaleFactor : (int)scaleFactor;
/* 46 */     int arc = Math.max((int)(1.5D * scaleFactor), 2);
/*    */     
/* 48 */     g.fill(SystemInfo.isWindows_11_orLater ? 
/* 49 */         FlatUIUtils.createRoundRectangle(ix, iy, iwh, iwh, thickness, arc, arc, arc, arc) : 
/* 50 */         FlatUIUtils.createRectangle(ix, iy, iwh, iwh, thickness));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\icons\FlatWindowMaximizeIcon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */