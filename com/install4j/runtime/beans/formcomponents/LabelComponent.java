/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.formcomponents.FormComponent;
/*    */ import com.install4j.api.formcomponents.FormEnvironment;
/*    */ import com.install4j.api.screens.Console;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JLabel;
/*    */ 
/*    */ public class LabelComponent extends AbstractLabelWithIconComponent {
/*    */   private boolean emptyLeadingLabel = false;
/*    */   
/*    */   public boolean isEmptyLeadingLabel() {
/* 13 */     return replaceWithTextOverride("emptyLeadingLabel", this.emptyLeadingLabel);
/*    */   }
/*    */   
/*    */   public void setEmptyLeadingLabel(boolean emptyLeadingLabel) {
/* 17 */     this.emptyLeadingLabel = emptyLeadingLabel;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 22 */     super.setFormEnvironment(formEnvironment);
/* 23 */     if (getLabel() != null && formEnvironment != null) {
/* 24 */       getLabel().setName(getFormEnvironment().getId((FormComponent)this));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public JComponent createCenterComponent() {
/* 30 */     return createLabel();
/*    */   }
/*    */ 
/*    */   
/*    */   public JComponent createLeftComponent() {
/* 35 */     if (isEmptyLeadingLabel()) {
/* 36 */       return new JLabel("");
/*    */     }
/* 38 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isFillCenterHorizontal() {
/* 44 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object getConfigurationObject() {
/* 49 */     return getLabel();
/*    */   }
/*    */ 
/*    */   
/*    */   public Class getConfigurationObjectClass() {
/* 54 */     return JLabel.class;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean handleConsole(Console console) {
/* 59 */     console.println(getLabel().getText());
/* 60 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasUserInput() {
/* 65 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getLabelText() {
/* 70 */     return super.getLabelText().replaceAll("&", "&&");
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\LabelComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */