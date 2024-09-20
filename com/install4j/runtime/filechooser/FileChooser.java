/*     */ package com.install4j.runtime.filechooser;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.alert.Alert;
/*     */ import com.install4j.runtime.util.I4jLibraryHelper;
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ public abstract class FileChooser
/*     */   extends AbstractFileSystemChooser<FileChooser>
/*     */ {
/*     */   public static FileChooser create() {
/*  16 */     if (Alert.isNoNativeDialogs())
/*  17 */       return new SwingFileChooser(); 
/*  18 */     if (Util.isAtLeastWindowsVista() && I4jLibraryHelper.isI4jLibraryAvailable())
/*  19 */       return new WindowsFileChooser(); 
/*  20 */     if (Util.isMacOS()) {
/*  21 */       return new MacosFileChooser();
/*     */     }
/*  23 */     return new SwingFileChooser();
/*     */   }
/*     */ 
/*     */   
/*  27 */   private FileAccessMode fileAccessMode = FileAccessMode.OPEN;
/*  28 */   private List<MultiFileFilter> fileFilters = new ArrayList<>();
/*     */   
/*     */   private MultiFileFilter selectedFileFilter;
/*     */   
/*     */   private boolean multiple = false;
/*     */ 
/*     */   
/*     */   protected abstract Collection<File> getSelectedFilesInternal();
/*     */ 
/*     */   
/*     */   protected Collection<File> getAllFiles() {
/*  39 */     return getSelectedFilesInternal();
/*     */   }
/*     */   
/*     */   public Collection<File> getSelectedFiles() {
/*  43 */     checkSelected();
/*  44 */     if (!this.multiple) {
/*  45 */       throw new RuntimeException("File chooser was not configured for multiple selection");
/*     */     }
/*  47 */     return getSelectedFilesInternal();
/*     */   }
/*     */ 
/*     */   
/*     */   public File getSelectedFile() {
/*  52 */     checkSelected();
/*  53 */     if (this.multiple) {
/*  54 */       throw new RuntimeException("File chooser was not configured for single selection");
/*     */     }
/*  56 */     Collection<File> files = getSelectedFilesInternal();
/*  57 */     assert files.size() == 1;
/*  58 */     return files.iterator().next();
/*     */   }
/*     */   
/*     */   public FileAccessMode getFileAccessMode() {
/*  62 */     return this.fileAccessMode;
/*     */   }
/*     */   
/*     */   public FileChooser fileAccessMode(FileAccessMode fileAccessMode) {
/*  66 */     this.fileAccessMode = fileAccessMode;
/*  67 */     return this;
/*     */   }
/*     */   
/*     */   public List<MultiFileFilter> getFileFilters() {
/*  71 */     return this.fileFilters;
/*     */   }
/*     */   
/*     */   public FileChooser fileFilters(List<MultiFileFilter> fileFilters) {
/*  75 */     this.fileFilters = fileFilters;
/*  76 */     return this;
/*     */   }
/*     */   
/*     */   public FileChooser addFileFilter(MultiFileFilter fileFilter) {
/*  80 */     if (fileFilter != null) {
/*  81 */       this.fileFilters.add(fileFilter);
/*     */     }
/*  83 */     return this;
/*     */   }
/*     */   
/*     */   public MultiFileFilter getSelectedFileFilter() {
/*  87 */     return this.selectedFileFilter;
/*     */   }
/*     */   
/*     */   public FileChooser selectedFileFilter(MultiFileFilter selectedFileFilter) {
/*  91 */     this.selectedFileFilter = selectedFileFilter;
/*  92 */     return this;
/*     */   }
/*     */   
/*     */   public boolean isMultiple() {
/*  96 */     return this.multiple;
/*     */   }
/*     */   
/*     */   public FileChooser multiple(boolean multiple) {
/* 100 */     this.multiple = multiple;
/* 101 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\FileChooser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */