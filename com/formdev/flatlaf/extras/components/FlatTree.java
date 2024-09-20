/*    */ package com.formdev.flatlaf.extras.components;
/*    */ 
/*    */ import javax.swing.JTree;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FlatTree
/*    */   extends JTree
/*    */   implements FlatComponentExtension, FlatStyleableComponent
/*    */ {
/*    */   public boolean isWideSelection() {
/* 35 */     return getClientPropertyBoolean("JTree.wideSelection", "Tree.wideSelection");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setWideSelection(boolean wideSelection) {
/* 42 */     putClientProperty("JTree.wideSelection", Boolean.valueOf(wideSelection));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isPaintSelection() {
/* 50 */     return getClientPropertyBoolean("JTree.paintSelection", true);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setPaintSelection(boolean paintSelection) {
/* 58 */     putClientProperty("JTree.paintSelection", Boolean.valueOf(paintSelection));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\extras\components\FlatTree.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */