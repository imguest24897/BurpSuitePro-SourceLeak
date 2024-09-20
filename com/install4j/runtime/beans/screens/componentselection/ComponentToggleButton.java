/*    */ package com.install4j.runtime.beans.screens.componentselection;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Graphics;
/*    */ import javax.swing.CellRendererPane;
/*    */ import javax.swing.Icon;
/*    */ 
/*    */ public class ComponentToggleButton extends JToggleButton {
/*  8 */   private static final Dimension SIZE = new Dimension(18, 18);
/*    */   
/*    */   private boolean fakeCellRendererParent = false;
/*    */   private CellRendererPane cellRendererPane;
/*    */   
/*    */   public ComponentToggleButton(Icon icon) {
/* 14 */     super(icon);
/* 15 */     setFocusPainted(false);
/*    */     
/* 17 */     setPreferredSize(SIZE);
/* 18 */     setSize(SIZE);
/* 19 */     setMinimumSize(SIZE);
/* 20 */     setMaximumSize(SIZE);
/* 21 */     setPreferredSize(SIZE);
/*    */     
/* 23 */     this.cellRendererPane = new CellRendererPane();
/* 24 */     setFocusable(false);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void paintComponent(Graphics g) {
/* 29 */     this.fakeCellRendererParent = true;
/*    */     try {
/* 31 */       super.paintComponent(g);
/*    */     } finally {
/* 33 */       this.fakeCellRendererParent = false;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public Container getParent() {
/* 39 */     if (this.fakeCellRendererParent) {
/* 40 */       return this.cellRendererPane;
/*    */     }
/* 42 */     return super.getParent();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\componentselection\ComponentToggleButton.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */