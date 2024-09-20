/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.CompilerVariableHelper;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.util.DisplayTextArea;
/*     */ import com.install4j.runtime.util.ToolTipHelpLabel;
/*     */ import java.awt.Component;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.event.ItemEvent;
/*     */ import java.awt.event.ItemListener;
/*     */ import javax.swing.Box;
/*     */ import javax.swing.ButtonGroup;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRadioButton;
/*     */ 
/*     */ public class UpdateAlertComponent extends SystemFormComponent {
/*  28 */   private UpdateAlertSelection updateAlertSelection = UpdateAlertSelection.EXISTING; public static final String FORM_VARIABLE_WELCOME_MESSAGE = "welcomeMessage";
/*     */   private boolean updateCheck = true;
/*     */   private ScriptProperty selectionScript;
/*     */   private JRadioButton rdoInstallUpdate;
/*     */   private JRadioButton rdoInstallNew;
/*     */   private ButtonGroup bgrInstall;
/*     */   private ToolTipHelpLabel helpLabel;
/*     */   
/*     */   public boolean isUpdateCheck() {
/*  37 */     return replaceWithTextOverride("updateCheck", this.updateCheck);
/*     */   }
/*     */   
/*     */   public void setUpdateCheck(boolean updateCheck) {
/*  41 */     this.updateCheck = updateCheck;
/*     */   }
/*     */   
/*     */   public UpdateAlertSelection getUpdateAlertSelection() {
/*  45 */     return (UpdateAlertSelection)replaceWithTextOverride("updateAlertSelection", this.updateAlertSelection, UpdateAlertSelection.class);
/*     */   }
/*     */   
/*     */   public void setUpdateAlertSelection(UpdateAlertSelection updateAlertSelection) {
/*  49 */     this.updateAlertSelection = updateAlertSelection;
/*     */   }
/*     */   
/*     */   public ScriptProperty getSelectionScript() {
/*  53 */     return (ScriptProperty)replaceWithTextOverride("selectionScript", this.selectionScript, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setSelectionScript(ScriptProperty selectionScript) {
/*  57 */     this.selectionScript = selectionScript;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/*  62 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  67 */     JPanel panel = new JPanel(new GridBagLayout());
/*  68 */     panel.setLayout(new GridBagLayout());
/*  69 */     GridBagConstraints gc = new GridBagConstraints();
/*  70 */     gc.gridy = 0;
/*  71 */     gc.gridx = 0;
/*  72 */     gc.anchor = 23;
/*     */     
/*  74 */     gc.fill = 2;
/*  75 */     gc.weightx = 1.0D;
/*     */     
/*  77 */     DisplayTextArea dtxa = new DisplayTextArea();
/*  78 */     Context context = getContext();
/*  79 */     dtxa.setText("\n" + context.getMessage(".PreviousInstallationLabel"));
/*  80 */     panel.add((Component)dtxa, gc);
/*  81 */     gc.fill = 0;
/*  82 */     gc.gridy++;
/*     */     
/*  84 */     ItemListener listener = e -> {
/*     */         if (e.getStateChange() == 1) {
/*     */           executeSelectionScript();
/*     */         }
/*     */       };
/*     */     
/*  90 */     this.rdoInstallUpdate = new JRadioButton(context.getMessage(".RadioUpdateInstallation"));
/*  91 */     this.rdoInstallUpdate.setOpaque(false);
/*  92 */     this.rdoInstallNew = new JRadioButton(context.getMessage(".RadioNewInstallation"));
/*  93 */     this.rdoInstallNew.setOpaque(false);
/*  94 */     this.rdoInstallNew.addItemListener(listener);
/*     */     
/*  96 */     if (getUpdateAlertSelection() == UpdateAlertSelection.DIFFERENT) {
/*  97 */       this.rdoInstallNew.setSelected(true);
/*     */     } else {
/*  99 */       this.rdoInstallUpdate.setSelected(true);
/*     */     } 
/*     */     
/* 102 */     this.rdoInstallUpdate.addItemListener(listener);
/* 103 */     this.bgrInstall = new ButtonGroup();
/* 104 */     this.bgrInstall.add(this.rdoInstallUpdate);
/* 105 */     this.bgrInstall.add(this.rdoInstallNew);
/*     */     
/* 107 */     this.helpLabel = new ToolTipHelpLabel("");
/*     */     
/* 109 */     gc.fill = 0;
/* 110 */     gc.insets.top = 5;
/* 111 */     Box box = new Box(2);
/* 112 */     box.add(this.rdoInstallUpdate);
/* 113 */     box.add(Box.createHorizontalStrut(5));
/* 114 */     box.add((Component)this.helpLabel);
/* 115 */     panel.add(box, gc);
/* 116 */     gc.insets.top = 0;
/* 117 */     gc.gridy++;
/* 118 */     panel.add(this.rdoInstallNew, gc);
/* 119 */     gc.gridy++;
/*     */     
/* 121 */     return panel;
/*     */   }
/*     */   
/*     */   public void update() {
/* 125 */     this.helpLabel.setToolTipText(getContext().getInstallationDirectory().getPath());
/*     */   }
/*     */   
/*     */   public boolean isUpdate() {
/* 129 */     return this.rdoInstallUpdate.isSelected();
/*     */   }
/*     */ 
/*     */   
/*     */   public void formWillActivate() {
/* 134 */     super.formWillActivate();
/* 135 */     Context context = getContext();
/* 136 */     if (getFormEnvironment().isDesignTime()) {
/* 137 */       setVisible(true);
/* 138 */     } else if (isUpdateCheck() && isUpdateInstallation()) {
/* 139 */       update();
/* 140 */       boolean writableInstallationDirectory = InstallerUtil.checkWritableInstallationDirectory(context.getInstallationDirectory(), false);
/* 141 */       setVisible(writableInstallationDirectory);
/*     */     } else {
/* 143 */       setVisible(false);
/*     */     } 
/*     */     
/* 146 */     getFormEnvironment().setFormVariable("welcomeMessage", Messages.format(replaceVariables(context.getMessage(isVisible() ? ".ConsoleWelcomeLabel" : ".WelcomeLabel3")), new Object[] { context.getApplicationName() }));
/*     */   }
/*     */ 
/*     */   
/*     */   public void formActivated() {
/* 151 */     super.formActivated();
/* 152 */     if (isVisible()) {
/* 153 */       executeSelectionScript();
/*     */     }
/*     */   }
/*     */   
/*     */   private void executeSelectionScript() {
/*     */     try {
/* 159 */       getContext().runScript(getSelectionScript(), (Bean)this, new Object[] { Boolean.valueOf(this.rdoInstallUpdate.isSelected()) });
/* 160 */     } catch (Exception e) {
/* 161 */       Util.printAnnotatedStackTrace(e);
/* 162 */       Logger.getInstance().log(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean isUpdateInstallation() {
/* 167 */     Context context = getContext();
/* 168 */     return (context instanceof InstallerContext && ((InstallerContext)context).isUpdateInstallation());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/* 173 */     if (!getContext().isUnattended() && !getContext().isConsole() && isVisible()) {
/* 174 */       getContext().setVariable("sys.confirmedUpdateInstallation", Boolean.valueOf(isUpdate()));
/*     */     }
/* 176 */     return super.checkCompleted();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 181 */     if (isUpdateCheck() && isUpdateInstallation()) {
/* 182 */       Context context = getContext();
/*     */       
/* 184 */       String previousLocationText = "";
/*     */       
/* 186 */       if (CompilerVariableHelper.getCompilerExtensionVariable(getContext(), "consoleShowPreviousInstallation", false)) {
/* 187 */         previousLocationText = "\n(" + getContext().getInstallationDirectory().getPath() + ")";
/*     */       }
/*     */       
/* 190 */       int result = console.askOption(context.getMessage(".PreviousInstallationLabel") + previousLocationText, new String[] { context
/* 191 */             .getMessage(".RadioUpdateInstallation"), context
/* 192 */             .getMessage(".RadioNewInstallation") }, null, 
/* 193 */           (getUpdateAlertSelection() == UpdateAlertSelection.DIFFERENT) ? 1 : 0, false, true);
/*     */       
/* 195 */       context.setVariable("sys.confirmedUpdateInstallation", Boolean.valueOf((result == 0)));
/*     */     } 
/* 197 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\UpdateAlertComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */