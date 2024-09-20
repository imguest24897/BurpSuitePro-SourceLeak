/*     */ package com.install4j.runtime.filechooser.swingdirectory;
/*     */ 
/*     */ import com.install4j.api.UiUtil;
/*     */ import com.install4j.runtime.filechooser.FileChooserWithLowerAccessory;
/*     */ import java.awt.Component;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.io.File;
/*     */ import java.util.Objects;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.filechooser.FileSystemView;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ 
/*     */ 
/*     */ public class JDirectoryChooser
/*     */   extends FileChooserWithLowerAccessory
/*     */ {
/*     */   static final String PROPERTY_MANUAL_DIRECTORY_CHOOSER = "manualDirectoryChooser";
/*     */   static final String PROPERTY_LOWER_ACCESSORY = "lowerAccessory";
/*     */   private String title;
/*     */   private JDirectoryChooserDialog dialog;
/*  23 */   private int returnValue = -1;
/*     */   
/*     */   private boolean activated;
/*     */   
/*     */   private boolean allowFolderCreation;
/*     */   
/*     */   private String cancelButtonText;
/*     */   
/*     */   private JComponent lowerAccessory;
/*     */   
/*     */   public JDirectoryChooser(File currentDirectory) {
/*  34 */     super(currentDirectory);
/*     */   }
/*     */   
/*     */   public JDirectoryChooser(File currentDirectory, FileSystemView fsv) {
/*  38 */     super(currentDirectory, fsv);
/*     */   }
/*     */   
/*     */   public JDirectoryChooser(FileSystemView fsv) {
/*  42 */     super(fsv);
/*     */   }
/*     */   
/*     */   public JDirectoryChooser(String currentDirectoryPath) {
/*  46 */     super(currentDirectoryPath);
/*     */   }
/*     */   
/*     */   public JDirectoryChooser(String currentDirectoryPath, FileSystemView fsv) {
/*  50 */     super(currentDirectoryPath, fsv);
/*     */   }
/*     */   
/*     */   public boolean isAllowFolderCreation() {
/*  54 */     return this.allowFolderCreation;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setLowerAccessory(JComponent lowerAccessory) {
/*  59 */     firePropertyChange("lowerAccessory", this.lowerAccessory, lowerAccessory);
/*  60 */     this.lowerAccessory = lowerAccessory;
/*     */   }
/*     */   
/*     */   public JComponent getLowerAccessory() {
/*  64 */     return this.lowerAccessory;
/*     */   }
/*     */   
/*     */   public void setAllowFolderCreation(boolean allowFolderCreation) {
/*  68 */     this.allowFolderCreation = allowFolderCreation;
/*  69 */     updateUI();
/*     */   }
/*     */   
/*     */   public boolean isDialogVisible() {
/*  73 */     return (this.dialog != null && this.dialog.isVisible());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUI(ComponentUI ui) {
/*  78 */     if (!(ui instanceof JDirectoryChooserUI)) {
/*  79 */       setUI(new JDirectoryChooserUI(this));
/*     */     } else {
/*  81 */       super.setUI(ui);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCurrentDirectory(File dir) {
/*  88 */     if (dir != null && getSelectedFile() != null && !Objects.equals(dir, getSelectedFile())) {
/*  89 */       setSelectedFile(null);
/*     */     }
/*     */     
/*  92 */     super.setCurrentDirectory(dir);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSelectedFiles(File[] selectedFiles) {
/*  97 */     super.setSelectedFiles(selectedFiles);
/*  98 */     setSelectedFile(selectedFiles[0]);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int showDialog(Component parent, String approveButtonText) {
/* 104 */     return showDialog(parent, approveButtonText, (String)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public int showDialog(Component parent, String approveButtonText, String cancelButtonText) {
/* 109 */     this.cancelButtonText = cancelButtonText;
/* 110 */     if (approveButtonText != null) {
/* 111 */       setApproveButtonText(approveButtonText);
/*     */     }
/*     */     
/* 114 */     if (this.dialog == null) {
/* 115 */       this.dialog = new JDirectoryChooserDialog(this, UiUtil.getParentWindow());
/* 116 */       this.dialog.setTitle(this.title);
/* 117 */       this.dialog.addWindowListener(new WindowAdapter()
/*     */           {
/*     */             public void windowActivated(WindowEvent e)
/*     */             {
/* 121 */               if (!JDirectoryChooser.this.activated) {
/* 122 */                 ((JDirectoryChooserUI)JDirectoryChooser.this.getUI()).scrollToSelection();
/*     */               }
/* 124 */               JDirectoryChooser.this.activated = true;
/*     */             }
/*     */ 
/*     */             
/*     */             public void windowClosing(WindowEvent e) {
/* 129 */               JDirectoryChooser.this.returnValue = 1;
/*     */             }
/*     */           });
/*     */     } 
/*     */     
/* 134 */     this.returnValue = -1;
/* 135 */     rescanCurrentDirectory();
/*     */     
/* 137 */     this.dialog.setVisible(true);
/*     */     
/* 139 */     return this.returnValue;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireActionPerformed(String command) {
/* 144 */     if (Objects.equals(command, "ApproveSelection")) {
/* 145 */       this.returnValue = 0;
/* 146 */       this.dialog.setVisible(false);
/* 147 */     } else if (Objects.equals(command, "CancelSelection")) {
/* 148 */       this.returnValue = 1;
/* 149 */       this.dialog.setVisible(false);
/*     */     } 
/* 151 */     super.fireActionPerformed(command);
/*     */   }
/*     */   
/*     */   public static void main(String[] args) throws Exception {
/* 155 */     UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
/* 156 */     System.setProperty("manualDirectoryChooser", "true");
/* 157 */     JDirectoryChooser chooser = new JDirectoryChooser();
/* 158 */     chooser.setMultiSelectionEnabled(false);
/* 159 */     chooser.setAllowFolderCreation(true);
/* 160 */     chooser.setDialogTitle("Select directory");
/* 161 */     chooser.setCurrentDirectory(new File("c:\\Program Files (x86)"));
/* 162 */     int choice = chooser.showOpenDialog(null);
/*     */ 
/*     */     
/* 165 */     if (choice == 1) {
/* 166 */       System.out.println("User Canceled");
/*     */     } else {
/*     */       
/* 169 */       System.out.println("Dialog Selection: " + chooser.getSelectedFile().getAbsolutePath());
/*     */     } 
/* 171 */     System.exit(0);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTitle() {
/* 176 */     return this.title;
/*     */   }
/*     */   
/*     */   public void setTitle(String title) {
/* 180 */     this.title = title;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDialogTitle(String title) {
/* 185 */     setTitle(title);
/* 186 */     super.setDialogTitle(title);
/*     */   }
/*     */   
/*     */   public void focusTree() {
/* 190 */     ((JDirectoryChooserUI)getUI()).focusTree();
/*     */   }
/*     */   
/*     */   public String getCancelButtonText() {
/* 194 */     return this.cancelButtonText;
/*     */   }
/*     */   
/*     */   public JDirectoryChooser() {}
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\swingdirectory\JDirectoryChooser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */