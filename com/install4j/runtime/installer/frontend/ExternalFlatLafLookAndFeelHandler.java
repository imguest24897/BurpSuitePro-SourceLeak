/*    */ package com.install4j.runtime.installer.frontend;
/*    */ 
/*    */ import com.install4j.api.laf.IndeterminateStateComponent;
/*    */ import com.install4j.api.laf.LookAndFeelHandler;
/*    */ import javax.swing.JCheckBox;
/*    */ import javax.swing.JTree;
/*    */ import javax.swing.UIManager;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class ExternalFlatLafLookAndFeelHandler
/*    */   implements LookAndFeelHandler {
/*    */   public void applyLookAndFeel(boolean darkDesktop) throws Exception {
/* 13 */     throw new UnsupportedOperationException();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isDark() {
/* 18 */     return UIManager.getBoolean("laf.dark");
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public JCheckBox createTriStateCheckBox() {
/* 24 */     return new FlatLafTriStateCheckBox();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isWideTreeSelection() {
/* 29 */     return UIManager.getBoolean("Tree.wideSelection");
/*    */   }
/*    */ 
/*    */   
/*    */   public void disableExtraSelectionPainting(JTree tree) {
/* 34 */     tree.putClientProperty("JTree.paintSelection", Boolean.valueOf(false));
/*    */   }
/*    */   
/*    */   private static class FlatLafTriStateCheckBox
/*    */     extends JCheckBox implements IndeterminateStateComponent {
/*    */     public void setIndeterminate(boolean indeterminate) {
/* 40 */       putClientProperty("JButton.selectedState", indeterminate ? "indeterminate" : null);
/*    */     }
/*    */     private FlatLafTriStateCheckBox() {}
/*    */     
/*    */     public void setSelected(boolean selected) {
/* 45 */       setIndeterminate(false);
/* 46 */       super.setSelected(selected);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\ExternalFlatLafLookAndFeelHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */