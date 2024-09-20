/*    */ package com.install4j.runtime.beans.screens.components;
/*    */ 
/*    */ import com.install4j.runtime.util.CustomPanel;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Rectangle;
/*    */ import javax.swing.Scrollable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ScrollablePanel
/*    */   extends CustomPanel
/*    */   implements Scrollable
/*    */ {
/*    */   public Dimension getPreferredScrollableViewportSize() {
/* 15 */     return getPreferredSize();
/*    */   }
/*    */ 
/*    */   
/*    */   public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
/* 20 */     return 10;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
/* 25 */     return 50;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean getScrollableTracksViewportWidth() {
/* 30 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean getScrollableTracksViewportHeight() {
/* 35 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\components\ScrollablePanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */