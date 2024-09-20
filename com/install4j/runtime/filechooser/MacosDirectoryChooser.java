/*    */ package com.install4j.runtime.filechooser;
/*    */ 
/*    */ import com.install4j.runtime.installer.platform.macos.MacosUiHelper;
/*    */ import java.io.File;
/*    */ 
/*    */ class MacosDirectoryChooser
/*    */   extends DirectoryChooser
/*    */ {
/*  9 */   private static final String[][] EMPTY_SUFFIXES = new String[0][0];
/* 10 */   private static final String[] EMPTY_STRINGS = new String[0];
/* 11 */   private static final boolean[] EMPTY_BOOLEANS = new boolean[0];
/*    */   
/*    */   private MacosUiHelper.Result result;
/*    */ 
/*    */   
/*    */   protected File getSelectedDirectoryInternal() {
/* 17 */     String[] selectedPaths = this.result.getSelectedPaths();
/* 18 */     if (selectedPaths != null && selectedPaths.length > 0) {
/* 19 */       return new File(selectedPaths[0]);
/*    */     }
/* 21 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean selectInternal() {
/* 27 */     this.result = MacosUiHelper.showFileChooser(
/* 28 */         this.allowFilesOnMac ? 5 : 4, 
/* 29 */         getTitle(), 
/* 30 */         MacosFileChooserHelper.getCurrentDirectoryWithSelection(this), 
/* 31 */         getApproveButtonText(), 
/* 32 */         MacosFileChooserHelper.getDefaultSelectedFileName(this), 
/* 33 */         !isFileHidingEnabled(), EMPTY_SUFFIXES, EMPTY_STRINGS, 0, EMPTY_BOOLEANS, 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 38 */         MacosFileChooserHelper.getQuestions(this), 
/* 39 */         MacosFileChooserHelper.getQuestionPresets(this));
/*    */     
/* 41 */     MacosFileChooserHelper.saveQuestions(this.result, this);
/* 42 */     return ((this.result.getSelectedPaths()).length > 0);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\MacosDirectoryChooser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */