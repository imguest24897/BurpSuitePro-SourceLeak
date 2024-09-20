/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JSpinner;
/*     */ import javax.swing.SpinnerModel;
/*     */ import javax.swing.event.ChangeEvent;
/*     */ import javax.swing.event.ChangeListener;
/*     */ 
/*     */ public abstract class SpinnerComponent extends LeadingLabelComponent implements ChangeListener {
/*  14 */   private String variableName = "";
/*     */   private JSpinner spinner;
/*     */   private ScriptProperty valueChangedScript;
/*     */   
/*     */   public String getVariableName() {
/*  19 */     return replaceVariables(this.variableName);
/*     */   }
/*     */   
/*     */   public void setVariableName(String variableName) {
/*  23 */     this.variableName = variableName;
/*     */   }
/*     */   
/*     */   public ScriptProperty getValueChangedScript() {
/*  27 */     return (ScriptProperty)replaceWithTextOverride("valueChangedScript", this.valueChangedScript, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setValueChangedScript(ScriptProperty valueChangedScript) {
/*  31 */     this.valueChangedScript = valueChangedScript;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/*  36 */     super.setFormEnvironment(formEnvironment);
/*  37 */     if (this.spinner != null && formEnvironment != null) {
/*  38 */       this.spinner.setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  44 */     this.spinner = new JSpinner(createSpinnerModel());
/*  45 */     adjustEditor(this.spinner);
/*  46 */     this.spinner.setAlignmentX(0.0F);
/*  47 */     return this.spinner;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void adjustEditor(JSpinner spinner) {}
/*     */ 
/*     */   
/*     */   public void initialize() {
/*  56 */     this.spinner.removeChangeListener(this);
/*  57 */     super.initialize();
/*  58 */     initValue(this.spinner.getModel());
/*  59 */     this.spinner.addChangeListener(this);
/*  60 */     valueChanged();
/*     */   }
/*     */   
/*     */   protected abstract void initValue(SpinnerModel paramSpinnerModel);
/*     */   
/*     */   protected JSpinner getSpinner() {
/*  66 */     return this.spinner;
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract SpinnerModel createSpinnerModel();
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/*  73 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/*  78 */     return this.spinner;
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/*  83 */     return JSpinner.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/*  88 */     getContext().setVariable(getVariableName(), this.spinner.getValue());
/*  89 */     getContext().registerResponseFileVariable(getVariableName());
/*  90 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void stateChanged(ChangeEvent e) {
/*  95 */     valueChanged();
/*     */   }
/*     */   
/*     */   private void valueChanged() {
/*  99 */     if (getValueChangedScript() != null)
/*     */       try {
/* 101 */         getContext().runScript(getValueChangedScript(), (Bean)this, new Object[] { getFormEnvironment(), this.spinner.getValue() });
/* 102 */       } catch (Exception e) {
/* 103 */         Util.printAnnotatedStackTrace(e);
/* 104 */         Logger.getInstance().log(e);
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\SpinnerComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */