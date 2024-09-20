/*     */ package com.install4j.api.formcomponents;
/*     */ 
/*     */ import com.install4j.api.beans.AbstractBean;
/*     */ import com.install4j.api.beans.ReplacementMode;
/*     */ import com.install4j.api.beans.UndefinedVariableException;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.beans.formcomponents.FormEnvironmentContainer;
/*     */ import com.install4j.runtime.beans.formcomponents.FormEnvironmentImpl;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.VariableReplacer;
/*     */ import com.install4j.runtime.installer.frontend.FormPanel;
/*     */ import com.install4j.runtime.installer.frontend.ScreenEnvelope;
/*     */ import java.awt.Container;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.SwingUtilities;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractFormComponent
/*     */   extends AbstractBean
/*     */   implements FormComponent, FormEnvironmentContainer
/*     */ {
/*  35 */   public static final Pattern MNEMONIC_PATTERN = Pattern.compile("&(\\w)");
/*     */   
/*     */   public static String getTextWithoutMnemonics(String text) {
/*  38 */     return MNEMONIC_PATTERN.matcher(text).replaceFirst("$1");
/*     */   }
/*     */   
/*     */   public static int getMnemonicCharIndex(String text) {
/*  42 */     Matcher matcher = MNEMONIC_PATTERN.matcher(text);
/*  43 */     if (matcher.find()) {
/*  44 */       return matcher.start();
/*     */     }
/*  46 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean enabled = true;
/*     */   
/*     */   private Context context;
/*     */   private FormEnvironment formEnvironment;
/*     */   private boolean visible = true;
/*     */   
/*     */   public void setContext(Context context) {
/*  57 */     this.context = context;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Context getContext() {
/*  67 */     return this.context;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/*  72 */     this.formEnvironment = formEnvironment;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FormEnvironment getFormEnvironment() {
/*  83 */     return this.formEnvironment;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEnabled() {
/*  88 */     return this.enabled;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/*  93 */     this.enabled = enabled;
/*  94 */     Object configurationObject = getConfigurationObject();
/*  95 */     if (configurationObject instanceof JComponent) {
/*  96 */       ((JComponent)configurationObject).setEnabled(enabled);
/*     */     }
/*  98 */     if (this.formEnvironment instanceof FormEnvironmentImpl) {
/*  99 */       FormPanel formPanel = ((FormEnvironmentImpl)this.formEnvironment).getFormPanel();
/* 100 */       ScreenEnvelope screenEnvelope = formPanel.getScreenEnvelope();
/* 101 */       if (screenEnvelope != null) {
/* 102 */         screenEnvelope.formComponentEnabledChanged(this, enabled);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVisible(boolean visible) {
/* 109 */     this.visible = visible;
/* 110 */     if (this.formEnvironment != null) {
/* 111 */       ComponentTuple componentTuple = this.formEnvironment.getComponentTuple(this);
/* 112 */       if (componentTuple != null) {
/* 113 */         setVisible(componentTuple.getLeftComponent(), visible);
/* 114 */         setVisible(componentTuple.getCenterComponent(), visible);
/* 115 */         setVisible(componentTuple.getRightComponent(), visible);
/* 116 */         JComponent centerComponent = componentTuple.getCenterComponent();
/* 117 */         if (centerComponent != null) {
/* 118 */           Container parent = centerComponent.getParent();
/* 119 */           if (parent != null) {
/* 120 */             parent.revalidate();
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void setVisible(JComponent component, boolean visible) {
/* 128 */     if (component != null) {
/* 129 */       component.setVisible(visible);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isVisible() {
/* 135 */     return this.visible;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void migrateIds(Map<String, String> oldIdToNewId) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void requestFocus() {
/* 145 */     Object configurationObject = getConfigurationObject();
/* 146 */     if (configurationObject instanceof JComponent) {
/* 147 */       JComponent component = (JComponent)configurationObject;
/* 148 */       if (component.isFocusable()) {
/* 149 */         Objects.requireNonNull(component); SwingUtilities.invokeLater(component::requestFocus);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasUserInput() {
/* 156 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createLeftComponent() {
/* 161 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterVertical() {
/* 166 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createRightComponent() {
/* 171 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/* 176 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/* 181 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/* 186 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void initialize() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   protected final void initalize() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void formWillActivate() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void formActivated() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void formDeactivated() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 217 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleUnattended() {
/* 222 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Object getInitValue(Object defaultValue, String variableName, Class<?> valueClass) {
/* 235 */     Context context = getContext();
/* 236 */     Object value = (context == null) ? null : context.getVariable(variableName);
/* 237 */     if (value != null && valueClass.isAssignableFrom(value.getClass())) {
/* 238 */       return value;
/*     */     }
/* 240 */     return defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String replaceFormVariables(String value) throws UndefinedVariableException {
/* 249 */     return replaceFormVariables(value, ReplacementMode.PLAIN, VariableErrorHandlingDescriptor.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String replaceFormVariables(String value, ReplacementMode replacementMode) throws UndefinedVariableException {
/* 257 */     return replaceFormVariables(value, replacementMode, VariableErrorHandlingDescriptor.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String replaceFormVariables(String value, VariableErrorHandlingDescriptor errorHandlingDescriptor) throws UndefinedVariableException {
/* 265 */     return replaceFormVariables(value, ReplacementMode.PLAIN, errorHandlingDescriptor);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String replaceFormVariables(String value, ReplacementMode replacementMode, VariableErrorHandlingDescriptor errorHandlingDescriptor) throws UndefinedVariableException {
/* 273 */     if (this.formEnvironment != null) {
/* 274 */       return this.formEnvironment.replaceFormVariables(value, replacementMode, errorHandlingDescriptor);
/*     */     }
/* 276 */     return InstallerVariables.replaceVariables(value, replacementMode, errorHandlingDescriptor);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String[] replaceFormVariables(String[] values) throws UndefinedVariableException {
/* 285 */     return replaceFormVariables(values, VariableErrorHandlingDescriptor.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String[] replaceFormVariables(String[] values, VariableErrorHandlingDescriptor errorHandlingDescriptor) throws UndefinedVariableException {
/* 293 */     if (this.formEnvironment instanceof FormEnvironmentImpl) {
/* 294 */       Map<String, VariableReplacer> variableReplacers = new HashMap<>();
/* 295 */       variableReplacers.put("form:", this.formEnvironment);
/* 296 */       return InstallerVariables.replaceVariables((Object[])values, errorHandlingDescriptor, variableReplacers);
/*     */     } 
/* 298 */     return InstallerVariables.replaceVariables((Object[])values, errorHandlingDescriptor);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\formcomponents\AbstractFormComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */