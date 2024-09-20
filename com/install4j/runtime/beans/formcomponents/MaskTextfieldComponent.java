/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import java.text.ParseException;
/*    */ import javax.swing.JFormattedTextField;
/*    */ import javax.swing.text.DefaultFormatter;
/*    */ import javax.swing.text.MaskFormatter;
/*    */ 
/*    */ public class MaskTextfieldComponent
/*    */   extends FormattedTextfieldComponent
/*    */ {
/* 12 */   private String inputMask = "###-##-####";
/* 13 */   private String placeholderCharacter = "0";
/*    */   private boolean valueContainsLiteralCharacters = true;
/* 15 */   private String validCharacters = "";
/* 16 */   private String invalidCharacters = "";
/*    */   private boolean allowsInvalid = false;
/*    */   
/*    */   public String getInputMask() {
/* 20 */     return replaceVariables(this.inputMask);
/*    */   }
/*    */   
/*    */   public void setInputMask(String inputMask) {
/* 24 */     this.inputMask = inputMask;
/*    */   }
/*    */   
/*    */   public String getPlaceholderCharacter() {
/* 28 */     return replaceVariables(this.placeholderCharacter);
/*    */   }
/*    */   
/*    */   public boolean isValueContainsLiteralCharacters() {
/* 32 */     return replaceWithTextOverride("valueContainsLiteralCharacters", this.valueContainsLiteralCharacters);
/*    */   }
/*    */   
/*    */   public void setValueContainsLiteralCharacters(boolean valueContainsLiteralCharacters) {
/* 36 */     this.valueContainsLiteralCharacters = valueContainsLiteralCharacters;
/*    */   }
/*    */   
/*    */   public String getValidCharacters() {
/* 40 */     return replaceVariables(this.validCharacters);
/*    */   }
/*    */   
/*    */   public void setValidCharacters(String validCharacters) {
/* 44 */     this.validCharacters = validCharacters;
/*    */   }
/*    */   
/*    */   public String getInvalidCharacters() {
/* 48 */     return replaceVariables(this.invalidCharacters);
/*    */   }
/*    */   
/*    */   public void setInvalidCharacters(String invalidCharacters) {
/* 52 */     this.invalidCharacters = invalidCharacters;
/*    */   }
/*    */   
/*    */   public void setPlaceholderCharacter(String placeholderCharacter) {
/* 56 */     if (placeholderCharacter.length() == 0) {
/* 57 */       this.placeholderCharacter = " ";
/*    */     } else {
/* 59 */       this.placeholderCharacter = placeholderCharacter.substring(0, 1);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean isAllowsInvalid() {
/* 64 */     return replaceWithTextOverride("allowsInvalid", this.allowsInvalid);
/*    */   }
/*    */   
/*    */   public void setAllowsInvalid(boolean allowsInvalid) {
/* 68 */     this.allowsInvalid = allowsInvalid;
/*    */   }
/*    */ 
/*    */   
/*    */   protected DefaultFormatter createFormatter() {
/*    */     try {
/* 74 */       MaskFormatter maskFormatter = new MaskFormatter(getInputMask());
/* 75 */       maskFormatter.setPlaceholderCharacter(getPlaceholderCharacter().charAt(0));
/* 76 */       maskFormatter.setValueContainsLiteralCharacters(isValueContainsLiteralCharacters());
/* 77 */       if (getValidCharacters().trim().length() > 0) {
/* 78 */         maskFormatter.setValidCharacters(getValidCharacters());
/*    */       }
/* 80 */       if (getInvalidCharacters().trim().length() > 0) {
/* 81 */         maskFormatter.setInvalidCharacters(getInvalidCharacters());
/*    */       }
/* 83 */       maskFormatter.setAllowsInvalid(isAllowsInvalid());
/* 84 */       return maskFormatter;
/* 85 */     } catch (ParseException e) {
/* 86 */       Util.fatalError(e);
/* 87 */       return null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected String getFormatDescription() {
/* 93 */     JFormattedTextField textField = (JFormattedTextField)getTextComponent();
/* 94 */     return " [" + ((MaskFormatter)textField.getFormatter()).getMask() + "]";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\MaskTextfieldComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */