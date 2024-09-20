/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import java.text.DateFormat;
/*    */ import java.text.Format;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ import javax.swing.JFormattedTextField;
/*    */ import javax.swing.text.DateFormatter;
/*    */ import javax.swing.text.DefaultFormatter;
/*    */ import javax.swing.text.JTextComponent;
/*    */ 
/*    */ public class DateTextfieldComponent
/*    */   extends FormattedTextfieldComponent {
/* 14 */   private DateType dateType = DateType.DATE;
/* 15 */   private int dateStyle = 3;
/* 16 */   private int timeStyle = 3;
/* 17 */   private Date initialValue = null;
/*    */   
/*    */   public DateType getDateType() {
/* 20 */     return (DateType)replaceWithTextOverride("dateType", this.dateType, DateType.class);
/*    */   }
/*    */   
/*    */   public void setDateType(DateType dateType) {
/* 24 */     this.dateType = dateType;
/*    */   }
/*    */   
/*    */   public int getDateStyle() {
/* 28 */     return replaceWithTextOverride("dateStyle", this.dateStyle);
/*    */   }
/*    */   
/*    */   public void setDateStyle(int dateStyle) {
/* 32 */     this.dateStyle = dateStyle;
/*    */   }
/*    */   
/*    */   public int getTimeStyle() {
/* 36 */     return replaceWithTextOverride("timeStyle", this.timeStyle);
/*    */   }
/*    */   
/*    */   public void setTimeStyle(int timeStyle) {
/* 40 */     this.timeStyle = timeStyle;
/*    */   }
/*    */   
/*    */   public Date getInitialValue() {
/* 44 */     return (Date)replaceWithTextOverride("initialValue", this.initialValue, Date.class);
/*    */   }
/*    */   
/*    */   public void setInitialValue(Date initialValue) {
/* 48 */     this.initialValue = initialValue;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected DefaultFormatter createFormatter() {
/*    */     DateFormat dateFormat;
/* 55 */     if (getDateType() == DateType.DATE) {
/* 56 */       dateFormat = DateFormat.getDateInstance(getDateStyle());
/* 57 */     } else if (getDateType() == DateType.TIME) {
/* 58 */       dateFormat = DateFormat.getTimeInstance(getTimeStyle());
/* 59 */     } else if (getDateType() == DateType.DATETIME) {
/* 60 */       dateFormat = DateFormat.getDateTimeInstance(getDateStyle(), getTimeStyle());
/*    */     } else {
/* 62 */       dateFormat = DateFormat.getDateInstance();
/*    */     } 
/*    */     
/* 65 */     return new DateFormatter(dateFormat);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void initText(JTextComponent textComponent) {
/* 70 */     JFormattedTextField textField = (JFormattedTextField)textComponent;
/* 71 */     Object initValue = getInitValue(getInitialValue(), getVariableName(), Date.class);
/* 72 */     if (initValue == null) {
/* 73 */       textField.setValue(new Date());
/*    */     } else {
/* 75 */       textField.setValue(initValue);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected String getFormatDescription() {
/* 81 */     JFormattedTextField textField = (JFormattedTextField)getTextComponent();
/* 82 */     Format format = ((DateFormatter)textField.getFormatter()).getFormat();
/* 83 */     if (format instanceof SimpleDateFormat) {
/* 84 */       return " [" + ((SimpleDateFormat)format).toLocalizedPattern() + "]";
/*    */     }
/* 86 */     return super.getFormatDescription();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\DateTextfieldComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */