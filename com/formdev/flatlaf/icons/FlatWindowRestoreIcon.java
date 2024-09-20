/*    */ package com.formdev.flatlaf.icons;
/*    */ 
/*    */ import com.formdev.flatlaf.ui.FlatUIUtils;
/*    */ import com.formdev.flatlaf.util.SystemInfo;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.geom.Area;
/*    */ import java.awt.geom.Path2D;
/*    */ import java.awt.geom.Rectangle2D;
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
/*    */ public class FlatWindowRestoreIcon
/*    */   extends FlatWindowAbstractIcon
/*    */ {
/*    */   public FlatWindowRestoreIcon() {
/* 35 */     this(null);
/*    */   }
/*    */ 
/*    */   
/*    */   public FlatWindowRestoreIcon(String windowStyle) {
/* 40 */     super(windowStyle);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void paintIconAt1x(Graphics2D g, int x, int y, int width, int height, double scaleFactor) {
/* 45 */     int iwh = (int)(getSymbolHeight() * scaleFactor);
/* 46 */     int ix = x + (width - iwh) / 2;
/* 47 */     int iy = y + (height - iwh) / 2;
/* 48 */     float thickness = SystemInfo.isWindows_11_orLater ? (float)scaleFactor : (int)scaleFactor;
/* 49 */     int arc = Math.max((int)(1.5D * scaleFactor), 2);
/* 50 */     int arcOuter = (int)(arc + 1.5D * scaleFactor);
/*    */     
/* 52 */     int rwh = (int)((getSymbolHeight() - 2) * scaleFactor);
/* 53 */     int ro2 = iwh - rwh;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 58 */     Path2D r1 = SystemInfo.isWindows_11_orLater ? FlatUIUtils.createRoundRectangle((ix + ro2), iy, rwh, rwh, thickness, arc, arcOuter, arc, arc) : FlatUIUtils.createRectangle((ix + ro2), iy, rwh, rwh, thickness);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 63 */     Path2D r2 = SystemInfo.isWindows_11_orLater ? FlatUIUtils.createRoundRectangle(ix, (iy + ro2), rwh, rwh, thickness, arc, arc, arc, arc) : FlatUIUtils.createRectangle(ix, (iy + ro2), rwh, rwh, thickness);
/*    */ 
/*    */     
/* 66 */     Area area = new Area(r1);
/* 67 */     if (SystemInfo.isWindows_11_orLater) {
/* 68 */       area.subtract(new Area(new Rectangle2D.Float(ix, (float)(iy + scaleFactor), rwh, rwh)));
/* 69 */       area.subtract(new Area(new Rectangle2D.Float((float)(ix + scaleFactor), (iy + ro2), rwh, rwh)));
/*    */     } else {
/* 71 */       area.subtract(new Area(new Rectangle2D.Float(ix, (iy + ro2), rwh, rwh)));
/* 72 */     }  g.fill(area);
/*    */ 
/*    */     
/* 75 */     g.fill(r2);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\icons\FlatWindowRestoreIcon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */