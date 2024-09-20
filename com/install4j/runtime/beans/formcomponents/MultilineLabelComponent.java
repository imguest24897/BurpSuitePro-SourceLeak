/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.formcomponents.FormComponent;
/*    */ import com.install4j.api.formcomponents.FormEnvironment;
/*    */ import com.install4j.api.screens.Console;
/*    */ import com.install4j.runtime.util.DisplayTextArea;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JTextArea;
/*    */ 
/*    */ public class MultilineLabelComponent extends AbstractLabelComponent {
/*    */   private DisplayTextArea label;
/*    */   private boolean hideIfBlank;
/*    */   
/*    */   public boolean isHideIfBlank() {
/* 16 */     return replaceWithTextOverride("hideIfBlank", this.hideIfBlank);
/*    */   }
/*    */   
/*    */   public void setHideIfBlank(boolean hideIfBlank) {
/* 20 */     this.hideIfBlank = hideIfBlank;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object getConfigurationObject() {
/* 25 */     return this.label;
/*    */   }
/*    */ 
/*    */   
/*    */   public Class getConfigurationObjectClass() {
/* 30 */     return JTextArea.class;
/*    */   }
/*    */ 
/*    */   
/*    */   public void initialize() {
/* 35 */     super.initialize();
/* 36 */     if (isInitLabelText()) {
/* 37 */       getFormEnvironment().bindTextWithVariables(getRawLabelText(), (JComponent)this.label);
/*    */     }
/*    */   }
/*    */   
/*    */   protected boolean isInitLabelText() {
/* 42 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 47 */     super.setFormEnvironment(formEnvironment);
/* 48 */     if (this.label != null && formEnvironment != null) {
/* 49 */       this.label.setName(getLabelName(formEnvironment));
/*    */     }
/*    */   }
/*    */   
/*    */   protected String getLabelName(FormEnvironment formEnvironment) {
/* 54 */     return formEnvironment.getId((FormComponent)this);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public JComponent createCenterComponent() {
/* 60 */     this.label = new DisplayTextArea();
/* 61 */     this.label.setText(getLabelText());
/* 62 */     this.label.setAlignmentX(0.0F);
/*    */     
/* 64 */     applyLabelColorAndFont(getLabelColor(), getLabelFont(), getLabelFontType(), getLabelFontStyle(), getLabelFontSizePercent(), (JComponent)this.label);
/*    */     
/* 66 */     return (JComponent)this.label;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFillCenterHorizontal() {
/* 71 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 76 */     String text = this.label.getText();
/* 77 */     if (!text.isEmpty()) {
/* 78 */       console.more(text);
/*    */     }
/* 80 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasUserInput() {
/* 85 */     return false;
/*    */   }
/*    */   
/*    */   protected DisplayTextArea getLabel() {
/* 89 */     return this.label;
/*    */   }
/*    */ 
/*    */   
/*    */   public void formWillActivate() {
/* 94 */     super.formWillActivate();
/* 95 */     if (isHideIfBlank() && getLabelText().trim().isEmpty())
/* 96 */       setVisible(false); 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\MultilineLabelComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */