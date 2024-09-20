/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JComponent;
/*     */ 
/*     */ public class CheckboxComponent extends LeadingLabelComponent implements CoupledComponentsHolder {
/*  18 */   private String variableName = "";
/*  19 */   private String checkboxText = "";
/*     */   private boolean initiallySelected;
/*  21 */   private List<String> coupledComponentIds = new ArrayList<>();
/*     */   
/*     */   private boolean inverseCoupling = false;
/*     */   private ScriptProperty selectionScript;
/*     */   private JCheckBox checkbox;
/*     */   
/*     */   public String getVariableName() {
/*  28 */     return replaceVariables(this.variableName);
/*     */   }
/*     */   
/*     */   public void setVariableName(String variableName) {
/*  32 */     this.variableName = variableName;
/*     */   }
/*     */   
/*     */   public String getCheckboxText() {
/*  36 */     return replaceVariables(replaceFormVariables(this.checkboxText, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setCheckboxText(String checkboxText) {
/*  40 */     this.checkboxText = checkboxText;
/*     */   }
/*     */   
/*     */   public boolean isInitiallySelected() {
/*  44 */     return replaceWithTextOverride("initiallySelected", this.initiallySelected);
/*     */   }
/*     */   
/*     */   public void setInitiallySelected(boolean initiallySelected) {
/*  48 */     this.initiallySelected = initiallySelected;
/*     */   }
/*     */   
/*     */   public ScriptProperty getSelectionScript() {
/*  52 */     return (ScriptProperty)replaceWithTextOverride("selectionScript", this.selectionScript, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setSelectionScript(ScriptProperty selectionScript) {
/*  56 */     this.selectionScript = selectionScript;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<String> getCoupledComponentIds() {
/*  61 */     return (List<String>)replaceWithTextOverride("coupledComponentIds", this.coupledComponentIds, List.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCoupledComponentIds(List<String> coupledComponentIds) {
/*  66 */     this.coupledComponentIds = coupledComponentIds;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isInverseCoupling() {
/*  71 */     return replaceWithTextOverride("inverseCoupling", this.inverseCoupling);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setInverseCoupling(boolean inverseCoupling) {
/*  76 */     this.inverseCoupling = inverseCoupling;
/*     */   }
/*     */ 
/*     */   
/*     */   public Boolean isEnableCoupledComponents() {
/*  81 */     if (this.checkbox == null) {
/*  82 */       return null;
/*     */     }
/*  84 */     return Boolean.valueOf(this.checkbox.isSelected());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/*  90 */     super.setEnabled(enabled);
/*  91 */     CoupledComponentsUtil.enableCoupledComponents(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void migrateIds(Map<String, String> oldIdToNewId) {
/*  96 */     super.migrateIds(oldIdToNewId);
/*     */     
/*  98 */     CoupledComponentsUtil.migrateCoupledIds(this, oldIdToNewId);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initialize() {
/* 103 */     super.initialize();
/* 104 */     if (getCheckboxText().trim().length() > 0) {
/* 105 */       this.checkbox.setText(getCheckboxText());
/*     */     }
/*     */ 
/*     */     
/* 109 */     if (((Boolean)getInitValue(Boolean.valueOf(isInitiallySelected()), getVariableName(), Boolean.class)).booleanValue()) {
/* 110 */       this.checkbox.setSelected(true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void formWillActivate() {
/* 116 */     super.formWillActivate();
/*     */     
/* 118 */     CoupledComponentsUtil.enableCoupledComponents(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 123 */     super.setFormEnvironment(formEnvironment);
/* 124 */     if (this.checkbox != null && formEnvironment != null) {
/* 125 */       this.checkbox.setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/* 131 */     this.checkbox = new JCheckBox();
/* 132 */     this.checkbox.setAlignmentX(0.0F);
/*     */     
/* 134 */     this.checkbox.addActionListener(event -> {
/*     */           CoupledComponentsUtil.enableCoupledComponents(this);
/*     */           
/*     */           executeSelectionScript();
/*     */         });
/* 139 */     return this.checkbox;
/*     */   }
/*     */   
/*     */   private void executeSelectionScript() {
/*     */     try {
/* 144 */       getContext().runScript(getSelectionScript(), (Bean)this, new Object[] { getFormEnvironment(), Boolean.valueOf(this.checkbox.isSelected()) });
/* 145 */     } catch (Exception e) {
/* 146 */       Util.printAnnotatedStackTrace(e);
/* 147 */       Logger.getInstance().log(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 153 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/* 158 */     return this.checkbox;
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/* 163 */     return JCheckBox.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/* 168 */     getContext().setVariable(getVariableName(), Boolean.valueOf(this.checkbox.isSelected()));
/* 169 */     getContext().registerResponseFileVariable(getVariableName());
/* 170 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 175 */     this.checkbox.setSelected(console.askYesNo(getConsoleLabelText(true) + 
/* 176 */           appendConditional(this.checkbox.getText(), "?", false), this.checkbox
/* 177 */           .isSelected()));
/* 178 */     CoupledComponentsUtil.enableCoupledComponents(this);
/* 179 */     executeSelectionScript();
/* 180 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleUnattended() {
/* 185 */     CoupledComponentsUtil.enableCoupledComponents(this);
/* 186 */     return super.handleUnattended();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\CheckboxComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */