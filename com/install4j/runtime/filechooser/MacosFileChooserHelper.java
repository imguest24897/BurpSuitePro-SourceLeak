/*    */ package com.install4j.runtime.filechooser;
/*    */ 
/*    */ import com.install4j.runtime.installer.platform.macos.MacosUiHelper;
/*    */ import java.io.File;
/*    */ import java.util.Collection;
/*    */ 
/*    */ public class MacosFileChooserHelper
/*    */ {
/*    */   static String getCurrentDirectoryWithSelection(AbstractFileSystemChooser fileSystemChooser) {
/* 10 */     File selectedFile = fileSystemChooser.getDefaultSelectedFile();
/* 11 */     if (selectedFile != null) {
/* 12 */       return selectedFile.getParent();
/*    */     }
/* 14 */     File currentDirectory = fileSystemChooser.getCurrentDirectory();
/* 15 */     if (currentDirectory != null) {
/* 16 */       return currentDirectory.getAbsolutePath();
/*    */     }
/* 18 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   static String getDefaultSelectedFileName(AbstractFileSystemChooser fileSystemChooser) {
/* 24 */     File selectedFile = fileSystemChooser.getDefaultSelectedFile();
/* 25 */     if (selectedFile == null) {
/* 26 */       return null;
/*    */     }
/* 28 */     return selectedFile.getName();
/*    */   }
/*    */ 
/*    */   
/*    */   static String[] getQuestions(AbstractFileSystemChooser<?> fileSystemChooser) {
/* 33 */     Collection<FileChooserQuestion> fileChooserQuestions = fileSystemChooser.getFileChooserQuestions();
/* 34 */     String[] questions = new String[fileChooserQuestions.size()];
/* 35 */     int index = 0;
/* 36 */     for (FileChooserQuestion fileChooserQuestion : fileChooserQuestions) {
/* 37 */       questions[index++] = fileChooserQuestion.getDescription();
/*    */     }
/* 39 */     return questions;
/*    */   }
/*    */   
/*    */   static boolean[] getQuestionPresets(AbstractFileSystemChooser<?> fileSystemChooser) {
/* 43 */     Collection<FileChooserQuestion> fileChooserQuestions = fileSystemChooser.getFileChooserQuestions();
/* 44 */     boolean[] questionPresets = new boolean[fileChooserQuestions.size()];
/* 45 */     int index = 0;
/* 46 */     for (FileChooserQuestion fileChooserQuestion : fileChooserQuestions) {
/* 47 */       questionPresets[index++] = fileChooserQuestion.isSelected();
/*    */     }
/* 49 */     return questionPresets;
/*    */   }
/*    */   
/*    */   static void saveQuestions(MacosUiHelper.Result result, AbstractFileSystemChooser<?> files) {
/* 53 */     Collection<FileChooserQuestion> fileChooserQuestions = files.getFileChooserQuestions();
/* 54 */     boolean[] answers = result.getAnswers();
/* 55 */     int index = 0;
/* 56 */     for (FileChooserQuestion fileChooserQuestion : fileChooserQuestions)
/* 57 */       fileChooserQuestion.setSelected(answers[index++]); 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\MacosFileChooserHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */