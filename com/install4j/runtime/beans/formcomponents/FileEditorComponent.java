/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import javax.swing.JTextArea;
/*    */ import javax.swing.text.JTextComponent;
/*    */ 
/*    */ public class FileEditorComponent
/*    */   extends AbstractTextAreaComponent
/*    */ {
/*    */   private File file;
/* 15 */   private String encoding = "";
/*    */   
/*    */   public File getFile() {
/* 18 */     return (File)replaceWithTextOverride("file", replaceVariables(this.file), File.class);
/*    */   }
/*    */   
/*    */   public void setFile(File file) {
/* 22 */     this.file = file;
/*    */   }
/*    */   
/*    */   public String getEncoding() {
/* 26 */     return replaceVariables(replaceVariables(this.encoding));
/*    */   }
/*    */   
/*    */   public void setEncoding(String encoding) {
/* 30 */     this.encoding = encoding;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void initText(JTextComponent textComponent) {
/* 35 */     File usedFile = getUsedFile();
/* 36 */     if (usedFile.exists()) {
/*    */       try {
/* 38 */         Logger.getInstance().info(this, "Reading file " + getUsedFile());
/* 39 */         String text = InstallerUtil.readTextFile(usedFile, getEncoding());
/* 40 */         textComponent.setText(text);
/* 41 */         textComponent.setCaretPosition(0);
/* 42 */       } catch (IOException e) {
/* 43 */         e.printStackTrace();
/* 44 */         Util.showErrorMessage(getContext().getMessage(".FileReadError", new Object[] { usedFile.getPath(), e.getMessage() }));
/*    */       } 
/*    */     } else {
/* 47 */       super.initText(textComponent);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean checkCompleted() {
/* 53 */     if (!super.checkCompleted()) {
/* 54 */       return false;
/*    */     }
/* 56 */     File usedFile = getUsedFile();
/*    */     try {
/* 58 */       Logger.getInstance().info(this, "Writing file " + getUsedFile());
/* 59 */       InstallerUtil.writeTextFile(getTextValue(), usedFile, getEncoding(), false);
/* 60 */       return true;
/* 61 */     } catch (IOException e) {
/* 62 */       Logger.getInstance().log(e);
/* 63 */       Util.showErrorMessage(getContext().getMessage(".FileWriteError", new Object[] { usedFile.getPath(), e.getMessage() }));
/* 64 */       return false;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected JTextComponent createTextComponent() {
/* 70 */     JTextArea textArea = (JTextArea)super.createTextComponent();
/* 71 */     textArea.setLineWrap(false);
/* 72 */     return textArea;
/*    */   }
/*    */   
/*    */   private File getUsedFile() {
/* 76 */     return getContext().getDestinationFile(getFile());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\FileEditorComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */