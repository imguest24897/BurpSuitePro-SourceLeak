/*    */ package com.install4j.runtime.util;
/*    */ import java.awt.Component;
/*    */ import java.awt.Container;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Insets;
/*    */ import java.awt.LayoutManager;
/*    */ 
/*    */ public class ButtonBoxLayout implements LayoutManager {
/*    */   public ButtonBoxLayout(int gap) {
/* 10 */     this.gap = gap;
/*    */   }
/*    */ 
/*    */   
/*    */   private int gap;
/*    */   
/*    */   public void addLayoutComponent(String string, Component comp) {}
/*    */   
/*    */   public void layoutContainer(Container container) {
/* 19 */     Insets insets = container.getInsets();
/* 20 */     Component[] children = container.getComponents();
/*    */ 
/*    */     
/* 23 */     int maxWidth = 0;
/* 24 */     int maxHeight = 0;
/* 25 */     int visibleCount = 0;
/*    */ 
/*    */     
/* 28 */     for (Component child : children) {
/* 29 */       if (child.isVisible()) {
/* 30 */         Dimension componentPreferredSize = child.getPreferredSize();
/* 31 */         maxWidth = Math.max(maxWidth, componentPreferredSize.width);
/* 32 */         maxHeight = Math.max(maxHeight, componentPreferredSize.height);
/* 33 */         visibleCount++;
/*    */       } 
/*    */     } 
/*    */     
/* 37 */     int usedWidth = maxWidth * visibleCount + this.gap * (visibleCount - 1);
/*    */     
/* 39 */     for (int i = 0, c = children.length; i < c; i++) {
/* 40 */       if (children[i].isVisible()) {
/* 41 */         children[i].setBounds(container
/* 42 */             .getWidth() - insets.right - usedWidth + (maxWidth + this.gap) * i, insets.top, maxWidth, maxHeight);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Dimension minimumLayoutSize(Container c) {
/* 55 */     return preferredLayoutSize(c);
/*    */   }
/*    */ 
/*    */   
/*    */   public Dimension preferredLayoutSize(Container container) {
/* 60 */     Insets insets = container.getInsets();
/* 61 */     Component[] children = container.getComponents();
/*    */ 
/*    */     
/* 64 */     int maxWidth = 0;
/* 65 */     int maxHeight = 0;
/* 66 */     int visibleCount = 0;
/*    */ 
/*    */     
/* 69 */     for (Component child : children) {
/* 70 */       if (child.isVisible()) {
/* 71 */         Dimension componentPreferredSize = child.getPreferredSize();
/* 72 */         maxWidth = Math.max(maxWidth, componentPreferredSize.width);
/* 73 */         maxHeight = Math.max(maxHeight, componentPreferredSize.height);
/* 74 */         visibleCount++;
/*    */       } 
/*    */     } 
/*    */     
/* 78 */     int usedWidth = maxWidth * visibleCount + this.gap * (visibleCount - 1);
/*    */     
/* 80 */     return new Dimension(insets.left + usedWidth + insets.right, insets.top + maxHeight + insets.bottom);
/*    */   }
/*    */   
/*    */   public void removeLayoutComponent(Component c) {}
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\ButtonBoxLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */