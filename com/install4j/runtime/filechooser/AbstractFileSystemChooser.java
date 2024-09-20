/*     */ package com.install4j.runtime.filechooser;
/*     */ 
/*     */ import java.awt.Component;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Window;
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import javax.swing.SwingUtilities;
/*     */ import org.jetbrains.annotations.Nls;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public abstract class AbstractFileSystemChooser<T extends AbstractFileSystemChooser<T>> implements Iterable<File> {
/*     */   private Window parent;
/*     */   private String title;
/*     */   private File currentDirectory;
/*     */   private String approveButtonText;
/*     */   private File defaultSelectedFile;
/*     */   private boolean fileHidingEnabled = true;
/*  21 */   private Collection<FileChooserQuestion> fileChooserQuestions = new ArrayList<>();
/*     */   
/*     */   private boolean selected = false;
/*     */   
/*     */   public boolean select() {
/*  26 */     if (this.parent != null) {
/*  27 */       this.parent.toFront();
/*     */     }
/*  29 */     this.selected = true;
/*     */     try {
/*  31 */       return selectInternal();
/*     */     } finally {
/*  33 */       if (this.parent != null) {
/*  34 */         this.parent.requestFocus();
/*     */         
/*  36 */         EventQueue.invokeLater(() -> this.parent.requestFocus());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Iterator<File> iterator() {
/*  48 */     checkSelected();
/*  49 */     return getAllFiles().iterator();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void checkSelected() {
/*  54 */     if (!this.selected) {
/*  55 */       throw new RuntimeException("File chooser was not shown yet");
/*     */     }
/*     */   }
/*     */   
/*     */   public Window getParent() {
/*  60 */     return this.parent;
/*     */   }
/*     */   
/*     */   public T parent(Component parent) {
/*  64 */     this.parent = getWindow(parent);
/*  65 */     return getTypedThis();
/*     */   }
/*     */   
/*     */   @Nls
/*     */   public String getTitle() {
/*  70 */     return this.title;
/*     */   }
/*     */   
/*     */   public T title(@Nls String title) {
/*  74 */     this.title = title;
/*  75 */     return getTypedThis();
/*     */   }
/*     */   
/*     */   public File getCurrentDirectory() {
/*  79 */     return this.currentDirectory;
/*     */   }
/*     */   
/*     */   public T currentDirectory(File currentDirectory) {
/*  83 */     if (currentDirectory != null) {
/*  84 */       if (currentDirectory.getPath().isEmpty()) {
/*  85 */         currentDirectory = new File(System.getProperty("user.home"));
/*  86 */       } else if (currentDirectory.isFile()) {
/*  87 */         currentDirectory = currentDirectory.getParentFile();
/*     */       } 
/*     */     }
/*  90 */     this.currentDirectory = currentDirectory;
/*  91 */     return getTypedThis();
/*     */   }
/*     */   
/*     */   @Nls
/*     */   public String getApproveButtonText() {
/*  96 */     return this.approveButtonText;
/*     */   }
/*     */   
/*     */   public T approveButtonText(@Nls String approveButtonText) {
/* 100 */     this.approveButtonText = approveButtonText;
/* 101 */     return getTypedThis();
/*     */   }
/*     */   
/*     */   public File getDefaultSelectedFile() {
/* 105 */     return this.defaultSelectedFile;
/*     */   }
/*     */   
/*     */   public T defaultSelectedFile(File defaultSelectedFile) {
/* 109 */     this.defaultSelectedFile = defaultSelectedFile;
/* 110 */     if (defaultSelectedFile != null) {
/* 111 */       currentDirectory(defaultSelectedFile.getParentFile());
/*     */     }
/* 113 */     return getTypedThis();
/*     */   }
/*     */   
/*     */   public boolean isFileHidingEnabled() {
/* 117 */     return this.fileHidingEnabled;
/*     */   }
/*     */   
/*     */   public T fileHidingEnabled(boolean fileHidingEnabled) {
/* 121 */     this.fileHidingEnabled = fileHidingEnabled;
/* 122 */     return getTypedThis();
/*     */   }
/*     */   
/*     */   public Collection<FileChooserQuestion> getFileChooserQuestions() {
/* 126 */     return this.fileChooserQuestions;
/*     */   }
/*     */   
/*     */   public T fileChooserQuestions(Collection<FileChooserQuestion> fileChooserQuestions) {
/* 130 */     this.fileChooserQuestions = fileChooserQuestions;
/* 131 */     return getTypedThis();
/*     */   }
/*     */   
/*     */   public T addFileChooserQuestion(FileChooserQuestion fileChooserQuestion) {
/* 135 */     this.fileChooserQuestions.add(fileChooserQuestion);
/* 136 */     return getTypedThis();
/*     */   }
/*     */ 
/*     */   
/*     */   private T getTypedThis() {
/* 141 */     return (T)this;
/*     */   }
/*     */   
/*     */   private Window getWindow(Component parent) {
/* 145 */     if (parent instanceof Window) {
/* 146 */       return (Window)parent;
/*     */     }
/* 148 */     return SwingUtilities.getWindowAncestor(parent);
/*     */   }
/*     */   
/*     */   public abstract boolean selectInternal();
/*     */   
/*     */   protected abstract Collection<File> getAllFiles();
/*     */   
/*     */   public abstract File getSelectedFile();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\AbstractFileSystemChooser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */