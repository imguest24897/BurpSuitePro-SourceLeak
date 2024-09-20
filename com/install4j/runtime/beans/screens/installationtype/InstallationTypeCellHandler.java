/*    */ package com.install4j.runtime.beans.screens.installationtype;
/*    */ 
/*    */ import com.install4j.runtime.beans.screens.componentselection.ComponentCellHandler;
/*    */ import com.install4j.runtime.beans.screens.componentselection.ComponentRadioButton;
/*    */ import javax.swing.JRadioButton;
/*    */ import javax.swing.JToggleButton;
/*    */ import javax.swing.UIManager;
/*    */ import javax.swing.tree.DefaultTreeCellRenderer;
/*    */ 
/*    */ public class InstallationTypeCellHandler extends ComponentCellHandler {
/* 11 */   private static final int RADIO_BUTTON_WIDTH = ((new JRadioButton()).getPreferredSize()).width;
/*    */   
/*    */   public InstallationTypeCellHandler(InstallationTypeTree tree) {
/* 14 */     super(tree);
/*    */   }
/*    */ 
/*    */   
/*    */   protected JToggleButton createSelectionToggleButton() {
/* 19 */     return (JToggleButton)new ComponentRadioButton();
/*    */   }
/*    */ 
/*    */   
/*    */   public int getToggleButtonWidth() {
/* 24 */     return RADIO_BUTTON_WIDTH;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void customizeDefaultRenderer(DefaultTreeCellRenderer defaultRenderer) {
/* 29 */     defaultRenderer.setFont(UIManager.getFont("RadioButton.font").deriveFont(1));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\installationtype\InstallationTypeCellHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */