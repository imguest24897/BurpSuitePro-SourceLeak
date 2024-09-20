/*     */ package com.install4j.runtime.installer.frontend.components;
/*     */ 
/*     */ import com.install4j.api.UiUtil;
/*     */ import com.install4j.runtime.filechooser.FileChooser;
/*     */ import com.install4j.runtime.filechooser.MultiFileFilter;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.util.AbstractTextAndButtonPanel;
/*     */ import com.install4j.runtime.util.FileDrop;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.event.DocumentEvent;
/*     */ import javax.swing.event.DocumentListener;
/*     */ import javax.swing.filechooser.FileSystemView;
/*     */ 
/*     */ public class FileSelector extends AbstractTextAndButtonPanel implements AbstractFileSelector {
/*  23 */   private static File lastDirectory = null;
/*     */   
/*     */   private JTextField txtFile;
/*     */   
/*     */   private JButton btnBrowse;
/*     */   private String fileFilterName;
/*     */   private String[] filteredExtensions;
/*     */   private boolean designTime;
/*     */   private FileValidator validator;
/*     */   private boolean alreadyValidated;
/*     */   private String initialBrowserDirectory;
/*     */   
/*     */   public FileSelector(String fileFilterName, String[] filteredExtensions, boolean designTime) {
/*  36 */     this.fileFilterName = fileFilterName;
/*  37 */     this.filteredExtensions = filteredExtensions;
/*  38 */     this.designTime = designTime;
/*     */     
/*  40 */     setupControls();
/*  41 */     setupComponent();
/*  42 */     setupEventHandlers();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/*  47 */     this.txtFile.setEnabled(enabled);
/*  48 */     this.btnBrowse.setEnabled(enabled);
/*     */   }
/*     */   
/*     */   public void initFile(String initialFile) {
/*  52 */     this.txtFile.setText(initialFile);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSelectedFile(File file) {
/*  57 */     initFile(file.getPath());
/*     */   }
/*     */ 
/*     */   
/*     */   public File getSelectedFile() {
/*  62 */     return new File(InstallerUtil.replaceHomeDir(this.txtFile.getText().trim()));
/*     */   }
/*     */   
/*     */   public void focusTextField() {
/*  66 */     this.txtFile.requestFocus();
/*  67 */     this.txtFile.setSelectionStart(0);
/*  68 */     this.txtFile.setSelectionEnd(this.txtFile.getDocument().getLength());
/*     */   }
/*     */ 
/*     */   
/*     */   public JTextField getTextField() {
/*  73 */     return this.txtFile;
/*     */   }
/*     */ 
/*     */   
/*     */   public JButton getButton() {
/*  78 */     return this.btnBrowse;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setManualEntryAllowed(boolean manualEntryAllowed) {
/*  83 */     this.txtFile.setEditable(manualEntryAllowed);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setValidator(FileValidator validator) {
/*  88 */     this.validator = validator;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkSelectedFile() {
/*  93 */     return (this.alreadyValidated || checkFile(getSelectedFile()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setInitialBrowserDirectory(String initialBrowserDirectory) {
/*  98 */     this.initialBrowserDirectory = initialBrowserDirectory;
/*     */   }
/*     */   
/*     */   private boolean checkFile(File file) {
/* 102 */     return (this.validator == null || this.validator.isValidFile(file));
/*     */   }
/*     */   
/*     */   private void setupControls() {
/* 106 */     this.txtFile = new JTextField();
/* 107 */     FileDrop.addTo(this.txtFile, null);
/* 108 */     this.btnBrowse = new JButton(Messages.getString(".ButtonBrowse"));
/*     */   }
/*     */ 
/*     */   
/*     */   private void setupComponent() {
/* 113 */     setLayout(new GridBagLayout());
/* 114 */     GridBagConstraints gc = new GridBagConstraints();
/* 115 */     gc.weighty = 0.0D;
/* 116 */     gc.gridy = 0;
/*     */     
/* 118 */     gc.gridx = 0;
/* 119 */     gc.weightx = 1.0D;
/* 120 */     gc.fill = 2;
/*     */     
/* 122 */     add(this.txtFile, gc);
/*     */     
/* 124 */     gc.gridx = 1;
/* 125 */     gc.weightx = 0.0D;
/* 126 */     gc.fill = 0;
/* 127 */     gc.insets.left = 5;
/* 128 */     add(this.btnBrowse, gc);
/*     */   }
/*     */   
/*     */   private void setupEventHandlers() {
/* 132 */     if (this.designTime) {
/*     */       return;
/*     */     }
/*     */     
/* 136 */     this.btnBrowse.addActionListener(e -> doBrowse());
/*     */     
/* 138 */     this.txtFile.getDocument().addDocumentListener(new DocumentListener()
/*     */         {
/*     */           public void changedUpdate(DocumentEvent e) {
/* 141 */             FileSelector.this.alreadyValidated = false;
/*     */           }
/*     */ 
/*     */           
/*     */           public void insertUpdate(DocumentEvent e) {
/* 146 */             FileSelector.this.alreadyValidated = false;
/*     */           }
/*     */ 
/*     */           
/*     */           public void removeUpdate(DocumentEvent e) {
/* 151 */             FileSelector.this.alreadyValidated = false;
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private void doBrowse() {
/*     */     File currentDirectory;
/* 159 */     FileChooser fileChooser = (FileChooser)((FileChooser)FileChooser.create().parent(UiUtil.getParentWindow())).title(Messages.getString(".SelectFile"));
/*     */     
/* 161 */     if (Messages.containsKeyDirectly(".ButtonSelect")) {
/* 162 */       fileChooser.approveButtonText(Messages.getString(".ButtonSelect"));
/*     */     }
/*     */     
/* 165 */     if (this.filteredExtensions != null && this.fileFilterName.trim().length() > 0) {
/* 166 */       for (int i = 0; i < this.filteredExtensions.length; i++) {
/* 167 */         String filteredExtension = this.filteredExtensions[i].trim();
/* 168 */         if (filteredExtension.startsWith(".")) {
/* 169 */           this.filteredExtensions[i] = filteredExtension.substring(1);
/* 170 */         } else if (filteredExtension.startsWith("*.")) {
/* 171 */           this.filteredExtensions[i] = filteredExtension.substring(2);
/*     */         } 
/*     */       } 
/* 174 */       MultiFileFilter fileFilter = new MultiFileFilter(this.filteredExtensions, this.fileFilterName);
/* 175 */       fileChooser.addFileFilter(fileFilter);
/* 176 */       fileChooser.selectedFileFilter(fileFilter);
/*     */     } 
/*     */ 
/*     */     
/* 180 */     String selectedPath = this.txtFile.getText().trim();
/* 181 */     if (selectedPath.length() > 0) {
/* 182 */       currentDirectory = new File(selectedPath);
/* 183 */     } else if (this.initialBrowserDirectory.length() > 0) {
/* 184 */       currentDirectory = new File(this.initialBrowserDirectory);
/*     */     } else {
/* 186 */       if (lastDirectory == null) {
/* 187 */         lastDirectory = new File((String)ContextImpl.getSingleContextInt().getVariable("sys.installerDir"));
/*     */       }
/* 189 */       currentDirectory = lastDirectory;
/*     */     } 
/*     */     try {
/* 192 */       currentDirectory = currentDirectory.getCanonicalFile();
/* 193 */     } catch (IOException iOException) {}
/*     */ 
/*     */     
/* 196 */     while (!currentDirectory.exists() || !currentDirectory.isDirectory()) {
/*     */       
/* 198 */       File parentDirectory = FileSystemView.getFileSystemView().getParentDirectory(currentDirectory);
/* 199 */       if (parentDirectory == null || currentDirectory.equals(parentDirectory)) {
/*     */         break;
/*     */       }
/* 202 */       currentDirectory = parentDirectory;
/*     */     } 
/*     */     
/* 205 */     if (currentDirectory.exists() && currentDirectory.isDirectory()) {
/* 206 */       fileChooser.currentDirectory(currentDirectory);
/*     */     }
/*     */     
/* 209 */     if (fileChooser.select()) {
/* 210 */       File selectedFile = fileChooser.getSelectedFile();
/* 211 */       lastDirectory = selectedFile.getParentFile();
/* 212 */       if (checkFile(selectedFile)) {
/* 213 */         this.txtFile.setText(selectedFile.getPath());
/* 214 */         this.alreadyValidated = true;
/*     */       } else {
/* 216 */         this.alreadyValidated = false;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\components\FileSelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */