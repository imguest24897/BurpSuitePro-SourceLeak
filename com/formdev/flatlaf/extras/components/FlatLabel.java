/*    */ package com.formdev.flatlaf.extras.components;
/*    */ 
/*    */ import javax.swing.JLabel;
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
/*    */ public class FlatLabel
/*    */   extends JLabel
/*    */   implements FlatComponentExtension, FlatStyleableComponent
/*    */ {
/*    */   public enum LabelType
/*    */   {
/* 33 */     h00, h0, h1, h2, h3, h4, large, regular, medium, small, mini, monospaced;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public LabelType getLabelType() {
/* 39 */     return getClientPropertyEnumString("FlatLaf.styleClass", LabelType.class, null, LabelType.regular);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setLabelType(LabelType labelType) {
/* 46 */     if (labelType == LabelType.regular)
/* 47 */       labelType = null; 
/* 48 */     putClientPropertyEnumString("FlatLaf.styleClass", labelType);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\extras\components\FlatLabel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */