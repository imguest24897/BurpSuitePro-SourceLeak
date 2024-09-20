/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.ejt.internal.gui.KeyboardUtil;
/*    */ import com.install4j.api.context.ControlButtonType;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.event.ActionEvent;
/*    */ import javax.swing.JTextField;
/*    */ import javax.swing.text.JTextComponent;
/*    */ 
/*    */ public class TextfieldComponent
/*    */   extends TextComponent
/*    */ {
/* 13 */   private int columns = 0;
/*    */   private boolean enterGoesToNextScreen;
/*    */   
/*    */   public int getColumns() {
/* 17 */     return replaceWithTextOverride("columns", this.columns);
/*    */   }
/*    */   
/*    */   public void setColumns(int columns) {
/* 21 */     this.columns = columns;
/*    */   }
/*    */   
/*    */   public boolean isEnterGoesToNextScreen() {
/* 25 */     return replaceWithTextOverride("enterGoesToNextScreen", this.enterGoesToNextScreen);
/*    */   }
/*    */   
/*    */   public void setEnterGoesToNextScreen(boolean enterGoesToNextScreen) {
/* 29 */     this.enterGoesToNextScreen = enterGoesToNextScreen;
/*    */   }
/*    */ 
/*    */   
/*    */   protected JTextComponent createTextComponent() {
/* 34 */     JTextField textField = new JTextField()
/*    */       {
/*    */         public Dimension getMinimumSize() {
/* 37 */           return getPreferredSize();
/*    */         }
/*    */       };
/*    */     
/* 41 */     applyTextFieldProperties(textField);
/* 42 */     return textField;
/*    */   }
/*    */   
/*    */   protected void applyTextFieldProperties(JTextField textField) {
/* 46 */     if (getColumns() > 0) {
/* 47 */       textField.setColumns(getColumns());
/* 48 */       Dimension preferredSize = textField.getPreferredSize();
/* 49 */       textField.setMinimumSize(preferredSize);
/* 50 */       textField.setMaximumSize(preferredSize);
/*    */     } 
/* 52 */     if (isEnterGoesToNextScreen()) {
/* 53 */       KeyboardUtil.addAccelerator(0, textField, textField, event -> getContext().getWizardContext().pressControlButton(ControlButtonType.NEXT), 10, 0);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isFillCenterHorizontal() {
/* 61 */     return (getColumns() == 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public Class getConfigurationObjectClass() {
/* 66 */     return JTextField.class;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\TextfieldComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */