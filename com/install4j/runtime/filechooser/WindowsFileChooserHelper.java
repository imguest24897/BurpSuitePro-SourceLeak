/*    */ package com.install4j.runtime.filechooser;
/*    */ 
/*    */ import com.install4j.runtime.installer.platform.win32.VistaFileChooser;
/*    */ import java.util.Collection;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WindowsFileChooserHelper
/*    */ {
/*    */   static void saveQuestions(VistaFileChooser.Question[] questions, AbstractFileSystemChooser<?> fileSystemChooser) {
/* 14 */     Collection<FileChooserQuestion> fileChooserQuestions = fileSystemChooser.getFileChooserQuestions();
/* 15 */     if (questions != null) {
/* 16 */       int arrayPos = 0;
/* 17 */       for (FileChooserQuestion fileChooserQuestion : fileChooserQuestions) {
/* 18 */         fileChooserQuestion.setSelected(questions[arrayPos++].isSelected());
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   static VistaFileChooser.Question[] configureQuestions(VistaFileChooser vistaFileChooser, AbstractFileSystemChooser<?> fileSystemChooser) {
/* 25 */     Collection<FileChooserQuestion> fileChooserQuestions = fileSystemChooser.getFileChooserQuestions();
/* 26 */     VistaFileChooser.Question[] questions = null;
/* 27 */     if (!fileChooserQuestions.isEmpty()) {
/* 28 */       questions = new VistaFileChooser.Question[fileChooserQuestions.size()];
/*    */       
/* 30 */       int arrayPos = 0;
/* 31 */       for (FileChooserQuestion fileChooserQuestion : fileChooserQuestions) {
/* 32 */         questions[arrayPos++] = new VistaFileChooser.Question(fileChooserQuestion.getDescription(), fileChooserQuestion.isSelected());
/*    */       }
/* 34 */       vistaFileChooser.questions(questions);
/*    */     } 
/* 36 */     return questions;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\WindowsFileChooserHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */