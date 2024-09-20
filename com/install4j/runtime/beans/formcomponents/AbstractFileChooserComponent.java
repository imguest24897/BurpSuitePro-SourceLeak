/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.events.InstallerEvent;
/*     */ import com.install4j.api.events.InstallerVariableEvent;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.frontend.components.FileValidator;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.File;
/*     */ import java.util.Objects;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public abstract class AbstractFileChooserComponent<S extends AbstractFileSelector> extends LeadingLabelComponent implements FileValidator {
/*  20 */   private String variableName = "";
/*  21 */   private String initialFile = "";
/*  22 */   private String initialBrowserDirectory = "";
/*     */   
/*     */   private boolean manualEntryAllowed = true;
/*     */   
/*     */   private ScriptProperty validationScript;
/*     */   
/*     */   private S fileSelector;
/*     */   
/*     */   public String getVariableName() {
/*  31 */     return replaceVariables(this.variableName);
/*     */   }
/*     */   
/*     */   public void setVariableName(String variableName) {
/*  35 */     this.variableName = variableName;
/*     */   }
/*     */   
/*     */   public String getInitialFile() {
/*  39 */     return replaceVariables(replaceFormVariables(this.initialFile));
/*     */   }
/*     */   
/*     */   public void setInitialFile(String initialFile) {
/*  43 */     this.initialFile = initialFile;
/*     */   }
/*     */   
/*     */   public String getInitialBrowserDirectory() {
/*  47 */     return replaceVariables(replaceFormVariables(this.initialBrowserDirectory));
/*     */   }
/*     */   
/*     */   public void setInitialBrowserDirectory(String initialBrowserDirectory) {
/*  51 */     this.initialBrowserDirectory = initialBrowserDirectory;
/*     */   }
/*     */   
/*     */   public boolean isManualEntryAllowed() {
/*  55 */     return replaceWithTextOverride("manualEntryAllowed", this.manualEntryAllowed);
/*     */   }
/*     */   
/*     */   public void setManualEntryAllowed(boolean manualEntryAllowed) {
/*  59 */     this.manualEntryAllowed = manualEntryAllowed;
/*     */   }
/*     */   
/*     */   public ScriptProperty getValidationScript() {
/*  63 */     return (ScriptProperty)replaceWithTextOverride("validationScript", this.validationScript, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setValidationScript(ScriptProperty validationScript) {
/*  67 */     this.validationScript = validationScript;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/*  72 */     super.setFormEnvironment(formEnvironment);
/*  73 */     if (this.fileSelector != null && formEnvironment != null) {
/*  74 */       String id = formEnvironment.getId((FormComponent)this);
/*  75 */       this.fileSelector.getTextField().setName(id);
/*  76 */       this.fileSelector.getButton().setName(id);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  82 */     this.fileSelector = createFileSelector();
/*  83 */     this.fileSelector.setManualEntryAllowed(isManualEntryAllowed());
/*  84 */     this.fileSelector.setValidator(this);
/*  85 */     getContext().addInstallerEventListener(event -> {
/*     */           if (!getContext().isConsole() && !getContext().isUnattended() && event instanceof InstallerVariableEvent && Objects.equals(((InstallerVariableEvent)event).getVariableName(), getVariableName())) {
/*     */             Object value = getContext().getVariable(getVariableName());
/*     */             if (value instanceof String) {
/*     */               this.fileSelector.setSelectedFile(new File((String)value));
/*     */             } else {
/*     */               initialize();
/*     */             } 
/*     */           } 
/*     */         });
/*  95 */     return (JComponent)this.fileSelector;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/* 100 */     super.setEnabled(enabled);
/* 101 */     this.fileSelector.getButton().setEnabled(enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/* 106 */     return this.fileSelector.getTextField();
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/* 111 */     return JTextField.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/* 116 */     if (!isEnabled() || !isVisible()) {
/* 117 */       return true;
/*     */     }
/* 119 */     File selectedFile = this.fileSelector.getSelectedFile();
/*     */     
/* 121 */     if (checkSelectedFile()) {
/* 122 */       getContext().setVariable(getVariableName(), (selectedFile == null) ? null : selectedFile.getPath());
/* 123 */       getContext().registerResponseFileVariable(getVariableName());
/* 124 */       return true;
/*     */     } 
/* 126 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean checkSelectedFile() {
/* 130 */     return this.fileSelector.checkSelectedFile();
/*     */   }
/*     */ 
/*     */   
/*     */   public void initialize() {
/* 135 */     super.initialize();
/* 136 */     String initValue = getInitValue();
/* 137 */     if (initValue.length() > 0) {
/* 138 */       initFileSelector(new File(initValue));
/*     */     }
/*     */     try {
/* 141 */       this.fileSelector.setInitialBrowserDirectory(getInitialBrowserDirectory().trim());
/* 142 */     } catch (Exception e) {
/*     */       
/* 144 */       Logger.getInstance().log(this, "Cannot get initial browser directory", false);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected S getFileSelector() {
/* 149 */     return this.fileSelector;
/*     */   }
/*     */   
/*     */   protected void initFileSelector(File initialFile) {
/* 153 */     this.fileSelector.setSelectedFile(initialFile);
/*     */   }
/*     */   
/*     */   private String getInitValue() {
/* 157 */     String initValue = (String)getInitValue(getInitialFile(), getVariableName(), String.class);
/* 158 */     if (initValue == null) {
/* 159 */       return "";
/*     */     }
/* 161 */     return initValue.trim();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 167 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/*     */     while (true) {
/*     */       String defaultValue;
/* 174 */       if (getInitialFile().length() > 0 || getInitValue().length() > 0) {
/* 175 */         defaultValue = this.fileSelector.getSelectedFile().getAbsolutePath();
/*     */       } else {
/* 177 */         defaultValue = "";
/*     */       } 
/* 179 */       File file = new File(console.askString(getConsoleLabelText(false), defaultValue));
/* 180 */       this.fileSelector.setSelectedFile(file);
/* 181 */       if (checkSelectedFile()) {
/* 182 */         return true;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isValidFile(File file) {
/* 189 */     if (getValidationScript() != null) {
/*     */       try {
/* 191 */         return ContextImpl.getContextInt(getContext()).runBooleanScript(getValidationScript().getValue(), (Bean)this, new Object[] { file, getFormEnvironment() });
/* 192 */       } catch (Exception e) {
/* 193 */         Util.printAnnotatedStackTrace(e);
/* 194 */         Logger.getInstance().log(e);
/*     */       } 
/*     */     }
/* 197 */     return true;
/*     */   }
/*     */   
/*     */   protected abstract S createFileSelector();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\AbstractFileChooserComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */