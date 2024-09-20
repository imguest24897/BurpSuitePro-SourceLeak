/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import java.awt.event.ItemEvent;
/*     */ import java.util.Enumeration;
/*     */ import javax.swing.AbstractButton;
/*     */ import javax.swing.BoxLayout;
/*     */ import javax.swing.ButtonGroup;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRadioButton;
/*     */ 
/*     */ public class RadiobuttonsComponent extends LeadingLabelComponent {
/*  16 */   private String variableName = "";
/*     */   private String[] radioButtonLabels;
/*     */   private int initiallySelectedIndex;
/*  19 */   private AxisType axisType = AxisType.VERTICAL;
/*     */   
/*     */   private ButtonGroup buttonGroup;
/*     */   
/*     */   private JRadioButton[] radioButtons;
/*     */   private ScriptProperty selectionScript;
/*     */   
/*     */   public String getVariableName() {
/*  27 */     return replaceVariables(this.variableName);
/*     */   }
/*     */   
/*     */   public void setVariableName(String variableName) {
/*  31 */     this.variableName = variableName;
/*     */   }
/*     */   
/*     */   public String[] getRadioButtonLabels() {
/*  35 */     return (String[])replaceWithTextOverride("radioButtonLabels", replaceFormVariables(this.radioButtonLabels), String[].class);
/*     */   }
/*     */   
/*     */   public void setRadioButtonLabels(String[] radioButtonLabels) {
/*  39 */     this.radioButtonLabels = radioButtonLabels;
/*     */   }
/*     */   
/*     */   public int getInitiallySelectedIndex() {
/*  43 */     return replaceWithTextOverride("initiallySelectedIndex", this.initiallySelectedIndex);
/*     */   }
/*     */   
/*     */   public void setInitiallySelectedIndex(int initiallySelectedIndex) {
/*  47 */     this.initiallySelectedIndex = initiallySelectedIndex;
/*     */   }
/*     */   
/*     */   public AxisType getAxisType() {
/*  51 */     return (AxisType)replaceWithTextOverride("axisType", this.axisType, AxisType.class);
/*     */   }
/*     */   
/*     */   public void setAxisType(AxisType axisType) {
/*  55 */     this.axisType = axisType;
/*     */   }
/*     */   
/*     */   public ScriptProperty getSelectionScript() {
/*  59 */     return (ScriptProperty)replaceWithTextOverride("selectionScript", this.selectionScript, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setSelectionScript(ScriptProperty selectionScript) {
/*  63 */     this.selectionScript = selectionScript;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/*  68 */     super.setEnabled(enabled);
/*  69 */     Enumeration<AbstractButton> elements = this.buttonGroup.getElements();
/*  70 */     while (elements.hasMoreElements()) {
/*  71 */       ((JRadioButton)elements.nextElement()).setEnabled(enabled);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void initialize() {
/*  77 */     super.initialize();
/*  78 */     int initIndex = ((Integer)getInitValue(Integer.valueOf(getInitiallySelectedIndex()), getVariableName(), Integer.class)).intValue();
/*  79 */     for (int i = 0; i < this.radioButtons.length; i++) {
/*  80 */       JRadioButton radioButton = this.radioButtons[i];
/*  81 */       if (i == 0 || i == initIndex) {
/*  82 */         radioButton.setSelected(true);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/*  89 */     super.setFormEnvironment(formEnvironment);
/*  90 */     if (this.radioButtons != null && this.radioButtons.length > 0 && formEnvironment != null)
/*     */     {
/*  92 */       this.radioButtons[0].getParent().setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*     */     int axis;
/*  99 */     this.buttonGroup = new ButtonGroup();
/* 100 */     String[] radioButtonLabels = getRadioButtonLabels();
/* 101 */     this.radioButtons = new JRadioButton[radioButtonLabels.length];
/*     */     
/* 103 */     JPanel panel = new RadioButtonPanelPanel(this.buttonGroup);
/* 104 */     panel.setName(getFormEnvironment().getId((FormComponent)this));
/*     */     
/* 106 */     if (getAxisType() == AxisType.HORIZONTAL) {
/* 107 */       axis = 0;
/*     */     } else {
/* 109 */       axis = 1;
/*     */     } 
/* 111 */     panel.setLayout(new BoxLayout(panel, axis));
/* 112 */     panel.setAlignmentX(0.0F);
/*     */     
/* 114 */     for (int i = 0; i < radioButtonLabels.length; i++) {
/* 115 */       JRadioButton radioButton = new JRadioButton(radioButtonLabels[i]);
/* 116 */       int selectedIndex = i;
/* 117 */       radioButton.addItemListener(e -> {
/*     */             if (getFormEnvironment().isInitialized() && e.getStateChange() == 1) {
/*     */               executeSelectionScript(selectedIndex);
/*     */             }
/*     */           });
/* 122 */       this.buttonGroup.add(radioButton);
/* 123 */       if (i == 0) {
/* 124 */         radioButton.setSelected(true);
/*     */       }
/* 126 */       radioButton.setActionCommand(String.valueOf(i));
/* 127 */       radioButton.setAlignmentX(0.0F);
/* 128 */       panel.add(radioButton);
/* 129 */       this.radioButtons[i] = radioButton;
/*     */     } 
/*     */     
/* 132 */     return panel;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 137 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/* 142 */     return this.buttonGroup;
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/* 147 */     return ButtonGroup.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/* 152 */     getContext().setVariable(getVariableName(), Integer.valueOf(this.buttonGroup.getSelection().getActionCommand()));
/* 153 */     getContext().registerResponseFileVariable(getVariableName());
/* 154 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 159 */     String[] descriptions = new String[this.buttonGroup.getButtonCount()];
/* 160 */     JRadioButton[] buttons = new JRadioButton[this.buttonGroup.getButtonCount()];
/* 161 */     int i = 0;
/* 162 */     Enumeration<AbstractButton> elements = this.buttonGroup.getElements();
/* 163 */     while (elements.hasMoreElements()) {
/* 164 */       JRadioButton radioButton = (JRadioButton)elements.nextElement();
/* 165 */       buttons[i] = radioButton;
/* 166 */       descriptions[i++] = radioButton.getText();
/*     */     } 
/* 168 */     int newValue = console.askOption(getConsoleLabelText(false), descriptions, null, Integer.parseInt(this.buttonGroup.getSelection().getActionCommand()));
/* 169 */     buttons[newValue].setSelected(true);
/* 170 */     executeSelectionScript(newValue);
/* 171 */     return true;
/*     */   }
/*     */   
/*     */   private void executeSelectionScript(int selectedIndex) {
/*     */     try {
/* 176 */       getContext().runScript(getSelectionScript(), (Bean)this, new Object[] { getFormEnvironment(), Integer.valueOf(selectedIndex) });
/* 177 */     } catch (Exception e) {
/* 178 */       Util.printAnnotatedStackTrace(e);
/* 179 */       Logger.getInstance().log(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static class RadioButtonPanelPanel
/*     */     extends JPanel {
/*     */     private ButtonGroup buttonGroup;
/*     */     
/*     */     public RadioButtonPanelPanel(ButtonGroup buttonGroup) {
/* 188 */       this.buttonGroup = buttonGroup;
/*     */     }
/*     */ 
/*     */     
/*     */     public void setOpaque(boolean opaque) {
/* 193 */       super.setOpaque(opaque);
/* 194 */       if (this.buttonGroup != null) {
/* 195 */         Enumeration<AbstractButton> elements = this.buttonGroup.getElements();
/* 196 */         while (elements.hasMoreElements())
/* 197 */           ((JRadioButton)elements.nextElement()).setOpaque(opaque); 
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\RadiobuttonsComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */