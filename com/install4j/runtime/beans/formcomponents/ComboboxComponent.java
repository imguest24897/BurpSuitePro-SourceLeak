/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.beans.ScriptProperty;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.formcomponents.FormComponent;
/*    */ import com.install4j.api.screens.Console;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import javax.swing.InputVerifier;
/*    */ import javax.swing.JComboBox;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.SwingUtilities;
/*    */ 
/*    */ public class ComboboxComponent extends DropdownListComponent implements TextComponentUtil.InputVerifierParameterProvider {
/*    */   public ScriptProperty getInputVerifier() {
/* 15 */     return (ScriptProperty)replaceWithTextOverride("inputVerifier", this.inputVerifier, ScriptProperty.class);
/*    */   }
/*    */   private ScriptProperty inputVerifier;
/*    */   public void setInputVerifier(ScriptProperty inputVerifier) {
/* 19 */     this.inputVerifier = inputVerifier;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void applyComboBoxProperties(JComboBox comboBox) {
/* 24 */     super.applyComboBoxProperties(comboBox);
/*    */     
/* 26 */     comboBox.setEditable(true);
/*    */     
/* 28 */     Object varValue = getContext().getVariable(getVariableName());
/* 29 */     if (varValue instanceof String) {
/* 30 */       comboBox.setSelectedItem(varValue);
/*    */     }
/*    */     
/* 33 */     TextComponentUtil.addInputVerifier(this, getInputVerifier(), (JComponent)comboBox.getEditor().getEditorComponent(), this);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean checkCompleted() {
/* 38 */     JComboBox<String> comboBox = getComboBox();
/* 39 */     InputVerifier inputVerifier = ((JComponent)comboBox.getEditor().getEditorComponent()).getInputVerifier();
/* 40 */     if (inputVerifier != null && !inputVerifier.verify(comboBox)) {
/* 41 */       if (!InstallerUtil.isUnattended() && !InstallerUtil.isConsole()) {
/* 42 */         SwingUtilities.invokeLater(() -> {
/*    */               getFormEnvironment().makeParentGroupVisible((FormComponent)this);
/*    */               comboBox.requestFocus();
/*    */             });
/*    */       }
/* 47 */       return false;
/*    */     } 
/*    */     
/* 50 */     Object selectedItem = getComboBox().getSelectedItem();
/* 51 */     getContext().setVariable(getVariableName(), (selectedItem != null) ? selectedItem.toString() : null);
/* 52 */     getContext().registerResponseFileVariable(getVariableName());
/* 53 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean getInitialFillHorizontal() {
/* 58 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object[] createInputVerifierParameters() {
/* 63 */     return new Object[] { getFormEnvironment(), getComboBox().getEditor().getItem() };
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 68 */     JComboBox<String> comboBox = getComboBox();
/* 69 */     InputVerifier inputVerifier = ((JComponent)comboBox.getEditor().getEditorComponent()).getInputVerifier();
/* 70 */     Object oldValue = comboBox.getSelectedItem();
/*    */     do {
/* 72 */       comboBox.setSelectedItem(oldValue);
/* 73 */       String newValue = console.askString(getConsoleLabelText(false), (oldValue == null) ? null : oldValue.toString());
/* 74 */       comboBox.setSelectedItem(newValue);
/* 75 */     } while (inputVerifier != null && !inputVerifier.verify(comboBox));
/*    */     
/* 77 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\ComboboxComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */