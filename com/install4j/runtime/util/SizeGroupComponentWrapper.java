/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import java.awt.BorderLayout;
/*    */ import java.awt.Component;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.event.ComponentAdapter;
/*    */ import java.awt.event.ComponentEvent;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ public class SizeGroupComponentWrapper extends JPanel {
/*    */   private final JComponent component;
/*    */   private SizeGroup sizeGroup;
/*    */   
/*    */   public SizeGroupComponentWrapper(JComponent component) {
/* 16 */     this.component = component;
/*    */     
/* 18 */     component.addComponentListener(new ComponentAdapter()
/*    */         {
/*    */           public void componentShown(ComponentEvent e) {
/* 21 */             SizeGroupComponentWrapper.this.setVisible(true);
/*    */           }
/*    */ 
/*    */           
/*    */           public void componentHidden(ComponentEvent e) {
/* 26 */             SizeGroupComponentWrapper.this.setVisible(false);
/*    */           }
/*    */         });
/*    */     
/* 30 */     setLayout(new BorderLayout());
/* 31 */     add(component, "Center");
/* 32 */     setOpaque(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public Dimension getPreferredSize() {
/* 37 */     Dimension preferredSize = getIntrinsicPreferredSize();
/* 38 */     if (this.sizeGroup != null) {
/* 39 */       if (this.sizeGroup.isCommonWidth()) {
/* 40 */         preferredSize.width = this.sizeGroup.getCommonWidth();
/*    */       }
/* 42 */       if (this.sizeGroup.isCommonHeight()) {
/* 43 */         preferredSize.height = this.sizeGroup.getCommonHeight();
/*    */       }
/*    */     } 
/* 46 */     return preferredSize;
/*    */   }
/*    */   
/*    */   public Dimension getIntrinsicPreferredSize() {
/* 50 */     return this.component.getPreferredSize();
/*    */   }
/*    */   
/*    */   public void setSizeGroup(SizeGroup sizeGroup) {
/* 54 */     this.sizeGroup = sizeGroup;
/*    */   }
/*    */   
/*    */   protected JComponent getComponent() {
/* 58 */     return this.component;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getBaseline(int width, int height) {
/* 63 */     return getComponent().getBaseline(width, height);
/*    */   }
/*    */ 
/*    */   
/*    */   public Component.BaselineResizeBehavior getBaselineResizeBehavior() {
/* 68 */     return getComponent().getBaselineResizeBehavior();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\SizeGroupComponentWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */