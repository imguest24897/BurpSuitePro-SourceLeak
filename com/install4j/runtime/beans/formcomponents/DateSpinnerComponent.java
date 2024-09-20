/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.screens.Console;
/*    */ import java.text.ParseException;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ import javax.swing.JSpinner;
/*    */ import javax.swing.SpinnerDateModel;
/*    */ import javax.swing.SpinnerModel;
/*    */ 
/*    */ public class DateSpinnerComponent extends SpinnerComponent {
/* 13 */   private String dateFormatPattern = "";
/*    */   private Date initialValue;
/*    */   
/*    */   public String getDateFormatPattern() {
/* 17 */     return replaceVariables(this.dateFormatPattern);
/*    */   }
/*    */   
/*    */   public void setDateFormatPattern(String dateFormatPattern) {
/* 21 */     this.dateFormatPattern = dateFormatPattern;
/*    */   }
/*    */   
/*    */   public Date getInitialValue() {
/* 25 */     return (Date)replaceWithTextOverride("initialValue", this.initialValue, Date.class);
/*    */   }
/*    */   
/*    */   public void setInitialValue(Date initialValue) {
/* 29 */     this.initialValue = initialValue;
/*    */   }
/*    */ 
/*    */   
/*    */   protected SpinnerModel createSpinnerModel() {
/* 34 */     SpinnerDateModel model = new SpinnerDateModel();
/* 35 */     initValue(model);
/* 36 */     return model;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void adjustEditor(JSpinner spinner) {
/* 41 */     if (getDateFormatPattern().trim().length() > 0) {
/* 42 */       spinner.setEditor(new JSpinner.DateEditor(spinner, getDateFormatPattern()));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected void initValue(SpinnerModel model) {
/* 48 */     Date initValue = (Date)getInitValue(getInitialValue(), getVariableName(), Date.class);
/* 49 */     if (initValue != null) {
/* 50 */       model.setValue(initValue);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 56 */     JSpinner spinner = getSpinner();
/* 57 */     SpinnerDateModel model = (SpinnerDateModel)spinner.getModel();
/* 58 */     JSpinner.DateEditor editor = (JSpinner.DateEditor)spinner.getEditor();
/* 59 */     SimpleDateFormat format = editor.getFormat();
/*    */     
/* 61 */     boolean oldLenient = format.isLenient();
/* 62 */     format.setLenient(false);
/*    */     
/* 64 */     Object oldValue = model.getValue();
/*    */     while (true) {
/* 66 */       model.setValue(oldValue);
/*    */       
/* 68 */       String res = console.askString(getConsoleLabelText(true) + " [" + format
/* 69 */           .toLocalizedPattern() + "]", editor
/* 70 */           .getTextField().getText());
/*    */       
/*    */       try {
/* 73 */         Date date = format.parse(res);
/* 74 */         model.setValue(date);
/*    */         
/* 76 */         format.setLenient(oldLenient);
/* 77 */         return true;
/* 78 */       } catch (ParseException parseException) {}
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\DateSpinnerComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */