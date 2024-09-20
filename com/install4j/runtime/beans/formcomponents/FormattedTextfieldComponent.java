/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Console;
/*     */ import java.awt.Dimension;
/*     */ import java.text.ParseException;
/*     */ import javax.swing.InputVerifier;
/*     */ import javax.swing.JFormattedTextField;
/*     */ import javax.swing.text.DefaultFormatter;
/*     */ import javax.swing.text.DefaultFormatterFactory;
/*     */ import javax.swing.text.JTextComponent;
/*     */ 
/*     */ 
/*     */ public abstract class FormattedTextfieldComponent
/*     */   extends TextfieldComponent
/*     */ {
/*     */   protected JTextComponent createTextComponent() {
/*  18 */     JFormattedTextField textField = new JFormattedTextField()
/*     */       {
/*     */         public Dimension getMinimumSize() {
/*  21 */           return getPreferredSize();
/*     */         }
/*     */       };
/*  24 */     updateFormatter(textField);
/*  25 */     applyTextFieldProperties(textField);
/*     */     
/*  27 */     return textField;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void initText(JTextComponent textComponent) {
/*  32 */     JFormattedTextField textField = (JFormattedTextField)textComponent;
/*  33 */     updateFormatter(textField);
/*  34 */     super.initText(textComponent);
/*  35 */     Object initValue = getInitValue(getInitialText(), getVariableName(), Object.class);
/*  36 */     if (initValue != null && initValue.toString().length() > 0) {
/*     */       try {
/*  38 */         textField.commitEdit();
/*  39 */         textField.setValue(textField.getValue());
/*  40 */       } catch (Exception e) {
/*  41 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/*  48 */     JFormattedTextField textField = (JFormattedTextField)getTextComponent();
/*     */     try {
/*  50 */       textField.commitEdit();
/*  51 */     } catch (ParseException parseException) {}
/*     */     
/*  53 */     return super.checkCompleted();
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract DefaultFormatter createFormatter();
/*     */   
/*     */   public Object[] createInputVerifierParameters() {
/*  60 */     return new Object[] { getFormEnvironment(), Boolean.valueOf(isInputValid()), getTextComponent().getText() };
/*     */   }
/*     */   
/*     */   private boolean isInputValid() {
/*  64 */     JFormattedTextField textField = (JFormattedTextField)getTextComponent();
/*  65 */     JFormattedTextField.AbstractFormatter formatter = textField.getFormatter();
/*  66 */     if (formatter != null) {
/*     */       try {
/*  68 */         formatter.stringToValue(textField.getText());
/*  69 */       } catch (ParseException pe) {
/*  70 */         return false;
/*     */       } 
/*     */     }
/*  73 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Object getValue() {
/*  78 */     return ((JFormattedTextField)getTextComponent()).getValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/*  83 */     return JFormattedTextField.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/*  88 */     JFormattedTextField textField = (JFormattedTextField)getTextComponent();
/*  89 */     String oldText = textField.getText();
/*  90 */     Object oldValue = textField.getValue();
/*     */     while (true) {
/*  92 */       textField.setText(oldText);
/*  93 */       textField.setValue(oldValue);
/*  94 */       String newValue = console.askString(getConsoleLabelText(false) + getFormatDescription(), (oldText == null) ? null : oldText);
/*  95 */       textField.setText(newValue);
/*     */       try {
/*  97 */         textField.commitEdit();
/*  98 */       } catch (ParseException e) {
/*     */         continue;
/*     */       } 
/*     */       
/* 102 */       InputVerifier inputVerifier = textField.getInputVerifier();
/*     */       try {
/* 104 */         if (inputVerifier == null)
/* 105 */           return true; 
/* 106 */         if (inputVerifier.verify(textField)) {
/* 107 */           textField.commitEdit();
/* 108 */           return true;
/*     */         } 
/* 110 */       } catch (ParseException parseException) {}
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected String getFormatDescription() {
/* 117 */     return "";
/*     */   }
/*     */   
/*     */   private void updateFormatter(JFormattedTextField textField) {
/* 121 */     textField.setFormatterFactory(new DefaultFormatterFactory(createFormatter()));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\FormattedTextfieldComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */