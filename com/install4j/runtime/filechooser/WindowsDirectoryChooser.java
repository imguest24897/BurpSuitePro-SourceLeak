/*    */ package com.install4j.runtime.filechooser;
/*    */ 
/*    */ import com.install4j.runtime.installer.platform.win32.VistaFileChooser;
/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class WindowsDirectoryChooser
/*    */   extends DirectoryChooser
/*    */ {
/*    */   private File selectedFile;
/*    */   
/*    */   public boolean selectInternal() {
/* 18 */     VistaFileChooser vistaFileChooser = (new VistaFileChooser(false)).includedOptions(0x60 | (isFileHidingEnabled() ? 0 : 268435456)).title(getTitle()).button((getApproveButtonText() != null) ? getApproveButtonText() : "Choose").directory(getCurrentDirectory()).fileName((getDefaultSelectedFile() != null) ? getDefaultSelectedFile().getName() : null);
/*    */     
/* 20 */     VistaFileChooser.Question[] questions = WindowsFileChooserHelper.configureQuestions(vistaFileChooser, this);
/*    */     
/* 22 */     File[] result = WindowsFileChooser.showFileChooser(vistaFileChooser, getParent());
/*    */     
/* 24 */     WindowsFileChooserHelper.saveQuestions(questions, this);
/* 25 */     if (result != null && result.length > 0) {
/* 26 */       this.selectedFile = result[0];
/* 27 */       return true;
/*    */     } 
/* 29 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected File getSelectedDirectoryInternal() {
/* 34 */     return this.selectedFile;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\WindowsDirectoryChooser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */