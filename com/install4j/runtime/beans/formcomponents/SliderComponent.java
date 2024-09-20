/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JSlider;
/*     */ 
/*     */ public class SliderComponent extends LeadingLabelComponent {
/*  11 */   private String variableName = "";
/*  12 */   private int minValue = 0;
/*  13 */   private int maxValue = 50;
/*  14 */   private int initialValue = 25;
/*  15 */   private int majorTickSpacing = 10;
/*  16 */   private int minorTickSpacing = 1;
/*     */   
/*     */   private boolean snapToTicks = true;
/*     */   private JSlider slider;
/*     */   
/*     */   public String getVariableName() {
/*  22 */     return replaceVariables(this.variableName);
/*     */   }
/*     */   
/*     */   public void setVariableName(String variableName) {
/*  26 */     this.variableName = variableName;
/*     */   }
/*     */   
/*     */   public int getMinValue() {
/*  30 */     return replaceWithTextOverride("minValue", this.minValue);
/*     */   }
/*     */   
/*     */   public void setMinValue(int minValue) {
/*  34 */     this.minValue = minValue;
/*     */   }
/*     */   
/*     */   public int getMaxValue() {
/*  38 */     return replaceWithTextOverride("maxValue", this.maxValue);
/*     */   }
/*     */   
/*     */   public void setMaxValue(int maxValue) {
/*  42 */     this.maxValue = maxValue;
/*     */   }
/*     */   
/*     */   public int getInitialValue() {
/*  46 */     return replaceWithTextOverride("initialValue", this.initialValue);
/*     */   }
/*     */   
/*     */   public void setInitialValue(int initialValue) {
/*  50 */     this.initialValue = initialValue;
/*     */   }
/*     */   
/*     */   public int getMajorTickSpacing() {
/*  54 */     return replaceWithTextOverride("majorTickSpacing", this.majorTickSpacing);
/*     */   }
/*     */   
/*     */   public void setMajorTickSpacing(int majorTickSpacing) {
/*  58 */     this.majorTickSpacing = majorTickSpacing;
/*     */   }
/*     */   
/*     */   public int getMinorTickSpacing() {
/*  62 */     return replaceWithTextOverride("minorTickSpacing", this.minorTickSpacing);
/*     */   }
/*     */   
/*     */   public void setMinorTickSpacing(int minorTickSpacing) {
/*  66 */     this.minorTickSpacing = minorTickSpacing;
/*     */   }
/*     */   
/*     */   public boolean isSnapToTicks() {
/*  70 */     return replaceWithTextOverride("snapToTicks", this.snapToTicks);
/*     */   }
/*     */   
/*     */   public void setSnapToTicks(boolean snapToTicks) {
/*  74 */     this.snapToTicks = snapToTicks;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/*  79 */     super.setFormEnvironment(formEnvironment);
/*  80 */     if (this.slider != null && formEnvironment != null) {
/*  81 */       this.slider.setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  87 */     int initValue = ((Integer)getInitValue(Integer.valueOf(getInitialValue()), getVariableName(), Integer.class)).intValue();
/*  88 */     this.slider = new JSlider(0, getMinValue(), getMaxValue(), initValue);
/*  89 */     this.slider.setPaintLabels(true);
/*  90 */     this.slider.setPaintTicks(true);
/*     */     
/*  92 */     this.slider.setMajorTickSpacing(getMajorTickSpacing());
/*  93 */     this.slider.setMinorTickSpacing(getMinorTickSpacing());
/*  94 */     this.slider.setSnapToTicks(isSnapToTicks());
/*  95 */     this.slider.setAlignmentX(0.0F);
/*  96 */     return this.slider;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 101 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/* 106 */     return this.slider;
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/* 111 */     return JSlider.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/* 116 */     getContext().setVariable(getVariableName(), Integer.valueOf(this.slider.getValue()));
/* 117 */     getContext().registerResponseFileVariable(getVariableName());
/* 118 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/*     */     while (true) {
/* 125 */       String res = console.askString(getConsoleLabelText(false) + " [" + this.slider
/* 126 */           .getMinimum() + "-" + this.slider.getMaximum() + "]", 
/* 127 */           String.valueOf(this.slider.getValue()));
/*     */       try {
/* 129 */         int value = Integer.parseInt(res);
/* 130 */         if (value >= this.slider.getMinimum() && value <= this.slider.getMaximum()) {
/* 131 */           this.slider.setValue(value);
/* 132 */           return true;
/*     */         } 
/* 134 */       } catch (NumberFormatException numberFormatException) {}
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\SliderComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */