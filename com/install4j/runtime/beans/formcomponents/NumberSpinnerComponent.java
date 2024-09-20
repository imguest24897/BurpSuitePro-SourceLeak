/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.screens.Console;
/*    */ import javax.swing.JSpinner;
/*    */ import javax.swing.SpinnerModel;
/*    */ import javax.swing.SpinnerNumberModel;
/*    */ 
/*    */ public class NumberSpinnerComponent extends SpinnerComponent {
/* 10 */   private int minValue = 0;
/* 11 */   private int maxValue = 100;
/* 12 */   private int initialValue = 0;
/* 13 */   private int stepSize = 10;
/*    */   
/*    */   public int getMinValue() {
/* 16 */     return replaceWithTextOverride("minValue", this.minValue);
/*    */   }
/*    */   
/*    */   public void setMinValue(int minValue) {
/* 20 */     this.minValue = minValue;
/*    */   }
/*    */   
/*    */   public int getMaxValue() {
/* 24 */     return replaceWithTextOverride("maxValue", this.maxValue);
/*    */   }
/*    */   
/*    */   public void setMaxValue(int maxValue) {
/* 28 */     this.maxValue = maxValue;
/*    */   }
/*    */   
/*    */   public int getInitialValue() {
/* 32 */     return replaceWithTextOverride("initialValue", this.initialValue);
/*    */   }
/*    */   
/*    */   public void setInitialValue(int initialValue) {
/* 36 */     this.initialValue = initialValue;
/*    */   }
/*    */   
/*    */   public int getStepSize() {
/* 40 */     return replaceWithTextOverride("stepSize", this.stepSize);
/*    */   }
/*    */   
/*    */   public void setStepSize(int stepSize) {
/* 44 */     this.stepSize = stepSize;
/*    */   }
/*    */ 
/*    */   
/*    */   protected SpinnerModel createSpinnerModel() {
/* 49 */     int initValue = ((Integer)getInitValue(Integer.valueOf(getInitialValue()), getVariableName(), Integer.class)).intValue();
/* 50 */     return new SpinnerNumberModel(initValue, getMinValue(), getMaxValue(), getStepSize());
/*    */   }
/*    */ 
/*    */   
/*    */   protected void initValue(SpinnerModel model) {
/* 55 */     model.setValue(getInitValue(Integer.valueOf(getInitialValue()), getVariableName(), Integer.class));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 60 */     JSpinner spinner = getSpinner();
/* 61 */     SpinnerNumberModel model = (SpinnerNumberModel)spinner.getModel();
/*    */     
/*    */     while (true) {
/* 64 */       String res = console.askString(getConsoleLabelText(false) + " [" + model
/* 65 */           .getMinimum() + "-" + model.getMaximum() + "]", 
/* 66 */           String.valueOf(model.getValue()));
/*    */       try {
/* 68 */         Integer value = Integer.valueOf(res);
/* 69 */         if (value.compareTo((Integer)model.getMinimum()) >= 0 && value.compareTo((Integer)model.getMaximum()) <= 0) {
/* 70 */           model.setValue(value);
/* 71 */           return true;
/*    */         } 
/* 73 */       } catch (NumberFormatException numberFormatException) {}
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\NumberSpinnerComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */