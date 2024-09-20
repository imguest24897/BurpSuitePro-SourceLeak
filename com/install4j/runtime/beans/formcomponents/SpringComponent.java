/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ public class SpringComponent extends SystemFormComponent {
/*  7 */   private AxisType axisType = AxisType.HORIZONTAL;
/*    */   
/*    */   public AxisType getAxisType() {
/* 10 */     return (AxisType)replaceWithTextOverride("axisType", this.axisType, AxisType.class);
/*    */   }
/*    */   
/*    */   public void setAxisType(AxisType axisType) {
/* 14 */     this.axisType = axisType;
/*    */   }
/*    */ 
/*    */   
/*    */   public JComponent createCenterComponent() {
/* 19 */     return new JPanel();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFillCenterHorizontal() {
/* 24 */     return (getAxisType() == AxisType.HORIZONTAL);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFillCenterVertical() {
/* 29 */     return (getAxisType() == AxisType.VERTICAL);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasUserInput() {
/* 34 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\SpringComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */