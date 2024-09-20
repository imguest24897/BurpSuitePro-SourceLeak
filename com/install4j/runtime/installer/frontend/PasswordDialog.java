/*     */ package com.install4j.runtime.installer.frontend;
/*     */ import java.awt.Dialog;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.WindowEvent;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class PasswordDialog extends CustomDialog implements ActionListener {
/*     */   public static final String PASSWORD_TEXT_FIELD_NAME = "password";
/*  15 */   private static final Icon ICON = IconHelper.loadIcon("lock_open_32.png"); public static final String USER_TEXT_FIELD_NAME = "user"; private static final int TEXT_FIELD_WIDTH = 350; private static final int TEXT_FIELD_WIDTH_USER = 250; private JButton btnOk; private JButton btnCancel;
/*     */   private DisplayTextArea displayTextArea;
/*     */   private String header;
/*     */   private String footer;
/*     */   private String title;
/*     */   private InputTextValidator inputTextValidator;
/*     */   private boolean user;
/*     */   
/*     */   public static PasswordDialog createInputDialog(Window parentWindow, String header, String footer, String title, InputTextValidator inputTextValidator, boolean user) {
/*     */     PasswordDialog inputDialog;
/*  25 */     if (parentWindow instanceof Dialog) {
/*  26 */       inputDialog = new PasswordDialog((Dialog)parentWindow, header, footer, title, inputTextValidator, user);
/*  27 */     } else if (parentWindow instanceof Frame || parentWindow == null) {
/*  28 */       inputDialog = new PasswordDialog((Frame)parentWindow, header, footer, title, inputTextValidator, user);
/*     */     } else {
/*  30 */       throw new IllegalArgumentException();
/*     */     } 
/*  32 */     return inputDialog;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean canceled = true;
/*     */ 
/*     */   
/*     */   private JTextField txtPassword;
/*     */   
/*     */   private JTextField txtUser;
/*     */ 
/*     */   
/*     */   private PasswordDialog(Frame parentWindow, String header, String footer, String title, InputTextValidator inputTextValidator, boolean user) {
/*  46 */     super(parentWindow);
/*  47 */     init(header, footer, title, inputTextValidator, user);
/*     */   }
/*     */   
/*     */   private PasswordDialog(Dialog parentWindow, String header, String footer, String title, InputTextValidator inputTextValidator, boolean user) {
/*  51 */     super(parentWindow);
/*  52 */     init(header, footer, title, inputTextValidator, user);
/*     */   }
/*     */ 
/*     */   
/*     */   public void actionPerformed(ActionEvent event) {
/*  57 */     Object source = event.getSource();
/*  58 */     if (source == this.btnOk) {
/*  59 */       doOk();
/*  60 */     } else if (source == this.btnCancel) {
/*  61 */       doCancel();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void setUser(String user) {
/*  66 */     this.txtUser.setText(user);
/*     */   }
/*     */   
/*     */   public String getPassword() {
/*  70 */     return this.txtPassword.getText();
/*     */   }
/*     */   
/*     */   public String getUser() {
/*  74 */     return this.txtUser.getText();
/*     */   }
/*     */   
/*     */   public boolean isCanceled() {
/*  78 */     return this.canceled;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVisible(boolean visible) {
/*  83 */     if (visible) {
/*  84 */       this.canceled = true;
/*     */     }
/*  86 */     super.setVisible(visible);
/*     */   }
/*     */   
/*     */   private void init(String header, String footer, String title, InputTextValidator inputTextValidator, boolean user) {
/*  90 */     this.header = header;
/*  91 */     this.footer = footer;
/*  92 */     this.title = title;
/*  93 */     this.inputTextValidator = inputTextValidator;
/*  94 */     this.user = user;
/*     */     
/*  96 */     setupControls();
/*  97 */     setupComponent();
/*  98 */     setupEventHandlers();
/*  99 */     setupAccelerators();
/*     */   }
/*     */   
/*     */   private void setupControls() {
/* 103 */     this.txtPassword = new JPasswordField();
/* 104 */     this.txtPassword.setName("password");
/* 105 */     adjustPreferredSize(this.txtPassword);
/*     */     
/* 107 */     this.txtUser = new JTextField();
/* 108 */     this.txtUser.setName("user");
/* 109 */     adjustPreferredSize(this.txtUser);
/*     */     
/* 111 */     this.btnOk = new JButton(Messages.getString(".ButtonOK"));
/* 112 */     this.btnOk.setName("ok");
/* 113 */     this.btnCancel = new JButton(Messages.getString(".ButtonCancel"));
/* 114 */     this.btnCancel.setName("cancel");
/*     */   }
/*     */   
/*     */   private void adjustPreferredSize(JTextField textField) {
/* 118 */     Dimension preferredSize = textField.getPreferredSize();
/* 119 */     preferredSize.width = this.user ? 250 : 350;
/* 120 */     textField.setPreferredSize(preferredSize);
/*     */   }
/*     */   
/*     */   private void setupComponent() {
/* 124 */     setModal(true);
/* 125 */     setTitle(this.title);
/* 126 */     setDefaultCloseOperation(0);
/*     */     
/* 128 */     setContentPane(createContentPanel());
/* 129 */     getRootPane().setDefaultButton(this.btnOk);
/* 130 */     setBounds(getFrameBounds());
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getFrameHeight() {
/* 135 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getFrameWidth() {
/* 140 */     return -1;
/*     */   }
/*     */   
/*     */   private JPanel createContentPanel() {
/* 144 */     JPanel panel = new JPanel(new GridBagLayout());
/* 145 */     GridBagConstraints gc = new GridBagConstraints();
/* 146 */     Insets defaultInsets = new Insets(5, 5, 0, 5);
/* 147 */     Insets innerInsets = new Insets(0, 5, 0, 5);
/* 148 */     gc.insets = defaultInsets;
/* 149 */     gc.anchor = 21;
/* 150 */     gc.gridx = 0;
/* 151 */     gc.gridy = 0;
/* 152 */     gc.gridheight = 2;
/* 153 */     panel.add(new JLabel(ICON), gc);
/* 154 */     gc.gridx = 1;
/* 155 */     gc.gridheight = 1;
/* 156 */     gc.gridwidth = 2;
/* 157 */     if (this.header != null) {
/* 158 */       panel.add(new JLabel(this.header), gc);
/*     */     }
/* 160 */     gc.gridwidth = 1;
/* 161 */     gc.gridy++;
/*     */     
/* 163 */     if (this.user) {
/* 164 */       panel.add(new JLabel(Messages.getString(".UserInfoName")), gc);
/* 165 */       gc.gridy++;
/* 166 */       gc.insets = innerInsets;
/* 167 */       panel.add(new JLabel(Messages.getString(".PasswordEditLabel")), gc);
/* 168 */       gc.gridy--;
/* 169 */       gc.insets = defaultInsets;
/*     */     } 
/* 171 */     gc.gridx = 2;
/* 172 */     gc.weightx = 1.0D;
/* 173 */     gc.fill = 2;
/* 174 */     if (this.user) {
/* 175 */       panel.add(this.txtUser, gc);
/* 176 */       gc.insets = innerInsets;
/* 177 */       gc.gridy++;
/*     */     } 
/* 179 */     panel.add(this.txtPassword, gc);
/* 180 */     gc.insets = defaultInsets;
/* 181 */     gc.gridy++;
/*     */     
/* 183 */     gc.gridx = 1;
/* 184 */     gc.gridwidth = 2;
/* 185 */     gc.weighty = 1.0D;
/* 186 */     gc.fill = 1;
/* 187 */     if (this.footer != null) {
/* 188 */       this.displayTextArea = new DisplayTextArea();
/* 189 */       this.displayTextArea.setText(this.footer);
/* 190 */       panel.add((Component)this.displayTextArea, gc);
/* 191 */       gc.gridy++;
/*     */     } else {
/* 193 */       panel.add(new JPanel(), gc);
/*     */     } 
/*     */     
/* 196 */     gc.weighty = 0.0D;
/* 197 */     gc.fill = 2;
/*     */     
/* 199 */     gc.gridy++;
/* 200 */     gc.gridx = 0;
/* 201 */     gc.gridwidth = 3;
/* 202 */     gc.insets.bottom = 5;
/*     */     
/* 204 */     panel.add(
/* 205 */         ButtonUtil.createHorizontalButtonBox(new Component[] { this.btnOk, this.btnCancel }, 1), gc);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 212 */     return panel;
/*     */   }
/*     */   
/*     */   protected void setupEventHandlers() {
/* 216 */     this.btnOk.addActionListener(this);
/* 217 */     this.btnCancel.addActionListener(this);
/*     */     
/* 219 */     setDefaultCloseOperation(0);
/* 220 */     addWindowListener(new WindowAdapter()
/*     */         {
/*     */           public void windowClosing(WindowEvent event) {
/* 223 */             PasswordDialog.this.doCancel();
/*     */           }
/*     */ 
/*     */           
/*     */           public void windowActivated(WindowEvent event) {
/* 228 */             if (PasswordDialog.this.user && PasswordDialog.this.txtUser.getText().isEmpty()) {
/* 229 */               PasswordDialog.this.txtUser.requestFocus();
/*     */             } else {
/* 231 */               PasswordDialog.this.txtPassword.requestFocus();
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */   public static interface InputTextValidator {
/*     */     boolean isValidInputText(String param1String, PasswordDialog param1PasswordDialog); }
/*     */   private void doOk() {
/* 239 */     if (this.inputTextValidator != null && !this.inputTextValidator.isValidInputText(getPassword(), this)) {
/* 240 */       this.txtPassword.requestFocus();
/*     */       
/*     */       return;
/*     */     } 
/* 244 */     this.canceled = false;
/* 245 */     setVisible(false);
/*     */   }
/*     */   
/*     */   private void doCancel() {
/* 249 */     this.canceled = true;
/* 250 */     setVisible(false);
/*     */   }
/*     */   
/*     */   private void setupAccelerators() {
/* 254 */     KeyboardUtil.addAccelerator(1, this.btnCancel, (JComponent)
/*     */         
/* 256 */         getContentPane(), this, 27, 0);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\PasswordDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */