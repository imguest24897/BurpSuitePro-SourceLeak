/*     */ package com.install4j.runtime.beans.screens;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.frontend.components.DirectorySelector;
/*     */ import com.install4j.runtime.installer.frontend.components.ProgramGroupSelector;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.platform.win32.FolderInfo;
/*     */ import java.awt.Component;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.File;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class StandardProgramGroupScreen extends SystemScreen {
/*  24 */   private String programGroupName = ""; private boolean programGroupEnabled = true;
/*     */   private boolean allUsers = true;
/*     */   private boolean unixSymlinks = true;
/*  27 */   private String linkDirectory = "/usr/local/bin";
/*     */   
/*     */   private boolean allowUserChangeEnabled = true;
/*     */   private boolean allowUserChangeAllUsers = true;
/*     */   private boolean showWarningIfExists = false;
/*     */   
/*     */   public StandardProgramGroupScreen() {
/*  34 */     InstallerVariables.registerResponseFileVariable("sys.programGroupDisabled");
/*  35 */     if (InstallerUtil.isWindows()) {
/*  36 */       InstallerVariables.registerResponseFileVariable("sys.programGroupName");
/*  37 */       InstallerVariables.registerResponseFileVariable("sys.programGroupAllUsers");
/*  38 */       InstallerVariables.registerVariableProvider("sys.programGroupDir", new InstallerVariables.VariableProvider()
/*     */           {
/*     */             public Object getVariable() {
/*  41 */               String programGroupName = (String)InstallerVariables.getVariable("sys.programGroupName");
/*  42 */               boolean allUsers = InstallerVariables.getBooleanVariable("sys.programGroupAllUsers");
/*  43 */               if (programGroupName != null) {
/*  44 */                 return (new File(FolderInfo.getSpecialFolder(3, allUsers), programGroupName)).getAbsolutePath();
/*     */               }
/*  46 */               return null;
/*     */             }
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             public void setVariable(Object value) {}
/*     */           });
/*     */     } else {
/*  55 */       InstallerVariables.registerResponseFileVariable("sys.symlinkDir");
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean isProgramGroupEnabled() {
/*  60 */     return replaceWithTextOverride("programGroupEnabled", this.programGroupEnabled);
/*     */   }
/*     */   
/*     */   public void setProgramGroupEnabled(boolean programGroupEnabled) {
/*  64 */     this.programGroupEnabled = programGroupEnabled;
/*     */   }
/*     */   
/*     */   public String getProgramGroupName() {
/*  68 */     return replaceVariables(replaceVariables(this.programGroupName));
/*     */   }
/*     */   
/*     */   public void setProgramGroupName(String programGroupName) {
/*  72 */     this.programGroupName = programGroupName;
/*     */   }
/*     */   
/*     */   public boolean isAllUsers() {
/*  76 */     return replaceWithTextOverride("allUsers", this.allUsers);
/*     */   }
/*     */   
/*     */   public void setAllUsers(boolean allUsers) {
/*  80 */     this.allUsers = allUsers;
/*     */   }
/*     */   
/*     */   public String getLinkDirectory() {
/*  84 */     return replaceVariables(replaceVariables(this.linkDirectory));
/*     */   }
/*     */   
/*     */   public boolean isUnixSymlinks() {
/*  88 */     return replaceWithTextOverride("unixSymlinks", this.unixSymlinks);
/*     */   }
/*     */   
/*     */   public void setUnixSymlinks(boolean unixSymlinks) {
/*  92 */     this.unixSymlinks = unixSymlinks;
/*     */   }
/*     */   
/*     */   public void setLinkDirectory(String linkDirectory) {
/*  96 */     this.linkDirectory = linkDirectory;
/*     */   }
/*     */   
/*     */   public boolean isAllowUserChangeEnabled() {
/* 100 */     return replaceWithTextOverride("allowUserChangeEnabled", this.allowUserChangeEnabled);
/*     */   }
/*     */   
/*     */   public void setAllowUserChangeEnabled(boolean allowUserChangeEnabled) {
/* 104 */     this.allowUserChangeEnabled = allowUserChangeEnabled;
/*     */   }
/*     */   
/*     */   public boolean isAllowUserChangeAllUsers() {
/* 108 */     return replaceWithTextOverride("allowUserChangeAllUsers", this.allowUserChangeAllUsers);
/*     */   }
/*     */   
/*     */   public void setAllowUserChangeAllUsers(boolean allowUserChangeAllUsers) {
/* 112 */     this.allowUserChangeAllUsers = allowUserChangeAllUsers;
/*     */   }
/*     */   
/*     */   public boolean isShowWarningIfExists() {
/* 116 */     return replaceWithTextOverride("showWarningIfExists", this.showWarningIfExists);
/*     */   }
/*     */   
/*     */   public void setShowWarningIfExists(boolean showWarningIfExists) {
/* 120 */     this.showWarningIfExists = showWarningIfExists;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SystemScreen.DefaultPanel createPanel() {
/* 125 */     if (Util.isWindowsInstaller()) {
/* 126 */       return new WindowsPanel();
/*     */     }
/* 128 */     return new UnixPanel();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isHidden() {
/* 134 */     boolean applicablePlatform = (Util.isWindowsInstaller() || Util.isUnixInstaller());
/* 135 */     boolean noSymlinks = (Util.isUnixInstaller() && !isUnixSymlinks());
/* 136 */     boolean hidden = (!applicablePlatform || noSymlinks);
/* 137 */     if (hidden) {
/* 138 */       getContext().setVariable("sys.programGroupDisabled", Boolean.TRUE);
/*     */     }
/* 140 */     return hidden;
/*     */   }
/*     */ 
/*     */   
/*     */   public void willActivate() {
/* 145 */     super.willActivate();
/* 146 */     getPanel().willActivate();
/*     */   }
/*     */ 
/*     */   
/*     */   public void activated() {
/* 151 */     super.activated();
/* 152 */     getPanel().activated();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean next() {
/* 157 */     return (getPanel().next() && super.next());
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean checkCompleted() {
/* 162 */     return (getPanel().checkCompleted() && super.checkCompleted());
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTitle() {
/* 167 */     return Util.isWindowsInstaller() ? getMessage(".WizardSelectProgramGroup") : getMessage(".WizardSelectLinkDir");
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSubTitle() {
/* 172 */     return Util.isWindowsInstaller() ? getMessage(".SelectStartMenuFolderDesc") : Messages.format(getMessage(".SelectLinkDirDesc"), new Object[] { getApplicationName() });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillVertical() {
/* 177 */     return Util.isWindowsInstaller();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 182 */     if (!super.handleConsole(console)) {
/* 183 */       return false;
/*     */     }
/* 185 */     Context context = getContext();
/*     */     
/* 187 */     boolean windows = InstallerUtil.isWindows();
/* 188 */     if (isAllowUserChangeEnabled()) {
/* 189 */       boolean enabled = console.askYesNo(getMessage(windows ? ".ConsoleProgramGroupCheck" : ".ConsoleSymlinksCheck"), isProgramGroupEnabledOverridden(context));
/* 190 */       context.setVariable("sys.programGroupDisabled", Boolean.valueOf(!enabled));
/* 191 */       if (!enabled) {
/* 192 */         return true;
/*     */       }
/*     */     } 
/* 195 */     if (windows) {
/*     */       String programGroup;
/*     */       
/* 198 */       Boolean allUsers = null;
/*     */       do {
/* 200 */         programGroup = console.askString(getMessage(".SelectStartMenuFolderDesc"), getProgramGroupNameOverridden(context));
/* 201 */         if (!isAskChangeAllUsers())
/* 202 */           continue;  allUsers = Boolean.valueOf(console.askYesNo(getMessage(".ProgramGroupAllUsers"), isAllUsersOverridden(context)));
/*     */       }
/* 204 */       while (!ProgramGroupSelector.checkProgramGroup(programGroup, (allUsers != null) ? allUsers.booleanValue() : isAllUsersOverridden(context), isShowWarningIfExists(), null));
/*     */       
/* 206 */       context.setVariable("sys.programGroupName", programGroup);
/* 207 */       if (allUsers != null) {
/* 208 */         context.setVariable("sys.programGroupAllUsers", allUsers);
/*     */       }
/*     */     } else {
/* 211 */       context.setVariable("sys.symlinkDir", console.askString(
/* 212 */             Messages.format(getMessage(".SelectLinkDirLabel"), new Object[] { getApplicationName()
/* 213 */               }), getLinkDirectoryOverridden(context)));
/*     */     } 
/* 215 */     return true;
/*     */   }
/*     */   
/*     */   private boolean isAskChangeAllUsers() {
/* 219 */     return (isAllowUserChangeAllUsers() && (HelperCommunication.getInstance().hasElevatedHelper() || Util.hasFullAdminRights()));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleUnattended() {
/* 224 */     if (!super.handleUnattended()) {
/* 225 */       return false;
/*     */     }
/* 227 */     Context context = getContext();
/* 228 */     if (isAllowUserChangeEnabled()) {
/* 229 */       boolean enabled = isProgramGroupEnabledOverridden(context);
/* 230 */       context.setVariable("sys.programGroupDisabled", Boolean.valueOf(!enabled));
/* 231 */       if (!enabled) {
/* 232 */         return true;
/*     */       }
/*     */     } 
/* 235 */     if (InstallerUtil.isWindows()) {
/* 236 */       context.setVariable("sys.programGroupName", getProgramGroupNameOverridden(context));
/* 237 */       context.setVariable("sys.programGroupAllUsers", Boolean.valueOf(isAllUsersOverridden(context)));
/*     */     } else {
/* 239 */       context.setVariable("sys.symlinkDir", getLinkDirectoryOverridden(context));
/*     */     } 
/*     */     
/* 242 */     return true;
/*     */   }
/*     */   
/*     */   private boolean isProgramGroupEnabledOverridden(Context context) {
/*     */     boolean enabled;
/* 247 */     Object programGroupDisabledVariableValue = context.getVariable("sys.programGroupDisabled");
/*     */     
/* 249 */     if (!(programGroupDisabledVariableValue instanceof Boolean)) {
/* 250 */       enabled = isProgramGroupEnabled();
/*     */     } else {
/* 252 */       enabled = !((Boolean)programGroupDisabledVariableValue).booleanValue();
/*     */     } 
/* 254 */     return enabled;
/*     */   }
/*     */   
/*     */   private String getProgramGroupNameOverridden(Context context) {
/* 258 */     Object programGroupNameVariableValue = context.getVariable("sys.programGroupName");
/* 259 */     if (programGroupNameVariableValue == null) {
/* 260 */       programGroupNameVariableValue = getProgramGroupName();
/*     */     }
/* 262 */     return programGroupNameVariableValue.toString();
/*     */   }
/*     */   private boolean isAllUsersOverridden(Context context) {
/*     */     boolean allUsers;
/* 266 */     Object allUsersVariableValue = context.getVariable("sys.programGroupAllUsers");
/*     */     
/* 268 */     if (!(allUsersVariableValue instanceof Boolean)) {
/* 269 */       allUsers = isAllUsers();
/*     */     } else {
/* 271 */       allUsers = ((Boolean)allUsersVariableValue).booleanValue();
/*     */     } 
/* 273 */     return allUsers;
/*     */   }
/*     */   private String getLinkDirectoryOverridden(Context context) {
/*     */     String linkDirectory;
/* 277 */     Object linkDirVariableValue = context.getVariable("sys.symlinkDir");
/*     */     
/* 279 */     if (linkDirVariableValue == null) {
/* 280 */       linkDirectory = getLinkDirectory();
/*     */     } else {
/* 282 */       linkDirectory = linkDirVariableValue.toString();
/*     */     } 
/* 284 */     return linkDirectory;
/*     */   }
/*     */   
/*     */   private class WindowsPanel extends SystemScreen.DefaultPanel implements ActionListener {
/*     */     private ProgramGroupSelector programGroupSelector;
/*     */     private JCheckBox chkEnabled;
/*     */     private JCheckBox chkAllUsers;
/*     */     
/*     */     private WindowsPanel() {}
/*     */     
/*     */     public void actionPerformed(ActionEvent event) {
/* 295 */       Object source = event.getSource();
/* 296 */       if (source == this.chkEnabled) {
/* 297 */         checkEnabled();
/* 298 */       } else if (source == this.chkAllUsers) {
/* 299 */         this.programGroupSelector.setAllUsers(this.chkAllUsers.isSelected());
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean next() {
/* 305 */       Context context = StandardProgramGroupScreen.this.getContext();
/* 306 */       String selectedProgramGroup = this.programGroupSelector.getSelectedProgramGroup();
/* 307 */       boolean allUsers = this.chkAllUsers.isSelected();
/* 308 */       context.setVariable("sys.programGroupName", selectedProgramGroup);
/* 309 */       if (StandardProgramGroupScreen.this.isAllowUserChangeEnabled()) {
/* 310 */         context.setVariable("sys.programGroupDisabled", Boolean.valueOf(!this.chkEnabled.isSelected()));
/*     */       }
/* 312 */       if (StandardProgramGroupScreen.this.isAllowUserChangeAllUsers()) {
/* 313 */         context.setVariable("sys.programGroupAllUsers", Boolean.valueOf(allUsers));
/*     */       }
/*     */       
/* 316 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void willActivate() {
/* 321 */       super.willActivate();
/* 322 */       Context context = StandardProgramGroupScreen.this.getContext();
/*     */       
/* 324 */       boolean allUsers = StandardProgramGroupScreen.this.isAllUsersOverridden(context);
/* 325 */       this.programGroupSelector.setAllUsers(allUsers);
/* 326 */       this.chkAllUsers.setSelected(allUsers);
/* 327 */       this.programGroupSelector.setSelectedProgramGroup(StandardProgramGroupScreen.this.getProgramGroupNameOverridden(context));
/* 328 */       this.chkEnabled.setSelected(StandardProgramGroupScreen.this.isProgramGroupEnabledOverridden(context));
/*     */       
/* 330 */       checkEnabled();
/*     */     }
/*     */ 
/*     */     
/*     */     public void activated() {
/* 335 */       this.programGroupSelector.focusTextField();
/* 336 */       this.chkAllUsers.setVisible(StandardProgramGroupScreen.this.isAskChangeAllUsers());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean checkCompleted() {
/* 341 */       return (!this.chkEnabled.isSelected() || this.programGroupSelector.checkSelectedProgramGroup());
/*     */     }
/*     */ 
/*     */     
/*     */     protected void setupControls() {
/* 346 */       super.setupControls();
/*     */       
/* 348 */       this.programGroupSelector = new ProgramGroupSelector(true, StandardProgramGroupScreen.this.isShowWarningIfExists(), StandardProgramGroupScreen.this.getContext().getWizardContext());
/* 349 */       this.chkEnabled = new JCheckBox(StandardProgramGroupScreen.this.getMessage(".ProgramGroupCheck"));
/* 350 */       this.chkAllUsers = new JCheckBox(StandardProgramGroupScreen.this.getMessage(".ProgramGroupAllUsers"));
/* 351 */       this.chkAllUsers.setSelected(true);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void setupComponent() {
/* 356 */       super.setupComponent();
/* 357 */       checkEnabled();
/*     */     }
/*     */ 
/*     */     
/*     */     protected void setupEventHandlers() {
/* 362 */       super.setupEventHandlers();
/*     */       
/* 364 */       this.chkEnabled.addActionListener(this);
/* 365 */       this.chkAllUsers.addActionListener(this);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     protected void addScreenContent(JPanel panel, GridBagConstraints gc) {
/* 371 */       String headerMessage = StandardProgramGroupScreen.this.getMessage(".SelectStartMenuFolderLabel");
/* 372 */       if (headerMessage.trim().length() > 0) {
/* 373 */         StandardProgramGroupScreen.this.addDisplayTextArea(headerMessage, panel, gc);
/*     */       }
/* 375 */       gc.insets.top = 5;
/*     */       
/* 377 */       if (StandardProgramGroupScreen.this.isAllowUserChangeEnabled()) {
/* 378 */         panel.add(this.chkEnabled, gc);
/* 379 */         gc.gridy++;
/*     */       } 
/*     */       
/* 382 */       gc.weightx = 1.0D;
/* 383 */       gc.weighty = 1.0D;
/*     */       
/* 385 */       gc.fill = 1;
/* 386 */       panel.add((Component)this.programGroupSelector, gc);
/* 387 */       gc.gridy++;
/*     */       
/* 389 */       gc.weightx = 0.0D;
/* 390 */       gc.weighty = 0.0D;
/* 391 */       gc.fill = 2;
/* 392 */       gc.anchor = 21;
/*     */       
/* 394 */       gc.insets.bottom = 5;
/* 395 */       panel.add(this.chkAllUsers, gc);
/* 396 */       gc.gridy++;
/* 397 */       gc.insets.top = 0;
/*     */     }
/*     */ 
/*     */     
/*     */     private void checkEnabled() {
/* 402 */       boolean enabled = this.chkEnabled.isSelected();
/*     */       
/* 404 */       this.programGroupSelector.setEnabled(enabled);
/* 405 */       this.chkAllUsers.setEnabled(enabled);
/*     */     }
/*     */   }
/*     */   
/*     */   private class UnixPanel
/*     */     extends SystemScreen.DefaultPanel
/*     */     implements ActionListener {
/*     */     private DirectorySelector directorySelector;
/*     */     private JCheckBox chkEnabled;
/*     */     
/*     */     private UnixPanel() {}
/*     */     
/*     */     public boolean next() {
/* 418 */       Context context = StandardProgramGroupScreen.this.getContext();
/* 419 */       context.setVariable("sys.symlinkDir", this.directorySelector.getSelectedFile().getPath());
/* 420 */       if (StandardProgramGroupScreen.this.isAllowUserChangeEnabled()) {
/* 421 */         context.setVariable("sys.programGroupDisabled", Boolean.valueOf(!this.chkEnabled.isSelected()));
/*     */       }
/*     */       
/* 424 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void willActivate() {
/* 429 */       super.willActivate();
/* 430 */       Context context = StandardProgramGroupScreen.this.getContext();
/* 431 */       this.directorySelector.setSelectedFile(new File(StandardProgramGroupScreen.this.getLinkDirectoryOverridden(context)));
/* 432 */       this.chkEnabled.setSelected(StandardProgramGroupScreen.this.isProgramGroupEnabledOverridden(context));
/* 433 */       checkEnabled();
/*     */     }
/*     */ 
/*     */     
/*     */     public void activated() {
/* 438 */       super.activated();
/* 439 */       this.directorySelector.focusTextField();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean checkCompleted() {
/* 444 */       return ((!this.chkEnabled.isSelected() || this.directorySelector.checkSelectedFile()) && super.checkCompleted());
/*     */     }
/*     */ 
/*     */     
/*     */     protected void addScreenContent(JPanel panel, GridBagConstraints gc) {
/* 449 */       StandardProgramGroupScreen.this.addDisplayTextArea(
/* 450 */           Messages.format(StandardProgramGroupScreen.this.getMessage(".SelectLinkDirLabel"), new Object[] { this.this$0.getApplicationName() }), panel, gc);
/*     */ 
/*     */ 
/*     */       
/* 454 */       gc.insets.top = 5;
/*     */       
/* 456 */       if (StandardProgramGroupScreen.this.isAllowUserChangeEnabled()) {
/* 457 */         panel.add(this.chkEnabled, gc);
/* 458 */         gc.gridy++;
/*     */       } 
/*     */       
/* 461 */       gc.insets.bottom = 5;
/*     */       
/* 463 */       gc.weightx = 1.0D;
/* 464 */       gc.fill = 2;
/* 465 */       panel.add((Component)this.directorySelector, gc);
/* 466 */       gc.gridy++;
/*     */       
/* 468 */       gc.weightx = 0.0D;
/* 469 */       gc.weighty = 0.0D;
/* 470 */       gc.fill = 2;
/* 471 */       gc.anchor = 21;
/*     */       
/* 473 */       gc.weighty = 1.0D;
/* 474 */       gc.fill = 3;
/* 475 */       panel.add(new JPanel(), gc);
/*     */     }
/*     */ 
/*     */     
/*     */     public void actionPerformed(ActionEvent event) {
/* 480 */       if (event.getSource() == this.chkEnabled) {
/* 481 */         checkEnabled();
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected void setupControls() {
/* 487 */       super.setupControls();
/*     */       
/* 489 */       this.directorySelector = new DirectorySelector(StandardProgramGroupScreen.this.getMessage(".ReadyMemoDir").replace(':', ' ').trim(), false);
/* 490 */       this.directorySelector.activateNextScreenOnEnter(StandardProgramGroupScreen.this.getContext().getWizardContext());
/* 491 */       this.chkEnabled = new JCheckBox(StandardProgramGroupScreen.this.getMessage(".SymlinksCheck"));
/*     */     }
/*     */ 
/*     */     
/*     */     protected void setupComponent() {
/* 496 */       super.setupComponent();
/* 497 */       checkEnabled();
/*     */     }
/*     */ 
/*     */     
/*     */     protected void setupEventHandlers() {
/* 502 */       super.setupEventHandlers();
/*     */       
/* 504 */       this.chkEnabled.addActionListener(this);
/*     */     }
/*     */     
/*     */     private void checkEnabled() {
/* 508 */       boolean enabled = this.chkEnabled.isSelected();
/* 509 */       this.directorySelector.setEnabled(enabled);
/* 510 */       JTextField textField = this.directorySelector.getTextField();
/* 511 */       if (enabled) {
/* 512 */         textField.selectAll();
/*     */       } else {
/* 514 */         textField.setSelectionStart(0);
/* 515 */         textField.setSelectionEnd(0);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\StandardProgramGroupScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */