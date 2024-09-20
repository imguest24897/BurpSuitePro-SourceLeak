/*    */ package com.install4j.runtime.util;
/*    */ import com.ejt.internal.gui.LookAndFeelChangeUtil;
/*    */ import java.awt.CardLayout;
/*    */ import java.awt.Component;
/*    */ import java.awt.Container;
/*    */ import java.awt.Insets;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.swing.JComponent;
/*    */ 
/*    */ public class CustomCardLayout extends CardLayout {
/* 12 */   private List<JComponent> components = new ArrayList<>();
/*    */   
/*    */   public CustomCardLayout() {
/* 15 */     LookAndFeelChangeUtil.onLookAndFeelChange(this, CustomCardLayout::updateComponentUIs);
/*    */   }
/*    */   
/*    */   private void updateComponentUIs() {
/* 19 */     for (JComponent component : this.components) {
/* 20 */       SwingUtilities.updateComponentTreeUI(component);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void addLayoutComponent(Component component, Object constraints) {
/* 26 */     super.addLayoutComponent(component, constraints);
/* 27 */     if (component instanceof JComponent) {
/* 28 */       this.components.add((JComponent)component);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void removeLayoutComponent(Component component) {
/* 34 */     super.removeLayoutComponent(component);
/* 35 */     if (component instanceof JComponent) {
/* 36 */       this.components.remove(component);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void layoutContainer(Container parent) {
/* 42 */     synchronized (parent.getTreeLock()) {
/* 43 */       int hgap = getHgap();
/* 44 */       int vgap = getVgap();
/*    */       
/* 46 */       Insets insets = parent.getInsets();
/* 47 */       int componentCount = parent.getComponentCount();
/* 48 */       for (int i = 0; i < componentCount; i++) {
/* 49 */         Component component = parent.getComponent(i);
/* 50 */         component.setBounds(hgap + insets.left, vgap + insets.top, parent
/* 51 */             .getWidth() - hgap * 2 + insets.left + insets.right, parent
/* 52 */             .getHeight() - vgap * 2 + insets.top + insets.bottom);
/*    */       } 
/* 54 */       super.layoutContainer(parent);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\CustomCardLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */