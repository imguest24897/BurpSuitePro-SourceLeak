/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.screens.Console;
/*    */ import java.awt.Dimension;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ public class SpacerComponent
/*    */   extends SystemFormComponent {
/* 11 */   private int height = 10;
/*    */   
/*    */   public int getHeight() {
/* 14 */     return replaceWithTextOverride("height", this.height);
/*    */   }
/*    */   
/*    */   public void setHeight(int height) {
/* 18 */     this.height = height;
/*    */   }
/*    */ 
/*    */   
/*    */   public JComponent createCenterComponent() {
/* 23 */     JPanel panel = new JPanel();
/* 24 */     panel.setOpaque(false);
/* 25 */     panel.setPreferredSize(new Dimension(0, getHeight()));
/* 26 */     return panel;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFillCenterHorizontal() {
/* 31 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasUserInput() {
/* 36 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 41 */     console.println();
/* 42 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\SpacerComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */