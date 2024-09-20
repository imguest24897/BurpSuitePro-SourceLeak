/*    */ package com.install4j.runtime.filechooser;
/*    */ 
/*    */ import com.install4j.runtime.installer.platform.win32.VistaFileChooser;
/*    */ import com.install4j.runtime.util.SecondaryLoopHelper;
/*    */ import java.awt.Window;
/*    */ import java.io.File;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class WindowsFileChooser
/*    */   extends FileChooser
/*    */ {
/*    */   private Collection<File> selectedFiles;
/*    */   
/*    */   public boolean selectInternal() {
/* 24 */     VistaFileChooser vistaFileChooser = (new VistaFileChooser((getFileAccessMode() == FileAccessMode.SAVE))).includedOptions(0x42 | (isMultiple() ? 512 : 0) | (isFileHidingEnabled() ? 0 : 268435456)).title(getTitle()).button(getApproveButtonText()).directory(getCurrentDirectory()).fileName((getDefaultSelectedFile() != null) ? getDefaultSelectedFile().getName() : null);
/*    */     
/* 26 */     VistaFileChooser.Question[] questions = WindowsFileChooserHelper.configureQuestions(vistaFileChooser, this);
/* 27 */     fillFilter(vistaFileChooser);
/*    */     
/* 29 */     File[] result = showFileChooser(vistaFileChooser, getParent());
/*    */     
/* 31 */     WindowsFileChooserHelper.saveQuestions(questions, this);
/*    */     
/* 33 */     if (result != null && result.length > 0) {
/* 34 */       this.selectedFiles = Arrays.asList(result);
/* 35 */       return true;
/*    */     } 
/* 37 */     this.selectedFiles = Collections.emptyList();
/* 38 */     return false;
/*    */   }
/*    */   
/*    */   private void fillFilter(VistaFileChooser vistaFileChooser) {
/* 42 */     if (!getFileFilters().isEmpty()) {
/* 43 */       VistaFileChooser.Filter[] filter = new VistaFileChooser.Filter[getFileFilters().size()];
/* 44 */       int arrayPos = 0;
/* 45 */       int selectedPos = 0;
/* 46 */       for (MultiFileFilter fileFilter : getFileFilters()) {
/* 47 */         if (fileFilter.equals(getSelectedFileFilter())) {
/* 48 */           selectedPos = arrayPos;
/*    */         }
/*    */         
/* 51 */         StringBuilder spec = new StringBuilder();
/* 52 */         for (String suffix : fileFilter.getSuffixes()) {
/* 53 */           if (spec.length() > 0) {
/* 54 */             spec.append(';');
/*    */           }
/* 56 */           if (!fileFilter.isExact()) {
/* 57 */             spec.append("*");
/*    */           }
/* 59 */           spec.append(suffix);
/*    */         } 
/* 61 */         filter[arrayPos++] = new VistaFileChooser.Filter(fileFilter.getDescription(), spec.toString());
/*    */       } 
/* 63 */       vistaFileChooser.filter(filter).selectedFilter(selectedPos);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected Collection<File> getSelectedFilesInternal() {
/* 69 */     return this.selectedFiles;
/*    */   }
/*    */   
/*    */   static File[] showFileChooser(VistaFileChooser vistaFileChooser, Window parent) {
/* 73 */     return (File[])SecondaryLoopHelper.executeWithSecondaryLoop(() -> vistaFileChooser.show(parent));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\WindowsFileChooser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */