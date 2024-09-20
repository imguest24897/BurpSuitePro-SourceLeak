/*    */ package com.install4j.runtime.filechooser;
/*    */ 
/*    */ import com.ejt.internal.CommonApplicationServices;
/*    */ import java.io.File;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
/*    */ import javax.swing.filechooser.FileFilter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class SwingFileChooser
/*    */   extends FileChooser
/*    */ {
/*    */   private CustomFileChooser fileChooser;
/*    */   
/*    */   public boolean selectInternal() {
/*    */     int result;
/* 20 */     this.fileChooser = new CustomFileChooser();
/* 21 */     SwingFileChooserHelper helper = new SwingFileChooserHelper(this, this.fileChooser);
/*    */     
/* 23 */     this.fileChooser.resetChoosableFileFilters();
/*    */     
/* 25 */     for (MultiFileFilter fileFilter : getFileFilters()) {
/* 26 */       this.fileChooser.addChoosableFileFilter(fileFilter);
/*    */     }
/* 28 */     FileFilter selectedFileFilter = getSelectedFileFilter();
/* 29 */     if (selectedFileFilter == null) {
/* 30 */       if (getFileFilters().size() > 0) {
/* 31 */         selectedFileFilter = getFileFilters().iterator().next();
/*    */       } else {
/* 33 */         selectedFileFilter = this.fileChooser.getAcceptAllFileFilter();
/*    */       } 
/*    */     }
/* 36 */     this.fileChooser.setFileFilter(selectedFileFilter);
/*    */     
/* 38 */     this.fileChooser.setDialogType(getDialogType());
/* 39 */     this.fileChooser.setMultiSelectionEnabled(isMultiple());
/*    */ 
/*    */     
/* 42 */     CommonApplicationServices applicationServices = CommonApplicationServices.getInstance();
/*    */     do {
/* 44 */       result = this.fileChooser.showDialog(getParent(), getApproveButtonText());
/* 45 */     } while (result == 0 && 
/* 46 */       getFileAccessMode() == FileAccessMode.SAVE && this.fileChooser
/* 47 */       .getSelectedFile().exists() && applicationServices != null && 
/* 48 */       !applicationServices.confirmOverwrite(getParent(), this.fileChooser.getSelectedFile()));
/*    */     
/* 50 */     helper.saveQuestions();
/*    */     
/* 52 */     return (result == 0);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Collection<File> getSelectedFilesInternal() {
/* 57 */     if (isMultiple()) {
/* 58 */       return Arrays.asList(this.fileChooser.getSelectedFiles());
/*    */     }
/* 60 */     return Collections.singleton(this.fileChooser.getSelectedFile());
/*    */   }
/*    */ 
/*    */   
/*    */   private int getDialogType() {
/* 65 */     FileAccessMode fileAccessMode = getFileAccessMode();
/* 66 */     switch (fileAccessMode) {
/*    */       case OPEN:
/* 68 */         return 0;
/*    */       case SAVE:
/* 70 */         return 1;
/*    */     } 
/* 72 */     throw new RuntimeException(String.valueOf(fileAccessMode));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\SwingFileChooser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */