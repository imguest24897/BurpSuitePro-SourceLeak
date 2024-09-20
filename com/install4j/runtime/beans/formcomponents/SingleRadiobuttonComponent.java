/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.ItemEvent;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Enumeration;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import javax.swing.AbstractButton;
/*     */ import javax.swing.ButtonGroup;
/*     */ import javax.swing.ButtonModel;
/*     */ import javax.swing.JRadioButton;
/*     */ 
/*     */ public class SingleRadiobuttonComponent extends LeadingLabelComponent implements CoupledComponentsHolder, CompoundComponentHandler, ActionListener {
/*  20 */   private static final Object INHIBIT_SELECTION_SCRIPT = "inhibitSelectionScript";
/*     */   
/*  22 */   private String variableName = "";
/*  23 */   private String variableValue = "";
/*     */   private String radioButtonLabel;
/*     */   private boolean initiallySelected = false;
/*  26 */   private List<String> coupledComponentIds = new ArrayList<>();
/*     */   
/*     */   private boolean inverseCoupling = false;
/*     */   
/*     */   private ScriptProperty selectionScript;
/*     */   
/*     */   private JRadioButton radioButton;
/*     */   private ButtonGroup buttonGroup;
/*     */   private List<SingleRadiobuttonComponent> radioButtonFormComponents;
/*     */   
/*     */   public String getVariableName() {
/*  37 */     return replaceVariables(this.variableName);
/*     */   }
/*     */   
/*     */   public void setVariableName(String variableName) {
/*  41 */     this.variableName = variableName;
/*     */   }
/*     */   
/*     */   public String getVariableValue() {
/*  45 */     return replaceVariables(this.variableValue);
/*     */   }
/*     */   
/*     */   public void setVariableValue(String variableValue) {
/*  49 */     this.variableValue = variableValue;
/*     */   }
/*     */   
/*     */   public String getRadioButtonLabel() {
/*  53 */     return replaceVariables(replaceFormVariables(this.radioButtonLabel, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setRadioButtonLabel(String radioButtonLabel) {
/*  57 */     this.radioButtonLabel = radioButtonLabel;
/*     */   }
/*     */   
/*     */   public boolean isInitiallySelected() {
/*  61 */     return replaceWithTextOverride("initiallySelected", this.initiallySelected);
/*     */   }
/*     */   
/*     */   public void setInitiallySelected(boolean initiallySelected) {
/*  65 */     this.initiallySelected = initiallySelected;
/*     */   }
/*     */   
/*     */   public ScriptProperty getSelectionScript() {
/*  69 */     return (ScriptProperty)replaceWithTextOverride("selectionScript", this.selectionScript, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setSelectionScript(ScriptProperty selectionScript) {
/*  73 */     this.selectionScript = selectionScript;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<String> getCoupledComponentIds() {
/*  78 */     return (List<String>)replaceWithTextOverride("coupledComponentIds", this.coupledComponentIds, List.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCoupledComponentIds(List<String> coupledComponentIds) {
/*  83 */     this.coupledComponentIds = coupledComponentIds;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isInverseCoupling() {
/*  88 */     return replaceWithTextOverride("inverseCoupling", this.inverseCoupling);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setInverseCoupling(boolean inverseCoupling) {
/*  93 */     this.inverseCoupling = inverseCoupling;
/*     */   }
/*     */ 
/*     */   
/*     */   public Boolean isEnableCoupledComponents() {
/*  98 */     if (this.radioButton == null) {
/*  99 */       return null;
/*     */     }
/* 101 */     return Boolean.valueOf(this.radioButton.isSelected());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void migrateIds(Map<String, String> oldIdToNewId) {
/* 107 */     super.migrateIds(oldIdToNewId);
/*     */     
/* 109 */     CoupledComponentsUtil.migrateCoupledIds(this, oldIdToNewId);
/*     */   }
/*     */ 
/*     */   
/*     */   public void formWillActivate() {
/* 114 */     super.formWillActivate();
/* 115 */     if (this.buttonGroup != null) {
/* 116 */       updateSelectedComponent();
/* 117 */       enableCoupledComponents();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/* 123 */     super.setEnabled(enabled);
/* 124 */     CoupledComponentsUtil.enableCoupledComponents(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 129 */     super.setFormEnvironment(formEnvironment);
/* 130 */     if (formEnvironment != null) {
/* 131 */       if (this.radioButton != null) {
/* 132 */         this.radioButton.setName(formEnvironment.getId((FormComponent)this));
/*     */       }
/* 134 */       if (this.buttonGroup != null) {
/* 135 */         JRadioButton[] buttons = new JRadioButton[this.buttonGroup.getButtonCount()];
/* 136 */         Enumeration<AbstractButton> en = this.buttonGroup.getElements();
/* 137 */         int count = 0;
/* 138 */         while (en.hasMoreElements()) {
/* 139 */           buttons[count++] = (JRadioButton)en.nextElement();
/*     */         }
/* 141 */         for (JRadioButton button : buttons) {
/* 142 */           this.buttonGroup.remove(button);
/*     */         }
/*     */       } 
/*     */       
/* 146 */       this.radioButtonFormComponents = new ArrayList<>();
/* 147 */       FormComponent[] formComponents = formEnvironment.getFormComponents();
/* 148 */       int thisIndex = -1; int i;
/* 149 */       for (i = 0; i < formComponents.length; i++) {
/* 150 */         if (this == formComponents[i]) {
/* 151 */           thisIndex = i;
/*     */           break;
/*     */         } 
/*     */       } 
/* 155 */       if (thisIndex == -1) {
/*     */         return;
/*     */       }
/*     */       
/* 159 */       for (i = 0; i < formComponents.length; i++) {
/* 160 */         FormComponent formComponent = formComponents[i];
/* 161 */         if (formComponent instanceof SingleRadiobuttonComponent) {
/* 162 */           SingleRadiobuttonComponent radiobuttonComponent = (SingleRadiobuttonComponent)formComponent;
/* 163 */           if (Objects.equals(radiobuttonComponent.getVariableName(), getVariableName())) {
/* 164 */             if (i < thisIndex) {
/*     */               return;
/*     */             }
/*     */             
/* 168 */             this.radioButtonFormComponents.add(radiobuttonComponent);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 174 */       this.buttonGroup = new ButtonGroup();
/* 175 */       for (SingleRadiobuttonComponent component : this.radioButtonFormComponents) {
/* 176 */         JRadioButton radioButton = (JRadioButton)component.getConfigurationObject();
/* 177 */         if (radioButton != null) {
/* 178 */           this.buttonGroup.add(radioButton);
/* 179 */           radioButton.removeActionListener(this);
/* 180 */           radioButton.addActionListener(this);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void initialize() {
/* 189 */     super.initialize();
/* 190 */     this.radioButton.setText(getRadioButtonLabel());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/* 197 */     this.radioButton = new JRadioButton();
/* 198 */     this.radioButton.setActionCommand(getVariableValue());
/*     */     
/* 200 */     this.radioButton.addItemListener(e -> {
/*     */           if (!Objects.equals(this.radioButton.getClientProperty(INHIBIT_SELECTION_SCRIPT), Boolean.TRUE) && getFormEnvironment().isInitialized() && e.getStateChange() == 1) {
/*     */             executeSelectionScript();
/*     */           }
/*     */         });
/*     */     
/* 206 */     String initValue = (String)getInitValue(null, getVariableName(), String.class);
/*     */     
/* 208 */     if (getVariableValue().equals(initValue) || (initValue == null && isInitiallySelected())) {
/* 209 */       this.radioButton.setSelected(true);
/*     */     }
/*     */     
/* 212 */     return this.radioButton;
/*     */   }
/*     */   
/*     */   private void executeSelectionScript() {
/*     */     try {
/* 217 */       getContext().runScript(getSelectionScript(), (Bean)this, new Object[] { getFormEnvironment() });
/* 218 */     } catch (Exception e) {
/* 219 */       Util.printAnnotatedStackTrace(e);
/* 220 */       Logger.getInstance().log(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 226 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/* 231 */     return this.radioButton;
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/* 236 */     return JRadioButton.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/* 241 */     if (this.radioButton.isSelected()) {
/* 242 */       getContext().setVariable(getVariableName(), getVariableValue());
/*     */     }
/* 244 */     if (this.buttonGroup != null) {
/* 245 */       getContext().registerResponseFileVariable(getVariableName());
/*     */     }
/* 247 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 252 */     if (this.buttonGroup != null) {
/* 253 */       List<String> descriptions = new ArrayList<>();
/* 254 */       List<JRadioButton> buttons = new ArrayList<>();
/* 255 */       int defaultValue = -1;
/* 256 */       ButtonModel selection = this.buttonGroup.getSelection();
/* 257 */       String defaultActionCommand = (selection == null) ? null : selection.getActionCommand();
/* 258 */       Enumeration<AbstractButton> elements = this.buttonGroup.getElements();
/* 259 */       int i = 0;
/* 260 */       while (elements.hasMoreElements()) {
/* 261 */         JRadioButton radioButton = (JRadioButton)elements.nextElement();
/* 262 */         if (Objects.equals(radioButton.getActionCommand(), defaultActionCommand)) {
/* 263 */           defaultValue = buttons.size();
/*     */         }
/* 265 */         SingleRadiobuttonComponent singleRadiobuttonComponent = this.radioButtonFormComponents.get(i);
/* 266 */         if (singleRadiobuttonComponent.isVisible() && singleRadiobuttonComponent.isEnabled()) {
/* 267 */           buttons.add(radioButton);
/* 268 */           descriptions.add(radioButton.getText());
/*     */         } 
/* 270 */         i++;
/*     */       } 
/* 272 */       if (buttons.size() > 0) {
/* 273 */         int newValue = console.askOption(getConsoleLabelText(false), descriptions.<String>toArray(new String[0]), null, defaultValue);
/* 274 */         JRadioButton selectedButton = buttons.get(newValue);
/* 275 */         selectedButton.putClientProperty(INHIBIT_SELECTION_SCRIPT, Boolean.valueOf(true));
/*     */         try {
/* 277 */           selectedButton.setSelected(true);
/*     */         } finally {
/* 279 */           selectedButton.putClientProperty(INHIBIT_SELECTION_SCRIPT, (Object)null);
/*     */         } 
/*     */         
/* 282 */         for (SingleRadiobuttonComponent component : this.radioButtonFormComponents) {
/* 283 */           JRadioButton radioButton = (JRadioButton)component.getConfigurationObject();
/* 284 */           if (radioButton == selectedButton) {
/* 285 */             component.executeSelectionScript();
/*     */           }
/* 287 */           component.enableCoupledComponents();
/*     */         } 
/*     */       } 
/*     */     } 
/* 291 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleUnattended() {
/* 296 */     if (this.buttonGroup != null) {
/* 297 */       enableCoupledComponents();
/*     */     }
/* 299 */     return super.handleUnattended();
/*     */   }
/*     */ 
/*     */   
/*     */   public void actionPerformed(ActionEvent event) {
/* 304 */     enableCoupledComponents();
/*     */   }
/*     */ 
/*     */   
/*     */   private void updateSelectedComponent() {
/* 309 */     String contextVariableValue = (String)getContext().getVariable(getVariableName());
/* 310 */     for (SingleRadiobuttonComponent component : this.radioButtonFormComponents) {
/* 311 */       if (Objects.equals(contextVariableValue, component.getVariableValue())) {
/* 312 */         ((JRadioButton)component.getConfigurationObject()).setSelected(true);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void enableCoupledComponents() {
/* 319 */     SingleRadiobuttonComponent selectedComponent = null;
/* 320 */     for (SingleRadiobuttonComponent component : this.radioButtonFormComponents) {
/* 321 */       if (((JRadioButton)component.getConfigurationObject()).isSelected()) {
/* 322 */         selectedComponent = component; continue;
/*     */       } 
/* 324 */       CoupledComponentsUtil.enableCoupledComponents(component);
/*     */     } 
/*     */     
/* 327 */     if (selectedComponent != null)
/* 328 */       CoupledComponentsUtil.enableCoupledComponents(selectedComponent); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\SingleRadiobuttonComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */