/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.windows.WinUser;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.platform.win32.ObjectPicker;
/*     */ import com.install4j.runtime.util.StandardDialog;
/*     */ import java.awt.Component;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.util.Objects;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class CreateUserDialog extends StandardDialog {
/*     */   private JTextField txtUserName;
/*     */   private JTextField txtPassword;
/*     */   private JTextField txtRepeatPassword;
/*     */   
/*     */   public CreateUserDialog(Window parentWindow) {
/*  26 */     super(parentWindow);
/*  27 */     init();
/*     */   }
/*     */   private JTextField txtDescription; private JTextField txtGroupName; private JButton btnSelectGroup; private WinUser.AddUserResult result;
/*     */   
/*     */   public void actionPerformed(ActionEvent event) {
/*  32 */     Object source = event.getSource();
/*  33 */     if (source == this.btnSelectGroup) {
/*  34 */       doSelectGroup();
/*     */     } else {
/*  36 */       super.actionPerformed(event);
/*     */     } 
/*     */   }
/*     */   
/*     */   public WinUser.AddUserResult getResult() {
/*  41 */     return this.result;
/*     */   }
/*     */   
/*     */   public String getPassword() {
/*  45 */     return this.txtPassword.getText().trim();
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getFrameHeight() {
/*  50 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getFrameWidth() {
/*  55 */     return 450;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setupControls() {
/*  60 */     super.setupControls();
/*     */     
/*  62 */     this.txtUserName = new JTextField();
/*  63 */     this.txtPassword = new JPasswordField(20);
/*  64 */     this.txtRepeatPassword = new JPasswordField(20);
/*  65 */     this.txtDescription = new JTextField();
/*  66 */     this.txtGroupName = new JTextField();
/*  67 */     this.btnSelectGroup = new JButton(Messages.getString(".ButtonBrowse"));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setupEventHandlers() {
/*  72 */     super.setupEventHandlers();
/*  73 */     this.btnSelectGroup.addActionListener((ActionListener)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setupComponent() {
/*  78 */     super.setupComponent();
/*  79 */     setTitle(Messages.getString(".ButtonCreateUser"));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void doOk() {
/*  84 */     if (checkTextField(this.txtUserName) && checkTextField(this.txtPassword) && checkPasswordsMatch()) {
/*     */       try {
/*  86 */         this.result = WinUser.addUser(this.txtUserName.getText().trim(), getPassword(), this.txtDescription.getText().trim(), WinUser.GroupCreationMode.CREATE_IF_NECESSARY, this.txtGroupName.getText().trim(), "");
/*  87 */         if (this.result.getType() != WinUser.AddUserResultType.SUCCESS) {
/*  88 */           showCreationError();
/*     */           return;
/*     */         } 
/*  91 */       } catch (Exception e) {
/*  92 */         showCreationError();
/*     */         
/*     */         return;
/*     */       } 
/*  96 */       GUIHelper.showMessage((Component)this, Messages.getString(".CreateUserSuccess"), 1);
/*     */       
/*  98 */       super.doOk();
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean checkPasswordsMatch() {
/* 103 */     if (!Objects.equals(this.txtPassword.getText(), this.txtRepeatPassword.getText())) {
/* 104 */       GUIHelper.showMessage(getOwner(), Messages.getString(".PasswordsDoNotMatch"), 2);
/* 105 */       this.txtPassword.requestFocus();
/* 106 */       return false;
/*     */     } 
/* 108 */     return true;
/*     */   }
/*     */   
/*     */   private void showCreationError() {
/* 112 */     String message = null;
/* 113 */     if (this.result.getType() == WinUser.AddUserResultType.ERROR_ACCESS_DENIED) {
/* 114 */       message = Messages.getString(".CreateUserErrorAccessDenied");
/* 115 */     } else if (this.result.getType() == WinUser.AddUserResultType.ERROR_GROUP_EXISTS) {
/* 116 */       message = Messages.getString(".CreateUserErrorGroupExists");
/* 117 */     } else if (this.result.getType() == WinUser.AddUserResultType.ERROR_GROUP_NOT_FOUND) {
/* 118 */       message = Messages.getString(".CreateUserErrorGroupNotFound");
/* 119 */     } else if (this.result.getType() == WinUser.AddUserResultType.ERROR_PASSWORD_REQUIREMENTS) {
/* 120 */       message = Messages.getString(".CreateUserErrorPasswordRequirements");
/* 121 */     } else if (this.result.getType() == WinUser.AddUserResultType.ERROR_USER_EXISTS) {
/* 122 */       message = Messages.getString(".CreateUserErrorUserExists");
/* 123 */     } else if (this.result.getType() == WinUser.AddUserResultType.ERROR_BAD_USER_NAME) {
/* 124 */       message = Messages.getString(".CreateUserErrorBadUserName");
/*     */     } 
/* 126 */     String fullMessage = Messages.getString(".CreateUserError");
/* 127 */     if (message != null) {
/* 128 */       fullMessage = fullMessage + "\n\n" + message;
/*     */     }
/* 130 */     GUIHelper.showMessage((Component)this, fullMessage, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void addScreenContent(JPanel panel) {
/* 135 */     GridBagConstraints gc = new GridBagConstraints();
/* 136 */     gc.gridx = gc.gridy = 0;
/*     */     
/* 138 */     gc.weightx = 0.0D;
/* 139 */     gc.fill = 0;
/* 140 */     gc.anchor = 21;
/* 141 */     gc.insets = new Insets(0, 0, 5, 0);
/*     */     
/* 143 */     gc.gridwidth = 2;
/* 144 */     gc.insets.bottom = 15;
/* 145 */     panel.add(new JLabel(Messages.getString(".CreateUserHeader")), gc);
/* 146 */     gc.gridy++;
/* 147 */     gc.gridwidth = 1;
/* 148 */     gc.insets.bottom = 5;
/*     */     
/* 150 */     gc.insets.right = 5;
/* 151 */     panel.add(new JLabel(Messages.getString(".UserNameLabel")), gc);
/* 152 */     gc.gridy++;
/* 153 */     panel.add(new JLabel(Messages.getString(".DescriptionLabel")), gc);
/* 154 */     gc.gridy++;
/* 155 */     panel.add(new JLabel(Messages.getString(".LocalGroupNameLabel")), gc);
/* 156 */     gc.gridy++;
/* 157 */     panel.add(new JLabel(Messages.getString(".PasswordLabel")), gc);
/* 158 */     gc.gridy++;
/* 159 */     panel.add(new JLabel(Messages.getString(".RepeatPasswordLabel")), gc);
/*     */     
/* 161 */     gc.insets.right = 0;
/* 162 */     gc.gridy -= 4;
/* 163 */     gc.gridx = 1;
/*     */     
/* 165 */     gc.weightx = 1.0D;
/* 166 */     gc.fill = 2;
/* 167 */     panel.add(this.txtUserName, gc);
/* 168 */     gc.gridy++;
/* 169 */     panel.add(this.txtDescription, gc);
/* 170 */     gc.gridy++;
/* 171 */     panel.add((Component)new TextAndButtonPanel(this.txtGroupName, this.btnSelectGroup), gc);
/* 172 */     gc.gridy++;
/* 173 */     gc.fill = 0;
/* 174 */     panel.add(this.txtPassword, gc);
/* 175 */     gc.gridy++;
/* 176 */     panel.add(this.txtRepeatPassword, gc);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean isFillVertical() {
/* 182 */     return false;
/*     */   }
/*     */   
/*     */   private void doSelectGroup() {
/* 186 */     ObjectPicker.Result[] results = ObjectPicker.show(false, true, false, false, true);
/* 187 */     if (results != null && results.length > 0)
/* 188 */       this.txtGroupName.setText(results[0].getName()); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\CreateUserDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */