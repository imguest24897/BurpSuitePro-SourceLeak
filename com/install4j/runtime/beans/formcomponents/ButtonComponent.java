/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.beans.ExternalFile;
/*    */ import com.install4j.api.formcomponents.FormEnvironment;
/*    */ import com.install4j.api.screens.Console;
/*    */ import java.awt.event.ActionEvent;
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.JComponent;
/*    */ 
/*    */ public class ButtonComponent
/*    */   extends ActionComponent {
/*    */   private String buttonText;
/*    */   private ExternalFile buttonIconFile;
/* 14 */   private ButtonWrapper buttonWrapper = new ButtonWrapper(this);
/*    */   
/*    */   public String getButtonText() {
/* 17 */     return replaceVariables(this.buttonText);
/*    */   }
/*    */   
/*    */   public void setButtonText(String buttonText) {
/* 21 */     this.buttonText = buttonText;
/*    */   }
/*    */   
/*    */   public ExternalFile getButtonIconFile() {
/* 25 */     return (ExternalFile)replaceWithTextOverride("buttonIconFile", this.buttonIconFile, ExternalFile.class);
/*    */   }
/*    */   
/*    */   public void setButtonIconFile(ExternalFile buttonIconFile) {
/* 29 */     this.buttonIconFile = buttonIconFile;
/*    */   }
/*    */ 
/*    */   
/*    */   public void initialize() {
/* 34 */     super.initialize();
/* 35 */     this.buttonWrapper.initialize(getButtonText());
/*    */   }
/*    */ 
/*    */   
/*    */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 40 */     super.setFormEnvironment(formEnvironment);
/* 41 */     this.buttonWrapper.setFormEnvironment(formEnvironment);
/*    */   }
/*    */ 
/*    */   
/*    */   public JComponent createCenterComponent() {
/* 46 */     return this.buttonWrapper.createCenterComponent(getContext(), getButtonIconFile(), e -> executeAction());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFillCenterHorizontal() {
/* 51 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object getConfigurationObject() {
/* 56 */     return this.buttonWrapper.getButton();
/*    */   }
/*    */ 
/*    */   
/*    */   public Class getConfigurationObjectClass() {
/* 61 */     return JButton.class;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean handleConsole(Console console) {
/* 66 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\ButtonComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */