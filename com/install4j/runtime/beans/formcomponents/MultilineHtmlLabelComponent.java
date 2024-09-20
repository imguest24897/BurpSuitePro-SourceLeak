/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.formcomponents.FormComponent;
/*    */ import com.install4j.api.formcomponents.FormEnvironment;
/*    */ import com.install4j.api.screens.Console;
/*    */ import com.install4j.runtime.beans.AllowDirectFieldAccess;
/*    */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*    */ import com.install4j.runtime.util.HtmlDisplayTextArea;
/*    */ import com.install4j.runtime.util.HtmlTextHelper;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JTextPane;
/*    */ import javax.swing.event.HyperlinkEvent;
/*    */ 
/*    */ public class MultilineHtmlLabelComponent extends SystemFormComponent {
/* 17 */   private String labelHtml = "";
/*    */   
/*    */   private HtmlDisplayTextArea label;
/*    */   
/*    */   public String getLabelHtml() {
/* 22 */     return replaceVariables(replaceFormVariables(this.labelHtml, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*    */   }
/*    */   
/*    */   public void setLabelHtml(String labelHtml) {
/* 26 */     this.labelHtml = labelHtml;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object getConfigurationObject() {
/* 31 */     return this.label;
/*    */   }
/*    */ 
/*    */   
/*    */   public Class getConfigurationObjectClass() {
/* 36 */     return JTextPane.class;
/*    */   }
/*    */   
/*    */   @AllowDirectFieldAccess
/*    */   private String getRawLabelHtml() {
/* 41 */     return this.labelHtml;
/*    */   }
/*    */ 
/*    */   
/*    */   public void initialize() {
/* 46 */     super.initialize();
/* 47 */     getFormEnvironment().bindTextWithVariables(getRawLabelHtml(), (JComponent)this.label);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 52 */     super.setFormEnvironment(formEnvironment);
/* 53 */     if (this.label != null && formEnvironment != null) {
/* 54 */       this.label.setName(formEnvironment.getId((FormComponent)this));
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public JComponent createCenterComponent() {
/* 61 */     this.label = new HtmlDisplayTextArea();
/* 62 */     this.label.setAlignmentX(0.0F);
/*    */     
/* 64 */     this.label.addHyperlinkListener(event -> {
/*    */           if (event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
/*    */             GUIHelper.showURL(replaceFormVariables(event.getURL().toExternalForm()));
/*    */           }
/*    */         });
/*    */     
/* 70 */     return (JComponent)this.label;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFillCenterHorizontal() {
/* 75 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 80 */     console.more(HtmlTextHelper.formatTextWithoutHtmlTags(this.label.getText()));
/* 81 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasUserInput() {
/* 86 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\MultilineHtmlLabelComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */