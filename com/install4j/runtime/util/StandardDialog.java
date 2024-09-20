/*     */ package com.install4j.runtime.util;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.Box;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ import javax.swing.text.JTextComponent;
/*     */ 
/*     */ public abstract class StandardDialog extends CustomDialog implements ActionListener {
/*     */   public static final String BUTTON_NAME_OK = "ok";
/*     */   public static final String BUTTON_NAME_CANCEL = "cancel";
/*     */   
/*     */   protected StandardDialog(Window parentWindow) {
/*  26 */     super(parentWindow);
/*     */   }
/*     */   private JButton btnOK; private JButton btnCancel; private boolean canceled = true;
/*     */   protected void init() {
/*  30 */     setModal(true);
/*  31 */     setupControls();
/*  32 */     setupComponent();
/*  33 */     setupEventHandlers();
/*  34 */     setBounds(getFrameBounds());
/*     */   }
/*     */   
/*     */   public boolean isCanceled() {
/*  38 */     return this.canceled;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVisible(boolean visible) {
/*  43 */     if (visible) {
/*  44 */       this.canceled = true;
/*     */     }
/*  46 */     super.setVisible(visible);
/*     */   }
/*     */ 
/*     */   
/*     */   public void actionPerformed(ActionEvent event) {
/*  51 */     Object source = event.getSource();
/*  52 */     if (source == this.btnOK) {
/*  53 */       doOk();
/*  54 */     } else if (source == this.btnCancel) {
/*  55 */       doCancel();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected JButton getOKButton() {
/*  60 */     return this.btnOK;
/*     */   }
/*     */   
/*     */   protected JButton getCancelButton() {
/*  64 */     return this.btnCancel;
/*     */   }
/*     */   
/*     */   protected void doOk() {
/*  68 */     this.canceled = false;
/*  69 */     setVisible(false);
/*     */   }
/*     */   
/*     */   protected void doCancel() {
/*  73 */     setVisible(false);
/*     */   }
/*     */   
/*     */   protected void setupControls() {
/*  77 */     this.btnOK = new JButton(Messages.getString(".ButtonOK"));
/*  78 */     this.btnOK.setName("ok");
/*  79 */     this.btnCancel = new JButton(Messages.getString(".ButtonCancel"));
/*  80 */     this.btnCancel.setName("cancel");
/*     */   }
/*     */   
/*     */   protected void setupEventHandlers() {
/*  84 */     this.btnOK.addActionListener(this);
/*  85 */     this.btnCancel.addActionListener(this);
/*     */   }
/*     */   
/*     */   protected void setupComponent() {
/*  89 */     Container contentPane = getContentPane();
/*     */     
/*  91 */     contentPane.setLayout(new BorderLayout());
/*     */     
/*  93 */     JPanel panel = new JPanel(new GridBagLayout());
/*  94 */     panel.setBorder(new EmptyBorder(10, 10, 10, 10));
/*     */ 
/*     */     
/*  97 */     addScreenContent(panel);
/*  98 */     contentPane.add(panel, isFillVertical() ? "Center" : "First");
/*  99 */     contentPane.add(createButtonPanel(), "Last");
/* 100 */     getRootPane().setDefaultButton(this.btnOK);
/*     */   }
/*     */   
/*     */   protected abstract void addScreenContent(JPanel paramJPanel);
/*     */   
/*     */   protected abstract boolean isFillVertical();
/*     */   
/*     */   protected JPanel createButtonPanel() {
/* 108 */     JPanel panel = new JPanel(new BorderLayout());
/* 109 */     panel.setBorder(new EmptyBorder(10, 10, 10, 10));
/* 110 */     panel.add(createButtonBox(), "Center");
/* 111 */     return panel;
/*     */   }
/*     */   
/*     */   protected JComponent createButtonBox() {
/* 115 */     List<JButton> buttons = new ArrayList<>();
/* 116 */     addButtons(buttons);
/*     */     
/* 118 */     Box box = ButtonUtil.createHorizontalButtonBox(buttons.<Component>toArray(new Component[0]), 0);
/*     */     
/* 120 */     Box buttonBox = new Box(2);
/* 121 */     buttonBox.add(Box.createHorizontalGlue());
/* 122 */     buttonBox.add(box);
/*     */     
/* 124 */     return buttonBox;
/*     */   }
/*     */   
/*     */   protected void addButtons(List<JButton> buttons) {
/* 128 */     buttons.add(this.btnOK);
/* 129 */     buttons.add(this.btnCancel);
/*     */   }
/*     */   
/*     */   protected boolean checkTextField(JTextComponent textField) {
/* 133 */     if (textField.getText().trim().length() == 0) {
/* 134 */       showMissingMessage(textField);
/* 135 */       return false;
/*     */     } 
/*     */     
/* 138 */     return true;
/*     */   }
/*     */   
/*     */   protected void showMissingMessage(JComponent missingComponent) {
/* 142 */     GUIHelper.showMessage(
/* 143 */         getOwner(), 
/* 144 */         Messages.getString(".EnterInformation"), 2);
/*     */ 
/*     */     
/* 147 */     missingComponent.requestFocus();
/*     */   }
/*     */   
/*     */   protected JPanel createBorderPanel(String title, LayoutManager layoutManager) {
/* 151 */     return createBorderPanel(title, layoutManager, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected JPanel createBorderPanel(String title, LayoutManager layoutManager, int border) {
/* 156 */     JPanel panel = new JPanel();
/* 157 */     panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(title), BorderFactory.createEmptyBorder(border, border, border, border)));
/* 158 */     if (layoutManager != null) {
/* 159 */       panel.setLayout(layoutManager);
/*     */     }
/* 161 */     return panel;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\StandardDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */