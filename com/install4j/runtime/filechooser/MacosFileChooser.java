/*     */ package com.install4j.runtime.filechooser;
/*     */ 
/*     */ import com.install4j.runtime.installer.platform.macos.MacosUiHelper;
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ class MacosFileChooser
/*     */   extends FileChooser
/*     */ {
/*     */   private MacosUiHelper.Result result;
/*     */   
/*     */   protected Collection<File> getSelectedFilesInternal() {
/*  16 */     List<File> files = new ArrayList<>();
/*  17 */     for (String path : this.result.getSelectedPaths()) {
/*  18 */       files.add(new File(path));
/*     */     }
/*  20 */     return files;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean selectInternal() {
/*  25 */     this.result = MacosUiHelper.showFileChooser(
/*  26 */         getDialogType(), 
/*  27 */         getTitle(), 
/*  28 */         MacosFileChooserHelper.getCurrentDirectoryWithSelection(this), 
/*  29 */         getApproveButtonText(), 
/*  30 */         MacosFileChooserHelper.getDefaultSelectedFileName(this), 
/*  31 */         !isFileHidingEnabled(), 
/*  32 */         getSuffixes(), 
/*  33 */         getDescriptions(), 
/*  34 */         getSelectedFileFilterIndex(), 
/*  35 */         getExactNames(), 
/*  36 */         MacosFileChooserHelper.getQuestions(this), 
/*  37 */         MacosFileChooserHelper.getQuestionPresets(this));
/*     */ 
/*     */     
/*  40 */     MacosFileChooserHelper.saveQuestions(this.result, this);
/*  41 */     return ((this.result.getSelectedPaths()).length > 0);
/*     */   }
/*     */   
/*     */   private int getDialogType() {
/*  45 */     switch (getFileAccessMode()) {
/*     */       case OPEN:
/*  47 */         return isMultiple() ? 2 : 1;
/*     */       case SAVE:
/*  49 */         return 3;
/*     */     } 
/*  51 */     throw new RuntimeException("unknown file access type " + getFileAccessMode().name());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private String[][] getSuffixes() {
/*  57 */     Collection<MultiFileFilter> fileFilters = getFileFilters();
/*  58 */     String[][] suffixes = new String[fileFilters.size()][];
/*     */     
/*  60 */     int index = 0;
/*  61 */     for (MultiFileFilter fileFilter : fileFilters) {
/*  62 */       String[] singleSuffixes = fileFilter.getSuffixes();
/*  63 */       String[] plainSuffixes = new String[singleSuffixes.length];
/*  64 */       for (int i = 0; i < singleSuffixes.length; i++) {
/*  65 */         String suffix = singleSuffixes[i];
/*  66 */         if (suffix.startsWith(".")) {
/*  67 */           suffix = suffix.substring(1);
/*  68 */         } else if (suffix.startsWith("*.")) {
/*  69 */           suffix = suffix.substring(2);
/*     */         } 
/*  71 */         plainSuffixes[i] = suffix;
/*     */       } 
/*  73 */       suffixes[index++] = plainSuffixes;
/*     */     } 
/*  75 */     return suffixes;
/*     */   }
/*     */   
/*     */   private String[] getDescriptions() {
/*  79 */     Collection<MultiFileFilter> fileFilters = getFileFilters();
/*  80 */     String[] descriptions = new String[fileFilters.size()];
/*     */     
/*  82 */     int index = 0;
/*  83 */     for (MultiFileFilter fileFilter : fileFilters) {
/*  84 */       descriptions[index++] = fileFilter.getName();
/*     */     }
/*  86 */     return descriptions;
/*     */   }
/*     */   
/*     */   private int getSelectedFileFilterIndex() {
/*  90 */     if (getSelectedFileFilter() != null) {
/*  91 */       return getFileFilters().indexOf(getSelectedFileFilter());
/*     */     }
/*  93 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean[] getExactNames() {
/*  98 */     Collection<MultiFileFilter> fileFilters = getFileFilters();
/*  99 */     boolean[] exactNames = new boolean[fileFilters.size()];
/*     */     
/* 101 */     int index = 0;
/* 102 */     for (MultiFileFilter fileFilter : fileFilters) {
/* 103 */       exactNames[index++] = fileFilter.isExact();
/*     */     }
/* 105 */     return exactNames;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\MacosFileChooser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */