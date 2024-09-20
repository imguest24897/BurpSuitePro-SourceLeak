/*     */ package com.install4j.runtime.beans.styles;
/*     */ 
/*     */ import com.ejt.internal.gui.KeyboardUtil;
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.api.context.ControlButtonType;
/*     */ import com.install4j.api.formcomponents.AbstractFormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.api.styles.ControlButton;
/*     */ import com.install4j.runtime.beans.formcomponents.ButtonWrapper;
/*     */ import com.install4j.runtime.beans.formcomponents.SystemFormComponent;
/*     */ import com.install4j.runtime.wizard.WizardScreen;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.event.ActionEvent;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.SwingUtilities;
/*     */ 
/*     */ public class StandardControlButtonComponent extends SystemFormComponent implements ControlButton {
/*     */   public static final String PREVIOUS_BUTTON_NAME = "previous";
/*     */   public static final String NEXT_BUTTON_NAME = "next";
/*     */   public static final String CANCEL_BUTTON_NAME = "cancel";
/*  23 */   private static final Object ORIGINAL_SIZE = "originalSize";
/*     */   
/*     */   private ControlButtonType controlButtonType;
/*     */   
/*     */   private String buttonText;
/*     */   private ExternalFile buttonIconFile;
/*  29 */   private ButtonWrapper buttonWrapper = new ButtonWrapper((AbstractFormComponent)this);
/*     */ 
/*     */   
/*     */   public ControlButtonType getControlButtonType() {
/*  33 */     return (ControlButtonType)replaceWithTextOverride("controlButtonType", this.controlButtonType, ControlButtonType.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public void focusControlButton() {
/*  38 */     this.buttonWrapper.getButton().requestFocus();
/*     */   }
/*     */   
/*     */   public void setControlButtonType(ControlButtonType controlButtonType) {
/*  42 */     this.controlButtonType = controlButtonType;
/*     */   }
/*     */   
/*     */   public String getButtonText() {
/*  46 */     return replaceVariables(this.buttonText);
/*     */   }
/*     */   
/*     */   public void setButtonText(String buttonText) {
/*  50 */     this.buttonText = buttonText;
/*     */   }
/*     */   
/*     */   public ExternalFile getButtonIconFile() {
/*  54 */     return (ExternalFile)replaceWithTextOverride("buttonIconFile", this.buttonIconFile, ExternalFile.class);
/*     */   }
/*     */   
/*     */   public void setButtonIconFile(ExternalFile buttonIconFile) {
/*  58 */     this.buttonIconFile = buttonIconFile;
/*     */   }
/*     */ 
/*     */   
/*     */   public void initialize() {
/*  63 */     super.initialize();
/*  64 */     this.buttonWrapper.initialize(getButtonText(), getButtonName());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/*  69 */     super.setFormEnvironment(formEnvironment);
/*  70 */     this.buttonWrapper.setFormEnvironment(formEnvironment);
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  75 */     return this.buttonWrapper.createCenterComponent(getContext(), getButtonIconFile(), e -> {
/*     */           if (isEnabled() && isVisible()) {
/*     */             getContext().getWizardContext().pressControlButton(getControlButtonType());
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/*  84 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/*  89 */     return this.buttonWrapper.getButton();
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/*  94 */     return JButton.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) {
/*  99 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonText(String text) {
/* 104 */     JButton button = this.buttonWrapper.getButton();
/*     */     
/* 106 */     Dimension originalSize = (Dimension)button.getClientProperty(ORIGINAL_SIZE);
/* 107 */     Dimension preferredSize = button.getPreferredSize();
/* 108 */     if (originalSize == null) {
/* 109 */       originalSize = (Dimension)preferredSize.clone();
/* 110 */       button.putClientProperty(ORIGINAL_SIZE, originalSize);
/*     */     } 
/* 112 */     button.setPreferredSize(null);
/* 113 */     button.setText(text);
/* 114 */     preferredSize.width = Math.max((button.getPreferredSize()).width, originalSize.width);
/*     */     
/* 116 */     button.setPreferredSize(preferredSize);
/* 117 */     button.setMinimumSize(preferredSize);
/* 118 */     button.setMaximumSize(preferredSize);
/*     */   }
/*     */ 
/*     */   
/*     */   public void formActivated() {
/* 123 */     super.formActivated();
/*     */     
/* 125 */     WizardScreen wizardScreen = (WizardScreen)SwingUtilities.getAncestorOfClass(WizardScreen.class, this.buttonWrapper.getButton());
/* 126 */     if (wizardScreen != null) {
/* 127 */       KeyboardUtil.addAccelerator(1, this.buttonWrapper
/* 128 */           .getButton(), (JComponent)wizardScreen, this.buttonWrapper
/*     */           
/* 130 */           .getActionListener(), 
/* 131 */           getKeyCode(), 
/* 132 */           getKeyMask());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int getKeyCode() {
/* 138 */     switch (getControlButtonType()) {
/*     */       case PREVIOUS:
/* 140 */         return 37;
/*     */       case NEXT:
/* 142 */         return 39;
/*     */       case CANCEL:
/* 144 */         return 27;
/*     */     } 
/* 146 */     throw new IllegalStateException(getControlButtonType().name());
/*     */   }
/*     */ 
/*     */   
/*     */   public int getKeyMask() {
/* 151 */     switch (getControlButtonType()) {
/*     */       case PREVIOUS:
/*     */       case NEXT:
/* 154 */         return 8;
/*     */       case CANCEL:
/* 156 */         return 0;
/*     */     } 
/* 158 */     throw new IllegalStateException(getControlButtonType().name());
/*     */   }
/*     */ 
/*     */   
/*     */   private String getButtonName() {
/* 163 */     switch (getControlButtonType()) {
/*     */       case PREVIOUS:
/* 165 */         return "previous";
/*     */       case NEXT:
/* 167 */         return "next";
/*     */       case CANCEL:
/* 169 */         return "cancel";
/*     */     } 
/* 171 */     throw new IllegalStateException(getControlButtonType().name());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\styles\StandardControlButtonComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */