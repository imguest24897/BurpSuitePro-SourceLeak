/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.UiUtil;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.windows.WinUser;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.platform.win32.ObjectPicker;
/*     */ import com.install4j.runtime.util.TextAndButtonPanel;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class UserSelectorComponent
/*     */   extends LeadingLabelComponent
/*     */ {
/*     */   private boolean showUsers = true;
/*     */   private boolean showGroups = false;
/*     */   private boolean showWellKnownPrincipals = false;
/*  28 */   private String variableName = ""; private boolean multipleSelection = false; private boolean onlyLocal = false; private boolean showCreateButton = false;
/*  29 */   private String userCreatedVariableName = "";
/*  30 */   private String localGroupVariableName = "";
/*  31 */   private String groupCreatedVariableName = "";
/*  32 */   private String passwordFormComponentId = "";
/*     */   
/*     */   private JTextField txtUsers;
/*     */   private JButton btnBrowse;
/*     */   private JButton btnCreate;
/*     */   private String[] selectedSids;
/*  38 */   private List<WinUser.AddUserResult> createdUserResults = new ArrayList<>();
/*     */   
/*     */   public boolean isShowUsers() {
/*  41 */     return replaceWithTextOverride("showUsers", this.showUsers);
/*     */   }
/*     */   
/*     */   public void setShowUsers(boolean showUsers) {
/*  45 */     this.showUsers = showUsers;
/*     */   }
/*     */   
/*     */   public boolean isShowGroups() {
/*  49 */     return replaceWithTextOverride("showGroups", this.showGroups);
/*     */   }
/*     */   
/*     */   public void setShowGroups(boolean showGroups) {
/*  53 */     this.showGroups = showGroups;
/*     */   }
/*     */   
/*     */   public boolean isShowWellKnownPrincipals() {
/*  57 */     return replaceWithTextOverride("showWellKnownPrincipals", this.showWellKnownPrincipals);
/*     */   }
/*     */   
/*     */   public void setShowWellKnownPrincipals(boolean showWellKnownPrincipals) {
/*  61 */     this.showWellKnownPrincipals = showWellKnownPrincipals;
/*     */   }
/*     */   
/*     */   public boolean isMultipleSelection() {
/*  65 */     return replaceWithTextOverride("multipleSelection", this.multipleSelection);
/*     */   }
/*     */   
/*     */   public void setMultipleSelection(boolean multipleSelection) {
/*  69 */     this.multipleSelection = multipleSelection;
/*     */   }
/*     */   
/*     */   public boolean isOnlyLocal() {
/*  73 */     return replaceWithTextOverride("onlyLocal", this.onlyLocal);
/*     */   }
/*     */   
/*     */   public void setOnlyLocal(boolean onlyLocal) {
/*  77 */     this.onlyLocal = onlyLocal;
/*     */   }
/*     */   
/*     */   public boolean isShowCreateButton() {
/*  81 */     return replaceWithTextOverride("showCreateButton", this.showCreateButton);
/*     */   }
/*     */   
/*     */   public void setShowCreateButton(boolean showCreateButton) {
/*  85 */     this.showCreateButton = showCreateButton;
/*     */   }
/*     */   
/*     */   public String getVariableName() {
/*  89 */     return replaceVariables(this.variableName);
/*     */   }
/*     */   
/*     */   public void setVariableName(String variableName) {
/*  93 */     this.variableName = variableName;
/*     */   }
/*     */   
/*     */   public String getUserCreatedVariableName() {
/*  97 */     return replaceVariables(this.userCreatedVariableName);
/*     */   }
/*     */   
/*     */   public void setUserCreatedVariableName(String userCreatedVariableName) {
/* 101 */     this.userCreatedVariableName = userCreatedVariableName;
/*     */   }
/*     */   
/*     */   public String getLocalGroupVariableName() {
/* 105 */     return replaceVariables(this.localGroupVariableName);
/*     */   }
/*     */   
/*     */   public void setLocalGroupVariableName(String localGroupVariableName) {
/* 109 */     this.localGroupVariableName = localGroupVariableName;
/*     */   }
/*     */   
/*     */   public String getGroupCreatedVariableName() {
/* 113 */     return replaceVariables(this.groupCreatedVariableName);
/*     */   }
/*     */   
/*     */   public void setGroupCreatedVariableName(String groupCreatedVariableName) {
/* 117 */     this.groupCreatedVariableName = groupCreatedVariableName;
/*     */   }
/*     */   
/*     */   public String getPasswordFormComponentId() {
/* 121 */     return replaceVariables(this.passwordFormComponentId);
/*     */   }
/*     */   
/*     */   public void setPasswordFormComponentId(String passwordFormComponentId) {
/* 125 */     this.passwordFormComponentId = passwordFormComponentId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 130 */     super.setFormEnvironment(formEnvironment);
/* 131 */     if (this.txtUsers != null && formEnvironment != null) {
/* 132 */       this.txtUsers.setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/* 138 */     this.txtUsers = new JTextField();
/* 139 */     this.txtUsers.setEditable(false);
/* 140 */     this.btnBrowse = new JButton(Messages.getString(".ButtonBrowse"));
/* 141 */     this.btnBrowse.addActionListener(e -> doBrowse());
/* 142 */     TextAndButtonPanel panel = new TextAndButtonPanel(this.txtUsers, this.btnBrowse);
/*     */     
/* 144 */     if (isShowUsers() && isShowCreateButton()) {
/* 145 */       this.btnCreate = new JButton(Messages.getString(".ButtonCreateUser"));
/* 146 */       GridBagConstraints gc = new GridBagConstraints();
/* 147 */       gc.weighty = 0.0D;
/* 148 */       gc.gridy = 0;
/* 149 */       gc.gridx = 2;
/* 150 */       gc.weightx = 0.0D;
/* 151 */       gc.fill = 0;
/* 152 */       gc.insets.left = 5;
/* 153 */       panel.add(this.btnCreate, gc);
/*     */       
/* 155 */       this.btnCreate.addActionListener(e -> doCreate());
/*     */       
/* 157 */       setMultipleSelection(false);
/*     */     } 
/*     */ 
/*     */     
/* 161 */     return (JComponent)panel;
/*     */   }
/*     */ 
/*     */   
/*     */   public void initialize() {
/* 166 */     super.initialize();
/*     */     
/* 168 */     if (isMultipleSelection()) {
/* 169 */       this.selectedSids = (String[])getInitValue(null, getVariableName(), String[].class);
/*     */     } else {
/*     */       
/* 172 */       String initialSid = (String)getInitValue(null, getVariableName(), String.class);
/* 173 */       if (initialSid != null) {
/* 174 */         this.selectedSids = new String[] { initialSid };
/*     */       }
/*     */     } 
/* 177 */     updateTextField();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/* 182 */     String variableName = getVariableName();
/* 183 */     Object variableValue = getVariableValue();
/* 184 */     Context context = getContext();
/* 185 */     context.setVariable(variableName, variableValue);
/* 186 */     context.registerResponseFileVariable(variableName);
/*     */     
/* 188 */     if (isShowUsers() && isShowCreateButton()) {
/* 189 */       if (getUserCreatedVariableName().length() > 0) {
/* 190 */         context.setVariable(getUserCreatedVariableName(), Boolean.FALSE);
/*     */       }
/* 192 */       if (getLocalGroupVariableName().length() > 0) {
/* 193 */         context.setVariable(getLocalGroupVariableName(), "");
/*     */       }
/* 195 */       if (getGroupCreatedVariableName().length() > 0) {
/* 196 */         context.setVariable(getGroupCreatedVariableName(), Boolean.FALSE);
/*     */       }
/*     */       
/* 199 */       String userSid = (String)variableValue;
/* 200 */       for (Iterator<WinUser.AddUserResult> iterator = this.createdUserResults.iterator(); iterator.hasNext(); ) {
/* 201 */         WinUser.AddUserResult userResult = iterator.next();
/* 202 */         if (Objects.equals(userResult.getUserSid(), userSid)) {
/* 203 */           if (getUserCreatedVariableName().length() > 0) {
/* 204 */             context.setVariable(getUserCreatedVariableName(), Boolean.TRUE);
/* 205 */             context.registerResponseFileVariable(getUserCreatedVariableName());
/*     */           } 
/* 207 */           if (getLocalGroupVariableName().length() > 0 && userResult.getGroupSid() != null) {
/* 208 */             context.setVariable(getLocalGroupVariableName(), userResult.getGroupSid());
/* 209 */             context.registerResponseFileVariable(getLocalGroupVariableName());
/*     */           } 
/* 211 */           if (getGroupCreatedVariableName().length() > 0) {
/* 212 */             context.setVariable(getGroupCreatedVariableName(), Boolean.valueOf(userResult.isGroupCreated()));
/* 213 */             context.registerResponseFileVariable(getGroupCreatedVariableName());
/*     */           }  continue;
/*     */         } 
/* 216 */         WinUser.deleteUser(userResult.getUserSid());
/* 217 */         if (userResult.isGroupCreated() && userResult.getGroupSid() != null) {
/* 218 */           WinUser.deleteLocalGroup(userResult.getGroupSid());
/*     */         }
/* 220 */         iterator.remove();
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 225 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/* 230 */     super.setEnabled(enabled);
/* 231 */     this.btnBrowse.setEnabled(enabled);
/* 232 */     if (this.btnCreate != null) {
/* 233 */       this.btnCreate.setEnabled(enabled);
/*     */     }
/*     */   }
/*     */   
/*     */   private Object getVariableValue() {
/* 238 */     if (isMultipleSelection()) {
/* 239 */       if (this.selectedSids == null) {
/* 240 */         return new String[0];
/*     */       }
/* 242 */       return this.selectedSids;
/*     */     } 
/*     */     
/* 245 */     if (this.selectedSids == null || this.selectedSids.length != 1) {
/* 246 */       return "";
/*     */     }
/* 248 */     return this.selectedSids[0];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void doBrowse() {
/* 255 */     if (getFormEnvironment().isDesignTime()) {
/*     */       return;
/*     */     }
/*     */     
/* 259 */     ObjectPicker.Result[] results = ObjectPicker.show(isMultipleSelection(), isShowGroups(), isShowUsers(), isShowWellKnownPrincipals(), isOnlyLocal());
/* 260 */     if (results != null) {
/* 261 */       this.selectedSids = new String[results.length];
/* 262 */       for (int i = 0; i < results.length; i++) {
/* 263 */         ObjectPicker.Result result = results[i];
/* 264 */         this.selectedSids[i] = result.getSid();
/*     */       } 
/* 266 */       updateTextField();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void updateTextField() {
/* 271 */     if (this.selectedSids != null) {
/* 272 */       StringBuilder buffer = new StringBuilder();
/* 273 */       for (String selectedSid : this.selectedSids) {
/* 274 */         if (buffer.length() > 0) {
/* 275 */           buffer.append("; ");
/*     */         }
/* 277 */         String accountName = WinUser.getAccountName(selectedSid);
/* 278 */         if (accountName != null) {
/* 279 */           buffer.append(accountName);
/*     */         }
/*     */       } 
/* 282 */       this.txtUsers.setText(buffer.toString());
/*     */     } 
/*     */   }
/*     */   
/*     */   private void doCreate() {
/* 287 */     if (getFormEnvironment().isDesignTime()) {
/*     */       return;
/*     */     }
/*     */     
/* 291 */     CreateUserDialog dialog = new CreateUserDialog(UiUtil.getParentWindow());
/* 292 */     dialog.setVisible(true);
/* 293 */     dialog.dispose();
/* 294 */     if (!dialog.isCanceled()) {
/* 295 */       String sid = dialog.getResult().getUserSid();
/* 296 */       this.selectedSids = new String[] { sid };
/* 297 */       this.txtUsers.setText(WinUser.getAccountName(sid));
/* 298 */       this.createdUserResults.add(dialog.getResult());
/* 299 */       if (getPasswordFormComponentId().length() > 0) {
/* 300 */         FormComponent passwordFormComponent = getFormEnvironment().getFormComponentById(getPasswordFormComponentId());
/* 301 */         if (passwordFormComponent instanceof TextfieldComponent) {
/* 302 */           ((JTextField)passwordFormComponent.getConfigurationObject()).setText(dialog.getPassword());
/*     */         } else {
/* 304 */           Logger.getInstance().log(this, "The password form component with ID " + getPasswordFormComponentId() + " is not a text field form component.", false);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 312 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\UserSelectorComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */