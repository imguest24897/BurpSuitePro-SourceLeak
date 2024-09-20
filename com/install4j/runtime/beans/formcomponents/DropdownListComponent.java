/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import javax.swing.DefaultComboBoxModel;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JComponent;
/*     */ 
/*     */ public class DropdownListComponent extends AbstractListComponent implements ActionListener {
/*     */   private JComboBox<String> comboBox;
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/*  18 */     super.setFormEnvironment(formEnvironment);
/*  19 */     if (this.comboBox != null && formEnvironment != null) {
/*  20 */       this.comboBox.setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  27 */     this.comboBox = new JComboBox<>();
/*  28 */     this.comboBox.setAlignmentX(0.0F);
/*  29 */     return this.comboBox;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void initialize() {
/*  35 */     super.initialize();
/*  36 */     this.comboBox.removeActionListener(this);
/*  37 */     this.comboBox.setModel(new DefaultComboBoxModel<>(getListEntries()));
/*  38 */     applyComboBoxProperties(this.comboBox);
/*  39 */     this.comboBox.addActionListener(this);
/*  40 */     selectionChanged();
/*  41 */     adjustMinimumSize(this.comboBox, this.comboBox);
/*     */   }
/*     */   
/*     */   protected void applyComboBoxProperties(JComboBox comboBox) {
/*  45 */     int initiallySelectedIndex = ((Integer)getInitValue(Integer.valueOf(getInitiallySelectedIndex()), getVariableName(), Integer.class)).intValue();
/*  46 */     if (initiallySelectedIndex < (getListEntries()).length) {
/*  47 */       comboBox.setSelectedIndex(initiallySelectedIndex);
/*     */     }
/*  49 */     Dimension size = comboBox.getPreferredSize();
/*  50 */     size.width += 10;
/*  51 */     comboBox.setPreferredSize(size);
/*     */   }
/*     */   
/*     */   protected JComboBox<String> getComboBox() {
/*  55 */     return this.comboBox;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/*  60 */     return this.comboBox;
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/*  65 */     return JComboBox.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/*  70 */     getContext().setVariable(getVariableName(), Integer.valueOf(this.comboBox.getSelectedIndex()));
/*  71 */     getContext().registerResponseFileVariable(getVariableName());
/*  72 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean getInitialFillHorizontal() {
/*  77 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/*  82 */     String[] descriptions = new String[this.comboBox.getItemCount()];
/*  83 */     for (int i = 0; i < descriptions.length; i++) {
/*  84 */       descriptions[i] = this.comboBox.getItemAt(i);
/*     */     }
/*     */     
/*  87 */     int newValue = console.askOption(getConsoleLabelText(false), descriptions, null, this.comboBox.getSelectedIndex(), true, true);
/*  88 */     this.comboBox.setSelectedIndex(newValue);
/*  89 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void actionPerformed(ActionEvent e) {
/*  95 */     if (e.getSource() == this.comboBox) {
/*  96 */       selectionChanged();
/*     */     }
/*     */   }
/*     */   
/*     */   private void selectionChanged() {
/* 101 */     selectionChanged(this.comboBox.getSelectedItem(), this.comboBox.getSelectedIndex());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\DropdownListComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */