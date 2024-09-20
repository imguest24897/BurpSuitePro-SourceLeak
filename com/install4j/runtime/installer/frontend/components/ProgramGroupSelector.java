/*     */ package com.install4j.runtime.installer.frontend.components;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.ControlButtonType;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.context.WizardContext;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.platform.win32.FolderInfo;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Window;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import javax.swing.DefaultListModel;
/*     */ import javax.swing.JList;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.event.ListSelectionEvent;
/*     */ 
/*     */ public class ProgramGroupSelector extends JPanel {
/*     */   public static boolean checkProgramGroup(String programGroup, boolean allUsers, boolean showWarningIfExists, Window parent) throws UserCanceledException {
/*  25 */     if (programGroup.length() == 0) {
/*  26 */       GUIHelper.showMessage(parent, 
/*     */           
/*  28 */           Messages.getString(".MustEnterGroupName"), 2);
/*     */ 
/*     */       
/*  31 */       return false;
/*     */     } 
/*     */     
/*  34 */     char[] badChars = "/:*?\"<>|".toCharArray();
/*  35 */     for (char badChar : badChars) {
/*  36 */       if (programGroup.indexOf(badChar) >= 0) {
/*  37 */         GUIHelper.showMessage(parent, 
/*     */             
/*  39 */             Messages.format(Messages.getString(".BadGroupName"), new Object[] { "/:*?\"<>|" }), 2);
/*     */ 
/*     */         
/*  42 */         return false;
/*     */       } 
/*     */     } 
/*     */     
/*  46 */     if (showWarningIfExists) {
/*  47 */       File groupDir = new File(FolderInfo.getSpecialFolder(3, allUsers), programGroup);
/*  48 */       if (groupDir.exists()) {
/*  49 */         int result = Util.showOptionDialog(
/*  50 */             Messages.getString(".ProgramGroupExists"), new String[] {
/*  51 */               Messages.getString(".ButtonYes"), Messages.getString(".ButtonNo") }, 3);
/*     */ 
/*     */         
/*  54 */         if (result != 0) {
/*  55 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  61 */     return true;
/*     */   }
/*     */   
/*     */   private static final String BAD_CHARS = "/:*?\"<>|";
/*     */   private boolean allUsers;
/*     */   private boolean showWarningIfExists;
/*     */   private WizardContext wizardContext;
/*     */   private JTextField txtGroup;
/*     */   private JList<String> lstGroups;
/*     */   private JScrollPane scpGroups;
/*     */   
/*     */   public ProgramGroupSelector(boolean allUsers, boolean showWarningIfExists, WizardContext context) {
/*  73 */     this.allUsers = allUsers;
/*  74 */     this.showWarningIfExists = showWarningIfExists;
/*  75 */     this.wizardContext = context;
/*     */     
/*  77 */     setupControls();
/*  78 */     setupComponent();
/*  79 */     setupEventHandlers();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/*  85 */     this.txtGroup.setEnabled(enabled);
/*  86 */     this.lstGroups.setEnabled(enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSelectedProgramGroup() {
/*  91 */     String programGroup = this.txtGroup.getText().trim();
/*  92 */     while (programGroup.endsWith("\\")) {
/*  93 */       programGroup = programGroup.substring(0, programGroup.length() - 1);
/*     */     }
/*  95 */     return programGroup;
/*     */   }
/*     */   
/*     */   public boolean checkSelectedProgramGroup() {
/*     */     try {
/* 100 */       boolean result = checkProgramGroup(getSelectedProgramGroup(), this.allUsers, this.showWarningIfExists, (Window)SwingUtilities.getAncestorOfClass(Window.class, this));
/* 101 */       if (!result) {
/* 102 */         this.txtGroup.requestFocus();
/*     */       }
/* 104 */       return result;
/* 105 */     } catch (UserCanceledException e) {
/* 106 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void focusTextField() {
/* 111 */     this.txtGroup.requestFocus();
/* 112 */     this.txtGroup.setSelectionStart(0);
/* 113 */     this.txtGroup.setSelectionEnd(this.txtGroup.getDocument().getLength());
/*     */   }
/*     */ 
/*     */   
/*     */   private void setupControls() {
/* 118 */     this.txtGroup = new JTextField("");
/* 119 */     this.lstGroups = new JList<>();
/* 120 */     this.lstGroups.setModel(new DefaultListModel<>());
/* 121 */     this.lstGroups.setSelectionMode(0);
/* 122 */     this.scpGroups = new JScrollPane(this.lstGroups);
/* 123 */     fillGroupList();
/* 124 */     this.lstGroups.setVisibleRowCount(5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setupComponent() {
/* 129 */     setLayout(new GridBagLayout());
/* 130 */     GridBagConstraints gc = new GridBagConstraints();
/* 131 */     gc.gridy = 0;
/* 132 */     gc.gridx = 0;
/* 133 */     gc.weightx = 1.0D;
/* 134 */     gc.weighty = 0.0D;
/* 135 */     gc.fill = 2;
/*     */     
/* 137 */     add(this.txtGroup, gc);
/*     */     
/* 139 */     gc.gridy++;
/* 140 */     gc.insets = new Insets(5, 0, 0, 0);
/* 141 */     gc.weightx = 1.0D;
/* 142 */     gc.weighty = 1.0D;
/* 143 */     gc.fill = 1;
/* 144 */     add(this.scpGroups, gc);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setupEventHandlers() {
/* 150 */     this.lstGroups.addListSelectionListener(event -> {
/*     */           Object selectedValue = this.lstGroups.getSelectedValue();
/*     */           
/*     */           if (selectedValue != null) {
/*     */             this.txtGroup.setText(selectedValue.toString());
/*     */           }
/*     */         });
/* 157 */     KeyboardUtil.addAccelerator(0, this.txtGroup, this.txtGroup, event -> this.wizardContext.pressControlButton(ControlButtonType.NEXT), 10, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void fillGroupList() {
/* 163 */     if (InstallerUtil.isWindows()) {
/* 164 */       File programsFolder = FolderInfo.getSpecialFolder(3, this.allUsers);
/* 165 */       if (programsFolder == null) {
/*     */         return;
/*     */       }
/* 168 */       File startupFolder = FolderInfo.getSpecialFolder(4, this.allUsers);
/* 169 */       DefaultListModel<String> model = new DefaultListModel<>();
/*     */       try {
/* 171 */         if (startupFolder != null) {
/* 172 */           startupFolder = startupFolder.getCanonicalFile();
/*     */         }
/* 174 */         File[] files = programsFolder.listFiles();
/* 175 */         if (files == null) {
/*     */           return;
/*     */         }
/* 178 */         for (File file : files) {
/* 179 */           if (file != null && file.isDirectory()) {
/* 180 */             file = file.getCanonicalFile();
/* 181 */             if (!Objects.equals(file, startupFolder)) {
/* 182 */               model.addElement(file.getName());
/*     */             }
/*     */           } 
/*     */         } 
/* 186 */       } catch (IOException iOException) {}
/*     */       
/* 188 */       this.lstGroups.setModel(model);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSelectedProgramGroup(String programGroupName) {
/* 194 */     this.txtGroup.setText(programGroupName);
/*     */   }
/*     */   
/*     */   public void setAllUsers(boolean allUsers) {
/* 198 */     this.allUsers = allUsers;
/* 199 */     ((DefaultListModel)this.lstGroups.getModel()).removeAllElements();
/* 200 */     fillGroupList();
/* 201 */     this.lstGroups.scrollRectToVisible(new Rectangle());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\components\ProgramGroupSelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */