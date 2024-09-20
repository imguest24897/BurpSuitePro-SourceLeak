/*    */ package com.install4j.runtime.filechooser;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.util.Collection;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import javax.swing.JCheckBox;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ class SwingFileChooserHelper {
/* 11 */   private Map<FileChooserQuestion, JCheckBox> checkboxes = new HashMap<>();
/*    */   
/*    */   public SwingFileChooserHelper(AbstractFileSystemChooser<?> fileSystemChooser, FileChooserWithLowerAccessory swingFileChooser) {
/* 14 */     swingFileChooser.setCurrentDirectory(fileSystemChooser.getCurrentDirectory());
/* 15 */     swingFileChooser.setDialogTitle(fileSystemChooser.getTitle());
/* 16 */     File defaultSelectedFile = fileSystemChooser.getDefaultSelectedFile();
/* 17 */     if (defaultSelectedFile != null) {
/* 18 */       swingFileChooser.setSelectedFile(defaultSelectedFile);
/*    */     }
/* 20 */     swingFileChooser.setFileHidingEnabled(fileSystemChooser.isFileHidingEnabled());
/*    */     
/* 22 */     Collection<FileChooserQuestion> fileChooserQuestions = fileSystemChooser.getFileChooserQuestions();
/* 23 */     if (fileChooserQuestions.size() > 0) {
/* 24 */       JPanel accessory = CustomFileChooser.createLowerAccessoryPanel();
/* 25 */       for (FileChooserQuestion fileChooserQuestion : fileChooserQuestions) {
/* 26 */         JCheckBox checkbox = new JCheckBox(fileChooserQuestion.getDescription(), fileChooserQuestion.isSelected());
/* 27 */         accessory.add(checkbox);
/* 28 */         this.checkboxes.put(fileChooserQuestion, checkbox);
/*    */       } 
/* 30 */       swingFileChooser.setLowerAccessory(accessory);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void saveQuestions() {
/* 35 */     for (Map.Entry<FileChooserQuestion, JCheckBox> entry : this.checkboxes.entrySet())
/* 36 */       ((FileChooserQuestion)entry.getKey()).setSelected(((JCheckBox)entry.getValue()).isSelected()); 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\SwingFileChooserHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */