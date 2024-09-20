/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.ControlButtonType;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Console;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ItemEvent;
/*     */ import java.awt.event.ItemListener;
/*     */ import javax.swing.Box;
/*     */ import javax.swing.ButtonGroup;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRadioButton;
/*     */ 
/*     */ public class LicenseComponent extends HtmlDisplayFormComponent {
/*     */   private JRadioButton rdoLicenseAccept;
/*     */   private JRadioButton rdoLicenseRefuse;
/*  19 */   private AxisType radioButtonsAxisType = AxisType.VERTICAL; private boolean acceptInitiallySelected = false; private boolean readAllRequired = false;
/*     */   
/*     */   public boolean isAcceptInitiallySelected() {
/*  22 */     return replaceWithTextOverride("acceptInitiallySelected", this.acceptInitiallySelected);
/*     */   }
/*     */   
/*     */   public void setAcceptInitiallySelected(boolean acceptInitiallySelected) {
/*  26 */     this.acceptInitiallySelected = acceptInitiallySelected;
/*     */   }
/*     */   
/*     */   public boolean isReadAllRequired() {
/*  30 */     return replaceWithTextOverride("readAllRequired", this.readAllRequired);
/*     */   }
/*     */   
/*     */   public void setReadAllRequired(boolean readAllRequired) {
/*  34 */     this.readAllRequired = readAllRequired;
/*     */   }
/*     */   
/*     */   public AxisType getRadioButtonsAxisType() {
/*  38 */     return (AxisType)replaceWithTextOverride("radioButtonsAxisType", this.radioButtonsAxisType, AxisType.class);
/*     */   }
/*     */   
/*     */   public void setRadioButtonsAxisType(AxisType radioButtonsAxisType) {
/*  42 */     this.radioButtonsAxisType = radioButtonsAxisType;
/*     */   }
/*     */ 
/*     */   
/*     */   public void formActivated() {
/*  47 */     getContext().getWizardContext().setControlButtonEnabled(ControlButtonType.NEXT, !this.rdoLicenseRefuse.isSelected());
/*     */   }
/*     */   
/*     */   private String getMessage(String key) {
/*  51 */     return getContext().getMessage(key);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  57 */     this.rdoLicenseAccept = new JRadioButton(getMessage(".LicenseAccepted"), isAcceptInitiallySelected());
/*  58 */     this.rdoLicenseAccept.addActionListener(e -> {
/*     */           if (!isAcceptInitiallySelected() && isReadAllRequired() && !isAllRead()) {
/*     */             Util.showMessage(getMessage(".ReadLicenseFirst"), 1);
/*     */             this.rdoLicenseRefuse.setSelected(true);
/*     */           } 
/*     */         });
/*  64 */     this.rdoLicenseRefuse = new JRadioButton(getMessage(".LicenseNotAccepted"), !isAcceptInitiallySelected());
/*     */     
/*  66 */     ItemListener itemListener = e -> getContext().getWizardContext().setControlButtonEnabled(ControlButtonType.NEXT, this.rdoLicenseAccept.isSelected());
/*  67 */     this.rdoLicenseAccept.addItemListener(itemListener);
/*  68 */     this.rdoLicenseRefuse.addItemListener(itemListener);
/*     */     
/*  70 */     ButtonGroup bgrLicense = new ButtonGroup();
/*  71 */     bgrLicense.add(this.rdoLicenseAccept);
/*  72 */     bgrLicense.add(this.rdoLicenseRefuse);
/*     */     
/*  74 */     JPanel panel = new JPanel(new GridBagLayout());
/*  75 */     GridBagConstraints gc = new GridBagConstraints();
/*  76 */     gc.anchor = 23;
/*  77 */     gc.gridx = gc.gridy = 0;
/*  78 */     gc.weightx = gc.weighty = 1.0D;
/*     */     
/*  80 */     gc.fill = 1;
/*  81 */     gc.insets.bottom = 10;
/*  82 */     panel.add(super.createCenterComponent(), gc);
/*     */     
/*  84 */     gc.gridy++;
/*  85 */     gc.weightx = gc.weighty = 0.0D;
/*  86 */     gc.fill = 0;
/*  87 */     gc.weighty = 0.0D;
/*  88 */     gc.insets.bottom = 0;
/*     */     
/*  90 */     if (getRadioButtonsAxisType() == AxisType.VERTICAL) {
/*  91 */       panel.add(this.rdoLicenseAccept, gc);
/*  92 */       gc.gridy++;
/*  93 */       gc.insets.top = 0;
/*  94 */       panel.add(this.rdoLicenseRefuse, gc);
/*     */     } else {
/*  96 */       Box box = Box.createHorizontalBox();
/*  97 */       box.add(this.rdoLicenseAccept);
/*  98 */       box.add(this.rdoLicenseRefuse);
/*  99 */       panel.add(box, gc);
/*     */     } 
/* 101 */     return panel;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 106 */     super.handleConsole(console);
/* 107 */     return (console.askOption(getMessage(".LicenseAccepted"), new String[] {
/* 108 */           getMessage(".ButtonYes"), getMessage(".ButtonNo") }, null, -1) == 0);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\LicenseComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */