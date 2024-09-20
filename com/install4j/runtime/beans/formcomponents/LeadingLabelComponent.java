/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.runtime.beans.AllowDirectFieldAccess;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.util.ToolTipHelpLabel;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public abstract class LeadingLabelComponent
/*     */   extends AbstractLabelWithIconComponent {
/*     */   public static final String LABEL_NAME_SUFFIX = "#label";
/*  15 */   private String helpText = "";
/*     */   
/*     */   private boolean requestFocus;
/*     */   private JLabel leadingLabel;
/*     */   
/*     */   public String getHelpText() {
/*  21 */     return replaceVariables(replaceFormVariables(this.helpText, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setHelpText(String helpText) {
/*  25 */     this.helpText = helpText;
/*     */   }
/*     */   
/*     */   @AllowDirectFieldAccess
/*     */   public String getHelpTextRaw() {
/*  30 */     return this.helpText;
/*     */   }
/*     */   
/*     */   public boolean isRequestFocus() {
/*  34 */     return replaceWithTextOverride("requestFocus", this.requestFocus);
/*     */   }
/*     */   
/*     */   public void setRequestFocus(boolean requestFocus) {
/*  38 */     this.requestFocus = requestFocus;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/*  45 */     super.setFormEnvironment(formEnvironment);
/*  46 */     if (this.leadingLabel != null && formEnvironment != null) {
/*  47 */       this.leadingLabel.setName(formEnvironment.getId((FormComponent)this) + "#label");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/*  53 */     super.setEnabled(enabled);
/*  54 */     JLabel label = getLabel();
/*  55 */     if (label != null) {
/*  56 */       label.setEnabled(enabled);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createLeftComponent() {
/*  62 */     if (getLabelText().trim().length() == 0 && getLabelIconFile() == null) {
/*  63 */       return null;
/*     */     }
/*  65 */     this.leadingLabel = createLabel();
/*  66 */     GUIHelper.setEmptyBorder(this.leadingLabel, 0, 0, 0, 5);
/*  67 */     return this.leadingLabel;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JComponent createRightComponent() {
/*  74 */     Object configurationObject = getConfigurationObject();
/*  75 */     if (this.leadingLabel != null && configurationObject instanceof JComponent && ((JComponent)configurationObject).isFocusable()) {
/*  76 */       this.leadingLabel.setLabelFor((JComponent)configurationObject);
/*     */     }
/*     */     
/*  79 */     String helpText = getHelpTextRaw();
/*  80 */     if (helpText.trim().length() == 0) {
/*  81 */       return null;
/*     */     }
/*  83 */     ToolTipHelpLabel label = new ToolTipHelpLabel("");
/*  84 */     getFormEnvironment().bindTextWithVariables(helpText, (JComponent)label);
/*  85 */     GUIHelper.setEmptyBorder((JComponent)label, 0, 5, 0, 0);
/*  86 */     return (JComponent)label;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected JLabel createLabel() {
/*  92 */     JLabel label = super.createLabel();
/*  93 */     if (isLeadingLabelTopAligned()) {
/*  94 */       label.setAlignmentY(0.0F);
/*     */     }
/*     */     
/*  97 */     return label;
/*     */   }
/*     */   
/*     */   protected boolean isLeadingLabelTopAligned() {
/* 101 */     return false;
/*     */   }
/*     */   
/*     */   protected final String getConsoleLabelText(boolean colon) {
/* 105 */     JLabel label = getLabel();
/* 106 */     if (label == null) {
/* 107 */       return "";
/*     */     }
/* 109 */     if (colon) {
/* 110 */       return appendConditional(label.getText(), ":", true);
/*     */     }
/* 112 */     return label.getText();
/*     */   }
/*     */ 
/*     */   
/*     */   protected final String appendConditional(String text, String postfix, boolean space) {
/* 117 */     if (!text.endsWith(postfix) && text.trim().length() > 0) {
/* 118 */       text = text + postfix;
/*     */     }
/* 120 */     return text + (space ? " " : "");
/*     */   }
/*     */ 
/*     */   
/*     */   public void formActivated() {
/* 125 */     super.formActivated();
/* 126 */     Object configurationObject = getConfigurationObject();
/* 127 */     if (isRequestFocus() && configurationObject instanceof JComponent && ((JComponent)configurationObject).isFocusable())
/* 128 */       ((JComponent)configurationObject).requestFocus(); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\LeadingLabelComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */