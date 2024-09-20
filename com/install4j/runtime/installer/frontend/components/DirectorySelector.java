/*     */ package com.install4j.runtime.installer.frontend.components;
/*     */ import com.ejt.internal.gui.KeyboardUtil;
/*     */ import com.install4j.api.ApplicationRegistry;
/*     */ import com.install4j.api.UiUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.ControlButtonType;
/*     */ import com.install4j.api.context.WizardContext;
/*     */ import com.install4j.runtime.filechooser.DirectoryChooser;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import java.awt.Component;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.FocusEvent;
/*     */ import java.awt.event.FocusListener;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Objects;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.event.DocumentEvent;
/*     */ import javax.swing.event.DocumentListener;
/*     */ import javax.swing.filechooser.FileSystemView;
/*     */ 
/*     */ public class DirectorySelector extends AbstractTextAndButtonPanel implements AbstractFileSelector {
/*  31 */   private static final String BAD_CHARS = ";:*?\"<>|%" + (InstallerUtil.isWindows() ? "/" : "\\");
/*     */   public static final String PROPERTY_SELECTED_PATH = "selectedPath";
/*  33 */   private static File lastDirectory = null;
/*     */   
/*     */   private String standardDirectoryName;
/*     */   
/*     */   private boolean noStandardDirectoryNameForUpdate;
/*     */   
/*     */   private InternalValidator internalValidator;
/*     */   private WizardContext wizardContext;
/*     */   private JTextField txtDirectory;
/*     */   private JButton btnBrowse;
/*     */   private String directoryDescription;
/*     */   private boolean allowSpacesOnUnix = false;
/*     */   private boolean allowEmpty = false;
/*     */   private boolean standardValidation = true;
/*     */   private boolean designTime;
/*  48 */   private String focusInText = "";
/*     */   private FileValidator validator;
/*     */   private boolean alreadyValidated;
/*     */   private String initialBrowserDirectory;
/*     */   
/*     */   public DirectorySelector(String directoryDescription, boolean designTime) {
/*  54 */     this.directoryDescription = directoryDescription;
/*  55 */     this.designTime = designTime;
/*     */     
/*  57 */     setupControls();
/*  58 */     setupComponent();
/*  59 */     setupEventHandlers();
/*     */   }
/*     */   
/*     */   public void setInternalValidator(InternalValidator internalValidator) {
/*  63 */     this.internalValidator = internalValidator;
/*     */   }
/*     */   
/*     */   public void setAllowSpacesOnUnix(boolean allowSpacesOnUnix) {
/*  67 */     this.allowSpacesOnUnix = allowSpacesOnUnix;
/*     */   }
/*     */   
/*     */   public void activateNextScreenOnEnter(WizardContext wizardContext) {
/*  71 */     this.wizardContext = wizardContext;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/*  76 */     this.txtDirectory.setEnabled(enabled);
/*  77 */     this.btnBrowse.setEnabled(enabled);
/*     */   }
/*     */   
/*     */   public void initDirectory(File initialParentDirectory, String standardDirectoryName) {
/*  81 */     this.standardDirectoryName = standardDirectoryName;
/*  82 */     this.txtDirectory.setText(getSuggestedPath(initialParentDirectory));
/*     */   }
/*     */   
/*     */   public void setDirectory(File directory) {
/*  86 */     if (!Objects.equals(this.txtDirectory.getText(), directory.getPath())) {
/*  87 */       this.txtDirectory.setText(directory.getPath());
/*     */     }
/*     */   }
/*     */   
/*     */   public void setNoStandardDirectoryNameForUpdate(boolean noStandardDirectoryNameForUpdate) {
/*  92 */     this.noStandardDirectoryNameForUpdate = noStandardDirectoryNameForUpdate;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSelectedFile(File file) {
/*  97 */     initDirectory(file, "");
/*     */   }
/*     */ 
/*     */   
/*     */   public File getSelectedFile() {
/* 102 */     return new File(InstallerUtil.replaceHomeDir(getSelectedDirectoryName()));
/*     */   }
/*     */ 
/*     */   
/*     */   public JTextField getTextField() {
/* 107 */     return this.txtDirectory;
/*     */   }
/*     */ 
/*     */   
/*     */   public JButton getButton() {
/* 112 */     return this.btnBrowse;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setManualEntryAllowed(boolean manualEntryAllowed) {
/* 117 */     this.txtDirectory.setEditable(manualEntryAllowed);
/*     */   }
/*     */   
/*     */   public void setAllowEmpty(boolean allowEmpty) {
/* 121 */     this.allowEmpty = allowEmpty;
/*     */   }
/*     */   
/*     */   public void setStandardValidation(boolean standardValidation) {
/* 125 */     this.standardValidation = standardValidation;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setValidator(FileValidator validator) {
/* 130 */     this.validator = validator;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkSelectedFile() {
/* 135 */     return (this.alreadyValidated || checkDirectory(getSelectedDirectoryName()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setInitialBrowserDirectory(String initialBrowserDirectory) {
/* 140 */     this.initialBrowserDirectory = initialBrowserDirectory;
/*     */   }
/*     */   
/*     */   public boolean checkDirectory(String directory) {
/*     */     File file;
/* 145 */     Window parent = (Window)SwingUtilities.getAncestorOfClass(Window.class, (Component)this);
/* 146 */     if (directory.length() == 0) {
/* 147 */       if (this.allowEmpty) {
/* 148 */         return true;
/*     */       }
/* 150 */       GUIHelper.showMessage(parent, 
/*     */           
/* 152 */           Messages.getString(".MustEnterDirectory"), 2);
/*     */ 
/*     */       
/* 155 */       return false;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 160 */     if (this.standardValidation) {
/*     */       
/* 162 */       if (!(new File(directory)).isAbsolute()) {
/* 163 */         GUIHelper.showMessage(parent, 
/*     */             
/* 165 */             Messages.format(Messages.getString(".InvalidDirectory"), new Object[] { directory }), 2);
/*     */ 
/*     */ 
/*     */         
/* 169 */         return false;
/*     */       } 
/*     */       
/* 172 */       if (!InstallerUtil.isWindows() && !InstallerUtil.isMacOS() && directory.indexOf(' ') > -1 && !this.allowSpacesOnUnix) {
/* 173 */         GUIHelper.showMessage(parent, Messages.getString(".NoDirNameWithSpace"), 2);
/* 174 */         return false;
/*     */       } 
/*     */       
/* 177 */       char[] badChars = BAD_CHARS.toCharArray(); char[] arrayOfChar1; int i; byte b;
/* 178 */       for (arrayOfChar1 = badChars, i = arrayOfChar1.length, b = 0; b < i; ) { char badChar = arrayOfChar1[b];
/* 179 */         int index = directory.indexOf(badChar);
/* 180 */         if (index < 0 || (
/* 181 */           badChar == ':' && index == 1 && directory.lastIndexOf(':') == index && InstallerUtil.isWindows())) {
/*     */           b++; continue;
/*     */         } 
/* 184 */         GUIHelper.showMessage(parent, 
/*     */             
/* 186 */             Messages.format(Messages.getString(".BadDirName32"), new Object[] { BAD_CHARS }), 2);
/*     */ 
/*     */         
/* 189 */         return false; }
/*     */ 
/*     */ 
/*     */       
/* 193 */       if (InstallerUtil.isWindows() && directory.lastIndexOf(':') == 1 && !(new File(directory.substring(0, 2))).exists()) {
/* 194 */         GUIHelper.showMessage(parent, Messages.getString(".InvalidDrive"), 2);
/* 195 */         return false;
/*     */       } 
/*     */       
/* 198 */       if (InstallerUtil.isWindows() && directory.startsWith("\\\\")) {
/* 199 */         int index = directory.indexOf('\\', 2);
/* 200 */         if (index > 0) {
/* 201 */           index = directory.indexOf('\\', index + 1);
/*     */         }
/* 203 */         if (index < 0) {
/* 204 */           index = directory.length();
/*     */         }
/* 206 */         if (!(new File(directory.substring(0, index))).exists()) {
/* 207 */           GUIHelper.showMessage(parent, Messages.getString(".InvalidDrive"), 2);
/* 208 */           return false;
/*     */         } 
/*     */       } 
/*     */       
/*     */       try {
/* 213 */         file = (new File(directory)).getCanonicalFile();
/* 214 */       } catch (IOException e) {
/* 215 */         GUIHelper.showMessage(parent, 
/*     */             
/* 217 */             Messages.format(Messages.getString(".InvalidDirectory"), new Object[] { directory }), 2);
/*     */ 
/*     */         
/* 220 */         return false;
/*     */       } 
/*     */     } else {
/* 223 */       file = new File(directory);
/*     */     } 
/*     */     
/* 226 */     if (this.internalValidator != null) {
/* 227 */       File newFile = this.internalValidator.validateInternally(file);
/* 228 */       if (newFile == null)
/* 229 */         return false; 
/* 230 */       if (!Objects.equals(newFile, file)) {
/* 231 */         setSelectedFile(newFile);
/*     */       }
/*     */     } 
/*     */     
/* 235 */     if (this.validator != null && !this.validator.isValidFile(file)) {
/* 236 */       return false;
/*     */     }
/*     */     
/* 239 */     return true;
/*     */   }
/*     */   
/*     */   public void focusTextField() {
/* 243 */     if (this.txtDirectory.isEditable()) {
/* 244 */       this.txtDirectory.requestFocus();
/* 245 */       this.txtDirectory.setSelectionStart(0);
/* 246 */       this.txtDirectory.setSelectionEnd(this.txtDirectory.getDocument().getLength());
/*     */     } else {
/* 248 */       this.btnBrowse.requestFocus();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void setupControls() {
/* 253 */     this.txtDirectory = new JTextField();
/* 254 */     FileDrop.addTo(this.txtDirectory, null);
/* 255 */     this.btnBrowse = new JButton(Messages.getString(".ButtonBrowse"));
/*     */   }
/*     */   
/*     */   private void setupComponent() {
/* 259 */     setOpaque(false);
/* 260 */     if (this.directoryDescription != null && !this.directoryDescription.isEmpty()) {
/* 261 */       setBorder(BorderFactory.createCompoundBorder(
/* 262 */             BorderFactory.createTitledBorder(this.directoryDescription), 
/* 263 */             BorderFactory.createEmptyBorder(0, 5, 5, 5)));
/*     */     }
/*     */ 
/*     */     
/* 267 */     setLayout(new GridBagLayout());
/* 268 */     GridBagConstraints gc = new GridBagConstraints();
/* 269 */     gc.weighty = 0.0D;
/* 270 */     gc.gridy = 0;
/*     */     
/* 272 */     gc.gridx = 0;
/* 273 */     gc.weightx = 1.0D;
/* 274 */     gc.fill = 2;
/*     */     
/* 276 */     add(this.txtDirectory, gc);
/*     */     
/* 278 */     gc.gridx = 1;
/* 279 */     gc.weightx = 0.0D;
/* 280 */     gc.fill = 0;
/* 281 */     gc.insets.left = 5;
/* 282 */     add(this.btnBrowse, gc);
/*     */   }
/*     */   
/*     */   private void setupEventHandlers() {
/* 286 */     if (this.designTime) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 291 */     this.btnBrowse.addActionListener(e -> doBrowse());
/*     */     
/* 293 */     KeyboardUtil.addAccelerator(0, this.txtDirectory, this.txtDirectory, event -> { if (this.wizardContext != null) this.wizardContext.pressControlButton(ControlButtonType.NEXT);  }10, 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 301 */     this.txtDirectory.addFocusListener(new FocusListener()
/*     */         {
/*     */           public void focusGained(FocusEvent e) {
/* 304 */             DirectorySelector.this.focusInText = DirectorySelector.this.txtDirectory.getText();
/*     */           }
/*     */ 
/*     */           
/*     */           public void focusLost(FocusEvent e) {
/* 309 */             DirectorySelector.this.firePropertyChange("selectedPath", DirectorySelector.this.focusInText, DirectorySelector.this.txtDirectory.getText());
/*     */           }
/*     */         });
/*     */     
/* 313 */     this.txtDirectory.getDocument().addDocumentListener(new DocumentListener()
/*     */         {
/*     */           public void changedUpdate(DocumentEvent e) {
/* 316 */             DirectorySelector.this.alreadyValidated = false;
/*     */           }
/*     */ 
/*     */           
/*     */           public void insertUpdate(DocumentEvent e) {
/* 321 */             DirectorySelector.this.alreadyValidated = false;
/*     */           }
/*     */ 
/*     */           
/*     */           public void removeUpdate(DocumentEvent e) {
/* 326 */             DirectorySelector.this.alreadyValidated = false;
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private void doBrowse() {
/*     */     File currentDirectory;
/* 334 */     DirectoryChooser directoryChooser = (DirectoryChooser)((DirectoryChooser)DirectoryChooser.create().parent(UiUtil.getParentWindow())).title(Messages.getString(".SelectDirectory"));
/*     */     
/* 336 */     if (Messages.containsKeyDirectly(".ButtonSelect")) {
/* 337 */       directoryChooser.approveButtonText(Messages.getString(".ButtonSelect"));
/*     */     }
/*     */     
/* 340 */     String selectedPath = this.txtDirectory.getText().trim();
/*     */     
/* 342 */     if (selectedPath.length() > 0) {
/* 343 */       currentDirectory = new File(selectedPath);
/* 344 */     } else if (this.initialBrowserDirectory != null && this.initialBrowserDirectory.length() > 0) {
/* 345 */       currentDirectory = new File(this.initialBrowserDirectory);
/*     */     } else {
/* 347 */       if (lastDirectory == null) {
/* 348 */         lastDirectory = new File(Util.getUserHome());
/*     */       }
/* 350 */       currentDirectory = lastDirectory;
/*     */     } 
/*     */     try {
/* 353 */       currentDirectory = currentDirectory.getCanonicalFile();
/* 354 */     } catch (IOException iOException) {}
/*     */ 
/*     */ 
/*     */     
/* 358 */     while (!currentDirectory.exists() || !currentDirectory.isDirectory()) {
/* 359 */       File parentDirectory = FileSystemView.getFileSystemView().getParentDirectory(currentDirectory);
/* 360 */       if (parentDirectory == null || currentDirectory.equals(parentDirectory)) {
/*     */         break;
/*     */       }
/* 363 */       currentDirectory = parentDirectory;
/*     */     } 
/*     */     
/* 366 */     if (currentDirectory.exists() && currentDirectory.isDirectory()) {
/* 367 */       directoryChooser.currentDirectory(currentDirectory);
/*     */     }
/*     */     
/* 370 */     if (directoryChooser.select()) {
/* 371 */       File selectedDirectory = directoryChooser.getSelectedDirectory();
/* 372 */       String suggestedPath = getSuggestedPath(selectedDirectory);
/* 373 */       String oldPath = this.txtDirectory.getText();
/* 374 */       lastDirectory = selectedDirectory;
/* 375 */       if (checkDirectory(suggestedPath)) {
/* 376 */         this.txtDirectory.setText(suggestedPath);
/* 377 */         firePropertyChange("selectedPath", oldPath, suggestedPath);
/* 378 */         this.alreadyValidated = true;
/*     */       } else {
/* 380 */         this.alreadyValidated = false;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private String getSelectedDirectoryName() {
/* 387 */     String directory = this.txtDirectory.getText().trim();
/* 388 */     if ((new File(directory)).getParent() != null) {
/* 389 */       while (directory.endsWith("\\") || directory.endsWith("/")) {
/* 390 */         directory = directory.substring(0, directory.length() - 1);
/*     */       }
/*     */     }
/* 393 */     return directory;
/*     */   }
/*     */ 
/*     */   
/*     */   private String getSuggestedPath(File parentDirectory) {
/* 398 */     if (parentDirectory.getPath().trim().length() == 0) {
/* 399 */       return "";
/*     */     }
/*     */     
/* 402 */     if (this.standardDirectoryName == null || this.standardDirectoryName.trim().length() == 0 || (this.noStandardDirectoryNameForUpdate && ApplicationRegistry.isUpdateDirectory(parentDirectory))) {
/* 403 */       return parentDirectory.getPath();
/*     */     }
/* 405 */     return (new File(parentDirectory, this.standardDirectoryName)).getPath();
/*     */   }
/*     */   
/*     */   public static interface InternalValidator {
/*     */     File validateInternally(File param1File);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\components\DirectorySelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */