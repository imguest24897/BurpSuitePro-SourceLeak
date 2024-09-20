/*     */ package com.install4j.runtime.installer.helper;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.util.DisplayTextArea;
/*     */ import com.install4j.runtime.util.IconHelper;
/*     */ import com.install4j.runtime.util.StandardDialog;
/*     */ import java.awt.Component;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JList;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.UIManager;
/*     */ 
/*     */ public class RunningProcessesDialog extends StandardDialog {
/*     */   private String message;
/*     */   private Collection<String> processes;
/*     */   private List<String> buttonTexts;
/*     */   
/*     */   public RunningProcessesDialog(Window parentWindow, String message, Collection<String> processes, List<String> buttonTexts) {
/*  28 */     super(parentWindow);
/*  29 */     IconHelper.setIconImages((Window)this);
/*  30 */     this.message = message;
/*  31 */     this.processes = processes;
/*  32 */     this.buttonTexts = buttonTexts;
/*  33 */     setDefaultCloseOperation(0);
/*     */     
/*  35 */     init();
/*     */   }
/*     */   private List<JButton> buttons; private JList<String> lstProcesses; private JScrollPane scpProcesses; private int selectedButtonIndex;
/*     */   public int getSelectedButtonIndex() {
/*  39 */     return this.selectedButtonIndex;
/*     */   }
/*     */ 
/*     */   
/*     */   public void actionPerformed(ActionEvent event) {
/*  44 */     Object source = event.getSource();
/*  45 */     if (source instanceof JButton) {
/*  46 */       int buttonIndex = this.buttons.indexOf(source);
/*  47 */       if (buttonIndex >= 0) {
/*  48 */         this.selectedButtonIndex = buttonIndex;
/*  49 */         doOk();
/*     */         return;
/*     */       } 
/*     */     } 
/*  53 */     super.actionPerformed(event);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void addScreenContent(JPanel panel) {
/*  58 */     GridBagConstraints gc = new GridBagConstraints();
/*  59 */     gc.gridx = gc.gridy = 0;
/*  60 */     gc.anchor = 23;
/*  61 */     gc.insets = new Insets(0, 0, 15, 0);
/*     */     
/*  63 */     gc.weightx = 0.0D;
/*  64 */     gc.fill = 0;
/*  65 */     gc.insets.right = 15;
/*  66 */     panel.add(new JLabel(UIManager.getIcon("OptionPane.warningIcon")), gc);
/*  67 */     gc.insets.right = 0;
/*  68 */     gc.gridx = 1;
/*     */     
/*  70 */     gc.weightx = 1.0D;
/*  71 */     gc.fill = 2;
/*     */     
/*  73 */     DisplayTextArea dtxa = new DisplayTextArea();
/*  74 */     dtxa.setText(this.message);
/*  75 */     panel.add((Component)dtxa, gc);
/*  76 */     gc.gridy++;
/*  77 */     gc.gridx = 0;
/*  78 */     gc.gridwidth = 2;
/*     */     
/*  80 */     gc.weighty = 1.0D;
/*  81 */     gc.fill = 1;
/*  82 */     gc.insets.bottom = 0;
/*  83 */     panel.add(this.scpProcesses, gc);
/*  84 */     gc.gridy++;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean isFillVertical() {
/*  89 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void addButtons(List<JButton> buttons) {
/*  94 */     buttons.addAll(this.buttons);
/*  95 */     buttons.add(getCancelButton());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void doCancel() {
/* 100 */     if (GUIHelper.confirmCancel((Component)this)) {
/* 101 */       super.doCancel();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setupControls() {
/* 107 */     super.setupControls();
/*     */     
/* 109 */     this.lstProcesses = new JList<>(this.processes.<String>toArray(new String[0]));
/* 110 */     this.scpProcesses = new JScrollPane(this.lstProcesses);
/*     */     
/* 112 */     this.buttons = new ArrayList<>(this.buttonTexts.size());
/* 113 */     for (String buttonText : this.buttonTexts) {
/* 114 */       JButton button = new JButton(buttonText);
/* 115 */       button.addActionListener((ActionListener)this);
/* 116 */       this.buttons.add(button);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setupComponent() {
/* 122 */     super.setupComponent();
/* 123 */     setTitle(Messages.getString(".RunningProcessesDetected"));
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getFrameHeight() {
/* 128 */     return 300;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getFrameWidth() {
/* 133 */     return 500;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVisible(boolean visible) {
/* 138 */     super.setVisible(visible);
/* 139 */     if (!visible)
/* 140 */       dispose(); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\RunningProcessesDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */