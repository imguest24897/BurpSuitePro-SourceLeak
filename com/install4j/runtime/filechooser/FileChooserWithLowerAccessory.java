/*    */ package com.install4j.runtime.filechooser;
/*    */ 
/*    */ import java.io.File;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JFileChooser;
/*    */ import javax.swing.filechooser.FileSystemView;
/*    */ 
/*    */ public abstract class FileChooserWithLowerAccessory extends JFileChooser {
/*    */   protected FileChooserWithLowerAccessory() {}
/*    */   
/*    */   protected FileChooserWithLowerAccessory(String currentDirectoryPath) {
/* 12 */     super(currentDirectoryPath);
/*    */   }
/*    */   
/*    */   protected FileChooserWithLowerAccessory(File currentDirectory) {
/* 16 */     super(currentDirectory);
/*    */   }
/*    */   
/*    */   public FileChooserWithLowerAccessory(File currentDirectory, FileSystemView fsv) {}
/*    */   
/*    */   public FileChooserWithLowerAccessory(FileSystemView fsv) {}
/*    */   
/*    */   public FileChooserWithLowerAccessory(String currentDirectoryPath, FileSystemView fsv) {}
/*    */   
/*    */   public abstract void setLowerAccessory(JComponent paramJComponent);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\FileChooserWithLowerAccessory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */