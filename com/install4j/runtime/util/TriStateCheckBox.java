/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import com.install4j.api.laf.IndeterminateStateComponent;
/*    */ import java.awt.AlphaComposite;
/*    */ import java.awt.Composite;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.MouseListener;
/*    */ import javax.swing.JCheckBox;
/*    */ 
/*    */ public abstract class TriStateCheckBox extends JCheckBox implements IndeterminateStateComponent {
/*    */   private boolean indeterminate;
/*    */   
/*    */   public TriStateCheckBox() {
/* 16 */     setOpaque(false);
/* 17 */     this.indeterminateCheckbox = new InternalCheckBox();
/* 18 */     this.indeterminateCheckbox.setOpaque(false);
/*    */     
/* 20 */     this.model.addActionListener(e -> {
/*    */           if (this.indeterminate && !this.model.isSelected()) {
/*    */             this.indeterminate = false;
/*    */             setSelected(true);
/*    */           } 
/*    */           this.indeterminate = false;
/*    */         });
/*    */   }
/*    */   private InternalCheckBox indeterminateCheckbox;
/*    */   protected InternalCheckBox getIndeterminateCheckbox() {
/* 30 */     return this.indeterminateCheckbox;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFocusable() {
/* 35 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setSelected(boolean selected) {
/* 40 */     this.indeterminate = false;
/* 41 */     super.setSelected(selected);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setIndeterminate(boolean indeterminate) {
/* 46 */     this.indeterminate = indeterminate;
/*    */   }
/*    */   
/*    */   protected boolean isIndeterminate() {
/* 50 */     return this.indeterminate;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void paintComponent(Graphics g) {
/* 55 */     super.paintComponent(g);
/* 56 */     if (isIndeterminate() && this.model.isEnabled() && !this.model.isArmed()) {
/* 57 */       Graphics2D graphics = (Graphics2D)g;
/* 58 */       Composite oldComposite = graphics.getComposite();
/* 59 */       graphics.setComposite(AlphaComposite.getInstance(3, getAlpha()));
/* 60 */       InternalCheckBox indeterminateCheckbox = getIndeterminateCheckbox();
/* 61 */       indeterminateCheckbox.setBounds(getBounds());
/* 62 */       indeterminateCheckbox.paintComponent(g);
/* 63 */       graphics.setComposite(oldComposite);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected abstract float getAlpha();
/*    */   
/*    */   protected static class InternalCheckBox
/*    */     extends JCheckBox {
/*    */     public InternalCheckBox() {
/* 72 */       setSelected(true);
/*    */     }
/*    */ 
/*    */     
/*    */     protected void paintComponent(Graphics g) {
/* 77 */       super.paintComponent(g);
/*    */     }
/*    */     
/*    */     public synchronized void addMouseListener(MouseListener l) {}
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\TriStateCheckBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */