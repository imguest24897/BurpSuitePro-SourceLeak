/*    */ package com.install4j.runtime.filechooser;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.runtime.filechooser.swingdirectory.JDirectoryChooser;
/*    */ import com.install4j.runtime.installer.frontend.Messages;
/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ 
/*    */ class SwingDirectoryChooser
/*    */   extends DirectoryChooser
/*    */ {
/*    */   private FileChooserWithLowerAccessory fileChooser;
/*    */   
/*    */   public boolean selectInternal() {
/* 16 */     boolean includeFiles = (this.allowFilesOnMac && Util.isMacOS());
/* 17 */     this.fileChooser = (includeFiles || Boolean.getBoolean("install4j.noSwingDirChooser")) ? new CustomFileChooser() : (FileChooserWithLowerAccessory)new JDirectoryChooser();
/* 18 */     if (includeFiles) {
/* 19 */       this.fileChooser.setFileSelectionMode(2);
/*    */     } else {
/* 21 */       this.fileChooser.setFileSelectionMode(1);
/*    */     } 
/*    */     
/* 24 */     SwingFileChooserHelper helper = new SwingFileChooserHelper(this, this.fileChooser);
/*    */     
/* 26 */     String approveButtonText = getApproveButtonText();
/* 27 */     int result = this.fileChooser.showDialog(getParent(), (approveButtonText != null) ? approveButtonText : Messages.getString(".ButtonChoose"));
/*    */     
/* 29 */     helper.saveQuestions();
/*    */     
/* 31 */     return (result == 0);
/*    */   }
/*    */ 
/*    */   
/*    */   protected File getSelectedDirectoryInternal() {
/* 36 */     return this.fileChooser.getSelectedFile();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\SwingDirectoryChooser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */